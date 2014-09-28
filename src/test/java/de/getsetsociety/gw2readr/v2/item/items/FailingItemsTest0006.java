package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0006 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem9057() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Berserker's Draconic Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9057,\"icon\":\"https://render.guildwars2.com/file/726C070116A6D2DE16E07F4E56001240D70BD097/63223.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9058() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Valkyrie Draconic Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9058,\"icon\":\"https://render.guildwars2.com/file/726C070116A6D2DE16E07F4E56001240D70BD097/63223.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9059() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Rampager's Draconic Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9059,\"icon\":\"https://render.guildwars2.com/file/726C070116A6D2DE16E07F4E56001240D70BD097/63223.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9060() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Knight's Draconic Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9060,\"icon\":\"https://render.guildwars2.com/file/726C070116A6D2DE16E07F4E56001240D70BD097/63223.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9061() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Mighty Seeker Armor\",\"description\":\"Double-click to unpack a full set of level 5 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9061,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9062() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Malign Seeker Armor\",\"description\":\"Double-click to unpack a full set of level 10 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9062,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9063() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Mighty Seeker Armor\",\"description\":\"Double-click to unpack a full set of level 10 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9063,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9064() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Vital Seeker Armor\",\"description\":\"Double-click to unpack a full set of level 10 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9064,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9065() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Healing Seeker Armor\",\"description\":\"Double-click to unpack a full set of level 15 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9065,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9066() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Precise Seeker Armor\",\"description\":\"Double-click to unpack a full set of level 15 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9066,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9067() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Resilient Seeker Armor\",\"description\":\"Double-click to unpack a full set of level 15 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9067,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9068() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Malign Seeker Armor\",\"description\":\"Double-click to unpack a full set of level 20 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9068,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9069() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Healing Seeker Armor\",\"description\":\"Double-click to unpack a full set of level 20 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9069,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9070() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Mighty Seeker Armor\",\"description\":\"Double-click to unpack a full set of level 20 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9070,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9071() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Precise Seeker Armor\",\"description\":\"Double-click to unpack a full set of level 20 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9071,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9072() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Resilient Seeker Armor\",\"description\":\"Double-click to unpack a full set of level 20 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9072,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9073() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Vital Seeker Armor\",\"description\":\"Double-click to unpack a full set of level 20 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9073,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9074() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Ravaging Outlaw Armor\",\"description\":\"Double-click to unpack a full set of level 25 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9074,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9075() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Pillaging Outlaw Armor\",\"description\":\"Double-click to unpack a full set of level 25 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":9075,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9076() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Vigorous Outlaw Armor\",\"description\":\"Double-click to unpack a full set of level 25 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9076,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9077() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Honed Outlaw Armor\",\"description\":\"Double-click to unpack a full set of level 30 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9077,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9078() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Strong Outlaw Armor\",\"description\":\"Double-click to unpack a full set of level 30 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9078,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9079() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Hearty Outlaw Armor\",\"description\":\"Double-click to unpack a full set of level 30 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9079,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9080() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Ravaging Outlaw Armor\",\"description\":\"Double-click to unpack a full set of level 35 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9080,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9081() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Ravaging Noble Armor\",\"description\":\"Double-click to unpack a full set of level 35 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9081,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}