package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0090 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem22331() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Salvageable Hide\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":25,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":22331,\"icon\":\"https://render.guildwars2.com/file/05D7A5EF6308F380D5F54DE502357059AF096C00/66511.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem22332() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Adept's Training Manual\",\"description\":\"Double-click to use. This item will unlock the ability to spend up to 10 points in all trait lines, and will refund your currently spent trait points. This item can only be used once.\",\"type\":\"Gizmo\",\"level\":11,\"rarity\":\"Fine\",\"vendor_value\":125,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":22332,\"icon\":\"https://render.guildwars2.com/file/C5787913CC53E94FE477D106B1AD30A926F5D716/66752.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem22333() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Master's Training Manual\",\"description\":\"Double-click to use. This item will unlock the ability to spend up to 20 points in all trait lines, and will refund your currently spent trait points. This item can only be used once.\",\"type\":\"Gizmo\",\"level\":40,\"rarity\":\"Masterwork\",\"vendor_value\":1250,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":22333,\"icon\":\"https://render.guildwars2.com/file/1F64A2799FC8666FFC66FE56DAA75C02E7E9BA6F/66753.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem22334() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Grandmaster's Training Manual\",\"description\":\"Double-click to use. This item will unlock the ability to spend up to 30 points in all trait lines, and will refund your currently spent trait points. This item can only be used once.\",\"type\":\"Gizmo\",\"level\":60,\"rarity\":\"Rare\",\"vendor_value\":2500,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":22334,\"icon\":\"https://render.guildwars2.com/file/600F7957154DD173F5F6EF25807835CAFCEF239C/64964.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem22335() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Commander's Compendium\",\"description\":\"Double-click to use. Unlock the ability to become a Commander.\",\"type\":\"Gizmo\",\"level\":11,\"rarity\":\"Fine\",\"vendor_value\":125000,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":22335,\"icon\":\"https://render.guildwars2.com/file/1F64A2799FC8666FFC66FE56DAA75C02E7E9BA6F/66753.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem22992() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Harvesting Sickle\",\"description\":\"Used to gather Taproots, Spinach, Strawberries, Herb Sprouts, and all other lesser edible plants. Can also crack open Clams.\",\"type\":\"Gathering\",\"level\":10,\"rarity\":\"Basic\",\"vendor_value\":7,\"default_skin\":2385,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":22992,\"icon\":\"https://render.guildwars2.com/file/AA1BD042F1EAB6A0F5D614DC6113E356C4B836C1/66591.png\",\"details\":{\"type\":\"Foraging\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem22994() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Logging Axe\",\"description\":\"Used to chop down Gummo Saplings, Mimosa Saplings, Snow Cherry Saplings, and all other lesser saplings.\",\"type\":\"Gathering\",\"level\":10,\"rarity\":\"Basic\",\"vendor_value\":7,\"default_skin\":2388,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":22994,\"icon\":\"https://render.guildwars2.com/file/201CC6E60448CB4BA8AD919C74904EE1F9AEC54F/66597.png\",\"details\":{\"type\":\"Logging\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem22995() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Mining Pick\",\"description\":\"Used to mine Iron Ore, Silver Ore, and all other lesser metals.\",\"type\":\"Gathering\",\"level\":10,\"rarity\":\"Basic\",\"vendor_value\":7,\"default_skin\":2395,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":22995,\"icon\":\"https://render.guildwars2.com/file/3CD995B576C8CB39B02D4826EA04690701755ECB/66254.png\",\"details\":{\"type\":\"Mining\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem22997() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Harvesting Sickle\",\"description\":\"Used to gather all plants.\",\"type\":\"Gathering\",\"level\":60,\"rarity\":\"Fine\",\"vendor_value\":50,\"default_skin\":2385,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":22997,\"icon\":\"https://render.guildwars2.com/file/AA1BD042F1EAB6A0F5D614DC6113E356C4B836C1/66591.png\",\"details\":{\"type\":\"Foraging\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23000() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Logging Axe\",\"description\":\"Used to chop down all saplings.\",\"type\":\"Gathering\",\"level\":60,\"rarity\":\"Fine\",\"vendor_value\":50,\"default_skin\":2388,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":23000,\"icon\":\"https://render.guildwars2.com/file/201CC6E60448CB4BA8AD919C74904EE1F9AEC54F/66597.png\",\"details\":{\"type\":\"Logging\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23001() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Mining Pick\",\"description\":\"Used to mine all metals.\",\"type\":\"Gathering\",\"level\":60,\"rarity\":\"Fine\",\"vendor_value\":50,\"default_skin\":2395,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":23001,\"icon\":\"https://render.guildwars2.com/file/3CD995B576C8CB39B02D4826EA04690701755ECB/66254.png\",\"details\":{\"type\":\"Mining\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23002() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steel Logging Axe\",\"description\":\"Used to chop down Tukawa Saplings, Fir Saplings and all other lesser saplings.\",\"type\":\"Gathering\",\"level\":20,\"rarity\":\"Basic\",\"vendor_value\":11,\"default_skin\":2388,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":23002,\"icon\":\"https://render.guildwars2.com/file/201CC6E60448CB4BA8AD919C74904EE1F9AEC54F/66597.png\",\"details\":{\"type\":\"Logging\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23003() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steel Mining Pick\",\"description\":\"Used to mine Gold Ore, and all other lesser metals.\",\"type\":\"Gathering\",\"level\":20,\"rarity\":\"Basic\",\"vendor_value\":11,\"default_skin\":2395,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":23003,\"icon\":\"https://render.guildwars2.com/file/3CD995B576C8CB39B02D4826EA04690701755ECB/66254.png\",\"details\":{\"type\":\"Mining\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23004() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steel Harvesting Sickle\",\"description\":\"Used to gather Zucchini, Kale, Root Vegetables, Varied Mushrooms, Young Herbs, Grapes, Cabbage, and all other lesser edible plants.\",\"type\":\"Gathering\",\"level\":20,\"rarity\":\"Basic\",\"vendor_value\":11,\"default_skin\":2385,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":23004,\"icon\":\"https://render.guildwars2.com/file/AA1BD042F1EAB6A0F5D614DC6113E356C4B836C1/66591.png\",\"details\":{\"type\":\"Foraging\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23005() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darksteel Harvesting Sickle\",\"description\":\"Used to gather Blackberries, Variegated Taproots, Scallions, Portobello Mushrooms, Mature Herbs, Sugar Pumpkins, Cauliflower, and all other lesser edible plants. Can also harvest Coral.\",\"type\":\"Gathering\",\"level\":30,\"rarity\":\"Basic\",\"vendor_value\":15,\"default_skin\":2385,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":23005,\"icon\":\"https://render.guildwars2.com/file/AA1BD042F1EAB6A0F5D614DC6113E356C4B836C1/66591.png\",\"details\":{\"type\":\"Foraging\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23006() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darksteel Logging Axe\",\"description\":\"Used to chop down Banyan Saplings, Pine Saplings, Inglewood Saplings, and all other lesser saplings.\",\"type\":\"Gathering\",\"level\":30,\"rarity\":\"Basic\",\"vendor_value\":15,\"default_skin\":2388,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":23006,\"icon\":\"https://render.guildwars2.com/file/201CC6E60448CB4BA8AD919C74904EE1F9AEC54F/66597.png\",\"details\":{\"type\":\"Logging\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23007() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darksteel Mining Pick\",\"description\":\"Used to mine Platinum Ore, and all other lesser metals.\",\"type\":\"Gathering\",\"level\":30,\"rarity\":\"Basic\",\"vendor_value\":15,\"default_skin\":2395,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":23007,\"icon\":\"https://render.guildwars2.com/file/3CD995B576C8CB39B02D4826EA04690701755ECB/66254.png\",\"details\":{\"type\":\"Mining\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23008() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Harvesting Sickle\",\"description\":\"Used to gather Asparagus, Cayenne Peppers, Leeks, Winter Root Vegetables, Verdant Herbs, Raspberries, Butternut Squash, Artichokes, and all other lesser edible plants.\",\"type\":\"Gathering\",\"level\":45,\"rarity\":\"Basic\",\"vendor_value\":20,\"default_skin\":2385,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":23008,\"icon\":\"https://render.guildwars2.com/file/AA1BD042F1EAB6A0F5D614DC6113E356C4B836C1/66591.png\",\"details\":{\"type\":\"Foraging\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23009() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Logging Axe\",\"description\":\"Used to chop down Red Oak Saplings, Cypress Saplings, Baoba Saplings, and all other lesser saplings.\",\"type\":\"Gathering\",\"level\":45,\"rarity\":\"Basic\",\"vendor_value\":20,\"default_skin\":2388,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":23009,\"icon\":\"https://render.guildwars2.com/file/201CC6E60448CB4BA8AD919C74904EE1F9AEC54F/66597.png\",\"details\":{\"type\":\"Logging\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23010() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Mining Pick\",\"description\":\"Used to mine Mithril, and all other lesser metals.\",\"type\":\"Gathering\",\"level\":45,\"rarity\":\"Basic\",\"vendor_value\":20,\"default_skin\":2395,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":23010,\"icon\":\"https://render.guildwars2.com/file/3CD995B576C8CB39B02D4826EA04690701755ECB/66254.png\",\"details\":{\"type\":\"Mining\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23020() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Master Harvesting Sickle\",\"description\":\"More efficient at gathering resources and uncovering rare components.\",\"type\":\"Gathering\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":72,\"default_skin\":2385,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":23020,\"icon\":\"https://render.guildwars2.com/file/AA1BD042F1EAB6A0F5D614DC6113E356C4B836C1/66591.png\",\"details\":{\"type\":\"Foraging\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23021() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Master Logging Axe\",\"description\":\"More efficient at gathering resources and uncovering rare components.\",\"type\":\"Gathering\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":72,\"default_skin\":2388,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":23021,\"icon\":\"https://render.guildwars2.com/file/201CC6E60448CB4BA8AD919C74904EE1F9AEC54F/66597.png\",\"details\":{\"type\":\"Logging\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23022() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Master Mining Pick\",\"description\":\"More efficient at gathering resources and uncovering rare components.\",\"type\":\"Gathering\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":72,\"default_skin\":2395,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":23022,\"icon\":\"https://render.guildwars2.com/file/3CD995B576C8CB39B02D4826EA04690701755ECB/66254.png\",\"details\":{\"type\":\"Mining\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23026() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Master Harvesting Sickle\",\"description\":\"More efficient at gathering resources and uncovering rare components.\",\"type\":\"Gathering\",\"level\":60,\"rarity\":\"Masterwork\",\"vendor_value\":108,\"default_skin\":2385,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":23026,\"icon\":\"https://render.guildwars2.com/file/AA1BD042F1EAB6A0F5D614DC6113E356C4B836C1/66591.png\",\"details\":{\"type\":\"Foraging\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23027() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Master Logging Axe\",\"description\":\"More efficient at gathering resources and uncovering rare components.\",\"type\":\"Gathering\",\"level\":60,\"rarity\":\"Masterwork\",\"vendor_value\":108,\"default_skin\":2388,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":23027,\"icon\":\"https://render.guildwars2.com/file/201CC6E60448CB4BA8AD919C74904EE1F9AEC54F/66597.png\",\"details\":{\"type\":\"Logging\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}