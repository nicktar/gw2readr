package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.markers.IGatheringType;

public interface IBaseGathering<T extends IGatheringType> {

	public abstract T getGatheringType();

	public abstract void setGatheringType(T gatheringsType);

}