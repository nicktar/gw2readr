package de.getsetsociety.gw2readr.v1.item.items.interfaces;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseArmor;
import de.getsetsociety.gw2readr.v1.item.items.enums.ArmorType;
import de.getsetsociety.gw2readr.v1.item.items.enums.Attribute;
import de.getsetsociety.gw2readr.v1.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.v1.item.items.enums.WeightClass;

public interface IArmor extends IBaseItem, IBaseArmor<ArmorType, InfusionSlotType, WeightClass, Attribute> {

}