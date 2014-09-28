package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0001 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem8123() {
        try {
             ItemJson item = mapper.readValue("{\"name\":\"Race Track Voucher\",\"description\":\"Redeem this for your winnings by talking to Tigg.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"NotUpgradeable\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":8123,\"icon\":\"https://render.guildwars2.com/file/0FF3F1E574DCDEFA2CC60E04B22BF5291273EDC3/62856.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8468() {
        try {
             ItemJson item = mapper.readValue("{\"name\":\"Zephyrite Rescue Pack\",\"description\":\"Double-click to receive the following items: 1 Speed Booster, 1 Zephyrite Color Swatch: Red, 15 Black Lion Keys, 1 Aviator Cap Skin, 250 Piles of Sand.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":129,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":8468,\"icon\":\"https://render.guildwars2.com/file/B80BE438007179E12B18B5EBDFCB1C61E2605DD6/824921.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8905() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Small Bag of Goods\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8905,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8910() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Goods\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8910,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8913() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tiny Loot Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8913,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8914() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Small Loot Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":10,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8914,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8915() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Light Loot Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":15,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8915,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8916() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Loot Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":20,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8916,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8917() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Loot Sack\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":25,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8917,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8918() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Medium Loot Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8918,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8919() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Large Loot Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":35,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8919,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8920() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Heavy Loot Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":40,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8920,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8921() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Fall Adventure Pouch\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8921,\"icon\":\"https://render.guildwars2.com/file/3BF274D1A323C002CDCFE80724912CDB7C78ABEE/62857.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8932() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Starter Backpack\",\"description\":\"A 20 slot bag for beginning characters.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":8932,\"icon\":\"https://render.guildwars2.com/file/80E36806385691D4C0910817EF2A6C2006AEE353/61755.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":20}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8933() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Leather Bag\",\"description\":\"8 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8933,\"icon\":\"https://render.guildwars2.com/file/0CD55FE36D39E30AA94A96030D73EF22250E0E26/63172.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":8}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8934() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Leather Bag\",\"description\":\"10 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8934,\"icon\":\"https://render.guildwars2.com/file/0CD55FE36D39E30AA94A96030D73EF22250E0E26/63172.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":10}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8939() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ogre Bag\",\"description\":\"10 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8939,\"icon\":\"https://render.guildwars2.com/file/C94390C70B6D32231F43A3A4980597D5694CA321/63174.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":10}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8940() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wrangler's Bag\",\"description\":\"9 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8940,\"icon\":\"https://render.guildwars2.com/file/C94390C70B6D32231F43A3A4980597D5694CA321/63174.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":9}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8941() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Leather Bag\",\"description\":\"4 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":8941,\"icon\":\"https://render.guildwars2.com/file/0CD55FE36D39E30AA94A96030D73EF22250E0E26/63172.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":4}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8949() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Blue Leather Bag\",\"description\":\"5 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8949,\"icon\":\"https://render.guildwars2.com/file/611F3A54CC0F0BB36B7C58B8D4A5B941A5ED055D/63175.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":5}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8950() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Green Leather Bag\",\"description\":\"5 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8950,\"icon\":\"https://render.guildwars2.com/file/F5F6BA05016F3E480AA9BA5BE39E060EC362D367/63176.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":5}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8951() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orange Leather Bag\",\"description\":\"5 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8951,\"icon\":\"https://render.guildwars2.com/file/ACE85C02CDEB0B91060233A95BA1FCBA020D9CF8/63177.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":5}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8952() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Purple Leather Bag\",\"description\":\"5 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8952,\"icon\":\"https://render.guildwars2.com/file/AE90E110F909089D0F66FCFB92A5505B076634A3/63178.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":5}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem8953() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Red Leather Bag\",\"description\":\"5 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":8953,\"icon\":\"https://render.guildwars2.com/file/9A17A2CE63A1C86D803E183671BB49BBBDB90715/63179.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":5}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}