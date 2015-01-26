package de.getsetsociety.gw2readr.v1.wvw.matchdetails.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

public class WvWMatchDetailsJson {

	private String matchId;
	private List<Integer> scores = new ArrayList<Integer>();
	private List<WvWMapJson> maps = new ArrayList<WvWMapJson>();
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("match_id")
	public String getMatchId() {
		return matchId;
	}

	public void setMatchId(String matchId) {
		this.matchId = matchId;
	}

	@JsonProperty("scores")
	public List<Integer> getScores() {
		return scores;
	}

	public void setScores(List<Integer> scores) {
		this.scores = scores;
	}

	@JsonProperty("maps")
	public List<WvWMapJson> getMaps() {
		return maps;
	}

	public void setMaps(List<WvWMapJson> maps) {
		this.maps = maps;
	}

	@JsonAnyGetter
	public java.util.Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
