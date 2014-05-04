/**
 * 
 */
package de.getsetsociety.gw2readr.general.factories;

import de.getsetsociety.gw2readr.general.factories.interfaces.IGuildDetailsFactory;
import de.getsetsociety.gw2readr.v1.guilds.entites.Guild;
import de.getsetsociety.gw2readr.v1.guilds.entites.GuildEmblem;
import de.getsetsociety.gw2readr.v1.guilds.interfaces.IGuild;
import de.getsetsociety.gw2readr.v1.guilds.interfaces.IGuildEmblem;

/**
 * @author Nicktar
 *
 */
public class GuildDetailsFactory implements IGuildDetailsFactory {

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.general.factories.interfaces.IGuildDetailsFactory#newGuildEmblem()
	 */
	@Override
	public IGuildEmblem newGuildEmblem() {
		return new GuildEmblem();
	}
	
	public IGuild newGuild() {
		return new Guild();
	}

}
