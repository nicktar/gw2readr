package de.getsetsociety.gw2readr.v2.item.items.interfaces;

import java.util.Collection;

import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseWeapon;

public interface IWeapon extends IItem, IBaseWeapon<IInfixUpgrade>, IStatChoices {

    void addAllInfusionSlots(Collection<InfusionSlotType> infusionSlots);
}
