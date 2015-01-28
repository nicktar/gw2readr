package de.getsetsociety.gw2readr.v2.commerce;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.ContentLoader;
import de.getsetsociety.gw2readr.v2.commerce.exchange.interfaces.IExchange;
import de.getsetsociety.gw2readr.v2.commerce.exchange.json.ExchangeJson;

public class CommerceReader {

	private static final Logger logger = Logger.getLogger(CommerceReader.class);
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
	}}

	public IExchange readBuyCoins(Integer gems) {
		ExchangeJson exchangeJson = null;
		try {
			String content = ContentLoader.getBuyCoinsUrlContent(gems);
			exchangeJson = mapper.readValue(content, ExchangeJson.class);
		} catch (IOException e) {
			logger.error("Caught Exception", e);
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
			exchangeJson = mapper.readValue(content, ExchangeJson.class);
		} catch (IOException e) {
			logger.error("Caught Exception", e);
		}

		IExchange exchange = null;
		if (exchangeJson != null) {
			exchange = exchangeJson.getEntity();
		}
		return exchange;
	}

}
