package de.getsetsociety.gw2readr.v1.guilds;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.ContentLoader;
import de.getsetsociety.gw2readr.v1.guilds.interfaces.IGuild;
import de.getsetsociety.gw2readr.v1.guilds.json.GuildJson;

public class GuildsReader {

	private static final Object lock = new Object();
	private volatile static ObjectMapper mapper;
	{{
		if (mapper == null) {
			synchronized (lock) {
				if (mapper == null) {
					mapper = new ObjectMapper();
				}
			}
		}
	}}	private static final transient Logger logger = Logger.getLogger(GuildsReader.class);
	
	public IGuild readGuild(String guildId, String guildName) {
		IGuild guild = null;
		try {
			guild = readGuild(ContentLoader.readGuildUrlContent(guildId, guildName));
		} catch (IOException e) {
			logger.error("Unexpected Exception", e);
		}
		return guild;
	}

	protected IGuild readGuild(String src) {
		IGuild guild = null;
		try {
			GuildJson guildJson = mapper.readValue(src, GuildJson.class);
			guild = guildJson.getEntity();
		} catch (JsonParseException e) {
			logger.error("Unexspected Exception", e);
		} catch (JsonMappingException e) {
			logger.error("Unexspected Exception", e);
		} catch (IOException e) {
			logger.error("Unexspected Exception", e);
		}
		return guild;
	}
}
