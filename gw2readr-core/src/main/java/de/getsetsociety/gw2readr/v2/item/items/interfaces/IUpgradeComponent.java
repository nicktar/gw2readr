package de.getsetsociety.gw2readr.v2.item.items.interfaces;

import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionUpgradeFlag;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseUpgradeComponentFlag;

import java.util.Set;

public interface IUpgradeComponent extends IItem, IBaseUpgradeComponentFlag<IInfixUpgrade> {

    @Override
    Set<InfusionUpgradeFlag> getInfusionUpgradeFlags();

    @Override
    void setInfusionUpgradeFlags(Set<InfusionUpgradeFlag> flags);

}