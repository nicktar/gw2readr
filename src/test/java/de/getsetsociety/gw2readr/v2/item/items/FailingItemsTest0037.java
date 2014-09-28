package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0037 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem13036() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wool Headpiece Padding\",\"description\":\"Used to craft Wool Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13036,\"icon\":\"https://render.guildwars2.com/file/47933EE232E51B0162460D15C0D733B996900EC3/63524.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13037() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wool Epaulet Padding\",\"description\":\"Used to craft Wool Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13037,\"icon\":\"https://render.guildwars2.com/file/1F4FEF6F41C299A7461763AC21D448464919D9B9/63525.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13038() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wool Epaulet Panel\",\"description\":\"Used to craft Wool Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13038,\"icon\":\"https://render.guildwars2.com/file/BE12F624DD3065F396CCC4C63879E13B0E27CDB2/63526.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13039() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cotton Coat Panel\",\"description\":\"Used to craft Cotton Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13039,\"icon\":\"https://render.guildwars2.com/file/9FB3A519607E061F1553E74B127E7CADFD0C1E2A/63527.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13040() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cotton Coat Lining\",\"description\":\"Used to craft Cotton Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13040,\"icon\":\"https://render.guildwars2.com/file/30C40BFE4DAA1E9F630557A59E75F4DC11F97C60/63528.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13041() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cotton Gloves Panel\",\"description\":\"Used to craft Cotton Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13041,\"icon\":\"https://render.guildwars2.com/file/A162CF2691E3EAE07FC6A291E7D4D83710049077/63529.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13042() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cotton Gloves Padding\",\"description\":\"Used to craft Cotton Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13042,\"icon\":\"https://render.guildwars2.com/file/F8A1387F1AA09AEE7C5BC7B20DE0B7E73D34A120/63530.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13043() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cotton Pants Panel\",\"description\":\"Used to craft Cotton Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13043,\"icon\":\"https://render.guildwars2.com/file/07F95073E6E60A61906EFC0B3432403414DDD8BE/63531.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13044() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cotton Pants Lining\",\"description\":\"Used to craft Cotton Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13044,\"icon\":\"https://render.guildwars2.com/file/3AC71717CF06CFA822C3CC0B3122E923EB30D6C1/63532.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13045() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cotton Shoe Sole\",\"description\":\"Used to craft Cotton Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13045,\"icon\":\"https://render.guildwars2.com/file/0B6616DB4C6705AB4495B394F7B8A770ED4B0FD0/63533.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13046() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cotton Shoe Upper\",\"description\":\"Used to craft Cotton Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13046,\"icon\":\"https://render.guildwars2.com/file/E6127912E1AAF4AE992EB1C20B51BBDAB9DEF265/63534.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13047() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cotton Helm Strap\",\"description\":\"Used to craft Cotton Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13047,\"icon\":\"https://render.guildwars2.com/file/D71511B2C49EF10CD970DA4A02A153DC03F7DFD2/63535.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13048() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cotton Helm Padding\",\"description\":\"Used to craft Cotton Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13048,\"icon\":\"https://render.guildwars2.com/file/FED450AAC0FA15CF6C30180CF337735EEFFD3A06/63536.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13049() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cotton Epaulet Padding\",\"description\":\"Used to craft Cotton Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13049,\"icon\":\"https://render.guildwars2.com/file/F01C0A9444E6A15262B2C104F793C2BED4E879E7/63537.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13050() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cotton Epaulet Panel\",\"description\":\"Used to craft Cotton Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13050,\"icon\":\"https://render.guildwars2.com/file/1AF308C0AA7B0577B65F9DCD04A4BFEC1B11A30A/63538.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13051() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Harpoon\",\"description\":\"Used to craft Harpoon Guns.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13051,\"icon\":\"https://render.guildwars2.com/file/97D9C8BD074BFF93491C170B152666A006961370/631171.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13052() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elder Harpoon\",\"description\":\"Used to craft Harpoon Guns.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13052,\"icon\":\"https://render.guildwars2.com/file/799166DEE62C093179B8385E796FC8015B4609D1/219572.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13053() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Green Harpoon\",\"description\":\"Used to craft Harpoon Guns.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13053,\"icon\":\"https://render.guildwars2.com/file/B1D5471BF1A2F3CAE8242E025D557B30ADB5FED7/219573.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13054() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hard Harpoon\",\"description\":\"Used to craft Harpoon Guns.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13054,\"icon\":\"https://render.guildwars2.com/file/10B971031D60490CAE441C39C90B6A43114C9CA8/340060.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13055() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Seasoned Harpoon\",\"description\":\"Used to craft Harpoon Guns.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13055,\"icon\":\"https://render.guildwars2.com/file/05099139C5C54E406EDA7C4F47F6A990231B1449/219574.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13056() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Soft Harpoon\",\"description\":\"Used to craft Harpoon Guns.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13056,\"icon\":\"https://render.guildwars2.com/file/F505CD9B1CF6FC977446E338A4A4E726E8026432/219575.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13057() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bronze Torch Head\",\"description\":\"Used to craft Torches.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13057,\"icon\":\"https://render.guildwars2.com/file/74CC2180A3354A95076248D711EF715A9339D8A9/219576.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13058() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darksteel Torch Head\",\"description\":\"Used to craft Torches.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13058,\"icon\":\"https://render.guildwars2.com/file/B6E7CC576611C4736EA9982B00956999FC3310EA/340061.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13059() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Torch Head\",\"description\":\"Used to craft Torches.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13059,\"icon\":\"https://render.guildwars2.com/file/14F406BEF9F93F33DBF0192731772DF04BCC0E99/219577.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13060() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Torch Head\",\"description\":\"Used to craft Torches.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13060,\"icon\":\"https://render.guildwars2.com/file/3766A9E64307B50B4E717809A6A2FE1841A0FA6C/219578.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}