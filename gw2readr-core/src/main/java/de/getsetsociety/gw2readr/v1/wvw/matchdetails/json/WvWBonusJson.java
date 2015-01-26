package de.getsetsociety.gw2readr.v1.wvw.matchdetails.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WvWBonusJson {

	private String type;
	private String owner;

	@JsonProperty
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
