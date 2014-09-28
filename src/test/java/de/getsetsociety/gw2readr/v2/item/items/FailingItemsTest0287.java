package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0287 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem65498() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Champion Head Scientist Loot Box\",\"description\":\"This champion container has champion bags.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65498,\"icon\":\"https://render.guildwars2.com/file/C5690F486091FB543FCC08B2AC1BF2203CB4DDD6/780337.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65499() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Inquest Golemcaster Loot Box\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65499,\"icon\":\"https://render.guildwars2.com/file/900B6F07174AEFC96A664AC6115D2DABC90B06B8/66867.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65500() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Crucible of Eternity Token Loot Box\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65500,\"icon\":\"https://render.guildwars2.com/file/666209104CCB024D53359C0EA0A299076E610771/65704.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65501() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Crucible of Eternity Weapons Box\",\"description\":\"Dungeon weapon boxes contain a specific dungeon weapon set with a small variety of selectable stat combinations. Double-click to choose one of these weapons.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65501,\"icon\":\"https://render.guildwars2.com/file/9F0B0CC67A40F9B9429B91191FD35E2CA867499F/780338.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65502() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Crucible of Eternity Armor Box\",\"description\":\"Dungeon armor boxes contain a specific dungeon armor set with a small variety of selectable stat combinations. Double-click to choose one of these armor pieces.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65502,\"icon\":\"https://render.guildwars2.com/file/3C5EDBAF410DF0E477670F6DBD17495816EB0679/699329.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65503() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Champion Flame Effigy Loot Box\",\"description\":\"This champion container has champion bags.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65503,\"icon\":\"https://render.guildwars2.com/file/3946DA03A278F3271F46534679EFD99AE55545A8/780339.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65504() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Flame Legion Shadowblade Loot Box\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65504,\"icon\":\"https://render.guildwars2.com/file/900B6F07174AEFC96A664AC6115D2DABC90B06B8/66867.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65505() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Flame Legion Bladestorm Loot Box\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65505,\"icon\":\"https://render.guildwars2.com/file/900B6F07174AEFC96A664AC6115D2DABC90B06B8/66867.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65506() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Legendary Gaheron Baelfire Loot Box\",\"description\":\"This legendary container has champion bags.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65506,\"icon\":\"https://render.guildwars2.com/file/B2F40B9B091792E392291D06C8BBB16B919FA04D/780340.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65507() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Flame Legion Axe Fiend Loot Box\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65507,\"icon\":\"https://render.guildwars2.com/file/900B6F07174AEFC96A664AC6115D2DABC90B06B8/66867.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65508() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Veteran Flame Acolyte Loot Box\",\"description\":\"This veteran container has a champion bag.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65508,\"icon\":\"https://render.guildwars2.com/file/D0FD9C761C7A7B0E3A4731E52891750794496E55/780341.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65509() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Flame Legion Lava Shaman Loot Box\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65509,\"icon\":\"https://render.guildwars2.com/file/900B6F07174AEFC96A664AC6115D2DABC90B06B8/66867.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65510() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Champion Hierophant Improaster Loot Box\",\"description\":\"This champion container has champion bags.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65510,\"icon\":\"https://render.guildwars2.com/file/589051A8D67B29346C1D4F7612017F5CC666CE03/780342.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65511() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Flame Legion Stalker Loot Box\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65511,\"icon\":\"https://render.guildwars2.com/file/900B6F07174AEFC96A664AC6115D2DABC90B06B8/66867.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65512() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Veteran Flame Legion Effigy Loot Box\",\"description\":\"This veteran container has a champion bag.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65512,\"icon\":\"https://render.guildwars2.com/file/460210D11E059B7855E7DDF7225D187949CBA304/780343.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65513() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Champion Rozgar the Forge Loot Box\",\"description\":\"This champion container has champion bags.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65513,\"icon\":\"https://render.guildwars2.com/file/9BA80F1734AB77922A464D3EAB270D0BC1E2EBC9/780344.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65514() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Champion Bolok Firebringer Loot Box\",\"description\":\"This champion container has champion bags.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65514,\"icon\":\"https://render.guildwars2.com/file/BFBDB26263040834BE24B136CAD79A09780A459F/780345.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65516() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Flame Legion Fire Shaman Loot Box\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65516,\"icon\":\"https://render.guildwars2.com/file/900B6F07174AEFC96A664AC6115D2DABC90B06B8/66867.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65518() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Baelfire's Token Loot Box\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65518,\"icon\":\"https://render.guildwars2.com/file/666209104CCB024D53359C0EA0A299076E610771/65704.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65519() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Baelfire's Weapons Box\",\"description\":\"Dungeon weapon boxes contain a specific dungeon weapon set with a small variety of selectable stat combinations. Double-click to choose one of these weapons.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65519,\"icon\":\"https://render.guildwars2.com/file/4ABE525FAA19DECBFD9BBA20D07EA370764EA4D2/780346.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65520() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Baelfire's Armor Box\",\"description\":\"Dungeon armor boxes contain a specific dungeon armor set with a small variety of selectable stat combinations. Double-click to choose one of these armor pieces.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65520,\"icon\":\"https://render.guildwars2.com/file/A7707CCD4BFBCA23413F19F9052094AB66B3EC4C/699327.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65521() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Champion Vassar Loot Box\",\"description\":\"This champion container has champion bags.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65521,\"icon\":\"https://render.guildwars2.com/file/966DBC055B077BC6EE7FADC72E0D18C509583FB0/780347.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65522() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Champion Nente Loot Box\",\"description\":\"This champion container has champion bags.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65522,\"icon\":\"https://render.guildwars2.com/file/0FB16AE29F9AFB6915E7060AC141303F5B42485E/780348.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65523() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Champion Kasha Loot Box\",\"description\":\"This champion container has champion bags.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65523,\"icon\":\"https://render.guildwars2.com/file/0EFCAF1C130C7F9BF9C37602F6E6AE3007BD5AD3/780349.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65524() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Champion Ralena Loot Box\",\"description\":\"This champion container has champion bags.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65524,\"icon\":\"https://render.guildwars2.com/file/115C7505ADEC3A10295502DFCDC9D3CCAE5FD864/780350.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}