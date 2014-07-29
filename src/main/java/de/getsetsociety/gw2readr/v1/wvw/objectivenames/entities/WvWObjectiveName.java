package de.getsetsociety.gw2readr.v1.wvw.objectivenames.entities;

import de.getsetsociety.gw2readr.v1.wvw.objectivenames.interfaces.IWvWObjectiveName;

public class WvWObjectiveName implements IWvWObjectiveName {

	private String id;
	private String name;
	

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.wvw.objectivenames.entities.IWvWObjectiveName#getId()
	 */
	@Override
	public String getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.wvw.objectivenames.entities.IWvWObjectiveName#setId(java.lang.String)
	 */
	@Override
	public void setId(String id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.wvw.objectivenames.entities.IWvWObjectiveName#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.wvw.objectivenames.entities.IWvWObjectiveName#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}
}
