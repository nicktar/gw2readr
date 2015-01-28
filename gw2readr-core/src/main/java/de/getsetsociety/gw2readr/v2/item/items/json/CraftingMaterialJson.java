package de.getsetsociety.gw2readr.v2.item.items.json;

import de.getsetsociety.gw2readr.v2.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.ICraftingMaterial;

public class CraftingMaterialJson extends ItemJson<ICraftingMaterial> {

    private ICraftingMaterial item = EntityFactoryProvider.getItemEntityFactory().newCraftingMaterial();

    @Override
    public ICraftingMaterial getEntity() {
        return item;
    }

}
