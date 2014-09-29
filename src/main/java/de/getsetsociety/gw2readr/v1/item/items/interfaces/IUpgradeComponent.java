package de.getsetsociety.gw2readr.v1.item.items.interfaces;

import java.util.Set;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseInfixUpgrade;
import de.getsetsociety.gw2readr.v1.item.items.enums.UpgradeComponentFlag;
import de.getsetsociety.gw2readr.v1.item.items.enums.UpgradeComponentType;

public interface IUpgradeComponent extends IBaseItem{

	public abstract UpgradeComponentType getUpgradeComponentType();

	public abstract void setUpgradeComponentType(
			UpgradeComponentType UpgradeComponentType);

	public abstract Set<UpgradeComponentFlag> getUpgradeComponentFlags();

	public abstract void setUpgradeComponentFlags(
			Set<UpgradeComponentFlag> upgradeComponentFlags);

	public abstract Set<String> getBonuses();

	public abstract void setBonuses(Set<String> bonuses);

	public abstract String getSuffix();

	public abstract void setSuffix(String suffix);

	public abstract IBaseInfixUpgrade getInfixUpgrade();

	public abstract void setInfixUpgrade(IBaseInfixUpgrade infixUpgrade);

}