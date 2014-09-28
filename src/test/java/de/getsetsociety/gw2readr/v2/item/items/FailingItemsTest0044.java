package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0044 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem13211() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rugged Longcoat Panel\",\"description\":\"Used to craft Rugged Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13211,\"icon\":\"https://render.guildwars2.com/file/586EF85F41B337575D3274D49D2462550715C9AC/219644.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13212() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rugged Glove Lining\",\"description\":\"Used to craft Rugged Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13212,\"icon\":\"https://render.guildwars2.com/file/63442832A33AA104DEEA6DAA3D5E5AE96AF411FA/219645.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13213() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rugged Glove Panel\",\"description\":\"Used to craft Rugged Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13213,\"icon\":\"https://render.guildwars2.com/file/74FC43ABECB704F90707DC1CD090FB055BE499AD/219646.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13214() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rugged Goggle Padding\",\"description\":\"Used to craft Rugged Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13214,\"icon\":\"https://render.guildwars2.com/file/41071F0BDDF4AA40FECDAFD904BF32FD6708F559/219647.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13215() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rugged Goggle Strap\",\"description\":\"Used to craft Rugged Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13215,\"icon\":\"https://render.guildwars2.com/file/40633F0AAB72CE14D3551204502C010FE43203D8/219648.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13216() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rugged Trouser Padding\",\"description\":\"Used to craft Rugged Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13216,\"icon\":\"https://render.guildwars2.com/file/D263A4FB23CF50941F132A5912C4A608B7DFCE06/219649.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13217() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rugged Trouser Panel\",\"description\":\"Used to craft Rugged Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13217,\"icon\":\"https://render.guildwars2.com/file/1E1FA26E2FFC03A5CE0AD5A8D9E15E759BC46276/219650.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13218() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rugged Shoulderguard Padding\",\"description\":\"Used to craft Rugged Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13218,\"icon\":\"https://render.guildwars2.com/file/D4F738FB795D0DB0D67C5776127F48E090AF99F2/219651.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13219() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thick Boot Sole\",\"description\":\"Used to craft Thick Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13219,\"icon\":\"https://render.guildwars2.com/file/4ED90D0AAE9F744BC37D3C0A575AA212F4A13BB4/219652.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13220() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thick Shoulderguard Panel\",\"description\":\"Used to craft Thick Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13220,\"icon\":\"https://render.guildwars2.com/file/465F059A0B99B144CCEB07756F55F2B197CEDAC4/219653.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13221() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thick Boot Upper\",\"description\":\"Used to craft Thick Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13221,\"icon\":\"https://render.guildwars2.com/file/5A06027994F9A501EAC234B64E09011504ABD19C/219654.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13222() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thick Longcoat Padding\",\"description\":\"Used to craft Thick Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13222,\"icon\":\"https://render.guildwars2.com/file/D5083BB33CE6154FB8E66CD61C05AFE63165BD32/219655.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13223() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thick Longcoat Panel\",\"description\":\"Used to craft Thick Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13223,\"icon\":\"https://render.guildwars2.com/file/92C8B2267279EAC166FD5D09E0E31FC6EAB60276/219656.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13224() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thick Glove Lining\",\"description\":\"Used to craft Thick Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13224,\"icon\":\"https://render.guildwars2.com/file/0999E92958EB80F5E8C808CA7B0CAAA7C8E26AEC/219657.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13225() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thick Glove Panel\",\"description\":\"Used to craft Thick Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13225,\"icon\":\"https://render.guildwars2.com/file/6ECA25C1577CDDFC9AEDEBFF71165905FFC1EB3B/219658.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13226() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thick Mask Padding\",\"description\":\"Used to craft Thick Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13226,\"icon\":\"https://render.guildwars2.com/file/CA24700519907C42CEEC76D8460C9CFDA0C302A9/219659.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13227() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thick Mask Strap\",\"description\":\"Used to craft Thick Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13227,\"icon\":\"https://render.guildwars2.com/file/1531DAB2240A9C7CE9AFF97669053027CF994CA3/219660.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13228() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thick Trouser Padding\",\"description\":\"Used to craft Thick Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13228,\"icon\":\"https://render.guildwars2.com/file/74A2C1D1A110010AAD09EB1B2A0216C2C7C24A5D/219661.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13229() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thick Trouser Panel\",\"description\":\"Used to craft Thick Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13229,\"icon\":\"https://render.guildwars2.com/file/327D32E6FD0A4DE64A7F14D39924C751D7656FC1/219662.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13230() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thick Shoulderguard Padding\",\"description\":\"Used to craft Thick Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13230,\"icon\":\"https://render.guildwars2.com/file/58385CD50BCA09EF9908370A1A126CAC26A23902/219663.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13231() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hardened Boot Sole\",\"description\":\"Used to craft Hardened Leather Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13231,\"icon\":\"https://render.guildwars2.com/file/DFA36C6D9E7650C75D01C5B523D74334DBD9B751/219664.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13232() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hardened Shoulderguard Panel\",\"description\":\"Used to craft Hardened Leather Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13232,\"icon\":\"https://render.guildwars2.com/file/FB926012044BF50C6AE52CD2BD64690C4D3472DC/219665.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13233() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hardened Boot Upper\",\"description\":\"Used to craft Hardened Leather Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13233,\"icon\":\"https://render.guildwars2.com/file/76D4602745F0DBEA44ECBB3A2B17C13A55B80634/219666.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13234() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hardened Longcoat Padding\",\"description\":\"Used to craft Hardened Leather Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13234,\"icon\":\"https://render.guildwars2.com/file/52D809DF22D37BB142B2B5C109615A53B2C7BD56/219667.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13235() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hardened Longcoat Panel\",\"description\":\"Used to craft Hardened Leather Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13235,\"icon\":\"https://render.guildwars2.com/file/55030E49337D290DC15A4BE251AEE9616140949D/219668.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}