package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import java.util.Set;

import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionSlotType;

public interface IBaseBackItem {

	public abstract Set<InfusionSlotType> getInfusionSlots();

	public abstract void setInfusionSlots(Set<InfusionSlotType> infusionSlots);

	public abstract IBaseInfixUpgrade getInfixUpgrade();

	public abstract void setInfixUpgrade(IBaseInfixUpgrade infixUpgrade);

	public abstract Integer getSuffixItemId();

	public abstract void setSuffixItemId(Integer suffixItemId);

}