package de.getsetsociety.gw2readr.v1.colors;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.ContentLoader;
import de.getsetsociety.gw2readr.v1.colors.interfaces.IColor;
import de.getsetsociety.gw2readr.v1.colors.json.ColorJson;
import de.getsetsociety.gw2readr.v1.colors.json.ColorsJson;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class AllColorsReader {

	private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

	public Map<Integer, IColor> readAllColors() {
		Map<Integer, IColor> colors = new HashMap<>();
		try {
			String content = ContentLoader.getColorsUrlContent();

			ColorsJson allColors = OBJECT_MAPPER.readValue(content, ColorsJson.class);
			for (Entry<Integer, ColorJson> e : allColors.getColors().entrySet()) {
				IColor color = e.getValue().getEntity();
				color.setId(e.getKey());
				colors.put(e.getKey(), color);
			}
		} catch (IOException e) {
			LOGGER.error("Caught Exception", e);
		}

		return colors;
	}

}
