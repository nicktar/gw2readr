package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import de.getsetsociety.gw2readr.v0.item.items.enums.Attribute;

public interface IBaseAttributeModifier {

	Integer getId();

	void setId(Integer id);

	Attribute getAttribute();

	void setAttribute(Attribute attribute);

	Integer getModifier();

	void setModifier(Integer modifier);

}