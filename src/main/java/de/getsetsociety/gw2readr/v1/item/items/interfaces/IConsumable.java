package de.getsetsociety.gw2readr.v1.item.items.interfaces;

import de.getsetsociety.gw2readr.v1.item.items.enums.ConsumableType;
import de.getsetsociety.gw2readr.v1.item.items.enums.ConsumableUnlockType;

public interface IConsumable extends IBaseItem {

	public abstract ConsumableUnlockType getUnlockType();

	public abstract void setUnlockType(ConsumableUnlockType unlockType);

	public abstract ConsumableType getConsumableType();

	public abstract void setConsumableType(ConsumableType type);

	public abstract Integer getColorId();

	public abstract void setColorId(Integer colorId);

	public abstract Integer getDurationMs();

	public abstract void setDurationMs(Integer durationMs);

	public abstract String getDescription();

	public abstract void setDescription(String description);

	public abstract Integer getRecipeId();

	public abstract void setRecipeId(Integer recipeId);

}