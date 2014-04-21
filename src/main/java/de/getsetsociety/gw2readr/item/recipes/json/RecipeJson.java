package de.getsetsociety.gw2readr.item.recipes.json;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.general.enums.Language;
import de.getsetsociety.gw2readr.item.items.json.IEntityWrapper;
import de.getsetsociety.gw2readr.item.recipes.entities.Recipe;
import de.getsetsociety.gw2readr.item.recipes.enums.Disciplines;
import de.getsetsociety.gw2readr.item.recipes.enums.RecipeFlags;
import de.getsetsociety.gw2readr.item.recipes.enums.RecipeType;
import de.getsetsociety.gw2readr.item.recipes.interfaces.IBaseRecipe;
import de.getsetsociety.gw2readr.item.recipes.interfaces.IIngredient;

public class RecipeJson implements IEntityWrapper<IBaseRecipe> {

	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private IBaseRecipe entity = new Recipe();

	@JsonProperty("recipe_id")
	public Integer getId() {
		return getEntity().getId();
	}
	
	public void setId(Integer id) {
		getEntity().setId(id);
	}

	@JsonProperty("type")
	public String getType() {
		return getEntity().getType().name();
	}
	
	public void setType(String type) {
		getEntity().setType(RecipeType.valueOf(type));
	}
	
	@JsonProperty("output_item_id")
	public Integer getOutputItemId() {
		return getEntity().getOutputItemId();
	}
	
	public void setOutputItemId(Integer outputItemId) {
		getEntity().setOutputItemId(outputItemId);
	}
	
	@JsonProperty("output_item_count")
	public Integer getOutputItemCount() {
		return getEntity().getOutputItemCount();
	}
	
	public void setOutputItemCount(Integer outputItemCount) {
		getEntity().setOutputItemCount(outputItemCount);
	}
	
	@JsonProperty("min_rating")
	public Integer getMinRating() {
		return getEntity().getMinRating();
	}
	
	public void setMinRating(Integer minRating) {
		getEntity().setMinRating(minRating);
	}
	
	@JsonProperty("time_to_craft_ms")
	public Integer getTimeToCraftMs() {
		return getEntity().getTimeToCraftMs();
	}
	
	public void setTimeToCraftMs(Integer timeToCraftMs) {
		getEntity().setTimeToCraftMs(timeToCraftMs);
	}
	
	@JsonProperty("disciplines")
	public Set<String> getDisciplines() {
		Set<String> retValue = new HashSet<String>();
		for (Disciplines d: getEntity().getDisciplines()) {
			retValue.add(d.name());
		}
		return retValue;
	}
	
	public void setDisciplines(Set<String> disciplines) {
		for (String d: disciplines) {
			getEntity().getDisciplines().add(Disciplines.valueOf(d));
		}
	}
	
	@JsonProperty("flags")
	public Set<String> getFlags() {
		Set<String> retValue = new HashSet<String>();
		for (RecipeFlags f: getEntity().getFlags()) {
			retValue.add(f.name());
		}
		return retValue;
	}
	
	public void setFlags(Set<String> flags) {
		for (String f: flags) {
			getEntity().getFlags().add(RecipeFlags.valueOf(f));
		}
	}
	
	@JsonProperty("ingredients")
	public Set<IIngredient> getIngredients() {
		return getEntity().getIngredients();
	}

	@JsonProperty("ingredients")
	public void setIngredients(Set<IngredientJson> ingredients) {
		for (IngredientJson i: ingredients) {
			getEntity().getIngredients().add(i.getEntity());
		}
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public IBaseRecipe getEntity() {
		return entity;
	}
	
	public void setLanguage(Language language) {
		getEntity().setLanguage(language);
	}

}

