package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import java.util.Set;

import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionUpgradeFlag;
import de.getsetsociety.gw2readr.v0.item.items.enums.UpgradeComponentFlag;
import de.getsetsociety.gw2readr.v0.item.items.enums.UpgradeComponentType;

public interface IBaseUpgradeComponentFlag<V extends IBaseInfixUpgrade<? extends IBaseBuff, ? extends IBaseAttributeModifier>> {

    UpgradeComponentType getUpgradeComponentType();

    void setUpgradeComponentType(UpgradeComponentType upgradeComponentType);

    Set<UpgradeComponentFlag> getUpgradeComponentFlags();

    void setUpgradeComponentFlags(Set<UpgradeComponentFlag> upgradeComponentFlags);

    Set<String> getBonuses();

    void setBonuses(Set<String> bonuses);

    String getSuffix();

    void setSuffix(String suffix);

    V getInfixUpgrade();

    void setInfixUpgrade(V infixUpgrade);

    Set<InfusionUpgradeFlag> getInfusionUpgradeFlags();
}
