package de.getsetsociety.gw2readr.v1.map.continents;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v1.map.continents.interfaces.IContinent;
import de.getsetsociety.gw2readr.v1.map.continents.json.ContinentJson;
import de.getsetsociety.gw2readr.v1.map.continents.json.ContinentsJson;

public class ContinentsReader {

	private ObjectMapper mapper = new ObjectMapper();
	private static final transient Logger logger = Logger.getLogger(ContinentsReader.class);
	
	public List<IContinent> readContinents() {
		String src = "{\r\n" + 
				"  \"continents\": {\r\n" + 
				"    \"1\": {\r\n" + 
				"      \"name\": \"Tyria\",\r\n" + 
				"      \"continent_dims\": [ 32768, 32768 ],\r\n" + 
				"      \"min_zoom\": 0,\r\n" + 
				"      \"max_zoom\": 7,\r\n" + 
				"      \"floors\": [ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17,\r\n" + 
				"          18, 19, 30, -2, -3, -4, -5, -6, -7, -8, -10, -11, -15, -16, -17, 38,\r\n" + 
				"          20, 21, 22, 23, 24, 25, 26, 27, 34, 36, 37 ]\r\n" + 
				"    },\r\n" + 
				"    \"2\": {\r\n" + 
				"      \"name\": \"Mists\",\r\n" + 
				"      \"continent_dims\": [ 16384, 16384 ],\r\n" + 
				"      \"min_zoom\": 0,\r\n" + 
				"      \"max_zoom\": 6,\r\n" + 
				"      \"floors\": [ 1, 3, 5, 6, 7, 8, 9, 10, 13, 14, 18, 19, 21, 22, 23, 24, 25,\r\n" + 
				"          26, -27, -28, -29, -30, -31, -32, -33, 27 ]\r\n" + 
				"    }\r\n" + 
				"  }\r\n" + 
				"}";
		return readContinents(src);
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
