package  de.getsetsociety.gw2readr.general.factories;

import de.getsetsociety.gw2readr.general.factories.interfaces.IColorsEntityFactory;
import de.getsetsociety.gw2readr.general.factories.interfaces.IFileInfoEntityFactory;
import de.getsetsociety.gw2readr.general.factories.interfaces.IGuildDetailsFactory;
import de.getsetsociety.gw2readr.general.factories.interfaces.IItemEntityFactory;
import de.getsetsociety.gw2readr.general.factories.interfaces.IRecipeEntityFactory;
import de.getsetsociety.gw2readr.general.factories.interfaces.IWorldEntityFactory;

public class EntityFactoryProvider {
	
	private static IItemEntityFactory ItemEntityFactory = new ItemEntityFactory();
	private static IRecipeEntityFactory recipeEntityFactory = new RecipeEntityFactory();
	private static IColorsEntityFactory colorsEntityFactory = new ColorsEntityFactory();
	private static IFileInfoEntityFactory fileInfoEntityFactory = new FileInfoEntityFactory();
	private static IGuildDetailsFactory guildDetailsFactory = new GuildDetailsFactory();
	private static IWorldEntityFactory worldEntityFactory = new WorldEntityFactory();

	private EntityFactoryProvider() {
		//only static 
	}
	
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

	/**
	 * @return the guildDetailsFactory
	 */
	public static IGuildDetailsFactory getGuildDetailsFactory() {
		return guildDetailsFactory;
	}

	/**
	 * @param guildDetailsFactory the guildDetailsFactory to set
	 */
	public static void setGuildDetailsFactory(IGuildDetailsFactory guildDetailsFactory) {
		EntityFactoryProvider.guildDetailsFactory = guildDetailsFactory;
	}

	public static IWorldEntityFactory getWorldEntityFactory() {
		return worldEntityFactory;
	}

	public static void setWorldEntityFactory(IWorldEntityFactory worldEntityFactory) {
		EntityFactoryProvider.worldEntityFactory = worldEntityFactory;
	}

	
}
