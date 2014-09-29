package de.getsetsociety.gw2readr.v1.item.items.interfaces;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseTrinket;
import de.getsetsociety.gw2readr.v1.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.v1.item.items.enums.TrinketType;

public interface ITrinket extends IBaseItem, IBaseTrinket<TrinketType, InfusionSlotType, IInfixUpgrade> {

}