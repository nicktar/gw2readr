package de.getsetsociety.gw2readr.item.recipes;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.item.ContentLoader;
import de.getsetsociety.gw2readr.item.recipes.entities.Recipe;
import de.getsetsociety.gw2readr.item.recipes.interfaces.IBaseRecipe;
import de.getsetsociety.gw2readr.item.recipes.json.RecipeJson;

public class RecipeReader {

	private static final Object lock = new Object();
	private volatile static ObjectMapper mapper;
	{{
		if (mapper == null) {
			synchronized (lock) {
				if (mapper == null) {
					mapper = new ObjectMapper();
				}
			}
		}
	}}

	@SuppressWarnings("unchecked")
	public IBaseRecipe readRecipe(Integer id) {
		RecipeJson recipe = null;
		try {
			String content = ContentLoader.getItemUrlContent(String.valueOf(id));

			recipe = mapper.readValue(content, RecipeJson.class);
		} catch (IOException e) {
		}

		return recipe != null ? recipe.getEntity() : null;
	}

}
