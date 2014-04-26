package de.getsetsociety.gw2readr.v1.item.allrecipes.json;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v1.item.ContentLoader;

public class AllRecipesReader {

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

	public List<Integer> readAllRecipes() {
		AllRecipes allRecipes = null;
		try {
			String content = ContentLoader.getRecipesUrlContent();

			allRecipes = mapper.readValue(content, AllRecipes.class);
		} catch (IOException e) {
		}

		return allRecipes != null ? allRecipes.getRecipes() : null;
	}

}
