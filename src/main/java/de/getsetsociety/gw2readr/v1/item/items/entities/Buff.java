package de.getsetsociety.gw2readr.v1.item.items.entities;

import de.getsetsociety.gw2readr.v1.item.items.interfaces.IBuff;


public class Buff implements IBuff {

	private Integer skillId;
	private String description;

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBuff#getSkillId()
	 */
	@Override
	public Integer getSkillId() {
		return skillId;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBuff#setSkillId(java.lang.Integer)
	 */
	@Override
	public void setSkillId(Integer skillId) {
		this.skillId = skillId;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBuff#getDescription()
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBuff#setDescription(java.lang.String)
	 */
	@Override
	public void setDescription(String description) {
		this.description = description;
	}

}
