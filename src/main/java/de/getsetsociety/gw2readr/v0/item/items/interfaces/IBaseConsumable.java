package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import de.getsetsociety.gw2readr.v0.item.items.enums.ConsumableType;
import de.getsetsociety.gw2readr.v0.item.items.enums.ConsumableUnlockType;

public interface IBaseConsumable {

	public abstract ConsumableUnlockType getUnlockType();

	public abstract void setUnlockType(ConsumableUnlockType unlockType);

	public abstract ConsumableType getConsumableType();

	public abstract void setConsumableType(ConsumableType type);

	public abstract Integer getColorId();

	public abstract void setColorId(Integer colorId);

	public abstract Integer getDurationMs();

	public abstract void setDurationMs(Integer durationMs);

	public abstract Integer getRecipeId();

	public abstract void setRecipeId(Integer recipeId);

}