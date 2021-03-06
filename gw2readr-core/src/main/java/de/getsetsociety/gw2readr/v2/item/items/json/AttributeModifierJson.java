package de.getsetsociety.gw2readr.v2.item.items.json;


import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v0.item.items.enums.Attribute;
import de.getsetsociety.gw2readr.v2.item.items.entities.AttributeModifier;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IAttributeModifier;

public class AttributeModifierJson implements IEntityWrapper<IAttributeModifier> {

    private final IAttributeModifier entity;

    public AttributeModifierJson() {
        entity = new AttributeModifier();
    }

    public AttributeModifierJson(IAttributeModifier am) {
        entity = am;
    }

    @JsonProperty("id")
    public Integer getId() {
        return entity.getId();
    }

    public void setId(Integer id) {
        entity.setId(id);
    }

    @JsonProperty("attribute")
    public Attribute getAttribute() {
        return entity.getAttribute();
    }

    @JsonProperty("attribute")
    public void setAttribute(Attribute attribute) {
        entity.setAttribute(attribute);
    }

    @JsonProperty("modifier")
    public Integer getModifier() {
        return entity.getModifier();
    }

    public void setModifier(Integer modifier) {
        entity.setModifier(modifier);
    }

    @Override
    public IAttributeModifier getEntity() {
        return entity;
    }
}
