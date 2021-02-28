package de.getsetsociety.gw2readr.v2.item.items.interfaces;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseBackItem;

public interface IBackItem extends IItem, IBaseBackItem<IInfixUpgrade>, IStatChoices {

    Integer getSecondarySuffixItemId();

    void setSecondarySuffixItemId(Integer secondarySuffixItemId);

}
