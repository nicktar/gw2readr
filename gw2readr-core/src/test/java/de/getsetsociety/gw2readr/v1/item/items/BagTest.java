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


public class BagTest {

    private ObjectMapper mapper = ObjectMapperProvider.getMapper();

    @Test
    public void testBagNoRestriction009579() {
        String content = "{\"item_id\":\"9579\",\"name\":\"18 Slot Invisible Pack\",\"description\":\"18 Slots. Items in this pack will never appear in a sell-to-vendor list and will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":\"0\",\"rarity\":\"Fine\",\"vendor_value\":\"22\",\"icon_file_id\":\"433583\",\"icon_file_signature\":\"32EDA3695F0451925EB2B8730F711FB5AEE2044E\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[],\"restrictions\":[],\"bag\":{\"no_sell_or_sort\":\"1\",\"size\":\"18\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof BagJson);
            IBag item = (IBag) itemJson.getEntity();
            assertEquals(Integer.valueOf(9579),  item.getId());
            assertTrue(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertFalse(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertEquals("18 Slots. Items in this pack will never appear in a sell-to-vendor list and will not move when inventory is sorted.", item.getDescription());
            assertEquals("18 Slot Invisible Pack", item.getName());
            assertEquals(Integer.valueOf(0),  item.getLevel());
            assertEquals(Integer.valueOf(22),  item.getVendorValue());
            assertEquals(Rarity.Fine, item.getRarity());
            assertTrue(item.getFlags().isEmpty());
            assertTrue(item.getRestrictions().isEmpty());
            assertEquals(Integer.valueOf(18),  item.getSize());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testBagNoSalvageAccountBindOnUseNoSellAccountBound008941() {
        String content = "{\"item_id\":\"8941\",\"name\":\"Leather Bag\",\"description\":\"4 Slots\",\"type\":\"Bag\",\"level\":\"0\",\"rarity\":\"Basic\",\"vendor_value\":\"4\",\"icon_file_id\":\"63172\",\"icon_file_signature\":\"0CD55FE36D39E30AA94A96030D73EF22250E0E26\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"NoSalvage\",\n\"NoSell\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"bag\":{\"no_sell_or_sort\":\"0\",\"size\":\"4\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof BagJson);
            IBag item = (IBag) itemJson.getEntity();
            assertEquals(Integer.valueOf(8941),  item.getId());
            assertTrue(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertFalse(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertEquals("4 Slots", item.getDescription());
            assertEquals("Leather Bag", item.getName());
            assertEquals(Integer.valueOf(0),  item.getLevel());
            assertEquals(Integer.valueOf(4),  item.getVendorValue());
            assertEquals(Rarity.Basic, item.getRarity());
            assertEquals(4,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.NoSalvage, ItemFlags.AccountBindOnUse, ItemFlags.NoSell, ItemFlags.AccountBound})));
            assertTrue(item.getRestrictions().isEmpty());
            assertEquals(Integer.valueOf(4),  item.getSize());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testBagSoulBindOnUseSoulbindOnAcquire036040() {
        String content = "{\"item_id\":\"36040\",\"name\":\"10 Slot Trick-or-Treat Bag\",\"description\":\"10 Slots\",\"type\":\"Bag\",\"level\":\"0\",\"rarity\":\"Basic\",\"vendor_value\":\"22\",\"icon_file_id\":\"499375\",\"icon_file_signature\":\"E6017363449406DEE3DD3B80263AA2A91716F1DE\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"bag\":{\"no_sell_or_sort\":\"0\",\"size\":\"10\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof BagJson);
            IBag item = (IBag) itemJson.getEntity();
            assertEquals(Integer.valueOf(36040),  item.getId());
            assertTrue(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertFalse(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertEquals("10 Slots", item.getDescription());
            assertEquals("10 Slot Trick-or-Treat Bag", item.getName());
            assertEquals(Integer.valueOf(0),  item.getLevel());
            assertEquals(Integer.valueOf(22),  item.getVendorValue());
            assertEquals(Rarity.Basic, item.getRarity());
            assertEquals(2,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.SoulBindOnUse, ItemFlags.SoulbindOnAcquire})));
            assertTrue(item.getRestrictions().isEmpty());
            assertEquals(Integer.valueOf(10),  item.getSize());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testBagNoMysticForge036729() {
        String content = "{\"item_id\":\"36729\",\"name\":\"Ancient Karka Shell Box\",\"description\":\"20 Slots\",\"type\":\"Bag\",\"level\":\"0\",\"rarity\":\"Exotic\",\"vendor_value\":\"256\",\"icon_file_id\":\"511766\",\"icon_file_signature\":\"CFFC295D57E0423CA5360AD4E669D2DAFCD9E580\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"NoMysticForge\",\n\"NoSalvage\",\n\"NoSell\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"bag\":{\"no_sell_or_sort\":\"0\",\"size\":\"20\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof BagJson);
            IBag item = (IBag) itemJson.getEntity();
            assertEquals(Integer.valueOf(36729),  item.getId());
            assertTrue(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertFalse(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertEquals("20 Slots", item.getDescription());
            assertEquals("Ancient Karka Shell Box", item.getName());
            assertEquals(Integer.valueOf(0),  item.getLevel());
            assertEquals(Integer.valueOf(256),  item.getVendorValue());
            assertEquals(Rarity.Exotic, item.getRarity());
            assertEquals(5,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.NoSalvage, ItemFlags.AccountBindOnUse, ItemFlags.NoSell, ItemFlags.AccountBound, ItemFlags.NoMysticForge})));
            assertTrue(item.getRestrictions().isEmpty());
            assertEquals(Integer.valueOf(20),  item.getSize());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testBagUnique038010() {
        String content = "{\"item_id\":\"38010\",\"name\":\"20 Slot Fractal Bag\",\"description\":\"20 Slot\",\"type\":\"Bag\",\"level\":\"0\",\"rarity\":\"Rare\",\"vendor_value\":\"189\",\"icon_file_id\":\"511997\",\"icon_file_signature\":\"2CB59328EA6C742169DB0773B9F5A7414892914B\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"AccountBindOnUse\",\n\"Unique\"],\"restrictions\":[],\"bag\":{\"no_sell_or_sort\":\"0\",\"size\":\"20\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof BagJson);
            IBag item = (IBag) itemJson.getEntity();
            assertEquals(Integer.valueOf(38010),  item.getId());
            assertTrue(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertFalse(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertEquals("20 Slot", item.getDescription());
            assertEquals("20 Slot Fractal Bag", item.getName());
            assertEquals(Integer.valueOf(0),  item.getLevel());
            assertEquals(Integer.valueOf(189),  item.getVendorValue());
            assertEquals(Rarity.Rare, item.getRarity());
            assertEquals(3,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.Unique, ItemFlags.AccountBindOnUse, ItemFlags.AccountBound})));
            assertTrue(item.getRestrictions().isEmpty());
            assertEquals(Integer.valueOf(20),  item.getSize());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}
