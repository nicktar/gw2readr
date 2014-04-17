package de.getsetsociety.gw2readr.item.items.entities;

import java.util.ArrayList;
import java.util.List;

import de.getsetsociety.gw2readr.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.item.items.interfaces.IInfusionSlot;

public class InfusionSlot implements IInfusionSlot {

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
