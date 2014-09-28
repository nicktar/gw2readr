package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0045 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem13236() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hardened Glove Lining\",\"description\":\"Used to craft Hardened Leather Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13236,\"icon\":\"https://render.guildwars2.com/file/0963F10FEF17A0C3C50A60A72C62943F1E6A0AF4/219669.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13237() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hardened Glove Panel\",\"description\":\"Used to craft Hardened Leather Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13237,\"icon\":\"https://render.guildwars2.com/file/DE997D1A0601107B3E7C505F99D9FAD90197DDD9/219670.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13238() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hardened Helmet Padding\",\"description\":\"Used to craft Hardened Leather Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13238,\"icon\":\"https://render.guildwars2.com/file/E04A134C492F9223C94AE3A0AAA758DB347213C2/219671.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13239() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hardened Helmet Strap\",\"description\":\"Used to craft Hardened Leather Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13239,\"icon\":\"https://render.guildwars2.com/file/7C9A5ED5457B5AB422AD1E9D685BF2615CDE0A0E/219672.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13240() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hardened Trouser Padding\",\"description\":\"Used to craft Hardened Leather Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13240,\"icon\":\"https://render.guildwars2.com/file/5E08503FE500B6FF40130D08E2DEE7D15006D11F/219673.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13241() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hardened Trouser Panel\",\"description\":\"Used to craft Hardened Leather Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13241,\"icon\":\"https://render.guildwars2.com/file/2BB9C122C4986962AAECAF95632DE426F8D1C8D3/219674.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13242() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hardened Shoulderguard Padding\",\"description\":\"Used to craft Hardened Leather Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13242,\"icon\":\"https://render.guildwars2.com/file/26A071BAC34105B0BEA7A8F350D5CBD3041FEA93/219675.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13243() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Focus Core\",\"description\":\"Used in Focus crafting.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13243,\"icon\":\"https://render.guildwars2.com/file/4DADB912776910321206370E92A079CF287B7DD2/219676.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13244() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elder Focus Core\",\"description\":\"Used in Focus crafting.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13244,\"icon\":\"https://render.guildwars2.com/file/241355A6E364CD96630A04ABD390F67827E2996F/219677.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13245() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Green Focus Core\",\"description\":\"Used in Focus crafting.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13245,\"icon\":\"https://render.guildwars2.com/file/7FB40D645D2F3B33FF24A40908089559115DB394/219678.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13246() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hard Focus Core\",\"description\":\"Used in Focus crafting.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13246,\"icon\":\"https://render.guildwars2.com/file/59B3CFE2C149F6104A6D0C4499C5FB03951762DF/219679.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13247() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Seasoned Focus Core\",\"description\":\"Used in Focus crafting.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13247,\"icon\":\"https://render.guildwars2.com/file/FA0B2B175DE4D49C14453A2C33FD3F72C0793C47/219680.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13248() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Soft Focus Core\",\"description\":\"Used in Focus crafting.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13248,\"icon\":\"https://render.guildwars2.com/file/3B0266CBD2783615D4EF71099A39900720BEB659/219681.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13249() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Green Trident Shaft\",\"description\":\"Used to craft Tridents.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13249,\"icon\":\"https://render.guildwars2.com/file/E5752827E6C43F56C2A0380225960202B78014A2/222900.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13250() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hard Trident Shaft\",\"description\":\"Used to craft Tridents.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13250,\"icon\":\"https://render.guildwars2.com/file/9D3AF148B92EF6F603080AA5F6B8A330519529F9/340117.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13251() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Soft Trident Shaft\",\"description\":\"Used to craft Tridents.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13251,\"icon\":\"https://render.guildwars2.com/file/3902F89E59077B996E0A9AAD9ADABED1A82A952A/219682.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13252() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elder Trident Shaft\",\"description\":\"Used to craft Tridents.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13252,\"icon\":\"https://render.guildwars2.com/file/90FB6C230BEF35FDB7C6D20EB4D3B7A63E40A8D9/219683.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13253() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Trident Shaft\",\"description\":\"Used to craft Tridents.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13253,\"icon\":\"https://render.guildwars2.com/file/0B776B5F6C38B01E2510C574BB551B18C1ACAFBD/219684.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13254() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Seasoned Trident Shaft\",\"description\":\"Used to craft Tridents.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13254,\"icon\":\"https://render.guildwars2.com/file/0E92AFC00A4DE8CD404A0729E7220F7EBDD9F396/219685.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13255() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Scepter Core\",\"description\":\"Used to craft Scepters.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13255,\"icon\":\"https://render.guildwars2.com/file/AD0C90FEEAD2A4FC660FB932C407DBF6485D190B/219686.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13256() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elder Scepter Core\",\"description\":\"Used to craft Scepters.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13256,\"icon\":\"https://render.guildwars2.com/file/E670C3B52BC52EAEFE6C0FEFE7DB209E0657253C/219687.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13257() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Green Scepter Core\",\"description\":\"Used to craft Scepters.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13257,\"icon\":\"https://render.guildwars2.com/file/4F6047AD3CCFD994D569C073CA98CF751206F8AD/219688.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13258() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hard Scepter Core\",\"description\":\"Used to craft Scepters.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13258,\"icon\":\"https://render.guildwars2.com/file/36FB9D05D85E0BD9305CC76A074E0E441CB372C0/340118.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13259() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Seasoned Scepter Core\",\"description\":\"Used to craft Scepters.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13259,\"icon\":\"https://render.guildwars2.com/file/996819F0CCEB6CAD350E0A5FB10E0924DB13E2DC/219689.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13260() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Soft Scepter Core\",\"description\":\"Used to craft Scepters.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13260,\"icon\":\"https://render.guildwars2.com/file/DCB77C7FF10410ACF89D60B230220A6C3B6B1824/219690.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}