package  de.getsetsociety.gw2readr.v2.factories;

import de.getsetsociety.gw2readr.v1.factories.interfaces.IColorsEntityFactory;
import de.getsetsociety.gw2readr.v1.factories.interfaces.IContinentEntityFactory;
import de.getsetsociety.gw2readr.v1.factories.interfaces.IFileInfoEntityFactory;
import de.getsetsociety.gw2readr.v1.factories.interfaces.IGuildDetailsFactory;
import de.getsetsociety.gw2readr.v2.factories.interfaces.IItemEntityFactory;
import de.getsetsociety.gw2readr.v1.factories.interfaces.IRecipeEntityFactory;
import de.getsetsociety.gw2readr.v1.factories.interfaces.IWorldEntityFactory;
import de.getsetsociety.gw2readr.v1.factories.interfaces.IWvWEntityFactory;

public class EntityFactoryProvider {
	
	private static IItemEntityFactory ItemEntityFactory = new ItemEntityFactory();
//	private static IRecipeEntityFactory recipeEntityFactory = new RecipeEntityFactory();
//	private static IColorsEntityFactory colorsEntityFactory = new ColorsEntityFactory();
//	private static IFileInfoEntityFactory fileInfoEntityFactory = new FileInfoEntityFactory();
//	private static IGuildDetailsFactory guildDetailsFactory = new GuildDetailsFactory();
//	private static IWorldEntityFactory worldEntityFactory = new WorldEntityFactory();
//	private static IContinentEntityFactory continentEntityFactory = new ContinentEntityFactory();
//	private static IWvWEntityFactory wvwEntityFactory = new WvWEntityFactory();

	private EntityFactoryProvider() {
		//only static 
	}
	
	/**
	 * @return the fileInfoEntityFactory
	 */
//	public static IFileInfoEntityFactory getFileInfoEntityFactory() {
//		return fileInfoEntityFactory;
//	}

	/**
	 * @param fileInfoEntityFactory the fileInfoEntityFactory to set
	 */
//	public static void setFileInfoEntityFactory(IFileInfoEntityFactory fileInfoEntityFactory) {
//		EntityFactoryProvider.fileInfoEntityFactory = fileInfoEntityFactory;
//	}

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
//	public static IRecipeEntityFactory getRecipeEntityFactory() {
//		return recipeEntityFactory;
//	}

	/**
	 * @param factory
	 */
//	public static void setRecipeEntityFactory(IRecipeEntityFactory factory) {
//		EntityFactoryProvider.recipeEntityFactory = factory;
//	}

	/**
	 * @return the colorsEntityFactory
	 */
//	public static IColorsEntityFactory getColorsEntityFactory() {
//		return colorsEntityFactory;
//	}

	/**
	 * @param colorsEntityFactory the colorsEntityFactory to set
	 */
//	public static void setColorsEntityFactory(IColorsEntityFactory colorsEntityFactory) {
//		EntityFactoryProvider.colorsEntityFactory = colorsEntityFactory;
//	}

	/**
	 * @return the guildDetailsFactory
	 */
//	public static IGuildDetailsFactory getGuildDetailsFactory() {
//		return guildDetailsFactory;
//	}

	/**
	 * @param guildDetailsFactory the guildDetailsFactory to set
	 */
//	public static void setGuildDetailsFactory(IGuildDetailsFactory guildDetailsFactory) {
//		EntityFactoryProvider.guildDetailsFactory = guildDetailsFactory;
//	}

	/**
	 * @return the worldEntityFactory
	 */
//	public static IWorldEntityFactory getWorldEntityFactory() {
//		return worldEntityFactory;
//	}

	/**
	 * @param worldEntityFactory the worldEntityFactory to set
	 */
//	public static void setWorldEntityFactory(IWorldEntityFactory worldEntityFactory) {
//		EntityFactoryProvider.worldEntityFactory = worldEntityFactory;
//	}

	/**
	 * @return the continentEntityFactory
	 */
//	public static IContinentEntityFactory getContinentEntityFactory() {
//		return continentEntityFactory;
//	}

	/**
	 * @param continentEntityFactory the continentEntityFactory to set
	 */
//	public static void setContinentEntityFactory(IContinentEntityFactory continentEntityFactory) {
//		EntityFactoryProvider.continentEntityFactory = continentEntityFactory;
//	}

//	public static IWvWEntityFactory getWvWEntityFactory() {
//		return wvwEntityFactory;
//	}

//	public static void setWvWEntityFactory(IWvWEntityFactory wvWEntityFactory) {
//		EntityFactoryProvider.wvwEntityFactory = wvWEntityFactory;
//	}

	
}
