package de.getsetsociety.gw2readr.v2.item.items.json;

import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v2.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IBackItem;
import lombok.Data;
import lombok.EqualsAndHashCode;

public class BackItemJson extends ItemJson<IBackItem> {

    private final IBackItem item = EntityFactoryProvider.getItemEntityFactory().newBackItem();

    @JsonProperty("details")
    public void setBackItemDetails(BackItemDetails details) {
        setBasicDetails(details, item);
    }

    @Override
    public IBackItem getEntity() {
        return item;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    private static class BackItemDetails extends BasicJsonDetails {

    }
}
