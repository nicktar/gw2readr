package de.getsetsociety.gw2readr.v1.item.items.hibernateentities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import de.getsetsociety.gw2readr.v0.item.items.enums.UpgradeComponentFlag;
import de.getsetsociety.gw2readr.v0.item.items.enums.UpgradeComponentType;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IInfixUpgrade;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IUpgradeComponent;

@Entity
@Table
@PrimaryKeyJoinColumn(name = "ItemId")
public class UpgradeComponent extends Item implements IUpgradeComponent {

	private static final long serialVersionUID = -6775048521978498694L;
	private UpgradeComponentType upgradeComponentType;
	private Set<UpgradeComponentFlag> upgradeComponentFlags = new HashSet<>();
	private Set<String> bonuses;
	private String suffix;
	private IInfixUpgrade infixUpgrade;

	/*
	 * (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IUpgradeComponent#getUpgradeComponentrType()
	 */
	@Override
	@Column
	@Enumerated(EnumType.ORDINAL)
	public UpgradeComponentType getUpgradeComponentType() {
		return upgradeComponentType;
	}

	/*
	 * (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IUpgradeComponent#setUpgradeComponentType(de.getsetsociety.armory.enums.
	 * UpgradeComponentType)
	 */
	@Override
	public void setUpgradeComponentType(UpgradeComponentType UpgradeComponentType) {
		this.upgradeComponentType = UpgradeComponentType;
	}

	/*
	 * (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IUpgradeComponent#getUpgradeComponentFlags()
	 */
	@Override
	@ElementCollection(targetClass = UpgradeComponentFlag.class)
	@CollectionTable(name = "UpgradeComponentFlags", joinColumns = @JoinColumn(name = "UpgradeComponentId"))
	@Column
	@Enumerated(EnumType.ORDINAL)
	public Set<UpgradeComponentFlag> getUpgradeComponentFlags() {
		return upgradeComponentFlags;
	}

	/*
	 * (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IUpgradeComponent#setUpgradeComponentFlags(java.util.Set)
	 */
	@Override
	public void setUpgradeComponentFlags(
			Set<UpgradeComponentFlag> upgradeComponentFlags) {
		this.upgradeComponentFlags = upgradeComponentFlags;
	}

	/*
	 * (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IUpgradeComponent#getBonuses()
	 */
	@Override
	@ElementCollection(targetClass = String.class)
	@CollectionTable(name = "Bonuses", joinColumns = @JoinColumn(name = "UpgradeComponentId"))
	public Set<String> getBonuses() {
		return bonuses;
	}

	/*
	 * (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IUpgradeComponent#setBonuses(java.util.Set)
	 */
	@Override
	public void setBonuses(Set<String> bonuses) {
		this.bonuses = bonuses;
	}

	/*
	 * (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IUpgradeComponent#getSuffix()
	 */
	@Override
	@Column
	public String getSuffix() {
		return suffix;
	}

	/*
	 * (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IUpgradeComponent#setSuffix(java.lang.String)
	 */
	@Override
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	/*
	 * (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IUpgradeComponent#getInfixUpgrade()
	 */
	@Override
	@OneToOne(orphanRemoval = true, targetEntity = InfixUpgrade.class, cascade = CascadeType.ALL)
	public IInfixUpgrade getInfixUpgrade() {
		return infixUpgrade;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * de.getsetsociety.gw2readr.entities.IUpgradeComponent#setInfixUpgrade(de.getsetsociety.armory.entities.InfixUpgrade
	 * )
	 */
	@Override
	public void setInfixUpgrade(IInfixUpgrade infixUpgrade) {
		this.infixUpgrade = infixUpgrade;
	}
}
