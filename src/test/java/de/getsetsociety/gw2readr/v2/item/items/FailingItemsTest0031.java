package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0031 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem12886() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Greatsword Hilt\",\"description\":\"Used to craft Greatswords.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12886,\"icon\":\"https://render.guildwars2.com/file/A85166AAD632176E4D30DD3E49ECE72C0A76307A/219527.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12887() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Greatsword Hilt\",\"description\":\"Used to craft Greatswords.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12887,\"icon\":\"https://render.guildwars2.com/file/06D0E99E77299B2E98DF76B69EDA0DA90809A3F7/219528.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12888() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Greatsword Hilt\",\"description\":\"Used to craft Greatswords.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12888,\"icon\":\"https://render.guildwars2.com/file/CAF35717609331E34B93090958B4C8E5041DEFE6/340030.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12889() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steel Greatsword Hilt\",\"description\":\"Used to craft Greatswords.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12889,\"icon\":\"https://render.guildwars2.com/file/0897FC4F1694BD0B9F1C1D60956BB510234452FA/219529.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12890() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Small Soft Haft\",\"description\":\"Used to craft Axes and Maces.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12890,\"icon\":\"https://render.guildwars2.com/file/6199234693C80C68786097C4FEBACD44E5ECF4F1/219530.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12891() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Small Green Haft\",\"description\":\"Used to craft Axes and Maces.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12891,\"icon\":\"https://render.guildwars2.com/file/99AE31045B08060056B6700B0F50C24428170543/219531.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12892() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Small Ancient Haft\",\"description\":\"Used to craft Axes and Maces.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12892,\"icon\":\"https://render.guildwars2.com/file/1124D9A6CB093D2662B1ED320E3EA0B20CC92214/63429.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12893() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Small Seasoned Haft\",\"description\":\"Used to craft Axes and Maces.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12893,\"icon\":\"https://render.guildwars2.com/file/01C21809DDDAAE013B320F09D124A2FBBD99EAE5/219532.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12894() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Small Elder Haft\",\"description\":\"Used to craft Axes and Maces.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12894,\"icon\":\"https://render.guildwars2.com/file/BA7E483A6D5325FFAABAC74CACE1F827D4E2AF9A/219533.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12895() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Small Hard Haft\",\"description\":\"Used to craft Axes and Maces.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12895,\"icon\":\"https://render.guildwars2.com/file/63B592CA25F6274C03DC6A09B345576248A380D7/340031.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12896() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Large Elder Haft\",\"description\":\"Used to craft Hammers and Spears.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12896,\"icon\":\"https://render.guildwars2.com/file/3F6E68F3E82126B71D4364264A347C90CEC460CF/219534.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12897() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Large Green Haft\",\"description\":\"Used to craft Hammers and Spears.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12897,\"icon\":\"https://render.guildwars2.com/file/3421230AA04F6A33DC19B42C0A3145ADCDD93302/219535.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12898() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Large Hard Haft\",\"description\":\"Used to craft Hammers and Spears.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12898,\"icon\":\"https://render.guildwars2.com/file/05DF0CE505DC7559662E52CD0D9625475AFFA3D0/340032.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12899() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Large Ancient Haft\",\"description\":\"Used to craft Hammers and Spears.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12899,\"icon\":\"https://render.guildwars2.com/file/9B74E361F06907A10FE69B024A49D290EA15FA80/63431.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12900() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Large Soft Haft\",\"description\":\"Used to craft Hammers and Spears.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12900,\"icon\":\"https://render.guildwars2.com/file/CAFAB2CA9CD81B0B0A96800D32A56CA6233F2C12/219536.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12901() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Large Seasoned Haft\",\"description\":\"Used to craft Hammers and Spears.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12901,\"icon\":\"https://render.guildwars2.com/file/067CEE56A22ED35AD4FE66C9EDDC0B76CADA7DFC/219537.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12902() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bronze Shield Backing\",\"description\":\"Used to craft Shields.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12902,\"icon\":\"https://render.guildwars2.com/file/ABA9CD076EBF6C4E077A773991DECE700D2FC0E1/63435.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12903() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darksteel Shield Backing\",\"description\":\"Used to craft Shields.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12903,\"icon\":\"https://render.guildwars2.com/file/ABA1037CAF2A55F67D5F55C3CAFC0D7EDAFE9A57/340033.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12904() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Shield Backing\",\"description\":\"Used to craft Shields.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12904,\"icon\":\"https://render.guildwars2.com/file/AB0467BF60AD551B76EC25B72B615D557C41B4CB/63436.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12905() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Shield Backing\",\"description\":\"Used to craft Shields.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12905,\"icon\":\"https://render.guildwars2.com/file/9B38C1FD7ED1D40A0B2500B17F59CC7205E9C0FF/219538.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12906() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Shield Backing\",\"description\":\"Used to craft Shields.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12906,\"icon\":\"https://render.guildwars2.com/file/B4F1D0A8125D9906DFAC27547B03362BFFC7FC2A/340034.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12907() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steel Shield Backing\",\"description\":\"Used to craft Shields.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12907,\"icon\":\"https://render.guildwars2.com/file/0A0CEFB14E727CD54ED5E75A04945115B3075BA0/63437.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12908() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bronze Shield Boss\",\"description\":\"Used to craft Shields.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12908,\"icon\":\"https://render.guildwars2.com/file/0704C62763DC019FFF2C62AE42F9CC6B0FE83FA8/63438.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12909() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darksteel Shield Boss\",\"description\":\"Used to craft Shields.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12909,\"icon\":\"https://render.guildwars2.com/file/610B0CAAD9C429067864F9CC7B242F0266F7CEC4/340035.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12910() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Shield Boss\",\"description\":\"Used to craft Shields.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12910,\"icon\":\"https://render.guildwars2.com/file/3E607D9EED075553C79150630D6FF8272A542C65/63439.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}