package de.getsetsociety.gw2readr.item.items;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.item.items.entities.Item;
import de.getsetsociety.gw2readr.item.items.json.ItemJson;
import  de.getsetsociety.gw2readr.item.ContentLoader;

public class ItemReader {

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

	@SuppressWarnings("unchecked")
	public Item readItem(Integer id) {
		ItemJson<? extends Item> item = null;
		try {
			String content = ContentLoader.getItemUrlContent(String.valueOf(id));

			item = mapper.readValue(content, ItemJson.class);
		} catch (IOException e) {
		}

		return item != null ? item.getEntity() : null;
	}

}
