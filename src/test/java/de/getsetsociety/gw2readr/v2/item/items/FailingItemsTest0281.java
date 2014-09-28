package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0281 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem64250() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Kodan Icehammer\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":64250,\"icon\":\"https://render.guildwars2.com/file/02E070F40BB8A1E80157C0CD7AEBA7FEB993086C/771054.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64254() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lion's Arch Survivors Dye Kit\",\"description\":\"Double-click to gain one of 25 random colors commemorating Lion's Arch of old. Includes six exclusive colors.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64254,\"icon\":\"https://render.guildwars2.com/file/6CF8E4B708732FE2E9B2259DFCD299E3924DD7C9/771057.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64257() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Small Rank-Up Chest\",\"description\":\"Double-click to receive your rewards.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64257,\"icon\":\"https://render.guildwars2.com/file/C656F47F310D3CD59AFA17E1FA90F336CA050603/66888.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64258() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Medium Rank-Up Chest\",\"description\":\"Double-click to receive your rewards.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64258,\"icon\":\"https://render.guildwars2.com/file/C656F47F310D3CD59AFA17E1FA90F336CA050603/66888.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64259() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Large Rank-Up Chest\",\"description\":\"Double-click to receive your rewards.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64259,\"icon\":\"https://render.guildwars2.com/file/C656F47F310D3CD59AFA17E1FA90F336CA050603/66888.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64262() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Voided WvW Tournament Claim Ticket\",\"description\":\"Due to a processing error made at the Tyrian Bureau of Engraving and Printing, this ticket has been voided and may not be redeemed.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64262,\"icon\":\"https://render.guildwars2.com/file/EA7D806F457FAEB924E1A3A2056D18404D9CE8F1/819624.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64340() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"WvW Spring Tournament 2014 Reward Chest (Unlocked)\",\"description\":\"Contains rewards based on your world's performance in the previous WvW season.\nDouble-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64340,\"icon\":\"https://render.guildwars2.com/file/6BA91E0A08689B40B09ECC3FB3C4589493E6C167/603245.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64348() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"WvW Achievement Reward Chest\",\"description\":\"Contains essence of luck and badges of honor.\nDouble-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64348,\"icon\":\"https://render.guildwars2.com/file/0946149B43355E23B5C7552E6E5DDB4A9160603E/603242.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64349() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"WvW Spring Tournament 2014 Reward Chest (Unlocked)\",\"description\":\"Contains rewards based on your world's performance in the previous WvW season.\nDouble-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64349,\"icon\":\"https://render.guildwars2.com/file/6BA91E0A08689B40B09ECC3FB3C4589493E6C167/603245.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64350() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"WvW Spring Tournament 2014 Reward Chest (Unlocked)\",\"description\":\"Contains rewards based on your world's performance in the previous WvW season.\nDouble-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64350,\"icon\":\"https://render.guildwars2.com/file/6BA91E0A08689B40B09ECC3FB3C4589493E6C167/603245.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64351() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"WvW Spring Tournament 2014 Reward Chest (Unlocked)\",\"description\":\"Contains rewards based on your world's performance in the previous WvW season.\nDouble-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64351,\"icon\":\"https://render.guildwars2.com/file/6BA91E0A08689B40B09ECC3FB3C4589493E6C167/603245.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64352() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"WvW Spring Tournament 2014 Reward Chest (Unlocked)\",\"description\":\"Contains rewards based on your world's performance in the previous WvW season.\nDouble-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64352,\"icon\":\"https://render.guildwars2.com/file/6BA91E0A08689B40B09ECC3FB3C4589493E6C167/603245.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64353() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"WvW Spring Tournament 2014 Reward Chest (Unlocked)\",\"description\":\"Contains rewards based on your world's performance in the previous WvW season.\nDouble-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64353,\"icon\":\"https://render.guildwars2.com/file/6BA91E0A08689B40B09ECC3FB3C4589493E6C167/603245.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64354() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"WvW Achievement Reward Chest\",\"description\":\"Contains obsidian shards.\nDouble-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64354,\"icon\":\"https://render.guildwars2.com/file/0946149B43355E23B5C7552E6E5DDB4A9160603E/603242.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64355() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"WvW Spring Tournament 2014 Reward Chest (Unlocked)\",\"description\":\"Contains rewards based on your world's performance in the previous WvW season.\nDouble-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64355,\"icon\":\"https://render.guildwars2.com/file/6BA91E0A08689B40B09ECC3FB3C4589493E6C167/603245.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64356() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"WvW Spring Tournament 2014 Reward Chest (Unlocked)\",\"description\":\"Contains rewards based on your world's performance in the previous WvW season.\nDouble-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64356,\"icon\":\"https://render.guildwars2.com/file/6BA91E0A08689B40B09ECC3FB3C4589493E6C167/603245.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64357() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"WvW Spring Tournament 2014 Reward Chest (Unlocked)\",\"description\":\"Contains rewards based on your world's performance in the previous WvW season.\nDouble-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64357,\"icon\":\"https://render.guildwars2.com/file/6BA91E0A08689B40B09ECC3FB3C4589493E6C167/603245.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64359() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"WvW Achievement Reward Chest\",\"description\":\"Contains dragonite ore.\nDouble-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64359,\"icon\":\"https://render.guildwars2.com/file/0946149B43355E23B5C7552E6E5DDB4A9160603E/603242.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64360() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"WvW Achievement Reward Chest\",\"description\":\"Contains empyreal fragments.\nDouble-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64360,\"icon\":\"https://render.guildwars2.com/file/0946149B43355E23B5C7552E6E5DDB4A9160603E/603242.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64362() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"WvW Achievement Reward Chest\",\"description\":\"Contains scrolls of knowledge and liquid world experience.\nDouble-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64362,\"icon\":\"https://render.guildwars2.com/file/0946149B43355E23B5C7552E6E5DDB4A9160603E/603242.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64363() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"WvW Achievement Reward Chest\",\"description\":\"Contains random loot.\nDouble-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64363,\"icon\":\"https://render.guildwars2.com/file/0946149B43355E23B5C7552E6E5DDB4A9160603E/603242.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64529() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deluxe Gear Box\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64529,\"icon\":\"https://render.guildwars2.com/file/E1C5D2E7206D58DA48C80D08B20106B923FF0825/619510.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64530() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Heirloom Seed Pouch\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64530,\"icon\":\"https://render.guildwars2.com/file/74921BC51FFC732180CAD2019266B1F3A1E97999/619516.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64531() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embroidered Coin Purse\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64531,\"icon\":\"https://render.guildwars2.com/file/A36607CECB172039B022307E0E34BAB2EFDE51C6/619513.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64532() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gilded Strongbox\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64532,\"icon\":\"https://render.guildwars2.com/file/9E0BAFF636D296EF96FB9CF37F3CB425A92CC7F0/619517.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}