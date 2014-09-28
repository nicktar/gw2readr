package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0043 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem13186() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Silk Gloves Padding\",\"description\":\"Used to craft Silk Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13186,\"icon\":\"https://render.guildwars2.com/file/05C3485865A5F701D3B569185851E9A7A2020B60/219623.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13187() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Silk Pants Panel\",\"description\":\"Used to craft Silk Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13187,\"icon\":\"https://render.guildwars2.com/file/06451807C117C4672CD870400CEA1C133245BCB2/219624.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13188() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Silk Pants Lining\",\"description\":\"Used to craft Silk Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13188,\"icon\":\"https://render.guildwars2.com/file/0B9BC622763263E538EF3558B9F90FF4CA077018/219625.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13189() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Silk Shoe Sole\",\"description\":\"Used to craft Silk Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13189,\"icon\":\"https://render.guildwars2.com/file/CB5E0A2608F5526F7DAA01E1271170F6AE390521/63581.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13190() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Silk Shoe Upper\",\"description\":\"Used to craft Silk Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13190,\"icon\":\"https://render.guildwars2.com/file/EC4CB4BF08E6DDEFFE0309024D7ACF1C2B50EFA6/219626.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13191() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Silk Helm Strap\",\"description\":\"Used to craft Silk Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13191,\"icon\":\"https://render.guildwars2.com/file/5CF72A453E3CE058E402E8FD73027A3E6DCEBB60/219627.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13192() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Silk Helm Padding\",\"description\":\"Used to craft Silk Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13192,\"icon\":\"https://render.guildwars2.com/file/22C9CCD8240AC1E67FD91A9C363600AE7BC2980B/219628.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13193() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Silk Epaulet Padding\",\"description\":\"Used to craft Silk Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13193,\"icon\":\"https://render.guildwars2.com/file/DF586336F851710933261196B4CD02E9C0020CC3/219629.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13194() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Silk Epaulet Panel\",\"description\":\"Used to craft Silk Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13194,\"icon\":\"https://render.guildwars2.com/file/A9C89438A42F25C501720EF6EA0EAAD540FE48FE/433691.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13195() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gossamer Coat Panel\",\"description\":\"Used to craft Gossamer Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13195,\"icon\":\"https://render.guildwars2.com/file/E1EABE691E45C47861F9D9A7FC3846013C0551F0/219630.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13196() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gossamer Coat Lining\",\"description\":\"Used to craft Gossamer Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13196,\"icon\":\"https://render.guildwars2.com/file/CC9AB54DE8C848D7290E429A030EE1089D431BC4/219631.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13197() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gossamer Gloves Panel\",\"description\":\"Used to craft Gossamer Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13197,\"icon\":\"https://render.guildwars2.com/file/4A0A2E7A0A4508E2BEAA03C061420E27A599B404/219632.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13198() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gossamer Gloves Padding\",\"description\":\"Used to craft Gossamer Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13198,\"icon\":\"https://render.guildwars2.com/file/4C2A6FCB939BFB61681BC7A0B5DADC94F4A13E0C/219633.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13199() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gossamer Pants Panel\",\"description\":\"Used to craft Gossamer Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13199,\"icon\":\"https://render.guildwars2.com/file/01CA412CB3A8CD71AA066A9D30CF2D526E6CD928/219634.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13200() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gossamer Pants Lining\",\"description\":\"Used to craft Gossamer Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13200,\"icon\":\"https://render.guildwars2.com/file/4C55BA9DB53210C91DB2F225E8FFDB1FA37C109C/219635.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13201() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gossamer Shoe Sole\",\"description\":\"Used to craft Gossamer Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13201,\"icon\":\"https://render.guildwars2.com/file/746E681DAB916F3EE511D3D27404FC03BA44129B/63583.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13202() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gossamer Shoe Upper\",\"description\":\"Used to craft Gossamer Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13202,\"icon\":\"https://render.guildwars2.com/file/22DA426DCBB6AED30803C5130E4F62B8EB740B04/219636.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13203() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gossamer Helm Strap\",\"description\":\"Used to craft Gossamer Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13203,\"icon\":\"https://render.guildwars2.com/file/604ED57C7DC45A5C796A24000DEA43C91CEBB365/219637.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13204() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gossamer Helm Padding\",\"description\":\"Used to craft Gossamer Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13204,\"icon\":\"https://render.guildwars2.com/file/ACDAC7B0D4D9597DA9C29310C77D9350A6016505/219638.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13205() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gossamer Epaulet Padding\",\"description\":\"Used to craft Gossamer Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13205,\"icon\":\"https://render.guildwars2.com/file/1CC6FDEC0D34DE96990E9305CD180A2399DF7F21/219639.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13206() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gossamer Epaulet Panel\",\"description\":\"Used to craft Gossamer Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13206,\"icon\":\"https://render.guildwars2.com/file/09EFE24607D41F0CB0A7DB7A6ACC57CF0BADCD78/433692.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13207() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rugged Boot Sole\",\"description\":\"Used to craft Rugged Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13207,\"icon\":\"https://render.guildwars2.com/file/B8F7783A2608AF3E9B1D4D9370664AB5A5AFBC5D/219640.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13208() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rugged Shoulderguard Panel\",\"description\":\"Used to craft Rugged Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13208,\"icon\":\"https://render.guildwars2.com/file/2DF8722F30DFA5E7B259FC967CB26B59C9444AF7/219641.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13209() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rugged Boot Upper\",\"description\":\"Used to craft Rugged Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13209,\"icon\":\"https://render.guildwars2.com/file/A4BAAB5F742B0D6E77A65BE8EFC006D7F0FD0BF5/219642.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13210() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rugged Longcoat Padding\",\"description\":\"Used to craft Rugged Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13210,\"icon\":\"https://render.guildwars2.com/file/18D1FF0FEB6E06BC0F097B70074AF5AB64DCDBF7/219643.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}