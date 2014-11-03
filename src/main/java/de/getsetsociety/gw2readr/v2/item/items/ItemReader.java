package de.getsetsociety.gw2readr.v2.item.items;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.ContentLoader;
import de.getsetsociety.gw2readr.general.enums.Language;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IItem;
import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class ItemReader {

    private static final Logger logger = Logger.getLogger(ItemReader.class);
    private static final Object lock = new Object();
    private volatile static ObjectMapper mapper;
    {
        {
            if (mapper == null) {
                synchronized (lock) {
                    if (mapper == null) {
                        mapper = new ObjectMapper();
                    }
                }
            }
        }
    }

    public IItem readItem(Integer id) {
        return readItem(Language.English, id);
    }

    @SuppressWarnings("unchecked")
    public IItem readItem(Language language, Integer id) {
        ItemJson<? extends IItem> item = null;
        try {
            String content = ContentLoader.getV2ItemUrlContent(language, id);

            item = mapper.readValue(content, ItemJson.class);
            item.setLanguage(language);
        } catch (IOException e) {
            logger.error("Caught Exception", e);
        }

        IItem item2 = null;
        if (item != null) {
            item2 = item.getEntity();
        }

        return item2;
    }

    @SuppressWarnings("unchecked")
    public List<IItem> readItem(Language language, Integer... id) {
        ItemJson<? extends IItem>[] items = null;
        try {
            String content = ContentLoader.getV2ItemUrlContent(language, id);

            items = mapper.readValue(content, ItemJson[].class);
        } catch (IOException e) {
            logger.error("Caught Exception", e);
        }

        List<IItem> itemList = null;
        if (items != null) {
            itemList = new ArrayList<>();
            for (ItemJson<? extends IItem> item : items) {
                item.setLanguage(language);
                itemList.add(item.getEntity());
            }
        }

        return itemList;
    }
}
