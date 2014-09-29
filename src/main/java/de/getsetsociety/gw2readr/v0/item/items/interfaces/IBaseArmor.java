package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import java.util.Set;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.markers.IArmorType;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.markers.IAttribute;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.markers.IInfusionSlotType;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.markers.IWeightClass;

public interface IBaseArmor<T extends IArmorType, U extends IInfusionSlotType, V extends IWeightClass,
W extends IAttribute, S extends IBaseInfixUpgrade> extends IBaseItem {

	public abstract T getArmorType();

	public abstract void setArmorType(T armorType);

	public abstract Integer getDefense();

	public abstract void setDefense(Integer defense);

	public abstract Integer getSuffixItemId();

	public abstract void setSuffixItemId(Integer suffixItemId);

	public abstract Set<U> getInfusionSlots();

	public abstract void setInfusionSlots(Set<U> infusionSlots);

	public abstract S getInfixUpgrade();

	public abstract void setInfixUpgrade(S infixUpgrade);

	public abstract V getWeightClass();

	public abstract void setWeightClass(V wightClass);



}