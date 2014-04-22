
package de.getsetsociety.gw2readr.v1.item.items.json;

import de.getsetsociety.gw2readr.v1.item.items.interfaces.ICraftingMaterial;
import de.getsetsociety.gw2readr.v1.item.EntityFactoryProvider;

public class CraftingMaterialJson extends ItemJson<ICraftingMaterial> {

    private ICraftingMaterial item = EntityFactoryProvider.getFactory().newCraftingMaterial();

	@Override
	public ICraftingMaterial getEntity() {
		return item;
	}

}
