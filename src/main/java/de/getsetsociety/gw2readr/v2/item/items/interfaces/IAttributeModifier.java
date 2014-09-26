package de.getsetsociety.gw2readr.v2.item.items.interfaces;

import de.getsetsociety.gw2readr.v2.item.items.enums.Attribute;

public interface IAttributeModifier {

	public Attribute getAttribute();

	public void setAttribute(Attribute attribute);

	public Integer getModifier();

	public void setModifier(Integer modifier);

}