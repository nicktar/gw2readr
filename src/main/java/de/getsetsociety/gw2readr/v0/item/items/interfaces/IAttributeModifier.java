package de.getsetsociety.gw2readr.v0.item.items.interfaces;


public interface IAttributeModifier<T extends IAttribute> {

	public T getAttribute();

	public void setAttribute(T attribute);

	public Integer getModifier();

	public void setModifier(Integer modifier);

}