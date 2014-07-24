package de.getsetsociety.gw2readr.v1.wvw.matches.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MatchesJson {

	private List<WvWMatchJson> wvwMatches = new ArrayList<WvWMatchJson>();
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("wvw_matches")
	public List<WvWMatchJson> getWvwMatches() {
		return wvwMatches;
	}

	@JsonProperty("wvw_matches")
	public void setWvwMatches(List<WvWMatchJson> wvwMatches) {
		this.wvwMatches = wvwMatches;
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