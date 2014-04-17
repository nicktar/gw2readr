
package de.getsetsociety.gw2readr.item.items.json;

import de.getsetsociety.gw2readr.item.items.interfaces.ITrophy;
import  de.getsetsociety.gw2readr.item.EntityFactoryProvider;

public class TrophyJson extends ItemJson<ITrophy> {

    private ITrophy item = EntityFactoryProvider.getFactory().newTrophy();


	@Override
	public ITrophy getEntity() {
		return item;
	}

}
