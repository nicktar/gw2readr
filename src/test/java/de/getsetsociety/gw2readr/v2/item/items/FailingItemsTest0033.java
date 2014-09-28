package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0033 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem12936() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Horn\",\"description\":\"Used to craft Warhorns.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12936,\"icon\":\"https://render.guildwars2.com/file/A59CE52B76E43B60F70F2AD878B9BB30B70B9E32/340044.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12937() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steel Horn\",\"description\":\"Used to craft Warhorns.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12937,\"icon\":\"https://render.guildwars2.com/file/A6240BCEE64D0E684867480A04C693E1FE13DF04/63455.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12938() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elder Longbow Stave\",\"description\":\"Used to craft Longbows.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12938,\"icon\":\"https://render.guildwars2.com/file/9B7C037393E00C6022FE1F5DA0BB5FB6FBFAF36A/219544.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12939() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Green Longbow Stave\",\"description\":\"Used to craft Longbows.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12939,\"icon\":\"https://render.guildwars2.com/file/FC190B0053E5CAB7F4C1A864EC4CB051CECCEF1C/63458.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12940() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hard Longbow Stave\",\"description\":\"Used to craft Longbows.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12940,\"icon\":\"https://render.guildwars2.com/file/BD14C6E7170793DF9D06D2BE057E63ADB0200AC8/340045.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12941() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Longbow Stave\",\"description\":\"Used to craft Longbows.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12941,\"icon\":\"https://render.guildwars2.com/file/4943F4370C27E3201F4777A16BD8A77E26E0EC15/219545.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12942() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Soft Longbow Stave\",\"description\":\"Used to craft Longbows.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12942,\"icon\":\"https://render.guildwars2.com/file/65A160A239ABDB2292F59561CB1F7F5A0C430ACE/63459.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12943() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Seasoned Longbow Stave\",\"description\":\"Used to craft Longbows.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12943,\"icon\":\"https://render.guildwars2.com/file/D8BE0F2E3C2C045466BC14F2043E34D90CB207A4/219546.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12944() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elder Short-Bow Stave\",\"description\":\"Used to craft short bows.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12944,\"icon\":\"https://render.guildwars2.com/file/06A53E5F41FD74C59B1433C5D7B75ACAA897C503/219547.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12945() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Green Short-Bow Stave\",\"description\":\"Used to craft short bows.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12945,\"icon\":\"https://render.guildwars2.com/file/7560506A0956BE047C35624AA5D298AB4B72A654/63461.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12946() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hard Short-Bow Stave\",\"description\":\"Used to craft short bows.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12946,\"icon\":\"https://render.guildwars2.com/file/07FC7BF437245227A839F72A74C73F32E75D5BEE/340046.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12947() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Short-Bow Stave\",\"description\":\"Used to craft short bows.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12947,\"icon\":\"https://render.guildwars2.com/file/3CE69E48604D16F63378B34F2014DC7CB8D0DF96/219548.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12948() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Soft Short-Bow Stave\",\"description\":\"Used to craft short bows.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12948,\"icon\":\"https://render.guildwars2.com/file/DD0E3052BA69A003A03C772968D62E5A53D2AEAD/63462.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12949() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Seasoned Short-Bow Stave\",\"description\":\"Used to craft short bows.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12949,\"icon\":\"https://render.guildwars2.com/file/0A77F60E429E083CFABA9E279163A3E2E0A392B0/219549.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12950() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elder Rifle Stock\",\"description\":\"Used to craft Rifles and Harpoon Guns.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12950,\"icon\":\"https://render.guildwars2.com/file/3A18CCB30E584CD4F96B41C132073E0900D65CCB/219550.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12951() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Green Rifle Stock\",\"description\":\"Used to craft Rifles and Harpoon Guns.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12951,\"icon\":\"https://render.guildwars2.com/file/3D4509CDA6C74B0FCC01EE60E0E90449E606491C/63463.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12952() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hard Rifle Stock\",\"description\":\"Used to craft Rifles and Harpoon Guns.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12952,\"icon\":\"https://render.guildwars2.com/file/F7C0B6E6B2E9BDE6C0D8A14D63ED62D31959A307/340047.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12953() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Rifle Stock\",\"description\":\"Used to craft Rifles and Harpoon Guns.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12953,\"icon\":\"https://render.guildwars2.com/file/D6AB283CF310065EF84597211DD9046D067C3F11/340048.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12954() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Soft Rifle Stock\",\"description\":\"Used to craft Rifles and Harpoon Guns.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12954,\"icon\":\"https://render.guildwars2.com/file/32AA1AD8D093481C1C2F206DFB9BDA6FBBEE9B5E/63465.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12955() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Seasoned Rifle Stock\",\"description\":\"Used to craft Rifles and Harpoon Guns.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12955,\"icon\":\"https://render.guildwars2.com/file/14EDBD500122F226CD230616A9913477C0BA2B5D/63464.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12956() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elder Pistol Frame\",\"description\":\"Used to craft Pistols.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12956,\"icon\":\"https://render.guildwars2.com/file/59BBA39720270DD4291C5164DECE61B6550EC8A4/219551.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12957() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Green Pistol Frame\",\"description\":\"Used to craft Pistols.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12957,\"icon\":\"https://render.guildwars2.com/file/3CD6E41164782CD5527A9D294D98DC7D254A78AD/63469.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12958() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hard Pistol Frame\",\"description\":\"Used to craft Pistols.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12958,\"icon\":\"https://render.guildwars2.com/file/FEE80BE01B576DE653920C5EE300746BE82BC803/340049.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12959() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Pistol Frame\",\"description\":\"Used to craft Pistols.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12959,\"icon\":\"https://render.guildwars2.com/file/7D063E0F9AF40F7BB43218C60BD8C162D55617BF/340050.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12960() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Soft Pistol Frame\",\"description\":\"Used to craft Pistols.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12960,\"icon\":\"https://render.guildwars2.com/file/D9FCAC3507FEDFCFAD1C32A3CAD0D6EB02C05EC7/63468.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}