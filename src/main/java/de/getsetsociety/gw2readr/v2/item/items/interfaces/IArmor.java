package de.getsetsociety.gw2readr.v2.item.items.interfaces;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseArmor;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.IInfixUpgrade;
import de.getsetsociety.gw2readr.v2.item.items.enums.ArmorType;
import de.getsetsociety.gw2readr.v2.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.v2.item.items.enums.WightClass;

public interface IArmor extends IBaseItem, IBaseArmor<ArmorType, InfusionSlotType> {

	public abstract WightClass getWightClass();

	public abstract void setWightClass(WightClass wightClass);

	public abstract Integer getSecondarySuffixItemId();

	public abstract void setSecondarySuffixItemId(Integer secondarySuffixItemId);

	public abstract IInfixUpgrade getInfixUpgrade();

	public abstract void setInfixUpgrade(IInfixUpgrade infixUpgrade);

}