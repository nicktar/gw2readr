package de.getsetsociety.gw2readr.v1.item.items.items;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.getsetsociety.gw2readr.v0.item.items.enums.ArmorType;
import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.v0.item.items.enums.ItemFlags;
import de.getsetsociety.gw2readr.v0.item.items.enums.Rarity;
import de.getsetsociety.gw2readr.v0.item.items.enums.RestrictionType;
import de.getsetsociety.gw2readr.v0.item.items.enums.WeightClass;
import de.getsetsociety.gw2readr.v1.item.items.entities.AttributeModifier;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IArmor;
import de.getsetsociety.gw2readr.v1.item.items.json.ArmorJson;
import de.getsetsociety.gw2readr.v1.item.items.json.ItemJson;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static de.getsetsociety.gw2readr.v0.item.items.enums.Attribute.ConditionDamage;
import static de.getsetsociety.gw2readr.v0.item.items.enums.Attribute.CritDamage;
import static de.getsetsociety.gw2readr.v0.item.items.enums.Attribute.Healing;
import static de.getsetsociety.gw2readr.v0.item.items.enums.Attribute.Power;
import static de.getsetsociety.gw2readr.v0.item.items.enums.Attribute.Precision;
import static de.getsetsociety.gw2readr.v0.item.items.enums.Attribute.Toughness;
import static de.getsetsociety.gw2readr.v0.item.items.enums.Attribute.Vitality;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ArmorTest {

	private static ObjectMapper mapper = new ObjectMapper();

	@Test
	public void testArmor018431() {
		String content = "{\"item_id\":\"18431\",\"name\":\"Flame Legion Helm\",\"type\":\"Armor\",\"level\":\"80\",\"rarity\":\"Exotic\",\"vendor_value\":\"330\",\"icon_file_id\":\"61589\",\"icon_file_signature\":\"709A030CA0F96E922C3F4BE30E0CDFB7D84AA21A\",\"default_skin\":\"735\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"NoSell\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"armor\":{\"type\":\"Helm\",\"weight_class\":\"Medium\",\"defense\":\"97\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":\"45\"},\n{\"attribute\":\"Power\",\"modifier\":\"32\"},\n{\"attribute\":\"Vitality\",\"modifier\":\"32\"}]},\"suffix_item_id\":\"24854\",\"secondary_suffix_item_id\":\"\"}}";
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
			assertEquals(Integer.valueOf(97), armor.getDefense());
			assertNull(armor.getDescription());
			assertFalse(armor.getFlags().isEmpty());
			assertEquals(3, armor.getFlags().size());
			assertTrue(armor.getFlags().containsAll(
                    Arrays.asList(ItemFlags.NoSell,
                            ItemFlags.SoulBindOnUse, ItemFlags.AccountBound)));
			assertEquals(Integer.valueOf(61589), armor.getIconFileId());
			assertEquals("709A030CA0F96E922C3F4BE30E0CDFB7D84AA21A",
					armor.getIconFileSignature());
			assertEquals(Integer.valueOf(18431), armor.getId());
			assertNotNull(armor.getInfixUpgrade());
			assertEquals(3, armor.getInfixUpgrade().getAttributes().size());
			assertTrue(armor
					.getInfixUpgrade()
					.getAttributes()
					.containsAll(
                            Arrays.asList(new AttributeModifier(ConditionDamage, 45),
									new AttributeModifier(Power, 32),
                                    new AttributeModifier(Vitality, 32))));
			assertTrue(armor.getInfusionSlots().isEmpty());
			assertEquals(Integer.valueOf(80), armor.getLevel());
			assertEquals("Flame Legion Helm", armor.getName());
			assertEquals(Rarity.EXOTIC, armor.getRarity());
			assertEquals(Integer.valueOf(24854), armor.getSuffixItemId());
			assertEquals(WeightClass.Medium, armor.getWeightClass());
			assertEquals(Integer.valueOf(330), armor.getVendorValue());
			assertTrue(armor.getRestrictions().isEmpty());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
	}

	@Test
	public void testArmor066512() {
		String content = "{\"item_id\":\"66512\",\"name\":\"Nomad's Exalted Boots\",\"type\":\"Armor\",\"level\":\"80\",\"rarity\":\"Exotic\",\"vendor_value\":\"240\",\"icon_file_id\":\"61520\",\"icon_file_signature\":\"AE26D521B64460E45F69FBD7784313D4BAF070CA\",\"default_skin\":\"172\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"armor\":{\"type\":\"Boots\",\"weight_class\":\"Light\",\"defense\":\"133\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":\"34\"},\n{\"attribute\":\"Healing\",\"modifier\":\"24\"},\n{\"attribute\":\"Vitality\",\"modifier\":\"24\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
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
			assertEquals(Integer.valueOf(133), armor.getDefense());
			assertNull(armor.getDescription());
			assertFalse(armor.getFlags().isEmpty());
			assertEquals(2, armor.getFlags().size());
			assertTrue(armor.getFlags().containsAll(
                    Arrays.asList(ItemFlags.SoulBindOnUse,
                            ItemFlags.AccountBound)));
			assertEquals(Integer.valueOf(61520), armor.getIconFileId());
			assertEquals("AE26D521B64460E45F69FBD7784313D4BAF070CA",
					armor.getIconFileSignature());
			assertEquals(Integer.valueOf(66512), armor.getId());
			assertNotNull(armor.getInfixUpgrade());
			assertEquals(3, armor.getInfixUpgrade().getAttributes().size());
			assertTrue(armor
					.getInfixUpgrade()
					.getAttributes()
					.containsAll(
                            Arrays.asList(new AttributeModifier(Toughness, 34),
									new AttributeModifier(Healing, 24),
                                    new AttributeModifier(Vitality, 24))));
			assertTrue(armor.getInfusionSlots().isEmpty());
			assertEquals(Integer.valueOf(80), armor.getLevel());
			assertEquals("Nomad's Exalted Boots", armor.getName());
			assertEquals(Rarity.EXOTIC, armor.getRarity());
			assertNull(armor.getSuffixItemId());
			assertEquals(WeightClass.Light, armor.getWeightClass());
			assertEquals(Integer.valueOf(240), armor.getVendorValue());
			assertTrue(armor.getRestrictions().isEmpty());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
	}

	@Test
	public void testArmor002404() {
		String content = "{\"item_id\":\"2404\",\"name\":\"Khilbron's Mask\",\"description\":\"\",\"type\":\"Armor\",\"level\":\"80\",\"rarity\":\"Exotic\",\"vendor_value\":\"330\",\"icon_file_id\":\"61083\",\"icon_file_signature\":\"3F43DAA7D2171B41B6F216804AC321E0B1B9A3AA\",\"default_skin\":\"94\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"HideSuffix\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"armor\":{\"type\":\"Helm\",\"weight_class\":\"Light\",\"defense\":\"73\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":\"45\"},\n{\"attribute\":\"Precision\",\"modifier\":\"32\"},\n{\"attribute\":\"Toughness\",\"modifier\":\"32\"}]},\"suffix_item_id\":\"24688\",\"secondary_suffix_item_id\":\"\"}}";
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
			assertEquals(Integer.valueOf(73), armor.getDefense());
			assertEquals("", armor.getDescription());
			assertFalse(armor.getFlags().isEmpty());
			assertEquals(2, armor.getFlags().size());
			assertTrue(armor.getFlags().containsAll(
                    Arrays.asList(ItemFlags.HideSuffix,
                            ItemFlags.SoulBindOnUse)));
			assertEquals(Integer.valueOf(61083), armor.getIconFileId());
			assertEquals("3F43DAA7D2171B41B6F216804AC321E0B1B9A3AA",
					armor.getIconFileSignature());
			assertEquals(Integer.valueOf(2404), armor.getId());
			assertNotNull(armor.getInfixUpgrade());
			assertEquals(3, armor.getInfixUpgrade().getAttributes().size());
			assertTrue(armor
					.getInfixUpgrade()
					.getAttributes()
					.containsAll(
                            Arrays.asList(new AttributeModifier(ConditionDamage, 45),
									new AttributeModifier(Precision, 32),
                                    new AttributeModifier(Toughness, 32))));
			assertTrue(armor.getInfusionSlots().isEmpty());
			assertEquals(Integer.valueOf(80), armor.getLevel());
			assertEquals("Khilbron's Mask", armor.getName());
			assertEquals(Rarity.EXOTIC, armor.getRarity());
			assertEquals(Integer.valueOf(24688), armor.getSuffixItemId());
			assertEquals(WeightClass.Light, armor.getWeightClass());
			assertEquals(Integer.valueOf(330), armor.getVendorValue());
			assertTrue(armor.getRestrictions().isEmpty());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
	}

	@Test
	public void testArmor005252() {
		String content = "{\"item_id\":\"5252\",\"name\":\"Berserker's Apprentice Pants\",\"description\":\"\",\"type\":\"Armor\",\"level\":\"70\",\"rarity\":\"Basic\",\"vendor_value\":\"42\",\"icon_file_id\":\"61404\",\"icon_file_signature\":\"AAB41A903B03C7DEB833A8CC4E08CF0A02A67BD5\",\"default_skin\":\"3\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"NoSalvage\"],\"restrictions\":[],\"armor\":{\"type\":\"Leggings\",\"weight_class\":\"Light\",\"defense\":\"97\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":\"33\"},\n{\"attribute\":\"Precision\",\"modifier\":\"23\"},\n{\"attribute\":\"CritDamage\",\"modifier\":\"23\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
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
			assertEquals(Integer.valueOf(97), armor.getDefense());
			assertEquals("", armor.getDescription());
			assertFalse(armor.getFlags().isEmpty());
			assertEquals(1, armor.getFlags().size());
            assertTrue(armor.getFlags().contains(ItemFlags.NoSalvage));
			assertEquals(Integer.valueOf(61404), armor.getIconFileId());
			assertEquals("AAB41A903B03C7DEB833A8CC4E08CF0A02A67BD5",
					armor.getIconFileSignature());
			assertEquals(Integer.valueOf(5252), armor.getId());
			assertNotNull(armor.getInfixUpgrade());
			assertEquals(3, armor.getInfixUpgrade().getAttributes().size());
			assertTrue(armor
					.getInfixUpgrade()
					.getAttributes()
					.containsAll(
                            Arrays.asList(new AttributeModifier(Power, 33),
									new AttributeModifier(Precision, 23),
                                    new AttributeModifier(CritDamage, 23))));
			assertTrue(armor.getInfusionSlots().isEmpty());
			assertEquals(Integer.valueOf(70), armor.getLevel());
			assertEquals("Berserker's Apprentice Pants", armor.getName());
			assertEquals(Rarity.BASIC, armor.getRarity());
			assertNull(armor.getSuffixItemId());
			assertEquals(WeightClass.Light, armor.getWeightClass());
			assertEquals(Integer.valueOf(42), armor.getVendorValue());
			assertTrue(armor.getRestrictions().isEmpty());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
	}

	@Test
	public void testArmor001752() {
		String content = "{\"item_id\":\"1752\",\"name\":\"Strong Reinforced Scale Helm of Scavenging\",\"description\":\"\",\"type\":\"Armor\",\"level\":\"50\",\"rarity\":\"Masterwork\",\"vendor_value\":\"113\",\"icon_file_id\":\"61064\",\"icon_file_signature\":\"6F30FEDA2B1405EEB10426E1200522E29D7C3ECB\",\"default_skin\":\"101\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"SoulBindOnUse\"],\"restrictions\":[],\"armor\":{\"type\":\"Helm\",\"weight_class\":\"Heavy\",\"defense\":\"53\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":\"18\"},\n{\"attribute\":\"Precision\",\"modifier\":\"13\"}]},\"suffix_item_id\":\"24736\",\"secondary_suffix_item_id\":\"\"}}";
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
			assertEquals(Integer.valueOf(53), armor.getDefense());
			assertEquals("", armor.getDescription());
			assertFalse(armor.getFlags().isEmpty());
			assertEquals(1, armor.getFlags().size());
            assertTrue(armor.getFlags().contains(ItemFlags.SoulBindOnUse));
			assertEquals(Integer.valueOf(61064), armor.getIconFileId());
			assertEquals("6F30FEDA2B1405EEB10426E1200522E29D7C3ECB",
					armor.getIconFileSignature());
			assertEquals(Integer.valueOf(1752), armor.getId());
			assertNotNull(armor.getInfixUpgrade());
			assertEquals(2, armor.getInfixUpgrade().getAttributes().size());
			assertTrue(armor
					.getInfixUpgrade()
					.getAttributes()
					.containsAll(
                            Arrays.asList(new AttributeModifier(Power, 18),
                                    new AttributeModifier(Precision, 13))));
			assertTrue(armor.getInfusionSlots().isEmpty());
			assertEquals(Integer.valueOf(50), armor.getLevel());
			assertEquals("Strong Reinforced Scale Helm of Scavenging",
					armor.getName());
			assertEquals(Rarity.MASTERWORK, armor.getRarity());
			assertEquals(Integer.valueOf(24736), armor.getSuffixItemId());
			assertEquals(WeightClass.Heavy, armor.getWeightClass());
			assertEquals(Integer.valueOf(113), armor.getVendorValue());
			assertTrue(armor.getRestrictions().isEmpty());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
	}

	@Test
	public void testArmor012052() {
		String content = "{\"item_id\":\"12052\",\"name\":\"Rejuvenating Noble Gloves\",\"description\":\"\",\"type\":\"Armor\",\"level\":\"50\",\"rarity\":\"Rare\",\"vendor_value\":\"122\",\"icon_file_id\":\"61442\",\"icon_file_signature\":\"04D6DAB3CCB0CF65A2CEE2F7BAA4CFC44CBA369C\",\"default_skin\":\"252\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"SoulBindOnUse\"],\"restrictions\":[],\"armor\":{\"type\":\"Gloves\",\"weight_class\":\"Medium\",\"defense\":\"75\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":\"15\"},\n{\"attribute\":\"Power\",\"modifier\":\"11\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof ArmorJson);
			IArmor armor = (IArmor) itemJson.getEntity();
			assertEquals(ArmorType.Gloves, armor.getArmorType());
			assertTrue(armor.getAvailableInActivity());
			assertTrue(armor.getAvailableInDungeon());
			assertTrue(armor.getAvailableInPvE());
			assertFalse(armor.getAvailableInPvP());
			assertFalse(armor.getAvailableInPvPLobby());
			assertTrue(armor.getAvailableInWvW());
			assertEquals(Integer.valueOf(75), armor.getDefense());
			assertEquals("", armor.getDescription());
			assertFalse(armor.getFlags().isEmpty());
			assertEquals(1, armor.getFlags().size());
            assertTrue(armor.getFlags().contains(
                    ItemFlags.SoulBindOnUse));
			assertEquals(Integer.valueOf(61442), armor.getIconFileId());
			assertEquals("04D6DAB3CCB0CF65A2CEE2F7BAA4CFC44CBA369C",
					armor.getIconFileSignature());
			assertEquals(Integer.valueOf(12052), armor.getId());
			assertNotNull(armor.getInfixUpgrade());
			assertEquals(2, armor.getInfixUpgrade().getAttributes().size());
			assertTrue(armor
					.getInfixUpgrade()
					.getAttributes()
					.containsAll(
                            Arrays.asList(new AttributeModifier(Healing, 15),
                                    new AttributeModifier(Power, 11))));
			assertTrue(armor.getInfusionSlots().isEmpty());
			assertEquals(Integer.valueOf(50), armor.getLevel());
			assertEquals("Rejuvenating Noble Gloves", armor.getName());
			assertEquals(Rarity.RARE, armor.getRarity());
			assertNull(armor.getSuffixItemId());
			assertEquals(WeightClass.Medium, armor.getWeightClass());
			assertEquals(Integer.valueOf(122), armor.getVendorValue());
			assertTrue(armor.getRestrictions().isEmpty());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
	}

	@Test
	public void testArmor048005() {
		String content = "{\"item_id\":\"48005\",\"name\":\"Tateos's Pauldrons\",\"description\":\"<c=@flavor>Crafted in the style of the ancient Luxon armorer, Tateos.</c>\",\"type\":\"Armor\",\"level\":\"80\",\"rarity\":\"Ascended\",\"vendor_value\":\"240\",\"icon_file_id\":\"699214\",\"icon_file_signature\":\"BCF8FD08CF3F4A263704370659D69FEE2EDD0C45\",\"default_skin\":\"113\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"HideSuffix\",\n\"NoSalvage\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"armor\":{\"type\":\"Shoulders\",\"weight_class\":\"Heavy\",\"defense\":\"127\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":\"35\"},\n{\"attribute\":\"Power\",\"modifier\":\"25\"},\n{\"attribute\":\"Toughness\",\"modifier\":\"25\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
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
			assertEquals(Integer.valueOf(127), armor.getDefense());
			assertEquals(
					"<c=@flavor>Crafted in the style of the ancient Luxon armorer, Tateos.</c>",
					armor.getDescription());
			assertFalse(armor.getFlags().isEmpty());
			assertEquals(4, armor.getFlags().size());
			assertTrue(armor.getFlags().containsAll(
                    Arrays.asList(ItemFlags.AccountBindOnUse,
							ItemFlags.HideSuffix, ItemFlags.NoSalvage,
                            ItemFlags.AccountBound)));
			assertEquals(Integer.valueOf(699214), armor.getIconFileId());
			assertEquals("BCF8FD08CF3F4A263704370659D69FEE2EDD0C45",
					armor.getIconFileSignature());
			assertEquals(Integer.valueOf(48005), armor.getId());
			assertNotNull(armor.getInfixUpgrade());
			assertEquals(3, armor.getInfixUpgrade().getAttributes().size());
			assertTrue(armor
					.getInfixUpgrade()
					.getAttributes()
					.containsAll(
                            Arrays.asList(new AttributeModifier(Healing, 35),
									new AttributeModifier(Power, 25),
                                    new AttributeModifier(Toughness, 25))));
			assertFalse(armor.getInfusionSlots().isEmpty());
			assertEquals(1, armor.getInfusionSlots().size());
			assertTrue(armor
					.getInfusionSlots()
                    .contains(InfusionSlotType.Defense));
			assertEquals(Integer.valueOf(80), armor.getLevel());
			assertEquals("Tateos's Pauldrons", armor.getName());
			assertEquals(Rarity.ASCENDED, armor.getRarity());
			assertNull(armor.getSuffixItemId());
			assertEquals(WeightClass.Heavy, armor.getWeightClass());
			assertEquals(Integer.valueOf(240), armor.getVendorValue());
			assertTrue(armor.getRestrictions().isEmpty());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
	}

	@Test
	public void testArmor011869() {
		String content = "{\"item_id\":\"11869\",\"name\":\"Valkyrie Prowler Boots\",\"description\":\"\",\"type\":\"Armor\",\"level\":\"70\",\"rarity\":\"Fine\",\"vendor_value\":\"72\",\"icon_file_id\":\"61616\",\"icon_file_signature\":\"A5E4C1FA605C41E81267DDD11569A3464C93642A\",\"default_skin\":\"201\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[],\"restrictions\":[],\"armor\":{\"type\":\"Boots\",\"weight_class\":\"Medium\",\"defense\":\"99\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":\"21\"},\n{\"attribute\":\"CritDamage\",\"modifier\":\"15\"},\n{\"attribute\":\"Vitality\",\"modifier\":\"15\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
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
			assertEquals(Integer.valueOf(99), armor.getDefense());
			assertEquals("", armor.getDescription());
			assertTrue(armor.getFlags().isEmpty());
			assertEquals(Integer.valueOf(61616), armor.getIconFileId());
			assertEquals("A5E4C1FA605C41E81267DDD11569A3464C93642A",
					armor.getIconFileSignature());
			assertEquals(Integer.valueOf(11869), armor.getId());
			assertNotNull(armor.getInfixUpgrade());
			assertEquals(3, armor.getInfixUpgrade().getAttributes().size());
			assertTrue(armor
					.getInfixUpgrade()
					.getAttributes()
					.containsAll(
                            Arrays.asList(new AttributeModifier(Power, 21),
									new AttributeModifier(CritDamage, 15),
                                    new AttributeModifier(Vitality, 15))));
			assertTrue(armor.getInfusionSlots().isEmpty());
			assertEquals(Integer.valueOf(70), armor.getLevel());
			assertEquals("Valkyrie Prowler Boots", armor.getName());
			assertEquals(Rarity.FINE, armor.getRarity());
			assertNull(armor.getSuffixItemId());
			assertEquals(WeightClass.Medium, armor.getWeightClass());
			assertEquals(Integer.valueOf(72), armor.getVendorValue());
			assertTrue(armor.getRestrictions().isEmpty());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
	}

	@Test
	public void testArmor064561() {
		String content = "{\"item_id\":\"64561\",\"name\":\"Honed Conjurer Chest of Balthazar\",\"description\":\"\",\"type\":\"Armor\",\"level\":\"55\",\"rarity\":\"Rare\",\"vendor_value\":\"216\",\"icon_file_id\":\"61023\",\"icon_file_signature\":\"76CD08463A05730071D400254141B50E570662D3\",\"default_skin\":\"63\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"NoSalvage\",\n\"NoSell\",\n\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"armor\":{\"type\":\"Coat\",\"weight_class\":\"Light\",\"defense\":\"168\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":\"51\"},\n{\"attribute\":\"CritDamage\",\"modifier\":\"37\"}]},\"suffix_item_id\":\"24764\",\"secondary_suffix_item_id\":\"\"}}";
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
			assertEquals(Integer.valueOf(168), armor.getDefense());
			assertEquals("", armor.getDescription());
			assertFalse(armor.getFlags().isEmpty());
			assertEquals(4, armor.getFlags().size());
			assertTrue(armor.getFlags().containsAll(
                    Arrays.asList(ItemFlags.NoSell,
							ItemFlags.SoulBindOnUse, ItemFlags.NoSalvage,
                            ItemFlags.SoulbindOnAcquire)));
			assertEquals(Integer.valueOf(61023), armor.getIconFileId());
			assertEquals("76CD08463A05730071D400254141B50E570662D3",
					armor.getIconFileSignature());
			assertEquals(Integer.valueOf(64561), armor.getId());
			assertNotNull(armor.getInfixUpgrade());
			assertEquals(2, armor.getInfixUpgrade().getAttributes().size());
			assertTrue(armor
					.getInfixUpgrade()
					.getAttributes()
					.containsAll(
                            Arrays.asList(new AttributeModifier(Power, 51),
                                    new AttributeModifier(CritDamage, 37))));
			assertTrue(armor.getInfusionSlots().isEmpty());
			assertEquals(Integer.valueOf(55), armor.getLevel());
			assertEquals("Honed Conjurer Chest of Balthazar", armor.getName());
			assertEquals(Rarity.RARE, armor.getRarity());
			assertEquals(Integer.valueOf(24764), armor.getSuffixItemId());
			assertEquals(WeightClass.Light, armor.getWeightClass());
			assertEquals(Integer.valueOf(216), armor.getVendorValue());
			assertTrue(armor.getRestrictions().isEmpty());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
	}

	@Test
	public void testArmor043625() {
		String content = "{\"item_id\":\"43625\",\"name\":\"Flamewalker Boots\",\"description\":\"\",\"type\":\"Armor\",\"level\":\"0\",\"rarity\":\"Exotic\",\"vendor_value\":\"0\",\"icon_file_id\":\"681047\",\"icon_file_signature\":\"0A23DF990B4C595EFB5BD8EC6D9F3C767FB301D3\",\"default_skin\":\"1264\",\"game_types\":[\"Pvp\",\n\"PvpLobby\"],\"flags\":[\"AccountBound\",\n\"NoMysticForge\",\n\"NoSalvage\",\n\"NoSell\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"armor\":{\"type\":\"Boots\",\"weight_class\":\"Medium\",\"defense\":\"157\",\"infusion_slots\":[],\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof ArmorJson);
			IArmor armor = (IArmor) itemJson.getEntity();
			assertEquals(ArmorType.Boots, armor.getArmorType());
			assertFalse(armor.getAvailableInActivity());
			assertFalse(armor.getAvailableInDungeon());
			assertFalse(armor.getAvailableInPvE());
			assertTrue(armor.getAvailableInPvP());
			assertTrue(armor.getAvailableInPvPLobby());
			assertFalse(armor.getAvailableInWvW());
			assertEquals(Integer.valueOf(157), armor.getDefense());
			assertEquals("", armor.getDescription());
			assertFalse(armor.getFlags().isEmpty());
			assertEquals(5, armor.getFlags().size());
			assertTrue(armor.getFlags().containsAll(
                    Arrays.asList(ItemFlags.AccountBindOnUse,
							ItemFlags.NoSell, ItemFlags.NoSalvage,
                            ItemFlags.AccountBound, ItemFlags.NoMysticForge)));
			assertEquals(Integer.valueOf(681047), armor.getIconFileId());
			assertEquals("0A23DF990B4C595EFB5BD8EC6D9F3C767FB301D3",
					armor.getIconFileSignature());
			assertEquals(Integer.valueOf(43625), armor.getId());
			assertNotNull(armor.getInfixUpgrade());
			assertEquals(0, armor.getInfixUpgrade().getAttributes().size());
			assertTrue(armor.getInfixUpgrade().getAttributes()
                    .containsAll(Collections.emptyList()));
			assertTrue(armor.getInfusionSlots().isEmpty());
			assertEquals(Integer.valueOf(0), armor.getLevel());
			assertEquals("Flamewalker Boots", armor.getName());
			assertEquals(Rarity.EXOTIC, armor.getRarity());
			assertNull(armor.getSuffixItemId());
			assertEquals(WeightClass.Medium, armor.getWeightClass());
			assertEquals(Integer.valueOf(0), armor.getVendorValue());
			assertTrue(armor.getRestrictions().isEmpty());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
	}

	@Test
	public void testArmor063448() {
		String content = "{\"item_id\":\"63448\",\"name\":\"Dolyak Mail\",\"type\":\"Armor\",\"level\":\"20\",\"rarity\":\"Masterwork\",\"vendor_value\":\"1000\",\"icon_file_id\":\"61141\",\"icon_file_signature\":\"5DB81BDBD7F321A86916D8C17B099C73492A52D8\",\"default_skin\":\"445\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[\"Norn\"],\"armor\":{\"type\":\"Coat\",\"weight_class\":\"Heavy\",\"defense\":\"68\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":\"15\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
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
			assertEquals(Integer.valueOf(68), armor.getDefense());
			assertNull(armor.getDescription());
			assertFalse(armor.getFlags().isEmpty());
			assertEquals(2, armor.getFlags().size());
			assertTrue(armor.getFlags().containsAll(
                    Arrays.asList(ItemFlags.SoulBindOnUse,
                            ItemFlags.SoulbindOnAcquire)));
			assertEquals(Integer.valueOf(61141), armor.getIconFileId());
			assertEquals("5DB81BDBD7F321A86916D8C17B099C73492A52D8",
					armor.getIconFileSignature());
			assertEquals(Integer.valueOf(63448), armor.getId());
			assertNotNull(armor.getInfixUpgrade());
			assertEquals(1, armor.getInfixUpgrade().getAttributes().size());
			assertTrue(armor
					.getInfixUpgrade()
					.getAttributes()
                    .contains(
                            new AttributeModifier(
                                    Power, 15)));
			assertTrue(armor.getInfusionSlots().isEmpty());
			assertEquals(Integer.valueOf(20), armor.getLevel());
			assertEquals("Dolyak Mail", armor.getName());
			assertEquals(Rarity.MASTERWORK, armor.getRarity());
			assertNull(armor.getSuffixItemId());
			assertEquals(WeightClass.Heavy, armor.getWeightClass());
			assertEquals(Integer.valueOf(1000), armor.getVendorValue());
			assertFalse(armor.getRestrictions().isEmpty());
			assertEquals(1, armor.getRestrictions().size());
			assertTrue(armor
					.getRestrictions()
                    .contains(
                            RestrictionType.Norn));
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
	}

	@Test
	public void testArmor006071() {
		String content = "{\"item_id\":\"6071\",\"name\":\"Adept Boots\",\"type\":\"Armor\",\"level\":\"0\",\"rarity\":\"Exotic\",\"vendor_value\":\"0\",\"icon_file_id\":\"414938\",\"icon_file_signature\":\"6B08396A0F3D44D229B4B6A9725CF9D615B1E023\",\"default_skin\":\"289\",\"game_types\":[\"Pvp\",\n\"PvpLobby\"],\"flags\":[\"NoSell\",\n\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[\"Asura\"],\"armor\":{\"type\":\"Boots\",\"weight_class\":\"Light\",\"defense\":\"133\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof ArmorJson);
			IArmor armor = (IArmor) itemJson.getEntity();
			assertEquals(ArmorType.Boots, armor.getArmorType());
			assertFalse(armor.getAvailableInActivity());
			assertFalse(armor.getAvailableInDungeon());
			assertFalse(armor.getAvailableInPvE());
			assertTrue(armor.getAvailableInPvP());
			assertTrue(armor.getAvailableInPvPLobby());
			assertFalse(armor.getAvailableInWvW());
			assertEquals(Integer.valueOf(133), armor.getDefense());
			assertNull(armor.getDescription());
			assertFalse(armor.getFlags().isEmpty());
			assertEquals(3, armor.getFlags().size());
			assertTrue(armor.getFlags().containsAll(
                    Arrays.asList(ItemFlags.NoSell,
							ItemFlags.SoulBindOnUse,
                            ItemFlags.SoulbindOnAcquire)));
			assertEquals(Integer.valueOf(414938), armor.getIconFileId());
			assertEquals("6B08396A0F3D44D229B4B6A9725CF9D615B1E023",
					armor.getIconFileSignature());
			assertEquals(Integer.valueOf(6071), armor.getId());
			assertNotNull(armor.getInfixUpgrade());
			assertEquals(0, armor.getInfixUpgrade().getAttributes().size());
			assertTrue(armor.getInfixUpgrade().getAttributes()
                    .containsAll(Collections.emptyList()));
			assertTrue(armor.getInfusionSlots().isEmpty());
			assertEquals(Integer.valueOf(0), armor.getLevel());
			assertEquals("Adept Boots", armor.getName());
			assertEquals(Rarity.EXOTIC, armor.getRarity());
			assertNull(armor.getSuffixItemId());
			assertEquals(WeightClass.Light, armor.getWeightClass());
			assertEquals(Integer.valueOf(0), armor.getVendorValue());
			assertFalse(armor.getRestrictions().isEmpty());
			assertEquals(1, armor.getRestrictions().size());
			assertTrue(armor
					.getRestrictions()
                    .contains(
                            RestrictionType.Asura));
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
	}

	@Test
	public void testArmor006198() {
		String content = "{\"item_id\":\"6198\",\"name\":\"Scout's Coat\",\"type\":\"Armor\",\"level\":\"0\",\"rarity\":\"Exotic\",\"vendor_value\":\"0\",\"icon_file_id\":\"218908\",\"icon_file_signature\":\"115DDCB29BEA675FF4777EB675202E0CCE94AB3B\",\"default_skin\":\"392\",\"game_types\":[\"Pvp\",\n\"PvpLobby\"],\"flags\":[\"NoSell\",\n\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[\"Human\"],\"armor\":{\"type\":\"Coat\",\"weight_class\":\"Medium\",\"defense\":\"338\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof ArmorJson);
			IArmor armor = (IArmor) itemJson.getEntity();
			assertEquals(ArmorType.Coat, armor.getArmorType());
			assertFalse(armor.getAvailableInActivity());
			assertFalse(armor.getAvailableInDungeon());
			assertFalse(armor.getAvailableInPvE());
			assertTrue(armor.getAvailableInPvP());
			assertTrue(armor.getAvailableInPvPLobby());
			assertFalse(armor.getAvailableInWvW());
			assertEquals(Integer.valueOf(338), armor.getDefense());
			assertNull(armor.getDescription());
			assertFalse(armor.getFlags().isEmpty());
			assertEquals(3, armor.getFlags().size());
			assertTrue(armor.getFlags().containsAll(
                    Arrays.asList(ItemFlags.NoSell,
							ItemFlags.SoulBindOnUse,
                            ItemFlags.SoulbindOnAcquire)));
			assertEquals(Integer.valueOf(218908), armor.getIconFileId());
			assertEquals("115DDCB29BEA675FF4777EB675202E0CCE94AB3B",
					armor.getIconFileSignature());
			assertEquals(Integer.valueOf(6198), armor.getId());
			assertNotNull(armor.getInfixUpgrade());
			assertEquals(0, armor.getInfixUpgrade().getAttributes().size());
			assertTrue(armor.getInfixUpgrade().getAttributes()
                    .containsAll(Collections.emptyList()));
			assertTrue(armor.getInfusionSlots().isEmpty());
			assertEquals(Integer.valueOf(0), armor.getLevel());
			assertEquals("Scout's Coat", armor.getName());
			assertEquals(Rarity.EXOTIC, armor.getRarity());
			assertNull(armor.getSuffixItemId());
			assertEquals(WeightClass.Medium, armor.getWeightClass());
			assertEquals(Integer.valueOf(0), armor.getVendorValue());
			assertFalse(armor.getRestrictions().isEmpty());
			assertEquals(1, armor.getRestrictions().size());
			assertTrue(armor
					.getRestrictions()
                    .contains(RestrictionType.Human));
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
	}

	@Test
	public void testArmor039531() {
		String content = "{\"item_id\":\"39531\",\"name\":\"Riding Gloves\",\"description\":\"Town clothes can no longer be equipped separately.\\nTalk to a Black Lion armor trader in any major city to exchange this item for an endless casual clothing tonic.\",\"type\":\"Armor\",\"level\":\"0\",\"rarity\":\"Fine\",\"vendor_value\":\"0\",\"icon_file_id\":\"543865\",\"icon_file_signature\":\"0B4B9E34265466099D9C09721664BEA967356C04\",\"default_skin\":\"1148\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"PvpLobby\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"NoMysticForge\",\n\"NoSell\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"armor\":{\"type\":\"Gloves\",\"weight_class\":\"Clothing\",\"defense\":\"0\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof ArmorJson);
			IArmor armor = (IArmor) itemJson.getEntity();
			assertEquals(ArmorType.Gloves, armor.getArmorType());
			assertTrue(armor.getAvailableInActivity());
			assertTrue(armor.getAvailableInDungeon());
			assertTrue(armor.getAvailableInPvE());
			assertFalse(armor.getAvailableInPvP());
			assertTrue(armor.getAvailableInPvPLobby());
			assertTrue(armor.getAvailableInWvW());
			assertEquals(Integer.valueOf(0), armor.getDefense());
			assertEquals(
					"Town clothes can no longer be equipped separately.\nTalk to a Black Lion armor trader in any major city to exchange this item for an endless casual clothing tonic.",
					armor.getDescription());
			assertFalse(armor.getFlags().isEmpty());
			assertEquals(4, armor.getFlags().size());
			assertTrue(armor.getFlags().containsAll(
                    Arrays.asList(ItemFlags.AccountBindOnUse,
							ItemFlags.NoSell, ItemFlags.AccountBound,
                            ItemFlags.NoMysticForge)));
			assertEquals(Integer.valueOf(543865), armor.getIconFileId());
			assertEquals("0B4B9E34265466099D9C09721664BEA967356C04",
					armor.getIconFileSignature());
			assertEquals(Integer.valueOf(39531), armor.getId());
			assertNotNull(armor.getInfixUpgrade());
			assertEquals(0, armor.getInfixUpgrade().getAttributes().size());
			assertTrue(armor.getInfixUpgrade().getAttributes()
                    .containsAll(Collections.emptyList()));
			assertTrue(armor.getInfusionSlots().isEmpty());
			assertEquals(Integer.valueOf(0), armor.getLevel());
			assertEquals("Riding Gloves", armor.getName());
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
	public void testArmor006155() {
		String content = "{\"item_id\":\"6155\",\"name\":\"Dryad Boots\",\"type\":\"Armor\",\"level\":\"0\",\"rarity\":\"Exotic\",\"vendor_value\":\"0\",\"icon_file_id\":\"61185\",\"icon_file_signature\":\"08483C2E021EAB5409EE03FF4EA2B80D5A1A1166\",\"default_skin\":\"530\",\"game_types\":[\"Pvp\",\n\"PvpLobby\"],\"flags\":[\"NoSell\",\n\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[\"Sylvari\"],\"armor\":{\"type\":\"Boots\",\"weight_class\":\"Light\",\"defense\":\"133\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof ArmorJson);
			IArmor armor = (IArmor) itemJson.getEntity();
			assertEquals(ArmorType.Boots, armor.getArmorType());
			assertFalse(armor.getAvailableInActivity());
			assertFalse(armor.getAvailableInDungeon());
			assertFalse(armor.getAvailableInPvE());
			assertTrue(armor.getAvailableInPvP());
			assertTrue(armor.getAvailableInPvPLobby());
			assertFalse(armor.getAvailableInWvW());
			assertEquals(Integer.valueOf(133), armor.getDefense());
			assertNull(armor.getDescription());
			assertFalse(armor.getFlags().isEmpty());
			assertEquals(3, armor.getFlags().size());
			assertTrue(armor.getFlags().containsAll(
                    Arrays.asList(ItemFlags.NoSell,
							ItemFlags.SoulBindOnUse,
                            ItemFlags.SoulbindOnAcquire)));
			assertEquals(Integer.valueOf(61185), armor.getIconFileId());
			assertEquals("08483C2E021EAB5409EE03FF4EA2B80D5A1A1166",
					armor.getIconFileSignature());
			assertEquals(Integer.valueOf(6155), armor.getId());
			assertNotNull(armor.getInfixUpgrade());
			assertEquals(0, armor.getInfixUpgrade().getAttributes().size());
			assertTrue(armor.getInfixUpgrade().getAttributes()
                    .containsAll(Collections.emptyList()));
			assertTrue(armor.getInfusionSlots().isEmpty());
			assertEquals(Integer.valueOf(0), armor.getLevel());
			assertEquals("Dryad Boots", armor.getName());
			assertEquals(Rarity.EXOTIC, armor.getRarity());
			assertNull(armor.getSuffixItemId());
			assertEquals(WeightClass.Light, armor.getWeightClass());
			assertEquals(Integer.valueOf(0), armor.getVendorValue());
			assertFalse(armor.getRestrictions().isEmpty());
			assertEquals(1, armor.getRestrictions().size());
			assertTrue(armor
					.getRestrictions()
                    .contains(RestrictionType.Sylvari));
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
	}

	@Test
	public void testArmor006179() {
		String content = "{\"item_id\":\"6179\",\"name\":\"Drover Boots\",\"type\":\"Armor\",\"level\":\"0\",\"rarity\":\"Exotic\",\"vendor_value\":\"0\",\"icon_file_id\":\"61216\",\"icon_file_signature\":\"D56CD998247A5A01B1C2333BD21C49F312393FA3\",\"default_skin\":\"350\",\"game_types\":[\"Pvp\",\n\"PvpLobby\"],\"flags\":[\"NoSell\",\n\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[\"Charr\"],\"armor\":{\"type\":\"Boots\",\"weight_class\":\"Medium\",\"defense\":\"157\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof ArmorJson);
			IArmor armor = (IArmor) itemJson.getEntity();
			assertEquals(ArmorType.Boots, armor.getArmorType());
			assertFalse(armor.getAvailableInActivity());
			assertFalse(armor.getAvailableInDungeon());
			assertFalse(armor.getAvailableInPvE());
			assertTrue(armor.getAvailableInPvP());
			assertTrue(armor.getAvailableInPvPLobby());
			assertFalse(armor.getAvailableInWvW());
			assertEquals(Integer.valueOf(157), armor.getDefense());
			assertNull(armor.getDescription());
			assertFalse(armor.getFlags().isEmpty());
			assertEquals(3, armor.getFlags().size());
			assertTrue(armor.getFlags().containsAll(
                    Arrays.asList(ItemFlags.NoSell,
							ItemFlags.SoulBindOnUse,
                            ItemFlags.SoulbindOnAcquire)));
			assertEquals(Integer.valueOf(61216), armor.getIconFileId());
			assertEquals("D56CD998247A5A01B1C2333BD21C49F312393FA3",
					armor.getIconFileSignature());
			assertEquals(Integer.valueOf(6179), armor.getId());
			assertNotNull(armor.getInfixUpgrade());
			assertEquals(0, armor.getInfixUpgrade().getAttributes().size());
			assertTrue(armor.getInfixUpgrade().getAttributes()
                    .containsAll(Collections.emptyList()));
			assertTrue(armor.getInfusionSlots().isEmpty());
			assertEquals(Integer.valueOf(0), armor.getLevel());
			assertEquals("Drover Boots", armor.getName());
			assertEquals(Rarity.EXOTIC, armor.getRarity());
			assertNull(armor.getSuffixItemId());
			assertEquals(WeightClass.Medium, armor.getWeightClass());
			assertEquals(Integer.valueOf(0), armor.getVendorValue());
			assertFalse(armor.getRestrictions().isEmpty());
			assertEquals(1, armor.getRestrictions().size());
			assertTrue(armor
					.getRestrictions()
                    .contains(RestrictionType.Charr));
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
	}

	@Test
	public void testArmor004943() {
        String content = "{\"item_id\":\"4943\",\"name\":\"Metal Aquabreather\",\"description\":\"<c=@flavor>\\\"Quaggan found this in a shipwreck underwater. Quaggan doesn't need it. OoOOoo! It's very nice, though!\\\"<br>Leemoola </c>\",\"type\":\"Armor\",\"level\":\"60\",\"rarity\":\"Fine\",\"vendor_value\":\"65\",\"icon_file_id\":\"61297\",\"icon_file_signature\":\"FA1D042B0845BED8DA3CFA0FAA0837D5EB0207A6\",\"default_skin\":\"854\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"HideSuffix\",\n\"NoSalvage\",\n\"NoSell\",\n\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"armor\":{\"type\":\"HelmAquatic\",\"weight_class\":\"Heavy\",\"defense\":\"62\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":\"22\"},\n{\"attribute\":\"Precision\",\"modifier\":\"16\"},\n{\"attribute\":\"Vitality\",\"modifier\":\"16\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
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
			assertEquals(Integer.valueOf(62), armor.getDefense());
			assertEquals(
                    "<c=@flavor>\"Quaggan found this in a shipwreck underwater. Quaggan doesn't need it. OoOOoo! It's very nice, though!\"<br>Leemoola </c>",
					armor.getDescription());
			assertFalse(armor.getFlags().isEmpty());
			assertEquals(5, armor.getFlags().size());
			assertTrue(armor.getFlags()
					.containsAll(
                            Arrays.asList(ItemFlags.NoSell,
									ItemFlags.HideSuffix,
									ItemFlags.SoulBindOnUse,
									ItemFlags.NoSalvage,
                                    ItemFlags.SoulbindOnAcquire)));
			assertEquals(Integer.valueOf(61297), armor.getIconFileId());
			assertEquals("FA1D042B0845BED8DA3CFA0FAA0837D5EB0207A6",
					armor.getIconFileSignature());
			assertEquals(Integer.valueOf(4943), armor.getId());
			assertNotNull(armor.getInfixUpgrade());
			assertEquals(3, armor.getInfixUpgrade().getAttributes().size());
			assertTrue(armor
					.getInfixUpgrade()
					.getAttributes()
					.containsAll(
                            Arrays.asList(new AttributeModifier(Healing, 22),
									new AttributeModifier(Precision, 16),
                                    new AttributeModifier(Vitality, 16))));
			assertTrue(armor.getInfusionSlots().isEmpty());
			assertEquals(Integer.valueOf(60), armor.getLevel());
			assertEquals("Metal Aquabreather", armor.getName());
			assertEquals(Rarity.FINE, armor.getRarity());
			assertNull(armor.getSuffixItemId());
			assertEquals(WeightClass.Heavy, armor.getWeightClass());
			assertEquals(Integer.valueOf(65), armor.getVendorValue());
			assertTrue(armor.getRestrictions().isEmpty());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
	}

	@Test
	public void testArmor001321() {
		String content = "{\"item_id\":\"1321\",\"name\":\"Mighty Worn Chain Gauntlets\",\"description\":\"\",\"type\":\"Armor\",\"level\":\"0\",\"rarity\":\"Basic\",\"vendor_value\":\"5\",\"icon_file_id\":\"61053\",\"icon_file_signature\":\"E21E356DE0083C4DBE95C0DD0EA13C47DF55C6BA\",\"default_skin\":\"50\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"NotUpgradeable\"],\"restrictions\":[],\"armor\":{\"type\":\"Gloves\",\"weight_class\":\"Heavy\",\"defense\":\"14\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":\"2\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof ArmorJson);
			IArmor armor = (IArmor) itemJson.getEntity();
			assertEquals(ArmorType.Gloves, armor.getArmorType());
			assertTrue(armor.getAvailableInActivity());
			assertTrue(armor.getAvailableInDungeon());
			assertTrue(armor.getAvailableInPvE());
			assertFalse(armor.getAvailableInPvP());
			assertFalse(armor.getAvailableInPvPLobby());
			assertTrue(armor.getAvailableInWvW());
			assertEquals(Integer.valueOf(14), armor.getDefense());
			assertEquals("", armor.getDescription());
			assertFalse(armor.getFlags().isEmpty());
			assertEquals(1, armor.getFlags().size());
			assertTrue(armor
					.getFlags()
                    .contains(ItemFlags.NotUpgradeable));
			assertEquals(Integer.valueOf(61053), armor.getIconFileId());
			assertEquals("E21E356DE0083C4DBE95C0DD0EA13C47DF55C6BA",
					armor.getIconFileSignature());
			assertEquals(Integer.valueOf(1321), armor.getId());
			assertNotNull(armor.getInfixUpgrade());
			assertEquals(1, armor.getInfixUpgrade().getAttributes().size());
			assertTrue(armor
					.getInfixUpgrade()
					.getAttributes()
                    .contains(new AttributeModifier(Power, 2)));
			assertTrue(armor.getInfusionSlots().isEmpty());
			assertEquals(Integer.valueOf(0), armor.getLevel());
			assertEquals("Mighty Worn Chain Gauntlets", armor.getName());
			assertEquals(Rarity.BASIC, armor.getRarity());
			assertNull(armor.getSuffixItemId());
			assertEquals(WeightClass.Heavy, armor.getWeightClass());
			assertEquals(Integer.valueOf(5), armor.getVendorValue());
			assertTrue(armor.getRestrictions().isEmpty());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
	}

	@Test
	public void testArmor018160() {
		String content = "{\"item_id\":\"18160\",\"name\":\"Body of Koda\",\"type\":\"Armor\",\"level\":\"80\",\"rarity\":\"Exotic\",\"vendor_value\":\"370\",\"icon_file_id\":\"218952\",\"icon_file_signature\":\"5B3D97ACE0B564D69B7B020AE94016D49E01EEFC\",\"default_skin\":\"707\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"NoSell\",\n\"SoulBindOnUse\"],\"restrictions\":[\"Guardian\",\n\"Warrior\"],\"armor\":{\"type\":\"Leggings\",\"weight_class\":\"Heavy\",\"defense\":\"242\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":\"67\"},\n{\"attribute\":\"Precision\",\"modifier\":\"48\"},\n{\"attribute\":\"Vitality\",\"modifier\":\"48\"}]},\"suffix_item_id\":\"24857\",\"secondary_suffix_item_id\":\"\"}}";
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
			assertEquals(Integer.valueOf(242), armor.getDefense());
			assertNull(armor.getDescription());
			assertFalse(armor.getFlags().isEmpty());
			assertEquals(3, armor.getFlags().size());
			assertTrue(armor.getFlags().containsAll(
                    Arrays.asList(ItemFlags.NoSell,
                            ItemFlags.SoulBindOnUse, ItemFlags.AccountBound)));
			assertEquals(Integer.valueOf(218952), armor.getIconFileId());
			assertEquals("5B3D97ACE0B564D69B7B020AE94016D49E01EEFC",
					armor.getIconFileSignature());
			assertEquals(Integer.valueOf(18160), armor.getId());
			assertNotNull(armor.getInfixUpgrade());
			assertEquals(3, armor.getInfixUpgrade().getAttributes().size());
			assertTrue(armor
					.getInfixUpgrade()
					.getAttributes()
					.containsAll(
                            Arrays.asList(new AttributeModifier(Healing, 67),
									new AttributeModifier(Precision, 48),
                                    new AttributeModifier(Vitality, 48))));
			assertTrue(armor.getInfusionSlots().isEmpty());
			assertEquals(Integer.valueOf(80), armor.getLevel());
			assertEquals("Body of Koda", armor.getName());
			assertEquals(Rarity.EXOTIC, armor.getRarity());
			assertEquals(Integer.valueOf(24857), armor.getSuffixItemId());
			assertEquals(WeightClass.Heavy, armor.getWeightClass());
			assertEquals(Integer.valueOf(370), armor.getVendorValue());
			assertFalse(armor.getRestrictions().isEmpty());
			assertEquals(2, armor.getRestrictions().size());
			assertTrue(armor.getRestrictions()
					.containsAll(
                            Arrays.asList(RestrictionType.Guardian,
                                    RestrictionType.Warrior)));
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
	}
}