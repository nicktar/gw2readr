package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0034 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem12961() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Seasoned Pistol Frame\",\"description\":\"Used to craft Pistols.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12961,\"icon\":\"https://render.guildwars2.com/file/FAABDDEFF3FB2F9D2A5908774AFEFA77A9A8BEC4/219552.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12962() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thin String\",\"description\":\"Used to craft bows.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12962,\"icon\":\"https://render.guildwars2.com/file/58E3CDFDE44174228057F756A094BE1E03071FFA/219553.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12963() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hardened String\",\"description\":\"Used to craft bows.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12963,\"icon\":\"https://render.guildwars2.com/file/E72748786F3494FA777EA6540E1E4C780100BE70/340051.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12964() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rawhide String\",\"description\":\"Used to craft bows.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12964,\"icon\":\"https://render.guildwars2.com/file/5A05F0B331B8D36C0974D69FBE4EEA263172E600/63470.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12965() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rugged String\",\"description\":\"Used to craft bows.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12965,\"icon\":\"https://render.guildwars2.com/file/B12D7A0A7F6F64046F7891B2E66E3B429E61F837/219554.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12966() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thick String\",\"description\":\"Used to craft bows.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12966,\"icon\":\"https://render.guildwars2.com/file/47080065F51C93C59AFFD2634516264F3C75D7E3/219555.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12967() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coarse String\",\"description\":\"Used to craft bows.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12967,\"icon\":\"https://render.guildwars2.com/file/475D7A1DE70AF144BE635C5CE949734B4E43B95A/219556.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12968() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Green Torch Handle\",\"description\":\"Used to craft Torches.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12968,\"icon\":\"https://render.guildwars2.com/file/07150D28D69DEED5B2C7445B1171FDAA75C0EBEA/219557.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12969() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Soft Torch Handle\",\"description\":\"Used to craft Torches.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12969,\"icon\":\"https://render.guildwars2.com/file/1CDED3A263469CFC5C52F90CE8B531960214A8CC/219558.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12970() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elder Staff Shaft\",\"description\":\"Used in Staff crafting.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12970,\"icon\":\"https://render.guildwars2.com/file/1EDBB23AA4622F2B0F0AC1190CBB0944BDB39E11/219559.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12971() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Green Staff Shaft\",\"description\":\"Used in Staff crafting.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12971,\"icon\":\"https://render.guildwars2.com/file/BBAC071EDC27462AA33B62AAD1BD4141675F2A79/63474.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12972() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hard Staff Shaft\",\"description\":\"Used in Staff crafting.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12972,\"icon\":\"https://render.guildwars2.com/file/A56113A34768E8CF081ACEBCF3A12E9204B470B7/340052.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12973() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Staff Shaft\",\"description\":\"Used in Staff crafting.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12973,\"icon\":\"https://render.guildwars2.com/file/C0E1B63906DBCEE10448EC1A5113976D4304D2A3/219560.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12974() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Soft Staff Shaft\",\"description\":\"Used in Staff crafting.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12974,\"icon\":\"https://render.guildwars2.com/file/26AD049D2EA1570178FBC1F9B01711C9F580C9B9/63473.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12975() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Seasoned Staff Shaft\",\"description\":\"Used in Staff crafting.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12975,\"icon\":\"https://render.guildwars2.com/file/D3F74A2DF7CDEC63A8DEB02FD75719C1D42554F8/63475.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12976() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Scepter Rod\",\"description\":\"Used to craft Scepters.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12976,\"icon\":\"https://render.guildwars2.com/file/E47FC99121FBDF7305367EB6BDB2BB1495C170AA/219561.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12977() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elder Scepter Rod\",\"description\":\"Used to craft Scepters.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12977,\"icon\":\"https://render.guildwars2.com/file/7EAEFDE991F302CE1150482E61D3757E1EABB703/219562.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12978() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Green Scepter Rod\",\"description\":\"Used to craft Scepters.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12978,\"icon\":\"https://render.guildwars2.com/file/F4F425E82FB947C85746C222A7550FA22A02F054/63476.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12979() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hard Scepter Rod\",\"description\":\"Used to craft Scepters.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12979,\"icon\":\"https://render.guildwars2.com/file/FDFA9C50B1BECD0EC4030F1A1A32F80FD4F40BA1/340053.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12980() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Seasoned Scepter Rod\",\"description\":\"Used to craft Scepters.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12980,\"icon\":\"https://render.guildwars2.com/file/069F6EBE980A4EAD4EA9FDB77BD156C95907F40E/63479.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12981() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Soft Scepter Rod\",\"description\":\"Used to craft Scepters.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12981,\"icon\":\"https://render.guildwars2.com/file/AB01EEFED79A5CB44063C735B5564406A5CCFB48/63477.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12982() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Focus Casing\",\"description\":\"Used in Focus crafting.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12982,\"icon\":\"https://render.guildwars2.com/file/E7085905F4D8D5AA9805E966E00AC7996A6F7AFB/219563.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12983() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elder Focus Casing\",\"description\":\"Used in Focus crafting.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12983,\"icon\":\"https://render.guildwars2.com/file/F61993491202AE62CC3527675B24E9A256B06D0F/219564.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12984() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Green Focus Casing\",\"description\":\"Used in Focus crafting.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12984,\"icon\":\"https://render.guildwars2.com/file/9BB94DD605383C797E360302008057ED0607B190/219565.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12985() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hard Focus Casing\",\"description\":\"Used in Focus crafting.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12985,\"icon\":\"https://render.guildwars2.com/file/D51E4BE107A7ACDD4CF18034911C3A6AED15D9A4/340054.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}