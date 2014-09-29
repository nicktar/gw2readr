package de.getsetsociety.gw2readr.v2.item.items.interfaces;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseConsumable;
import de.getsetsociety.gw2readr.v2.item.items.enums.ConsumableType;
import de.getsetsociety.gw2readr.v2.item.items.enums.ConsumableUnlockType;

public interface IConsumable extends IBaseItem, IBaseConsumable<ConsumableUnlockType, ConsumableType> {

}