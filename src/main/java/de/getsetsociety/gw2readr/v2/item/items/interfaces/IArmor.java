package de.getsetsociety.gw2readr.v2.item.items.interfaces;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseArmor;

public interface IArmor extends IItem, IBaseArmor<IInfixUpgrade> {

	public abstract Integer getSecondarySuffixItemId();

	public abstract void setSecondarySuffixItemId(Integer secondarySuffixItemId);
}