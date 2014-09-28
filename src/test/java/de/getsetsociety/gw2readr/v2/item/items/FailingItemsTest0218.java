package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0218 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem49495() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Recipe: Ascended Light Boots\",\"description\":\"Double-click and choose which Ascended Light Boots recipe to receive.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49495,\"icon\":\"https://render.guildwars2.com/file/162616E65F5D247791C12B0BA27442536637E1D8/631170.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49496() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Recipe: Ascended Light Coat\",\"description\":\"Double-click and choose which Ascended Light Coat recipe to receive.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49496,\"icon\":\"https://render.guildwars2.com/file/162616E65F5D247791C12B0BA27442536637E1D8/631170.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49497() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Recipe: Ascended Light Gloves\",\"description\":\"Double-click and choose which Ascended Light Gloves recipe to receive.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49497,\"icon\":\"https://render.guildwars2.com/file/162616E65F5D247791C12B0BA27442536637E1D8/631170.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49498() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Recipe: Ascended Light Helm\",\"description\":\"Double-click and choose which Ascended Light Helm recipe to receive.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49498,\"icon\":\"https://render.guildwars2.com/file/162616E65F5D247791C12B0BA27442536637E1D8/631170.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49499() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Recipe: Ascended Light Leggings\",\"description\":\"Double-click and choose which Ascended Light Leggings recipe to receive.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49499,\"icon\":\"https://render.guildwars2.com/file/162616E65F5D247791C12B0BA27442536637E1D8/631170.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49500() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Recipe: Ascended Light Shoulders\",\"description\":\"Double-click and choose which Ascended Light Shoulders recipe to receive.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49500,\"icon\":\"https://render.guildwars2.com/file/162616E65F5D247791C12B0BA27442536637E1D8/631170.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49522() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dire Intricate Gossamer Insignia\",\"description\":\"Used in the crafting of armor with +Condition Damage, +Vitality, and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":49522,\"icon\":\"https://render.guildwars2.com/file/A3D8FA093CF830A5F799C742AAC70DE590C21498/699307.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49523() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lesser Vision Crystal\",\"description\":\"Used in crafting Ascended items.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":40,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49523,\"icon\":\"https://render.guildwars2.com/file/4F19A8B4E309C3042358FB194F7190331DEF27EB/631494.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49524() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Ho-Ho-Tron\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":49524,\"icon\":\"https://render.guildwars2.com/file/396029DEBBB49135915104913919247A56EFB9D0/681019.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49531() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gathering Tool 3 Pack\",\"description\":\"This package contains the following items:\n* Molten Alliance Mining Pick\n* Consortium Harvesting Sickle\n* Chop-It-All Logging Axe\nEach tool has unlimited usage and the same efficiency as Orichalcum tools.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":12,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49531,\"icon\":\"https://render.guildwars2.com/file/53FB2100E034A0C49CB6505A2F1E34063A1F976A/699318.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49532() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Soldier's Duffel\",\"description\":\"20 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49532,\"icon\":\"https://render.guildwars2.com/file/6EB56CA4E909EFDAF519322E704F159691AC010E/699322.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":20}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49542() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Nightmare's Medium Armor Box\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49542,\"icon\":\"https://render.guildwars2.com/file/D04EF6FDE3DBC26E7BB109EB4F52057FEAD8619E/699325.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49564() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Human Tier 3 Heavy Armor Box\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49564,\"icon\":\"https://render.guildwars2.com/file/6D0DD351E056F5E45F1456E1376A715C05D663DC/699333.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49565() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Human Tier 3 Medium Armor Box\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49565,\"icon\":\"https://render.guildwars2.com/file/6D0DD351E056F5E45F1456E1376A715C05D663DC/699333.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49566() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Human Tier 3 Light Armor Box\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49566,\"icon\":\"https://render.guildwars2.com/file/6D0DD351E056F5E45F1456E1376A715C05D663DC/699333.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49573() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Charr Tier 3 Heavy Armor Box\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49573,\"icon\":\"https://render.guildwars2.com/file/36B5016805433FD84E041B5903AC1A3A6846E603/699336.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49578() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Asuran Tier 1 Medium Armor Box\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49578,\"icon\":\"https://render.guildwars2.com/file/0C21D9EA7339BC0804D446D54C6A049B94EB05FD/699337.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49582() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Asuran Tier 3 Heavy Armor Box\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49582,\"icon\":\"https://render.guildwars2.com/file/1C64D13959A02331239BD322AB7CF80BE8BA9CE9/699339.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49593() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Norn Tier 3 Medium Armor Box\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49593,\"icon\":\"https://render.guildwars2.com/file/3EC40F731C0CC30FB1F7040357E5FEE63743283D/699342.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49601() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sylvari Tier 3 Light Armor Box\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49601,\"icon\":\"https://render.guildwars2.com/file/3D24356976E4A3FE0E7AF31480194FF732BEEB09/699345.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49651() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Keeper's Weapon Chest\",\"description\":\"Double-click to choose an ascended weapon with Zealot's stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49651,\"icon\":\"https://render.guildwars2.com/file/2308D4A3DCB8FDCE79620C1F043F74D07BA94722/711846.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49652() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Keeper's Armor Chest\",\"description\":\"Double-click to choose an ascended armor piece with Zealot's stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49652,\"icon\":\"https://render.guildwars2.com/file/2308D4A3DCB8FDCE79620C1F043F74D07BA94722/711846.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49654() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hoard of the Marionette Warden IV\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49654,\"icon\":\"https://render.guildwars2.com/file/EC12BE596939FA100394651B5715F33A0046EB36/711847.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49655() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hoard of the Marionette Warden III\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49655,\"icon\":\"https://render.guildwars2.com/file/EC12BE596939FA100394651B5715F33A0046EB36/711847.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49656() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hoard of the Marionette Warden II\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49656,\"icon\":\"https://render.guildwars2.com/file/EC12BE596939FA100394651B5715F33A0046EB36/711847.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}