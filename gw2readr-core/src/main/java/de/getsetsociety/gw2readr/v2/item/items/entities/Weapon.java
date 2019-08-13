package de.getsetsociety.gw2readr.v2.item.items.entities;

import de.getsetsociety.gw2readr.v0.item.items.enums.DamageType;
import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.v0.item.items.enums.WeaponType;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IInfixUpgrade;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IWeapon;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = true)
public class Weapon extends Item implements IWeapon {

	private DamageType damageType;
	private Integer defense;
	private IInfixUpgrade infixUpgrade;
	private Set<InfusionSlotType> infusionSlots = new HashSet<>();
	private Integer maxPower;
	private Integer minPower;
	private Integer suffixItemId;
	private WeaponType weaponType;
	private Integer secondarySuffixItemId;
	private Integer defaultSkin;
}
