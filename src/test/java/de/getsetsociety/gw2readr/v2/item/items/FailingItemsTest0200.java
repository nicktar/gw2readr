package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0200 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem45184() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mathilde's Weapon Chest\",\"description\":\"Double-click to choose an ascended weapon with Dire stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45184,\"icon\":\"https://render.guildwars2.com/file/922DD2A8365A48C36812EA0D94CEDFD7F50F3908/631156.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45185() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Theodosus's Weapon Chest\",\"description\":\"Double-click to choose an ascended weapon with Cleric stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45185,\"icon\":\"https://render.guildwars2.com/file/5E032A630EDA99C24B1713FFFE9BD6222D5F6CD4/631157.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45186() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hronk's Weapon Chest\",\"description\":\"Double-click to choose an ascended weapon with Magi stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45186,\"icon\":\"https://render.guildwars2.com/file/DE075DCD059DD31F1011BAE5A0C63D0302CBC10C/631158.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45187() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ebonmane's Weapon Chest\",\"description\":\"Double-click to choose an ascended weapon with Apothecary stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45187,\"icon\":\"https://render.guildwars2.com/file/41805700F65A4A249D2352D35D0336BA40E5F909/631159.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45188() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Stonecleaver's Weapon Chest\",\"description\":\"Double-click to choose an ascended weapon with Valkyrie stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45188,\"icon\":\"https://render.guildwars2.com/file/F9F35E94C10F1809906275299408477F2B09C906/631160.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45189() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Zojja's Weapon Chest\",\"description\":\"Double-click to choose an ascended weapon with Berserker stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45189,\"icon\":\"https://render.guildwars2.com/file/54C42771DFFCDC579D050BD51C1D3DA800120623/631161.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45190() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chorben's Weapon Chest\",\"description\":\"Double-click to choose an ascended weapon with Soldier stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45190,\"icon\":\"https://render.guildwars2.com/file/11541098AA6030E4FB0797B3FEFDA0ED090CE3F5/631162.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45191() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coalforge's Weapon Chest\",\"description\":\"Double-click to choose an ascended weapon with Rampager stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45191,\"icon\":\"https://render.guildwars2.com/file/D1ADE9C9CD4D013B06E901412B24C35DFF25EE02/631163.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45192() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Soros's Weapon Chest\",\"description\":\"Double-click to choose an ascended weapon with Assassin stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45192,\"icon\":\"https://render.guildwars2.com/file/610FAD0507DCCB6845025303673D78F8B8C461CD/631164.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45193() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Leftpaw's Weapon Chest\",\"description\":\"Double-click to choose an ascended weapon with Settler stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45193,\"icon\":\"https://render.guildwars2.com/file/48071CFCFEC1E9FD079C78B6D30198B657B4073F/631165.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45194() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Angchu Weapon Chest\",\"description\":\"Double-click to choose an ascended weapon with Cavalier stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45194,\"icon\":\"https://render.guildwars2.com/file/0F0E9BF9DFAAED023029DA4EC9B81FE0EE140613/631166.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45195() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Beigarth's Weapon Chest\",\"description\":\"Double-click to choose an ascended weapon with Knight stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45195,\"icon\":\"https://render.guildwars2.com/file/B3D1BCA875590CB29E980E4DE5CBAF649CE1E592/631167.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45196() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Zintl Weapon Chest\",\"description\":\"Double-click to choose an ascended weapon with Shaman stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45196,\"icon\":\"https://render.guildwars2.com/file/A10BAD75B4F075F7B75B1A7BF6E10F0EFA1F2621/631168.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45197() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tonn's Weapon Chest\",\"description\":\"Double-click to choose an ascended weapon with Sentinel stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45197,\"icon\":\"https://render.guildwars2.com/file/FC500935FF4ADB22A0E3B7C62218E9EE4516004E/631169.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45198() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Recipe: Ascended Inscription\",\"description\":\"Double-click and choose which Ascended Inscription recipe to receive.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45198,\"icon\":\"https://render.guildwars2.com/file/162616E65F5D247791C12B0BA27442536637E1D8/631170.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45199() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Recipe: Ascended Axe\",\"description\":\"Double-click and choose which Ascended Axe recipe to receive.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45199,\"icon\":\"https://render.guildwars2.com/file/162616E65F5D247791C12B0BA27442536637E1D8/631170.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45200() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Recipe: Ascended Dagger\",\"description\":\"Double-click and choose which Ascended Dagger recipe to receive.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45200,\"icon\":\"https://render.guildwars2.com/file/162616E65F5D247791C12B0BA27442536637E1D8/631170.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45201() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Recipe: Ascended Focus\",\"description\":\"Double-click and choose which Ascended Focus recipe to receive.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45201,\"icon\":\"https://render.guildwars2.com/file/162616E65F5D247791C12B0BA27442536637E1D8/631170.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45202() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Recipe: Ascended Greatsword\",\"description\":\"Double-click and choose which Ascended Greatsword recipe to receive.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45202,\"icon\":\"https://render.guildwars2.com/file/162616E65F5D247791C12B0BA27442536637E1D8/631170.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45203() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Recipe: Ascended Hammer\",\"description\":\"Double-click and choose which Ascended Hammer recipe to receive.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45203,\"icon\":\"https://render.guildwars2.com/file/162616E65F5D247791C12B0BA27442536637E1D8/631170.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45204() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Recipe: Ascended Spear\",\"description\":\"Double-click and choose which Ascended Spear recipe to receive.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45204,\"icon\":\"https://render.guildwars2.com/file/162616E65F5D247791C12B0BA27442536637E1D8/631170.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45205() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Recipe: Ascended Longbow\",\"description\":\"Double-click and choose which Ascended Longbow recipe to receive.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45205,\"icon\":\"https://render.guildwars2.com/file/162616E65F5D247791C12B0BA27442536637E1D8/631170.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45206() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Recipe: Ascended Mace\",\"description\":\"Double-click and choose which Ascended Mace recipe to receive.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45206,\"icon\":\"https://render.guildwars2.com/file/162616E65F5D247791C12B0BA27442536637E1D8/631170.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45207() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Recipe: Ascended Pistol\",\"description\":\"Double-click and choose which Ascended Pistol recipe to receive.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45207,\"icon\":\"https://render.guildwars2.com/file/162616E65F5D247791C12B0BA27442536637E1D8/631170.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45208() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Recipe: Ascended Rifle\",\"description\":\"Double-click and choose which Ascended Rifle recipe to receive.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45208,\"icon\":\"https://render.guildwars2.com/file/162616E65F5D247791C12B0BA27442536637E1D8/631170.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}