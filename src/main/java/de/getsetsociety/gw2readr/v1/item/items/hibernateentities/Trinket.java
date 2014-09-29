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
import de.getsetsociety.gw2readr.v1.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.v1.item.items.enums.TrinketType;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.ITrinket;

@Entity
@Table
@PrimaryKeyJoinColumn(name="ItemId")
public class Trinket extends Item implements ITrinket {

	private static final long serialVersionUID = -7895269575167289085L;
	private TrinketType trinketType;
	private Set<InfusionSlotType> infusionSlots = new HashSet<InfusionSlotType>();
	private IBaseInfixUpgrade infixUpgrade;
	private Integer suffixItemId;

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.ITrinket#getTrinketType()
	 */
	@Override
	@Column
	@Enumerated(EnumType.ORDINAL)
	public TrinketType getTrinketType() {
		return trinketType;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.ITrinket#setTrinketType(de.getsetsociety.armory.enums.TrinketType)
	 */
	@Override
	public void setTrinketType(TrinketType trinketType) {
		this.trinketType = trinketType;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.ITrinket#getInfusionSlots()
	 */
	@Override
	@ElementCollection(targetClass=InfusionSlotType.class)
	@CollectionTable(name="TrinketFlags", joinColumns= @JoinColumn(name="ItemId"))
	@Column
	@Enumerated(EnumType.ORDINAL)
	public Set<InfusionSlotType> getInfusionSlots() {
		return infusionSlots;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.ITrinket#setInfusionSlots(java.util.Set)
	 */
	@Override
	public void setInfusionSlots(Set<InfusionSlotType> infusionSlots) {
		this.infusionSlots = infusionSlots;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.ITrinket#getInfixUpgrade()
	 */
	@Override
	@OneToOne(orphanRemoval=true, targetEntity=InfixUpgrade.class, cascade=CascadeType.ALL)
	public IBaseInfixUpgrade getInfixUpgrade() {
		return infixUpgrade;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.ITrinket#setInfixUpgrade(de.getsetsociety.armory.entities.InfixUpgrade)
	 */
	@Override
	public void setInfixUpgrade(IBaseInfixUpgrade infixUpgrade) {
		this.infixUpgrade = infixUpgrade;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.ITrinket#getSuffixItemId()
	 */
	@Override
	@Column
	public Integer getSuffixItemId() {
		return suffixItemId;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.ITrinket#setSuffixItemId(java.lang.Integer)
	 */
	@Override
	public void setSuffixItemId(Integer suffixItemId) {
		this.suffixItemId = suffixItemId;
	}

}
