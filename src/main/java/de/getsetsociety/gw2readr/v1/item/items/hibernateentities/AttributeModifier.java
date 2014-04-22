package de.getsetsociety.gw2readr.v1.item.items.hibernateentities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import de.getsetsociety.gw2readr.v1.item.items.enums.Attribute;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IAttributeModifier;

@Table
@Entity
public class AttributeModifier implements IAttributeModifier {

	private Integer id;
	private Attribute attribute;
	private Integer modifier;

	@Id
	@Column
	@GeneratedValue
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column
	@Enumerated(EnumType.ORDINAL)
	public Attribute getAttribute() {
		return this.attribute;
	}

	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}

	@Column
	public Integer getModifier() {
		return this.modifier;
	}

	public void setModifier(Integer modifier) {
		this.modifier = modifier;
	}
}
