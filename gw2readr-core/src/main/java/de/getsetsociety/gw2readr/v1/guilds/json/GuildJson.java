package de.getsetsociety.gw2readr.v1.guilds.json;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v1.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v1.guilds.interfaces.IGuild;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GuildJson {
	
	private IGuild entity = EntityFactoryProvider.getGuildDetailsFactory().newGuild();

	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	public IGuild getEntity() {
		return entity;
	}

	@JsonProperty("guild_id")
	public String getGuildId() {
		return entity.getGuildId();
	}

	public void setGuildId(String guildId) {
		entity.setGuildId(guildId);
	}

	@JsonProperty("guild_name")
	public String getGuildName() {
		return entity.getGuildName();
	}

	public void setGuildName(String guildName) {
		entity.setGuildName(guildName);;
	}

	@JsonProperty("tag")
	public String getTag() {
		return entity.getTag();
	}

	public void setTag(String tag) {
		entity.setTag(tag);
	}

	@JsonProperty("emblem")
	public GuildEmblemJson getEmblem() {
		GuildEmblemJson emblem;
		if (entity.getEmblem() != null) {
			emblem = new GuildEmblemJson(entity.getEmblem());
		} else {
			emblem = new GuildEmblemJson();
		}
		return emblem;
	}

	public void setEmblem(GuildEmblemJson emblem) {
		entity.setEmblem(emblem.getEntity());
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