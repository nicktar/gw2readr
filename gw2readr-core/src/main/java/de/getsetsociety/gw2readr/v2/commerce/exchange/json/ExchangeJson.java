package de.getsetsociety.gw2readr.v2.commerce.exchange.json;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v2.commerce.exchange.interfaces.IExchange;
import de.getsetsociety.gw2readr.v2.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v2.item.items.json.IEntityWrapper;

public class ExchangeJson implements IEntityWrapper<IExchange> {

    IExchange entity = EntityFactoryProvider.getCommerceEntityFactory().newExchange();
    private final Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("coins_per_gem")
    public Integer getCoinsPerGem() {
        return getEntity().getCoinsPerGem();
    }

    public void setCoinsPerGem(Integer coinsPerGem) {
        getEntity().setCoinsPerGem(coinsPerGem);
    }

    @JsonProperty("quantity")
    public Integer getQuantity() {
        return getEntity().getQuantity();
    }

    public void setQuantity(Integer quantity) {
        getEntity().setQuantity(quantity);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        additionalProperties.put(name, value);
    }

	@Override
	public IExchange getEntity() {
		return entity;
	}

}
