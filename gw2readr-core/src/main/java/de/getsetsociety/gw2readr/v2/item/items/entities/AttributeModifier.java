package de.getsetsociety.gw2readr.v2.item.items.entities;

import de.getsetsociety.gw2readr.v0.item.items.enums.Attribute;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IAttributeModifier;
import lombok.Data;

@Data
public class AttributeModifier implements IAttributeModifier {

	private Integer id;
    private Attribute attribute;
	private Integer modifier;

	public AttributeModifier() {
		//do nothing
	}

	/**
	 * @param attribute
	 * @param modifier
	 */
	public AttributeModifier(Attribute attribute, Integer modifier) {
		this.attribute = attribute;
		this.modifier = modifier;
	}
}
