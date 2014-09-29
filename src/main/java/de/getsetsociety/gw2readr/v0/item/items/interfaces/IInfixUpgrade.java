package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import java.util.List;

public interface IInfixUpgrade<T extends IAttribute> {

	public abstract List<IAttributeModifier<T>> getAttributes();

	public abstract void setAttributes(List<IAttributeModifier<T>> attributes);

	public abstract IBuff getBuff();

	public abstract void setBuff(IBuff buff);

}