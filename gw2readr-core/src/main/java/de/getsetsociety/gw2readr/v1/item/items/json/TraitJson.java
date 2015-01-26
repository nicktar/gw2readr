package de.getsetsociety.gw2readr.v1.item.items.json;

import de.getsetsociety.gw2readr.v1.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.ITrait;

public class TraitJson extends ItemJson<ITrait> {

    private ITrait item = EntityFactoryProvider.getItemEntityFactory().newTrait();

    @Override
    public ITrait getEntity() {
        return item;
    }

}