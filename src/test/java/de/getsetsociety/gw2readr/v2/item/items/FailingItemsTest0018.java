package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0018 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem9370() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Moldy Sack\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9370,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9371() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Medium Moldy Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":25,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9371,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9372() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Large Moldy Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":29,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9372,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9373() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Heavy Moldy Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9373,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9374() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tiny Treat Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9374,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9375() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Small Treat Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9375,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9376() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Light Treat Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":15,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9376,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9377() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Treat Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":18,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9377,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9378() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Treat Sack\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9378,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9379() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Medium Treat Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":25,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9379,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9380() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Large Treat Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":29,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9380,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9381() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Heavy Treat Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9381,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9404() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"8 Slot Rawhide Leather Pack\",\"description\":\"8 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9404,\"icon\":\"https://render.guildwars2.com/file/D1A0BD64ADC6761ABDFB6D08DE53BCC770BC44EB/222428.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":8}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9406() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"8 Slot Jute Bag\",\"description\":\"8 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9406,\"icon\":\"https://render.guildwars2.com/file/10ACE47195709F69F366026507FEB0080DF39BE7/63194.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":8}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9409() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"10 Slot Wool Bag\",\"description\":\"10 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":17,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9409,\"icon\":\"https://render.guildwars2.com/file/F92967D9142C0B93C3259C560161784CE20D2200/63195.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":10}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9411() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"12 Slot Cotton Bag\",\"description\":\"12 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9411,\"icon\":\"https://render.guildwars2.com/file/0CD55FE36D39E30AA94A96030D73EF22250E0E26/63172.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":12}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9413() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"15 Slot Linen Bag\",\"description\":\"15 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":27,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9413,\"icon\":\"https://render.guildwars2.com/file/2ACFBCB5D84C10767276BB1457D9A302171CC9CE/219355.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":15}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9414() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"10 Slot Thin Leather Pack\",\"description\":\"10 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":17,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9414,\"icon\":\"https://render.guildwars2.com/file/6972229DA0C0DC4A05A9194D1547D9EBDCCDE6AD/63196.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":10}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9416() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"12 Slot Coarse Leather Pack\",\"description\":\"12 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9416,\"icon\":\"https://render.guildwars2.com/file/E55D431078720616B9EC406F18C601F4116C0256/63193.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":12}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9418() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"15 Slot Rugged Leather Pack\",\"description\":\"15 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":27,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9418,\"icon\":\"https://render.guildwars2.com/file/5F73EBBD0F91ECA4B4A01C0E5EE47E5FA027932D/222430.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":15}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9420() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"8 Slot Reinforced Bronze Box\",\"description\":\"8 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9420,\"icon\":\"https://render.guildwars2.com/file/65FA6FEBAC2BE9DAD14D059B5703F441AD5B5C56/222422.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":8}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9421() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"10 Slot Iron Box\",\"description\":\"10 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":17,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9421,\"icon\":\"https://render.guildwars2.com/file/6BD9FB640594DE2B021F974E01332DA6F130AF0F/63197.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":10}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9422() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"12 Slot Steel Box\",\"description\":\"12 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9422,\"icon\":\"https://render.guildwars2.com/file/0BE75380EF0205DBDFD35F9FB8B10F2E56D6ADEB/222424.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":12}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9423() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"15 Slot Darksteel Box\",\"description\":\"15 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":27,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9423,\"icon\":\"https://render.guildwars2.com/file/C9640303BA980204A755F45803A59B5F1CBB0BFD/222420.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":15}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9426() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"8 Slot Invisible Pack\",\"description\":\"8 Slots. Items in this pack will never appear in a sell-to-vendor list and will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9426,\"icon\":\"https://render.guildwars2.com/file/5343000BA6C216ECACDBCFB51A62503CD9C9B76D/63200.png\",\"details\":{\"no_sell_or_sort\":true,\"size\":8}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}