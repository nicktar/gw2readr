package de.getsetsociety.gw2readr.v2.item.items.json;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v0.item.items.enums.GizmoType;
import de.getsetsociety.gw2readr.v2.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IGizmo;
import lombok.Data;
import lombok.Getter;

public class GizmoJson extends ItemJson<IGizmo> {

    @Getter
    private final IGizmo entity = EntityFactoryProvider.getItemEntityFactory().newGizmo();


    @JsonProperty("details")
    public void setGizmoDetails(GizmoDetails details) {
        entity.setGizmoType(details.getType());
        entity.addAllVendors(details.getVendors());
        getAdditionalProperties().putAll(details.getAdditionalProperties());
    }

    @Data
    private static class GizmoDetails {

        @JsonProperty("type")
        private GizmoType type;
        @JsonProperty("vendor_ids")
        private Set<Integer> vendors = new HashSet<>();
        private final Map<String, Object> additionalProperties = new HashMap<>();

        @JsonAnySetter
        public Map<String, Object> getAdditionalProperties() {
            return additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            additionalProperties.put(name, value);
        }

    }

}
