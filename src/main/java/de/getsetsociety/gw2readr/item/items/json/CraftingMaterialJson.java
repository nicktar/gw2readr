
package de.getsetsociety.gw2readr.item.items.json;

import de.getsetsociety.gw2readr.item.items.interfaces.ICraftingMaterial;
import  de.getsetsociety.gw2readr.item.EntityFactoryProvider;

public class CraftingMaterialJson extends ItemJson<ICraftingMaterial> {

    private ICraftingMaterial item = EntityFactoryProvider.getFactory().newCraftingMaterial();

	@Override
	public ICraftingMaterial getEntity() {
		return item;
	}

}
