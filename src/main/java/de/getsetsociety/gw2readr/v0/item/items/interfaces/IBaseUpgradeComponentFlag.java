package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import java.util.Set;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.markers.IAttribute;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.markers.IUpgradeComponentFlag;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.markers.IUpgradeComponentType;

public interface IBaseUpgradeComponentFlag<T extends IUpgradeComponentType, U extends IUpgradeComponentFlag, V extends IBaseInfixUpgrade<? extends IAttribute, ? extends IBaseBuff, ? extends IBaseAttributeModifier<?>>> {

    public abstract T getUpgradeComponentType();

    public abstract void setUpgradeComponentType(T UpgradeComponentType);

    public abstract Set<U> getUpgradeComponentFlags();

    public abstract void setUpgradeComponentFlags(Set<U> upgradeComponentFlags);

    public abstract Set<String> getBonuses();

    public abstract void setBonuses(Set<String> bonuses);

    public abstract String getSuffix();

    public abstract void setSuffix(String suffix);

    public abstract V getInfixUpgrade();

    public abstract void setInfixUpgrade(V infixUpgrade);

}