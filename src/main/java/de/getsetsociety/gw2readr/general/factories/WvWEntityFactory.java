package de.getsetsociety.gw2readr.general.factories;

import de.getsetsociety.gw2readr.general.factories.interfaces.IWvWEntityFactory;
import de.getsetsociety.gw2readr.v1.wvw.objectivenames.entities.WvWObjectiveName;
import de.getsetsociety.gw2readr.v1.wvw.objectivenames.interfaces.IWvWObjectiveName;

public class WvWEntityFactory implements IWvWEntityFactory {

	@Override
	public IWvWObjectiveName newObjectiveName() {
		return new WvWObjectiveName();
	}

}
