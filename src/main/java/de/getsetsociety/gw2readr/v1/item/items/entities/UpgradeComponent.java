package de.getsetsociety.gw2readr.v1.item.items.entities;

import java.util.HashSet;
import java.util.Set;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IInfixUpgrade;
import de.getsetsociety.gw2readr.v1.item.items.enums.UpgradeComponentFlag;
import de.getsetsociety.gw2readr.v1.item.items.enums.UpgradeComponentType;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IUpgradeComponent;

public class UpgradeComponent extends Item implements IUpgradeComponent {

	private static final long serialVersionUID = -6775048521978498694L;
	private UpgradeComponentType upgradeComponentType;
	private Set<UpgradeComponentFlag> upgradeComponentFlags = new HashSet<>();
	private Set<String> bonuses;
	private String suffix;
	private IInfixUpgrade infixUpgrade;

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IUpgradeComponent#getUpgradeComponentrType()
	 */
	@Override
	public UpgradeComponentType getUpgradeComponentType() {
		return upgradeComponentType;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IUpgradeComponent#setUpgradeComponentType(de.getsetsociety.armory.enums.UpgradeComponentType)
	 */
	@Override
	public void setUpgradeComponentType(UpgradeComponentType UpgradeComponentType) {
		this.upgradeComponentType = UpgradeComponentType;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IUpgradeComponent#getUpgradeComponentFlags()
	 */
	@Override
	public Set<UpgradeComponentFlag> getUpgradeComponentFlags() {
		return upgradeComponentFlags;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IUpgradeComponent#setUpgradeComponentFlags(java.util.Set)
	 */
	@Override
	public void setUpgradeComponentFlags(
			Set<UpgradeComponentFlag> upgradeComponentFlags) {
		this.upgradeComponentFlags = upgradeComponentFlags;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IUpgradeComponent#getBonuses()
	 */
	@Override
	public Set<String> getBonuses() {
		return bonuses;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IUpgradeComponent#setBonuses(java.util.Set)
	 */
	@Override
	public void setBonuses(Set<String> bonuses) {
		this.bonuses = bonuses;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IUpgradeComponent#getSuffix()
	 */
	@Override
	public String getSuffix() {
		return suffix;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IUpgradeComponent#setSuffix(java.lang.String)
	 */
	@Override
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IUpgradeComponent#getInfixUpgrade()
	 */
	@Override
	public IInfixUpgrade getInfixUpgrade() {
		return infixUpgrade;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IUpgradeComponent#setInfixUpgrade(de.getsetsociety.armory.entities.InfixUpgrade)
	 */
	@Override
	public void setInfixUpgrade(IInfixUpgrade infixUpgrade) {
		this.infixUpgrade = infixUpgrade;
	}
}
