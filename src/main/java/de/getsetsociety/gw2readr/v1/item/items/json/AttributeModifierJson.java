package de.getsetsociety.gw2readr.v1.item.items.json;


import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v1.item.items.enums.Attribute;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IAttributeModifier;
import de.getsetsociety.gw2readr.v1.item.EntityFactoryProvider;

public class AttributeModifierJson implements IEntityWrapper<IAttributeModifier>{

	private final IAttributeModifier entity;
	
	public AttributeModifierJson() {
		entity = EntityFactoryProvider.getFactory().newAttributeModifier();
	}
	
	public AttributeModifierJson(IAttributeModifier am) {
		entity = am;
	}

	@JsonProperty("attribute")
	public Attribute getAttribute() {
		return entity.getAttribute();
	}

	@JsonProperty("attribute")
	public void setAttribute(String attribute) {
		entity.setAttribute(Attribute.valueOf(attribute));
	}

	@JsonProperty("modifier")
	public Integer getModifier() {
		return entity.getModifier();
	}

	public void setModifier(Integer modifier) {
		entity.setModifier(modifier);
	}
	
	public IAttributeModifier getEntity() {
		return entity;
	}
}