package de.getsetsociety.gw2readr.general;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperProvider {

	private static final Object lock = new Object();

	private static volatile ObjectMapper mapper;

	/**
	 * @return the mapper
	 */
	public static ObjectMapper getMapper() {
		if (mapper == null) {
			synchronized (lock) {
				if (mapper == null) {
					JsonFactory jasonFactory = new JsonFactory();
					jasonFactory.enable(Feature.ALLOW_UNQUOTED_CONTROL_CHARS);
					mapper = new ObjectMapper(jasonFactory);
				}
			}
		}
		return mapper;
	}


}
