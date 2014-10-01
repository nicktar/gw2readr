package de.getsetsociety.gw2readr.v2.commerce.listings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListingsJson {
	private Integer id;
	private List<Offer> buys = new ArrayList<Offer>();
	private List<Offer> sells = new ArrayList<Offer>();
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@JsonProperty("buys")
	public List<Offer> getBuys() {
		return buys;
	}

	public void setBuys(List<Offer> buys) {
		this.buys = buys;
	}

	@JsonProperty("sells")
	public List<Offer> getSells() {
		return sells;
	}

	public void setSells(List<Offer> sells) {
		this.sells = sells;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
}

