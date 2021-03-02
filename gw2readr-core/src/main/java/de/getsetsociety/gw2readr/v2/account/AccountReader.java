package de.getsetsociety.gw2readr.v2.account;

import java.io.IOException;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.ContentLoader;
import de.getsetsociety.gw2readr.general.ObjectMapperProvider;
import de.getsetsociety.gw2readr.general.enums.Language;
import de.getsetsociety.gw2readr.v2.account.material.StoredMaterialJson;
import de.getsetsociety.gw2readr.v2.account.material.interfaces.IStoredMaterial;

//@Slf4j
public class AccountReader {

    private static final ObjectMapper OBJECT_MAPPER = ObjectMapperProvider.getMapper();

    public Set<IStoredMaterial> readMaterialStorage(String apiKey) {
        try {
            String content = ContentLoader.getV2StoredMaterialUrlContent(Language.English, apiKey);

            StoredMaterialJson[] material = OBJECT_MAPPER.readValue(content, StoredMaterialJson[].class);
            return Arrays.stream(material)
                         .map(StoredMaterialJson::getEntity)
                         .collect(Collectors.toSet());
            //item.setLanguage(Language.English);
        } catch (IOException e) {
            e.printStackTrace();
            //LOGGER.error("Caught Exception", e);
        }
        return Set.of();
    }
}
