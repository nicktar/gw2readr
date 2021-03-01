package de.getsetsociety.gw2readr.v2.commerce;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.ContentLoader;
import de.getsetsociety.gw2readr.v2.commerce.exchange.interfaces.IExchange;
import de.getsetsociety.gw2readr.v2.commerce.exchange.json.ExchangeJson;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommerceReader {

	private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

	public IExchange readBuyCoins(Integer gems) {
		ExchangeJson exchangeJson = null;
		try {
			String content = ContentLoader.getBuyCoinsUrlContent(gems);
			exchangeJson = OBJECT_MAPPER.readValue(content, ExchangeJson.class);
		} catch (IOException e) {
			LOGGER.error("Caught Exception", e);
		}

		IExchange exchange = null;
		if (exchangeJson != null) {
			exchange = exchangeJson.getEntity();
		}
		return exchange;
	}

	public IExchange readBuyGems(Integer coins) {
		ExchangeJson exchangeJson = null;
		try {
			String content = ContentLoader.getBuyCoinsUrlContent(coins);
			exchangeJson = OBJECT_MAPPER.readValue(content, ExchangeJson.class);
		} catch (IOException e) {
			LOGGER.error("Caught Exception", e);
		}

		IExchange exchange = null;
		if (exchangeJson != null) {
			exchange = exchangeJson.getEntity();
		}
		return exchange;
	}

}
