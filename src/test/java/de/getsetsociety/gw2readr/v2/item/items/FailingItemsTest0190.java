package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0190 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem44238() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elaborate Ritualist Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":29,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44238,\"icon\":\"https://render.guildwars2.com/file/E80EFBD73647770BC6FA0FA45EBE6016CE9799F5/619512.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44239() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elaborate Ritualist Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":86,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44239,\"icon\":\"https://render.guildwars2.com/file/E80EFBD73647770BC6FA0FA45EBE6016CE9799F5/619512.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44240() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elaborate Ritualist Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":162,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44240,\"icon\":\"https://render.guildwars2.com/file/E80EFBD73647770BC6FA0FA45EBE6016CE9799F5/619512.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44241() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elaborate Ritualist Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44241,\"icon\":\"https://render.guildwars2.com/file/E80EFBD73647770BC6FA0FA45EBE6016CE9799F5/619512.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44242() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elaborate Ritualist Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44242,\"icon\":\"https://render.guildwars2.com/file/E80EFBD73647770BC6FA0FA45EBE6016CE9799F5/619512.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44243() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elaborate Ritualist Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":29,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44243,\"icon\":\"https://render.guildwars2.com/file/E80EFBD73647770BC6FA0FA45EBE6016CE9799F5/619512.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44244() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elaborate Ritualist Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":86,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44244,\"icon\":\"https://render.guildwars2.com/file/E80EFBD73647770BC6FA0FA45EBE6016CE9799F5/619512.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44245() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elaborate Ritualist Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":162,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44245,\"icon\":\"https://render.guildwars2.com/file/E80EFBD73647770BC6FA0FA45EBE6016CE9799F5/619512.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44246() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elaborate Ritualist Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44246,\"icon\":\"https://render.guildwars2.com/file/E80EFBD73647770BC6FA0FA45EBE6016CE9799F5/619512.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44247() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embroidered Coin Purse\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44247,\"icon\":\"https://render.guildwars2.com/file/A36607CECB172039B022307E0E34BAB2EFDE51C6/619513.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44248() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embroidered Coin Purse\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":29,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44248,\"icon\":\"https://render.guildwars2.com/file/A36607CECB172039B022307E0E34BAB2EFDE51C6/619513.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44249() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embroidered Coin Purse\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":86,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44249,\"icon\":\"https://render.guildwars2.com/file/A36607CECB172039B022307E0E34BAB2EFDE51C6/619513.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44250() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embroidered Coin Purse\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":162,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44250,\"icon\":\"https://render.guildwars2.com/file/A36607CECB172039B022307E0E34BAB2EFDE51C6/619513.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44251() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embroidered Coin Purse\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44251,\"icon\":\"https://render.guildwars2.com/file/A36607CECB172039B022307E0E34BAB2EFDE51C6/619513.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44252() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embroidered Saddlebag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44252,\"icon\":\"https://render.guildwars2.com/file/2169C197D9400AC12D510A7605E975A703CACCDA/619514.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44253() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embroidered Saddlebag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":29,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44253,\"icon\":\"https://render.guildwars2.com/file/2169C197D9400AC12D510A7605E975A703CACCDA/619514.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44254() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embroidered Saddlebag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":86,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44254,\"icon\":\"https://render.guildwars2.com/file/2169C197D9400AC12D510A7605E975A703CACCDA/619514.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44255() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embroidered Saddlebag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":162,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44255,\"icon\":\"https://render.guildwars2.com/file/2169C197D9400AC12D510A7605E975A703CACCDA/619514.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44256() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embroidered Saddlebag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44256,\"icon\":\"https://render.guildwars2.com/file/2169C197D9400AC12D510A7605E975A703CACCDA/619514.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44257() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embroidered Saddlebag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44257,\"icon\":\"https://render.guildwars2.com/file/2169C197D9400AC12D510A7605E975A703CACCDA/619514.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44258() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embroidered Saddlebag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":29,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44258,\"icon\":\"https://render.guildwars2.com/file/2169C197D9400AC12D510A7605E975A703CACCDA/619514.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44259() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embroidered Saddlebag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":86,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44259,\"icon\":\"https://render.guildwars2.com/file/2169C197D9400AC12D510A7605E975A703CACCDA/619514.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44260() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embroidered Saddlebag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":162,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44260,\"icon\":\"https://render.guildwars2.com/file/2169C197D9400AC12D510A7605E975A703CACCDA/619514.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44261() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embroidered Saddlebag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44261,\"icon\":\"https://render.guildwars2.com/file/2169C197D9400AC12D510A7605E975A703CACCDA/619514.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44262() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embroidered Belt Pouch\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44262,\"icon\":\"https://render.guildwars2.com/file/CE00984963764D6CBD17A0E4333A56E85E0B1427/619520.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}