package de.getsetsociety.gw2readr.v1.build;

import java.io.IOException;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.ContentLoader;
import de.getsetsociety.gw2readr.v1.build.json.BuildJson;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class BuildReader {

	private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

	public Integer readBuild() {
		try {
			String content = ContentLoader.getBuildUrlContent();
			BuildJson build = OBJECT_MAPPER.readValue(content, BuildJson.class);
			if (!build.getAdditionalProperties().isEmpty()) {
				LOGGER.debug(() -> "Additional Information of : " + content);
				LOGGER.debug(() -> build.getAdditionalProperties().entrySet()
				                        .stream()
				                        .map(e -> e.getKey() + ": " + e.getValue())
				                        .collect(Collectors.joining("\n")));
			}
			return build.getBuildId();
		} catch (IOException e) {
			LOGGER.error("Caught exception", e);
		}
		return -1;
	}

}
