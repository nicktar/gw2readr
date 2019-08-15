package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import de.getsetsociety.gw2readr.v0.item.items.enums.DamageType;
import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.v0.item.items.enums.WeaponType;

import java.util.Set;

public interface IBaseWeapon<T extends IBaseInfixUpgrade<? extends IBaseBuff, ? extends IBaseAttributeModifier>> {

    DamageType getDamageType();

    void setDamageType(DamageType damageType);

    Integer getDefense();

    void setDefense(Integer defense);

    T getInfixUpgrade();

    void setInfixUpgrade(T infixUpgrade);

    Set<InfusionSlotType> getInfusionSlots();

    void setInfusionSlots(Set<InfusionSlotType> infusionSlots);

    Integer getMaxPower();

    void setMaxPower(Integer maxPower);

    Integer getMinPower();

    void setMinPower(Integer minPower);

    Integer getSuffixItemId();

    void setSuffixItemId(Integer suffixItemId);

    Integer getSecondarySuffixItemId();

    void setSecondarySuffixItemId(Integer suffixItemId);

    WeaponType getWeaponType();

    void setWeaponType(WeaponType type);

    Integer getDefaultSkin();

    void setDefaultSkin(Integer defaultSkin);


}