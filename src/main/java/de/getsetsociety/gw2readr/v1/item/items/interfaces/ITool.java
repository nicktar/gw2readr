package de.getsetsociety.gw2readr.v1.item.items.interfaces;

import de.getsetsociety.gw2readr.v1.item.items.enums.ToolType;

public interface ITool extends IBaseItem {

	public ToolType getToolType();

	public void setToolType(ToolType toolType);
	
	public Integer getCharges();
	
	public void setCharges(Integer charges);
}
