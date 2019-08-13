package de.getsetsociety.gw2readr.v2.item.items.interfaces;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseWeapon;

public interface IWeapon extends IItem, IBaseWeapon<IInfixUpgrade> {

	@Override
	Integer getSecondarySuffixItemId();

	@Override
	void setSecondarySuffixItemId(Integer secondarySuffixItemId);

	@Override
	Integer getDefaultSkin();

	@Override
	void setDefaultSkin(Integer defaultSkin);
}