package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0286 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem65436() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minotaur Loot Box\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65436,\"icon\":\"https://render.guildwars2.com/file/900B6F07174AEFC96A664AC6115D2DABC90B06B8/66867.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65438() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Quaggan Loot Box\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65438,\"icon\":\"https://render.guildwars2.com/file/900B6F07174AEFC96A664AC6115D2DABC90B06B8/66867.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65443() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Inquest Loot Box\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65443,\"icon\":\"https://render.guildwars2.com/file/900B6F07174AEFC96A664AC6115D2DABC90B06B8/66867.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65444() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Veteran Ice Elemental Loot Box\",\"description\":\"Veteran containers contain obsidian shards and a champion bag.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65444,\"icon\":\"https://render.guildwars2.com/file/4EE5CAD72C7706907208DB63BCFF4C176F0D0F33/780321.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65445() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Veteran Earth Elemental Loot Box\",\"description\":\"Veteran containers contain obsidian shards and a champion bag.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65445,\"icon\":\"https://render.guildwars2.com/file/CBC1BA2B03CDA0F9ADFE12936C3D0C3BAD24C90C/780322.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65447() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Champion Dredge Loot Box\",\"description\":\"This champion container has champion bags, dragonite ore, and empyreal fragments.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65447,\"icon\":\"https://render.guildwars2.com/file/C87FF074456D2CCA56DCD89D35084501B00E6636/780323.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65448() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Champion Jotun Loot Box\",\"description\":\"This champion container has champion bags, dragonite ore, and empyreal fragments.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65448,\"icon\":\"https://render.guildwars2.com/file/290A0776736F9DD308D3CA1A1140EF7DC713B30B/780324.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65449() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Champion Grawl Loot Box\",\"description\":\"This champion container has champion bags, dragonite ore, and empyreal fragments.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65449,\"icon\":\"https://render.guildwars2.com/file/B70C7DF554E8E7465BA106CFAE1CF47FD139F8C8/780325.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65450() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Champion Sons of Svanir Loot Box\",\"description\":\"This champion container has champion bags.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65450,\"icon\":\"https://render.guildwars2.com/file/D5A50B3D749B4DAB18AE0EEBC2E7C052593C2EFD/780326.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65453() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Shiverpeak Mountains Weapon Skins Box\",\"description\":\"This regional weapon box contains unique skins, dragonite ore, empyreal fragments, obsidian shards, and mystic clovers.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65453,\"icon\":\"https://render.guildwars2.com/file/9795E70814A4BF0F0DED0A0A4E6CC019080FE876/780327.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65471() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Icebrood Hunter Loot Box\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65471,\"icon\":\"https://render.guildwars2.com/file/900B6F07174AEFC96A664AC6115D2DABC90B06B8/66867.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65482() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Champion Mutated Fish Loot Box\",\"description\":\"This champion container has champion bags.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65482,\"icon\":\"https://render.guildwars2.com/file/C516B3B60BF372C27655F3C701166334D59D0900/780328.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65483() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Champion Kudu Power Suit Loot Box\",\"description\":\"This champion container has champion bags.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65483,\"icon\":\"https://render.guildwars2.com/file/CE40452219F3022E09D9FE7779D6A012B4B8C8F7/780329.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65485() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Inquest Technician Loot Box\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65485,\"icon\":\"https://render.guildwars2.com/file/900B6F07174AEFC96A664AC6115D2DABC90B06B8/66867.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65486() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Inquest Grenadier Loot Box\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65486,\"icon\":\"https://render.guildwars2.com/file/900B6F07174AEFC96A664AC6115D2DABC90B06B8/66867.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65487() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Inquest Assassin Loot Box\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65487,\"icon\":\"https://render.guildwars2.com/file/900B6F07174AEFC96A664AC6115D2DABC90B06B8/66867.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65488() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Veteran Mark II Golem Loot Box\",\"description\":\"This veteran container has a champion bag.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65488,\"icon\":\"https://render.guildwars2.com/file/BF22A60628EE9EA9090305470C7D4FEEF1F67975/780330.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65489() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Inquest Pilot Loot Box\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65489,\"icon\":\"https://render.guildwars2.com/file/900B6F07174AEFC96A664AC6115D2DABC90B06B8/66867.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65490() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Inquest Engineer Loot Box\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65490,\"icon\":\"https://render.guildwars2.com/file/900B6F07174AEFC96A664AC6115D2DABC90B06B8/66867.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65492() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Champion Inquest Technologist Loot Box\",\"description\":\"This champion container has champion bags.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65492,\"icon\":\"https://render.guildwars2.com/file/2BF53AD09F79D26919F8309BB6550D29061FA1ED/780331.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65493() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Veteran Mark III Golem Loot Box\",\"description\":\"This veteran container has a champion bag.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65493,\"icon\":\"https://render.guildwars2.com/file/D6395A1BA351172DAA380E7BA665C00FBB3B5B43/780332.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65494() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Champion Kudu Loot Box\",\"description\":\"This champion container has champion bags.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65494,\"icon\":\"https://render.guildwars2.com/file/E57A7B786F3A7921F436BCFCB8A37416641A782F/780333.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65495() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Veteran Kudu's Power Suit Loot Box\",\"description\":\"This veteran container has a champion bag.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65495,\"icon\":\"https://render.guildwars2.com/file/E9D8BFB1120316349D236CEDF1B780095F07A6D5/780334.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65496() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Veteran Mark I Golem Loot Box\",\"description\":\"This veteran container has a champion bag.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65496,\"icon\":\"https://render.guildwars2.com/file/6A1127D7BCF6CB7EE7237E12CED15DC316C0689C/780335.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65497() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Legendary Kudu's Monster Loot Box\",\"description\":\"This legendary container has champion bags.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65497,\"icon\":\"https://render.guildwars2.com/file/51B9084A02035D0615D3DA2980DB25F5511CD5D5/780336.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}