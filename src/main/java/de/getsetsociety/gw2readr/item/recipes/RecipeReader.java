package de.getsetsociety.gw2readr.item.recipes;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.enums.Language;
import de.getsetsociety.gw2readr.item.ContentLoader;
import de.getsetsociety.gw2readr.item.recipes.interfaces.IBaseRecipe;
import de.getsetsociety.gw2readr.item.recipes.json.RecipeJson;

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

	public IBaseRecipe readRecipe(Integer id) {
		RecipeJson recipe = null;
		try {
			String content = ContentLoader.getItemUrlContent(String.valueOf(id), Language.English);

			recipe = mapper.readValue(content, RecipeJson.class);
		} catch (IOException e) {
			logger.error("Caught exception", e);
		}

		return recipe != null ? recipe.getEntity() : null;
	}

}
