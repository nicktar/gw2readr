package de.getsetsociety.gw2readr.v2.commerce.listings;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.commerce.exchange.json.ExchangeJson;
import de.getsetsociety.gw2readr.v2.commerce.exchange.json.IExchange;
import de.getsetsociety.gw2readr.v2.commerce.listings.entities.Offer;
import de.getsetsociety.gw2readr.v2.commerce.listings.interfaces.IListings;
import de.getsetsociety.gw2readr.v2.commerce.listings.interfaces.IOffer;
import de.getsetsociety.gw2readr.v2.commerce.listings.json.ListingsJson;

public class ListingsTest {

	private static ObjectMapper mapper = new ObjectMapper();

	/**
	 * Test the readability of a response with a valid amount
	 * @throws IOException
	 * @throws JsonMappingException
	 * @throws JsonParseException
	 */
	@Test
	public void testDemoJson() throws JsonParseException, JsonMappingException, IOException {
		String content = "{\"id\":19684,"
				+ "\"buys\":[{\"listings\":2,\"unit_price\":53,\"quantity\":166},{\"listings\":13,\"unit_price\":52,\"quantity\":3098}],"
				+ "\"sells\":[{\"listings\":2,\"unit_price\":71,\"quantity\":182},{\"listings\":2,\"unit_price\":72,\"quantity\":350},{\"listings\":1,\"unit_price\":73,\"quantity\":250}]}";
		ListingsJson json = mapper.readValue(content, ListingsJson.class);
		assertNotNull(json);
		IListings entity = json.getEntity();
		assertEquals(Integer.valueOf(19684), entity.getId());
		assertNotNull(entity.getBuys());
		assertEquals(2, entity.getBuys().size());
		IOffer expected = new Offer();
		expected.setListings(2);
		expected.setQuantity(166);
		expected.setUnitPrice(53);
		assertTrue(expected.equals(entity.getBuys().get(0)));
		expected.setListings(13);
		expected.setQuantity(3098);
		expected.setUnitPrice(52);
		assertTrue(expected.equals(entity.getBuys().get(1)));
		assertNotNull(entity.getSells());
		assertEquals(3, entity.getSells().size());
		expected.setListings(2);
		expected.setQuantity(182);
		expected.setUnitPrice(71);
		assertTrue(expected.equals(entity.getSells().get(0)));
		expected.setListings(2);
		expected.setQuantity(350);
		expected.setUnitPrice(72);
		assertTrue(expected.equals(entity.getSells().get(1)));
		expected.setListings(1);
		expected.setQuantity(250);
		expected.setUnitPrice(73);
		assertTrue(expected.equals(entity.getSells().get(2)));
	}

	@Test
	public void testWithOnlyBuyOrders() throws JsonParseException, JsonMappingException, IOException {
		String content = "{\"id\":19684,"
				+ "\"buys\":[{\"listings\":2,\"unit_price\":53,\"quantity\":166},{\"listings\":13,\"unit_price\":52,\"quantity\":3098}]}";
		ListingsJson json = mapper.readValue(content, ListingsJson.class);
		assertNotNull(json);
		IListings entity = json.getEntity();
		assertEquals(Integer.valueOf(19684), entity.getId());
		assertNotNull(entity.getBuys());
		assertEquals(2, entity.getBuys().size());
		IOffer expected = new Offer();
		expected.setListings(2);
		expected.setQuantity(166);
		expected.setUnitPrice(53);
		assertTrue(expected.equals(entity.getBuys().get(0)));
		expected.setListings(13);
		expected.setQuantity(3098);
		expected.setUnitPrice(52);
		assertTrue(expected.equals(entity.getBuys().get(1)));
		assertNotNull(entity.getSells());
		assertEquals(0, entity.getSells().size());

	}
	/**
	 * Test the readability of a response with an invalid amount
	 * @throws IOException
	 * @throws JsonMappingException
	 * @throws JsonParseException
	 */
	@Test
	public void testBuyCoinsWith1Gem() throws JsonParseException, JsonMappingException, IOException {
		ExchangeJson json = null;
		json = mapper.readValue("{\"text\":\"ExchangeState: amount offered is insufficient for exchange\"}", ExchangeJson.class);

		IExchange exchange = json.getEntity();
		assertNull(exchange.getCoinsPerGem());
		assertNull(exchange.getQuantity());
		assertTrue(json.getAdditionalProperties().containsKey("text"));
		assertEquals("ExchangeState: amount offered is insufficient for exchange", json.getAdditionalProperties().get("text"));
	}

}
