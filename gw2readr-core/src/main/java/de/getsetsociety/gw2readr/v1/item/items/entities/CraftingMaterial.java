package de.getsetsociety.gw2readr.v1.item.items.entities;

import de.getsetsociety.gw2readr.v1.item.items.interfaces.ICraftingMaterial;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class CraftingMaterial extends Item implements ICraftingMaterial {

    private String description;

}
