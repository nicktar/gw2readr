package  de.getsetsociety.gw2readr.v1.item;

import de.getsetsociety.gw2readr.v1.item.items.IItemEntityFactory;
import de.getsetsociety.gw2readr.v1.item.items.ItemEntityFactory;

public class EntityFactoryProvider {
	
	private static IItemEntityFactory factory = new ItemEntityFactory();

	private EntityFactoryProvider() {
		//only static 
	}
	
	public static IItemEntityFactory getFactory() {
		return factory;
	}

	public static void setFactory(IItemEntityFactory factory) {
		EntityFactoryProvider.factory = factory;
	}

	
}
