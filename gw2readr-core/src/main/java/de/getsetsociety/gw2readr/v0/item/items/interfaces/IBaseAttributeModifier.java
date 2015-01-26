package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import de.getsetsociety.gw2readr.v0.item.items.enums.Attribute;

public interface IBaseAttributeModifier {

	public Attribute getAttribute();

	public void setAttribute(Attribute attribute);

	public Integer getModifier();

	public void setModifier(Integer modifier);

}