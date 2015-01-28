package de.getsetsociety.gw2readr.v1.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v0.item.items.enums.ItemFlags;
import de.getsetsociety.gw2readr.v0.item.items.enums.Rarity;
import de.getsetsociety.gw2readr.v0.item.items.enums.RestrictionType;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.ITrait;
import de.getsetsociety.gw2readr.v1.item.items.json.ItemJson;
import de.getsetsociety.gw2readr.v1.item.items.json.TraitJson;

public class TraitTest {

	private static ObjectMapper mapper = new ObjectMapper();

	@Test
	public void testItem65841() {
		try {
			ItemJson<?> item = mapper.readValue("{\"item_id\":\"65841\",\"name\":\"Trait Guide [Prismatic Understanding]\",\"type\":\"Trait\",\"level\":\"0\",\"rarity\":\"Rare\",\"vendor_value\":\"0\",\"icon_file_id\":\"780409\",\"icon_file_signature\":\"2DFB4EDF0408A8604100BB6A510D215CE637B03C\",\"game_types\":[\"Dungeon\",\n\"Pve\",\n\"Pvp\",\n\"PvpLobby\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"NoSalvage\",\n\"NoSell\",\n\"AccountBindOnUse\"],\"restrictions\":[\"Mesmer\"]}", ItemJson.class);
			assertNotNull(item);
			assertTrue(item instanceof TraitJson);
			ITrait trait = ((TraitJson)item).getEntity();
			assertEquals(Integer.valueOf(65841), trait.getId());
			assertEquals("Trait Guide [Prismatic Understanding]", trait.getName());
			assertEquals(Integer.valueOf(0), trait.getLevel());
			assertEquals(Rarity.Rare, trait.getRarity());
			assertEquals(Integer.valueOf(0), trait.getVendorValue());
			assertEquals(Integer.valueOf(780409), trait.getIconFileId());
			assertEquals("2DFB4EDF0408A8604100BB6A510D215CE637B03C", trait.getIconFileSignature());
			assertFalse(trait.getAvailableInActivity());
			assertTrue(trait.getAvailableInDungeon());
			assertTrue(trait.getAvailableInPvE());
			assertTrue(trait.getAvailableInPvP());
			assertTrue(trait.getAvailableInPvPLobby());
			assertTrue(trait.getAvailableInWvW());
			assertEquals(4, trait.getFlags().size());
			assertTrue(trait.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.AccountBound, ItemFlags.NoSalvage, ItemFlags.NoSell, ItemFlags.AccountBindOnUse})));
			assertEquals(1, trait.getRestrictions().size());
			assertTrue(trait.getRestrictions().containsAll(Arrays.asList(new RestrictionType[] {RestrictionType.Mesmer})));
		} catch (IOException e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
	}

	@Test
	public void testItem66115() {
		try {
			ItemJson<?> item = mapper.readValue("{\"item_id\":\"66115\",\"name\":\"Trait Guide [Dogged March]\",\"type\":\"Trait\",\"level\":\"0\",\"rarity\":\"Fine\",\"vendor_value\":\"0\",\"icon_file_id\":\"780413\",\"icon_file_signature\":\"07944E932465EF2D624808557257989007D0B5DC\",\"game_types\":[\"Dungeon\",\n\"Pve\",\n\"Pvp\",\n\"PvpLobby\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"NoSalvage\",\n\"NoSell\",\n\"AccountBindOnUse\"],\"restrictions\":[\"Warrior\"]}", ItemJson.class);
			assertNotNull(item);
			assertTrue(item instanceof TraitJson);
			ITrait trait = ((TraitJson)item).getEntity();
			assertEquals(Integer.valueOf(66115), trait.getId());
			assertEquals("Trait Guide [Dogged March]", trait.getName());
			assertEquals(Integer.valueOf(0), trait.getLevel());
			assertEquals(Rarity.Fine, trait.getRarity());
			assertEquals(Integer.valueOf(0), trait.getVendorValue());
			assertEquals(Integer.valueOf(780413), trait.getIconFileId());
			assertEquals("07944E932465EF2D624808557257989007D0B5DC", trait.getIconFileSignature());
			assertFalse(trait.getAvailableInActivity());
			assertTrue(trait.getAvailableInDungeon());
			assertTrue(trait.getAvailableInPvE());
			assertTrue(trait.getAvailableInPvP());
			assertTrue(trait.getAvailableInPvPLobby());
			assertTrue(trait.getAvailableInWvW());
			assertEquals(4, trait.getFlags().size());
			assertTrue(trait.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.AccountBound, ItemFlags.NoSalvage, ItemFlags.NoSell, ItemFlags.AccountBindOnUse})));
			assertEquals(1, trait.getRestrictions().size());
			assertTrue(trait.getRestrictions().containsAll(Arrays.asList(new RestrictionType[] {RestrictionType.Warrior})));

		} catch (IOException e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
	}

}