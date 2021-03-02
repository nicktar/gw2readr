package de.getsetsociety.gw2readr.general;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonFactoryBuilder;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Synchronized;

public class ObjectMapperProvider {

    private static ObjectMapper mapper;

    /**
     * @return the mapper
     */
    @Synchronized
    public static ObjectMapper getMapper() {
        if (mapper == null) {
            JsonFactory factory = new JsonFactoryBuilder()
                    .enable(JsonReadFeature.ALLOW_UNESCAPED_CONTROL_CHARS)
                    .build();
            mapper = new ObjectMapper(factory);
        }
        return mapper;
    }


}
