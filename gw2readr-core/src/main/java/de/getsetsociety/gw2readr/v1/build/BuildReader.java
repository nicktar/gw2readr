package de.getsetsociety.gw2readr.v1.build;

import java.io.IOException;
import java.util.Map.Entry;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.ContentLoader;
import de.getsetsociety.gw2readr.v1.build.json.BuildJson;

public class BuildReader {

	private final static transient Logger logger = Logger.getLogger(BuildReader.class); 
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

	public Integer readBuild() {
		BuildJson build = null;
		String content = null;
		try {
			content = ContentLoader.getBuildUrlContent();
			build = mapper.readValue(content, BuildJson.class); 
			if (logger.isDebugEnabled() && !build.getAdditionalProperties().isEmpty()) {
				logger.debug("Additional Information of : " + content);
				for (Entry<String, Object> e: build.getAdditionalProperties().entrySet()) {
					logger.debug(e.getKey() + ": " + e.getValue());
				}
			}
		} catch (IOException e) {
			logger.error("Caught exception", e);
		}
		return build != null? build.getBuildId(): -1;
	}

}
