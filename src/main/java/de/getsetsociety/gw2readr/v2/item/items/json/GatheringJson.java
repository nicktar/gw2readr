package de.getsetsociety.gw2readr.v2.item.items.json;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v2.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v2.item.items.enums.GatheringType;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IGathering;

public class GatheringJson extends ItemJson<IGathering> {

    private IGathering item = EntityFactoryProvider.getItemEntityFactory().newGathering();

    @Override
    public IGathering getEntity() {
        return item;
    }

    @JsonProperty("details")
    public void setGatheringDetails(GatheringDetails details) {
        item.setGatheringType(details.getType());
        getAdditionalProperties().putAll(details.getAdditionalProperties());
    }

    public static class GatheringDetails {

        private GatheringType type;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("type")
        public GatheringType getType() {
            return type;
        }

        public void setType(String type) {
            this.type = GatheringType.valueOf(type);
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }

}
