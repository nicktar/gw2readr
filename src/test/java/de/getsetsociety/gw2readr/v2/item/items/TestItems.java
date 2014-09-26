package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.entities.AttributeModifier;
import de.getsetsociety.gw2readr.v2.item.items.enums.ArmorType;
import de.getsetsociety.gw2readr.v2.item.items.enums.Attribute;
import de.getsetsociety.gw2readr.v2.item.items.enums.DamageType;
import de.getsetsociety.gw2readr.v2.item.items.enums.ItemFlags;
import de.getsetsociety.gw2readr.v2.item.items.enums.Rarity;
import de.getsetsociety.gw2readr.v2.item.items.enums.WeaponType;
import de.getsetsociety.gw2readr.v2.item.items.enums.WightClass;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IArmor;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IBackItem;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IWeapon;
import de.getsetsociety.gw2readr.v2.item.items.json.ArmorJson;
import de.getsetsociety.gw2readr.v2.item.items.json.BackItemJson;
import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;
import de.getsetsociety.gw2readr.v2.item.items.json.WeaponJson;

public class TestItems {

	private static ObjectMapper mapper = new ObjectMapper();

	@Test
	public void testDemoJson() {
		String content = "{\"name\":\"Strong Soft Wood Longbow of Fire\",\"description\":\"\","
				+ "\"type\":\"Weapon\",\"level\":44,\"rarity\":\"Masterwork\",\"vendor_value\":120,"
				+ "\"default_skin\":\"3942\",\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\""
				+ "flags\":[\"SoulBindOnUse\"],\"restrictions\":[],\"id\":28445,"
				+ "\"icon\":\"https://render.guildwars2.com/file/C6110F52DF5AFE0F00A56F9E143E9732176DDDE9/65015.png\","
				+ "\"details\":{\"type\":\"LongBow\",\"damage_type\":\"Physical\",\"min_power\":385,"
				+ "\"max_power\":452,\"defense\":0,\"infusion_slots\":[],"
				+ "\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":62},"
				+ "{\"attribute\":\"Precision\",\"modifier\":44}]},\"suffix_item_id\":24547"
				+ ",\"secondary_suffix_item_id\":\"\"}}";
		IWeapon entity = null;
		try {
			ItemJson item = mapper.readValue(content, ItemJson.class);
			assertNotNull(item);
			assertTrue("Expecting WeaponJson, got " + item.getClass().getCanonicalName(), item instanceof WeaponJson);
			entity = ((WeaponJson)item).getEntity();
			assertNotNull(entity);
		} catch (IOException e) {
			fail("Unexpected Exception");
		}
		assertEquals("Strong Soft Wood Longbow of Fire", entity.getName());
		assertEquals("", entity.getDescription());
		assertEquals(Integer.valueOf(44), entity.getLevel());
		assertEquals(Rarity.Masterwork, entity.getRarity());
		assertEquals(Integer.valueOf(120), entity.getVendorValue());
		assertEquals(Integer.valueOf(3942), entity.getDefaultSkin());
		assertTrue("Item should be available in Activity", entity.getAvailableInActivity());
		assertTrue("Item should be available in Dungeon", entity.getAvailableInDungeon());
		assertTrue("Item should be available in PVE", entity.getAvailableInPvE());
		assertTrue("Item should be available in WvW", entity.getAvailableInWvW());
		assertFalse("Item should not be available in WvW", entity.getAvailableInPvP());
		assertFalse("Item should not be available in WvW", entity.getAvailableInPvPLobby());
		assertEquals(1, entity.getFlags().size());
		assertTrue("Item Should be 'SoulbindOnUse'", entity.getFlags().contains(ItemFlags.SoulBindOnUse));
		assertTrue(entity.getRestrictions().isEmpty());
		assertEquals(Integer.valueOf(28445), entity.getId());;
		assertEquals("https://render.guildwars2.com/file/C6110F52DF5AFE0F00A56F9E143E9732176DDDE9/65015.png", entity.getIcon());
		assertEquals(WeaponType.LongBow, entity.getWeaponType());
		assertEquals(DamageType.Physical, entity.getDamageType());
		assertEquals(Integer.valueOf(385), entity.getMinPower());
		assertEquals(Integer.valueOf(452), entity.getMaxPower());
		assertEquals(Integer.valueOf(0), entity.getDefense());
		assertTrue(entity.getInfusionSlots().isEmpty());
		assertEquals(2, entity.getInfixUpgrade().getAttributes().size());
		AttributeModifier attributeModifier1 = new AttributeModifier();
		attributeModifier1.setAttribute(Attribute.Precision);
		attributeModifier1.setModifier(44);
		assertTrue(entity.getInfixUpgrade().getAttributes().contains(attributeModifier1));
		AttributeModifier attributeModifier2 = new AttributeModifier();
		attributeModifier2.setAttribute(Attribute.Power);
		attributeModifier2.setModifier(62);
		assertTrue(entity.getInfixUpgrade().getAttributes().contains(attributeModifier2));
		assertEquals(Integer.valueOf(24547), entity.getSuffixItemId());
		assertNull(entity.getSecondarySuffixItemId());
	}

	@Test
	public void testReadingMultiple() {
		String content = "[{\"name\":\"Enduring Back Brace\",\"description\":\"This equipment goes under armor and can hold an additional upgrade.\",\"type\":\"Back\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":16,\"default_skin\":\"2329\",\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":58,\"icon\":\"https://render.guildwars2.com/file/EC179D7A530DED2405B82D09F076A5F5F5C55367/61006.png\",\"details\":{\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":4},{\"attribute\":\"ConditionDamage\",\"modifier\":3}]},\"secondary_suffix_item_id\":\"\"}},{\"name\":\"MONSTER ONLY Moa Unarmed Pet\",\"type\":\"Weapon\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"default_skin\":\"3265\",\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":1,\"icon\":\"https://render.guildwars2.com/file/4AECE5EA59CA057F4C53E1EDFE95E0E3E61DE37F/60980.png\",\"details\":{\"type\":\"Staff\",\"damage_type\":\"Physical\",\"min_power\":146,\"max_power\":165,\"defense\":0,\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[]},\"secondary_suffix_item_id\":\"\"}},{\"name\":\"Mighty Worn Chain Greaves\",\"description\":\"\",\"type\":\"Armor\",\"level\":6,\"rarity\":\"Fine\",\"vendor_value\":11,\"default_skin\":\"40\",\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":71,\"icon\":\"https://render.guildwars2.com/file/044D675DA29AFB786E32612D6B9141CA08D1EFEA/61009.png\",\"details\":{\"type\":\"Boots\",\"weight_class\":\"Heavy\",\"defense\":19,\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":2}]},\"secondary_suffix_item_id\":\"\"}},{\"name\":\"((Assassin Coin Bundle))\",\"description\":\"\",\"type\":\"Weapon\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"default_skin\":\"2809\",\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":6,\"icon\":\"https://render.guildwars2.com/file/CC2E01E0F566A6EEF4F2EC2B19AA7A3E1FEFB1B4/60984.png\",\"details\":{\"type\":\"SmallBundle\",\"damage_type\":\"Choking\",\"min_power\":105,\"max_power\":117,\"defense\":0,\"infusion_slots\":[],\"secondary_suffix_item_id\":\"\"}},{\"name\":\"Clerics Spineguard of Sapphire\",\"description\":\"This equipment goes under armor and can hold an additional upgrade.\",\"type\":\"Back\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":132,\"default_skin\":\"2329\",\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":60,\"icon\":\"https://render.guildwars2.com/file/6CF800ACB923E42F6CA40832C80694C7E0E9CB4D/61005.png\",\"details\":{\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":18},{\"attribute\":\"Power\",\"modifier\":13},{\"attribute\":\"Toughness\",\"modifier\":13}]},\"suffix_item_id\":24499,\"secondary_suffix_item_id\":\"\"}},{\"name\":\"Berserker's Sneakthief Mask of Dwayna\",\"description\":\"\",\"type\":\"Armor\",\"level\":70,\"rarity\":\"Exotic\",\"vendor_value\":295,\"default_skin\":\"95\",\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulBindOnUse\"],\"restrictions\":[],\"id\":73,\"icon\":\"https://render.guildwars2.com/file/65A0C7367206E6CE4EC7C8CBE07EABAE0191BFBA/561548.png\",\"details\":{\"type\":\"Helm\",\"weight_class\":\"Medium\",\"defense\":81,\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":37},{\"attribute\":\"Precision\",\"modifier\":26},{\"attribute\":\"CritDamage\",\"modifier\":26}]},\"suffix_item_id\":24768,\"secondary_suffix_item_id\":\"\"}},{\"name\":\"Assassin Pill\",\"description\":\"Take this pill to participate in the next round of Assassin\",\"type\":\"Consumable\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":2,\"icon\":\"https://render.guildwars2.com/file/ED903431B97968C79AEC7FB21535FC015DBB0BBA/60981.png\",\"details\":{\"type\":\"Food\"}},{\"name\":\"Berserkers Spineguard of Ruby\",\"description\":\"This equipment goes under armor and can hold an additional upgrade.\",\"type\":\"Back\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":132,\"default_skin\":\"2329\",\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":59,\"icon\":\"https://render.guildwars2.com/file/03B65C435B15EB2C10E04F3454B03718AAF3AE90/61004.png\",\"details\":{\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":18},{\"attribute\":\"Precision\",\"modifier\":13},{\"attribute\":\"CritDamage\",\"modifier\":13}]},\"suffix_item_id\":24498,\"secondary_suffix_item_id\":\"\"}},{\"name\":\"Berserker's Sneakthief Mask of the Afflicted\",\"description\":\"\",\"type\":\"Armor\",\"level\":62,\"rarity\":\"Exotic\",\"vendor_value\":265,\"default_skin\":\"95\",\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulBindOnUse\"],\"restrictions\":[],\"id\":72,\"icon\":\"https://render.guildwars2.com/file/65A0C7367206E6CE4EC7C8CBE07EABAE0191BFBA/561548.png\",\"details\":{\"type\":\"Helm\",\"weight_class\":\"Medium\",\"defense\":68,\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":31},{\"attribute\":\"Precision\",\"modifier\":22},{\"attribute\":\"CritDamage\",\"modifier\":22}]},\"suffix_item_id\":24687,\"secondary_suffix_item_id\":\"\"}},{\"name\":\"Undead Unarmed\",\"type\":\"Weapon\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"default_skin\":\"3272\",\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":11,\"icon\":\"https://render.guildwars2.com/file/C5B365D6105F76470106A61F4AB96F3E39D10E18/60991.png\",\"details\":{\"type\":\"Hammer\",\"damage_type\":\"Physical\",\"min_power\":146,\"max_power\":165,\"defense\":0,\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[]},\"secondary_suffix_item_id\":\"\"}},{\"name\":\"Rampagers Spineguard of Coral\",\"description\":\"This equipment goes under armor and can hold an additional upgrade.\",\"type\":\"Back\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":132,\"default_skin\":\"2329\",\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":61,\"icon\":\"https://render.guildwars2.com/file/EC179D7A530DED2405B82D09F076A5F5F5C55367/61006.png\",\"details\":{\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":13},{\"attribute\":\"Precision\",\"modifier\":18},{\"attribute\":\"ConditionDamage\",\"modifier\":13}]},\"suffix_item_id\":24544,\"secondary_suffix_item_id\":\"\"}},{\"name\":\"Strong Back Brace\",\"description\":\"This equipment goes under armor and can hold an additional upgrade.\",\"type\":\"Back\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":16,\"default_skin\":\"2329\",\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":56,\"icon\":\"https://render.guildwars2.com/file/03B65C435B15EB2C10E04F3454B03718AAF3AE90/61004.png\",\"details\":{\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":4},{\"attribute\":\"Precision\",\"modifier\":3}]},\"secondary_suffix_item_id\":\"\"}},{\"name\":\"Mighty Country Coat\",\"description\":\"\",\"type\":\"Armor\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"default_skin\":\"13\",\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NotUpgradeable\"],\"restrictions\":[],\"id\":69,\"icon\":\"https://render.guildwars2.com/file/F03808FFE89B40044671EED2E427053B389BE0A1/61007.png\",\"details\":{\"type\":\"Coat\",\"weight_class\":\"Light\",\"defense\":24,\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":5}]},\"secondary_suffix_item_id\":\"\"}},{\"name\":\"Sealed Package of Snowballs\",\"description\":\"Open this package to create several snowballs that can hit anyone else holding a snowball.\",\"type\":\"Consumable\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24,\"icon\":\"https://render.guildwars2.com/file/1D05D1EE04E16E69710E1EAB11AC466BBF105778/219347.png\",\"details\":{\"type\":\"Generic\"}},{\"name\":\"Mighty Country Coat\",\"description\":\"\",\"type\":\"Armor\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"default_skin\":\"13\",\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NotUpgradeable\"],\"restrictions\":[],\"id\":68,\"icon\":\"https://render.guildwars2.com/file/F03808FFE89B40044671EED2E427053B389BE0A1/61007.png\",\"details\":{\"type\":\"Coat\",\"weight_class\":\"Light\",\"defense\":23,\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}},{\"name\":\"Mighty Worn Chain Greaves\",\"description\":\"\",\"type\":\"Armor\",\"level\":11,\"rarity\":\"Fine\",\"vendor_value\":16,\"default_skin\":\"40\",\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":74,\"icon\":\"https://render.guildwars2.com/file/044D675DA29AFB786E32612D6B9141CA08D1EFEA/61009.png\",\"details\":{\"type\":\"Boots\",\"weight_class\":\"Heavy\",\"defense\":23,\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":3}]},\"secondary_suffix_item_id\":\"\"}},{\"name\":\"Berserker's Seer Coat of the Flame Legion\",\"description\":\"\",\"type\":\"Armor\",\"level\":62,\"rarity\":\"Exotic\",\"vendor_value\":318,\"default_skin\":\"9\",\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulBindOnUse\"],\"restrictions\":[],\"id\":76,\"icon\":\"https://render.guildwars2.com/file/FB0AA64F98303AE5112408EF3DC8C7307EA118F8/61011.png\",\"details\":{\"type\":\"Coat\",\"weight_class\":\"Light\",\"defense\":221,\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":69},{\"attribute\":\"Precision\",\"modifier\":49},{\"attribute\":\"CritDamage\",\"modifier\":49}]},\"suffix_item_id\":24797,\"secondary_suffix_item_id\":\"\"}},{\"name\":\"Berserker's Sneakthief Mask of Strength\",\"description\":\"\",\"type\":\"Armor\",\"level\":78,\"rarity\":\"Exotic\",\"vendor_value\":320,\"default_skin\":\"95\",\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulBindOnUse\"],\"restrictions\":[],\"id\":75,\"icon\":\"https://render.guildwars2.com/file/65A0C7367206E6CE4EC7C8CBE07EABAE0191BFBA/561548.png\",\"details\":{\"type\":\"Helm\",\"weight_class\":\"Medium\",\"defense\":94,\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":43},{\"attribute\":\"Precision\",\"modifier\":31},{\"attribute\":\"CritDamage\",\"modifier\":31}]},\"suffix_item_id\":24714,\"secondary_suffix_item_id\":\"\"}}]";
		IWeapon entity = null;
		try {
			ItemJson[] item = mapper.readValue(content, ItemJson[].class);
			assertNotNull(item);
		} catch (IOException e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
	}

	@Test
	public void testReadingBackItem57() {
		String content = "{\"name\":\"Hearty Back Brace\",\"description\":\"This equipment goes under armor and "
				+ "can hold an additional upgrade.\",\"type\":\"Back\",\"level\":0,\"rarity\":\"Basic\","
				+ "\"vendor_value\":16,\"default_skin\":\"2329\","
				+ "\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],"
				+ "\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":57,"
				+ "\"icon\":\"https://render.guildwars2.com/file/6CF800ACB923E42F6CA40832C80694C7E0E9CB4D/61005.png\","
				+ "\"details\":{\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":"
				+ "[{\"attribute\":\"Vitality\",\"modifier\":4},"
				+ "{\"attribute\":\"Toughness\",\"modifier\":3}]},\"secondary_suffix_item_id\":\"\"}}";
		IBackItem entity = null;
		try {
			ItemJson item = mapper.readValue(content, ItemJson.class);
			assertNotNull(item);
			assertTrue("Expecting BackJson, got " + item.getClass().getCanonicalName(), item instanceof BackItemJson);
			entity = ((BackItemJson)item).getEntity();
			assertNotNull(entity);
		} catch (IOException e) {
			fail("Unexpected Exception");
		}
		assertEquals("Hearty Back Brace", entity.getName());
		assertEquals("This equipment goes under armor and can hold an additional upgrade.", entity.getDescription());
		assertEquals(Integer.valueOf(0), entity.getLevel());
		assertEquals(Rarity.Basic, entity.getRarity());
		assertEquals(Integer.valueOf(16), entity.getVendorValue());
		assertEquals(Integer.valueOf(2329), entity.getDefaultSkin());
		assertTrue("Item should be available in Activity", entity.getAvailableInActivity());
		assertTrue("Item should be available in Dungeon", entity.getAvailableInDungeon());
		assertTrue("Item should be available in PVE", entity.getAvailableInPvE());
		assertTrue("Item should be available in WvW", entity.getAvailableInWvW());
		assertFalse("Item should not be available in WvW", entity.getAvailableInPvP());
		assertFalse("Item should not be available in WvW", entity.getAvailableInPvPLobby());
		assertEquals(2, entity.getFlags().size());
		assertTrue("Item Should be 'SoulbindOnUse'", entity.getFlags().contains(ItemFlags.SoulBindOnUse));
		assertTrue("Item Should be 'SoulbindOnAquire'", entity.getFlags().contains(ItemFlags.SoulbindOnAcquire));
		assertTrue(entity.getRestrictions().isEmpty());
		assertEquals(Integer.valueOf(57), entity.getId());;
		assertEquals("https://render.guildwars2.com/file/6CF800ACB923E42F6CA40832C80694C7E0E9CB4D/61005.png", entity.getIcon());
		assertTrue(entity.getInfusionSlots().isEmpty());
		assertEquals(2, entity.getInfixUpgrade().getAttributes().size());
		AttributeModifier attributeModifier1 = new AttributeModifier();
		attributeModifier1.setAttribute(Attribute.Vitality);
		attributeModifier1.setModifier(4);
		assertTrue(entity.getInfixUpgrade().getAttributes().contains(attributeModifier1));
		AttributeModifier attributeModifier2 = new AttributeModifier();
		attributeModifier2.setAttribute(Attribute.Toughness);
		attributeModifier2.setModifier(3);
		assertTrue(entity.getInfixUpgrade().getAttributes().contains(attributeModifier2));
		assertNull(entity.getSuffixItemId());

	}


	@Test
	public void testReadingArmor70() {
		String content = "{\"name\":\"Mighty Studded Coat\",\"type\":\"Armor\",\"level\":0,\"rarity\":\"Basic\","
				+ "\"vendor_value\":6,\"default_skin\":\"17\",\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],"
				+ "\"flags\":[\"NotUpgradeable\"],\"restrictions\":[],\"id\":70,\"icon\":\"https://render.guildwars2.com/"
				+ "file/5050F9A0AAA5324F0501B7944876F0FA29DCEB97/61008.png\",\"details\":{\"type\":\"Coat\","
				+ "\"weight_class\":\"Medium\",\"defense\":25,\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":"
				+ "[{\"attribute\":\"Power\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}";
		IArmor entity = null;
		try {
			ItemJson item = mapper.readValue(content, ItemJson.class);
			assertNotNull(item);
			assertTrue("Expecting ArmorJson, got " + item.getClass().getCanonicalName(), item instanceof ArmorJson);
			entity = ((ArmorJson)item).getEntity();
			assertNotNull(entity);
		} catch (IOException e) {
			fail("Unexpected Exception");
		}
		assertEquals("Mighty Studded Coat", entity.getName());
		assertNull(entity.getDescription());
		assertEquals(Integer.valueOf(0), entity.getLevel());
		assertEquals(Rarity.Basic, entity.getRarity());
		assertEquals(Integer.valueOf(6), entity.getVendorValue());
		assertEquals(Integer.valueOf(17), entity.getDefaultSkin());
		assertTrue("Item should be available in Activity", entity.getAvailableInActivity());
		assertTrue("Item should be available in Dungeon", entity.getAvailableInDungeon());
		assertTrue("Item should be available in PVE", entity.getAvailableInPvE());
		assertTrue("Item should be available in WvW", entity.getAvailableInWvW());
		assertFalse("Item should not be available in WvW", entity.getAvailableInPvP());
		assertFalse("Item should not be available in WvW", entity.getAvailableInPvPLobby());
		assertEquals(1, entity.getFlags().size());
		assertTrue("Item Should be 'NotUpgradeable'", entity.getFlags().contains(ItemFlags.NotUpgradeable));
		assertTrue(entity.getRestrictions().isEmpty());
		assertEquals(Integer.valueOf(70), entity.getId());;
		assertEquals("https://render.guildwars2.com/file/5050F9A0AAA5324F0501B7944876F0FA29DCEB97/61008.png", entity.getIcon());
		assertTrue(entity.getInfusionSlots().isEmpty());
		assertEquals(1, entity.getInfixUpgrade().getAttributes().size());
		AttributeModifier attributeModifier1 = new AttributeModifier();
		attributeModifier1.setAttribute(Attribute.Power);
		attributeModifier1.setModifier(4);
		assertTrue(entity.getInfixUpgrade().getAttributes().contains(attributeModifier1));
		assertNull(entity.getSuffixItemId());
		assertEquals(ArmorType.Coat, entity.getArmorType());
		assertEquals(WightClass.Medium, entity.getWightClass());
		assertEquals(Integer.valueOf(25), entity.getDefense());

	}
}
