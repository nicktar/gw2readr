package de.getsetsociety.gw2readr.v1.item.items.json;


import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseAttributeModifier;
import de.getsetsociety.gw2readr.v1.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v1.item.items.enums.Attribute;

public class AttributeModifierJson implements IEntityWrapper<IBaseAttributeModifier<Attribute>>{

	private final IBaseAttributeModifier<Attribute> entity;

	public AttributeModifierJson() {
		entity = EntityFactoryProvider.getItemEntityFactory().newAttributeModifier();
	}

	public AttributeModifierJson(IBaseAttributeModifier<Attribute> am) {
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

	@Override
	public IBaseAttributeModifier<Attribute> getEntity() {
		return entity;
	}
}
