package de.getsetsociety.gw2readr.v1.map.continents;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.ContentLoader;
import de.getsetsociety.gw2readr.v1.map.continents.interfaces.IContinent;
import de.getsetsociety.gw2readr.v1.map.continents.json.ContinentJson;
import de.getsetsociety.gw2readr.v1.map.continents.json.ContinentsJson;

public class ContinentsReader {

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
	}}	private static final transient Logger logger = Logger.getLogger(ContinentsReader.class);
	
	public List<IContinent> readContinents() {
		List<IContinent> continents = null;
		try {
			continents = readContinents(ContentLoader.readContinentsUrlContent());
		} catch (IOException e) {
			logger.error("Unexpected Exception", e);
		}
		return continents;
	}

	protected List<IContinent> readContinents(String src) {
		List<IContinent> continents = new ArrayList<IContinent>();
		try {
			for (Entry<String, ContinentJson> e: mapper.readValue(src, ContinentsJson.class).getContinents().entrySet()) {
				IContinent continent = e.getValue().getEntity();
				continent.setId(Integer.valueOf(e.getKey()));
				continents.add(continent);
			}

		} catch (JsonParseException e) {
			logger.error("Unexspected Exception", e);
		} catch (JsonMappingException e) {
			logger.error("Unexspected Exception", e);
		} catch (IOException e) {
			logger.error("Unexspected Exception", e);
		}
		return continents;
	}
}
