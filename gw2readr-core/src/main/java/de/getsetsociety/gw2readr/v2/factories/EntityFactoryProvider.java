package  de.getsetsociety.gw2readr.v2.factories;

import de.getsetsociety.gw2readr.v2.account.AccountEntityFactory;
import de.getsetsociety.gw2readr.v2.account.interfaces.IAccountEntityFactory;
import de.getsetsociety.gw2readr.v2.factories.interfaces.ICommerceEntityFactory;
import de.getsetsociety.gw2readr.v2.factories.interfaces.IItemEntityFactory;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EntityFactoryProvider {

    private static IItemEntityFactory itemEntityFactory = new ItemEntityFactory();
    private static ICommerceEntityFactory commerceEntityFactory = new CommerceEntityFactory();
    private static final IAccountEntityFactory accountEntityFactory = new AccountEntityFactory();
    //	private static IRecipeEntityFactory recipeEntityFactory = new RecipeEntityFactory();
    //	private static IColorsEntityFactory colorsEntityFactory = new ColorsEntityFactory();
    //	private static IFileInfoEntityFactory fileInfoEntityFactory = new FileInfoEntityFactory();
    //	private static IGuildDetailsFactory guildDetailsFactory = new GuildDetailsFactory();
    //	private static IWorldEntityFactory worldEntityFactory = new WorldEntityFactory();
    //	private static IContinentEntityFactory continentEntityFactory = new ContinentEntityFactory();
    //	private static IWvWEntityFactory wvwEntityFactory = new WvWEntityFactory();


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
        return itemEntityFactory;
    }

    /**
     * @param factory
     */
    public static void setItemEntityFactory(IItemEntityFactory factory) {
        EntityFactoryProvider.itemEntityFactory = factory;
    }

    /**
     * @return the CommerceEntityFactory
     */
    public static ICommerceEntityFactory getCommerceEntityFactory() {
        return commerceEntityFactory;
    }

    /**
     * @param factory
     */
    public static void setCommerceEntityFactory(ICommerceEntityFactory factory) {
        EntityFactoryProvider.commerceEntityFactory = factory;
    }

    public static IAccountEntityFactory getAccountFactory() {
        return accountEntityFactory;
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
