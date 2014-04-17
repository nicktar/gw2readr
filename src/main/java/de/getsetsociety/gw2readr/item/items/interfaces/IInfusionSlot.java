package de.getsetsociety.gw2readr.item.items.interfaces;

import java.util.List;

import de.getsetsociety.gw2readr.item.items.enums.InfusionSlotType;

public interface IInfusionSlot {

	public abstract List<InfusionSlotType> getFlags();

	public abstract void setFlags(List<InfusionSlotType> flags);

}