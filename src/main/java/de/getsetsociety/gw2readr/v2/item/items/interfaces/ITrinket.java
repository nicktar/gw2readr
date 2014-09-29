package de.getsetsociety.gw2readr.v2.item.items.interfaces;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseTrinket;
import de.getsetsociety.gw2readr.v2.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.v2.item.items.enums.TrinketType;

public interface ITrinket extends IBaseItem, IBaseTrinket<TrinketType, InfusionSlotType, IInfixUpgrade> {

    public abstract Integer getSecondarySuffixItemId();

    public abstract void setSecondarySuffixItemId(Integer suffixItemId);
}