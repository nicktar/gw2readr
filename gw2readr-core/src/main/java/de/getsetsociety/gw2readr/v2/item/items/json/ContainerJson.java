package de.getsetsociety.gw2readr.v2.item.items.json;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v0.item.items.enums.ContainerType;
import de.getsetsociety.gw2readr.v2.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IContainer;
import lombok.Data;

public class ContainerJson extends ItemJson<IContainer> {

    private final IContainer item = EntityFactoryProvider.getItemEntityFactory().newContainer();

    @Override
    public IContainer getEntity() {
        return item;
    }

    @JsonProperty("details")
    public void setConsumableDetails(ConsumableDetails details) {
        item.setContainerType(details.getType());
        getAdditionalProperties().putAll(details.getAdditionalProperties());
    }

    @Data
    private static class ConsumableDetails {

        @JsonProperty("type")
        private ContainerType type;
        private Map<String, Object> additionalProperties = new HashMap<>();

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            additionalProperties.put(name, value);
        }

    }

}
