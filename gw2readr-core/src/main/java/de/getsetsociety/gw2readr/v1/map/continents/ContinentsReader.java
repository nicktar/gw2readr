package de.getsetsociety.gw2readr.v1.map.continents;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.ContentLoader;
import de.getsetsociety.gw2readr.v1.map.continents.interfaces.IContinent;
import de.getsetsociety.gw2readr.v1.map.continents.json.ContinentJson;
import de.getsetsociety.gw2readr.v1.map.continents.json.ContinentsJson;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ContinentsReader {

	private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

	public List<IContinent> readContinents() {
		List<IContinent> continents = null;
		try {
			continents = readContinents(ContentLoader.readContinentsUrlContent());
		} catch (IOException e) {
			LOGGER.error("Unexpected Exception", e);
		}
		return continents;
	}

	protected List<IContinent> readContinents(String src) {
		List<IContinent> continents = new ArrayList<>();
		try {
			for (Entry<String, ContinentJson> e : OBJECT_MAPPER.readValue(src, ContinentsJson.class).getContinents().entrySet()) {
				IContinent continent = e.getValue().getEntity();
				continent.setId(Integer.valueOf(e.getKey()));
				continents.add(continent);
			}

		} catch (JsonParseException e) {
			LOGGER.error("Unexspected Exception", e);
		} catch (JsonMappingException e) {
			LOGGER.error("Unexspected Exception", e);
		} catch (IOException e) {
			LOGGER.error("Unexspected Exception", e);
		}
		return continents;
	}
}
