package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0015 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem9295() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Small Miner's Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9295,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9296() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Light Miner's Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":15,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9296,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9297() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Miner's Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":18,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9297,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9298() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Miner's Sack\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9298,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9299() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Medium Miner's Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":25,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9299,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9300() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Large Miner's Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":29,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9300,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9301() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Heavy Miner's Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9301,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9302() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tiny Stolen Supplies Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9302,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9303() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Small Stolen Supplies Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9303,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9304() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Light Stolen Supplies Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":15,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9304,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9305() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Stolen Supplies Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":18,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9305,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9306() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Stolen Supplies Sack\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9306,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9307() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Medium Stolen Supplies Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":25,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9307,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9308() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Large Stolen Supplies Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":29,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9308,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9309() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Heavy Stolen Supplies Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9309,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9310() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tiny Bag of Trinkets\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9310,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9311() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Small Bag of Trinkets\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9311,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9312() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Light Bag of Trinkets\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":15,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9312,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9313() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Trinkets\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":18,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9313,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9314() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sack of Trinkets\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9314,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9315() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Medium Bag of Trinkets\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":25,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9315,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9316() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Large Bag of Trinkets\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":29,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9316,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9317() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Heavy Bag of Trinkets\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9317,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9318() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tiny Bag of Supplies\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9318,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9319() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Small Bag of Supplies\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9319,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}