package de.getsetsociety.gw2readr.item.items;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.enums.Language;
import de.getsetsociety.gw2readr.item.ContentLoader;
import de.getsetsociety.gw2readr.item.items.entities.Item;
import de.getsetsociety.gw2readr.item.items.json.ItemJson;

public class ItemReader {

	private static final Logger logger = Logger.getLogger(ItemReader.class);
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

	public Item readItem(Integer id) {
		return readItem(id, Language.English);
	}

	@SuppressWarnings("unchecked")
	public Item readItem(Integer id, Language language) {
		ItemJson<? extends Item> item = null;
		try {
			String content = ContentLoader.getItemUrlContent(String.valueOf(id), language);

			item = mapper.readValue(content, ItemJson.class);
			item.setLanguage(language);
		} catch (IOException e) {
			logger.error("Caught Exception", e);
		}

		return item != null ? item.getEntity() : null;
	}

}
