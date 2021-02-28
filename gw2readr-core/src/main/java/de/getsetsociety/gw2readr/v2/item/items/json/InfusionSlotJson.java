package de.getsetsociety.gw2readr.v2.item.items.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionSlotType;
import lombok.Data;

@Data
public class InfusionSlotJson {

    private final Map<String, Object> additionalProperties = new HashMap<>();
    @JsonProperty("flags")
    private final List<InfusionSlotType> flags = new ArrayList<>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        additionalProperties.put(name, value);
    }
}
