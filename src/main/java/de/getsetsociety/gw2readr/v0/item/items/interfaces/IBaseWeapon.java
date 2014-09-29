package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import java.util.Set;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.markers.IAttribute;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.markers.IDamageType;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.markers.IInfusionSlotType;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.markers.IWeaponType;

public interface IBaseWeapon<T extends IDamageType, U extends IBaseInfixUpgrade<? extends IAttribute, ? extends IBaseBuff, ? extends IBaseAttributeModifier<?>>, V extends IInfusionSlotType, W extends IWeaponType> {

    public abstract T getDamageType();

    public abstract void setDamageType(T damageType);

    public abstract Integer getDefense();

    public abstract void setDefense(Integer defense);

    public abstract U getInfixUpgrade();

    public abstract void setInfixUpgrade(U infixUpgrade);

    public abstract Set<V> getInfusionSlots();

    public abstract void setInfusionSlots(Set<V> infusionSlots);

    public abstract Integer getMaxPower();

    public abstract void setMaxPower(Integer maxPower);

    public abstract Integer getMinPower();

    public abstract void setMinPower(Integer min_power);

    public abstract Integer getSuffixItemId();

    public abstract void setSuffixItemId(Integer suffix_item_id);

    public abstract W getWeaponType();

    public abstract void setWeaponType(W type);

}