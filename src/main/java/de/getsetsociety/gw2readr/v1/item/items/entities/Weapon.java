package de.getsetsociety.gw2readr.v1.item.items.entities;

import java.util.HashSet;
import java.util.Set;

import de.getsetsociety.gw2readr.v1.item.items.enums.DamageType;
import de.getsetsociety.gw2readr.v1.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.v1.item.items.enums.WeaponType;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IInfixUpgrade;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IWeapon;

public class Weapon extends Item implements IWeapon {

	private static final long serialVersionUID = 5968065106961929839L;
	private DamageType damageType;
	private Integer defense;
	private IInfixUpgrade infixUpgrade;
	private Set<InfusionSlotType> infusionSlots = new HashSet<InfusionSlotType>();
	private Integer maxPower;
	private Integer minPower;
	private Integer suffixItemId;
	private WeaponType weaponType;

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IWeapon2#getDamageType()
	 */
	@Override
	public DamageType getDamageType() {
		return damageType;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IWeapon2#setDamageType(de.getsetsociety.armory.enums.DamageType)
	 */
	@Override
	public void setDamageType(DamageType damageType) {
		this.damageType = damageType;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IWeapon2#getDefense()
	 */
	@Override
	public Integer getDefense() {
		return defense;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IWeapon2#setDefense(java.lang.Integer)
	 */
	@Override
	public void setDefense(Integer defense) {
		this.defense = defense;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IWeapon2#getInfixUpgrade()
	 */
	@Override
	public IInfixUpgrade getInfixUpgrade() {
		return infixUpgrade;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IWeapon2#setInfixUpgrade(de.getsetsociety.armory.entities.InfixUpgrade)
	 */
	@Override
	public void setInfixUpgrade(IInfixUpgrade infixUpgrade) {
		this.infixUpgrade = infixUpgrade;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IWeapon2#getInfusionSlots()
	 */
	@Override
	public Set<InfusionSlotType> getInfusionSlots() {
		return infusionSlots;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IWeapon2#setInfusionSlots(java.util.Set)
	 */
	@Override
	public void setInfusionSlots(Set<InfusionSlotType> infusionSlots) {
		this.infusionSlots = infusionSlots;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IWeapon2#getMaxPower()
	 */
	@Override
	public Integer getMaxPower() {
		return maxPower;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IWeapon2#setMaxPower(java.lang.Integer)
	 */
	@Override
	public void setMaxPower(Integer maxPower) {
		this.maxPower = maxPower;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IWeapon2#getMinPower()
	 */
	@Override
	public Integer getMinPower() {
		return minPower;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IWeapon2#setMinPower(java.lang.Integer)
	 */
	@Override
	public void setMinPower(Integer min_power) {
		this.minPower = min_power;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IWeapon2#getSuffixItemId()
	 */
	@Override
	public Integer getSuffixItemId() {
		return suffixItemId;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IWeapon2#setSuffixItemId(java.lang.Integer)
	 */
	@Override
	public void setSuffixItemId(Integer suffix_item_id) {
		this.suffixItemId = suffix_item_id;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IWeapon2#getWeaponType()
	 */
	@Override
	public WeaponType getWeaponType() {
		return weaponType;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IWeapon2#setType(de.getsetsociety.armory.enums.WeaponType)
	 */
	@Override
	public void setWeaponType(WeaponType type) {
		this.weaponType = type;
	}

}
