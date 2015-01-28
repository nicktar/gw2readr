package de.getsetsociety.gw2readr.v1.item.items.hibernateentities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import de.getsetsociety.gw2readr.v0.item.items.enums.ToolType;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.ITool;

@Entity
@Table
@PrimaryKeyJoinColumn(name="ItemId")
public class Tool extends Item implements ITool {

	private static final long serialVersionUID = -8889693962046740421L;
	private ToolType toolType;
	private Integer charges;

	@Column
	@Enumerated(EnumType.ORDINAL)
	public ToolType getToolType() {
		return toolType;
	}

	public void setToolType(ToolType toolType) {
		this.toolType = toolType;
	}

	@Column
	public Integer getCharges() {
		return charges;
	}

	public void setCharges(Integer charges) {
		this.charges = charges;
	}
}
