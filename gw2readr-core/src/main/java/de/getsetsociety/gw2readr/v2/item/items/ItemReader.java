package de.getsetsociety.gw2readr.v2.item.items;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.ContentLoader;
import de.getsetsociety.gw2readr.general.enums.Language;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IItem;
import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ItemReader {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    public IItem readItem(Integer id) {
        return readItem(Language.English, id, ItemJson.class);
    }

    public <T extends ItemJson<V>, V extends IItem> V readItem(Language language, Integer id, Class<T> clazz) {
        try {
            String content = ContentLoader.getV2ItemUrlContent(language, id);

            T item = OBJECT_MAPPER.readValue(content, clazz);
            item.setLanguage(language);
            return item.getEntity();
        } catch (IOException e) {
            LOGGER.error("Caught Exception", e);
        }
        return null;
    }
}
