package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import java.util.Set;

public interface IBaseArmor<T extends IArmorType, U extends IInfusionSlotType> extends IBaseItem {

	public abstract T getArmorType();

	public abstract void setArmorType(T armorType);

	public abstract Integer getDefense();

	public abstract void setDefense(Integer defense);

	public abstract Integer getSuffixItemId();

	public abstract void setSuffixItemId(Integer suffixItemId);

	public abstract Set<U> getInfusionSlots();

	public abstract void setInfusionSlots(Set<U> infusionSlots);

	public abstract IInfixUpgrade getInfixUpgrade();

	public abstract void setInfixUpgrade(IInfixUpgrade infixUpgrade);

}