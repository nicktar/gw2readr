package de.getsetsociety.gw2readr.v2.commerce.listings;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Offer {

	private Integer listings;
	private Integer unitPrice;
	private Integer quantity;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("listings")
	public Integer getListings() {
		return listings;
	}

	public void setListings(Integer listings) {
		this.listings = listings;
	}

	@JsonProperty("unit_price")
	public Integer getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}

	@JsonProperty("quantity")
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
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