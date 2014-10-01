package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import java.util.Set;

import de.getsetsociety.gw2readr.v0.item.items.enums.ArmorType;
import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.v0.item.items.enums.WeightClass;

public interface IBaseArmor<S extends IBaseInfixUpgrade<? extends IBaseBuff, ? extends IBaseAttributeModifier>> extends IBaseItem {

	public abstract ArmorType getArmorType();

	public abstract void setArmorType(ArmorType armorType);

	public abstract Integer getDefense();

	public abstract void setDefense(Integer defense);

	public abstract Integer getSuffixItemId();

	public abstract void setSuffixItemId(Integer suffixItemId);

	public abstract Set<InfusionSlotType> getInfusionSlots();

	public abstract void setInfusionSlots(Set<InfusionSlotType> infusionSlots);

	public abstract S getInfixUpgrade();

	public abstract void setInfixUpgrade(S infixUpgrade);

	public abstract WeightClass getWeightClass();

	public abstract void setWeightClass(WeightClass wightClass);



}