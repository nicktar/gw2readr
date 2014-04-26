package  de.getsetsociety.gw2readr.v1.item;

import de.getsetsociety.gw2readr.v1.item.items.IItemEntityFactory;
import de.getsetsociety.gw2readr.v1.item.items.ItemEntityFactory;
import de.getsetsociety.gw2readr.v1.item.recipes.IRecipeEntityFactory;
import de.getsetsociety.gw2readr.v1.item.recipes.RecipeEntityFactory;

public class EntityFactoryProvider {
	
	private static IItemEntityFactory ItemEntityFactory = new ItemEntityFactory();
	private static IRecipeEntityFactory recipeEntityFactory = new RecipeEntityFactory();

	private EntityFactoryProvider() {
		//only static 
	}
	
	public static IItemEntityFactory getItemEntityFactory() {
		return ItemEntityFactory;
	}

	public static void setItemEntityFactory(IItemEntityFactory factory) {
		EntityFactoryProvider.ItemEntityFactory = factory;
	}

	public static IRecipeEntityFactory getRecipeEntityFactory() {
		return recipeEntityFactory;
	}

	public static void setRecipeEntityFactory(IRecipeEntityFactory factory) {
		EntityFactoryProvider.recipeEntityFactory = factory;
	}

	
}
