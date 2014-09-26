package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.entities.AttributeModifier;
import de.getsetsociety.gw2readr.v2.item.items.enums.Attribute;
import de.getsetsociety.gw2readr.v2.item.items.enums.DamageType;
import de.getsetsociety.gw2readr.v2.item.items.enums.ItemFlags;
import de.getsetsociety.gw2readr.v2.item.items.enums.Rarity;
import de.getsetsociety.gw2readr.v2.item.items.enums.WeaponType;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IWeapon;
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
			System.out.println(item);
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
		assertTrue("Item Shoulb be 'SoulbindOnUse'", entity.getFlags().contains(ItemFlags.SoulBindOnUse));
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

}
