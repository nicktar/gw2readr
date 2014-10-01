package de.getsetsociety.gw2readr.v1.item.items;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.ContentLoader;
import de.getsetsociety.gw2readr.general.enums.Language;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseItem;
import de.getsetsociety.gw2readr.v1.item.items.entities.Item;
import de.getsetsociety.gw2readr.v1.item.items.json.ItemJson;

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

	public IBaseItem readItem(Integer id) {
		return readItem(id, Language.English);
	}

	@SuppressWarnings("unchecked")
	public IBaseItem readItem(Integer id, Language language) {
		ItemJson<? extends Item> item = null;
		try {
			String content = ContentLoader.getItemUrlContent(String.valueOf(id), language);

			item = mapper.readValue(content, ItemJson.class);
			item.setLanguage(language);
		} catch (IOException e) {
			logger.error("Caught Exception", e);
		}
		
		IBaseItem item2 = null;
		if (item != null) {
			item2 = item.getEntity();
		}

		return item2;
	}

}
