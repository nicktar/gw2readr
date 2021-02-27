package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import java.util.Set;

import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionSlotType;

public interface IBaseBackItem<T extends IBaseInfixUpgrade<? extends IBaseBuff, ? extends IBaseAttributeModifier>> extends IAttributeAdjuster {

    Set<InfusionSlotType> getInfusionSlots();

    void setInfusionSlots(Set<InfusionSlotType> infusionSlots);

    T getInfixUpgrade();

    void setInfixUpgrade(T infixUpgrade);

    Integer getSuffixItemId();

    void setSuffixItemId(Integer suffixItemId);

}
