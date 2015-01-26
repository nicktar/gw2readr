package de.getsetsociety.gw2readr.v1.wvw.matches.entities;

import java.util.ArrayList;
import java.util.List;

import de.getsetsociety.gw2readr.v1.wvw.matches.interfaces.IWvWMatch;
import de.getsetsociety.gw2readr.v1.wvw.matches.interfaces.IWvWMatches;

public class WvWMatches implements IWvWMatches {

	private List<IWvWMatch> wvwMatches = new ArrayList<IWvWMatch>();

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.wvw.matches.entities.IWvWMatches#getWvwMatches()
	 */
	@Override
	public List<IWvWMatch> getWvwMatches() {
		return wvwMatches;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.wvw.matches.entities.IWvWMatches#setWvwMatches(java.util.List)
	 */
	@Override
	public void setWvwMatches(List<IWvWMatch> wvwMatches) {
		this.wvwMatches = wvwMatches;
	}
}