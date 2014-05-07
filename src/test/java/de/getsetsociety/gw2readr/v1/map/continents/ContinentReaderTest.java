package de.getsetsociety.gw2readr.v1.map.continents;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import de.getsetsociety.gw2readr.v1.JsonResources;
import de.getsetsociety.gw2readr.v1.map.continents.json.ContinentJson;
import de.getsetsociety.gw2readr.v1.map.continents.json.ContinentsJson;

public class ContinentReaderTest {
	
	private static final String src = JsonResources.getString("JSON");

	@Test
	public void testReadingContinents() {
		ContinentsJson result = new ContinentsReader().readContinents(src);
		assertNotNull(result);
		assertEquals(0, result.getAdditionalProperties().size());
		assertEquals(2,result.getContinents().size());
		ContinentJson tyria = result.getContinents().get("1"); 
		assertEquals("Tyria", tyria.getName()); 
		assertArrayEquals(new Integer[] {32768, 32768}, tyria.getContinentDims().toArray(new Integer[] {}));
		assertEquals(Integer.valueOf(0), tyria.getMinZoom());
		assertEquals(Integer.valueOf(7), tyria.getMaxZoom());
		assertEquals(45, tyria.getFloors().size());
		ContinentJson mists = result.getContinents().get("2");
		assertEquals("Mists", mists.getName()); 
		assertArrayEquals(new Integer[] {16384, 16384}, mists.getContinentDims().toArray(new Integer[] {}));
		assertEquals(Integer.valueOf(0), mists.getMinZoom());
		assertEquals(Integer.valueOf(6), mists.getMaxZoom());
		assertEquals(26, mists.getFloors().size());

	}

}
