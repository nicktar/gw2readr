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

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseInfixUpgrade;
import de.getsetsociety.gw2readr.v1.item.items.enums.ArmorType;
import de.getsetsociety.gw2readr.v1.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.v1.item.items.enums.WeightClass;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IArmor;

@Entity
@Table
@PrimaryKeyJoinColumn(name="ItemId")
public class Armor extends Item implements IArmor {

	private static final long serialVersionUID = 8450275854880660075L;
	private ArmorType armorType;
	private WeightClass wightClass;
	private Integer defense;
	private Set<InfusionSlotType> infusionSlots = new HashSet<InfusionSlotType>();
	private Integer suffixItemId;
	private IBaseInfixUpgrade infixUpgrade;

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IArmor#getArmorType()
	 */
	@Column
	@Override
	@Enumerated(EnumType.ORDINAL)
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
	@Column
	@Override
	@Enumerated(EnumType.ORDINAL)
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
	@Column
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
	@ElementCollection(targetClass=InfusionSlotType.class)
	@CollectionTable(name="ArmorFlags", joinColumns= @JoinColumn(name="ItemId"))
	@Column
	@Enumerated(EnumType.ORDINAL)
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
	@Column
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
	@OneToOne(orphanRemoval=true, targetEntity=InfixUpgrade.class, cascade=CascadeType.ALL)
	public IBaseInfixUpgrade getInfixUpgrade() {
		return infixUpgrade;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IArmor#setInfixUpgrade(de.getsetsociety.armory.entities.InfixUpgrade)
	 */
	@Override
	public void setInfixUpgrade(IBaseInfixUpgrade infixUpgrade) {
		this.infixUpgrade = infixUpgrade;
	}

}
