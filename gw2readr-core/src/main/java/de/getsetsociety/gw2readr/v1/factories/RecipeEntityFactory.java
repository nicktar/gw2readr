package de.getsetsociety.gw2readr.v1.factories;

import de.getsetsociety.gw2readr.v1.factories.interfaces.IRecipeEntityFactory;
import de.getsetsociety.gw2readr.v1.item.recipes.entities.Ingredient;
import de.getsetsociety.gw2readr.v1.item.recipes.entities.Recipe;
import de.getsetsociety.gw2readr.v1.item.recipes.interfaces.IIngredient;
import de.getsetsociety.gw2readr.v1.item.recipes.interfaces.IRecipe;

public class RecipeEntityFactory implements IRecipeEntityFactory {

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.item.recipes.IRecipeEntityFactory#newRecipe()
	 */
	@Override
	public IRecipe newRecipe() {
		return new Recipe();
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.item.recipes.IRecipeEntityFactory#newIngredient()
	 */
	@Override
	public IIngredient newIngredient() {
		return new Ingredient();
	}

}