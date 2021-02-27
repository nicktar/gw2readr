package de.getsetsociety.gw2readr.v2.item.items.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v2.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IBackItem;
import lombok.Data;

public class BackItemJson extends ItemJson<IBackItem> {

    private final IBackItem item = EntityFactoryProvider.getItemEntityFactory().newBackItem();

    @JsonProperty("details")
    public void setBackItemDetails(BackItemDetails details) {
        for (InfusionSlotJson detail : details.getInfusionSlots()) {
            item.getInfusionSlots().addAll(detail.getFlags());
        }
        item.setSuffixItemId(details.getSuffixItemId());
        item.setSecondarySuffixItemId(details.getSecondarySuffixItemId());
        item.setInfixUpgrade(details.getInfixUpgrade().getEntity());
        item.setAttributeAdjustment(details.getAttributeAdjustment());
        getAdditionalProperties().putAll(details.getAdditionalProperties());
    }

    @Override
    public IBackItem getEntity() {
        return item;
    }

    @Data
    private class BackItemDetails {

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
