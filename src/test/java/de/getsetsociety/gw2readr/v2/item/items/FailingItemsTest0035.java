package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0035 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem12986() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Seasoned Focus Casing\",\"description\":\"Used in Focus crafting.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12986,\"icon\":\"https://render.guildwars2.com/file/EE071A360E9E6CC62572370F51F3A62EF44642D3/66425.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12987() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Soft Focus Casing\",\"description\":\"Used in Focus crafting.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12987,\"icon\":\"https://render.guildwars2.com/file/36B3BB3A1C6CA3EC2B72D21E7D78A2373335E0AF/219566.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12988() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Plated Dowel\",\"description\":\"Used to craft Inscriptions which are used in weapon crafting.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":29,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12988,\"icon\":\"https://render.guildwars2.com/file/4703A1CA2C61B002212E3D5A960C35BE13B5CF3B/455580.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12989() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Plated Dowel\",\"description\":\"Used to craft Inscriptions which are used in weapon crafting.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":25,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12989,\"icon\":\"https://render.guildwars2.com/file/D3EB5FDAACAD7709D9082E281055C4905BF3CAE4/455581.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12990() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bronze Plated Dowel\",\"description\":\"Used to craft Inscriptions which are used in weapon crafting.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12990,\"icon\":\"https://render.guildwars2.com/file/1A34B1613F19C19997F40295A37E5AD902BB0F31/63487.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12991() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darksteel Plated Dowel\",\"description\":\"Used to craft Inscriptions which are used in weapon crafting.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12991,\"icon\":\"https://render.guildwars2.com/file/E5694EE45C1A274B5AB6B3AFFC2091627069A269/455582.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12992() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steel Plated Dowel\",\"description\":\"Used to craft Inscriptions which are used in weapon crafting.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":15,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12992,\"icon\":\"https://render.guildwars2.com/file/D87B1BB6BE69A3B90FBFD0D8E9AC5F0861FB7DF8/63489.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12993() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Plated Dowel\",\"description\":\"Used to craft Inscriptions which are used in weapon crafting.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12993,\"icon\":\"https://render.guildwars2.com/file/927F24D0166FAB44575AE04A6E360D02435F3559/63490.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12994() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bronze Spear Head\",\"description\":\"Used to craft Spears.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12994,\"icon\":\"https://render.guildwars2.com/file/050067F90FDF30567B1A4A9A15301214DDA536DF/63491.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12995() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darksteel Spear Head\",\"description\":\"Used to craft Spears.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12995,\"icon\":\"https://render.guildwars2.com/file/F141E30707964A5AB0C759211C9036D52AA3F097/340055.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12996() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Spear Head\",\"description\":\"Used to craft Spears.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12996,\"icon\":\"https://render.guildwars2.com/file/B2220E4D55E716CBC2B9D0B17EA84FD45341083F/63492.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12997() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Spear Head\",\"description\":\"Used to craft Spears.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12997,\"icon\":\"https://render.guildwars2.com/file/B9A4F064FF5D79F3523A05BAC254924106069850/219567.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12998() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Spear Head\",\"description\":\"Used to craft Spears.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12998,\"icon\":\"https://render.guildwars2.com/file/CDFD78B9F041170D6ABA47042ABDB448BC276C2D/340056.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12999() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steel Spear Head\",\"description\":\"Used to craft Spears.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12999,\"icon\":\"https://render.guildwars2.com/file/B22F29955EFA153A3C6A05222C5F9509BD47AFAD/63493.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13000() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bronze Trident Head\",\"description\":\"Used to craft Tridents.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13000,\"icon\":\"https://render.guildwars2.com/file/9498D20ACAD065EA9848264A42CDCDF4271D0B62/63494.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13001() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darksteel Trident Head\",\"description\":\"Used to craft Tridents.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13001,\"icon\":\"https://render.guildwars2.com/file/021474D3637A4995065EE5403DC216265B62FD6B/340057.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13002() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Trident Head\",\"description\":\"Used to craft Tridents.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13002,\"icon\":\"https://render.guildwars2.com/file/35DC44DA6F3B1B804F08AE39337C77E5FA6CF33F/63496.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13003() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Trident Head\",\"description\":\"Used to craft Tridents.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13003,\"icon\":\"https://render.guildwars2.com/file/6A470004D34E5D95F707E3D548665A2D79A50EA9/219568.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13004() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Trident Head\",\"description\":\"Used to craft Tridents.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13004,\"icon\":\"https://render.guildwars2.com/file/06AD512FB09C9F0F4AEDBF2E6A086D2D56D5572C/219569.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13005() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steel Trident Head\",\"description\":\"Used to craft Tridents.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13005,\"icon\":\"https://render.guildwars2.com/file/A5B9B54CDD4E0CB543B74DC2313F655269E50693/63495.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13006() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of Holding\",\"description\":\"Used to craft 12 slot bags, boxes, and packs.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":185,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13006,\"icon\":\"https://render.guildwars2.com/file/C7F70E23C60990209605F33E1ED3ACCEB04FBFAF/63498.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13007() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of Holding\",\"description\":\"Used to craft 15 slot bags, boxes, and packs.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":625,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13007,\"icon\":\"https://render.guildwars2.com/file/051B0A6DBD797D6D9CC1DFFA28F197DB05322D2B/63499.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13008() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Greater Rune of Holding\",\"description\":\"Used to craft 18 slot bags, boxes, and packs.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":2500,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13008,\"icon\":\"https://render.guildwars2.com/file/2C591D0C7FF702983FC8290FBBF750EA9C4A9292/63500.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13009() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of Holding\",\"description\":\"Used to craft 20 slot bags, boxes, and packs.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":12500,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13009,\"icon\":\"https://render.guildwars2.com/file/CFA856D1EE9F01056490EE1CD2C637C2C1C5CBA6/63501.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13010() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of Holding\",\"description\":\"Used to craft 10-slot bags, boxes, and packs.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":62,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13010,\"icon\":\"https://render.guildwars2.com/file/F6BEB9FE9A7008900EF4B59106A504D3DCD94121/63502.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}