package de.getsetsociety.gw2readr.v1.factories;

import de.getsetsociety.gw2readr.v1.factories.interfaces.IContinentEntityFactory;
import de.getsetsociety.gw2readr.v1.map.continents.entities.Continent;
import de.getsetsociety.gw2readr.v1.map.continents.interfaces.IContinent;

public class ContinentEntityFactory implements IContinentEntityFactory {

	@Override
	public IContinent newContinent() {
		return new Continent();
	}

}
