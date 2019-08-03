package de.getsetsociety.gw2readr.v2.item.items.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import de.getsetsociety.gw2readr.v0.item.items.enums.ConsumableType;
import de.getsetsociety.gw2readr.v0.item.items.enums.ConsumableUnlockType;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IConsumable;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class Consumable extends Item implements IConsumable {

	private static final long serialVersionUID = 3862166075196472425L;
	private ConsumableType consumableType;
	private ConsumableUnlockType unlockType;
	private Integer colorId;
	private Integer durationMs;
	private String description;
	private Integer recipeId;
    private Integer guildUpgradeId;
}
