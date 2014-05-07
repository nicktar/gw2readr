package de.getsetsociety.gw2readr.v1.map.continents;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

import de.getsetsociety.gw2readr.v1.JsonResources;
import de.getsetsociety.gw2readr.v1.map.continents.interfaces.IContinent;

public class ContinentReaderTest {
	
	private static final String src = JsonResources.getString("JSON");

	@Test
	public void testReadingContinents() {
		List<IContinent> result = new ContinentsReader().readContinents(src);
		assertNotNull(result);
		assertEquals(2,result.size());
		IContinent tyria = result.get(0); 
		assertEquals("Tyria", tyria.getName()); 
		assertEquals(Integer.valueOf(32768), tyria.getContinentXDim());
		assertEquals(Integer.valueOf(32768), tyria.getContinentYDim());
		assertEquals(Integer.valueOf(0), tyria.getMinZoom());
		assertEquals(Integer.valueOf(7), tyria.getMaxZoom());
		assertEquals(45, tyria.getFloors().size());
		IContinent mists = result.get(1);
		assertEquals("Mists", mists.getName()); 
		assertEquals(Integer.valueOf(16384), mists.getContinentXDim());
		assertEquals(Integer.valueOf(16384), mists.getContinentYDim());
		assertEquals(Integer.valueOf(0), mists.getMinZoom());
		assertEquals(Integer.valueOf(6), mists.getMaxZoom());
		assertEquals(26, mists.getFloors().size());

	}

}
