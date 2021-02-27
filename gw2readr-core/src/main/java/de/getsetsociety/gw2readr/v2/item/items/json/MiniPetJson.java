package de.getsetsociety.gw2readr.v2.item.items.json;

import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v2.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IMiniPet;
import lombok.Data;

public class MiniPetJson extends ItemJson<IMiniPet> {

    private final IMiniPet item = EntityFactoryProvider.getItemEntityFactory().newMiniPet();

    @Override
    public IMiniPet getEntity() {
        return item;
    }

    @JsonProperty("details")
    public void setMiniPetDetails(MiniPetDetails details) {
        item.setMiniPet(details.getMiniPetId());
    }

    @Data
    private static class MiniPetDetails {

        @JsonProperty("minipet_id")
        private Integer miniPetId;
    }
}
