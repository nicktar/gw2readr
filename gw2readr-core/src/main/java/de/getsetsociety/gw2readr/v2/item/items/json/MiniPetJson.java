package de.getsetsociety.gw2readr.v2.item.items.json;

import de.getsetsociety.gw2readr.v2.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IMiniPet;

public class MiniPetJson extends ItemJson<IMiniPet> {

    private IMiniPet item = EntityFactoryProvider.getItemEntityFactory().newMiniPet();

    @Override
    public IMiniPet getEntity() {
        return item;
    }

}
