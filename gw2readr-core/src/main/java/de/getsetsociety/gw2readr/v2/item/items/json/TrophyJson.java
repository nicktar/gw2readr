package de.getsetsociety.gw2readr.v2.item.items.json;

import de.getsetsociety.gw2readr.v2.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.ITrophy;

public class TrophyJson extends ItemJson<ITrophy> {

    private final ITrophy item = EntityFactoryProvider.getItemEntityFactory().newTrophy();

    @Override
    public ITrophy getEntity() {
        return item;
    }

}
