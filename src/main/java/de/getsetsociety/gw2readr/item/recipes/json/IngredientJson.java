package de.getsetsociety.gw2readr.item.recipes.json;

import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.item.items.json.IEntityWrapper;
import de.getsetsociety.gw2readr.item.recipes.entities.Ingredient;
import de.getsetsociety.gw2readr.item.recipes.interfaces.IIngredient;

public class IngredientJson implements IEntityWrapper<IIngredient> {
	
	private IIngredient entity = new Ingredient();

	@Override
	public IIngredient getEntity() {
		return entity;
	}
	
	@JsonProperty("item_id")
	public Integer getItemId() {
		return getEntity().getItemId();
	}

	public void setItemId(Integer itemId) {
		getEntity().setItemId(itemId);
	}

	@JsonProperty("count")
	public Integer getCount() {
		return getEntity().getCount();
	}

	public void setCount(Integer count) {
		getEntity().setCount(count);
	}


}
