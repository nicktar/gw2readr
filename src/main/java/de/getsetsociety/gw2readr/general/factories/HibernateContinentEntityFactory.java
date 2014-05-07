package de.getsetsociety.gw2readr.general.factories;

import de.getsetsociety.gw2readr.general.factories.interfaces.IContinentEntityFactory;
import de.getsetsociety.gw2readr.v1.map.continents.entities.Continent;
import de.getsetsociety.gw2readr.v1.map.continents.interfaces.IContinent;

public class HibernateContinentEntityFactory implements IContinentEntityFactory {
	
	public IContinent newContinent() {
		return new Continent();
	}

}
