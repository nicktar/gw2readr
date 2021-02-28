package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import java.util.Collection;
import java.util.Set;

public interface IInfusionSlotProvider {
    Set<IInfusionSlot> getInfusionSlots();

    void addAllInfusionSlots(Collection<IInfusionSlot> infusionSlots);
}
