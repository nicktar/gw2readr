package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import java.util.Set;

import de.getsetsociety.gw2readr.v0.item.items.enums.DamageType;
import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.v0.item.items.enums.WeaponType;

public interface IBaseWeapon<T extends IBaseInfixUpgrade<? extends IBaseBuff, ? extends IBaseAttributeModifier>> {

	public abstract DamageType getDamageType();

	public abstract void setDamageType(DamageType damageType);

	public abstract Integer getDefense();

	public abstract void setDefense(Integer defense);

	public abstract T getInfixUpgrade();

	public abstract void setInfixUpgrade(T infixUpgrade);

	public abstract Set<InfusionSlotType> getInfusionSlots();

	public abstract void setInfusionSlots(Set<InfusionSlotType> infusionSlots);

	public abstract Integer getMaxPower();

	public abstract void setMaxPower(Integer maxPower);

	public abstract Integer getMinPower();

	public abstract void setMinPower(Integer min_power);

	public abstract Integer getSuffixItemId();

	public abstract void setSuffixItemId(Integer suffixItemId);

	public abstract Integer getSecondarySuffixItemId();

	public abstract void setSecondarySuffixItemId(Integer suffixItemId);

	public abstract WeaponType getWeaponType();

	public abstract void setWeaponType(WeaponType type);

}