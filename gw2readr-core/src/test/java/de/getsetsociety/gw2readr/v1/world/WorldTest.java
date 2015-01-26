package de.getsetsociety.gw2readr.v1.world;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v1.world.json.WorldsJson;

import static org.junit.Assert.*;

public class WorldTest {
	
	@Test
	public void testReadingFromString() {
		ObjectMapper mapper = new ObjectMapper();
		String source = "[{ \"id\": \"1015\", \"name\": \"Isla de Janthir\" },{ \"id\": \"1001\", \"name\": \"Roca del Yunque\" }]";
		try {
			WorldsJson[] worlds = mapper.readValue(source, WorldsJson[].class);
			assertNotNull(worlds);
			assertEquals(2, worlds.length);
		} catch (JsonParseException e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		} catch (JsonMappingException e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		} catch (IOException e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
		
		
	}

}
