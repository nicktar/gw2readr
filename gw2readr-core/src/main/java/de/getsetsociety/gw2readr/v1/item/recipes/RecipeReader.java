package de.getsetsociety.gw2readr.v1.item.recipes;

import java.io.IOException;
import java.util.Map.Entry;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.ContentLoader;
import de.getsetsociety.gw2readr.general.enums.Language;
import de.getsetsociety.gw2readr.v1.item.recipes.interfaces.IRecipe;
import de.getsetsociety.gw2readr.v1.item.recipes.json.RecipeJson;

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

	public IRecipe readRecipe(Integer id, Language language) {
		RecipeJson recipe = null;
		try {
			String content = ContentLoader.getRecipeUrlContent(String.valueOf(id), language);

			recipe = mapper.readValue(content, RecipeJson.class);
			recipe.setLanguage(language);
			if (logger.isDebugEnabled() && !recipe.getAdditionalProperties().isEmpty()) {
				logger.debug("Additional Information of : " + content);
				for (Entry<String, Object> e: recipe.getAdditionalProperties().entrySet()) {
					logger.debug(e.getKey() + ": " +  e.getValue());
				}
			}
		} catch (IOException e) {
			logger.error("Caught exception", e);
		}

		return recipe != null ? recipe.getEntity() : null;
	}

}
