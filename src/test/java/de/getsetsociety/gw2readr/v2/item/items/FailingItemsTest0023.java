package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0023 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem12252() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lemon\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":12252,\"icon\":\"https://render.guildwars2.com/file/097A2EC9BAFFAAC068A504630C7DCE55ECEB6EBF/63329.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12253() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Strawberry\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":20,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12253,\"icon\":\"https://render.guildwars2.com/file/FA03EA4891609320A6CE08069EABE7F65465EC09/63330.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12254() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Raspberry\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":65,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12254,\"icon\":\"https://render.guildwars2.com/file/06BC637CD223F39DAF93B9D6FC6FA474B13F9E20/63331.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12255() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Blueberry\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":20,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12255,\"icon\":\"https://render.guildwars2.com/file/E2DA4E9B994DE9E4382B096907715FF9A2327E28/63332.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12256() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cumin\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":12256,\"icon\":\"https://render.guildwars2.com/file/A8045EC74B16C276C6FBD1705D11B0361F06B7F0/63333.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12258() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cinnamon Stick\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":1,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12258,\"icon\":\"https://render.guildwars2.com/file/4002E8D94BED056263701A92A606007443665AD7/63335.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12260() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bowl of Simple Chili Base\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":55,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12260,\"icon\":\"https://render.guildwars2.com/file/28F4ECCC96E1125E6852061B6F9F1DB59DB762E4/219417.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12261() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bowl of Cherry Pie Filling\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":45,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12261,\"icon\":\"https://render.guildwars2.com/file/BBA6094B77A5A153D538F80D2B211C0BA072313B/339894.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12262() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bowl of Grape Pie Filling\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":40,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12262,\"icon\":\"https://render.guildwars2.com/file/7CE41580B9980B02E7432B801604A048050B5BCA/339895.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12263() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ball of Cookie Dough\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":10,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12263,\"icon\":\"https://render.guildwars2.com/file/AF3F2D6F56C493802915792C02E1D4635C3E5E7C/63338.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12267() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bowl of Roux\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":25,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12267,\"icon\":\"https://render.guildwars2.com/file/99765676C755D8C0249B53A36807E90B920533A4/63341.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12268() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bowl of Cream Soup Base\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":25,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12268,\"icon\":\"https://render.guildwars2.com/file/380FF9D19DAF095FD62ACBA30D210C6C6F2C1704/63342.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12269() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bowl of Blueberry Pie Filling\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":15,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12269,\"icon\":\"https://render.guildwars2.com/file/5BDCE0F805EB5BCE90CB44C7ED6897DB2CC745CD/63343.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12270() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bowl of Chocolate Frosting\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":30,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12270,\"icon\":\"https://render.guildwars2.com/file/933BF2E505682BCD0F475D26E92E9A9C61FCADF6/63344.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12271() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bottle of Soy Sauce\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":1,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12271,\"icon\":\"https://render.guildwars2.com/file/E745C51C0D067B030A6629C80A9B08A4B0146556/63083.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12272() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pile of Divinity Fair Herbs\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":35,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12272,\"icon\":\"https://render.guildwars2.com/file/7925BA4265037EC132D9D1056A9F9D167A705C58/219419.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12275() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bottle of Sesame Ginger Sauce\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":45,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12275,\"icon\":\"https://render.guildwars2.com/file/A9FF23FB2544B52CF5726048637A13A179DE4445/63082.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12276() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pile of Paprika\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":25,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12276,\"icon\":\"https://render.guildwars2.com/file/CB2709B8BADD9CCB324219FE9ED9EA00FC25FEE1/219420.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12278() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pile of Simple Chili Seasoning\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":25,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12278,\"icon\":\"https://render.guildwars2.com/file/0438FA960EC40A4E3AEEAAF718D6DAB5C3AEC4D5/219421.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12324() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Starch\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":1,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12324,\"icon\":\"https://render.guildwars2.com/file/13282DF437062E48247991635590CF53BB340B5E/63361.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12325() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bowl of Sour Cream\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":12325,\"icon\":\"https://render.guildwars2.com/file/5F69CA226DE65B0B6C762932D4B5ECF824F12F6E/63362.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12327() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Clam\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":20,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12327,\"icon\":\"https://render.guildwars2.com/file/6C2143352D3E0B4B45A3E01CE2FAFAB8D0D77C51/63364.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12328() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ginger Root\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":12328,\"icon\":\"https://render.guildwars2.com/file/A50F4C22361F9E0E40D152422FE85312014BDCCD/63365.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12329() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Yam\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":35,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12329,\"icon\":\"https://render.guildwars2.com/file/A20171F1CF0AD20AB2C0430AF573F09ED8D4CAD3/63366.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12330() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Zucchini\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":35,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12330,\"icon\":\"https://render.guildwars2.com/file/DD9CAA539E02CA7A69A42D9398777F0FA7C30D73/63367.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}