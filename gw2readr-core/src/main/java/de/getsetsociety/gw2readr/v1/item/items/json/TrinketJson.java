package de.getsetsociety.gw2readr.v1.item.items.json;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import de.getsetsociety.gw2readr.v0.item.items.enums.TrinketType;
import de.getsetsociety.gw2readr.v1.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.ITrinket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrinketJson extends ItemJson<ITrinket> {

    private ITrinket item = EntityFactoryProvider.getItemEntityFactory().newTrinklet();

    @Override
    public ITrinket getEntity() {
        return item;
    }

    @JsonProperty("trinket")
    public void setTrinketDetails(TrinketDetails details) {
        item.setTrinketType(details.getType());
        for (InfusionSlotJson detail : details.getInfusionSlots()) {
            item.getInfusionSlots().addAll(detail.getFlags());
        }
        item.setSuffixItemId(details.getSuffixItemId());
        item.setInfixUpgrade(details.getInfixUpgrade().getEntity());

        getAdditionalProperties().putAll(details.getAdditionalProperties());
    }

    public static class TrinketDetails {

        private TrinketType type;
        private List<InfusionSlotJson> infusionSlots = new ArrayList<>();
        private Integer suffixItemId;
        private Integer secondarySuffixItemId;
        private InfixUpgradeJson infixUpgrade = new InfixUpgradeJson();
        private Map<String, Object> additionalProperties = new HashMap<>();

        @JsonProperty("type")
        public TrinketType getType() {
            return type;
        }

        public void setType(String type) {
            this.type = TrinketType.valueOf(type);
        }

        @JsonProperty("infusion_slots")
        public List<InfusionSlotJson> getInfusionSlots() {
            return infusionSlots;
        }

        public void setInfusionSlots(List<InfusionSlotJson> infusionSlots) {
            this.infusionSlots = infusionSlots;
        }

        @JsonProperty("suffix_item_id")
        public Integer getSuffixItemId() {
            return suffixItemId;
        }

        public void setSuffixItemId(Integer suffixItemId) {
            this.suffixItemId = suffixItemId;
        }

        @JsonProperty("infix_upgrade")
        public InfixUpgradeJson getInfixUpgrade() {
            return infixUpgrade;
        }

        public void setInfixUpgrade(InfixUpgradeJson infixUpgrade) {
            this.infixUpgrade = infixUpgrade;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            additionalProperties.put(name, value);
        }

        @JsonProperty("secondary_suffix_item_id")
        public Integer getSecondarySuffixItemId() {
            return secondarySuffixItemId;
        }

        public void setSecondarySuffixItemId(Integer secondarySuffixItemId) {
            this.secondarySuffixItemId = secondarySuffixItemId;
        }
    }

}
