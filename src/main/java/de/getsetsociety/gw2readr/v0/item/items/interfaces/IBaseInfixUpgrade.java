package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import java.util.List;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.markers.IAttribute;

public interface IBaseInfixUpgrade<T extends IAttribute, U extends IBaseBuff, V extends IBaseAttributeModifier<T>> {

	public abstract List<V> getAttributes();

	public abstract void setAttributes(List<V> attributes);

	public abstract U getBuff();

	public abstract void setBuff(U buff);

}