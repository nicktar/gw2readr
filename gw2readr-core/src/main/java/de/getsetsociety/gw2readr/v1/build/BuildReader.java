package de.getsetsociety.gw2readr.v1.build;

import java.io.IOException;
import java.util.Map.Entry;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.ContentLoader;
import de.getsetsociety.gw2readr.v1.build.json.BuildJson;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class BuildReader {

	private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

	public Integer readBuild() {
		BuildJson build = null;
		String content = null;
		try {
			content = ContentLoader.getBuildUrlContent();
			build = OBJECT_MAPPER.readValue(content, BuildJson.class);
			if (LOGGER.isDebugEnabled() && !build.getAdditionalProperties().isEmpty()) {
				LOGGER.debug("Additional Information of : " + content);
				for (Entry<String, Object> e : build.getAdditionalProperties().entrySet()) {
					LOGGER.debug(e.getKey() + ": " + e.getValue());
				}
			}
		} catch (IOException e) {
			LOGGER.error("Caught exception", e);
		}
		return build != null? build.getBuildId(): -1;
	}

}
