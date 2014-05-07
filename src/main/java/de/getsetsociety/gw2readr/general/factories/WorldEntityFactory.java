package de.getsetsociety.gw2readr.general.factories;

import de.getsetsociety.gw2readr.general.factories.interfaces.IWorldEntityFactory;
import de.getsetsociety.gw2readr.v1.world.entities.World;
import de.getsetsociety.gw2readr.v1.world.interfaces.IWorld;

public class WorldEntityFactory implements IWorldEntityFactory {

	@Override
	public IWorld newWorld() {
		return new World();
	}

}
