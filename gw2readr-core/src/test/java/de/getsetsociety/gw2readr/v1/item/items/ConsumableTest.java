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


public class ConsumableTest {

    private ObjectMapper mapper = ObjectMapperProvider.getMapper();

    @Test
    public void testConsumableUnlock067224() {
        String content = "{\"item_id\":\"67224\",\"name\":\"Recipe: Hylek Maintenance Oil\",\"type\":\"Consumable\",\"level\":\"0\",\"rarity\":\"Masterwork\",\"vendor_value\":\"0\",\"icon_file_id\":\"849374\",\"icon_file_signature\":\"E19734B71C949924A1353106E513DE62729A5313\",\"game_types\":[\"Dungeon\",\n\"Pve\",\n\"PvpLobby\"],\"flags\":[\"AccountBound\",\n\"NoMysticForge\",\n\"NoSalvage\",\n\"NoSell\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"consumable\":{\"type\":\"Unlock\",\"unlock_type\":\"CraftingRecipe\",\"recipe_id\":\"9802\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ConsumableJson);
            IConsumable item = (IConsumable) itemJson.getEntity();
            assertEquals(Integer.valueOf(67224),  item.getId());
            assertFalse(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertTrue(item.getAvailableInPvPLobby());
            assertFalse(item.getAvailableInWvW());
            assertNull(item.getDescription());
            assertEquals("Recipe: Hylek Maintenance Oil", item.getName());
            assertEquals(Integer.valueOf(0),  item.getLevel());
            assertEquals(Integer.valueOf(0),  item.getVendorValue());
            assertEquals(Rarity.Masterwork, item.getRarity());
            assertEquals(5,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.NoSalvage, ItemFlags.AccountBindOnUse, ItemFlags.NoSell, ItemFlags.AccountBound, ItemFlags.NoMysticForge})));
            assertTrue(item.getRestrictions().isEmpty());
            assertNull(item.getDurationMs());
            assertEquals(Integer.valueOf(9802),  item.getRecipeId());
            assertNull(item.getColorId());
            assertEquals(ConsumableType.Unlock, item.getConsumableType());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testConsumableTransmutation043030() {
        String content = "{\"item_id\":\"43030\",\"name\":\"Zodiac Heavy Pauldron Skin\",\"description\":\"Double-click to apply this look to any other heavy shoulders.\",\"type\":\"Consumable\",\"level\":\"0\",\"rarity\":\"Rare\",\"vendor_value\":\"0\",\"icon_file_id\":\"740310\",\"icon_file_signature\":\"7103363125DE26136F03F4044DBD56CE60AD774F\",\"game_types\":[\"Dungeon\",\n\"Pve\",\n\"PvpLobby\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"NoSalvage\",\n\"NoSell\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"consumable\":{\"type\":\"Transmutation\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ConsumableJson);
            IConsumable item = (IConsumable) itemJson.getEntity();
            assertEquals(Integer.valueOf(43030),  item.getId());
            assertFalse(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertTrue(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertNull(item.getDescription());
            assertEquals("Zodiac Heavy Pauldron Skin", item.getName());
            assertEquals(Integer.valueOf(0),  item.getLevel());
            assertEquals(Integer.valueOf(0),  item.getVendorValue());
            assertEquals(Rarity.Rare, item.getRarity());
            assertEquals(4,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.NoSalvage, ItemFlags.AccountBindOnUse, ItemFlags.NoSell, ItemFlags.AccountBound})));
            assertTrue(item.getRestrictions().isEmpty());
            assertNull(item.getDurationMs());
            assertNull(item.getRecipeId());
            assertNull(item.getColorId());
            assertEquals(ConsumableType.Transmutation, item.getConsumableType());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testConsumableFood012438() {
        String content = "{\"item_id\":\"12438\",\"name\":\"Roasted Parsnip\",\"type\":\"Consumable\",\"level\":\"60\",\"rarity\":\"Fine\",\"vendor_value\":\"28\",\"icon_file_id\":\"433631\",\"icon_file_signature\":\"9BDEC1C190259D0D27C727621C4E0853EEE84726\",\"game_types\":[\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"consumable\":{\"type\":\"Food\",\"duration_ms\":\"1800000\",\"description\":\"-36% Stun Duration\n+60 Toughness\n+10% Experience from Kills\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ConsumableJson);
            IConsumable item = (IConsumable) itemJson.getEntity();
            assertEquals(Integer.valueOf(12438),  item.getId());
            assertFalse(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertFalse(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertEquals("-36% Stun Duration\n+60 Toughness\n+10% Experience from Kills", item.getDescription());
            assertEquals("Roasted Parsnip", item.getName());
            assertEquals(Integer.valueOf(60),  item.getLevel());
            assertEquals(Integer.valueOf(28),  item.getVendorValue());
            assertEquals(Rarity.Fine, item.getRarity());
            assertEquals(1,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.NoSell})));
            assertTrue(item.getRestrictions().isEmpty());
            assertEquals(Integer.valueOf(1800000),  item.getDurationMs());
            assertNull(item.getRecipeId());
            assertNull(item.getColorId());
            assertEquals(ConsumableType.Food, item.getConsumableType());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testConsumableGeneric020328() {
        String content = "{\"item_id\":\"20328\",\"name\":\"Owl Tonic\",\"description\":\"Double-click to drink, transforming you into an animal for fifteen minutes. You will be unable to fight while transformed.\",\"type\":\"Consumable\",\"level\":\"0\",\"rarity\":\"Basic\",\"vendor_value\":\"0\",\"icon_file_id\":\"63129\",\"icon_file_signature\":\"C6A3FFF06BB4D50050D3B1FE75E3AACBFA0F8009\",\"game_types\":[\"Dungeon\",\n\"Pve\",\n\"PvpLobby\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"NoSell\",\n\"AccountBindOnUse\",\n\"NoUnderwater\"],\"restrictions\":[],\"consumable\":{\"type\":\"Generic\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ConsumableJson);
            IConsumable item = (IConsumable) itemJson.getEntity();
            assertEquals(Integer.valueOf(20328),  item.getId());
            assertFalse(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertTrue(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertNull(item.getDescription());
            assertEquals("Owl Tonic", item.getName());
            assertEquals(Integer.valueOf(0),  item.getLevel());
            assertEquals(Integer.valueOf(0),  item.getVendorValue());
            assertEquals(Rarity.Basic, item.getRarity());
            assertEquals(4,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.AccountBindOnUse, ItemFlags.NoSell, ItemFlags.NoUnderwater, ItemFlags.AccountBound})));
            assertTrue(item.getRestrictions().isEmpty());
            assertNull(item.getDurationMs());
            assertNull(item.getRecipeId());
            assertNull(item.getColorId());
            assertEquals(ConsumableType.Generic, item.getConsumableType());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testConsumableUtility009472() {
        String content = "{\"item_id\":\"9472\",\"name\":\"Artisan Tuning Crystal\",\"type\":\"Consumable\",\"level\":\"45\",\"rarity\":\"Fine\",\"vendor_value\":\"23\",\"icon_file_id\":\"219371\",\"icon_file_signature\":\"B670B12A2D1444920856944E1B98D60A4F28C17B\",\"game_types\":[\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[],\"restrictions\":[],\"consumable\":{\"type\":\"Utility\",\"duration_ms\":\"1800000\",\"description\":\"Gain Condition Damage Equal to 4% of Your Toughness\nGain Condition Damage Equal to 2% of Your Vitality\n+10% Experience from Kills\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ConsumableJson);
            IConsumable item = (IConsumable) itemJson.getEntity();
            assertEquals(Integer.valueOf(9472),  item.getId());
            assertFalse(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertFalse(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertEquals("Gain Condition Damage Equal to 4% of Your Toughness\nGain Condition Damage Equal to 2% of Your Vitality\n+10% Experience from Kills", item.getDescription());
            assertEquals("Artisan Tuning Crystal", item.getName());
            assertEquals(Integer.valueOf(45),  item.getLevel());
            assertEquals(Integer.valueOf(23),  item.getVendorValue());
            assertEquals(Rarity.Fine, item.getRarity());
            assertTrue(item.getFlags().isEmpty());
            assertTrue(item.getRestrictions().isEmpty());
            assertEquals(Integer.valueOf(1800000),  item.getDurationMs());
            assertNull(item.getRecipeId());
            assertNull(item.getColorId());
            assertEquals(ConsumableType.Utility, item.getConsumableType());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testConsumableBooze008583() {
        String content = "{\"item_id\":\"8583\",\"name\":\"Jug of Hard Apple Cider\",\"type\":\"Consumable\",\"level\":\"0\",\"rarity\":\"Basic\",\"vendor_value\":\"2\",\"icon_file_id\":\"63060\",\"icon_file_signature\":\"9995D3ED4F139D289C02C258C1F6953B2742173A\",\"game_types\":[\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[],\"restrictions\":[],\"consumable\":{\"type\":\"Booze\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ConsumableJson);
            IConsumable item = (IConsumable) itemJson.getEntity();
            assertEquals(Integer.valueOf(8583),  item.getId());
            assertFalse(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertFalse(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertNull(item.getDescription());
            assertEquals("Jug of Hard Apple Cider", item.getName());
            assertEquals(Integer.valueOf(0),  item.getLevel());
            assertEquals(Integer.valueOf(2),  item.getVendorValue());
            assertEquals(Rarity.Basic, item.getRarity());
            assertTrue(item.getFlags().isEmpty());
            assertTrue(item.getRestrictions().isEmpty());
            assertNull(item.getDurationMs());
            assertNull(item.getRecipeId());
            assertNull(item.getColorId());
            assertEquals(ConsumableType.Booze, item.getConsumableType());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testConsumableImmediate008459() {
        String content = "{\"item_id\":\"8459\",\"name\":\"Rejuvenation Booster\",\"type\":\"Consumable\",\"level\":\"0\",\"rarity\":\"Masterwork\",\"vendor_value\":\"0\",\"icon_file_id\":\"434412\",\"icon_file_signature\":\"0439C04FE14D6AEC802A47139F78DD6729EC63A0\",\"game_types\":[\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"NoMysticForge\",\n\"NoSalvage\",\n\"NoSell\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"consumable\":{\"type\":\"Immediate\",\"duration_ms\":\"3600000\",\"description\":\"Regenerate health\n(Will be removed if you enter Competitive PvP)\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ConsumableJson);
            IConsumable item = (IConsumable) itemJson.getEntity();
            assertEquals(Integer.valueOf(8459),  item.getId());
            assertFalse(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertFalse(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertEquals("Regenerate health\n(Will be removed if you enter Competitive PvP)", item.getDescription());
            assertEquals("Rejuvenation Booster", item.getName());
            assertEquals(Integer.valueOf(0),  item.getLevel());
            assertEquals(Integer.valueOf(0),  item.getVendorValue());
            assertEquals(Rarity.Masterwork, item.getRarity());
            assertEquals(5,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.NoSalvage, ItemFlags.AccountBindOnUse, ItemFlags.NoSell, ItemFlags.AccountBound, ItemFlags.NoMysticForge})));
            assertTrue(item.getRestrictions().isEmpty());
            assertEquals(Integer.valueOf(3600000),  item.getDurationMs());
            assertNull(item.getRecipeId());
            assertNull(item.getColorId());
            assertEquals(ConsumableType.Immediate, item.getConsumableType());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testConsumableHalloween020015() {
        String content = "{\"item_id\":\"20015\",\"name\":\"Speed Booster\",\"description\":\"Double-click to gain a buff that increases your speed by 15% for one hour.\",\"type\":\"Consumable\",\"level\":\"0\",\"rarity\":\"Masterwork\",\"vendor_value\":\"0\",\"icon_file_id\":\"434414\",\"icon_file_signature\":\"084BE7C2740C735DEA6F0FA4A6C4CA0639B49F4B\",\"game_types\":[\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"NoSell\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"consumable\":{\"type\":\"Halloween\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ConsumableJson);
            IConsumable item = (IConsumable) itemJson.getEntity();
            assertEquals(Integer.valueOf(20015),  item.getId());
            assertFalse(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertFalse(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertNull(item.getDescription());
            assertEquals("Speed Booster", item.getName());
            assertEquals(Integer.valueOf(0),  item.getLevel());
            assertEquals(Integer.valueOf(0),  item.getVendorValue());
            assertEquals(Rarity.Masterwork, item.getRarity());
            assertEquals(3,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.AccountBindOnUse, ItemFlags.NoSell, ItemFlags.AccountBound})));
            assertTrue(item.getRestrictions().isEmpty());
            assertNull(item.getDurationMs());
            assertNull(item.getRecipeId());
            assertNull(item.getColorId());
            assertEquals(ConsumableType.Halloween, item.getConsumableType());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testConsumableAppearanceChange036285() {
        String content = "{\"item_id\":\"36285\",\"name\":\"Total Makeover Kit\",\"description\":\"Double-click to modify your appearance: height, physique, skin color, markings, face, hair, even gender. Race and profession will remain the same. This kit is consumed on accepting a new appearance.\",\"type\":\"Consumable\",\"level\":\"0\",\"rarity\":\"Masterwork\",\"vendor_value\":\"8\",\"icon_file_id\":\"495503\",\"icon_file_signature\":\"91BD906F3DB001B01D18B505CC0C9920C4451E97\",\"game_types\":[\"Dungeon\",\n\"Pve\",\n\"PvpLobby\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"NoMysticForge\",\n\"NoSalvage\",\n\"NoSell\",\n\"SoulbindOnAcquire\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"consumable\":{\"type\":\"AppearanceChange\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ConsumableJson);
            IConsumable item = (IConsumable) itemJson.getEntity();
            assertEquals(Integer.valueOf(36285),  item.getId());
            assertFalse(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertTrue(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertNull(item.getDescription());
            assertEquals("Total Makeover Kit", item.getName());
            assertEquals(Integer.valueOf(0),  item.getLevel());
            assertEquals(Integer.valueOf(8),  item.getVendorValue());
            assertEquals(Rarity.Masterwork, item.getRarity());
            assertEquals(6,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.NoSalvage, ItemFlags.AccountBindOnUse, ItemFlags.NoSell, ItemFlags.SoulbindOnAcquire, ItemFlags.AccountBound, ItemFlags.NoMysticForge})));
            assertTrue(item.getRestrictions().isEmpty());
            assertNull(item.getDurationMs());
            assertNull(item.getRecipeId());
            assertNull(item.getColorId());
            assertEquals(ConsumableType.AppearanceChange, item.getConsumableType());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testConsumableContractNpc020018() {
        String content = "{\"item_id\":\"20018\",\"name\":\"Merchant Express\",\"description\":\"Double-click to summon a Black Lion Merchant for 15 minutes, allowing you and your allies to access basic supplies and sell loot. Single-use.\",\"type\":\"Consumable\",\"level\":\"0\",\"rarity\":\"Fine\",\"vendor_value\":\"4\",\"icon_file_id\":\"220570\",\"icon_file_signature\":\"400957BB0BA4670F08DA58CC26C33F910C2B16B6\",\"game_types\":[\"Dungeon\",\n\"Pve\",\n\"PvpLobby\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"NoSalvage\",\n\"NoSell\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"consumable\":{\"type\":\"ContractNpc\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ConsumableJson);
            IConsumable item = (IConsumable) itemJson.getEntity();
            assertEquals(Integer.valueOf(20018),  item.getId());
            assertFalse(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertTrue(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertNull(item.getDescription());
            assertEquals("Merchant Express", item.getName());
            assertEquals(Integer.valueOf(0),  item.getLevel());
            assertEquals(Integer.valueOf(4),  item.getVendorValue());
            assertEquals(Rarity.Fine, item.getRarity());
            assertEquals(4,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.NoSalvage, ItemFlags.AccountBindOnUse, ItemFlags.NoSell, ItemFlags.AccountBound})));
            assertTrue(item.getRestrictions().isEmpty());
            assertNull(item.getDurationMs());
            assertNull(item.getRecipeId());
            assertNull(item.getColorId());
            assertEquals(ConsumableType.ContractNpc, item.getConsumableType());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testConsumableUpgradeRemoval020349() {
        String content = "{\"item_id\":\"20349\",\"name\":\"Upgrade Extractor\",\"description\":\"This tool will remove the upgrades from any item, without destroying either the upgrade or the item.\",\"type\":\"Consumable\",\"level\":\"0\",\"rarity\":\"Fine\",\"vendor_value\":\"0\",\"icon_file_id\":\"674829\",\"icon_file_signature\":\"0E92A458B335144232EB357A3C96DB273B09AD3B\",\"game_types\":[\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"NoMysticForge\",\n\"NoSell\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"consumable\":{\"type\":\"UpgradeRemoval\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ConsumableJson);
            IConsumable item = (IConsumable) itemJson.getEntity();
            assertEquals(Integer.valueOf(20349),  item.getId());
            assertFalse(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertFalse(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertNull(item.getDescription());
            assertEquals("Upgrade Extractor", item.getName());
            assertEquals(Integer.valueOf(0),  item.getLevel());
            assertEquals(Integer.valueOf(0),  item.getVendorValue());
            assertEquals(Rarity.Fine, item.getRarity());
            assertEquals(4,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.AccountBindOnUse, ItemFlags.NoSell, ItemFlags.AccountBound, ItemFlags.NoMysticForge})));
            assertTrue(item.getRestrictions().isEmpty());
            assertNull(item.getDurationMs());
            assertNull(item.getRecipeId());
            assertNull(item.getColorId());
            assertEquals(ConsumableType.UpgradeRemoval, item.getConsumableType());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}
