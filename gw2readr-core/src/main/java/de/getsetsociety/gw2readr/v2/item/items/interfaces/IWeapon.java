package de.getsetsociety.gw2readr.v2.item.items.interfaces;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseWeapon;

public interface IWeapon extends IItem, IBaseWeapon<IInfixUpgrade> {

	public abstract Integer getSecondarySuffixItemId();

	public abstract void setSecondarySuffixItemId(Integer secondarySuffixItemId);
}