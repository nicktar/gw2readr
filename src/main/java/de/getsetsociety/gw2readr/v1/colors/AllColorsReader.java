package de.getsetsociety.gw2readr.v1.colors;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v1.colors.json.ColorsJson;
import de.getsetsociety.gw2readr.v1.item.ContentLoader;

public class AllColorsReader {

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

	public ColorsJson readAllColors() {
		ColorsJson allColors = null;
		try {
			String content = ContentLoader.getColorsUrlContent();

			allColors = mapper.readValue(content, ColorsJson.class);
		} catch (IOException e) {
		}

		return allColors;
	}

}
