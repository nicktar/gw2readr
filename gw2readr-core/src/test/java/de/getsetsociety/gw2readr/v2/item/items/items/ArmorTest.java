package de.getsetsociety.gw2readr.v2.item.items.items;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v0.item.items.enums.ArmorType;
import de.getsetsociety.gw2readr.v0.item.items.enums.Attribute;
import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.v0.item.items.enums.ItemFlags;
import de.getsetsociety.gw2readr.v0.item.items.enums.Rarity;
import de.getsetsociety.gw2readr.v0.item.items.enums.RestrictionType;
import de.getsetsociety.gw2readr.v0.item.items.enums.WeightClass;
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
        assertNull(armor.getDescription());
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
	@Test
	public void testArmor003533() {
		String content = "{\"name\":\"Honed Warband Hauberk\",\"type\":\"Armor\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":1000,\"default_skin\":328,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[\"Charr\"],\"id\":3533,\"icon\":\"https://render.guildwars2.com/file/44AB230963079CBEE45F44AFBC6F6A6ABB0A383D/455468.png\",\"details\":{\"type\":\"Coat\",\"weight_class\":\"Heavy\",\"defense\":117,\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":29},{\"attribute\":\"CritDamage\",\"modifier\":21}]},\"secondary_suffix_item_id\":\"\"}}";
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
            assertEquals(Integer.valueOf(117), armor.getDefense());
            assertNull(armor.getDescription());
            assertFalse(armor.getFlags().isEmpty());
            assertEquals(2, armor.getFlags().size());
            assertTrue(armor.getFlags().containsAll(Arrays.asList(ItemFlags.SOUL_BIND_ON_ACQUIRE, ItemFlags.SOUL_BIND_ON_USE)));
            assertEquals(Integer.valueOf(3533), armor.getId());
            assertNotNull(armor.getInfixUpgrade());
            assertEquals(2, armor.getInfixUpgrade().getAttributes().size());
            assertTrue(armor.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier(Attribute.POWER, 29), new AttributeModifier(Attribute.CRIT_DAMAGE, 21))));
            assertTrue(armor.getInfusionSlots().isEmpty());
            assertEquals(Integer.valueOf(35), armor.getLevel());
            assertEquals("Honed Warband Hauberk", armor.getName());
            assertEquals(Rarity.RARE, armor.getRarity());
            assertNull(armor.getSuffixItemId());
            assertEquals(WeightClass.Heavy, armor.getWeightClass());
            assertEquals(Integer.valueOf(1000), armor.getVendorValue());
            assertFalse(armor.getRestrictions().isEmpty());
            assertEquals(1, armor.getRestrictions().size());
            assertTrue(armor.getRestrictions().containsAll(Arrays.asList(RestrictionType.CHARR)));
        } catch (Exception e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
	}
	@Test
	public void testArmor003558() {
		String content = "{\"name\":\"Rampager's Protector's Chausses\",\"type\":\"Armor\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":31250,\"default_skin\":410,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[\"Human\"],\"id\":3558,\"icon\":\"https://render.guildwars2.com/file/43B608E1136509D3C9417854EB75CFEC0C01AA71/61150.png\",\"details\":{\"type\":\"Leggings\",\"weight_class\":\"Heavy\",\"defense\":214,\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":42},{\"attribute\":\"Precision\",\"modifier\":59},{\"attribute\":\"ConditionDamage\",\"modifier\":42}]},\"secondary_suffix_item_id\":\"\"}}";
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
            assertEquals(Integer.valueOf(214), armor.getDefense());
            assertNull(armor.getDescription());
            assertFalse(armor.getFlags().isEmpty());
            assertEquals(2, armor.getFlags().size());
            assertTrue(armor.getFlags().containsAll(Arrays.asList(ItemFlags.SOUL_BIND_ON_ACQUIRE, ItemFlags.SOUL_BIND_ON_USE)));
            assertEquals(Integer.valueOf(3558), armor.getId());
            assertNotNull(armor.getInfixUpgrade());
            assertEquals(3, armor.getInfixUpgrade().getAttributes().size());
            assertTrue(armor.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier(Attribute.POWER, 42), new AttributeModifier(Attribute.PRECISION, 59), new AttributeModifier(Attribute.CONDITION_DAMAGE, 42))));
            assertTrue(armor.getInfusionSlots().isEmpty());
            assertEquals(Integer.valueOf(80), armor.getLevel());
            assertEquals("Rampager's Protector's Chausses", armor.getName());
            assertEquals(Rarity.RARE, armor.getRarity());
            assertNull(armor.getSuffixItemId());
            assertEquals(WeightClass.Heavy, armor.getWeightClass());
            assertEquals(Integer.valueOf(31250), armor.getVendorValue());
            assertFalse(armor.getRestrictions().isEmpty());
            assertEquals(1, armor.getRestrictions().size());
            assertTrue(armor.getRestrictions().containsAll(Arrays.asList(RestrictionType.HUMAN)));
        } catch (Exception e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
	}
	@Test
	public void testArmor003527() {
		String content = "{\"name\":\"Carrion Savant Boots\",\"type\":\"Armor\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":15000,\"default_skin\":314,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[\"Asura\"],\"id\":3527,\"icon\":\"https://render.guildwars2.com/file/49C89610F065FEE19D0336BCC74F98E3193644EF/414917.png\",\"details\":{\"type\":\"Boots\",\"weight_class\":\"Light\",\"defense\":118,\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":30},{\"attribute\":\"Power\",\"modifier\":21},{\"attribute\":\"Vitality\",\"modifier\":21}]},\"secondary_suffix_item_id\":\"\"}}";
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
            assertEquals(Integer.valueOf(118), armor.getDefense());
            assertNull(armor.getDescription());
            assertFalse(armor.getFlags().isEmpty());
            assertEquals(2, armor.getFlags().size());
            assertTrue(armor.getFlags().containsAll(Arrays.asList(ItemFlags.SOUL_BIND_ON_ACQUIRE, ItemFlags.SOUL_BIND_ON_USE)));
            assertEquals(Integer.valueOf(3527), armor.getId());
            assertNotNull(armor.getInfixUpgrade());
            assertEquals(3, armor.getInfixUpgrade().getAttributes().size());
            assertTrue(armor.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier(Attribute.CONDITION_DAMAGE, 30), new AttributeModifier(Attribute.POWER, 21), new AttributeModifier(Attribute.VITALITY, 21))));
            assertTrue(armor.getInfusionSlots().isEmpty());
            assertEquals(Integer.valueOf(80), armor.getLevel());
            assertEquals("Carrion Savant Boots", armor.getName());
            assertEquals(Rarity.RARE, armor.getRarity());
            assertNull(armor.getSuffixItemId());
            assertEquals(WeightClass.Light, armor.getWeightClass());
            assertEquals(Integer.valueOf(15000), armor.getVendorValue());
            assertFalse(armor.getRestrictions().isEmpty());
            assertEquals(1, armor.getRestrictions().size());
            assertTrue(armor.getRestrictions().containsAll(Arrays.asList(RestrictionType.ASURA)));
        } catch (Exception e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
	}
	@Test
	public void testArmor003566() {
		String content = "{\"name\":\"Vigorous Wolfborn Boots\",\"type\":\"Armor\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":425,\"default_skin\":452,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[\"Norn\"],\"id\":3566,\"icon\":\"https://render.guildwars2.com/file/657FD112604B9148CE1BB5E6A2695B1179566530/414927.png\",\"details\":{\"type\":\"Boots\",\"weight_class\":\"Medium\",\"defense\":51,\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":10},{\"attribute\":\"Vitality\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}";
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
            assertEquals(Integer.valueOf(51), armor.getDefense());
            assertNull(armor.getDescription());
            assertFalse(armor.getFlags().isEmpty());
            assertEquals(2, armor.getFlags().size());
            assertTrue(armor.getFlags().containsAll(Arrays.asList(ItemFlags.SOUL_BIND_ON_ACQUIRE, ItemFlags.SOUL_BIND_ON_USE)));
            assertEquals(Integer.valueOf(3566), armor.getId());
            assertNotNull(armor.getInfixUpgrade());
            assertEquals(2, armor.getInfixUpgrade().getAttributes().size());
            assertTrue(armor.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier(Attribute.POWER, 10), new AttributeModifier(Attribute.VITALITY, 7))));
            assertTrue(armor.getInfusionSlots().isEmpty());
            assertEquals(Integer.valueOf(35), armor.getLevel());
            assertEquals("Vigorous Wolfborn Boots", armor.getName());
            assertEquals(Rarity.RARE, armor.getRarity());
            assertNull(armor.getSuffixItemId());
            assertEquals(WeightClass.Medium, armor.getWeightClass());
            assertEquals(Integer.valueOf(425), armor.getVendorValue());
            assertFalse(armor.getRestrictions().isEmpty());
            assertEquals(1, armor.getRestrictions().size());
            assertTrue(armor.getRestrictions().containsAll(Arrays.asList(RestrictionType.NORN)));
        } catch (Exception e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
	}
	@Test
	public void testArmor003652() {
		String content = "{\"name\":\"Rabid Nightshade Leggings\",\"type\":\"Armor\",\"level\":60,\"rarity\":\"Rare\",\"vendor_value\":1875,\"default_skin\":503,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[\"Sylvari\"],\"id\":3652,\"icon\":\"https://render.guildwars2.com/file/7F989F0413565A7046BACFE22C5BE62A9C1A7EA0/414945.png\",\"details\":{\"type\":\"Leggings\",\"weight_class\":\"Medium\",\"defense\":130,\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":39},{\"attribute\":\"Precision\",\"modifier\":28},{\"attribute\":\"Toughness\",\"modifier\":28}]},\"secondary_suffix_item_id\":\"\"}}";
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
            assertEquals(Integer.valueOf(130), armor.getDefense());
            assertNull(armor.getDescription());
            assertFalse(armor.getFlags().isEmpty());
            assertEquals(2, armor.getFlags().size());
            assertTrue(armor.getFlags().containsAll(Arrays.asList(ItemFlags.SOUL_BIND_ON_ACQUIRE, ItemFlags.SOUL_BIND_ON_USE)));
            assertEquals(Integer.valueOf(3652), armor.getId());
            assertNotNull(armor.getInfixUpgrade());
            assertEquals(3, armor.getInfixUpgrade().getAttributes().size());
            assertTrue(armor.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier(Attribute.CONDITION_DAMAGE, 39), new AttributeModifier(Attribute.PRECISION, 28), new AttributeModifier(Attribute.TOUGHNESS, 28))));
            assertTrue(armor.getInfusionSlots().isEmpty());
            assertEquals(Integer.valueOf(60), armor.getLevel());
            assertEquals("Rabid Nightshade Leggings", armor.getName());
            assertEquals(Rarity.RARE, armor.getRarity());
            assertNull(armor.getSuffixItemId());
            assertEquals(WeightClass.Medium, armor.getWeightClass());
            assertEquals(Integer.valueOf(1875), armor.getVendorValue());
            assertFalse(armor.getRestrictions().isEmpty());
            assertEquals(1, armor.getRestrictions().size());
            assertTrue(armor.getRestrictions().containsAll(Arrays.asList(RestrictionType.SYLVARI)));
        } catch (Exception e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
	}
	@Test
	public void testArmor003907() {
        String content = "{\"name\":\"Leika's Breastplate\",\"description\":\"<c=@flavor>\\\"Very sturdy. I made it myself.\\\"<br>—Leika</c>\",\"type\":\"Armor\",\"level\":23,\"rarity\":\"Masterwork\",\"vendor_value\":78,\"default_skin\":870,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":3907,\"icon\":\"https://render.guildwars2.com/file/D0E60BC603B7B9C00E44D94F00BC6901BAC8C904/61257.png\",\"details\":{\"type\":\"Coat\",\"weight_class\":\"Heavy\",\"defense\":74,\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":17}]},\"suffix_item_id\":24727,\"secondary_suffix_item_id\":\"\"}}";
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
            assertEquals(Integer.valueOf(74), armor.getDefense());
            assertEquals("<c=@flavor>\"Very sturdy. I made it myself.\"<br>—Leika</c>", armor.getDescription());
            assertFalse(armor.getFlags().isEmpty());
            assertEquals(5, armor.getFlags().size());
            assertTrue(armor.getFlags().containsAll(Arrays.asList(ItemFlags.NO_SELL, ItemFlags.NO_SALVAGE, ItemFlags.SOUL_BIND_ON_ACQUIRE, ItemFlags.HIDE_SUFFIX, ItemFlags.SOUL_BIND_ON_USE)));
            assertEquals(Integer.valueOf(3907), armor.getId());
            assertNotNull(armor.getInfixUpgrade());
            assertEquals(1, armor.getInfixUpgrade().getAttributes().size());
            assertTrue(armor.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier(Attribute.CONDITION_DAMAGE, 17))));
            assertTrue(armor.getInfusionSlots().isEmpty());
            assertEquals(Integer.valueOf(23), armor.getLevel());
            assertEquals("Leika's Breastplate", armor.getName());
            assertEquals(Rarity.MASTERWORK, armor.getRarity());
            assertEquals(Integer.valueOf(24727), armor.getSuffixItemId());
            assertEquals(WeightClass.Heavy, armor.getWeightClass());
            assertEquals(Integer.valueOf(78), armor.getVendorValue());
            assertTrue(armor.getRestrictions().isEmpty());
        } catch (Exception e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }
	@Test
	public void testArmor003942() {
		String content = "{\"name\":\"Metal Aquabreather\",\"description\":\"<c=@flavor>\\\"Good for breathing.\\\"<br>—Lugung</c>\",\"type\":\"Armor\",\"level\":20,\"rarity\":\"Fine\",\"vendor_value\":30,\"default_skin\":854,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":3942,\"icon\":\"https://render.guildwars2.com/file/FA1D042B0845BED8DA3CFA0FAA0837D5EB0207A6/61297.png\",\"details\":{\"type\":\"HelmAquatic\",\"weight_class\":\"Heavy\",\"defense\":21,\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":6}]},\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof ArmorJson);
			IArmor armor = (IArmor) itemJson.getEntity();
			assertEquals(ArmorType.HelmAquatic, armor.getArmorType());
			assertTrue(armor.getAvailableInActivity());
			assertTrue(armor.getAvailableInDungeon());
			assertTrue(armor.getAvailableInPvE());
			assertFalse(armor.getAvailableInPvP());
			assertFalse(armor.getAvailableInPvPLobby());
			assertTrue(armor.getAvailableInWvW());
			assertEquals(Integer.valueOf(21), armor.getDefense());
			assertEquals("<c=@flavor>\"Good for breathing.\"<br>—Lugung</c>", armor.getDescription());
			assertFalse(armor.getFlags().isEmpty());
			assertEquals(5, armor.getFlags().size());
			assertTrue(armor.getFlags().containsAll(Arrays.asList(ItemFlags.NO_SELL, ItemFlags.NO_SALVAGE, ItemFlags.SOUL_BIND_ON_ACQUIRE, ItemFlags.HIDE_SUFFIX, ItemFlags.SOUL_BIND_ON_USE)));
			assertEquals(Integer.valueOf(3942), armor.getId());
			assertNotNull(armor.getInfixUpgrade());
			assertEquals(1, armor.getInfixUpgrade().getAttributes().size());
			assertTrue(armor.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier(Attribute.POWER, 6))));
			assertTrue(armor.getInfusionSlots().isEmpty());
			assertEquals(Integer.valueOf(20), armor.getLevel());
			assertEquals("Metal Aquabreather", armor.getName());
			assertEquals(Rarity.FINE, armor.getRarity());
			assertNull(armor.getSuffixItemId());
			assertEquals(WeightClass.Heavy, armor.getWeightClass());
			assertEquals(Integer.valueOf(30), armor.getVendorValue());
			assertTrue(armor.getRestrictions().isEmpty());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
	}
	@Test
	public void testArmor003955() {
        String content = "{\"name\":\"Fur-Lined Helmet\",\"description\":\"<c=@flavor>\\\"Fur keeps the head warm.\\\"<br>—Gestre Howle</c>\",\"type\":\"Armor\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":60,\"default_skin\":907,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":3955,\"icon\":\"https://render.guildwars2.com/file/6C127B202AE612DCB8CE9AF6EA0CBF500042FF0C/61267.png\",\"details\":{\"type\":\"Helm\",\"weight_class\":\"Light\",\"defense\":14,\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ArmorJson);
            IArmor armor = (IArmor) itemJson.getEntity();
            assertEquals(ArmorType.Helm, armor.getArmorType());
            assertTrue(armor.getAvailableInActivity());
            assertTrue(armor.getAvailableInDungeon());
            assertTrue(armor.getAvailableInPvE());
            assertFalse(armor.getAvailableInPvP());
            assertFalse(armor.getAvailableInPvPLobby());
            assertTrue(armor.getAvailableInWvW());
            assertEquals(Integer.valueOf(14), armor.getDefense());
            assertEquals("<c=@flavor>\"Fur keeps the head warm.\"<br>—Gestre Howle</c>", armor.getDescription());
            assertFalse(armor.getFlags().isEmpty());
            assertEquals(5, armor.getFlags().size());
            assertTrue(armor.getFlags().containsAll(Arrays.asList(ItemFlags.NO_SELL, ItemFlags.ACCOUNT_BOUND, ItemFlags.NO_SALVAGE, ItemFlags.ACCOUNT_BIND_ON_USE, ItemFlags.HIDE_SUFFIX)));
            assertEquals(Integer.valueOf(3955), armor.getId());
            assertNotNull(armor.getInfixUpgrade());
            assertEquals(1, armor.getInfixUpgrade().getAttributes().size());
            assertTrue(armor.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier(Attribute.CONDITION_DAMAGE, 7))));
            assertTrue(armor.getInfusionSlots().isEmpty());
            assertEquals(Integer.valueOf(20), armor.getLevel());
            assertEquals("Fur-Lined Helmet", armor.getName());
            assertEquals(Rarity.MASTERWORK, armor.getRarity());
            assertNull(armor.getSuffixItemId());
            assertEquals(WeightClass.Light, armor.getWeightClass());
            assertEquals(Integer.valueOf(60), armor.getVendorValue());
            assertTrue(armor.getRestrictions().isEmpty());
        } catch (Exception e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }
	@Test
	public void testArmor005345() {
        String content = "{\"name\":\"Whisper's Secret Longvest\",\"description\":\"\",\"type\":\"Armor\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":2350,\"default_skin\":1422,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":5345,\"icon\":\"https://render.guildwars2.com/file/6142996B9C2230A908206A0E71B32F0952490F4B/61340.png\",\"details\":{\"type\":\"Coat\",\"weight_class\":\"Medium\",\"defense\":299,\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":89},{\"attribute\":\"Precision\",\"modifier\":64},{\"attribute\":\"Toughness\",\"modifier\":64}]},\"secondary_suffix_item_id\":\"\"}}";
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
            assertEquals(Integer.valueOf(299), armor.getDefense());
            assertEquals("", armor.getDescription());
            assertFalse(armor.getFlags().isEmpty());
            assertEquals(5, armor.getFlags().size());
            assertTrue(armor.getFlags().containsAll(Arrays.asList(ItemFlags.NO_SELL, ItemFlags.NO_SALVAGE, ItemFlags.NO_MYSTIC_FORGE, ItemFlags.SOUL_BIND_ON_ACQUIRE, ItemFlags.SOUL_BIND_ON_USE)));
            assertEquals(Integer.valueOf(5345), armor.getId());
            assertNotNull(armor.getInfixUpgrade());
            assertEquals(3, armor.getInfixUpgrade().getAttributes().size());
            assertTrue(armor.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier(Attribute.CONDITION_DAMAGE, 89), new AttributeModifier(Attribute.PRECISION, 64), new AttributeModifier(Attribute.TOUGHNESS, 64))));
            assertTrue(armor.getInfusionSlots().isEmpty());
            assertEquals(Integer.valueOf(80), armor.getLevel());
            assertEquals("Whisper's Secret Longvest", armor.getName());
            assertEquals(Rarity.RARE, armor.getRarity());
            assertNull(armor.getSuffixItemId());
            assertEquals(WeightClass.Medium, armor.getWeightClass());
            assertEquals(Integer.valueOf(2350), armor.getVendorValue());
            assertTrue(armor.getRestrictions().isEmpty());
        } catch (Exception e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }
	@Test
	public void testArmor017012() {
		String content = "{\"name\":\"Rabid Reinforced Scale Helm\",\"type\":\"Armor\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":248,\"default_skin\":101,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[\"Guardian\",\"Warrior\"],\"id\":17012,\"icon\":\"https://render.guildwars2.com/file/6F30FEDA2B1405EEB10426E1200522E29D7C3ECB/61064.png\",\"details\":{\"type\":\"Helm\",\"weight_class\":\"Heavy\",\"defense\":107,\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":40},{\"attribute\":\"Precision\",\"modifier\":28},{\"attribute\":\"Toughness\",\"modifier\":28}]},\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ArmorJson);
            IArmor armor = (IArmor) itemJson.getEntity();
            assertEquals(ArmorType.Helm, armor.getArmorType());
            assertTrue(armor.getAvailableInActivity());
            assertTrue(armor.getAvailableInDungeon());
            assertTrue(armor.getAvailableInPvE());
            assertFalse(armor.getAvailableInPvP());
            assertFalse(armor.getAvailableInPvPLobby());
            assertTrue(armor.getAvailableInWvW());
            assertEquals(Integer.valueOf(107), armor.getDefense());
            assertNull(armor.getDescription());
            assertFalse(armor.getFlags().isEmpty());
            assertEquals(3, armor.getFlags().size());
            assertTrue(armor.getFlags().containsAll(Arrays.asList(ItemFlags.NO_SELL, ItemFlags.SOUL_BIND_ON_ACQUIRE, ItemFlags.SOUL_BIND_ON_USE)));
            assertEquals(Integer.valueOf(17012), armor.getId());
            assertNotNull(armor.getInfixUpgrade());
            assertEquals(3, armor.getInfixUpgrade().getAttributes().size());
            assertTrue(armor.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier(Attribute.CONDITION_DAMAGE, 40), new AttributeModifier(Attribute.PRECISION, 28), new AttributeModifier(Attribute.TOUGHNESS, 28))));
            assertTrue(armor.getInfusionSlots().isEmpty());
            assertEquals(Integer.valueOf(80), armor.getLevel());
            assertEquals("Rabid Reinforced Scale Helm", armor.getName());
            assertEquals(Rarity.RARE, armor.getRarity());
            assertNull(armor.getSuffixItemId());
            assertEquals(WeightClass.Heavy, armor.getWeightClass());
            assertEquals(Integer.valueOf(248), armor.getVendorValue());
            assertFalse(armor.getRestrictions().isEmpty());
            assertEquals(2, armor.getRestrictions().size());
            assertTrue(armor.getRestrictions().containsAll(Arrays.asList(RestrictionType.GUARDIAN, RestrictionType.WARRIOR)));
        } catch (Exception e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
	}
	@Test
	public void testArmor020225() {
		String content = "{\"name\":\"Aviator Sunglasses\",\"description\":\"Town clothes can no longer be equipped separately.\\n\\nSpeak to a Black Lion Armor Trader in any major city to exchange this for a helmet skin with the same look.\",\"type\":\"Armor\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"default_skin\":1180,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20225,\"icon\":\"https://render.guildwars2.com/file/0BA30DF7347E390797D3995552FF6B5E1B72CBE3/220574.png\",\"details\":{\"type\":\"Helm\",\"weight_class\":\"Clothing\",\"defense\":0,\"infusion_slots\":[],\"secondary_suffix_item_id\":\"\"}}";
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
			assertTrue(armor.getAvailableInPvPLobby());
			assertTrue(armor.getAvailableInWvW());
			assertEquals(Integer.valueOf(0), armor.getDefense());
			assertEquals("Town clothes can no longer be equipped separately.\n\nSpeak to a Black Lion Armor Trader in any major city to exchange this for a helmet skin with the same look.", armor.getDescription());
			assertFalse(armor.getFlags().isEmpty());
			assertEquals(4, armor.getFlags().size());
			assertTrue(armor.getFlags().containsAll(Arrays.asList(ItemFlags.NO_SELL, ItemFlags.ACCOUNT_BOUND, ItemFlags.NO_MYSTIC_FORGE, ItemFlags.ACCOUNT_BIND_ON_USE)));
			assertEquals(Integer.valueOf(20225), armor.getId());
			assertNotNull(armor.getInfixUpgrade());
			assertEquals(0, armor.getInfixUpgrade().getAttributes().size());
			assertTrue(armor.getInfusionSlots().isEmpty());
			assertEquals(Integer.valueOf(0), armor.getLevel());
			assertEquals("Aviator Sunglasses", armor.getName());
			assertEquals(Rarity.FINE, armor.getRarity());
			assertNull(armor.getSuffixItemId());
			assertEquals(WeightClass.Clothing, armor.getWeightClass());
			assertEquals(Integer.valueOf(0), armor.getVendorValue());
			assertTrue(armor.getRestrictions().isEmpty());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
	}
	@Test
	public void testArmor047940() {
		String content = "{\"name\":\"Wupwup Striders\",\"description\":\"<c=@flavor>Crafted in the style of the ancient Wupwup grawl tribe.</c>\",\"type\":\"Armor\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":240,\"default_skin\":117,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":47940,\"icon\":\"https://render.guildwars2.com/file/33BC7FAC99DD9F5E68DFEAED70AC3145DBA707B0/699207.png\",\"details\":{\"type\":\"Boots\",\"weight_class\":\"Medium\",\"defense\":165,\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":17},{\"attribute\":\"Precision\",\"modifier\":17},{\"attribute\":\"Toughness\",\"modifier\":17},{\"attribute\":\"Vitality\",\"modifier\":17},{\"attribute\":\"Healing\",\"modifier\":17},{\"attribute\":\"ConditionDamage\",\"modifier\":17},{\"attribute\":\"CritDamage\",\"modifier\":17}]},\"secondary_suffix_item_id\":\"\"}}";
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
            assertEquals(Integer.valueOf(165), armor.getDefense());
            assertEquals("<c=@flavor>Crafted in the style of the ancient Wupwup grawl tribe.</c>", armor.getDescription());
            assertFalse(armor.getFlags().isEmpty());
            assertEquals(4, armor.getFlags().size());
            assertTrue(armor.getFlags().containsAll(Arrays.asList(ItemFlags.ACCOUNT_BOUND, ItemFlags.NO_SALVAGE, ItemFlags.ACCOUNT_BIND_ON_USE, ItemFlags.HIDE_SUFFIX)));
            assertEquals(Integer.valueOf(47940), armor.getId());
            assertNotNull(armor.getInfixUpgrade());
            assertEquals(7, armor.getInfixUpgrade().getAttributes().size());
            assertTrue(armor.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier(Attribute.POWER, 17), new AttributeModifier(Attribute.PRECISION, 17), new AttributeModifier(Attribute.TOUGHNESS, 17), new AttributeModifier(Attribute.VITALITY, 17), new AttributeModifier(Attribute.HEALING, 17), new AttributeModifier(Attribute.CONDITION_DAMAGE, 17), new AttributeModifier(Attribute.CRIT_DAMAGE, 17))));
            assertFalse(armor.getInfusionSlots().isEmpty());
            assertEquals(1, armor.getInfusionSlots().size());
            assertTrue(armor.getInfusionSlots().containsAll(Arrays.asList(InfusionSlotType.DEFENSE)));
            assertEquals(Integer.valueOf(80), armor.getLevel());
            assertEquals("Wupwup Striders", armor.getName());
            assertEquals(Rarity.ASCENDED, armor.getRarity());
            assertNull(armor.getSuffixItemId());
            assertEquals(WeightClass.Medium, armor.getWeightClass());
            assertEquals(Integer.valueOf(240), armor.getVendorValue());
            assertTrue(armor.getRestrictions().isEmpty());
        } catch (Exception e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
	}
}
