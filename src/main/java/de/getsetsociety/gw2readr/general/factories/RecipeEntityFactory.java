package de.getsetsociety.gw2readr.general.factories;

import de.getsetsociety.gw2readr.general.factories.interfaces.IRecipeEntityFactory;
import de.getsetsociety.gw2readr.v1.item.recipes.hibernateentities.Ingredient;
import de.getsetsociety.gw2readr.v1.item.recipes.hibernateentities.Recipe;
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
