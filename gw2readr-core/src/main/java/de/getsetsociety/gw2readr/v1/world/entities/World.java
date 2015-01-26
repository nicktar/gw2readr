package de.getsetsociety.gw2readr.v1.world.entities;

import de.getsetsociety.gw2readr.general.enums.Language;
import de.getsetsociety.gw2readr.v1.world.interfaces.IWorld;

public class World implements IWorld {

	private Integer id;
	private String name;
	private Language language;

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.world.entities.IWorld#getId()
	 */
	@Override
	public Integer getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.world.entities.IWorld#setId(java.lang.Integer)
	 */
	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.world.entities.IWorld#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.world.entities.IWorld#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.world.entities.IWorld#getLanguage()
	 */
	@Override
	public Language getLanguage() {
		return language;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.world.entities.IWorld#setLanguage(de.getsetsociety.gw2readr.general.enums.Language)
	 */
	@Override
	public void setLanguage(Language language) {
		this.language = language;
	}

}
