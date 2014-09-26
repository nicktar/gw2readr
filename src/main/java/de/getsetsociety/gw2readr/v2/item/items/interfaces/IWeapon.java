package de.getsetsociety.gw2readr.v2.item.items.interfaces;

import java.util.Set;

import de.getsetsociety.gw2readr.v2.item.items.enums.DamageType;
import de.getsetsociety.gw2readr.v2.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.v2.item.items.enums.WeaponType;

public interface IWeapon extends IBaseItem {

	public abstract DamageType getDamageType();

	public abstract void setDamageType(DamageType damageType);

	public abstract Integer getDefense();

	public abstract void setDefense(Integer defense);

	public abstract IInfixUpgrade getInfixUpgrade();

	public abstract void setInfixUpgrade(IInfixUpgrade infixUpgrade);

	public abstract Set<InfusionSlotType> getInfusionSlots();

	public abstract void setInfusionSlots(Set<InfusionSlotType> infusionSlots);

	public abstract Integer getMaxPower();

	public abstract void setMaxPower(Integer maxPower);

	public abstract Integer getMinPower();

	public abstract void setMinPower(Integer min_power);

	public abstract Integer getSuffixItemId();

	public abstract void setSuffixItemId(Integer suffix_item_id);

	public abstract WeaponType getWeaponType();

	public abstract void setWeaponType(WeaponType type);

	public abstract Integer getSecondarySuffixItemId();

	public abstract void setSecondarySuffixItemId(Integer secondarySuffixItemId);
}