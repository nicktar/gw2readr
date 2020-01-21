package de.getsetsociety.gw2readr.v1.guilds;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.ContentLoader;
import de.getsetsociety.gw2readr.v1.guilds.interfaces.IGuild;
import de.getsetsociety.gw2readr.v1.guilds.json.GuildJson;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class GuildsReader {

	private static final ObjectMapper mapper = new ObjectMapper();

	public IGuild readGuild(String guildId, String guildName) {
		IGuild guild = null;
		try {
			guild = readGuild(ContentLoader.readGuildUrlContent(guildId, guildName));
		} catch (IOException e) {
			LOGGER.error("Unexpected Exception", e);
		}
		return guild;
	}

	protected IGuild readGuild(String src) {
		IGuild guild = null;
		try {
			GuildJson guildJson = mapper.readValue(src, GuildJson.class);
			guild = guildJson.getEntity();
		} catch (JsonParseException e) {
			LOGGER.error("Unexspected Exception", e);
		} catch (JsonMappingException e) {
			LOGGER.error("Unexspected Exception", e);
		} catch (IOException e) {
			LOGGER.error("Unexspected Exception", e);
		}
		return guild;
	}
}
