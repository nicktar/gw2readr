package de.getsetsociety.gw2readr.v2.item.items.json;

import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v0.item.items.enums.TrinketType;
import de.getsetsociety.gw2readr.v2.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.ITrinket;
import lombok.Data;
import lombok.EqualsAndHashCode;

public class TrinketJson extends ItemJson<ITrinket> {

    private final ITrinket item = EntityFactoryProvider.getItemEntityFactory().newTrinket();

    @Override
    public ITrinket getEntity() {
        return item;
    }

    @JsonProperty("details")
    public void setTrinketDetails(TrinketDetails details) {
        item.setTrinketType(details.getType());
        setBasicDetails(details, item);
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    private static class TrinketDetails extends BasicJsonDetails {

        @JsonProperty("type")
        private TrinketType type;


    }

}
