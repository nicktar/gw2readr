package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import de.getsetsociety.gw2readr.v0.item.items.enums.GatheringType;

public interface IBaseGathering {

	public abstract GatheringType getGatheringType();

	public abstract void setGatheringType(GatheringType gatheringsType);

}