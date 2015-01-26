package de.getsetsociety.gw2readr.v2.item.items.entities;

import de.getsetsociety.gw2readr.v0.item.items.enums.GatheringType;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IGathering;

public class Gathering extends Item implements IGathering {

    private static final long serialVersionUID = 6230977408259325646L;
    private GatheringType gatheringType;

    public GatheringType getGatheringType() {
        return gatheringType;
    }

    public void setGatheringType(GatheringType gatheringType) {
        this.gatheringType = gatheringType;
    }
}
