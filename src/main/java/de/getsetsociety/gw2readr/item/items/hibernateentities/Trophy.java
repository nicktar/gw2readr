package de.getsetsociety.gw2readr.item.items.hibernateentities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import de.getsetsociety.gw2readr.item.items.interfaces.ITrophy;

@Entity
@Table
@PrimaryKeyJoinColumn(name="TrophyId")
public class Trophy extends Item implements ITrophy {

	private static final long serialVersionUID = -3053009181561706950L;
	private String description;

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.ITrophy#getDescription()
	 */
	@Override
	@Column
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
