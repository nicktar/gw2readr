package de.getsetsociety.gw2readr.v1.item.items.hibernateentities;

import de.getsetsociety.gw2readr.v0.item.items.enums.DamageType;
import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.v0.item.items.enums.WeaponType;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IInfixUpgrade;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IWeapon;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Table
@Entity
@PrimaryKeyJoinColumn(name = "ItemId")
public class Weapon extends Item implements IWeapon {

	@Column
	@Enumerated(EnumType.ORDINAL)
	private DamageType damageType;

	@Column
	private Integer defense;

	@OneToOne(orphanRemoval = true, targetEntity = InfixUpgrade.class, cascade = CascadeType.ALL)
	private IInfixUpgrade infixUpgrade;

	@Column
	@Enumerated(EnumType.ORDINAL)
	@ElementCollection(targetClass = InfusionSlotType.class)
	@CollectionTable(name = "WeaponFlags", joinColumns = @JoinColumn(name = "ItemId"))
	private Set<InfusionSlotType> infusionSlots = new HashSet<>();

	@Column
	private Integer maxPower;

	@Column
	private Integer minPower;

	@Column
	private Integer suffixItemId;

	@Column
	private Integer secondarySuffixItemId;

	@Column
	private WeaponType weaponType;

	@Column
	private Integer defaultSkin;
}
