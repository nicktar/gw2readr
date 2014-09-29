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

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IInfixUpgrade;
import de.getsetsociety.gw2readr.v1.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IBackItem;

@Entity
@Table
@PrimaryKeyJoinColumn(name="ItemId")
public class BackItem extends Item implements IBackItem {

	private static final long serialVersionUID = 3090458230052660395L;
	private Set<InfusionSlotType> infusionSlots = new HashSet<InfusionSlotType>();
	private IInfixUpgrade infixUpgrade;
	private Integer suffixItemId;

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBackItem#getInfusionSlots()
	 */
	@Override
	@ElementCollection(targetClass=InfusionSlotType.class)
	@CollectionTable(name="BackItemFlags", joinColumns= @JoinColumn(name="ItemId"))
	@Column
	@Enumerated(EnumType.ORDINAL)
	public Set<InfusionSlotType> getInfusionSlots() {
		return infusionSlots;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBackItem#setInfusionSlots(java.util.Set)
	 */
	@Override
	public void setInfusionSlots(Set<InfusionSlotType> infusionSlots) {
		this.infusionSlots = infusionSlots;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBackItem#getInfixUpgrade()
	 */
	@Override
	@OneToOne(orphanRemoval=true, targetEntity=InfixUpgrade.class, cascade=CascadeType.ALL)
	public IInfixUpgrade getInfixUpgrade() {
		return infixUpgrade;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBackItem#setInfixUpgrade(de.getsetsociety.armory.entities.InfixUpgrade)
	 */
	@Override
	public void setInfixUpgrade(IInfixUpgrade infixUpgrade) {
		this.infixUpgrade = infixUpgrade;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBackItem#getSuffixItemId()
	 */
	@Override
	@Column
	public Integer getSuffixItemId() {
		return suffixItemId;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBackItem#setSuffixItemId(java.lang.Integer)
	 */
	@Override
	public void setSuffixItemId(Integer suffixItemId) {
		this.suffixItemId = suffixItemId;
	}

}
