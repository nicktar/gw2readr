package de.getsetsociety.gw2readr.item.items.interfaces;

import java.util.Set;

import de.getsetsociety.gw2readr.item.items.enums.UpgradeComponentFlag;
import de.getsetsociety.gw2readr.item.items.enums.UpgradeComponentType;

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

	public abstract IInfixUpgrade getInfixUpgrade();

	public abstract void setInfixUpgrade(IInfixUpgrade infixUpgrade);

}