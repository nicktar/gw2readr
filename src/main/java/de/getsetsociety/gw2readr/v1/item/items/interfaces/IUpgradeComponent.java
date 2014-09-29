package de.getsetsociety.gw2readr.v1.item.items.interfaces;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseUpgradeComponentFlag;
import de.getsetsociety.gw2readr.v1.item.items.enums.UpgradeComponentFlag;
import de.getsetsociety.gw2readr.v1.item.items.enums.UpgradeComponentType;

public interface IUpgradeComponent extends IBaseItem, IBaseUpgradeComponentFlag<UpgradeComponentType, UpgradeComponentFlag, IInfixUpgrade> {

}