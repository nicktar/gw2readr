package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0014 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem9270() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tiny Ritual Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9270,\"icon\":\"https://render.guildwars2.com/file/FAB5B9475F04A7D6AE63A2A6059C9D025E06EA1D/62078.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9271() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Small Ritual Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9271,\"icon\":\"https://render.guildwars2.com/file/FAB5B9475F04A7D6AE63A2A6059C9D025E06EA1D/62078.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9272() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Light Ritual Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":15,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9272,\"icon\":\"https://render.guildwars2.com/file/FAB5B9475F04A7D6AE63A2A6059C9D025E06EA1D/62078.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9273() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ritual Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":18,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9273,\"icon\":\"https://render.guildwars2.com/file/FAB5B9475F04A7D6AE63A2A6059C9D025E06EA1D/62078.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9274() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ritual Sack\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9274,\"icon\":\"https://render.guildwars2.com/file/FAB5B9475F04A7D6AE63A2A6059C9D025E06EA1D/62078.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9275() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Medium Ritual Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":25,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9275,\"icon\":\"https://render.guildwars2.com/file/FAB5B9475F04A7D6AE63A2A6059C9D025E06EA1D/62078.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9276() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Large Ritual Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":29,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9276,\"icon\":\"https://render.guildwars2.com/file/FAB5B9475F04A7D6AE63A2A6059C9D025E06EA1D/62078.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9277() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Heavy Ritual Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9277,\"icon\":\"https://render.guildwars2.com/file/FAB5B9475F04A7D6AE63A2A6059C9D025E06EA1D/62078.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9278() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tiny Supply Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9278,\"icon\":\"https://render.guildwars2.com/file/42AAC1FDE6FB5F753D08B203EB7843163C76BAD2/63183.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9279() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Small Supply Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9279,\"icon\":\"https://render.guildwars2.com/file/42AAC1FDE6FB5F753D08B203EB7843163C76BAD2/63183.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9280() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Light Supply Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":15,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9280,\"icon\":\"https://render.guildwars2.com/file/42AAC1FDE6FB5F753D08B203EB7843163C76BAD2/63183.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9281() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Supply Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":18,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9281,\"icon\":\"https://render.guildwars2.com/file/42AAC1FDE6FB5F753D08B203EB7843163C76BAD2/63183.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9282() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Supply Sack\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9282,\"icon\":\"https://render.guildwars2.com/file/42AAC1FDE6FB5F753D08B203EB7843163C76BAD2/63183.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9283() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Medium Supply Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":25,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9283,\"icon\":\"https://render.guildwars2.com/file/42AAC1FDE6FB5F753D08B203EB7843163C76BAD2/63183.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9284() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Large Supply Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":29,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9284,\"icon\":\"https://render.guildwars2.com/file/42AAC1FDE6FB5F753D08B203EB7843163C76BAD2/63183.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9285() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Heavy Supply Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9285,\"icon\":\"https://render.guildwars2.com/file/42AAC1FDE6FB5F753D08B203EB7843163C76BAD2/63183.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9286() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Pinched Goods\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9286,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9287() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Filched Goods\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9287,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9288() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Pilfered Goods\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":15,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9288,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9289() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Purloined Goods\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":18,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9289,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9290() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Snatched Goods\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9290,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9291() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Swiped Goods\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":25,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9291,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9292() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Lifted Goods\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":29,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9292,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9293() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Stolen Goods\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9293,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9294() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tiny Miner's Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9294,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}