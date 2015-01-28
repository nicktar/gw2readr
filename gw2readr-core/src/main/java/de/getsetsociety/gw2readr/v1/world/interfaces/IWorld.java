package de.getsetsociety.gw2readr.v1.world.interfaces;

import de.getsetsociety.gw2readr.general.enums.Language;

public interface IWorld {

	public abstract Integer getId();

	public abstract void setId(Integer id);

	public abstract String getName();

	public abstract void setName(String name);

	public abstract Language getLanguage();

	public abstract void setLanguage(Language language);

}