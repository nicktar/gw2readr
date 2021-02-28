package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import java.util.Collection;
import java.util.Set;

import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionSlotType;

public interface IInfusionSlot {

    Integer getItem();

    void setItem(Integer item);

    Set<InfusionSlotType> getFlags();

    void addAllFlags(Collection<InfusionSlotType> flags);
}
