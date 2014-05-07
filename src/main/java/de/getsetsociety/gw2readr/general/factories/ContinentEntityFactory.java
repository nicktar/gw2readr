package de.getsetsociety.gw2readr.general.factories;

import de.getsetsociety.gw2readr.general.factories.interfaces.IContinentEntityFactory;
import de.getsetsociety.gw2readr.v1.map.continents.hibernateentities.Continent;
import de.getsetsociety.gw2readr.v1.map.continents.interfaces.IContinent;

public class ContinentEntityFactory implements IContinentEntityFactory {
	
	public IContinent newContinent() {
		return new Continent();
	}

}
