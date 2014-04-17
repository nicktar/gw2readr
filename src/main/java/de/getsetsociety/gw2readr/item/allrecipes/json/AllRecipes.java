package de.getsetsociety.gw2readr.item.allrecipes.json;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AllRecipes {

	List<Integer> recipes;

	@JsonProperty("recipes")
	public List<Integer> getRecipes() {
		return recipes;
	}

	public void setRecipes(List<Integer> recipes) {
		this.recipes = recipes;
	}
}
