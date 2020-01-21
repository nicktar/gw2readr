package de.getsetsociety.gw2readr.v2.item.items;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.ContentLoader;
import de.getsetsociety.gw2readr.general.enums.Language;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IItem;
import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ItemReader {

	private static final Object lock = new Object();
	private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

	public IItem readItem(Integer id) {
		return readItem(Language.English, id);
	}

	public IItem readItem(Language language, Integer id) {
		ItemJson<? extends IItem> item = null;
		try {
			String content = ContentLoader.getV2ItemUrlContent(language, id);

			item = OBJECT_MAPPER.readValue(content, ItemJson.class);
			item.setLanguage(language);
		} catch (IOException e) {
			LOGGER.error("Caught Exception", e);
		}

		return item.getEntity();
	}

	public List<IItem> readItem(Language language, Integer... id) {
		ItemJson<? extends IItem>[] items = null;
		try {
			String content = ContentLoader.getV2ItemUrlContent(language, id);

			items = OBJECT_MAPPER.readValue(content, ItemJson[].class);
		} catch (IOException e) {
			LOGGER.error("Caught Exception", e);
		}

		List<IItem> itemList = null;
		if (items != null) {
			itemList = new ArrayList<>();
			for (ItemJson<? extends IItem> item : items) {
				item.setLanguage(language);
				itemList.add(item.getEntity());
			}
		}

		return itemList;
	}
}
