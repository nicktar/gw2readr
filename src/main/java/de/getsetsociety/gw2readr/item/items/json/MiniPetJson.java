
package de.getsetsociety.gw2readr.item.items.json;

import de.getsetsociety.gw2readr.item.items.interfaces.IMiniPet;
import  de.getsetsociety.gw2readr.item.EntityFactoryProvider;

public class MiniPetJson extends ItemJson<IMiniPet> {

    private IMiniPet item = EntityFactoryProvider.getFactory().newMiniPet();


	@Override
	public IMiniPet getEntity() {
		return item;
	}

}
