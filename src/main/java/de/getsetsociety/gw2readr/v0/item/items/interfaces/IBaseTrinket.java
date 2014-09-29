package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import java.util.Set;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.markers.IInfusionSlotType;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.markers.ITrinketType;

public interface IBaseTrinket<T extends ITrinketType, U extends IInfusionSlotType, V extends IBaseInfixUpgrade<?, ?, ?>> {

    public abstract T getTrinketType();

    public abstract void setTrinketType(T trinketType);

    public abstract Set<U> getInfusionSlots();

    public abstract void setInfusionSlots(Set<U> infusionSlots);

    public abstract V getInfixUpgrade();

    public abstract void setInfixUpgrade(V infixUpgrade);

    public abstract Integer getSuffixItemId();

    public abstract void setSuffixItemId(Integer suffixItemId);

}