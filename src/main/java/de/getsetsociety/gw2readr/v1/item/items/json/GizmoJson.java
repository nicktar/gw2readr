package de.getsetsociety.gw2readr.v1.item.items.json;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v1.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v1.item.items.enums.GizmoType;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IGizmo;

public class GizmoJson extends ItemJson<IGizmo> {

	private IGizmo item = EntityFactoryProvider.getItemEntityFactory().newGizmo();

	@Override
	public IGizmo getEntity() {
		return item;
	}
	
	@JsonProperty("gizmo")
	public void setGizmoDetails(GizmoDetails details) {
		item.setGizmoType(details.getType());;
		getAdditionalProperties().putAll(details.getAdditionalProperties());
	}

	public static class GizmoDetails {

		private GizmoType type;
		private Map<String, Object> additionalProperties = new HashMap<String, Object>();

		@JsonProperty("type")
		public GizmoType getType() {
			return type;
		}

		public void setType(String type) {
			this.type = GizmoType.valueOf(type);
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
