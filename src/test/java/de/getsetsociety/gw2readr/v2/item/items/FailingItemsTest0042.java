package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0042 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem13161() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Boot Lining\",\"description\":\"Used to craft Orichalcum Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13161,\"icon\":\"https://render.guildwars2.com/file/65A1E12527732E4BACCF02130AE2C806A02EAD5F/219600.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13162() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Chestplate Padding\",\"description\":\"Used to craft Orichalcum Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13162,\"icon\":\"https://render.guildwars2.com/file/7EC04D2153AF2D06083AF204E5E1C00893CBF3DB/219601.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13163() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Chestplate Panel\",\"description\":\"Used to craft Orichalcum Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13163,\"icon\":\"https://render.guildwars2.com/file/9F3BF31868DF01D8D1D5DF9D2EF4F79BCE4C46D5/219602.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13164() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Gauntlet Lining\",\"description\":\"Used to craft Orichalcum Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13164,\"icon\":\"https://render.guildwars2.com/file/A5A3DEBA6E69B0B9C3081BB4FF3FCB929B786DCC/219603.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13165() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Gauntlet Plates\",\"description\":\"Used to craft Orichalcum Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13165,\"icon\":\"https://render.guildwars2.com/file/0CA5C4E103C202C56FE84C3A7DE10F0B12C01C44/219604.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13166() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Helmet Lining\",\"description\":\"Used to craft Orichalcum Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13166,\"icon\":\"https://render.guildwars2.com/file/BE3527D2D5B143BA0E6B110D7825AED3AE06E3DF/219605.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13167() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Helmet Casing\",\"description\":\"Used to craft Orichalcum Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13167,\"icon\":\"https://render.guildwars2.com/file/98E23622A2743AAD6FA27F377934B6C9B39BBD56/219606.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13168() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Legging Lining\",\"description\":\"Used to craft Orichalcum Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13168,\"icon\":\"https://render.guildwars2.com/file/0F110F8053F2F23034E8984A10200B09E39C7D72/219607.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13169() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Legging Panel\",\"description\":\"Used to craft Orichalcum Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13169,\"icon\":\"https://render.guildwars2.com/file/4DCA565B7430F0B226B0AD659D1AB1E0522B6702/219608.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13170() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Pauldron Lining\",\"description\":\"Used to craft Orichalcum Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13170,\"icon\":\"https://render.guildwars2.com/file/C36A73D70D150F60FBBE07DA72B46F37D9014F38/219609.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13171() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Linen Coat Panel\",\"description\":\"Used to craft Linen Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13171,\"icon\":\"https://render.guildwars2.com/file/090D28355363B5D1F7CB6908BEE92ED9419D6B08/219610.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13172() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Linen Coat Lining\",\"description\":\"Used to craft Linen Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13172,\"icon\":\"https://render.guildwars2.com/file/596302693BF74DD7CE0ADFFB6C7B1C15C62CC10C/219611.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13173() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Linen Gloves Panel\",\"description\":\"Used to craft Linen Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13173,\"icon\":\"https://render.guildwars2.com/file/9F0720F125FED56A43F4DB991BA3EF763C615C9F/219612.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13174() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Linen Gloves Padding\",\"description\":\"Used to craft Linen Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13174,\"icon\":\"https://render.guildwars2.com/file/53ED0168BEB0781ED5C59A51224B0708E14D565F/219613.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13175() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Linen Pants Panel\",\"description\":\"Used to craft Linen Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13175,\"icon\":\"https://render.guildwars2.com/file/020B40693AF3E6D6BD0BBE90080F92055B6E236F/219614.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13176() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Linen Pants Lining\",\"description\":\"Used to craft Linen Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13176,\"icon\":\"https://render.guildwars2.com/file/4FC420C5DF457C31F03A583EB8347E21DB4629EE/219615.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13177() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Linen Shoe Sole\",\"description\":\"Used to craft Linen Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13177,\"icon\":\"https://render.guildwars2.com/file/6C576C3B006BE0263D13A6AC390302510316C209/63579.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13178() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Linen Shoe Upper\",\"description\":\"Used to craft Linen Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13178,\"icon\":\"https://render.guildwars2.com/file/41A2A703DCC03BC219EC2D9709AA41595EFABB4C/219616.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13179() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Linen Helm Strap\",\"description\":\"Used to craft Linen Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13179,\"icon\":\"https://render.guildwars2.com/file/2E2B0261B301582FE7083044A9F55FF61A9E4741/219617.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13180() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Linen Helm Padding\",\"description\":\"Used to craft Linen Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13180,\"icon\":\"https://render.guildwars2.com/file/E16CA80F326D3E549D5DEC0ACEA3E06797DFCB44/219618.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13181() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Linen Epaulet Padding\",\"description\":\"Used to craft Linen Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13181,\"icon\":\"https://render.guildwars2.com/file/C630FD0E4196F2BFD00EBC1B7EF0B5240B3CA354/219619.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13182() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Linen Epaulet Panel\",\"description\":\"Used to craft Linen Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13182,\"icon\":\"https://render.guildwars2.com/file/3A0491C4531816603E2CB2D991EB3879D2E72D2D/433690.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13183() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Silk Coat Panel\",\"description\":\"Used to craft Silk Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13183,\"icon\":\"https://render.guildwars2.com/file/CC325E79C657FB41D6BC3D35197D4FD47508F422/219620.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13184() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Silk Coat Lining\",\"description\":\"Used to craft Silk Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13184,\"icon\":\"https://render.guildwars2.com/file/94B246FA62A10E2731C20D934FA6910F13A054BB/219621.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13185() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Silk Gloves Panel\",\"description\":\"Used to craft Silk Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13185,\"icon\":\"https://render.guildwars2.com/file/728021F20FCD3E9669FCE8AA1117B69D2DC348E8/219622.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}