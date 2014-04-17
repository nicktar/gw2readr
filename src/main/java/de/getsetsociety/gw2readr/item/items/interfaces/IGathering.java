package de.getsetsociety.gw2readr.item.items.interfaces;

import de.getsetsociety.gw2readr.item.items.enums.GatheringType;

public interface IGathering extends IBaseItem {

	public GatheringType getGatheringType();

	public void setGatheringType(GatheringType gatheringsType);
}
