package de.getsetsociety.gw2readr.v1.item.items.interfaces;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseArmor;
import de.getsetsociety.gw2readr.v1.item.items.enums.ArmorType;
import de.getsetsociety.gw2readr.v1.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.v1.item.items.enums.WightClass;

public interface IArmor extends IBaseItem, IBaseArmor<ArmorType, InfusionSlotType> {

	public abstract WightClass getWightClass();

	public abstract void setWightClass(WightClass wightClass);

}