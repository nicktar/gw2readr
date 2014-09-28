package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0002 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem8955() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Yellow Leather Bag\",\"description\":\"5 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8955,\"icon\":\"https://render.guildwars2.com/file/CBB030E8B6D4F24D1292D2BAE37F2549CAFB0717/63181.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":5}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8956() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"12 Slot Bag\",\"description\":\"12 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":8956,\"icon\":\"https://render.guildwars2.com/file/0CD55FE36D39E30AA94A96030D73EF22250E0E26/63172.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":12}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8957() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Simple Mighty Chain Armor\",\"description\":\"Double-click to unpack a full set of level 5 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":8,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8957,\"icon\":\"https://render.guildwars2.com/file/A556C608FA19D4BF435608EC5A7607561C9F7C02/63185.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8958() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Malign Chain Armor\",\"description\":\"Double-click to unpack a full set of level 10 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":13,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8958,\"icon\":\"https://render.guildwars2.com/file/A556C608FA19D4BF435608EC5A7607561C9F7C02/63185.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8959() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Resilient Chain Armor\",\"description\":\"Double-click to unpack a full set of level 15 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":18,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8959,\"icon\":\"https://render.guildwars2.com/file/A556C608FA19D4BF435608EC5A7607561C9F7C02/63185.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8960() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Mighty Chain Armor\",\"description\":\"Double-click to unpack a full set of level 10 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":13,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8960,\"icon\":\"https://render.guildwars2.com/file/A556C608FA19D4BF435608EC5A7607561C9F7C02/63185.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8961() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Vital Chain Armor\",\"description\":\"Double-click to unpack a full set of level 10 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":13,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8961,\"icon\":\"https://render.guildwars2.com/file/A556C608FA19D4BF435608EC5A7607561C9F7C02/63185.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8962() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Healing Chain Armor\",\"description\":\"Double-click to unpack a full set of level 15 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":18,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8962,\"icon\":\"https://render.guildwars2.com/file/A556C608FA19D4BF435608EC5A7607561C9F7C02/63185.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8963() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Precise Chain Armor\",\"description\":\"Double-click to unpack a full set of level 15 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":18,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8963,\"icon\":\"https://render.guildwars2.com/file/A556C608FA19D4BF435608EC5A7607561C9F7C02/63185.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8964() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Malign Chain Armor\",\"description\":\"Double-click to unpack a full set of level 20 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":44,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8964,\"icon\":\"https://render.guildwars2.com/file/A556C608FA19D4BF435608EC5A7607561C9F7C02/63185.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8965() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Healing Chain Armor\",\"description\":\"Double-click to unpack a full set of level 20 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":44,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8965,\"icon\":\"https://render.guildwars2.com/file/A556C608FA19D4BF435608EC5A7607561C9F7C02/63185.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8966() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Mighty Chain Armor\",\"description\":\"Double-click to unpack a full set of level 20 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":44,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8966,\"icon\":\"https://render.guildwars2.com/file/A556C608FA19D4BF435608EC5A7607561C9F7C02/63185.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8967() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Precise Chain Armor\",\"description\":\"Double-click to unpack a full set of level 20 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":44,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8967,\"icon\":\"https://render.guildwars2.com/file/A556C608FA19D4BF435608EC5A7607561C9F7C02/63185.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8968() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Resilient Chain Armor\",\"description\":\"Double-click to unpack a full set of level 20 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":44,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8968,\"icon\":\"https://render.guildwars2.com/file/A556C608FA19D4BF435608EC5A7607561C9F7C02/63185.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8969() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Vital Chain Armor\",\"description\":\"Double-click to unpack a full set of level 20 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":44,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8969,\"icon\":\"https://render.guildwars2.com/file/A556C608FA19D4BF435608EC5A7607561C9F7C02/63185.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8970() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Ravaging Scale Armor\",\"description\":\"Double-click to unpack a full set of level 25 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":26,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8970,\"icon\":\"https://render.guildwars2.com/file/18AB9C1B05A82D5EF6CA4B16E2F7D4309BE705CF/63203.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8971() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Pillaging Scale Armor\",\"description\":\"Double-click to unpack a full set of level 25 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":26,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":8971,\"icon\":\"https://render.guildwars2.com/file/18AB9C1B05A82D5EF6CA4B16E2F7D4309BE705CF/63203.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8972() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Vigorous Scale Armor\",\"description\":\"Double-click to unpack a full set of level 25 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":26,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8972,\"icon\":\"https://render.guildwars2.com/file/18AB9C1B05A82D5EF6CA4B16E2F7D4309BE705CF/63203.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8973() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Rejuvenating Scale Armor\",\"description\":\"Double-click to unpack a full set of level 30 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":29,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8973,\"icon\":\"https://render.guildwars2.com/file/18AB9C1B05A82D5EF6CA4B16E2F7D4309BE705CF/63203.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8974() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Honed Scale Armor\",\"description\":\"Double-click to unpack a full set of level 30 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":29,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8974,\"icon\":\"https://render.guildwars2.com/file/18AB9C1B05A82D5EF6CA4B16E2F7D4309BE705CF/63203.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8975() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Strong Chain Armor\",\"description\":\"Double-click to unpack a full set of level 30 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":29,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8975,\"icon\":\"https://render.guildwars2.com/file/18AB9C1B05A82D5EF6CA4B16E2F7D4309BE705CF/63203.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8976() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Hearty Scale Armor\",\"description\":\"Double-click to unpack a full set of level 30 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":29,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8976,\"icon\":\"https://render.guildwars2.com/file/18AB9C1B05A82D5EF6CA4B16E2F7D4309BE705CF/63203.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8977() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Ravaging Scale Armor\",\"description\":\"Double-click to unpack a full set of level 35 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":66,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8977,\"icon\":\"https://render.guildwars2.com/file/18AB9C1B05A82D5EF6CA4B16E2F7D4309BE705CF/63203.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8978() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Rejuvenating Scale Armor\",\"description\":\"Double-click to unpack a full set of level 35 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":66,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8978,\"icon\":\"https://render.guildwars2.com/file/18AB9C1B05A82D5EF6CA4B16E2F7D4309BE705CF/63203.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8979() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Honed Scale Armor\",\"description\":\"Double-click to unpack a full set of level 35 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":66,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8979,\"icon\":\"https://render.guildwars2.com/file/18AB9C1B05A82D5EF6CA4B16E2F7D4309BE705CF/63203.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}