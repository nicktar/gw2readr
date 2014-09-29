package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import java.util.Set;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.markers.IAttribute;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.markers.IInfusionSlotType;

public interface IBaseBackItem<T extends IInfusionSlotType, U extends IAttribute> {

	public abstract Set<T> getInfusionSlots();

	public abstract void setInfusionSlots(Set<T> infusionSlots);

	public abstract IBaseInfixUpgrade getInfixUpgrade();

	public abstract void setInfixUpgrade(IBaseInfixUpgrade infixUpgrade);

	public abstract Integer getSuffixItemId();

	public abstract void setSuffixItemId(Integer suffixItemId);

}