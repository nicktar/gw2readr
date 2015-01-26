package de.getsetsociety.gw2readr.v1.factories.interfaces;

import de.getsetsociety.gw2readr.v1.wvw.matches.interfaces.IWvWMatch;
import de.getsetsociety.gw2readr.v1.wvw.matches.interfaces.IWvWMatches;
import de.getsetsociety.gw2readr.v1.wvw.objectivenames.interfaces.IWvWObjectiveName;

public interface IWvWEntityFactory {

	public IWvWObjectiveName newWvWObjectiveName();

	public abstract IWvWMatch newWvWMatch();

	public abstract IWvWMatches newWvWMatches();
}
