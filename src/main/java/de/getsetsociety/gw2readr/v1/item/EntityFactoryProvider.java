package  de.getsetsociety.gw2readr.v1.item;

import de.getsetsociety.gw2readr.v1.colors.ColorsEntityFactory;
import de.getsetsociety.gw2readr.v1.colors.interfaces.IColorsEntityFactory;
import de.getsetsociety.gw2readr.v1.item.items.IItemEntityFactory;
import de.getsetsociety.gw2readr.v1.item.items.ItemEntityFactory;
import de.getsetsociety.gw2readr.v1.item.recipes.IRecipeEntityFactory;
import de.getsetsociety.gw2readr.v1.item.recipes.RecipeEntityFactory;

public class EntityFactoryProvider {
	
	private static IItemEntityFactory ItemEntityFactory = new ItemEntityFactory();
	private static IRecipeEntityFactory recipeEntityFactory = new RecipeEntityFactory();
	private static IColorsEntityFactory colorsEntityFactory = new ColorsEntityFactory();

	private EntityFactoryProvider() {
		//only static 
	}
	
	/**
	 * @return the ItemEntityFactory
	 */
	public static IItemEntityFactory getItemEntityFactory() {
		return ItemEntityFactory;
	}

	/**
	 * @param factory
	 */
	public static void setItemEntityFactory(IItemEntityFactory factory) {
		EntityFactoryProvider.ItemEntityFactory = factory;
	}

	/**
	 * @return the recipeEntityFactory
	 */
	public static IRecipeEntityFactory getRecipeEntityFactory() {
		return recipeEntityFactory;
	}

	/**
	 * @param factory
	 */
	public static void setRecipeEntityFactory(IRecipeEntityFactory factory) {
		EntityFactoryProvider.recipeEntityFactory = factory;
	}

	/**
	 * @return the colorsEntityFactory
	 */
	public static IColorsEntityFactory getColorsEntityFactory() {
		return colorsEntityFactory;
	}

	/**
	 * @param colorsEntityFactory the colorsEntityFactory to set
	 */
	public static void setColorsEntityFactory(IColorsEntityFactory colorsEntityFactory) {
		EntityFactoryProvider.colorsEntityFactory = colorsEntityFactory;
	}

	
}
