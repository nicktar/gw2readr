/**
 * 
 */
package de.getsetsociety.gw2readr.v1.factories;

import de.getsetsociety.gw2readr.v1.factories.interfaces.IGuildDetailsFactory;
import de.getsetsociety.gw2readr.v1.guilds.hibernateentites.Guild;
import de.getsetsociety.gw2readr.v1.guilds.hibernateentites.GuildEmblem;
import de.getsetsociety.gw2readr.v1.guilds.interfaces.IGuild;
import de.getsetsociety.gw2readr.v1.guilds.interfaces.IGuildEmblem;

/**
 * @author Nicktar
 *
 */
public class HibernateGuildDetailsFactory implements IGuildDetailsFactory {

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
