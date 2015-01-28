package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import java.util.List;

import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionSlotType;

public interface IBaseInfusionSlot {

	public abstract List<InfusionSlotType> getFlags();

	public abstract void setFlags(List<InfusionSlotType> flags);

}