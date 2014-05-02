package  de.getsetsociety.gw2readr.v1.item;

import de.getsetsociety.gw2readr.general.factories.ColorsEntityFactory;
import de.getsetsociety.gw2readr.general.factories.FileInfoEntityFactory;
import de.getsetsociety.gw2readr.general.factories.ItemEntityFactory;
import de.getsetsociety.gw2readr.general.factories.RecipeEntityFactory;
import de.getsetsociety.gw2readr.general.factories.interfaces.IColorsEntityFactory;
import de.getsetsociety.gw2readr.general.factories.interfaces.IFileInfoEntityFactory;
import de.getsetsociety.gw2readr.general.factories.interfaces.IItemEntityFactory;
import de.getsetsociety.gw2readr.general.factories.interfaces.IRecipeEntityFactory;

public class EntityFactoryProvider {
	
	private static IItemEntityFactory ItemEntityFactory = new ItemEntityFactory();
	private static IRecipeEntityFactory recipeEntityFactory = new RecipeEntityFactory();
	private static IColorsEntityFactory colorsEntityFactory = new ColorsEntityFactory();
	private static IFileInfoEntityFactory fileInfoEntityFactory = new FileInfoEntityFactory();

	/**
	 * @return the fileInfoEntityFactory
	 */
	public static IFileInfoEntityFactory getFileInfoEntityFactory() {
		return fileInfoEntityFactory;
	}

	/**
	 * @param fileInfoEntityFactory the fileInfoEntityFactory to set
	 */
	public static void setFileInfoEntityFactory(IFileInfoEntityFactory fileInfoEntityFactory) {
		EntityFactoryProvider.fileInfoEntityFactory = fileInfoEntityFactory;
	}

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
