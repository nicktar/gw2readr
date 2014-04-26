
package de.getsetsociety.gw2readr.v1.item.items.json;

import de.getsetsociety.gw2readr.v1.item.items.interfaces.IMiniPet;
import de.getsetsociety.gw2readr.v1.item.EntityFactoryProvider;

public class MiniPetJson extends ItemJson<IMiniPet> {

    private IMiniPet item = EntityFactoryProvider.getItemEntityFactory().newMiniPet();


	@Override
	public IMiniPet getEntity() {
		return item;
	}

}
