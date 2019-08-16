package de.getsetsociety.gw2readr.v1.item.items.hibernateentities;

import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionUpgradeFlag;
import de.getsetsociety.gw2readr.v0.item.items.enums.UpgradeComponentFlag;
import de.getsetsociety.gw2readr.v0.item.items.enums.UpgradeComponentType;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IInfixUpgrade;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IUpgradeComponent;
import lombok.Data;
import lombok.EqualsAndHashCode;

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
import java.util.HashSet;
import java.util.Set;

@Data
@Table
@Entity
@EqualsAndHashCode(callSuper = true)
@PrimaryKeyJoinColumn(name = "ItemId")
public class UpgradeComponent extends Item implements IUpgradeComponent {

	@Column
	@Enumerated(EnumType.ORDINAL)
	private UpgradeComponentType upgradeComponentType;

	@Column
	@Enumerated(EnumType.ORDINAL)
	@ElementCollection(targetClass = UpgradeComponentFlag.class)
	@CollectionTable(name = "UpgradeComponentFlags", joinColumns = @JoinColumn(name = "UpgradeComponentId"))
	private Set<UpgradeComponentFlag> upgradeComponentFlags = new HashSet<>();

	@ElementCollection(targetClass = String.class)
	@CollectionTable(name = "Bonuses", joinColumns = @JoinColumn(name = "UpgradeComponentId"))
	private Set<String> bonuses;
	@Column
	private String suffix;

	@OneToOne(orphanRemoval = true, targetEntity = InfixUpgrade.class, cascade = CascadeType.ALL)
	private IInfixUpgrade infixUpgrade;

	@Column
	@Enumerated(EnumType.ORDINAL)
	@ElementCollection(targetClass = UpgradeComponentFlag.class)
	@CollectionTable(name = "InfusionUpgradeFlags", joinColumns = @JoinColumn(name = "InfusionUpdateId"))
	private Set<InfusionUpgradeFlag> infusionUpgradeFlags;
}
