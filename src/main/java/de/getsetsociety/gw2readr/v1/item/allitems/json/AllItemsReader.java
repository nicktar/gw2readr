package de.getsetsociety.gw2readr.v1.item.allitems.json;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.ContentLoader;

public class AllItemsReader {

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

	public List<Integer> readAllItems() {
		AllItems allItems = null;
		try {
			String content = ContentLoader.getV1ItemsUrlContent();

			allItems = mapper.readValue(content, AllItems.class);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return allItems != null ? allItems.getItems() : null;
	}

}
