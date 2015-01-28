package de.getsetsociety.gw2readr.v2.item.items.json;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v2.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IBag;

public class BagJson extends ItemJson<IBag> {

    private IBag item = EntityFactoryProvider.getItemEntityFactory().newBag();

    @Override
    public IBag getEntity() {
        return item;
    }

    @JsonProperty("details")
    public void setBagDetails(BagDetails details) {
        item.setNoSellOrSort(details.isNoSellOrSort());
        item.setSize(details.getSize());
        getAdditionalProperties().putAll(details.getAdditionalProperties());

    }

    public static class BagDetails {
        private boolean noSellOrSort;
        private Integer size;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("no_sell_or_sort")
        public boolean isNoSellOrSort() {
            return noSellOrSort;
        }

        public void setNoSellOrSort(Boolean noSellOrSort) {
            this.noSellOrSort = noSellOrSort;
        }

        @JsonProperty("size")
        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
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
