package de.getsetsociety.gw2readr.v1.item.recipes;

import de.getsetsociety.gw2readr.v1.item.recipes.interfaces.IIngredient;
import de.getsetsociety.gw2readr.v1.item.recipes.interfaces.IRecipe;

public interface IRecipeEntityFactory {

	public abstract IRecipe newRecipe();

	public abstract IIngredient newIngredient();

}