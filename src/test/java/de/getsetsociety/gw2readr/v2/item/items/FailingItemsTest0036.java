package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0036 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem13011() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Seasoned Torch Handle\",\"description\":\"Used to craft Torches.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13011,\"icon\":\"https://render.guildwars2.com/file/351BEF1402D10D3ED868737FA57797B6FB6B6990/219570.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13012() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hard Torch Handle\",\"description\":\"Used to craft Torches.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13012,\"icon\":\"https://render.guildwars2.com/file/F907B5B7EBC821E6A6174B78ED97963C0DF17A07/340058.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13013() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elder Torch Handle\",\"description\":\"Used to craft Torches.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13013,\"icon\":\"https://render.guildwars2.com/file/C5B3B55C5A1B21B8E44E0CFC4061AE364EDFDB90/219571.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13014() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Torch Handle\",\"description\":\"Used to craft Torches.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13014,\"icon\":\"https://render.guildwars2.com/file/0B95B4A13B583D01C250963050426B24480C0441/340059.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13015() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jute Tunic Panel\",\"description\":\"Used to craft Jute Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13015,\"icon\":\"https://render.guildwars2.com/file/2ED9193068B46520425973D20B5369C5CCED06D5/63503.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13016() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jute Tunic Lining\",\"description\":\"Used to craft Jute Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13016,\"icon\":\"https://render.guildwars2.com/file/BCBEBC4578A3F50E66D7440EA59E12F720B74856/63504.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13017() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jute Wristguard Strap\",\"description\":\"Used to craft Jute Wristguards.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13017,\"icon\":\"https://render.guildwars2.com/file/0933B3CA980E4D35D0F949515CB66EA325BF2760/63505.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13018() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jute Wristguard Padding\",\"description\":\"Used to craft Jute Wristguards.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13018,\"icon\":\"https://render.guildwars2.com/file/7DE071093828A3E03DDBEB0740C2E6E97FAB13B2/63506.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13019() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jute Breeches Panel\",\"description\":\"Used to craft Jute Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13019,\"icon\":\"https://render.guildwars2.com/file/58C349917FB40871B2E22F286C727F67117A0B09/63507.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13020() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jute Breeches Lining\",\"description\":\"Used to craft Jute Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13020,\"icon\":\"https://render.guildwars2.com/file/D9D9C71AF83ECB5C2E64ECB70B9A0C15E2E0490E/63508.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13021() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jute Sandal Upper\",\"description\":\"Used to craft Jute Sandals.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13021,\"icon\":\"https://render.guildwars2.com/file/B55680BA5F08C6CEBEF4F85EA3C5DDC00F9526CB/63509.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13022() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jute Sandal Sole\",\"description\":\"Used to craft Jute Sandals.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13022,\"icon\":\"https://render.guildwars2.com/file/D1FE762FC56295496E0FE9D34A6BBB0545C2473C/63510.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13023() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jute Headpiece Strap\",\"description\":\"Used to craft Jute Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13023,\"icon\":\"https://render.guildwars2.com/file/CB6C73BB2A5E0ECF9C359194737D59D2A006136D/63511.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13024() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jute Headpiece Padding\",\"description\":\"Used to craft Jute Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13024,\"icon\":\"https://render.guildwars2.com/file/082BF693966AA42AC509ED0A9FDB48FE35C6CEC5/63512.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13025() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jute Epaulet Padding\",\"description\":\"Used to craft Jute Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13025,\"icon\":\"https://render.guildwars2.com/file/2303F0B81A6C3D2357F60A7ADBD6FAD4CABF7868/63513.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13026() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jute Epaulet Panel\",\"description\":\"Used to craft Jute Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13026,\"icon\":\"https://render.guildwars2.com/file/97C36659E9480A080202207C0F177106994DF7EB/63514.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13027() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wool Vestments Panel\",\"description\":\"Used to craft Wool Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13027,\"icon\":\"https://render.guildwars2.com/file/BF72B6DB46083EACD5971EB5B5BC09B03B0FBB06/63515.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13028() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wool Vestments Lining\",\"description\":\"Used to craft Wool Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13028,\"icon\":\"https://render.guildwars2.com/file/062D7CECB03E421F99D6EAA76C09DDC1ADDEF94D/63516.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13029() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wool Gloves Panel\",\"description\":\"Used to craft Wool Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13029,\"icon\":\"https://render.guildwars2.com/file/0C18B23FE83E5F08BCC4EF6F54EFA65F1A3A2A7F/63517.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13030() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wool Gloves Padding\",\"description\":\"Used to craft Wool Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13030,\"icon\":\"https://render.guildwars2.com/file/261A1F6A5F505238089AD629EFE85A1724041FDF/63518.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13031() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wool Trouser Panel\",\"description\":\"Used to craft Wool Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13031,\"icon\":\"https://render.guildwars2.com/file/0233146395691FBC79AA0C13064D66E8E7024CCF/63519.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13032() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wool Trouser Lining\",\"description\":\"Used to craft Wool Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13032,\"icon\":\"https://render.guildwars2.com/file/04C8FB02F4B3BF1FA86977F79A4C056C0F3F4816/63520.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13033() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wool Footwear Sole\",\"description\":\"Used to craft Wool Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13033,\"icon\":\"https://render.guildwars2.com/file/A2F12C05FF6A1FA70809B2E8E302FBB460DA6BB3/63521.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13034() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wool Footwear Upper\",\"description\":\"Used to craft Wool Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13034,\"icon\":\"https://render.guildwars2.com/file/0EFDA21C1E80772FE0344CA54C294F03BA94FFA3/63522.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13035() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wool Headpiece Strap\",\"description\":\"Used to craft Wool Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13035,\"icon\":\"https://render.guildwars2.com/file/1F60B9A81C6B7A3A225606560E55EA4B48C8EF33/63523.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}