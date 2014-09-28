package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0032 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem12911() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Shield Boss\",\"description\":\"Used to craft Shields.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12911,\"icon\":\"https://render.guildwars2.com/file/646A063293DDC536B02C0C64D83A0201DC26779B/219539.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12912() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Shield Boss\",\"description\":\"Used to craft Shields.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12912,\"icon\":\"https://render.guildwars2.com/file/2C391E0BDE5CC0E01192CC753249C6DC1B7EB57D/340036.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12913() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steel Shield Boss\",\"description\":\"Used to craft Shields.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12913,\"icon\":\"https://render.guildwars2.com/file/3B650295A53A4147D9F8A6A9B82024D2913A30F4/63440.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12914() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bronze Rifle Barrel\",\"description\":\"Used to craft Rifles.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12914,\"icon\":\"https://render.guildwars2.com/file/050AE6AAFEF69229E7C46B1829289ACF15020DBC/63441.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12915() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darksteel Rifle Barrel\",\"description\":\"Used to craft Rifles.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12915,\"icon\":\"https://render.guildwars2.com/file/6856FAFC06D0395CCAE819A3AC0557DA299FD2BE/340037.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12916() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Rifle Barrel\",\"description\":\"Used to craft Rifles.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12916,\"icon\":\"https://render.guildwars2.com/file/36BB033499ED78BD0EA507C7BE9CAA64B8BDFC52/63443.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12917() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Rifle Barrel\",\"description\":\"Used to craft Rifles.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12917,\"icon\":\"https://render.guildwars2.com/file/7EF14FEDD776037CFC26F7A03798D7F7B36443FB/219540.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12918() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Rifle Barrel\",\"description\":\"Used to craft Rifles.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12918,\"icon\":\"https://render.guildwars2.com/file/5460AEFCABD238E7D1C3761456B56B6138C59407/340038.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12919() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steel Rifle Barrel\",\"description\":\"Used to craft Rifles.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12919,\"icon\":\"https://render.guildwars2.com/file/DD6DE7677627FB2163C80467C31C9D185C6A07A8/63442.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12920() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bronze Pistol Barrel\",\"description\":\"Used to craft Pistols.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12920,\"icon\":\"https://render.guildwars2.com/file/2D09D27AF34CB697DDC26CBF18080B1ADA3D0CE4/63445.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12921() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darksteel Pistol Barrel\",\"description\":\"Used to craft Pistols.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12921,\"icon\":\"https://render.guildwars2.com/file/DF31A110E0CDD8F2984434D65720FFAA34B5F837/340039.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12922() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Pistol Barrel\",\"description\":\"Used to craft Pistols.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12922,\"icon\":\"https://render.guildwars2.com/file/F8EE9D5744FCA80B13E02E39903EB2F8DACCF4F4/63447.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12923() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Pistol Barrel\",\"description\":\"Used to craft Pistols.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12923,\"icon\":\"https://render.guildwars2.com/file/A306ED710CEE2995EE53FB056CDFF7CCF235BF9A/219541.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12924() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Pistol Barrel\",\"description\":\"Used to craft Pistols.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12924,\"icon\":\"https://render.guildwars2.com/file/396E77C5D4C0CA97F90D210534F6300AFF1D1C06/340040.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12925() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steel Pistol Barrel\",\"description\":\"Used to craft Pistols.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12925,\"icon\":\"https://render.guildwars2.com/file/E80BB6B69A019448DE3BEA2680F3DCCD0F60BFD5/63446.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12926() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bronze Warhorn Mouthpiece\",\"description\":\"Used to craft Warhorns.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12926,\"icon\":\"https://render.guildwars2.com/file/640719AE9409125C37B1E9B6B213C8A1C314C436/63449.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12927() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darksteel Warhorn Mouthpiece\",\"description\":\"Used to craft Warhorns.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12927,\"icon\":\"https://render.guildwars2.com/file/1FF7A09292BCDB0B743CC7260376FBC2C957D999/340041.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12928() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Warhorn Mouthpiece\",\"description\":\"Used to craft Warhorns.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12928,\"icon\":\"https://render.guildwars2.com/file/F9047423F06243091C9BF1D234CD93936345F00D/63451.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12929() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Warhorn Mouthpiece\",\"description\":\"Used to craft Warhorns.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12929,\"icon\":\"https://render.guildwars2.com/file/0A4C53CFB832BAEF1C497A97DB0204BF1601B450/219542.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12930() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Warhorn Mouthpiece\",\"description\":\"Used to craft Warhorns.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12930,\"icon\":\"https://render.guildwars2.com/file/1E80CD3E1BBBEC06BAF9E2BC7CFE44C6B40AB4AC/340042.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12931() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steel Warhorn Mouthpiece\",\"description\":\"Used to craft Warhorns.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12931,\"icon\":\"https://render.guildwars2.com/file/C254E9DADD7AC0B51606C266096E0D942A082CE2/63450.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12932() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bronze Horn\",\"description\":\"Used to craft Warhorns.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12932,\"icon\":\"https://render.guildwars2.com/file/090E324409203639F69652741AC50234E27557E7/63454.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12933() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darksteel Horn\",\"description\":\"Used to craft Warhorns.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12933,\"icon\":\"https://render.guildwars2.com/file/3B40BFADB5C97C650BFE15B6E70590444BCC0748/340043.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12934() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Horn\",\"description\":\"Used to craft Warhorns.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12934,\"icon\":\"https://render.guildwars2.com/file/AE51C8C930707D58262476BB462DA24E91EBAFEF/63456.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12935() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Horn\",\"description\":\"Used to craft Warhorns.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12935,\"icon\":\"https://render.guildwars2.com/file/0BC7FCAAF0F7985609B57C18A54F3606F194FF17/219543.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}