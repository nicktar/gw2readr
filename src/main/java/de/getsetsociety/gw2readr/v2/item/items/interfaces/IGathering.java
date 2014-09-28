package de.getsetsociety.gw2readr.v2.item.items.interfaces;

import de.getsetsociety.gw2readr.v2.item.items.enums.GatheringType;

public interface IGathering extends IBaseItem {

    public GatheringType getGatheringType();

    public void setGatheringType(GatheringType gatheringsType);
}
