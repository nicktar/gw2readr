package de.getsetsociety.gw2readr.v1.world;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.ContentLoader;
import de.getsetsociety.gw2readr.general.enums.Language;
import de.getsetsociety.gw2readr.v1.world.interfaces.IWorld;
import de.getsetsociety.gw2readr.v1.world.json.WorldsJson;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class WorldsReader {

	private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

	public List<IWorld> getAllWorlds(Language language) {
		List<IWorld> worlds = new ArrayList<>();
		try {
			String src = ContentLoader.getWorldsUrlContent(language);
			for (WorldsJson worldJson : OBJECT_MAPPER.readValue(src, WorldsJson[].class)) {
				IWorld world = worldJson.getEntity();
				world.setLanguage(language);
				worlds.add(world);
			}
		} catch (IOException e) {
			LOGGER.error("Unexpected Exception", e);
		}
		return worlds;
	}

	public List<IWorld> getAllWorlds() {
		return getAllWorlds(Language.English);
	}

}
