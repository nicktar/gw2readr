package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import java.util.List;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.markers.IAttribute;

public interface IBaseInfixUpgrade<T extends IAttribute> {

	public abstract List<IBaseAttributeModifier<T>> getAttributes();

	public abstract void setAttributes(List<IBaseAttributeModifier<T>> attributes);

	public abstract IBaseBuff getBuff();

	public abstract void setBuff(IBaseBuff buff);

}