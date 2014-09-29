package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.markers.IToolType;

public interface IBaseTool<T extends IToolType> {

	public abstract T getToolType();

	public abstract void setToolType(T toolType);

	public abstract Integer getCharges();

	public abstract void setCharges(Integer charges);

}