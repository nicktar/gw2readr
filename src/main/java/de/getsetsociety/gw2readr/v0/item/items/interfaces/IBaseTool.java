package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import de.getsetsociety.gw2readr.v0.item.items.enums.ToolType;

public interface IBaseTool {

	public abstract ToolType getToolType();

	public abstract void setToolType(ToolType toolType);

	public abstract Integer getCharges();

	public abstract void setCharges(Integer charges);

}