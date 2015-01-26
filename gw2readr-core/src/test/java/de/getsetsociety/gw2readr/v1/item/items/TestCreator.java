package de.getsetsociety.gw2readr.v1.item.items;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.ObjectMapperProvider;
import de.getsetsociety.gw2readr.v1.item.items.json.BackItemJson;
import de.getsetsociety.gw2readr.v1.item.items.json.ConsumableJson;
import de.getsetsociety.gw2readr.v1.item.items.json.CraftingMaterialJson;
import de.getsetsociety.gw2readr.v1.item.items.json.ItemJson;
import de.getsetsociety.gw2readr.v1.item.items.json.WeaponJson;

public class TestCreator {

	public static void main(String[] args) throws IOException {
		ObjectMapper mapper = ObjectMapperProvider.getMapper();
		BackItemTestCreator bitc = new BackItemTestCreator();
		WeaponTestCreator wtc = new WeaponTestCreator();
		ConsumableTestCreator ctc = new ConsumableTestCreator();
		CraftingMaterialTestCreator cmtc = new CraftingMaterialTestCreator();
		Path allItemsJson = Paths.get("src/test/resources/de/getsetsociety/gw2readr/v1/item/items", "AllItemsJson.txt");
		for (String content: Files.readAllLines(allItemsJson, Charset.forName("UTF-8"))) {
			String maskedContent = content.replace("\\\"", "\"").replace("\\n", "\n");
			System.out.println(maskedContent);
			ItemJson<?> itemJson = mapper.readValue(maskedContent, ItemJson.class);
			if (itemJson instanceof BackItemJson) {
				bitc.createTestCase(content, ((BackItemJson)itemJson).getEntity());
			} else if (itemJson instanceof CraftingMaterialJson) {
				cmtc.createTestCase(content, ((CraftingMaterialJson)itemJson).getEntity());
			} else if (itemJson instanceof WeaponJson) {
				wtc.createTestCase(content, ((WeaponJson)itemJson).getEntity());
			} else if (itemJson instanceof ConsumableJson) {
				ctc.createTestCase(content, ((ConsumableJson)itemJson).getEntity());
			}
		}
		bitc.closeFile();
		cmtc.closeFile();
		wtc.closeFile();
		ctc.closeFile();
	}
}