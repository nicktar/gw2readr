package de.getsetsociety.gw2readr.v2.item.items.json;

import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v0.item.items.enums.DamageType;
import de.getsetsociety.gw2readr.v0.item.items.enums.WeaponType;
import de.getsetsociety.gw2readr.v2.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IWeapon;
import lombok.Data;
import lombok.EqualsAndHashCode;

public class WeaponJson extends ItemJson<IWeapon> {

    private final IWeapon item = EntityFactoryProvider.getItemEntityFactory().newWeapon();


    @JsonProperty("details")
    public void setWeaponDetails(WeaponDetailsJson details) {
        item.setDamageType(details.getDamageType());
        item.setWeaponType(details.getType());
        item.setMinPower(details.getMinPower());
        item.setMaxPower(details.getMaxPower());
        item.setDefense(details.getDefense());
        setBasicDetails(details, item);
    }

    @Override
    public IWeapon getEntity() {
        return item;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class WeaponDetailsJson extends BasicJsonDetails {

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

    }
}

