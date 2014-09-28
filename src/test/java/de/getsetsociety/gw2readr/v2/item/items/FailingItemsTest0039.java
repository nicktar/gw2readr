package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0039 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem13086() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thin Shoulderguard Padding\",\"description\":\"Used to craft Thin Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13086,\"icon\":\"https://render.guildwars2.com/file/F895C3270D789FD01229487623D4726EC6B2EDE2/223036.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13087() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rawhide Legging Strap\",\"description\":\"Used to craft Rawhide Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13087,\"icon\":\"https://render.guildwars2.com/file/020301659BB8311CBCFFE7080FE51F0D1D987F57/63546.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13088() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rawhide Legging Panel\",\"description\":\"Used to craft Rawhide Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13088,\"icon\":\"https://render.guildwars2.com/file/03492BBEE45A5EFAFCCD4B42D0200D92939C93DB/63547.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13089() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rawhide Mask Padding\",\"description\":\"Used to craft Rawhide Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13089,\"icon\":\"https://render.guildwars2.com/file/439A2BD7DE77F2F136E934F524C5201A35F0EC08/63548.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13090() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rawhide Mask Strap\",\"description\":\"Used to craft Rawhide Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13090,\"icon\":\"https://render.guildwars2.com/file/1E13B034BC49ABB1AE39D8BF0CCC43FBF14C2F95/63549.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13091() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rawhide Boot Upper\",\"description\":\"Used to craft Rawhide Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13091,\"icon\":\"https://render.guildwars2.com/file/59F50BBCBE55A41344B5970E07B0F9DF4CE6092E/63550.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13092() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rawhide Shoulderguard Padding\",\"description\":\"Used to craft Rawhide Shoulderguards.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13092,\"icon\":\"https://render.guildwars2.com/file/040A2715D7A4E571090B2BE7ED407A0F037E4822/63551.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13093() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rawhide Chestguard Padding\",\"description\":\"Used to craft Rawhide Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13093,\"icon\":\"https://render.guildwars2.com/file/9A4E1725B74F0B1F050A3D4CA42B0435ED533F41/63552.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13094() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rawhide Chestguard Panel\",\"description\":\"Used to craft Rawhide Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13094,\"icon\":\"https://render.guildwars2.com/file/0412F11A3049DF7150CEB8DCD590E9A0CB03EE4E/63553.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13095() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rawhide Glove Lining\",\"description\":\"Used to craft Rawhide Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13095,\"icon\":\"https://render.guildwars2.com/file/1A672E5BD9A3616170E995E61E804C0BA5DF7D73/63554.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13096() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rawhide Boot Sole\",\"description\":\"Used to craft Rawhide Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13096,\"icon\":\"https://render.guildwars2.com/file/C9C1EC39361F2A070AB190F060C2BCB717EFDB31/63555.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13097() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rawhide Shoulderguard Panel\",\"description\":\"Used to craft Rawhide Shoulderguards.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13097,\"icon\":\"https://render.guildwars2.com/file/9C247B027165DE4F77F63E6ECE9B71A560E59AB2/63556.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13098() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rawhide Glove Strap\",\"description\":\"Used to craft Rawhide Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13098,\"icon\":\"https://render.guildwars2.com/file/282EA7C857917ADDB904F0A1121A601F0B07FDCA/63557.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13099() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bronze Chain Legging Lining\",\"description\":\"Used to craft Bronze Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13099,\"icon\":\"https://render.guildwars2.com/file/E2B001D3F32C6EBBA1A721E5FE9F94AA61B9EC25/63558.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13100() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bronze Chain Leggings Panel\",\"description\":\"Used to craft Bronze Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13100,\"icon\":\"https://render.guildwars2.com/file/317D4D9D7C761A3708F6027AE008A06F7432BC92/63559.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13101() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bronze Helmet Lining\",\"description\":\"Used to craft Bronze Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13101,\"icon\":\"https://render.guildwars2.com/file/09AAF8D6EE71DD991114C5E34550AB3457DAE238/63560.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13102() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bronze Helmet Casing\",\"description\":\"Used to craft Bronze Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13102,\"icon\":\"https://render.guildwars2.com/file/305F0EF518FDECE9DF0648B6A0919CA672430F58/63561.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13103() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bronze Chain Boot Lining\",\"description\":\"Used to craft Bronze Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13103,\"icon\":\"https://render.guildwars2.com/file/DAC47618A825CC2CD5B740971F9ED5A2C5D8E1AC/63562.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13104() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bronze Pauldron Lining\",\"description\":\"Used to craft Bronze Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13104,\"icon\":\"https://render.guildwars2.com/file/78431C22E259662A320710151407F633DF6DC673/63563.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13105() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bronze Chain Chest Padding\",\"description\":\"Used to craft Bronze Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13105,\"icon\":\"https://render.guildwars2.com/file/6BAF210FE3193B7C443E7ECC0DEFDF5B0AA3ED31/63564.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13106() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bronze Chain Chest Panel\",\"description\":\"Used to craft Bronze Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13106,\"icon\":\"https://render.guildwars2.com/file/E368CBB903ECF6F1EEFE63FE09F390C74A776438/63565.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13107() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bronze Chain Glove Lining\",\"description\":\"Used to craft Bronze Gauntlets.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13107,\"icon\":\"https://render.guildwars2.com/file/3C2098AAC0FAABFF0937DAE6FA05DA1D060E70C2/63566.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13108() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bronze Chain Boot Panel\",\"description\":\"Used to craft Bronze Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13108,\"icon\":\"https://render.guildwars2.com/file/2727FC67F9E50F1B11A52DAA00D49A23C205B860/63567.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13109() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bronze Pauldron Casing\",\"description\":\"Used to craft Bronze Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13109,\"icon\":\"https://render.guildwars2.com/file/A4BADC3B09A2C13102FBA91E0A61E12CCF7C17EE/63568.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13110() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bronze Chain Glove Panel\",\"description\":\"Used to craft Bronze Gauntlets.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13110,\"icon\":\"https://render.guildwars2.com/file/B0FDA20458DF08AE1E1E22EF9ED998230F0DC570/63569.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}