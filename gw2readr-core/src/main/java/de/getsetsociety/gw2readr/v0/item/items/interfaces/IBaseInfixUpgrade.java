package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import java.util.List;

public interface IBaseInfixUpgrade<U extends IBaseBuff, V extends IBaseAttributeModifier> {

	public abstract List<V> getAttributes();

	public abstract void setAttributes(List<V> attributes);

	public abstract U getBuff();

	public abstract void setBuff(U buff);

}