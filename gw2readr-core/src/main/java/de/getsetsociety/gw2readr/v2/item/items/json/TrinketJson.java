package de.getsetsociety.gw2readr.v2.item.items.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v0.item.items.enums.TrinketType;
import de.getsetsociety.gw2readr.v2.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.ITrinket;
import lombok.Data;

public class TrinketJson extends ItemJson<ITrinket> {

    private final ITrinket item = EntityFactoryProvider.getItemEntityFactory().newTrinklet();

    @Override
    public ITrinket getEntity() {
        return item;
    }

    @JsonProperty("details")
    public void setTrinketDetails(TrinketDetails details) {
        item.setTrinketType(details.getType());
        for (InfusionSlotJson detail : details.getInfusionSlots()) {
            item.getInfusionSlots().addAll(detail.getFlags());
        }
        item.setSuffixItemId(details.getSuffixItemId());
        item.setSecondarySuffixItemId(details.getSecondarySuffixItemId());
        item.setInfixUpgrade(details.getInfixUpgrade().getEntity());
        item.setAttributeAdjustment(details.getAttributeAdjustment());

        getAdditionalProperties().putAll(details.getAdditionalProperties());
    }

    @Data
    private static class TrinketDetails {

        @JsonProperty("type")
        private TrinketType type;
        @JsonProperty("infusion_slots")
        private List<InfusionSlotJson> infusionSlots = new ArrayList<>();
        @JsonProperty("suffix_item_id")
        private Integer suffixItemId;
        @JsonProperty("secondary_suffix_item_id")
        private Integer secondarySuffixItemId;
        @JsonProperty("infix_upgrade")
        private InfixUpgradeJson infixUpgrade = new InfixUpgradeJson();
        @JsonProperty("attribute_adjustment")
        private Double attributeAdjustment;

        private Map<String, Object> additionalProperties = new HashMap<>();

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            additionalProperties.put(name, value);
        }

    }

}
