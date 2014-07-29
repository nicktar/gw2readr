package de.getsetsociety.gw2readr.general.factories;

import de.getsetsociety.gw2readr.general.factories.interfaces.IWvWEntityFactory;
import de.getsetsociety.gw2readr.v1.wvw.matches.entities.WvWMatch;
import de.getsetsociety.gw2readr.v1.wvw.matches.entities.WvWMatches;
import de.getsetsociety.gw2readr.v1.wvw.matches.interfaces.IWvWMatch;
import de.getsetsociety.gw2readr.v1.wvw.matches.interfaces.IWvWMatches;
import de.getsetsociety.gw2readr.v1.wvw.objectivenames.entities.WvWObjectiveName;
import de.getsetsociety.gw2readr.v1.wvw.objectivenames.interfaces.IWvWObjectiveName;

public class WvWEntityFactory implements IWvWEntityFactory {

	@Override
	public IWvWObjectiveName newWvWObjectiveName() {
		return new WvWObjectiveName();
	}

	@Override
	public IWvWMatches newWvWMatches() {
		return new WvWMatches();
	}
	
	@Override
	public IWvWMatch newWvWMatch() {
		return new WvWMatch();
	}
}
