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


public class ContainerTest {

    private ObjectMapper mapper = ObjectMapperProvider.getMapper();

    @Test
    public void testContainerDefaultAccountBindOnUseNoSellAccountBoundNoRestriction061738() {
        String content = "{\"item_id\":\"61738\",\"name\":\"Li'l Letter Opener\",\"description\":\"A mysteriously light and well-balanced weapon that seems malleable to your wishes. Double-click to choose what form it should take.\",\"type\":\"Container\",\"level\":\"0\",\"rarity\":\"Fine\",\"vendor_value\":\"0\",\"icon_file_id\":\"66164\",\"icon_file_signature\":\"BDAAF7437FD44F2AA7592F0A1EC5F9EEC690F635\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"NoSell\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"container\":{\"type\":\"Default\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ContainerJson);
            IContainer item = (IContainer) itemJson.getEntity();
            assertEquals(Integer.valueOf(61738),  item.getId());
            assertTrue(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertFalse(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertEquals("A mysteriously light and well-balanced weapon that seems malleable to your wishes. Double-click to choose what form it should take.", item.getDescription());
            assertEquals("Li'l Letter Opener", item.getName());
            assertEquals(Integer.valueOf(0),  item.getLevel());
            assertEquals(Integer.valueOf(0),  item.getVendorValue());
            assertEquals(Rarity.Fine, item.getRarity());
            assertEquals(3,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.AccountBindOnUse, ItemFlags.NoSell, ItemFlags.AccountBound})));
            assertTrue(item.getRestrictions().isEmpty());
           assertEquals(ContainerType.Default, item.getContainerType());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testContainerNoSalvageNoMysticForge044387() {
        String content = "{\"item_id\":\"44387\",\"name\":\"Fallen Adventurer's Backpack\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":\"0\",\"rarity\":\"Basic\",\"vendor_value\":\"7\",\"icon_file_id\":\"619509\",\"icon_file_signature\":\"B79141B64E77DE99C80B725B9F0E3FBCD1F54C69\",\"game_types\":[\"Dungeon\",\n\"Pve\",\n\"Pvp\",\n\"PvpLobby\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"NoMysticForge\",\n\"NoSalvage\",\n\"NoSell\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"container\":{\"type\":\"Default\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ContainerJson);
            IContainer item = (IContainer) itemJson.getEntity();
            assertEquals(Integer.valueOf(44387),  item.getId());
            assertFalse(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertTrue(item.getAvailableInPvP());
            assertTrue(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertEquals("Double-click to open.", item.getDescription());
            assertEquals("Fallen Adventurer's Backpack", item.getName());
            assertEquals(Integer.valueOf(0),  item.getLevel());
            assertEquals(Integer.valueOf(7),  item.getVendorValue());
            assertEquals(Rarity.Basic, item.getRarity());
            assertEquals(5,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.NoSalvage, ItemFlags.AccountBindOnUse, ItemFlags.NoSell, ItemFlags.AccountBound, ItemFlags.NoMysticForge})));
            assertTrue(item.getRestrictions().isEmpty());
           assertEquals(ContainerType.Default, item.getContainerType());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testContainerGiftBox012748() {
        String content = "{\"item_id\":\"12748\",\"name\":\"Unidentified Blue Dye\",\"description\":\"Double-click to identify a Common or Uncommon Dye from the Blue spectrum.\",\"type\":\"Container\",\"level\":\"0\",\"rarity\":\"Masterwork\",\"vendor_value\":\"0\",\"icon_file_id\":\"66601\",\"icon_file_signature\":\"09206A087606CFC674AC19E1E5CCADB6B3302061\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"container\":{\"type\":\"GiftBox\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ContainerJson);
            IContainer item = (IContainer) itemJson.getEntity();
            assertEquals(Integer.valueOf(12748),  item.getId());
            assertTrue(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertFalse(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertEquals("Double-click to identify a Common or Uncommon Dye from the Blue spectrum.", item.getDescription());
            assertEquals("Unidentified Blue Dye", item.getName());
            assertEquals(Integer.valueOf(0),  item.getLevel());
            assertEquals(Integer.valueOf(0),  item.getVendorValue());
            assertEquals(Rarity.Masterwork, item.getRarity());
            assertEquals(1,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.NoSell})));
            assertTrue(item.getRestrictions().isEmpty());
           assertEquals(ContainerType.GiftBox, item.getContainerType());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testContainerSoulbindOnAcquire064348() {
        String content = "{\"item_id\":\"64348\",\"name\":\"WvW Achievement Reward Chest\",\"description\":\"Contains essence of luck and badges of honor.\nDouble-click to open.\",\"type\":\"Container\",\"level\":\"0\",\"rarity\":\"Exotic\",\"vendor_value\":\"0\",\"icon_file_id\":\"603242\",\"icon_file_signature\":\"0946149B43355E23B5C7552E6E5DDB4A9160603E\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"PvpLobby\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"NoMysticForge\",\n\"NoSalvage\",\n\"NoSell\",\n\"SoulbindOnAcquire\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"container\":{\"type\":\"Default\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ContainerJson);
            IContainer item = (IContainer) itemJson.getEntity();
            assertEquals(Integer.valueOf(64348),  item.getId());
            assertTrue(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertTrue(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertEquals("Contains essence of luck and badges of honor.\nDouble-click to open.", item.getDescription());
            assertEquals("WvW Achievement Reward Chest", item.getName());
            assertEquals(Integer.valueOf(0),  item.getLevel());
            assertEquals(Integer.valueOf(0),  item.getVendorValue());
            assertEquals(Rarity.Exotic, item.getRarity());
            assertEquals(6,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.NoSalvage, ItemFlags.AccountBindOnUse, ItemFlags.NoSell, ItemFlags.SoulbindOnAcquire, ItemFlags.AccountBound, ItemFlags.NoMysticForge})));
            assertTrue(item.getRestrictions().isEmpty());
           assertEquals(ContainerType.Default, item.getContainerType());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testContainerSoulBindOnUse043961() {
        String content = "{\"item_id\":\"43961\",\"name\":\"Splendid Chest\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":\"0\",\"rarity\":\"Fine\",\"vendor_value\":\"0\",\"icon_file_id\":\"62860\",\"icon_file_signature\":\"730A99AC6A69DD0F5352DAD56A91FC09D76F0D39\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"PvpLobby\",\n\"Wvw\"],\"flags\":[\"NoMysticForge\",\n\"NoSalvage\",\n\"NoSell\",\n\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"container\":{\"type\":\"Default\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ContainerJson);
            IContainer item = (IContainer) itemJson.getEntity();
            assertEquals(Integer.valueOf(43961),  item.getId());
            assertTrue(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertTrue(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertEquals("Double-click to open.", item.getDescription());
            assertEquals("Splendid Chest", item.getName());
            assertEquals(Integer.valueOf(0),  item.getLevel());
            assertEquals(Integer.valueOf(0),  item.getVendorValue());
            assertEquals(Rarity.Fine, item.getRarity());
            assertEquals(5,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.SoulBindOnUse, ItemFlags.NoSalvage, ItemFlags.NoSell, ItemFlags.SoulbindOnAcquire, ItemFlags.NoMysticForge})));
            assertTrue(item.getRestrictions().isEmpty());
           assertEquals(ContainerType.Default, item.getContainerType());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testContainerNotUpgradeable067406() {
        String content = "{\"item_id\":\"67406\",\"name\":\"Candy Corn Gobbler Pack\",\"description\":\"Click on this item to receive 15 candy corn and the Candy Corn Gobbler.\",\"type\":\"Container\",\"level\":\"0\",\"rarity\":\"Masterwork\",\"vendor_value\":\"0\",\"icon_file_id\":\"888387\",\"icon_file_signature\":\"28D1A092B51F78CD17301E08D6915957475D06D0\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"PvpLobby\"],\"flags\":[\"AccountBound\",\n\"NoMysticForge\",\n\"NoSell\",\n\"NotUpgradeable\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"container\":{\"type\":\"Default\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ContainerJson);
            IContainer item = (IContainer) itemJson.getEntity();
            assertEquals(Integer.valueOf(67406),  item.getId());
            assertTrue(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertTrue(item.getAvailableInPvPLobby());
            assertFalse(item.getAvailableInWvW());
            assertEquals("Click on this item to receive 15 candy corn and the Candy Corn Gobbler.", item.getDescription());
            assertEquals("Candy Corn Gobbler Pack", item.getName());
            assertEquals(Integer.valueOf(0),  item.getLevel());
            assertEquals(Integer.valueOf(0),  item.getVendorValue());
            assertEquals(Rarity.Masterwork, item.getRarity());
            assertEquals(5,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.NotUpgradeable, ItemFlags.AccountBindOnUse, ItemFlags.NoSell, ItemFlags.AccountBound, ItemFlags.NoMysticForge})));
            assertTrue(item.getRestrictions().isEmpty());
           assertEquals(ContainerType.Default, item.getContainerType());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testContainerNoUnderwater066895() {
        String content = "{\"item_id\":\"66895\",\"name\":\"Unopened Crystal Shard Kite\",\"description\":\"Double-click to take out your kite. This kite provides a 5% speed increase, 33% during sandstorms.\",\"type\":\"Container\",\"level\":\"0\",\"rarity\":\"Masterwork\",\"vendor_value\":\"0\",\"icon_file_id\":\"849426\",\"icon_file_signature\":\"10D455B90E0798977B23CF4A0699DE9F7FA7E41D\",\"game_types\":[\"Dungeon\",\n\"Pve\",\n\"PvpLobby\"],\"flags\":[\"NoMysticForge\",\n\"NoSell\",\n\"NoUnderwater\"],\"restrictions\":[],\"container\":{\"type\":\"Default\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ContainerJson);
            IContainer item = (IContainer) itemJson.getEntity();
            assertEquals(Integer.valueOf(66895),  item.getId());
            assertFalse(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertTrue(item.getAvailableInPvPLobby());
            assertFalse(item.getAvailableInWvW());
            assertEquals("Double-click to take out your kite. This kite provides a 5% speed increase, 33% during sandstorms.", item.getDescription());
            assertEquals("Unopened Crystal Shard Kite", item.getName());
            assertEquals(Integer.valueOf(0),  item.getLevel());
            assertEquals(Integer.valueOf(0),  item.getVendorValue());
            assertEquals(Rarity.Masterwork, item.getRarity());
            assertEquals(3,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.NoSell, ItemFlags.NoUnderwater, ItemFlags.NoMysticForge})));
            assertTrue(item.getRestrictions().isEmpty());
           assertEquals(ContainerType.Default, item.getContainerType());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testContainerOpenUI020313() {
        String content = "{\"item_id\":\"20313\",\"name\":\"Black Lion Chest (Unlocked)\",\"description\":\"Contains a random booster plus two more random items from the Black Lion Trading Company warehouse.\nThese may include weapon tickets redeemable for unique skins and other rare items not available anywhere else.\",\"type\":\"Container\",\"level\":\"0\",\"rarity\":\"Fine\",\"vendor_value\":\"0\",\"icon_file_id\":\"711974\",\"icon_file_signature\":\"48E4CEEAEEF8F3419A63D4F6295AB77136B86656\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"PvpLobby\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"NoSell\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"container\":{\"type\":\"OpenUI\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ContainerJson);
            IContainer item = (IContainer) itemJson.getEntity();
            assertEquals(Integer.valueOf(20313),  item.getId());
            assertTrue(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertTrue(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertEquals("Contains a random booster plus two more random items from the Black Lion Trading Company warehouse.\nThese may include weapon tickets redeemable for unique skins and other rare items not available anywhere else.", item.getDescription());
            assertEquals("Black Lion Chest (Unlocked)", item.getName());
            assertEquals(Integer.valueOf(0),  item.getLevel());
            assertEquals(Integer.valueOf(0),  item.getVendorValue());
            assertEquals(Rarity.Fine, item.getRarity());
            assertEquals(3,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.AccountBindOnUse, ItemFlags.NoSell, ItemFlags.AccountBound})));
            assertTrue(item.getRestrictions().isEmpty());
           assertEquals(ContainerType.OpenUI, item.getContainerType());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testContainerRangerRestriction054813() {
        String content = "{\"item_id\":\"54813\",\"name\":\"Francisca\",\"description\":\"A mysteriously light and well-balanced weapon that seems malleable to your wishes. Double-click to choose what form it should take.\",\"type\":\"Container\",\"level\":\"0\",\"rarity\":\"Masterwork\",\"vendor_value\":\"0\",\"icon_file_id\":\"534278\",\"icon_file_signature\":\"1B9503F466E464B34620340FEC65CFE7BBC69231\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"NoSell\",\n\"AccountBindOnUse\"],\"restrictions\":[\"Ranger\"],\"container\":{\"type\":\"Default\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ContainerJson);
            IContainer item = (IContainer) itemJson.getEntity();
            assertEquals(Integer.valueOf(54813),  item.getId());
            assertTrue(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertFalse(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertEquals("A mysteriously light and well-balanced weapon that seems malleable to your wishes. Double-click to choose what form it should take.", item.getDescription());
            assertEquals("Francisca", item.getName());
            assertEquals(Integer.valueOf(0),  item.getLevel());
            assertEquals(Integer.valueOf(0),  item.getVendorValue());
            assertEquals(Rarity.Masterwork, item.getRarity());
            assertEquals(3,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.AccountBindOnUse, ItemFlags.NoSell, ItemFlags.AccountBound})));
            assertEquals(1,  item.getRestrictions().size());
            assertTrue(item.getRestrictions().containsAll(Arrays.asList(new RestrictionType[] {RestrictionType.Ranger})));
           assertEquals(ContainerType.Default, item.getContainerType());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testContainerHideSuffix036366() {
        String content = "{\"item_id\":\"36366\",\"name\":\"Mad King's Outfit\",\"description\":\"Contains a Mad King Outfit, which is usable in combat, and a Scepter of Thorn toy for costume brawl.\n\nOutfits are full sets of clothing that hide other armor. This will not change individual armor pieces, and you will still receive your current armor stats.\",\"type\":\"Container\",\"level\":\"0\",\"rarity\":\"Rare\",\"vendor_value\":\"0\",\"icon_file_id\":\"499488\",\"icon_file_signature\":\"041DC1695CF0DD1A4438D45ACB036C510E1AFFB4\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"PvpLobby\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"HideSuffix\",\n\"NoMysticForge\",\n\"NoSell\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"container\":{\"type\":\"Default\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof ContainerJson);
            IContainer item = (IContainer) itemJson.getEntity();
            assertEquals(Integer.valueOf(36366),  item.getId());
            assertTrue(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertTrue(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertEquals("Contains a Mad King Outfit, which is usable in combat, and a Scepter of Thorn toy for costume brawl.\n\nOutfits are full sets of clothing that hide other armor. This will not change individual armor pieces, and you will still receive your current armor stats.", item.getDescription());
            assertEquals("Mad King's Outfit", item.getName());
            assertEquals(Integer.valueOf(0),  item.getLevel());
            assertEquals(Integer.valueOf(0),  item.getVendorValue());
            assertEquals(Rarity.Rare, item.getRarity());
            assertEquals(5,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.HideSuffix, ItemFlags.AccountBindOnUse, ItemFlags.NoSell, ItemFlags.AccountBound, ItemFlags.NoMysticForge})));
            assertTrue(item.getRestrictions().isEmpty());
           assertEquals(ContainerType.Default, item.getContainerType());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}
