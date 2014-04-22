package de.getsetsociety.gw2readr.v1.item.recipes;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.enums.Language;
import de.getsetsociety.gw2readr.v1.item.recipes.interfaces.IRecipe;
import de.getsetsociety.gw2readr.v1.item.recipes.json.RecipeJson;
import de.getsetsociety.gw2readr.v1.item.ContentLoader;

public class RecipeReader {

	private final static transient Logger logger = Logger.getLogger(RecipeReader.class); 
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

	public IRecipe readRecipe(Integer id) {
		return readRecipe(id, Language.English);
	}

	private IRecipe readRecipe(Integer id, Language language) {
		RecipeJson recipe = null;
		try {
			String content = ContentLoader.getItemUrlContent(String.valueOf(id), language);

			recipe = mapper.readValue(content, RecipeJson.class);
			recipe.setLanguage(language);
		} catch (IOException e) {
			logger.error("Caught exception", e);
		}

		return recipe != null ? recipe.getEntity() : null;
	}

}
