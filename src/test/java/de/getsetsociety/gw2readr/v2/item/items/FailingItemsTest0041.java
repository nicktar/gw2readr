package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0041 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem13136() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darksteel Pauldron Casing\",\"description\":\"Used to craft Darksteel Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13136,\"icon\":\"https://render.guildwars2.com/file/CAD4299510BB983DE66948BDD3FDEBC6F5A8CC18/340112.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13137() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darksteel Boot Lining\",\"description\":\"Used to craft Darksteel Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13137,\"icon\":\"https://render.guildwars2.com/file/E2411BA50B76D0DCD0F57610B2061E734C16FD50/219580.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13138() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darksteel Chestplate Padding\",\"description\":\"Used to craft Darksteel Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13138,\"icon\":\"https://render.guildwars2.com/file/92CF2A1AD47B38515EB9C1B2A408D4CC5FFE9C96/219581.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13139() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darksteel Chestplate Panel\",\"description\":\"Used to craft Darksteel Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13139,\"icon\":\"https://render.guildwars2.com/file/06455B6CD76E28DBA93A39120D11A9FE0F9549FF/340113.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13140() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darksteel Gauntlet Lining\",\"description\":\"Used to craft Darksteel Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13140,\"icon\":\"https://render.guildwars2.com/file/B6084291EBA4619795190861EEB35516CA217E50/219582.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13141() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darksteel Gauntlet Plates\",\"description\":\"Used to craft Darksteel Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13141,\"icon\":\"https://render.guildwars2.com/file/BC63A8A81CCD5BA024230498BFE7D012240A5428/340114.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13142() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darksteel Helmet Lining\",\"description\":\"Used to craft Darksteel Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13142,\"icon\":\"https://render.guildwars2.com/file/04F6A90A7FEB75CF13FB9D64B6491A4C62AA10E5/219583.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13143() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darksteel Helmet Casing\",\"description\":\"Used to craft Darksteel Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13143,\"icon\":\"https://render.guildwars2.com/file/134DDE757EA008019921BED4C3AEE269A929B812/340115.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13144() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darksteel Legging Lining\",\"description\":\"Used to craft Darksteel Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13144,\"icon\":\"https://render.guildwars2.com/file/B2F2BFED46BA585307EBAD4424B112D06B924A99/219584.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13145() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darksteel Legging Panel\",\"description\":\"Used to craft Darksteel Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13145,\"icon\":\"https://render.guildwars2.com/file/2B223A9AD67D74423D9D2549D9C6665DF0D0E72C/340116.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13146() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darksteel Pauldron Lining\",\"description\":\"Used to craft Darksteel Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13146,\"icon\":\"https://render.guildwars2.com/file/2F019DF07D7E317C5C5D06D5DD716770F8E6300D/219585.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13147() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Boot Casing\",\"description\":\"Used to craft Mithril Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13147,\"icon\":\"https://render.guildwars2.com/file/0FC41A345C55D6CBEDFEF4E4FDD72CE260FE731C/219586.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13148() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Pauldron Casing\",\"description\":\"Used to craft Mithril Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13148,\"icon\":\"https://render.guildwars2.com/file/6E115705525A0D30EFE86D4578A66C9ACDFC0250/219587.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13149() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Boot Lining\",\"description\":\"Used to craft Mithril Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13149,\"icon\":\"https://render.guildwars2.com/file/20D8227F99A41B9F80CDB268CCD2D4C5C45E0D07/219588.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13150() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Chestplate Padding\",\"description\":\"Used to craft Mithril Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13150,\"icon\":\"https://render.guildwars2.com/file/C4F37EDF340A77CC09437B0596C7A002D5A63C45/219589.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13151() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Chestplate Panel\",\"description\":\"Used to craft Mithril Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13151,\"icon\":\"https://render.guildwars2.com/file/D0EE49F0DCD242FDEFB764CB474DB694703219A6/219590.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13152() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Gauntlet Lining\",\"description\":\"Used to craft Mithril Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13152,\"icon\":\"https://render.guildwars2.com/file/030D42D1B32FBCC27FC49124EC1DC05F0C7F4C07/219591.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13153() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Gauntlet Plates\",\"description\":\"Used to craft Mithril Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13153,\"icon\":\"https://render.guildwars2.com/file/01C04CAC16BA16D7AF68AA1BA7CA4F6B0FE9A746/219592.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13154() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Helmet Lining\",\"description\":\"Used to craft Mithril Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13154,\"icon\":\"https://render.guildwars2.com/file/FAC6D53F682C01A618B60CF6CB43D606F322EBDA/219593.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13155() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Helmet Casing\",\"description\":\"Used to craft Mithril Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13155,\"icon\":\"https://render.guildwars2.com/file/757B05E325E1710C4617CFDC3E0A2F29F8365B5E/219594.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13156() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Legging Lining\",\"description\":\"Used to craft Mithril Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13156,\"icon\":\"https://render.guildwars2.com/file/276B353272E33BE12C2B5B5FA90C5973A408E9B7/219595.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13157() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Legging Panel\",\"description\":\"Used to craft Mithril Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13157,\"icon\":\"https://render.guildwars2.com/file/5327F2763B08E96BBC469324909D73BE04A6C07B/219596.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13158() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Pauldron Lining\",\"description\":\"Used to craft Mithril Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13158,\"icon\":\"https://render.guildwars2.com/file/0DE63F30E4A9C9CB614EF7756E039B0A19D35F3B/219597.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13159() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Boot Casing\",\"description\":\"Used to craft Orichalcum Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13159,\"icon\":\"https://render.guildwars2.com/file/F17A227F7E1D6CA6797FBA93C343C95C28B1E75C/219598.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13160() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Pauldron Casing\",\"description\":\"Used to craft Orichalcum Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13160,\"icon\":\"https://render.guildwars2.com/file/599B143A48445B6251B4DE2DAB55E94297999FCA/219599.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}