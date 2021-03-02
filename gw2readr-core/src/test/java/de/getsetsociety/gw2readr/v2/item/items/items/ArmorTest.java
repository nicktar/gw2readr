package de.getsetsociety.gw2readr.v2.item.items.items;

import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v0.item.items.enums.*;
import de.getsetsociety.gw2readr.v2.item.items.entities.AttributeModifier;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IArmor;
import de.getsetsociety.gw2readr.v2.item.items.json.ArmorJson;
import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class ArmorTest {

    private static final ObjectMapper mapper = new ObjectMapper();

    @Test
    public void testArmor000077() throws JsonProcessingException {
        String content = "{\"name\":\"Mighty Studded Coat\",\"type\":\"Armor\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"default_skin\":17,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NotUpgradeable\"],\"restrictions\":[],\"id\":77,\"icon\":\"https://render.guildwars2.com/file/5050F9A0AAA5324F0501B7944876F0FA29DCEB97/61008.png\",\"details\":{\"type\":\"Coat\",\"weight_class\":\"Medium\",\"defense\":26,\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":5}]},\"secondary_suffix_item_id\":\"\"}}";
        ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
        assertNotNull(itemJson);
        assertTrue(itemJson instanceof ArmorJson);
        IArmor armor = (IArmor) itemJson.getEntity();
        assertEquals(ArmorType.Coat, armor.getArmorType());
        assertTrue(armor.getAvailableInActivity());
        assertTrue(armor.getAvailableInDungeon());
        assertTrue(armor.getAvailableInPvE());
        assertFalse(armor.getAvailableInPvP());
        assertFalse(armor.getAvailableInPvPLobby());
        assertTrue(armor.getAvailableInWvW());
        assertEquals(Integer.valueOf(26), armor.getDefense());
        assertThat(armor.getDescription(), isEmptyOrNullString());
        assertFalse(armor.getFlags().isEmpty());
        assertEquals(1, armor.getFlags().size());
        assertTrue(armor.getFlags().containsAll(Arrays.asList(ItemFlags.NOT_UPGRADEABLE)));
        assertEquals(Integer.valueOf(77), armor.getId());
        assertNotNull(armor.getInfixUpgrade());
        assertEquals(1, armor.getInfixUpgrade().getAttributes().size());
        assertTrue(armor.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier(Attribute.POWER, 5))));
        assertTrue(armor.getInfusionSlots().isEmpty());
        assertEquals(Integer.valueOf(0), armor.getLevel());
        assertEquals("Mighty Studded Coat", armor.getName());
        assertEquals(Rarity.BASIC, armor.getRarity());
        assertNull(armor.getSuffixItemId());
        assertEquals(WeightClass.Medium, armor.getWeightClass());
        assertEquals(Integer.valueOf(7), armor.getVendorValue());
        assertTrue(armor.getRestrictions().isEmpty());

    }

    @Test
    public void testArmor000084() {
        String content = "{\"name\":\"Zhed's Coat\",\"description\":\"\",\"type\":\"Armor\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":396,\"default_skin\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":84,\"icon\":\"https://render.guildwars2.com/file/FB0AA64F98303AE5112408EF3DC8C7307EA118F8/61011.png\",\"details\":{\"type\":\"Coat\",\"weight_class\":\"Light\",\"defense\":314,\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":101},{\"attribute\":\"Precision\",\"modifier\":72},{\"attribute\":\"CritDamage\",\"modifier\":72}]},\"suffix_item_id\":24788,\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ArmorJson);
            IArmor armor = (IArmor) itemJson.getEntity();
            assertEquals(ArmorType.Coat, armor.getArmorType());
            assertTrue(armor.getAvailableInActivity());
            assertTrue(armor.getAvailableInDungeon());
            assertTrue(armor.getAvailableInPvE());
            assertFalse(armor.getAvailableInPvP());
            assertFalse(armor.getAvailableInPvPLobby());
            assertTrue(armor.getAvailableInWvW());
            assertEquals(Integer.valueOf(314), armor.getDefense());
            assertEquals("", armor.getDescription());
            assertFalse(armor.getFlags().isEmpty());
            assertEquals(2, armor.getFlags().size());
            assertTrue(armor.getFlags().containsAll(Arrays.asList(ItemFlags.HIDE_SUFFIX, ItemFlags.SOUL_BIND_ON_USE)));
            assertEquals(Integer.valueOf(84), armor.getId());
            assertNotNull(armor.getInfixUpgrade());
            assertEquals(3, armor.getInfixUpgrade().getAttributes().size());
            assertTrue(armor.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier(Attribute.POWER, 101), new AttributeModifier(Attribute.PRECISION, 72), new AttributeModifier(Attribute.CRIT_DAMAGE, 72))));
            assertTrue(armor.getInfusionSlots().isEmpty());
            assertEquals(Integer.valueOf(80), armor.getLevel());
            assertEquals("Zhed's Coat", armor.getName());
            assertEquals(Rarity.EXOTIC, armor.getRarity());
            assertEquals(Integer.valueOf(24788), armor.getSuffixItemId());
            assertEquals(WeightClass.Light, armor.getWeightClass());
			assertEquals(Integer.valueOf(396), armor.getVendorValue());
			assertTrue(armor.getRestrictions().isEmpty());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
	}
	@Test
	public void testArmor000141() {
		String content = "{\"name\":\"Mighty Swindler Mask\",\"description\":\"\",\"type\":\"Armor\",\"level\":16,\"rarity\":\"Fine\",\"vendor_value\":25,\"default_skin\":97,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":141,\"icon\":\"https://render.guildwars2.com/file/F1D496205002073C9656A7E6E7550D0041045F0E/61016.png\",\"details\":{\"type\":\"Helm\",\"weight_class\":\"Medium\",\"defense\":15,\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":5}]},\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof ArmorJson);
			IArmor armor = (IArmor)itemJson.getEntity();
			assertEquals(ArmorType.Helm, armor.getArmorType());
			assertTrue(armor.getAvailableInActivity());
			assertTrue(armor.getAvailableInDungeon());
			assertTrue(armor.getAvailableInPvE());
			assertFalse(armor.getAvailableInPvP());
			assertFalse(armor.getAvailableInPvPLobby());
			assertTrue(armor.getAvailableInWvW());
			assertEquals(Integer.valueOf(15), armor.getDefense());
			assertEquals("", armor.getDescription());
			assertTrue(armor.getFlags().isEmpty());
			assertEquals(Integer.valueOf(141), armor.getId());
			assertNotNull(armor.getInfixUpgrade());
			assertEquals(1, armor.getInfixUpgrade().getAttributes().size());
			assertTrue(armor.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier(Attribute.POWER, 5))));
			assertTrue(armor.getInfusionSlots().isEmpty());
			assertEquals(Integer.valueOf(16), armor.getLevel());
			assertEquals("Mighty Swindler Mask", armor.getName());
			assertEquals(Rarity.FINE, armor.getRarity());
			assertNull(armor.getSuffixItemId());
			assertEquals(WeightClass.Medium, armor.getWeightClass());
			assertEquals(Integer.valueOf(25), armor.getVendorValue());
			assertTrue(armor.getRestrictions().isEmpty());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
	}
	@Test
	public void testArmor000098() {
        String content = "{\"name\":\"Berserker's Reinforced Scale Boots\",\"description\":\"\",\"type\":\"Armor\",\"level\":71,\"rarity\":\"Fine\",\"vendor_value\":59,\"default_skin\":74,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":98,\"icon\":\"https://render.guildwars2.com/file/17C9516D0F0B2EBA616ED794C00F59411E931702/61014.png\",\"details\":{\"type\":\"Boots\",\"weight_class\":\"Heavy\",\"defense\":116,\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":21},{\"attribute\":\"Precision\",\"modifier\":15},{\"attribute\":\"CritDamage\",\"modifier\":15}]},\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ArmorJson);
            IArmor armor = (IArmor) itemJson.getEntity();
            assertEquals(ArmorType.Boots, armor.getArmorType());
            assertTrue(armor.getAvailableInActivity());
            assertTrue(armor.getAvailableInDungeon());
            assertTrue(armor.getAvailableInPvE());
            assertFalse(armor.getAvailableInPvP());
            assertFalse(armor.getAvailableInPvPLobby());
            assertTrue(armor.getAvailableInWvW());
            assertEquals(Integer.valueOf(116), armor.getDefense());
            assertEquals("", armor.getDescription());
            assertTrue(armor.getFlags().isEmpty());
            assertEquals(Integer.valueOf(98), armor.getId());
            assertNotNull(armor.getInfixUpgrade());
            assertEquals(3, armor.getInfixUpgrade().getAttributes().size());
            assertTrue(armor.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier(Attribute.POWER, 21), new AttributeModifier(Attribute.PRECISION, 15), new AttributeModifier(Attribute.CRIT_DAMAGE, 15))));
            assertTrue(armor.getInfusionSlots().isEmpty());
            assertEquals(Integer.valueOf(71), armor.getLevel());
            assertEquals("Berserker's Reinforced Scale Boots", armor.getName());
            assertEquals(Rarity.FINE, armor.getRarity());
            assertNull(armor.getSuffixItemId());
            assertEquals(WeightClass.Heavy, armor.getWeightClass());
            assertEquals(Integer.valueOf(59), armor.getVendorValue());
            assertTrue(armor.getRestrictions().isEmpty());
        } catch (Exception e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }
	@Test
	public void testArmor000127() {
		String content = "{\"name\":\"Sneakthief Mask of the Centaur\",\"description\":\"\",\"type\":\"Armor\",\"level\":75,\"rarity\":\"Exotic\",\"vendor_value\":310,\"default_skin\":95,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":127,\"icon\":\"https://render.guildwars2.com/file/65A0C7367206E6CE4EC7C8CBE07EABAE0191BFBA/561548.png\",\"details\":{\"type\":\"Helm\",\"weight_class\":\"Medium\",\"defense\":89,\"infusion_slots\":[],\"suffix_item_id\":24788,\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof ArmorJson);
			IArmor armor = (IArmor)itemJson.getEntity();
			assertEquals(ArmorType.Helm, armor.getArmorType());
			assertTrue(armor.getAvailableInActivity());
			assertTrue(armor.getAvailableInDungeon());
			assertTrue(armor.getAvailableInPvE());
			assertFalse(armor.getAvailableInPvP());
			assertFalse(armor.getAvailableInPvPLobby());
			assertTrue(armor.getAvailableInWvW());
			assertEquals(Integer.valueOf(89), armor.getDefense());
			assertEquals("", armor.getDescription());
			assertFalse(armor.getFlags().isEmpty());
			assertEquals(2, armor.getFlags().size());
			assertTrue(armor.getFlags().containsAll(Arrays.asList(ItemFlags.ACCOUNT_BOUND, ItemFlags.SOUL_BIND_ON_USE)));
			assertEquals(Integer.valueOf(127), armor.getId());
			assertNotNull(armor.getInfixUpgrade());
			assertEquals(0, armor.getInfixUpgrade().getAttributes().size());
			assertTrue(armor.getInfusionSlots().isEmpty());
			assertEquals(Integer.valueOf(75), armor.getLevel());
			assertEquals("Sneakthief Mask of the Centaur", armor.getName());
			assertEquals(Rarity.EXOTIC, armor.getRarity());
			assertEquals(Integer.valueOf(24788), armor.getSuffixItemId());
			assertEquals(WeightClass.Medium, armor.getWeightClass());
			assertEquals(Integer.valueOf(310), armor.getVendorValue());
			assertTrue(armor.getRestrictions().isEmpty());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
	}
	@Test
	public void testArmor000639() {
        String content = "{\"name\":\"Berserker's Sneakthief Shoulderguards of Balthazar\",\"description\":\"\",\"type\":\"Armor\",\"level\":70,\"rarity\":\"Exotic\",\"vendor_value\":260,\"default_skin\":47,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulBindOnUse\"],\"restrictions\":[],\"id\":639,\"icon\":\"https://render.guildwars2.com/file/EF97346C5442020AFAAAF016182F0CF00E989703/561551.png\",\"details\":{\"type\":\"Shoulders\",\"weight_class\":\"Medium\",\"defense\":81,\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":27},{\"attribute\":\"Precision\",\"modifier\":20},{\"attribute\":\"CritDamage\",\"modifier\":20}]},\"suffix_item_id\":24765,\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ArmorJson);
            IArmor armor = (IArmor) itemJson.getEntity();
            assertEquals(ArmorType.Shoulders, armor.getArmorType());
            assertTrue(armor.getAvailableInActivity());
            assertTrue(armor.getAvailableInDungeon());
            assertTrue(armor.getAvailableInPvE());
            assertFalse(armor.getAvailableInPvP());
            assertFalse(armor.getAvailableInPvPLobby());
            assertTrue(armor.getAvailableInWvW());
            assertEquals(Integer.valueOf(81), armor.getDefense());
            assertEquals("", armor.getDescription());
            assertFalse(armor.getFlags().isEmpty());
            assertEquals(1, armor.getFlags().size());
            assertTrue(armor.getFlags().containsAll(Arrays.asList(ItemFlags.SOUL_BIND_ON_USE)));
            assertEquals(Integer.valueOf(639), armor.getId());
            assertNotNull(armor.getInfixUpgrade());
            assertEquals(3, armor.getInfixUpgrade().getAttributes().size());
            assertTrue(armor.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier(Attribute.POWER, 27), new AttributeModifier(Attribute.PRECISION, 20), new AttributeModifier(Attribute.CRIT_DAMAGE, 20))));
            assertTrue(armor.getInfusionSlots().isEmpty());
            assertEquals(Integer.valueOf(70), armor.getLevel());
            assertEquals("Berserker's Sneakthief Shoulderguards of Balthazar", armor.getName());
            assertEquals(Rarity.EXOTIC, armor.getRarity());
            assertEquals(Integer.valueOf(24765), armor.getSuffixItemId());
            assertEquals(WeightClass.Medium, armor.getWeightClass());
            assertEquals(Integer.valueOf(260), armor.getVendorValue());
            assertTrue(armor.getRestrictions().isEmpty());
        } catch (Exception e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }
	@Test
	public void testArmor000653() {
		String content = "{\"name\":\"Mighty Studded Gloves\",\"description\":\"\",\"type\":\"Armor\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"default_skin\":59,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NotUpgradeable\"],\"restrictions\":[],\"id\":653,\"icon\":\"https://render.guildwars2.com/file/07A941314810F9342BBBE2970450E1FFE2227430/61031.png\",\"details\":{\"type\":\"Gloves\",\"weight_class\":\"Medium\",\"defense\":12,\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":1}]},\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof ArmorJson);
			IArmor armor = (IArmor)itemJson.getEntity();
			assertEquals(ArmorType.Gloves, armor.getArmorType());
			assertTrue(armor.getAvailableInActivity());
			assertTrue(armor.getAvailableInDungeon());
			assertTrue(armor.getAvailableInPvE());
			assertFalse(armor.getAvailableInPvP());
			assertFalse(armor.getAvailableInPvPLobby());
			assertTrue(armor.getAvailableInWvW());
			assertEquals(Integer.valueOf(12), armor.getDefense());
			assertEquals("", armor.getDescription());
			assertFalse(armor.getFlags().isEmpty());
			assertEquals(1, armor.getFlags().size());
			assertTrue(armor.getFlags().containsAll(Arrays.asList(ItemFlags.NOT_UPGRADEABLE)));
			assertEquals(Integer.valueOf(653), armor.getId());
			assertNotNull(armor.getInfixUpgrade());
			assertEquals(1, armor.getInfixUpgrade().getAttributes().size());
			assertTrue(armor.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier(Attribute.POWER, 1))));
			assertTrue(armor.getInfusionSlots().isEmpty());
			assertEquals(Integer.valueOf(0), armor.getLevel());
			assertEquals("Mighty Studded Gloves", armor.getName());
			assertEquals(Rarity.BASIC, armor.getRarity());
			assertNull(armor.getSuffixItemId());
			assertEquals(WeightClass.Medium, armor.getWeightClass());
			assertEquals(Integer.valueOf(4), armor.getVendorValue());
			assertTrue(armor.getRestrictions().isEmpty());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
	}
	@Test
	public void testArmor001218() {
        String content = "{\"name\":\"Berserker's Sneakthief Leggings of Infiltration\",\"description\":\"\",\"type\":\"Armor\",\"level\":76,\"rarity\":\"Exotic\",\"vendor_value\":353,\"default_skin\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulBindOnUse\"],\"restrictions\":[],\"id\":1218,\"icon\":\"https://render.guildwars2.com/file/DD4D5CEC01DD45E656A7B6DA540161385D78B2B8/561553.png\",\"details\":{\"type\":\"Leggings\",\"weight_class\":\"Medium\",\"defense\":203,\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":62},{\"attribute\":\"Precision\",\"modifier\":44},{\"attribute\":\"CritDamage\",\"modifier\":44}]},\"suffix_item_id\":24703,\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ArmorJson);
            IArmor armor = (IArmor) itemJson.getEntity();
            assertEquals(ArmorType.Leggings, armor.getArmorType());
            assertTrue(armor.getAvailableInActivity());
            assertTrue(armor.getAvailableInDungeon());
            assertTrue(armor.getAvailableInPvE());
            assertFalse(armor.getAvailableInPvP());
            assertFalse(armor.getAvailableInPvPLobby());
            assertTrue(armor.getAvailableInWvW());
            assertEquals(Integer.valueOf(203), armor.getDefense());
            assertEquals("", armor.getDescription());
            assertFalse(armor.getFlags().isEmpty());
            assertEquals(1, armor.getFlags().size());
            assertTrue(armor.getFlags().containsAll(Arrays.asList(ItemFlags.SOUL_BIND_ON_USE)));
            assertEquals(Integer.valueOf(1218), armor.getId());
            assertNotNull(armor.getInfixUpgrade());
            assertEquals(3, armor.getInfixUpgrade().getAttributes().size());
            assertTrue(armor.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier(Attribute.POWER, 62), new AttributeModifier(Attribute.PRECISION, 44), new AttributeModifier(Attribute.CRIT_DAMAGE, 44))));
            assertTrue(armor.getInfusionSlots().isEmpty());
            assertEquals(Integer.valueOf(76), armor.getLevel());
            assertEquals("Berserker's Sneakthief Leggings of Infiltration", armor.getName());
            assertEquals(Rarity.EXOTIC, armor.getRarity());
            assertEquals(Integer.valueOf(24703), armor.getSuffixItemId());
            assertEquals(WeightClass.Medium, armor.getWeightClass());
            assertEquals(Integer.valueOf(353), armor.getVendorValue());
            assertTrue(armor.getRestrictions().isEmpty());
        } catch (Exception e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }
}
