package de.getsetsociety.gw2readr.v1.factories.interfaces;

import de.getsetsociety.gw2readr.v1.guilds.interfaces.IGuild;
import de.getsetsociety.gw2readr.v1.guilds.interfaces.IGuildEmblem;

public interface IGuildDetailsFactory {
	
	public IGuildEmblem newGuildEmblem();
	
	public IGuild newGuild();

}
