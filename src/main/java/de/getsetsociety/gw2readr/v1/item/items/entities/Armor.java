package de.getsetsociety.gw2readr.v1.item.items.entities;

import java.util.HashSet;
import java.util.Set;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IInfixUpgrade;
import de.getsetsociety.gw2readr.v1.item.items.enums.ArmorType;
import de.getsetsociety.gw2readr.v1.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.v1.item.items.enums.WeightClass;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IArmor;

public class Armor extends Item implements IArmor {

	private static final long serialVersionUID = 8450275854880660075L;
	private ArmorType armorType;
	private WeightClass wightClass;
	private Integer defense;
	private Set<InfusionSlotType> infusionSlots = new HashSet<InfusionSlotType>();
	private Integer suffixItemId;
	private IInfixUpgrade infixUpgrade;

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IArmor#getArmorType()
	 */
	@Override
	public ArmorType getArmorType() {
		return armorType;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IArmor#setArmorType(de.getsetsociety.armory.enums.ArmorType)
	 */
	@Override
	public void setArmorType(ArmorType armorType) {
		this.armorType = armorType;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IArmor#getWightClass()
	 */
	@Override
	public WeightClass getWeightClass() {
		return wightClass;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IArmor#setWightClass(de.getsetsociety.armory.enums.WightClass)
	 */
	@Override
	public void setWeightClass(WeightClass wightClass) {
		this.wightClass = wightClass;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IArmor#getDefense()
	 */
	@Override
	public Integer getDefense() {
		return defense;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IArmor#setDefense(java.lang.Integer)
	 */
	@Override
	public void setDefense(Integer defense) {
		this.defense = defense;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IArmor#getInfusionSlots()
	 */
	@Override
	public Set<InfusionSlotType> getInfusionSlots() {
		return infusionSlots;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IArmor#setInfusionSlots(java.util.Set)
	 */
	@Override
	public void setInfusionSlots(Set<InfusionSlotType> infusionSlots) {
		this.infusionSlots = infusionSlots;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IArmor#getSuffixItemId()
	 */
	@Override
	public Integer getSuffixItemId() {
		return suffixItemId;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IArmor#setSuffixItemId(java.lang.Integer)
	 */
	@Override
	public void setSuffixItemId(Integer suffixItemId) {
		this.suffixItemId = suffixItemId;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IArmor#getInfixUpgrade()
	 */
	@Override
	public IInfixUpgrade getInfixUpgrade() {
		return infixUpgrade;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IArmor#setInfixUpgrade(de.getsetsociety.armory.entities.InfixUpgrade)
	 */
	@Override
	public void setInfixUpgrade(IInfixUpgrade infixUpgrade) {
		this.infixUpgrade = infixUpgrade;
	}

}
