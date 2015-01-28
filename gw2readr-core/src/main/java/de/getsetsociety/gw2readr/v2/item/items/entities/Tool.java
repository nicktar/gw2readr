package de.getsetsociety.gw2readr.v2.item.items.entities;

import de.getsetsociety.gw2readr.v0.item.items.enums.ToolType;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.ITool;

public class Tool extends Item implements ITool {

    private static final long serialVersionUID = -8889693962046740421L;
    private ToolType toolType;
    private Integer charges;

    public ToolType getToolType() {
        return toolType;
    }

    public void setToolType(ToolType toolType) {
        this.toolType = toolType;
    }

    public Integer getCharges() {
        return charges;
    }

    public void setCharges(Integer charges) {
        this.charges = charges;
    }
}
