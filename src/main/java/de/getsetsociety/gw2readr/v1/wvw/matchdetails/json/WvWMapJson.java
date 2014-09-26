package de.getsetsociety.gw2readr.v1.wvw.matchdetails.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

public class WvWMapJson {

	private String type;
	private List<Integer> scores = new ArrayList<Integer>();
	private List<WvWObjectiveJson> objectives = new ArrayList<WvWObjectiveJson>();
	private List<WvWBonusJson> bonuses = new ArrayList<WvWBonusJson>();
	private java.util.Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("scores")
	public List<Integer> getScores() {
		return scores;
	}

	public void setScores(List<Integer> scores) {
		this.scores = scores;
	}

	@JsonProperty("objectives")
	public List<WvWObjectiveJson> getObjectives() {
		return objectives;
	}

	public void setObjectives(List<WvWObjectiveJson> objectives) {
		this.objectives = objectives;
	}

	@JsonProperty("bonuses")
	public List<WvWBonusJson> getBonuses() {
		return bonuses;
	}

	public void setBonuses(List<WvWBonusJson> bonuses) {
		this.bonuses = bonuses;
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
