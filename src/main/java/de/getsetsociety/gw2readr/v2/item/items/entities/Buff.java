package de.getsetsociety.gw2readr.v2.item.items.entities;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseBuff;


public class Buff implements IBaseBuff {

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
