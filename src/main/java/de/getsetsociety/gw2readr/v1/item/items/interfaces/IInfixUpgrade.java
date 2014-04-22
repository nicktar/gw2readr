package de.getsetsociety.gw2readr.v1.item.items.interfaces;

import java.util.List;

public interface IInfixUpgrade {

	public abstract List<IAttributeModifier> getAttributes();

	public abstract void setAttributes(List<IAttributeModifier> attributes);

	public abstract IBuff getBuff();

	public abstract void setBuff(IBuff buff);

}