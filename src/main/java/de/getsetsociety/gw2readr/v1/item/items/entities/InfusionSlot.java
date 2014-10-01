package de.getsetsociety.gw2readr.v1.item.items.entities;

import java.util.ArrayList;
import java.util.List;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseInfusionSlot;
import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionSlotType;

public class InfusionSlot implements IBaseInfusionSlot {

	private List<InfusionSlotType> flags = new ArrayList<InfusionSlotType>();

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IInfusionSlot#getFlags()
	 */
	@Override
	public List<InfusionSlotType> getFlags() {
		return flags;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IInfusionSlot#setFlags(java.util.List)
	 */
	@Override
	public void setFlags(List<InfusionSlotType> flags) {
		this.flags = flags;

	}

}
