package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0069 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem19797() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Resilient Jute Insignia\",\"description\":\"Used in the crafting of armor with +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19797,\"icon\":\"https://render.guildwars2.com/file/B22968264073000A5AA1DCD1AF6607EF064DE8F8/65999.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19798() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vital Jute Insignia\",\"description\":\"Used in the crafting of armor with +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19798,\"icon\":\"https://render.guildwars2.com/file/D9C006C7C771507D03F7E4B01524D764B8BEE1D0/66000.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19799() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mighty Embroidered Jute Insignia\",\"description\":\"Used in the crafting of armor with +Power.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19799,\"icon\":\"https://render.guildwars2.com/file/C3E99C0522B5057698B021CAFC090E496DA33B25/66001.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19800() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Precise Embroidered Jute Insignia\",\"description\":\"Used in the crafting of armor with +Precision.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19800,\"icon\":\"https://render.guildwars2.com/file/74F5B8C779E2987C4FC19993E5B8AF2AFB49116D/66002.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19801() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Resilient Embroidered Jute Insignia\",\"description\":\"Used in the crafting of armor with +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19801,\"icon\":\"https://render.guildwars2.com/file/FE9C2772ACA502536C32AA6B000467C506F3E39D/66003.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19802() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vital Embroidered Jute Insignia\",\"description\":\"Used in the crafting of armor with +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19802,\"icon\":\"https://render.guildwars2.com/file/2229BE5A28426722CF0CF32DFC707F77987210B0/66004.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19803() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vigorous Embroidered Wool Insignia\",\"description\":\"Used in the crafting of armor with +Power and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":17,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19803,\"icon\":\"https://render.guildwars2.com/file/9DEFFAF669D7BB264597F35EE4EB964A2A334117/220468.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19804() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vigorous Wool Insignia\",\"description\":\"Used in the crafting of armor with +Power and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19804,\"icon\":\"https://render.guildwars2.com/file/DB54985F02243B06A328E1B7B7FC55377CCE2D2A/220469.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19805() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Healing Jute Insignia\",\"description\":\"Used in the crafting of armor with +Healing Power.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19805,\"icon\":\"https://render.guildwars2.com/file/D49F664F5B27645802DF93CF46BA39050BC5FDB1/66005.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19806() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hunter's Wool Insignia\",\"description\":\"Used in the crafting of armor with +Precision and +Power.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19806,\"icon\":\"https://render.guildwars2.com/file/1BE501B999B1719E97A927493E260D7A020F1A4A/220470.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19807() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hunter's Embroidered Wool Insignia\",\"description\":\"Used in the crafting of armor with +Precision and +Power.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":17,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19807,\"icon\":\"https://render.guildwars2.com/file/E671C415716E7EBEA0F4559544C5E2E2D9963208/220471.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19808() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Strong Wool Insignia\",\"description\":\"Used in the crafting of armor with +Power and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19808,\"icon\":\"https://render.guildwars2.com/file/F89FF0F2681BF4026E0E7AFE033324A8ED4504F1/220472.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19809() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Honed Wool Insignia\",\"description\":\"Used in the crafting of armor with +Power and +Ferocity.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19809,\"icon\":\"https://render.guildwars2.com/file/A7DE44AB42FDF6EED14707060A51FD39A7189B62/220473.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19810() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Strong Embroidered Wool Insignia\",\"description\":\"Used in the crafting of armor with +Power and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":17,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19810,\"icon\":\"https://render.guildwars2.com/file/1A2996F8FD6E694B0C6FB24DB2D521FE32CAEBBF/220474.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19811() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Honed Embroidered Wool Insignia\",\"description\":\"Used in the crafting of armor with +Power and +Ferocity.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":17,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19811,\"icon\":\"https://render.guildwars2.com/file/365FEDC6F4E602F6E94D635E446D41079DBDB008/220475.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19812() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Honed Cotton Insignia\",\"description\":\"Used in the crafting of armor with +Power and +Ferocity.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":10,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19812,\"icon\":\"https://render.guildwars2.com/file/72DADAC9D333B4C1DA95D90657F32C980DC8BEB4/340436.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19813() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Strong Cotton Insignia\",\"description\":\"Used in the crafting of armor with +Power and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":10,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19813,\"icon\":\"https://render.guildwars2.com/file/CC09F313AC1E0A175F753E25B22BD927F4923154/340437.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19814() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hearty Cotton Insignia\",\"description\":\"Used in the crafting of armor with +Vitality and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":10,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19814,\"icon\":\"https://render.guildwars2.com/file/F5C4E7B49941112A4850C7633D087431FFF8930D/340438.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19815() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Strong Embroidered Cotton Insignia\",\"description\":\"Used in the crafting of armor with +Power and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19815,\"icon\":\"https://render.guildwars2.com/file/F21A359D0E77A537AC9DF3EB7A03E6C2EAB2CC0F/340439.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19816() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Honed Embroidered Cotton Insignia\",\"description\":\"Used in the crafting of armor with +Power and +Ferocity.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19816,\"icon\":\"https://render.guildwars2.com/file/28025DA31F65247A30A20AAD02DC27913FEBCE7C/340440.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19817() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hunter's Cotton Insignia\",\"description\":\"Used in the crafting of armor with +Precision and +Power.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19817,\"icon\":\"https://render.guildwars2.com/file/B2462D2436FF04D813E30AA5126818C9535F5C03/340441.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19818() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vigorous Cotton Insignia\",\"description\":\"Used in the crafting of armor with +Power and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19818,\"icon\":\"https://render.guildwars2.com/file/1B58D00B11C4EFF83ACEA95DC3B7DC6AD1B1A90D/340442.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19819() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hearty Embroidered Cotton Insignia\",\"description\":\"Used in the crafting of armor with +Vitality and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19819,\"icon\":\"https://render.guildwars2.com/file/E15F520F2B067EAE68E875FB7BBFD29CFFDFEA09/340443.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19820() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hunter's Embroidered Cotton Insignia\",\"description\":\"Used in the crafting of armor with +Precision and +Power.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19820,\"icon\":\"https://render.guildwars2.com/file/49C317A8184ADFCA20A1C01B4CD0B6F132944494/340444.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19821() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vigorous Embroidered Cotton Insignia\",\"description\":\"Used in the crafting of armor with +Power and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19821,\"icon\":\"https://render.guildwars2.com/file/C47DBC449DC4686C6DB6F9D0F5333C8047BB42E4/340445.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}