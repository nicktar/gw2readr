package de.getsetsociety.gw2readr.v1.item.items.entities;

import java.util.HashSet;
import java.util.Set;

import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IBackItem;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IInfixUpgrade;

public class BackItem extends Item implements IBackItem {

	private static final long serialVersionUID = 3090458230052660395L;
	private Set<InfusionSlotType> infusionSlots = new HashSet<InfusionSlotType>();
	private IInfixUpgrade infixUpgrade;
	private Integer suffixItemId;

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBackItem#getInfusionSlots()
	 */
	@Override
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
