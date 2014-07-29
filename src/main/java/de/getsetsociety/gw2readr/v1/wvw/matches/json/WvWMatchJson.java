package de.getsetsociety.gw2readr.v1.wvw.matches.json;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.general.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v1.wvw.matches.interfaces.IWvWMatch;

public class WvWMatchJson {

	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final IWvWMatch entity;
	
	public WvWMatchJson() {
		entity = EntityFactoryProvider.getWvWEntityFactory().newWvWMatch();
	}

	public WvWMatchJson(IWvWMatch entity) {
		this.entity = entity;
	}

	@JsonProperty("wvw_match_id")
	public String getWvwMatchId() {
		return entity.getWvwMatchId();
	}

	public void setWvwMatchId(String wvwMatchId) {
		entity.setWvwMatchId(wvwMatchId);
	}

	@JsonProperty("red_world_id")
	public Integer getRedWorldId() {
		return entity.getRedWorldId();
	}

	public void setRedWorldId(Integer redWorldId) {
		entity.setRedWorldId(redWorldId);
	}

	@JsonProperty("blue_world_id")
	public Integer getBlueWorldId() {
		return entity.getBlueWorldId();
	}

	public void setBlueWorldId(Integer blueWorldId) {
		entity.setBlueWorldId(blueWorldId);
	}

	@JsonProperty("green_world_id")
	public Integer getGreenWorldId() {
		return entity.getGreenWorldId();
	}

	@JsonProperty("green_world_id")
	public void setGreenWorldId(Integer greenWorldId) {
		entity.setGreenWorldId(greenWorldId);
	}

	public String getStartTime() {
		return entity.getStartTime();
	}

	@JsonProperty("start_time")
	public void setStartTime(String startTime) {
		entity.setStartTime(startTime);
	}

	public String getEndTime() {
		return entity.getEndTime();
	}

	@JsonProperty("end_time")
	public void setEndTime(String endTime) {
		entity.setEndTime(endTime);
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public IWvWMatch getEntity() {
		return entity;
	}

}
