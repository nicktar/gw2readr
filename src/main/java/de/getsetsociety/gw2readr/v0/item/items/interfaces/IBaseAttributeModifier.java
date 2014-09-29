package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.markers.IAttribute;


public interface IBaseAttributeModifier<T extends IAttribute> {

	public T getAttribute();

	public void setAttribute(T attribute);

	public Integer getModifier();

	public void setModifier(Integer modifier);

}