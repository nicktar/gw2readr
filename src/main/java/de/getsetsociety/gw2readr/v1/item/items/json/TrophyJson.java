
package de.getsetsociety.gw2readr.v1.item.items.json;

import de.getsetsociety.gw2readr.general.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.ITrophy;

public class TrophyJson extends ItemJson<ITrophy> {

    private ITrophy item = EntityFactoryProvider.getItemEntityFactory().newTrophy();


	@Override
	public ITrophy getEntity() {
		return item;
	}

}
