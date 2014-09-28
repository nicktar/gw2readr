package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0003 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem8980() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Pillaging Scale Armor\",\"description\":\"Double-click to unpack a full set of level 35 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":66,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":8980,\"icon\":\"https://render.guildwars2.com/file/18AB9C1B05A82D5EF6CA4B16E2F7D4309BE705CF/63203.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8981() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Strong Scale Armor\",\"description\":\"Double-click to unpack a full set of level 35 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":66,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8981,\"icon\":\"https://render.guildwars2.com/file/18AB9C1B05A82D5EF6CA4B16E2F7D4309BE705CF/63203.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8982() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Vigorous Scale Armor\",\"description\":\"Double-click to unpack a full set of level 35 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":66,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8982,\"icon\":\"https://render.guildwars2.com/file/18AB9C1B05A82D5EF6CA4B16E2F7D4309BE705CF/63203.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8983() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Hearty Scale Armor\",\"description\":\"Double-click to unpack a full set of level 35 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":66,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8983,\"icon\":\"https://render.guildwars2.com/file/18AB9C1B05A82D5EF6CA4B16E2F7D4309BE705CF/63203.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8984() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Ravaging Gladiator Armor\",\"description\":\"Double-click to unpack a full set of level 35 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":99,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8984,\"icon\":\"https://render.guildwars2.com/file/18AB9C1B05A82D5EF6CA4B16E2F7D4309BE705CF/63203.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8985() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Rejuvenating Gladiator Armor\",\"description\":\"Double-click to unpack a full set of level 35 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":99,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8985,\"icon\":\"https://render.guildwars2.com/file/18AB9C1B05A82D5EF6CA4B16E2F7D4309BE705CF/63203.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8986() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Honed Gladiator Armor\",\"description\":\"Double-click to unpack a full set of level 35 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":99,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8986,\"icon\":\"https://render.guildwars2.com/file/18AB9C1B05A82D5EF6CA4B16E2F7D4309BE705CF/63203.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8987() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Pillaging Gladiator Armor\",\"description\":\"Double-click to unpack a full set of level 35 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":99,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":8987,\"icon\":\"https://render.guildwars2.com/file/18AB9C1B05A82D5EF6CA4B16E2F7D4309BE705CF/63203.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8988() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Strong Gladiator Armor\",\"description\":\"Double-click to unpack a full set of level 35 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":99,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8988,\"icon\":\"https://render.guildwars2.com/file/18AB9C1B05A82D5EF6CA4B16E2F7D4309BE705CF/63203.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8989() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Vigorous Gladiator Armor\",\"description\":\"Double-click to unpack a full set of level 35 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":99,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8989,\"icon\":\"https://render.guildwars2.com/file/18AB9C1B05A82D5EF6CA4B16E2F7D4309BE705CF/63203.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8990() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Hearty Gladiator Armor\",\"description\":\"Double-click to unpack a full set of level 35 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":99,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8990,\"icon\":\"https://render.guildwars2.com/file/18AB9C1B05A82D5EF6CA4B16E2F7D4309BE705CF/63203.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8991() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Ravaging Splint Armor\",\"description\":\"Double-click to unpack a full set of level 40 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":36,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8991,\"icon\":\"https://render.guildwars2.com/file/72D04673660ECB7FD904680D487030A41106F952/63218.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8992() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Pillaging Splint Armor\",\"description\":\"Double-click to unpack a full set of level 40 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":36,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":8992,\"icon\":\"https://render.guildwars2.com/file/72D04673660ECB7FD904680D487030A41106F952/63218.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8993() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Vigorous Splint Armor\",\"description\":\"Double-click to unpack a full set of level 40 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":36,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8993,\"icon\":\"https://render.guildwars2.com/file/72D04673660ECB7FD904680D487030A41106F952/63218.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8994() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Rejuvenating Splint Armor\",\"description\":\"Double-click to unpack a full set of level 45 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":40,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8994,\"icon\":\"https://render.guildwars2.com/file/72D04673660ECB7FD904680D487030A41106F952/63218.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8995() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Honed Splint Armor\",\"description\":\"Double-click to unpack a full set of level 45 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":40,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8995,\"icon\":\"https://render.guildwars2.com/file/72D04673660ECB7FD904680D487030A41106F952/63218.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8996() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Strong Splint Armor\",\"description\":\"Double-click to unpack a full set of level 45 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":40,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8996,\"icon\":\"https://render.guildwars2.com/file/72D04673660ECB7FD904680D487030A41106F952/63218.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8997() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Hearty Splint Armor\",\"description\":\"Double-click to unpack a full set of level 45 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":40,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8997,\"icon\":\"https://render.guildwars2.com/file/72D04673660ECB7FD904680D487030A41106F952/63218.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8998() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Ravaging Splint Armor\",\"description\":\"Double-click to unpack a full set of level 50 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":86,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8998,\"icon\":\"https://render.guildwars2.com/file/72D04673660ECB7FD904680D487030A41106F952/63218.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8999() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Rejuvenating Splint Armor\",\"description\":\"Double-click to unpack a full set of level 50 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":86,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8999,\"icon\":\"https://render.guildwars2.com/file/72D04673660ECB7FD904680D487030A41106F952/63218.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9000() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Honed Splint Armor\",\"description\":\"Double-click to unpack a full set of level 50 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":86,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9000,\"icon\":\"https://render.guildwars2.com/file/72D04673660ECB7FD904680D487030A41106F952/63218.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9001() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Pillaging Splint Armor\",\"description\":\"Double-click to unpack a full set of level 50 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":86,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":9001,\"icon\":\"https://render.guildwars2.com/file/72D04673660ECB7FD904680D487030A41106F952/63218.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9002() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Strong Splint Armor\",\"description\":\"Double-click to unpack a full set of level 50 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":86,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9002,\"icon\":\"https://render.guildwars2.com/file/72D04673660ECB7FD904680D487030A41106F952/63218.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9003() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Vigorous Splint Armor\",\"description\":\"Double-click to unpack a full set of level 50 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":86,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9003,\"icon\":\"https://render.guildwars2.com/file/72D04673660ECB7FD904680D487030A41106F952/63218.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9004() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Hearty Splint Armor\",\"description\":\"Double-click to unpack a full set of level 50 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":86,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9004,\"icon\":\"https://render.guildwars2.com/file/72D04673660ECB7FD904680D487030A41106F952/63218.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}