package de.getsetsociety.gw2readr.v1.colors;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.ContentLoader;
import de.getsetsociety.gw2readr.v1.colors.interfaces.IColor;
import de.getsetsociety.gw2readr.v1.colors.json.ColorJson;
import de.getsetsociety.gw2readr.v1.colors.json.ColorsJson;

public class AllColorsReader {

	private static final Object lock = new Object();
	private static final transient Logger logger = Logger.getLogger(AllColorsReader.class);
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

	public Map<Integer, IColor> readAllColors() {
		Map<Integer, IColor> colors = new HashMap<Integer, IColor>();
		try {
			String content = ContentLoader.getColorsUrlContent();

			ColorsJson allColors = mapper.readValue(content, ColorsJson.class);
			for (Entry<Integer, ColorJson> e: allColors.getColors().entrySet()) {
				IColor color = e.getValue().getEntity();
				color.setId(e.getKey());
				colors.put(e.getKey(), color);
			}
		} catch (IOException e) {
			logger.error("Caught Exception", e);
		}

		return colors;
	}

}
