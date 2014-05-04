package de.getsetsociety.gw2readr.v1.guilds.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.general.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v1.guilds.enums.GuildEmblemFlags;
import de.getsetsociety.gw2readr.v1.guilds.interfaces.IGuildEmblem;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GuildEmblemJson {

	private final IGuildEmblem entity;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	public GuildEmblemJson() {
		entity = EntityFactoryProvider.getGuildDetailsFactory().newGuildEmblem();
	}
	
	public GuildEmblemJson(IGuildEmblem entity) {
		this.entity = entity;
	}

	/**
	 * @return
	 * @see de.getsetsociety.gw2readr.v1.guilds.interfaces.IGuildEmblem#getBackgroundId()
	 */	
	@JsonProperty("background_id")
	public Integer getBackgroundId() {
		return entity.getBackgroundId();
	}

	/**
	 * @param backgroundId
	 * @see de.getsetsociety.gw2readr.v1.guilds.interfaces.IGuildEmblem#setBackgroundId(java.lang.Integer)
	 */
	public void setBackgroundId(Integer backgroundId) {
		entity.setBackgroundId(backgroundId);
	}

	/**
	 * @return
	 * @see de.getsetsociety.gw2readr.v1.guilds.interfaces.IGuildEmblem#getForegroundId()
	 */
	@JsonProperty("foreground_id")
	public Integer getForegroundId() {
		return entity.getForegroundId();
	}

	/**
	 * @param foregroundId
	 * @see de.getsetsociety.gw2readr.v1.guilds.interfaces.IGuildEmblem#setForegroundId(java.lang.Integer)
	 */
	public void setForegroundId(Integer foregroundId) {
		entity.setForegroundId(foregroundId);
	}

	@JsonProperty("flags")
	public List<String> getFlags() {
		List<String> retValue = new ArrayList<String>();
		for (GuildEmblemFlags gef: entity.getFlags()) {
			retValue.add(gef.name());
		}
		return retValue;
	}

	/**
	 * @param flags
	 * @see de.getsetsociety.gw2readr.v1.guilds.interfaces.IGuildEmblem#setFlags(java.util.List)
	 */
	public void setFlags(List<String> flags) {
		entity.setFlags(new ArrayList<GuildEmblemFlags>());
		if (flags != null) {
			for (String s: flags) {
				entity.getFlags().add(GuildEmblemFlags.valueOf(s));
			}
		}
	}

	/**
	 * @return
	 * @see de.getsetsociety.gw2readr.v1.guilds.interfaces.IGuildEmblem#getBackgroundColorId()
	 */
	@JsonProperty("background_color_id")
	public Integer getBackgroundColorId() {
		return entity.getBackgroundColorId();
	}

	/**
	 * @param backgroundColorId
	 * @see de.getsetsociety.gw2readr.v1.guilds.interfaces.IGuildEmblem#setBackgroundColorId(java.lang.Integer)
	 */
	public void setBackgroundColorId(Integer backgroundColorId) {
		entity.setBackgroundColorId(backgroundColorId);
	}

	/**
	 * @return
	 * @see de.getsetsociety.gw2readr.v1.guilds.interfaces.IGuildEmblem#getForegroundPrimaryColorId()
	 */
	@JsonProperty("foreground_primary_color_id")
	public Integer getForegroundPrimaryColorId() {
		return entity.getForegroundPrimaryColorId();
	}

	/**
	 * @param foregroundPrimaryColorId
	 * @see de.getsetsociety.gw2readr.v1.guilds.interfaces.IGuildEmblem#setForegroundPrimaryColorId(java.lang.Integer)
	 */
	public void setForegroundPrimaryColorId(Integer foregroundPrimaryColorId) {
		entity.setForegroundPrimaryColorId(foregroundPrimaryColorId);
	}

	/**
	 * @return
	 * @see de.getsetsociety.gw2readr.v1.guilds.interfaces.IGuildEmblem#getForegroundSecondaryColorId()
	 */
	@JsonProperty("foreground_secondary_color_id")
	public Integer getForegroundSecondaryColorId() {
		return entity.getForegroundSecondaryColorId();
	}

	/**
	 * @param foregroundSecondaryColorId
	 * @see de.getsetsociety.gw2readr.v1.guilds.interfaces.IGuildEmblem#setForegroundSecondaryColorId(java.lang.Integer)
	 */
	public void setForegroundSecondaryColorId(Integer foregroundSecondaryColorId) {
		entity.setForegroundSecondaryColorId(foregroundSecondaryColorId);
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public IGuildEmblem getEntity() {
		return entity;
	}

}
