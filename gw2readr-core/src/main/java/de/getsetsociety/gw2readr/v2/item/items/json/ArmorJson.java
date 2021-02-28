package de.getsetsociety.gw2readr.v2.item.items.json;

import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v0.item.items.enums.ArmorType;
import de.getsetsociety.gw2readr.v0.item.items.enums.WeightClass;
import de.getsetsociety.gw2readr.v2.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IArmor;
import lombok.Data;
import lombok.EqualsAndHashCode;

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
        setBasicDetails(details, item);
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    private static class ArmorDetailsJson extends BasicJsonDetails {

        @JsonProperty("type")
        private ArmorType armorType;
        @JsonProperty("weight_class")
        private WeightClass weightClass;
        @JsonProperty("defense")
        private Integer defense;

    }

}
