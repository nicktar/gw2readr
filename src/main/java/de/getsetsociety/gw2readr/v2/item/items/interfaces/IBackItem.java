package de.getsetsociety.gw2readr.v2.item.items.interfaces;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseBackItem;
import de.getsetsociety.gw2readr.v2.item.items.enums.Attribute;
import de.getsetsociety.gw2readr.v2.item.items.enums.InfusionSlotType;

public interface IBackItem extends IBaseItem, IBaseBackItem<InfusionSlotType, Attribute> {

	public abstract Integer getSecondarySuffixItemId();

	public abstract void setSecondarySuffixItemId(Integer secondarySuffixItemId);

}