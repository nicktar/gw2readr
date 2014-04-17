package de.getsetsociety.gw2readr.item.items.entities;

import java.util.HashSet;
import java.util.Set;

import de.getsetsociety.gw2readr.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.item.items.enums.TrinketType;
import de.getsetsociety.gw2readr.item.items.interfaces.IInfixUpgrade;
import de.getsetsociety.gw2readr.item.items.interfaces.ITrinket;

public class Trinket extends Item implements ITrinket {

	private static final long serialVersionUID = -7895269575167289085L;
	private TrinketType trinketType;
	private Set<InfusionSlotType> infusionSlots = new HashSet<InfusionSlotType>();
	private IInfixUpgrade infixUpgrade;
	private Integer suffixItemId;

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.ITrinket#getTrinketType()
	 */
	@Override
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
	public IInfixUpgrade getInfixUpgrade() {
		return infixUpgrade;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.ITrinket#setInfixUpgrade(de.getsetsociety.armory.entities.InfixUpgrade)
	 */
	@Override
	public void setInfixUpgrade(IInfixUpgrade infixUpgrade) {
		this.infixUpgrade = infixUpgrade;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.ITrinket#getSuffixItemId()
	 */
	@Override
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
