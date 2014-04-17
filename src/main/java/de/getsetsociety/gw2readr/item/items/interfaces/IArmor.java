package de.getsetsociety.gw2readr.item.items.interfaces;

import java.util.Set;

import de.getsetsociety.gw2readr.item.items.enums.ArmorType;
import de.getsetsociety.gw2readr.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.item.items.enums.WightClass;

public interface IArmor extends IBaseItem {

	public abstract ArmorType getArmorType();

	public abstract void setArmorType(ArmorType armorType);

	public abstract WightClass getWightClass();

	public abstract void setWightClass(WightClass wightClass);

	public abstract Integer getDefense();

	public abstract void setDefense(Integer defense);

	public abstract Set<InfusionSlotType> getInfusionSlots();

	public abstract void setInfusionSlots(Set<InfusionSlotType> infusionSlots);

	public abstract Integer getSuffixItemId();

	public abstract void setSuffixItemId(Integer suffixItemId);

	public abstract IInfixUpgrade getInfixUpgrade();

	public abstract void setInfixUpgrade(IInfixUpgrade infixUpgrade);

}