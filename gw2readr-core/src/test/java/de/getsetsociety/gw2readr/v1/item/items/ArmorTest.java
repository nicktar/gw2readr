package de.getsetsociety.gw2readr.v1.item.items;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v0.item.items.enums.Attribute;
import de.getsetsociety.gw2readr.v0.item.items.enums.ArmorType;
import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.v0.item.items.enums.ItemFlags;
import de.getsetsociety.gw2readr.v0.item.items.enums.Rarity;
import de.getsetsociety.gw2readr.v0.item.items.enums.RestrictionType;
import de.getsetsociety.gw2readr.v0.item.items.enums.WeightClass;
import de.getsetsociety.gw2readr.v1.item.items.entities.AttributeModifier;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IArmor;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IAttributeModifier;
import de.getsetsociety.gw2readr.v1.item.items.json.ArmorJson;
import de.getsetsociety.gw2readr.v1.item.items.json.ItemJson;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IBackItem;
import de.getsetsociety.gw2readr.v1.item.items.json.BackItemJson;
import de.getsetsociety.gw2readr.v1.item.items.json.ItemJson;
import de.getsetsociety.gw2readr.general.ObjectMapperProvider;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.ICraftingMaterial;
import de.getsetsociety.gw2readr.v1.item.items.json.CraftingMaterialJson;
import de.getsetsociety.gw2readr.v1.item.items.json.WeaponJson;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IWeapon;
import de.getsetsociety.gw2readr.v0.item.items.enums.WeaponType;
import de.getsetsociety.gw2readr.v0.item.items.enums.DamageType;
import de.getsetsociety.gw2readr.v0.item.items.enums.ConsumableType;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IConsumable;
import de.getsetsociety.gw2readr.v1.item.items.json.ConsumableJson;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IBag;
import de.getsetsociety.gw2readr.v1.item.items.json.BagJson;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IContainer;
import de.getsetsociety.gw2readr.v1.item.items.json.ContainerJson;
import de.getsetsociety.gw2readr.v0.item.items.enums.ContainerType;


public class ArmorTest {

    private ObjectMapper mapper = ObjectMapperProvider.getMapper();

