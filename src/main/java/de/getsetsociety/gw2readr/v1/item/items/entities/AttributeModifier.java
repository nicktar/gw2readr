package de.getsetsociety.gw2readr.v1.item.items.entities;

import de.getsetsociety.gw2readr.v1.item.items.enums.Attribute;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IAttributeModifier;

public class AttributeModifier implements IAttributeModifier {

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
