package de.getsetsociety.gw2readr.v2.commerce.exchange;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.commerce.exchange.json.ExchangeJson;
import de.getsetsociety.gw2readr.v2.commerce.exchange.json.IExchange;

public class ExchangeTest {

	private static ObjectMapper mapper = new ObjectMapper();

	/**
	 * Test the readability of a response with a valid amount
	 * @throws IOException
	 * @throws JsonMappingException
	 * @throws JsonParseException
	 */
	@Test
	public void testBuyCoinsWith1000Gems() throws JsonParseException, JsonMappingException, IOException {
		ExchangeJson json = mapper.readValue("{\"coins_per_gem\":971,\"quantity\":971949}", ExchangeJson.class);
		IExchange exchange = json.getEntity();
		assertEquals(Integer.valueOf(971), exchange.getCoinsPerGem());
		assertEquals(Integer.valueOf(971949), exchange.getQuantity());
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
