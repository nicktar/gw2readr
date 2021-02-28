package de.getsetsociety.gw2readr.v0.item.items.interfaces;

public interface IBaseBackItem<T extends IBaseInfixUpgrade<? extends IBaseBuff, ? extends IBaseAttributeModifier>> extends IAttributeAdjuster, IInfusionSlotProvider {

    T getInfixUpgrade();

    void setInfixUpgrade(T infixUpgrade);

    Integer getSuffixItemId();

    void setSuffixItemId(Integer suffixItemId);

}
