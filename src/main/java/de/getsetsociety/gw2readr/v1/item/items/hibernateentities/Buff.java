package de.getsetsociety.gw2readr.v1.item.items.hibernateentities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBuff;

@Entity
@Table
public class Buff implements IBuff {

	private Integer id;
	private Integer skillId;
	private String description;

	@Id
	@Column
	@GeneratedValue
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBuff#getSkillId()
	 */
	@Override
	@Column
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
	@Column
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
