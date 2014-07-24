package de.getsetsociety.gw2readr.v1.wvw.matches.json;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class WvWMatchJson {

	private String wvwMatchId;
	private Integer redWorldId;
	private Integer blueWorldId;
	private Integer greenWorldId;
	private String startTime;
	private String endTime;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("wvw_match_id")
	public String getWvwMatchId() {
		return wvwMatchId;
	}

	@JsonProperty("wvw_match_id")
	public void setWvwMatchId(String wvwMatchId) {
		this.wvwMatchId = wvwMatchId;
	}

	@JsonProperty("red_world_id")
	public Integer getRedWorldId() {
		return redWorldId;
	}

	@JsonProperty("red_world_id")
	public void setRedWorldId(Integer redWorldId) {
		this.redWorldId = redWorldId;
	}

	@JsonProperty("blue_world_id")
	public Integer getBlueWorldId() {
		return blueWorldId;
	}

	@JsonProperty("blue_world_id")
	public void setBlueWorldId(Integer blueWorldId) {
		this.blueWorldId = blueWorldId;
	}

	@JsonProperty("green_world_id")
	public Integer getGreenWorldId() {
		return greenWorldId;
	}

	@JsonProperty("green_world_id")
	public void setGreenWorldId(Integer greenWorldId) {
		this.greenWorldId = greenWorldId;
	}

	@JsonProperty("start_time")
	public String getStartTime() {
		return startTime;
	}

	@JsonProperty("start_time")
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	@JsonProperty("end_time")
	public String getEndTime() {
		return endTime;
	}

	@JsonProperty("end_time")
	public void setEndTime(String endTime) {
		this.endTime = endTime;
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
