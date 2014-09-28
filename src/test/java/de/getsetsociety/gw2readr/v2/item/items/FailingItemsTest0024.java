package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0024 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem12331() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chili Pepper\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":1,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12331,\"icon\":\"https://render.guildwars2.com/file/B5BDAEC6993B1B3E315B75713B2B04D092A13335/63368.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12332() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Head of Cabbage\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":35,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12332,\"icon\":\"https://render.guildwars2.com/file/3343B0E5B72DDDC1432F4C4A629D77F5A03B269E/63369.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12333() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Kale Leaf\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":35,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12333,\"icon\":\"https://render.guildwars2.com/file/B27FE2990ADC0B65E7C5A811F9C20DB676EC3305/63370.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12334() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Portobello Mushroom\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12334,\"icon\":\"https://render.guildwars2.com/file/47F90A54375129EADD7FA1279BF391B99B4A6A56/63371.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12335() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rosemary Sprig\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":35,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12335,\"icon\":\"https://render.guildwars2.com/file/E063C45CECDC650704194C7B7B5D744E7D54E498/63372.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12336() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dill Sprig\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":35,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12336,\"icon\":\"https://render.guildwars2.com/file/94430706EA3CD40731FACAFA5AB69A74E2211CA8/219432.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12337() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Almond\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":12337,\"icon\":\"https://render.guildwars2.com/file/C00408A9C039E55934FED7C15AE9A9B60AB752E8/63374.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12338() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cherry\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":12338,\"icon\":\"https://render.guildwars2.com/file/3E57C8B86E2225E7767FCEA5E75CF5A2CB04E11A/63375.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12339() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lime\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":12339,\"icon\":\"https://render.guildwars2.com/file/CCA100FEF45DC4626893049D9B3E04763C43569D/63376.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12340() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Avocado\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":12340,\"icon\":\"https://render.guildwars2.com/file/0D1310D6AC80FCABEB01D62C3D721264BD36050E/63377.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12341() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Grape\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":35,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12341,\"icon\":\"https://render.guildwars2.com/file/D94408B9276CD9C89521E14166DCE87719676621/63378.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12342() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sesame Seed\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":35,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12342,\"icon\":\"https://render.guildwars2.com/file/CECF11E8402B34C6C1430FEB367CE0E22301457A/219433.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12350() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coconut\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":12350,\"icon\":\"https://render.guildwars2.com/file/9139EE60FBDBAFA0C39DAB7C34B8C5292B33C790/63379.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12351() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orange\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":45,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12351,\"icon\":\"https://render.guildwars2.com/file/DA6C66091D28B4DCDB16C267FB6FE4F0B2BF2D0F/63380.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12492() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sesame Seed Bun\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":40,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12492,\"icon\":\"https://render.guildwars2.com/file/AB80014DABC1A15709CCEC4E03CEC0492B6BB347/219457.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12493() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bowl of Chocolate Cherry Frosting\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":45,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12493,\"icon\":\"https://render.guildwars2.com/file/C40EAE69EF1318EF12C533CF272B943AEBC630C5/339960.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12494() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bowl of Dilled Cream Sauce\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":40,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12494,\"icon\":\"https://render.guildwars2.com/file/226BD93F5A36EEB6EFAA91B1E8BE7A6F24B6ADA3/219458.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12495() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bowl of Stirfry Base\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":25,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12495,\"icon\":\"https://render.guildwars2.com/file/A72DAC609B0F932D776B689107B8155EA9246304/219459.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12496() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pile of Stirfry Spice Mix\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":25,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12496,\"icon\":\"https://render.guildwars2.com/file/A5DA0704DC0AAB0808F93DA5DAF47BE6EDE9999E/219460.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12497() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bowl of Chocolate Raspberry Frosting\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Basic\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12497,\"icon\":\"https://render.guildwars2.com/file/A7925AACE56F1057F8770C39496B6907AACA0530/433676.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12498() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bowl of Peach Pie Filling\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Basic\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12498,\"icon\":\"https://render.guildwars2.com/file/F096185435CFF7010E6639D6E243EA7F0332DE50/433677.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12499() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bowl of Mixed Berry Pie Filling\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Basic\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12499,\"icon\":\"https://render.guildwars2.com/file/FF69CEC01E0F087AEB40474E6095607856A42A4F/433678.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12500() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bowl of Tarragon Cream Sauce\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Basic\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12500,\"icon\":\"https://render.guildwars2.com/file/549606BDC105C20C0823FF35CF00075B0A1960F2/219462.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12501() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bowl of Winter Vegetable Mix\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Basic\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12501,\"icon\":\"https://render.guildwars2.com/file/4A6A1AF864594D73E8C43ACB18EA57149523F151/433679.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12502() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Eggplant\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":12502,\"icon\":\"https://render.guildwars2.com/file/F4420E3BB6EDCE9E159816095C2E73DD2BF8FD80/219464.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}