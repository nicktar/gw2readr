package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.v0.item.items.enums.TrinketType;

import java.util.Set;

public interface IBaseTrinket<T  extends IBaseInfixUpgrade<? extends IBaseBuff, ? extends IBaseAttributeModifier>> {

	TrinketType getTrinketType();

	void setTrinketType(TrinketType trinketType);

	Set<InfusionSlotType> getInfusionSlots();

	void setInfusionSlots(Set<InfusionSlotType> infusionSlots);

	T getInfixUpgrade();

	void setInfixUpgrade(T infixUpgrade);

	Integer getSuffixItemId();

	void setSuffixItemId(Integer suffixItemId);

	Integer getSecondarySuffixItemId();

	void setSecondarySuffixItemId(Integer secondarySuffixItemId);

}