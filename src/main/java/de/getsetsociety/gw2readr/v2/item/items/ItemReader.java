package de.getsetsociety.gw2readr.v2.item.items;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.ContentLoader;
import de.getsetsociety.gw2readr.general.enums.Language;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IItem;
import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

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

	public IItem readItem(Integer id) {
		return readItem(id, Language.English);
	}

	@SuppressWarnings("unchecked")
	public IItem readItem(Integer id, Language language) {
		ItemJson<? extends IItem> item = null;
		try {
			String content = ContentLoader.getItemUrlContent(String.valueOf(id), language);

			item = mapper.readValue(content, ItemJson.class);
			item.setLanguage(language);
		} catch (IOException e) {
			logger.error("Caught Exception", e);
		}

		IItem item2 = null;
		if (item != null) {
			item2 = item.getEntity();
		}

		return item2;
	}

}
