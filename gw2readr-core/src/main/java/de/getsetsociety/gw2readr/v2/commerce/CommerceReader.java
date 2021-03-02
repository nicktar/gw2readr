package de.getsetsociety.gw2readr.v2.commerce;

import java.io.IOException;
import java.util.Optional;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.ContentLoader;
import de.getsetsociety.gw2readr.general.ObjectMapperProvider;
import de.getsetsociety.gw2readr.v2.commerce.exchange.interfaces.IExchange;
import de.getsetsociety.gw2readr.v2.commerce.exchange.json.ExchangeJson;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommerceReader {

    private static final ObjectMapper OBJECT_MAPPER = ObjectMapperProvider.getMapper();

    public Optional<IExchange> readBuyCoins(Integer gems) {
        try {
            String content = ContentLoader.getBuyCoinsUrlContent(gems);
            ExchangeJson exchangeJson = OBJECT_MAPPER.readValue(content, ExchangeJson.class);
            return Optional.of(exchangeJson.getEntity());
        } catch (IOException e) {
            LOGGER.error("Caught Exception", e);
        }
        return Optional.empty();
    }

    public Optional<IExchange> readBuyGems(Integer coins) {
        try {
            String content = ContentLoader.getBuyCoinsUrlContent(coins);
            ExchangeJson exchangeJson = OBJECT_MAPPER.readValue(content, ExchangeJson.class);
            return Optional.of(exchangeJson.getEntity());
        } catch (IOException e) {
            LOGGER.error("Caught Exception", e);
        }
        return Optional.empty();
    }

}
