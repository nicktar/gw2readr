package de.getsetsociety.gw2readr.v1.item.items.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v1.item.items.json.ItemJson;

public class TraitTest {

   private static ObjectMapper mapper = new ObjectMapper();
	@Test
	public void testItem65841() {
		try {
			ItemJson item = mapper.readValue("{\"item_id\":\"65841\",\"name\":\"Trait Guide [Prismatic Understanding]\",\"type\":\"Trait\",\"level\":\"0\",\"rarity\":\"Rare\",\"vendor_value\":\"0\",\"icon_file_id\":\"780409\",\"icon_file_signature\":\"2DFB4EDF0408A8604100BB6A510D215CE637B03C\",\"game_types\":[\"Dungeon\",\n\"Pve\",\n\"Pvp\",\n\"PvpLobby\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"NoSalvage\",\n\"NoSell\",\n\"AccountBindOnUse\"],\"restrictions\":[\"Mesmer\"]}", ItemJson.class);
			assertNotNull(item);
		} catch (IOException e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
	}

	@Test
	public void testItem66115() {
		try {
			ItemJson item = mapper.readValue("{\"item_id\":\"66115\",\"name\":\"Trait Guide [Dogged March]\",\"type\":\"Trait\",\"level\":\"0\",\"rarity\":\"Fine\",\"vendor_value\":\"0\",\"icon_file_id\":\"780413\",\"icon_file_signature\":\"07944E932465EF2D624808557257989007D0B5DC\",\"game_types\":[\"Dungeon\",\n\"Pve\",\n\"Pvp\",\n\"PvpLobby\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"NoSalvage\",\n\"NoSell\",\n\"AccountBindOnUse\"],\"restrictions\":[\"Warrior\"]}", ItemJson.class);
			assertNotNull(item);
		} catch (IOException e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
	}

}