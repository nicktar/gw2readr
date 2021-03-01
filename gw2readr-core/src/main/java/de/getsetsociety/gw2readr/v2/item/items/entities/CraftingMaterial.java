package de.getsetsociety.gw2readr.v2.item.items.entities;

import de.getsetsociety.gw2readr.v2.item.items.interfaces.ICraftingMaterial;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = true)
public class CraftingMaterial extends Item implements ICraftingMaterial {

    private String description;
}
