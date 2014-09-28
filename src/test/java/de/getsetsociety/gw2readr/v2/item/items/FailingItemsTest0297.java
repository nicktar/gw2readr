package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0297 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem66992() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Enormous Foxfire Cluster\",\"description\":\"This powerful cluster of foxfire still needs a catalyst to fully unlock its growth potential.\nDouble-click to show.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66992,\"icon\":\"https://render.guildwars2.com/file/DD6EF16875A9456A096E22531906309CFA0F79CB/855359.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66993() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Grow Lamp\",\"description\":\"<c=@flavor>Just needs a little extra something to attune this lamp for maximum growth potential.</c>\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":66993,\"icon\":\"https://render.guildwars2.com/file/A3F044BBD2AD33A4CAC1F00276A633392A59C7FD/855360.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66995() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Attuned Grow Lamp\",\"description\":\"Double-click to shine on a Cultivated Shoot.\n\n<c=@flavor>With a hefty helping of luck, this lamp should get the most stubborn of plants to grow toward its light.</c>\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66995,\"icon\":\"https://render.guildwars2.com/file/0F65DE10E53DB705960FD37F37CEDE9C07730FDD/855362.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66999() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mawdrey II\",\"description\":\"Double-click to feed 50 Bloodstone Dust in exchange for a gift. Mawdrey II will become full if fed too much dust in a day.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66999,\"icon\":\"https://render.guildwars2.com/file/7D37CF59E3101EEED557DB3F6530A02BDFE95F68/855363.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67003() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pet Seedling\",\"description\":\"<c=@flavor>This young carnivorous plant looks hungry for something particularly magical. Some Elementally Charged Plant Food should satisfy its cravings.</c>\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67003,\"icon\":\"https://render.guildwars2.com/file/09D4806693A444A9F41FDB7B1A38AE2FF73796F9/849429.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67008() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mists Infused Clay Pot\",\"description\":\"Double-click to plant your Pet Seed in this pot.\n\n<c=@flavor>A pot infused with the energy of the Mists.</c>\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67008,\"icon\":\"https://render.guildwars2.com/file/A62BA8CEF3542AF561610D77466E977BF436E044/855368.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67010() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Package of Elementally Charged Plant Food\",\"description\":\"Double-click to feed to your Pet Seedling.\n\n<c=@flavor>Watch your fingers—this food occasionally gives you a bit of a jolt.</c>\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67010,\"icon\":\"https://render.guildwars2.com/file/949BCF5971687CA6C79E967B09E27A4C0175EAFA/855370.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67012() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Package of Rhand Blessed Plant Food\",\"description\":\"Double-click to feed to your Pet Sprout.\n\n<c=@flavor>Soaked in water from the Font of Rhand.</c>\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67012,\"icon\":\"https://render.guildwars2.com/file/CBA400140D28B86DBE09C35F3122AB4FFF98D10E/855372.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67014() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Powerful Grow Lamp\",\"description\":\"Double-click to shine on your Pet Shoot.\n\n<c=@flavor>Armed with a light that shone in the dark, this lamp is very powerful.</c>\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67014,\"icon\":\"https://render.guildwars2.com/file/1D24FA0DC6081163E125D7160EDEED22DF6AAC0A/855374.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67015() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Heat Stone\",\"description\":\"<c=@flavor>A simple heat stone isn't quite enough to channel the sweltering temperatures of the deep Maguuma Jungle.</c>\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":67015,\"icon\":\"https://render.guildwars2.com/file/0411420C4FB4B7287A006AD5B7AB0E41171009B6/855375.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67016() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Destroyer Heated Stone\",\"description\":\"Double-click to warm your Pet Plantling.\n\n<c=@flavor>Special care should be taken with this hot stone if you don't want to get burned.</c>\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67016,\"icon\":\"https://render.guildwars2.com/file/EBDD7590EC76B6FED8D9452EB5CC4E0D253C7FAD/855376.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67022() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Svanir\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67022,\"icon\":\"https://render.guildwars2.com/file/5FCD5D0C2A757A364270DA3CD85C5EA1FAAFEB0C/866823.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67025() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Chieftain Utahein\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67025,\"icon\":\"https://render.guildwars2.com/file/6C1E68C3F7916FB8730BCB53239CA09E06CB974E/866824.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67027() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Silver-Fed Salvage-o-Matic\",\"description\":\"Double-click to salvage crafting materials from an item in your inventory. 25% chance of rarer materials. 80% chance of recovering upgrades from items.\",\"type\":\"Tool\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67027,\"icon\":\"https://render.guildwars2.com/file/53BE1B65A817091427E30319C2B2B3777C27A319/855379.png\",\"details\":{\"type\":\"Salvage\",\"charges\":1}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67030() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Fused Molten Logging Axe\",\"description\":\"Perfect for use on all types of trees. Unlimited use.\",\"type\":\"Gathering\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":192,\"default_skin\":5657,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67030,\"icon\":\"https://render.guildwars2.com/file/E31818DD403BE127B29E214C7956BFA301F680DA/866829.png\",\"details\":{\"type\":\"Logging\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67032() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Fused Molten Sickle\",\"description\":\"Used to harvest all plants. Unlimited use.\",\"type\":\"Gathering\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"default_skin\":5656,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67032,\"icon\":\"https://render.guildwars2.com/file/51782971EFC6B80F4B5BD0FB080D0CFFA37B1576/866830.png\",\"details\":{\"type\":\"Foraging\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67075() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Arid Inquest Cache\",\"description\":\"Double-click to gain Silky Sand and loot.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67075,\"icon\":\"https://render.guildwars2.com/file/FD3B9CF7AB1DCE34610D76017E56AA5618529E7E/222604.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67077() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Veteran Arid Skritt Cache\",\"description\":\"Double-click to gain Obsidian Shards, Geodes, Silky Sand, and other loot.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67077,\"icon\":\"https://render.guildwars2.com/file/18EA4E0B4BA170249AD2B67ED80F6E06AA49BDF7/222608.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67078() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Arid Devourer Cache\",\"description\":\"Double-click to gain Silky Sand and loot.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67078,\"icon\":\"https://render.guildwars2.com/file/FD3B9CF7AB1DCE34610D76017E56AA5618529E7E/222604.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67079() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Veteran Vined Cache\",\"description\":\"Double-click to gain Obsidian Shards, Geodes, Silky Sand, and other loot.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67079,\"icon\":\"https://render.guildwars2.com/file/18EA4E0B4BA170249AD2B67ED80F6E06AA49BDF7/222608.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67080() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dust Mite Cache\",\"description\":\"Double-click to gain Silky Sand and loot.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67080,\"icon\":\"https://render.guildwars2.com/file/10ACE47195709F69F366026507FEB0080DF39BE7/63194.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67081() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Veteran Dust Mite Cache\",\"description\":\"Double-click to gain Obsidian Shards, Geodes, Silky Sand, and other loot.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67081,\"icon\":\"https://render.guildwars2.com/file/18EA4E0B4BA170249AD2B67ED80F6E06AA49BDF7/222608.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67082() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Champion Arid Inquest Cache\",\"description\":\"Double-click to gain Champion Bags, Dragonite Ore, Empyreal Fragments, Geodes, a Zephyrite Lockpick, Silky Sand, and other loot.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67082,\"icon\":\"https://render.guildwars2.com/file/E1C5D2E7206D58DA48C80D08B20106B923FF0825/619510.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67084() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pristine Sand-Carved Cache\",\"description\":\"Double-click to gain Geodes, Silky Sand, Dragonite Ore, Empyreal Fragments, Obsidian Shards, Mystic Clovers, Zephyrite Lockpick, and the choice of one Ambrite Fossil.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67084,\"icon\":\"https://render.guildwars2.com/file/D1DEC6FDA7FCEABC656FD6D30C62C97B11D9E711/831461.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67085() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Arid Skritt Cache\",\"description\":\"Double-click to gain Silky Sand and loot.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67085,\"icon\":\"https://render.guildwars2.com/file/FD3B9CF7AB1DCE34610D76017E56AA5618529E7E/222604.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}