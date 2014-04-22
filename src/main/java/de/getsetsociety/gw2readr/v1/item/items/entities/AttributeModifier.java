package de.getsetsociety.gw2readr.v1.item.items.entities;

import de.getsetsociety.gw2readr.v1.item.items.enums.Attribute;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IAttributeModifier;

public class AttributeModifier implements IAttributeModifier {

	private Attribute attribute;
	private Integer modifier;

	public Attribute getAttribute() {
		return this.attribute;
	}

	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}

	public Integer getModifier() {
		return this.modifier;
	}

	public void setModifier(Integer modifier) {
		this.modifier = modifier;
	}
}
