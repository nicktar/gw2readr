package de.getsetsociety.gw2readr.v1.item.items;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.ContentLoader;
import de.getsetsociety.gw2readr.general.enums.Language;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseItem;
import de.getsetsociety.gw2readr.v1.item.items.entities.Item;
import de.getsetsociety.gw2readr.v1.item.items.json.ItemJson;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ItemReader {

	private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

	public IBaseItem readItem(Integer id) {
		return readItem(id, Language.English);
	}

	public IBaseItem readItem(Integer id, Language language) {
		ItemJson<? extends Item> item = null;
		try {
			String content = ContentLoader.getV1ItemUrlContent(String.valueOf(id), language);

			item = OBJECT_MAPPER.readValue(content, ItemJson.class);
			item.setLanguage(language);
		} catch (IOException e) {
			LOGGER.error("Caught Exception", e);
		}

		return item.getEntity();
	}

}
