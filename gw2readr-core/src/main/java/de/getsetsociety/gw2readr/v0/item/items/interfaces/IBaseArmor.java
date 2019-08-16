package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import de.getsetsociety.gw2readr.v0.item.items.enums.ArmorType;
import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.v0.item.items.enums.WeightClass;

import java.util.Set;

public interface IBaseArmor<S extends IBaseInfixUpgrade<? extends IBaseBuff, ? extends IBaseAttributeModifier>> extends IBaseItem {

    ArmorType getArmorType();

    void setArmorType(ArmorType armorType);

    Integer getDefense();

    void setDefense(Integer defense);

    Integer getSuffixItemId();

    void setSuffixItemId(Integer suffixItemId);

    Set<InfusionSlotType> getInfusionSlots();

    void setInfusionSlots(Set<InfusionSlotType> infusionSlots);

    S getInfixUpgrade();

    void setInfixUpgrade(S infixUpgrade);

    WeightClass getWeightClass();

    void setWeightClass(WeightClass wightClass);

    Integer getSecondarySuffixItemId();

    void setSecondarySuffixItemId(Integer secondarySuffixItemId);

}