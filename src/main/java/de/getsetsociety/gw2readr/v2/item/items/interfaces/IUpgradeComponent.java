package de.getsetsociety.gw2readr.v2.item.items.interfaces;

import java.util.Set;

import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionUpgradeFlag;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseUpgradeComponentFlag;

public interface IUpgradeComponent extends IItem, IBaseUpgradeComponentFlag<IInfixUpgrade> {

	public abstract Set<InfusionUpgradeFlag> getInfusionUpgradeFlags();

	public abstract void setInfusionUpgradeFlags(Set<InfusionUpgradeFlag> flags);

}