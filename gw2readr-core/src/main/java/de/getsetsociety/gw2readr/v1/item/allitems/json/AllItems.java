package de.getsetsociety.gw2readr.v1.item.allitems.json;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AllItems {

	private List<Integer> items;

	@JsonProperty("items")
	public List<Integer> getItems() {
		return items;
	}

	public void setItems(List<Integer> items) {
		this.items = items;
	}
}
