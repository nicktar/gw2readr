package de.getsetsociety.gw2readr.item.items.interfaces;

import java.util.Set;

import de.getsetsociety.gw2readr.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.item.items.enums.TrinketType;

public interface ITrinket extends IBaseItem{

	public abstract TrinketType getTrinketType();

	public abstract void setTrinketType(TrinketType trinketType);

	public abstract Set<InfusionSlotType> getInfusionSlots();

	public abstract void setInfusionSlots(Set<InfusionSlotType> infusionSlots);

	public abstract IInfixUpgrade getInfixUpgrade();

	public abstract void setInfixUpgrade(IInfixUpgrade infixUpgrade);

	public abstract Integer getSuffixItemId();

	public abstract void setSuffixItemId(Integer suffixItemId);

}