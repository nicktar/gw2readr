package de.getsetsociety.gw2readr.v1.world;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.ContentLoader;
import de.getsetsociety.gw2readr.general.enums.Language;
import de.getsetsociety.gw2readr.v1.world.interfaces.IWorld;
import de.getsetsociety.gw2readr.v1.world.json.WorldsJson;

public class WorldsReader {
	
	private ObjectMapper mapper = new ObjectMapper();
	private static final transient Logger logger = Logger.getLogger(WorldsReader.class);
	
	public List<IWorld> getAllWorlds(Language language) {
		List<IWorld> worlds = new ArrayList<IWorld>();
		try {
			String src = ContentLoader.getWorldsUrlContent(language);
			for (WorldsJson worldJson: mapper.readValue(src, WorldsJson[].class)) {
				IWorld world = worldJson.getEntity();
				world.setLanguage(language);
				worlds.add(world);
			}
		} catch (MalformedURLException e) {
			logger.error("Unexpected Exception", e);
		} catch (IOException e) {
			logger.error("Unexpected Exception", e);
		}
		return worlds;
	}

	public List<IWorld> getAllWorlds() {
		return getAllWorlds(Language.English);
	}

}
