package de.getsetsociety.gw2readr.v1.item.items.entities;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IAttributeModifier;
import de.getsetsociety.gw2readr.v1.item.items.enums.Attribute;

public class AttributeModifier implements IAttributeModifier<Attribute> {

	private Attribute attribute;
	private Integer modifier;

	@Override
	public Attribute getAttribute() {
		return this.attribute;
	}

	@Override
	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}

	@Override
	public Integer getModifier() {
		return this.modifier;
	}

	@Override
	public void setModifier(Integer modifier) {
		this.modifier = modifier;
	}
}
