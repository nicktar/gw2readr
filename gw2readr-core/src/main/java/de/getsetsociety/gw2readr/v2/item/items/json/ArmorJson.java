package de.getsetsociety.gw2readr.v2.item.items.json;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v0.item.items.enums.ArmorType;
import de.getsetsociety.gw2readr.v0.item.items.enums.WeightClass;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.IInfusionSlot;
import de.getsetsociety.gw2readr.v2.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IArmor;
import lombok.Data;

public class ArmorJson extends ItemJson<IArmor> {

    private final IArmor item = EntityFactoryProvider.getItemEntityFactory().newArmor();

    @Override
    public IArmor getEntity() {
        return item;
    }

    @JsonProperty("details")
    public void setArmorDetails(ArmorDetailsJson details) {
        item.setArmorType(details.getArmorType());
        item.setWeightClass(details.getWeightClass());
        item.setDefense(details.getDefense());
        Set<IInfusionSlot> slots = details.getInfusionSlots().stream()
                                          .map(InfusionSlotJson::getEntity)
                                          .collect(Collectors.toSet());
        item.addAllInfusionSlots(slots);
        item.setSuffixItemId(details.getSuffixItemId());
        item.setInfixUpgrade(details.getInfixUpgrade().getEntity());
        item.setAttributeAdjustment(details.getAttributeAdjustment());
        item.addAllStatChoices(details.getStatChoices());
        getAdditionalProperties().putAll(details.getAdditionalProperties());
    }

    @Data
    private static class ArmorDetailsJson {

        @JsonProperty("type")
        private ArmorType armorType;
        @JsonProperty("weight_class")
        private WeightClass weightClass;
        @JsonProperty("defense")
        private Integer defense;
        @JsonProperty("infusion_slots")
        private List<InfusionSlotJson> infusionSlots;
        @JsonProperty("suffix_item_id")
        private Integer suffixItemId;
        @JsonProperty("secondary_suffix_item_id")
        private Integer secondarySuffixItemId;
        @JsonProperty("infix_upgrade")
        private InfixUpgradeJson infixUpgrade = new InfixUpgradeJson();
        @JsonProperty("attribute_adjustment")
        private Double attributeAdjustment;
        @JsonProperty("stat_choices")
        private Set<Integer> statChoices;

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
