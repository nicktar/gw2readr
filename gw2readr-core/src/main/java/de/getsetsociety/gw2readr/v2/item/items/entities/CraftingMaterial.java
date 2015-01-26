package de.getsetsociety.gw2readr.v2.item.items.entities;

import de.getsetsociety.gw2readr.v2.item.items.interfaces.ICraftingMaterial;

public class CraftingMaterial extends Item implements ICraftingMaterial {

    private static final long serialVersionUID = -3053009181561706950L;
    private String description;

    /*
     * (non-Javadoc)
     * @see de.getsetsociety.gw2readr.entities.ICraftingMaterial#getDescription()
     */
    @Override
    public String getDescription() {
        return description;
    }

    /*
     * (non-Javadoc)
     * @see de.getsetsociety.gw2readr.entities.ICraftingMaterial#setDescription(java.lang.String)
     */
    @Override
    public void setDescription(String description) {
        this.description = description;
    }

}
