package de.getsetsociety.gw2readr.v2.item.items.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v0.item.items.enums.DamageType;
import de.getsetsociety.gw2readr.v0.item.items.enums.WeaponType;
import de.getsetsociety.gw2readr.v2.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IWeapon;
import lombok.Data;

public class WeaponJson extends ItemJson<IWeapon> {

    private final IWeapon item = EntityFactoryProvider.getItemEntityFactory().newWeapon();


    @JsonProperty("details")
    public void setWeaponDetails(WeaponDetailsJson details) {
        item.setDamageType(details.getDamageType());
        item.setWeaponType(details.getType());
        item.setMinPower(details.getMinPower());
        item.setMaxPower(details.getMaxPower());
        item.setDefense(details.getDefense());
        for (InfusionSlotJson detail : details.getInfusionSlots()) {
            item.getInfusionSlots().addAll(detail.getFlags());
        }
        item.setSuffixItemId(details.getSuffixItemId());
        item.setAttributeAdjustment(details.getAttributeAdjustment());
        details.getInfixUpgrade()
               .map(InfixUpgradeJson::getEntity)
               .ifPresent(item::setInfixUpgrade);
        getAdditionalProperties().putAll(details.getAdditionalProperties());
    }

    @Override
    public IWeapon getEntity() {
        return item;
    }

    @Data
    public static class WeaponDetailsJson {

        @JsonProperty("type")
        private WeaponType type;
        @JsonProperty("damage_type")
        private DamageType damageType;
        @JsonProperty("min_power")
        private Integer minPower;
        @JsonProperty("max_power")
        private Integer maxPower;
        @JsonProperty("defense")
        private Integer defense;
        @JsonProperty("infusion_slots")
        private List<InfusionSlotJson> infusionSlots = new ArrayList<>();
        @JsonProperty("suffix_item_id")
        private Integer suffixItemId;
        @JsonProperty("secondary_suffix_item_id")
        private Integer secondarySuffixItemId;
        @JsonProperty("infix_upgrade")
        private InfixUpgradeJson infixUpgrade;
        @JsonProperty("attribute_adjustment")
        private Double attributeAdjustment;
        private Map<String, Object> additionalProperties = new HashMap<>();

        public Optional<InfixUpgradeJson> getInfixUpgrade() {
            return Optional.ofNullable(infixUpgrade);
        }

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

