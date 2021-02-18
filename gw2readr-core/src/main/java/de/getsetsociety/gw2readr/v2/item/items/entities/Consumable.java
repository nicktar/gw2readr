package de.getsetsociety.gw2readr.v2.item.items.entities;


import java.util.Set;

import de.getsetsociety.gw2readr.v0.item.items.enums.ConsumableType;
import de.getsetsociety.gw2readr.v0.item.items.enums.ConsumableUnlockType;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IConsumable;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Consumable extends Item implements IConsumable {

    private ConsumableType consumableType;
    private ConsumableUnlockType unlockType;
    private Integer colorId;
    private Integer durationMs;
    private String description;
    private Integer recipeId;
    private Integer guildUpgradeId;
    private Integer applyCount;
    private String consumableName;
    private String icon;
    private Set<Integer> extraRecipeIds;
}
