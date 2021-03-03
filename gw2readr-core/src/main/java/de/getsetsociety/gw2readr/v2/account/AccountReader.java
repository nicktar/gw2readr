package de.getsetsociety.gw2readr.v2.account;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.ContentLoader;
import de.getsetsociety.gw2readr.general.ObjectMapperProvider;
import de.getsetsociety.gw2readr.v2.account.inventory.interfaces.IInventoryItem;
import de.getsetsociety.gw2readr.v2.account.inventory.json.InventoryItemJson;
import de.getsetsociety.gw2readr.v2.account.inventory.materialstorage.interfaces.IStoredMaterial;
import de.getsetsociety.gw2readr.v2.account.inventory.materialstorage.json.StoredMaterialJson;
import de.getsetsociety.gw2readr.v2.item.items.json.IEntityWrapper;

//@Slf4j
public class AccountReader {

    private static final ObjectMapper OBJECT_MAPPER = ObjectMapperProvider.getMapper();

    public Set<IStoredMaterial> readMaterialStorage(String apiKey) {
        try {
            String content = ContentLoader.getV2StoredMaterialUrlContent(apiKey);

            StoredMaterialJson[] material = OBJECT_MAPPER.readValue(content, StoredMaterialJson[].class);
            return Arrays.stream(material)
                         .map(StoredMaterialJson::getEntity)
                         .collect(Collectors.toSet());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Set.of();
    }

    public List<Optional<IInventoryItem>> readBank(String apiKey) {
        try {
            String content = ContentLoader.getV2BankUrlContent(apiKey);

            InventoryItemJson[] items = OBJECT_MAPPER.readValue(content, InventoryItemJson[].class);
            return Arrays.stream(items)
                         .map(Optional::ofNullable)
                         .map(o -> o.map(IEntityWrapper::getEntity))
                         .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return List.of();
    }
}
