package de.getsetsociety.gw2readr.v1.factories;

import de.getsetsociety.gw2readr.v1.factories.interfaces.IWorldEntityFactory;
import de.getsetsociety.gw2readr.v1.world.hibernateentities.World;
import de.getsetsociety.gw2readr.v1.world.interfaces.IWorld;

public class HibernateWorldEntityFactory implements IWorldEntityFactory {

	@Override
	public IWorld newWorld() {
		return new World();
	}

}