    @Test
    public void testArmorMediumHelmSoulBindOnUseNoSellAccountBoundInfixUpgradeNoSlotNoRestriction018431() {
        String content = "{\"item_id\":\"18431\",\"name\":\"Flame Legion Helm\",\"type\":\"Armor\",\"level\":\"80\",\"rarity\":\"Exotic\",\"vendor_value\":\"330\",\"icon_file_id\":\"61589\",\"icon_file_signature\":\"709A030CA0F96E922C3F4BE30E0CDFB7D84AA21A\",\"default_skin\":\"735\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"NoSell\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"armor\":{\"type\":\"Helm\",\"weight_class\":\"Medium\",\"defense\":\"97\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":\"45\"},\n{\"attribute\":\"Power\",\"modifier\":\"32\"},\n{\"attribute\":\"Vitality\",\"modifier\":\"32\"}]},\"suffix_item_id\":\"24854\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ArmorJson);
            IArmor item = (IArmor) itemJson.getEntity();
            assertEquals(Integer.valueOf(18431),  item.getId());
            assertTrue(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertFalse(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertNull(item.getDescription());
            assertEquals("Flame Legion Helm", item.getName());
            assertEquals(Integer.valueOf(80),  item.getLevel());
            assertEquals(Integer.valueOf(330),  item.getVendorValue());
            assertEquals(Rarity.Exotic, item.getRarity());
            assertEquals(3,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.SoulBindOnUse, ItemFlags.NoSell, ItemFlags.AccountBound})));
            assertTrue(item.getRestrictions().isEmpty());
            assertEquals(Integer.valueOf(97),  item.getDefense());
            assertEquals(3, item.getInfixUpgrade().getAttributes().size());
            assertTrue(item.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier[] {new AttributeModifier(Attribute.ConditionDamage, 45), new AttributeModifier(Attribute.Power, 32), new AttributeModifier(Attribute.Vitality, 32)})));
            assertTrue(item.getInfusionSlots().isEmpty());
            assertEquals(Integer.valueOf(24854),  item.getSuffixItemId());
            assertEquals(ArmorType.Helm, item.getArmorType());
            assertEquals(WeightClass.Medium, item.getWeightClass());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
}
    @Test
    public void testArmorLightBoots066512() {
        String content = "{\"item_id\":\"66512\",\"name\":\"Nomad's Exalted Boots\",\"type\":\"Armor\",\"level\":\"80\",\"rarity\":\"Exotic\",\"vendor_value\":\"240\",\"icon_file_id\":\"61520\",\"icon_file_signature\":\"AE26D521B64460E45F69FBD7784313D4BAF070CA\",\"default_skin\":\"172\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"armor\":{\"type\":\"Boots\",\"weight_class\":\"Light\",\"defense\":\"133\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":\"34\"},\n{\"attribute\":\"Healing\",\"modifier\":\"24\"},\n{\"attribute\":\"Vitality\",\"modifier\":\"24\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ArmorJson);
            IArmor item = (IArmor) itemJson.getEntity();
            assertEquals(Integer.valueOf(66512),  item.getId());
            assertTrue(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertFalse(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertNull(item.getDescription());
            assertEquals("Nomad's Exalted Boots", item.getName());
            assertEquals(Integer.valueOf(80),  item.getLevel());
            assertEquals(Integer.valueOf(240),  item.getVendorValue());
            assertEquals(Rarity.Exotic, item.getRarity());
            assertEquals(2,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.SoulBindOnUse, ItemFlags.AccountBound})));
            assertTrue(item.getRestrictions().isEmpty());
            assertEquals(Integer.valueOf(133),  item.getDefense());
            assertEquals(3, item.getInfixUpgrade().getAttributes().size());
            assertTrue(item.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier[] {new AttributeModifier(Attribute.Toughness, 34), new AttributeModifier(Attribute.Healing, 24), new AttributeModifier(Attribute.Vitality, 24)})));
            assertTrue(item.getInfusionSlots().isEmpty());
            assertNull(item.getSuffixItemId());
            assertEquals(ArmorType.Boots, item.getArmorType());
            assertEquals(WeightClass.Light, item.getWeightClass());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
}
    @Test
    public void testArmorHideSuffix002404() {
        String content = "{\"item_id\":\"2404\",\"name\":\"Khilbron's Mask\",\"description\":\"\",\"type\":\"Armor\",\"level\":\"80\",\"rarity\":\"Exotic\",\"vendor_value\":\"330\",\"icon_file_id\":\"61083\",\"icon_file_signature\":\"3F43DAA7D2171B41B6F216804AC321E0B1B9A3AA\",\"default_skin\":\"94\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"HideSuffix\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"armor\":{\"type\":\"Helm\",\"weight_class\":\"Light\",\"defense\":\"73\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":\"45\"},\n{\"attribute\":\"Precision\",\"modifier\":\"32\"},\n{\"attribute\":\"Toughness\",\"modifier\":\"32\"}]},\"suffix_item_id\":\"24688\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ArmorJson);
            IArmor item = (IArmor) itemJson.getEntity();
            assertEquals(Integer.valueOf(2404),  item.getId());
            assertTrue(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertFalse(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertEquals("", item.getDescription());
            assertEquals("Khilbron's Mask", item.getName());
            assertEquals(Integer.valueOf(80),  item.getLevel());
            assertEquals(Integer.valueOf(330),  item.getVendorValue());
            assertEquals(Rarity.Exotic, item.getRarity());
            assertEquals(2,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.SoulBindOnUse, ItemFlags.HideSuffix})));
            assertTrue(item.getRestrictions().isEmpty());
            assertEquals(Integer.valueOf(73),  item.getDefense());
            assertEquals(3, item.getInfixUpgrade().getAttributes().size());
            assertTrue(item.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier[] {new AttributeModifier(Attribute.ConditionDamage, 45), new AttributeModifier(Attribute.Precision, 32), new AttributeModifier(Attribute.Toughness, 32)})));
            assertTrue(item.getInfusionSlots().isEmpty());
            assertEquals(Integer.valueOf(24688),  item.getSuffixItemId());
            assertEquals(ArmorType.Helm, item.getArmorType());
            assertEquals(WeightClass.Light, item.getWeightClass());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
}
    @Test
    public void testArmorLeggingsNoSalvage005252() {
        String content = "{\"item_id\":\"5252\",\"name\":\"Berserker's Apprentice Pants\",\"description\":\"\",\"type\":\"Armor\",\"level\":\"70\",\"rarity\":\"Basic\",\"vendor_value\":\"42\",\"icon_file_id\":\"61404\",\"icon_file_signature\":\"AAB41A903B03C7DEB833A8CC4E08CF0A02A67BD5\",\"default_skin\":\"3\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"NoSalvage\"],\"restrictions\":[],\"armor\":{\"type\":\"Leggings\",\"weight_class\":\"Light\",\"defense\":\"97\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":\"33\"},\n{\"attribute\":\"Precision\",\"modifier\":\"23\"},\n{\"attribute\":\"CritDamage\",\"modifier\":\"23\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ArmorJson);
            IArmor item = (IArmor) itemJson.getEntity();
            assertEquals(Integer.valueOf(5252),  item.getId());
            assertTrue(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertFalse(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertEquals("", item.getDescription());
            assertEquals("Berserker's Apprentice Pants", item.getName());
            assertEquals(Integer.valueOf(70),  item.getLevel());
            assertEquals(Integer.valueOf(42),  item.getVendorValue());
            assertEquals(Rarity.Basic, item.getRarity());
            assertEquals(1,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.NoSalvage})));
            assertTrue(item.getRestrictions().isEmpty());
            assertEquals(Integer.valueOf(97),  item.getDefense());
            assertEquals(3, item.getInfixUpgrade().getAttributes().size());
            assertTrue(item.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier[] {new AttributeModifier(Attribute.Power, 33), new AttributeModifier(Attribute.Precision, 23), new AttributeModifier(Attribute.CritDamage, 23)})));
            assertTrue(item.getInfusionSlots().isEmpty());
            assertNull(item.getSuffixItemId());
            assertEquals(ArmorType.Leggings, item.getArmorType());
            assertEquals(WeightClass.Light, item.getWeightClass());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
}
    @Test
    public void testArmorHeavy001752() {
        String content = "{\"item_id\":\"1752\",\"name\":\"Strong Reinforced Scale Helm of Scavenging\",\"description\":\"\",\"type\":\"Armor\",\"level\":\"50\",\"rarity\":\"Masterwork\",\"vendor_value\":\"113\",\"icon_file_id\":\"61064\",\"icon_file_signature\":\"6F30FEDA2B1405EEB10426E1200522E29D7C3ECB\",\"default_skin\":\"101\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"SoulBindOnUse\"],\"restrictions\":[],\"armor\":{\"type\":\"Helm\",\"weight_class\":\"Heavy\",\"defense\":\"53\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":\"18\"},\n{\"attribute\":\"Precision\",\"modifier\":\"13\"}]},\"suffix_item_id\":\"24736\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ArmorJson);
            IArmor item = (IArmor) itemJson.getEntity();
            assertEquals(Integer.valueOf(1752),  item.getId());
            assertTrue(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertFalse(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertEquals("", item.getDescription());
            assertEquals("Strong Reinforced Scale Helm of Scavenging", item.getName());
            assertEquals(Integer.valueOf(50),  item.getLevel());
            assertEquals(Integer.valueOf(113),  item.getVendorValue());
            assertEquals(Rarity.Masterwork, item.getRarity());
            assertEquals(1,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.SoulBindOnUse})));
            assertTrue(item.getRestrictions().isEmpty());
            assertEquals(Integer.valueOf(53),  item.getDefense());
            assertEquals(2, item.getInfixUpgrade().getAttributes().size());
            assertTrue(item.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier[] {new AttributeModifier(Attribute.Power, 18), new AttributeModifier(Attribute.Precision, 13)})));
            assertTrue(item.getInfusionSlots().isEmpty());
            assertEquals(Integer.valueOf(24736),  item.getSuffixItemId());
            assertEquals(ArmorType.Helm, item.getArmorType());
            assertEquals(WeightClass.Heavy, item.getWeightClass());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
}
    @Test
    public void testArmorGloves012052() {
        String content = "{\"item_id\":\"12052\",\"name\":\"Rejuvenating Noble Gloves\",\"description\":\"\",\"type\":\"Armor\",\"level\":\"50\",\"rarity\":\"Rare\",\"vendor_value\":\"122\",\"icon_file_id\":\"61442\",\"icon_file_signature\":\"04D6DAB3CCB0CF65A2CEE2F7BAA4CFC44CBA369C\",\"default_skin\":\"252\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"SoulBindOnUse\"],\"restrictions\":[],\"armor\":{\"type\":\"Gloves\",\"weight_class\":\"Medium\",\"defense\":\"75\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":\"15\"},\n{\"attribute\":\"Power\",\"modifier\":\"11\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ArmorJson);
            IArmor item = (IArmor) itemJson.getEntity();
            assertEquals(Integer.valueOf(12052),  item.getId());
            assertTrue(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertFalse(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertEquals("", item.getDescription());
            assertEquals("Rejuvenating Noble Gloves", item.getName());
            assertEquals(Integer.valueOf(50),  item.getLevel());
            assertEquals(Integer.valueOf(122),  item.getVendorValue());
            assertEquals(Rarity.Rare, item.getRarity());
            assertEquals(1,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.SoulBindOnUse})));
            assertTrue(item.getRestrictions().isEmpty());
            assertEquals(Integer.valueOf(75),  item.getDefense());
            assertEquals(2, item.getInfixUpgrade().getAttributes().size());
            assertTrue(item.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier[] {new AttributeModifier(Attribute.Healing, 15), new AttributeModifier(Attribute.Power, 11)})));
            assertTrue(item.getInfusionSlots().isEmpty());
            assertNull(item.getSuffixItemId());
            assertEquals(ArmorType.Gloves, item.getArmorType());
            assertEquals(WeightClass.Medium, item.getWeightClass());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
}
    @Test
    public void testArmorShouldersAccountBindOnUseDefenseSlot048005() {
        String content = "{\"item_id\":\"48005\",\"name\":\"Tateos's Pauldrons\",\"description\":\"<c=@flavor>Crafted in the style of the ancient Luxon armorer, Tateos.</c>\",\"type\":\"Armor\",\"level\":\"80\",\"rarity\":\"Ascended\",\"vendor_value\":\"240\",\"icon_file_id\":\"699214\",\"icon_file_signature\":\"BCF8FD08CF3F4A263704370659D69FEE2EDD0C45\",\"default_skin\":\"113\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"HideSuffix\",\n\"NoSalvage\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"armor\":{\"type\":\"Shoulders\",\"weight_class\":\"Heavy\",\"defense\":\"127\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":\"35\"},\n{\"attribute\":\"Power\",\"modifier\":\"25\"},\n{\"attribute\":\"Toughness\",\"modifier\":\"25\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ArmorJson);
            IArmor item = (IArmor) itemJson.getEntity();
            assertEquals(Integer.valueOf(48005),  item.getId());
            assertTrue(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertFalse(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertEquals("<c=@flavor>Crafted in the style of the ancient Luxon armorer, Tateos.</c>", item.getDescription());
            assertEquals("Tateos's Pauldrons", item.getName());
            assertEquals(Integer.valueOf(80),  item.getLevel());
            assertEquals(Integer.valueOf(240),  item.getVendorValue());
            assertEquals(Rarity.Ascended, item.getRarity());
            assertEquals(4,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.HideSuffix, ItemFlags.NoSalvage, ItemFlags.AccountBindOnUse, ItemFlags.AccountBound})));
            assertTrue(item.getRestrictions().isEmpty());
            assertEquals(Integer.valueOf(127),  item.getDefense());
            assertEquals(3, item.getInfixUpgrade().getAttributes().size());
            assertTrue(item.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier[] {new AttributeModifier(Attribute.Healing, 35), new AttributeModifier(Attribute.Power, 25), new AttributeModifier(Attribute.Toughness, 25)})));
            assertEquals(1, item.getInfusionSlots().size());
            assertTrue(item.getInfusionSlots().containsAll(Arrays.asList(new InfusionSlotType[] {InfusionSlotType.Defense})));
            assertNull(item.getSuffixItemId());
            assertEquals(ArmorType.Shoulders, item.getArmorType());
            assertEquals(WeightClass.Heavy, item.getWeightClass());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
}
    @Test
    public void testArmorCoatSoulbindOnAcquire064561() {
        String content = "{\"item_id\":\"64561\",\"name\":\"Honed Conjurer Chest of Balthazar\",\"description\":\"\",\"type\":\"Armor\",\"level\":\"55\",\"rarity\":\"Rare\",\"vendor_value\":\"216\",\"icon_file_id\":\"61023\",\"icon_file_signature\":\"76CD08463A05730071D400254141B50E570662D3\",\"default_skin\":\"63\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"NoSalvage\",\n\"NoSell\",\n\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"armor\":{\"type\":\"Coat\",\"weight_class\":\"Light\",\"defense\":\"168\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":\"51\"},\n{\"attribute\":\"CritDamage\",\"modifier\":\"37\"}]},\"suffix_item_id\":\"24764\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ArmorJson);
            IArmor item = (IArmor) itemJson.getEntity();
            assertEquals(Integer.valueOf(64561),  item.getId());
            assertTrue(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertFalse(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertEquals("", item.getDescription());
            assertEquals("Honed Conjurer Chest of Balthazar", item.getName());
            assertEquals(Integer.valueOf(55),  item.getLevel());
            assertEquals(Integer.valueOf(216),  item.getVendorValue());
            assertEquals(Rarity.Rare, item.getRarity());
            assertEquals(4,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.SoulBindOnUse, ItemFlags.NoSalvage, ItemFlags.NoSell, ItemFlags.SoulbindOnAcquire})));
            assertTrue(item.getRestrictions().isEmpty());
            assertEquals(Integer.valueOf(168),  item.getDefense());
            assertEquals(2, item.getInfixUpgrade().getAttributes().size());
            assertTrue(item.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier[] {new AttributeModifier(Attribute.Power, 51), new AttributeModifier(Attribute.CritDamage, 37)})));
            assertTrue(item.getInfusionSlots().isEmpty());
            assertEquals(Integer.valueOf(24764),  item.getSuffixItemId());
            assertEquals(ArmorType.Coat, item.getArmorType());
            assertEquals(WeightClass.Light, item.getWeightClass());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
}
    @Test
    public void testArmorNoMysticForge043625() {
        String content = "{\"item_id\":\"43625\",\"name\":\"Flamewalker Boots\",\"description\":\"\",\"type\":\"Armor\",\"level\":\"0\",\"rarity\":\"Exotic\",\"vendor_value\":\"0\",\"icon_file_id\":\"681047\",\"icon_file_signature\":\"0A23DF990B4C595EFB5BD8EC6D9F3C767FB301D3\",\"default_skin\":\"1264\",\"game_types\":[\"Pvp\",\n\"PvpLobby\"],\"flags\":[\"AccountBound\",\n\"NoMysticForge\",\n\"NoSalvage\",\n\"NoSell\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"armor\":{\"type\":\"Boots\",\"weight_class\":\"Medium\",\"defense\":\"157\",\"infusion_slots\":[],\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ArmorJson);
            IArmor item = (IArmor) itemJson.getEntity();
            assertEquals(Integer.valueOf(43625),  item.getId());
            assertFalse(item.getAvailableInActivity());
            assertFalse(item.getAvailableInDungeon());
            assertFalse(item.getAvailableInPvE());
            assertTrue(item.getAvailableInPvP());
            assertTrue(item.getAvailableInPvPLobby());
            assertFalse(item.getAvailableInWvW());
            assertEquals("", item.getDescription());
            assertEquals("Flamewalker Boots", item.getName());
            assertEquals(Integer.valueOf(0),  item.getLevel());
            assertEquals(Integer.valueOf(0),  item.getVendorValue());
            assertEquals(Rarity.Exotic, item.getRarity());
            assertEquals(5,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.NoSalvage, ItemFlags.AccountBindOnUse, ItemFlags.NoSell, ItemFlags.AccountBound, ItemFlags.NoMysticForge})));
            assertTrue(item.getRestrictions().isEmpty());
            assertEquals(Integer.valueOf(157),  item.getDefense());
            assertTrue(item.getInfixUpgrade().getAttributes().isEmpty());
            assertTrue(item.getInfusionSlots().isEmpty());
            assertNull(item.getSuffixItemId());
            assertEquals(ArmorType.Boots, item.getArmorType());
            assertEquals(WeightClass.Medium, item.getWeightClass());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
}
    @Test
    public void testArmorNornRestriction063448() {
        String content = "{\"item_id\":\"63448\",\"name\":\"Dolyak Mail\",\"type\":\"Armor\",\"level\":\"20\",\"rarity\":\"Masterwork\",\"vendor_value\":\"1000\",\"icon_file_id\":\"61141\",\"icon_file_signature\":\"5DB81BDBD7F321A86916D8C17B099C73492A52D8\",\"default_skin\":\"445\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[\"Norn\"],\"armor\":{\"type\":\"Coat\",\"weight_class\":\"Heavy\",\"defense\":\"68\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":\"15\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ArmorJson);
            IArmor item = (IArmor) itemJson.getEntity();
            assertEquals(Integer.valueOf(63448),  item.getId());
            assertTrue(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertFalse(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertNull(item.getDescription());
            assertEquals("Dolyak Mail", item.getName());
            assertEquals(Integer.valueOf(20),  item.getLevel());
            assertEquals(Integer.valueOf(1000),  item.getVendorValue());
            assertEquals(Rarity.Masterwork, item.getRarity());
            assertEquals(2,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.SoulBindOnUse, ItemFlags.SoulbindOnAcquire})));
            assertEquals(1,  item.getRestrictions().size());
            assertTrue(item.getRestrictions().containsAll(Arrays.asList(new RestrictionType[] {RestrictionType.Norn})));
            assertEquals(Integer.valueOf(68),  item.getDefense());
            assertEquals(1, item.getInfixUpgrade().getAttributes().size());
            assertTrue(item.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier[] {new AttributeModifier(Attribute.Power, 15)})));
            assertTrue(item.getInfusionSlots().isEmpty());
            assertNull(item.getSuffixItemId());
            assertEquals(ArmorType.Coat, item.getArmorType());
            assertEquals(WeightClass.Heavy, item.getWeightClass());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
}
    @Test
    public void testArmorAsuraRestriction006071() {
        String content = "{\"item_id\":\"6071\",\"name\":\"Adept Boots\",\"type\":\"Armor\",\"level\":\"0\",\"rarity\":\"Exotic\",\"vendor_value\":\"0\",\"icon_file_id\":\"414938\",\"icon_file_signature\":\"6B08396A0F3D44D229B4B6A9725CF9D615B1E023\",\"default_skin\":\"289\",\"game_types\":[\"Pvp\",\n\"PvpLobby\"],\"flags\":[\"NoSell\",\n\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[\"Asura\"],\"armor\":{\"type\":\"Boots\",\"weight_class\":\"Light\",\"defense\":\"133\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ArmorJson);
            IArmor item = (IArmor) itemJson.getEntity();
            assertEquals(Integer.valueOf(6071),  item.getId());
            assertFalse(item.getAvailableInActivity());
            assertFalse(item.getAvailableInDungeon());
            assertFalse(item.getAvailableInPvE());
            assertTrue(item.getAvailableInPvP());
            assertTrue(item.getAvailableInPvPLobby());
            assertFalse(item.getAvailableInWvW());
            assertNull(item.getDescription());
            assertEquals("Adept Boots", item.getName());
            assertEquals(Integer.valueOf(0),  item.getLevel());
            assertEquals(Integer.valueOf(0),  item.getVendorValue());
            assertEquals(Rarity.Exotic, item.getRarity());
            assertEquals(3,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.SoulBindOnUse, ItemFlags.NoSell, ItemFlags.SoulbindOnAcquire})));
            assertEquals(1,  item.getRestrictions().size());
            assertTrue(item.getRestrictions().containsAll(Arrays.asList(new RestrictionType[] {RestrictionType.Asura})));
            assertEquals(Integer.valueOf(133),  item.getDefense());
            assertTrue(item.getInfixUpgrade().getAttributes().isEmpty());
            assertTrue(item.getInfusionSlots().isEmpty());
            assertNull(item.getSuffixItemId());
            assertEquals(ArmorType.Boots, item.getArmorType());
            assertEquals(WeightClass.Light, item.getWeightClass());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
}
    @Test
    public void testArmorHumanRestriction006198() {
        String content = "{\"item_id\":\"6198\",\"name\":\"Scout's Coat\",\"type\":\"Armor\",\"level\":\"0\",\"rarity\":\"Exotic\",\"vendor_value\":\"0\",\"icon_file_id\":\"218908\",\"icon_file_signature\":\"115DDCB29BEA675FF4777EB675202E0CCE94AB3B\",\"default_skin\":\"392\",\"game_types\":[\"Pvp\",\n\"PvpLobby\"],\"flags\":[\"NoSell\",\n\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[\"Human\"],\"armor\":{\"type\":\"Coat\",\"weight_class\":\"Medium\",\"defense\":\"338\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ArmorJson);
            IArmor item = (IArmor) itemJson.getEntity();
            assertEquals(Integer.valueOf(6198),  item.getId());
            assertFalse(item.getAvailableInActivity());
            assertFalse(item.getAvailableInDungeon());
            assertFalse(item.getAvailableInPvE());
            assertTrue(item.getAvailableInPvP());
            assertTrue(item.getAvailableInPvPLobby());
            assertFalse(item.getAvailableInWvW());
            assertNull(item.getDescription());
            assertEquals("Scout's Coat", item.getName());
            assertEquals(Integer.valueOf(0),  item.getLevel());
            assertEquals(Integer.valueOf(0),  item.getVendorValue());
            assertEquals(Rarity.Exotic, item.getRarity());
            assertEquals(3,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.SoulBindOnUse, ItemFlags.NoSell, ItemFlags.SoulbindOnAcquire})));
            assertEquals(1,  item.getRestrictions().size());
            assertTrue(item.getRestrictions().containsAll(Arrays.asList(new RestrictionType[] {RestrictionType.Human})));
            assertEquals(Integer.valueOf(338),  item.getDefense());
            assertTrue(item.getInfixUpgrade().getAttributes().isEmpty());
            assertTrue(item.getInfusionSlots().isEmpty());
            assertNull(item.getSuffixItemId());
            assertEquals(ArmorType.Coat, item.getArmorType());
            assertEquals(WeightClass.Medium, item.getWeightClass());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
}
    @Test
    public void testArmorClothing039531() {
        String content = "{\"item_id\":\"39531\",\"name\":\"Riding Gloves\",\"description\":\"Town clothes can no longer be equipped separately.\nTalk to a Black Lion armor trader in any major city to exchange this item for an endless casual clothing tonic.\",\"type\":\"Armor\",\"level\":\"0\",\"rarity\":\"Fine\",\"vendor_value\":\"0\",\"icon_file_id\":\"543865\",\"icon_file_signature\":\"0B4B9E34265466099D9C09721664BEA967356C04\",\"default_skin\":\"1148\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"PvpLobby\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"NoMysticForge\",\n\"NoSell\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"armor\":{\"type\":\"Gloves\",\"weight_class\":\"Clothing\",\"defense\":\"0\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ArmorJson);
            IArmor item = (IArmor) itemJson.getEntity();
            assertEquals(Integer.valueOf(39531),  item.getId());
            assertTrue(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertTrue(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertEquals("Town clothes can no longer be equipped separately.\nTalk to a Black Lion armor trader in any major city to exchange this item for an endless casual clothing tonic.", item.getDescription());
            assertEquals("Riding Gloves", item.getName());
            assertEquals(Integer.valueOf(0),  item.getLevel());
            assertEquals(Integer.valueOf(0),  item.getVendorValue());
            assertEquals(Rarity.Fine, item.getRarity());
            assertEquals(4,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.AccountBindOnUse, ItemFlags.NoSell, ItemFlags.AccountBound, ItemFlags.NoMysticForge})));
            assertTrue(item.getRestrictions().isEmpty());
            assertEquals(Integer.valueOf(0),  item.getDefense());
            assertTrue(item.getInfixUpgrade().getAttributes().isEmpty());
            assertTrue(item.getInfusionSlots().isEmpty());
            assertNull(item.getSuffixItemId());
            assertEquals(ArmorType.Gloves, item.getArmorType());
            assertEquals(WeightClass.Clothing, item.getWeightClass());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
}
    @Test
    public void testArmorSylvariRestriction006155() {
        String content = "{\"item_id\":\"6155\",\"name\":\"Dryad Boots\",\"type\":\"Armor\",\"level\":\"0\",\"rarity\":\"Exotic\",\"vendor_value\":\"0\",\"icon_file_id\":\"61185\",\"icon_file_signature\":\"08483C2E021EAB5409EE03FF4EA2B80D5A1A1166\",\"default_skin\":\"530\",\"game_types\":[\"Pvp\",\n\"PvpLobby\"],\"flags\":[\"NoSell\",\n\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[\"Sylvari\"],\"armor\":{\"type\":\"Boots\",\"weight_class\":\"Light\",\"defense\":\"133\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ArmorJson);
            IArmor item = (IArmor) itemJson.getEntity();
            assertEquals(Integer.valueOf(6155),  item.getId());
            assertFalse(item.getAvailableInActivity());
            assertFalse(item.getAvailableInDungeon());
            assertFalse(item.getAvailableInPvE());
            assertTrue(item.getAvailableInPvP());
            assertTrue(item.getAvailableInPvPLobby());
            assertFalse(item.getAvailableInWvW());
            assertNull(item.getDescription());
            assertEquals("Dryad Boots", item.getName());
            assertEquals(Integer.valueOf(0),  item.getLevel());
            assertEquals(Integer.valueOf(0),  item.getVendorValue());
            assertEquals(Rarity.Exotic, item.getRarity());
            assertEquals(3,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.SoulBindOnUse, ItemFlags.NoSell, ItemFlags.SoulbindOnAcquire})));
            assertEquals(1,  item.getRestrictions().size());
            assertTrue(item.getRestrictions().containsAll(Arrays.asList(new RestrictionType[] {RestrictionType.Sylvari})));
            assertEquals(Integer.valueOf(133),  item.getDefense());
            assertTrue(item.getInfixUpgrade().getAttributes().isEmpty());
            assertTrue(item.getInfusionSlots().isEmpty());
            assertNull(item.getSuffixItemId());
            assertEquals(ArmorType.Boots, item.getArmorType());
            assertEquals(WeightClass.Light, item.getWeightClass());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
}
    @Test
    public void testArmorCharrRestriction006179() {
        String content = "{\"item_id\":\"6179\",\"name\":\"Drover Boots\",\"type\":\"Armor\",\"level\":\"0\",\"rarity\":\"Exotic\",\"vendor_value\":\"0\",\"icon_file_id\":\"61216\",\"icon_file_signature\":\"D56CD998247A5A01B1C2333BD21C49F312393FA3\",\"default_skin\":\"350\",\"game_types\":[\"Pvp\",\n\"PvpLobby\"],\"flags\":[\"NoSell\",\n\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[\"Charr\"],\"armor\":{\"type\":\"Boots\",\"weight_class\":\"Medium\",\"defense\":\"157\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ArmorJson);
            IArmor item = (IArmor) itemJson.getEntity();
            assertEquals(Integer.valueOf(6179),  item.getId());
            assertFalse(item.getAvailableInActivity());
            assertFalse(item.getAvailableInDungeon());
            assertFalse(item.getAvailableInPvE());
            assertTrue(item.getAvailableInPvP());
            assertTrue(item.getAvailableInPvPLobby());
            assertFalse(item.getAvailableInWvW());
            assertNull(item.getDescription());
            assertEquals("Drover Boots", item.getName());
            assertEquals(Integer.valueOf(0),  item.getLevel());
            assertEquals(Integer.valueOf(0),  item.getVendorValue());
            assertEquals(Rarity.Exotic, item.getRarity());
            assertEquals(3,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.SoulBindOnUse, ItemFlags.NoSell, ItemFlags.SoulbindOnAcquire})));
            assertEquals(1,  item.getRestrictions().size());
            assertTrue(item.getRestrictions().containsAll(Arrays.asList(new RestrictionType[] {RestrictionType.Charr})));
            assertEquals(Integer.valueOf(157),  item.getDefense());
            assertTrue(item.getInfixUpgrade().getAttributes().isEmpty());
            assertTrue(item.getInfusionSlots().isEmpty());
            assertNull(item.getSuffixItemId());
            assertEquals(ArmorType.Boots, item.getArmorType());
            assertEquals(WeightClass.Medium, item.getWeightClass());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
}
    @Test
    public void testArmorHelmAquatic004943() {
        String content = "{\"item_id\":\"4943\",\"name\":\"Metal Aquabreather\",\"description\":\"<c=@flavor>\\\"Quaggan found this in a shipwreck underwater. Quaggan doesn't need it. OoOOoo! It's very nice, though!\\\"<br>—Leemoola </c>\",\"type\":\"Armor\",\"level\":\"60\",\"rarity\":\"Fine\",\"vendor_value\":\"65\",\"icon_file_id\":\"61297\",\"icon_file_signature\":\"FA1D042B0845BED8DA3CFA0FAA0837D5EB0207A6\",\"default_skin\":\"854\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"HideSuffix\",\n\"NoSalvage\",\n\"NoSell\",\n\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"armor\":{\"type\":\"HelmAquatic\",\"weight_class\":\"Heavy\",\"defense\":\"62\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":\"22\"},\n{\"attribute\":\"Precision\",\"modifier\":\"16\"},\n{\"attribute\":\"Vitality\",\"modifier\":\"16\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ArmorJson);
            IArmor item = (IArmor) itemJson.getEntity();
            assertEquals(Integer.valueOf(4943),  item.getId());
            assertTrue(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertFalse(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertEquals("<c=@flavor>\"Quaggan found this in a shipwreck underwater. Quaggan doesn't need it. OoOOoo! It's very nice, though!\"<br>—Leemoola </c>", item.getDescription());
            assertEquals("Metal Aquabreather", item.getName());
            assertEquals(Integer.valueOf(60),  item.getLevel());
            assertEquals(Integer.valueOf(65),  item.getVendorValue());
            assertEquals(Rarity.Fine, item.getRarity());
            assertEquals(5,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.SoulBindOnUse, ItemFlags.HideSuffix, ItemFlags.NoSalvage, ItemFlags.NoSell, ItemFlags.SoulbindOnAcquire})));
            assertTrue(item.getRestrictions().isEmpty());
            assertEquals(Integer.valueOf(62),  item.getDefense());
            assertEquals(3, item.getInfixUpgrade().getAttributes().size());
            assertTrue(item.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier[] {new AttributeModifier(Attribute.Healing, 22), new AttributeModifier(Attribute.Precision, 16), new AttributeModifier(Attribute.Vitality, 16)})));
            assertTrue(item.getInfusionSlots().isEmpty());
            assertNull(item.getSuffixItemId());
            assertEquals(ArmorType.HelmAquatic, item.getArmorType());
            assertEquals(WeightClass.Heavy, item.getWeightClass());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
}
    @Test
    public void testArmorNotUpgradeable001321() {
        String content = "{\"item_id\":\"1321\",\"name\":\"Mighty Worn Chain Gauntlets\",\"description\":\"\",\"type\":\"Armor\",\"level\":\"0\",\"rarity\":\"Basic\",\"vendor_value\":\"5\",\"icon_file_id\":\"61053\",\"icon_file_signature\":\"E21E356DE0083C4DBE95C0DD0EA13C47DF55C6BA\",\"default_skin\":\"50\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"NotUpgradeable\"],\"restrictions\":[],\"armor\":{\"type\":\"Gloves\",\"weight_class\":\"Heavy\",\"defense\":\"14\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":\"2\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ArmorJson);
            IArmor item = (IArmor) itemJson.getEntity();
            assertEquals(Integer.valueOf(1321),  item.getId());
            assertTrue(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertFalse(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertEquals("", item.getDescription());
            assertEquals("Mighty Worn Chain Gauntlets", item.getName());
            assertEquals(Integer.valueOf(0),  item.getLevel());
            assertEquals(Integer.valueOf(5),  item.getVendorValue());
            assertEquals(Rarity.Basic, item.getRarity());
            assertEquals(1,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.NotUpgradeable})));
            assertTrue(item.getRestrictions().isEmpty());
            assertEquals(Integer.valueOf(14),  item.getDefense());
            assertEquals(1, item.getInfixUpgrade().getAttributes().size());
            assertTrue(item.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier[] {new AttributeModifier(Attribute.Power, 2)})));
            assertTrue(item.getInfusionSlots().isEmpty());
            assertNull(item.getSuffixItemId());
            assertEquals(ArmorType.Gloves, item.getArmorType());
            assertEquals(WeightClass.Heavy, item.getWeightClass());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
}
    @Test
    public void testArmorGuardianRestrictionWarriorRestriction018160() {
        String content = "{\"item_id\":\"18160\",\"name\":\"Body of Koda\",\"type\":\"Armor\",\"level\":\"80\",\"rarity\":\"Exotic\",\"vendor_value\":\"370\",\"icon_file_id\":\"218952\",\"icon_file_signature\":\"5B3D97ACE0B564D69B7B020AE94016D49E01EEFC\",\"default_skin\":\"707\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"NoSell\",\n\"SoulBindOnUse\"],\"restrictions\":[\"Guardian\",\n\"Warrior\"],\"armor\":{\"type\":\"Leggings\",\"weight_class\":\"Heavy\",\"defense\":\"242\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":\"67\"},\n{\"attribute\":\"Precision\",\"modifier\":\"48\"},\n{\"attribute\":\"Vitality\",\"modifier\":\"48\"}]},\"suffix_item_id\":\"24857\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ArmorJson);
            IArmor item = (IArmor) itemJson.getEntity();
            assertEquals(Integer.valueOf(18160),  item.getId());
            assertTrue(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertFalse(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertNull(item.getDescription());
            assertEquals("Body of Koda", item.getName());
            assertEquals(Integer.valueOf(80),  item.getLevel());
            assertEquals(Integer.valueOf(370),  item.getVendorValue());
            assertEquals(Rarity.Exotic, item.getRarity());
            assertEquals(3,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.SoulBindOnUse, ItemFlags.NoSell, ItemFlags.AccountBound})));
            assertEquals(2,  item.getRestrictions().size());
            assertTrue(item.getRestrictions().containsAll(Arrays.asList(new RestrictionType[] {RestrictionType.Guardian, RestrictionType.Warrior})));
            assertEquals(Integer.valueOf(242),  item.getDefense());
            assertEquals(3, item.getInfixUpgrade().getAttributes().size());
            assertTrue(item.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier[] {new AttributeModifier(Attribute.Healing, 67), new AttributeModifier(Attribute.Precision, 48), new AttributeModifier(Attribute.Vitality, 48)})));
            assertTrue(item.getInfusionSlots().isEmpty());
            assertEquals(Integer.valueOf(24857),  item.getSuffixItemId());
            assertEquals(ArmorType.Leggings, item.getArmorType());
            assertEquals(WeightClass.Heavy, item.getWeightClass());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
}
}
