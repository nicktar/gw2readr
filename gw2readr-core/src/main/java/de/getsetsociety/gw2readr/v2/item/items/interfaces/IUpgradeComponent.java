package de.getsetsociety.gw2readr.v2.item.items.interfaces;

import java.util.Collection;

import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionUpgradeFlag;
import de.getsetsociety.gw2readr.v0.item.items.enums.UpgradeComponentFlag;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.IAttributeAdjuster;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseUpgradeComponentFlag;

public interface IUpgradeComponent extends IItem, IBaseUpgradeComponentFlag<IInfixUpgrade>, IAttributeAdjuster {

    void addAllInfusionUpgradeFlags(Collection<InfusionUpgradeFlag> flags);

    void addAllUpgradeComponentFlags(Collection<UpgradeComponentFlag> upgradeComponentFlags);
}
