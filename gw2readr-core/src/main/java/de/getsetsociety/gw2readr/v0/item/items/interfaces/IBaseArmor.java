package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import java.util.Set;

import de.getsetsociety.gw2readr.v0.item.items.enums.ArmorType;
import de.getsetsociety.gw2readr.v0.item.items.enums.WeightClass;

public interface IBaseArmor<S extends IBaseInfixUpgrade<? extends IBaseBuff, ? extends IBaseAttributeModifier>> extends IBaseItem {

    ArmorType getArmorType();

    void setArmorType(ArmorType armorType);

    Integer getDefense();

    void setDefense(Integer defense);

    Integer getSuffixItemId();

    void setSuffixItemId(Integer suffixItemId);

    Set<IInfusionSlot> getInfusionSlots();

    void addAllInfusionSlots(Set<IInfusionSlot> infusionSlots);

    S getInfixUpgrade();

    void setInfixUpgrade(S infixUpgrade);

    WeightClass getWeightClass();

    void setWeightClass(WeightClass wightClass);

    Integer getSecondarySuffixItemId();

    void setSecondarySuffixItemId(Integer secondarySuffixItemId);

}
