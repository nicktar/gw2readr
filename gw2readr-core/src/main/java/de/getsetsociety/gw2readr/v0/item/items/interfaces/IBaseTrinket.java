package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import de.getsetsociety.gw2readr.v0.item.items.enums.TrinketType;

public interface IBaseTrinket<T extends IBaseInfixUpgrade<? extends IBaseBuff, ? extends IBaseAttributeModifier>> extends IInfusionSlotProvider {

    TrinketType getTrinketType();

    void setTrinketType(TrinketType trinketType);

    T getInfixUpgrade();

    void setInfixUpgrade(T infixUpgrade);

    Integer getSuffixItemId();

    void setSuffixItemId(Integer suffixItemId);

    Integer getSecondarySuffixItemId();

    void setSecondarySuffixItemId(Integer secondarySuffixItemId);
}
