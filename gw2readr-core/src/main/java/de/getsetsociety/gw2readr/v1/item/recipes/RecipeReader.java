package de.getsetsociety.gw2readr.v1.item.recipes;

import java.io.IOException;
import java.util.Map.Entry;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.ContentLoader;
import de.getsetsociety.gw2readr.general.enums.Language;
import de.getsetsociety.gw2readr.v1.item.recipes.interfaces.IRecipe;
import de.getsetsociety.gw2readr.v1.item.recipes.json.RecipeJson;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class RecipeReader {

	private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

	public IRecipe readRecipe(Integer id) {
		return readRecipe(id, Language.English);
	}

	public IRecipe readRecipe(Integer id, Language language) {
		RecipeJson recipe = null;
		try {
			String content = ContentLoader.getRecipeUrlContent(String.valueOf(id), language);

			recipe = OBJECT_MAPPER.readValue(content, RecipeJson.class);
			recipe.setLanguage(language);
			if (!recipe.getAdditionalProperties().isEmpty()) {
				LOGGER.debug(() -> "Additional Information of : " + content);
				for (Entry<String, Object> e : recipe.getAdditionalProperties().entrySet()) {
					LOGGER.debug(() -> e.getKey() + ": " + e.getValue());
				}
			}
		} catch (IOException e) {
			LOGGER.error("Caught exception", e);
		}

		return recipe != null ? recipe.getEntity() : null;
	}

}
