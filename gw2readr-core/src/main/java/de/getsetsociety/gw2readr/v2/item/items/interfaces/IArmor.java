package de.getsetsociety.gw2readr.v2.item.items.interfaces;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IAttributeAdjuster;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseArmor;

public interface IArmor extends IItem, IBaseArmor<IInfixUpgrade>, IAttributeAdjuster {

    @Override
    Integer getSecondarySuffixItemId();

    @Override
    void setSecondarySuffixItemId(Integer secondarySuffixItemId);
}
