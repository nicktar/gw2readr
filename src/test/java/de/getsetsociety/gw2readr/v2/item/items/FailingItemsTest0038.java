package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0038 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem13061() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Torch Head\",\"description\":\"Used to craft Torches.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13061,\"icon\":\"https://render.guildwars2.com/file/E64301054F52022BDA976D57E4ACB221CF4BAF73/340062.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13062() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steel Torch Head\",\"description\":\"Used to craft Torches.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13062,\"icon\":\"https://render.guildwars2.com/file/ADF5146871C3691F23C2683C2F38779FAB02B157/219579.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13063() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coarse Boot Sole\",\"description\":\"Used to craft Coarse Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13063,\"icon\":\"https://render.guildwars2.com/file/483E0B4ADE193470F3FA725AC7736C3ABF6702AB/222990.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13064() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coarse Shoulderguard Panel\",\"description\":\"Used to craft Coarse Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13064,\"icon\":\"https://render.guildwars2.com/file/D50FBD05C1074F49CAD76E6E17FAEECB16BFBCCA/223002.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13065() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coarse Boot Upper\",\"description\":\"Used to craft Coarse Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13065,\"icon\":\"https://render.guildwars2.com/file/610EAE1CE61AA7B4DC6520485FE365AEAE30A8D3/222992.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13066() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coarse Longcoat Padding\",\"description\":\"Used to craft Coarse Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13066,\"icon\":\"https://render.guildwars2.com/file/44964029C84C7F62FC1927506D07D40BE165F60A/223004.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13067() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coarse Longcoat Panel\",\"description\":\"Used to craft Coarse Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13067,\"icon\":\"https://render.guildwars2.com/file/9DA100AEFC1C00D0AE6F65A8B1C05EADF34B6902/222994.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13068() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coarse Glove Lining\",\"description\":\"Used to craft Coarse Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13068,\"icon\":\"https://render.guildwars2.com/file/701FB2DD187B9DC0A8FFE6AAACB5097797F28021/223006.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13069() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coarse Glove Panel\",\"description\":\"Used to craft Coarse Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13069,\"icon\":\"https://render.guildwars2.com/file/48C41A202D0EB2D76D05E9E2977862ACBE4BE309/222996.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13070() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coarse Goggle Padding\",\"description\":\"Used to craft Coarse Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13070,\"icon\":\"https://render.guildwars2.com/file/A84BB5C1B280610096799BDE0C107AC7D8E807DF/223010.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13071() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coarse Goggle Strap\",\"description\":\"Used to craft Coarse Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13071,\"icon\":\"https://render.guildwars2.com/file/C31C9AC52DB85DB9E0083D24CFD3EDC9A3A6FF57/223000.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13072() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coarse Trouser Padding\",\"description\":\"Used to craft Coarse Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13072,\"icon\":\"https://render.guildwars2.com/file/751717D727E00B4DD750544A7423E2DC0F22A4A7/223008.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13073() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coarse Trouser Panel\",\"description\":\"Used to craft Coarse Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13073,\"icon\":\"https://render.guildwars2.com/file/6D5FB901DAC6B3E164F4BA11763AA5D8D899327E/222998.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13074() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coarse Shoulderguard Padding\",\"description\":\"Used to craft Coarse Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13074,\"icon\":\"https://render.guildwars2.com/file/D435AFF0D7D1D566B0D61E00FEDA1CC57EE2303C/223012.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13075() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thin Boot Sole\",\"description\":\"Used to craft Thin Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13075,\"icon\":\"https://render.guildwars2.com/file/AA077A3AFC1A4466B50210337C0A03DCE31F004C/223014.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13076() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thin Glove Strap\",\"description\":\"Used to craft Thin Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13076,\"icon\":\"https://render.guildwars2.com/file/70E91C07E36C950DFE5174DA56A0A0DDA8FD180F/223020.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13077() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thin Shoulderguard Panel\",\"description\":\"Used to craft Thin Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13077,\"icon\":\"https://render.guildwars2.com/file/45FCF898B2791CF00FF96E64F99D38C5AACA5D0F/223026.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13078() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thin Boot Upper\",\"description\":\"Used to craft Thin Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13078,\"icon\":\"https://render.guildwars2.com/file/DED7CDEE3305CD50FE13B64C1FCDE89C09D4DC4B/223016.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13079() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thin Jerkin Padding\",\"description\":\"Used to craft Thin Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13079,\"icon\":\"https://render.guildwars2.com/file/C0B86039E3CEE1546D04065CCEF32F5FA8185308/223028.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13080() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thin Jerkin Panel\",\"description\":\"Used to craft Thin Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13080,\"icon\":\"https://render.guildwars2.com/file/0F545E4E2F2243A4A1996360BCAA45F368E303EB/223018.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13081() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thin Glove Lining\",\"description\":\"Used to craft Thin Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13081,\"icon\":\"https://render.guildwars2.com/file/3D1B9B1BC501DC619CFB0855CA070BAA130AF824/223030.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13082() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thin Mask Panel\",\"description\":\"Used to craft Thin Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13082,\"icon\":\"https://render.guildwars2.com/file/2B2B75775C499A3829C7CDBE0DB0E47FEE5A3B4F/223034.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13083() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thin Mask Strap\",\"description\":\"Used to craft Thin Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13083,\"icon\":\"https://render.guildwars2.com/file/D55564DBF616CBB9E8D907CF6CC96378CF659477/223024.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13084() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thin Legging Padding\",\"description\":\"Used to craft Thin Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13084,\"icon\":\"https://render.guildwars2.com/file/9AF41802E276933CF44CBC501AEE12607A28EC04/223032.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13085() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thin Legging Panel\",\"description\":\"Used to craft Thin Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13085,\"icon\":\"https://render.guildwars2.com/file/9B98C59939A953300E9F720366E73A465B4F0618/223022.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}