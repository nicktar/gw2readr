package de.getsetsociety.gw2readr.item.items.entities;

import de.getsetsociety.gw2readr.item.items.interfaces.ITrophy;

public class Trophy extends Item implements ITrophy {

	private static final long serialVersionUID = -3053009181561706950L;
	private String description;

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.ITrophy#getDescription()
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.ITrophy#setDescription(java.lang.String)
	 */
	@Override
	public void setDescription(String description) {
		this.description = description;
	}


}
