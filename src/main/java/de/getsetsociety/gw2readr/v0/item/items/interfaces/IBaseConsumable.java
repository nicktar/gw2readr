package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.markers.IConsumableUnlockType;
import de.getsetsociety.gw2readr.v2.item.items.enums.IConsumableType;

public interface IBaseConsumable<T extends IConsumableUnlockType, V extends IConsumableType> {

	public abstract T getUnlockType();

	public abstract void setUnlockType(T unlockType);

	public abstract V getConsumableType();

	public abstract void setConsumableType(V type);

	public abstract Integer getColorId();

	public abstract void setColorId(Integer colorId);

	public abstract Integer getDurationMs();

	public abstract void setDurationMs(Integer durationMs);

	public abstract String getDescription();

	public abstract void setDescription(String description);

	public abstract Integer getRecipeId();

	public abstract void setRecipeId(Integer recipeId);

}