package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0197 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem44540() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Offering of the Forgeman\",\"description\":\"An offering used in dungeon recipes.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44540,\"icon\":\"https://render.guildwars2.com/file/AA0D08533C2AEB05C009ABF8E01FA10EF367EEED/434289.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44541() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Offering of Thorns\",\"description\":\"An offering used in dungeon recipes.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44541,\"icon\":\"https://render.guildwars2.com/file/52C1092DBD526353AB20AD1CBBC0E2CF215346F6/434291.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44542() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Offering of the Sanctuary\",\"description\":\"An offering used in dungeon recipes.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44542,\"icon\":\"https://render.guildwars2.com/file/1E720F4479B7D9345B4F6E4D1E330D13169FAE71/434295.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44543() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Offering of Baelfire\",\"description\":\"An offering used in dungeon recipes.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44543,\"icon\":\"https://render.guildwars2.com/file/C3D0BDD0734EF89445C002F8F65B7149AF055BA8/434293.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44544() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Offering of Knowledge\",\"description\":\"An offering used in dungeon recipes.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44544,\"icon\":\"https://render.guildwars2.com/file/7EBF5C30800805453737DD72E80E08D00769BB30/434294.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44555() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Holographic Communicator\",\"description\":\"Double-click to open a holographic communication channel with Emissary Vorpp. Check in frequently to discuss the next step in your investigation.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":44555,\"icon\":\"https://render.guildwars2.com/file/685C99F0EFBDAED2B26293E144B192E8A3B50905/625760.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44595() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Coins\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":44595,\"icon\":\"https://render.guildwars2.com/file/3BF274D1A323C002CDCFE80724912CDB7C78ABEE/62857.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44596() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Coins\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":44596,\"icon\":\"https://render.guildwars2.com/file/3BF274D1A323C002CDCFE80724912CDB7C78ABEE/62857.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44597() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Coins\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":44597,\"icon\":\"https://render.guildwars2.com/file/3BF274D1A323C002CDCFE80724912CDB7C78ABEE/62857.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44602() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Copper-Fed Salvage-o-Matic\",\"description\":\"Double-click to salvage crafting materials from an item in your inventory. 10% chance of rarer materials. 20% chance of recovering upgrades. Requires 3 copper per use.\",\"type\":\"Tool\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44602,\"icon\":\"https://render.guildwars2.com/file/CC2004000FFDFCEF346AAE296FD0E858C0990548/619581.png\",\"details\":{\"type\":\"Salvage\",\"charges\":1}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44604() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Royal Pass (2 weeks)\",\"description\":\"Grants access to the Royal Terrace in Divinity's Reach. Redeemable at any time. Expires two weeks after first use. Double-click to display the pass.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44604,\"icon\":\"https://render.guildwars2.com/file/BDC13536C55A9F74A2BEF3B8C4182CF038E85629/619582.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44605() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Royal Pass (2 weeks)\",\"description\":\"Grants access to the Royal Terrace in Divinity's Reach. Redeemable at any time. Expires two weeks after first use. Double-click to display the pass.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44605,\"icon\":\"https://render.guildwars2.com/file/BDC13536C55A9F74A2BEF3B8C4182CF038E85629/619582.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44637() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Flames of Kryta\",\"description\":\"Use this torch to find your way in the dark.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44637,\"icon\":\"https://render.guildwars2.com/file/49D9A89CD22BED9933929CE2E7592328550259DC/619591.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44638() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hot Air Balloon Souvenir\",\"description\":\"Double-click to pull out a festive balloon.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44638,\"icon\":\"https://render.guildwars2.com/file/E655BE16077EA92C440CFC5E4CD373BC04613F7F/619592.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44639() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Watchknight\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44639,\"icon\":\"https://render.guildwars2.com/file/A5ACCE6E3CECE2960099ED0356FF371806E49064/619593.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44640() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Queen's Gauntlet Entrance Ticket\",\"description\":\"Admit one competitor into a Queen's Gauntlet arena.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":39,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44640,\"icon\":\"https://render.guildwars2.com/file/4A0D55430A717CE5BA7F98BEC20B92053646520A/619594.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44641() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Liadri the Concealing Dark\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44641,\"icon\":\"https://render.guildwars2.com/file/959E7AFBACA7951D1104C8C56F63A5BF0566C408/619595.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44720() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Infinite Watchknight Tonic\",\"description\":\"Combat Transformation: Double-click to transform into a watchknight. Double-click again to end the transformation.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44720,\"icon\":\"https://render.guildwars2.com/file/5917380D6E59B749C438C1FF0D4B63A3063A6B65/575057.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44722() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minis 3-Pack (Set 2)\",\"description\":\"Double-click to receive 3 randomly selected Minis (2 common and 1 uncommon) to add to your collection.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44722,\"icon\":\"https://render.guildwars2.com/file/B3EC1FCE26A535457107990B5FCF271226E414D0/625773.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44725() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Twisted Horror\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":100,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":44725,\"icon\":\"https://render.guildwars2.com/file/C20B64DC0EA09FF3FF0FEC4139C8C7AC407BAA0E/625795.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44726() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Twisted Reaver\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":44726,\"icon\":\"https://render.guildwars2.com/file/9864A4B1F122F2AE774C3B66703F0362F035EFBC/625796.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44727() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Enraged Twisted Nightmare\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":500,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":44727,\"icon\":\"https://render.guildwars2.com/file/14A8FCE46527112F01FEB80C09D94D5202F17C04/625797.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44728() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Twisted Nightmare\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":500,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":44728,\"icon\":\"https://render.guildwars2.com/file/B5DA0F5DE6AD7675C214A76FCB5B19300DF7055B/625798.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44729() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Ice Imp\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":44729,\"icon\":\"https://render.guildwars2.com/file/0F673C1CABC8E10072B261F7E70DE97D3563EF0F/625799.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44730() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Twisted Mender\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":500,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":44730,\"icon\":\"https://render.guildwars2.com/file/B9087223F4056AE1FC992EA9242061E5B6BE76B7/625800.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}