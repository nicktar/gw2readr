package de.getsetsociety.gw2readr.v1.item.recipes.json;

import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v1.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v1.item.items.json.IEntityWrapper;
import de.getsetsociety.gw2readr.v1.item.recipes.interfaces.IIngredient;

public class IngredientJson implements IEntityWrapper<IIngredient> {
	
	private final IIngredient entity;

	@Override
	public IIngredient getEntity() {
		return entity;
	}
	
	public IngredientJson() {
		entity = EntityFactoryProvider.getRecipeEntityFactory().newIngredient();
	}
	
	public IngredientJson(IIngredient ingredient) {
		entity = ingredient;
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
