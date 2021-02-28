package de.getsetsociety.gw2readr.v2.item.items.interfaces;

import de.getsetsociety.gw2readr.v0.item.items.enums.UpgradeType;

public interface IUpgradePath {

    UpgradeType getUpgrade();

    void setUpgrade(UpgradeType upgradeType);

    Integer getItemId();

    void setItemId(Integer itemId);
}
