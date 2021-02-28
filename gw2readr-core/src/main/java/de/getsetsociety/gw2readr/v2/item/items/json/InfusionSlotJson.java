package de.getsetsociety.gw2readr.v2.item.items.json;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.IInfusionSlot;
import de.getsetsociety.gw2readr.v2.factories.EntityFactoryProvider;

public class InfusionSlotJson implements IEntityWrapper<IInfusionSlot> {

    private final IInfusionSlot entity = EntityFactoryProvider.getItemEntityFactory().newInfusionSlot();

    private final Map<String, Object> additionalProperties = new HashMap<>();

    @Override
    public IInfusionSlot getEntity() {
        return entity;
    }

    @JsonProperty("flags")
    public Set<InfusionSlotType> getFlags() {
        return entity.getFlags();
    }

    public void setFlags(Collection<InfusionSlotType> flags) {
        if (flags != null) {
            entity.addAllFlags(flags);
        }
    }

    @JsonProperty("item_id")
    public Integer getItemId() {
        return entity.getItem();
    }

    public void setItemId(Integer itemId) {
        entity.setItem(itemId);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        additionalProperties.put(name, value);
    }

}
