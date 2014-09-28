package de.getsetsociety.gw2readr.v2.item.items.interfaces;

import java.util.Set;

import de.getsetsociety.gw2readr.v2.item.items.enums.InfusionSlotType;

public interface IBackItem extends IBaseItem {

    public abstract Set<InfusionSlotType> getInfusionSlots();

    public abstract void setInfusionSlots(Set<InfusionSlotType> infusionSlots);

    public abstract IInfixUpgrade getInfixUpgrade();

    public abstract void setInfixUpgrade(IInfixUpgrade infixUpgrade);

    public abstract Integer getSuffixItemId();

    public abstract void setSuffixItemId(Integer suffixItemId);

    public abstract Integer getSecondarySuffixItemId();

    public abstract void setSecondarySuffixItemId(Integer secondarySuffixItemId);

}