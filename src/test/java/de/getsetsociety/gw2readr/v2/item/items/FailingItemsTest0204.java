package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0204 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem45863() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elonian Trouser Padding\",\"description\":\"Used to craft Elonian Leather Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45863,\"icon\":\"https://render.guildwars2.com/file/79D1F902E6EA35A31DE6BE930C51C035ED9D516C/699249.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45864() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elonian Boot Sole\",\"description\":\"Used to craft Elonian Leather Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45864,\"icon\":\"https://render.guildwars2.com/file/1C0F4AF102404D150229CAC251D04E19085D02F8/699250.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45865() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elonian Boot Upper\",\"description\":\"Used to craft Elonian Leather Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45865,\"icon\":\"https://render.guildwars2.com/file/57C9099E7C305FF669B1E1CBE6B7296E1299C9F3/699251.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45866() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elonian Glove Panel\",\"description\":\"Used to craft Elonian Leather Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45866,\"icon\":\"https://render.guildwars2.com/file/E2252C1B390E96C1A50B64CC24DB04350A06EF33/699252.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45867() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elonian Helmet Strap\",\"description\":\"Used to craft Elonian Leather Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45867,\"icon\":\"https://render.guildwars2.com/file/6BF065E37E9C75063B50257EA44D1AD308460E96/699253.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45868() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elonian Longcoat Panel\",\"description\":\"Used to craft Elonian Leather Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45868,\"icon\":\"https://render.guildwars2.com/file/C063C549D2FD735D7AA3537F4DAEEDBB0F940670/699254.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45869() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elonian Shoulderguard Panel\",\"description\":\"Used to craft Elonian Leather Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45869,\"icon\":\"https://render.guildwars2.com/file/A5D6E4BC33B30F39014CD80DEBD6A2DD109B4CBE/699255.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45870() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elonian Trouser Panel\",\"description\":\"Used to craft Elonian Leather Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45870,\"icon\":\"https://render.guildwars2.com/file/93F7285BD7090C671EE360A76DA3DB31E49B1E65/699256.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45871() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deldrimor Steel Boot Lining\",\"description\":\"Used to craft Deldrimor Steel Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45871,\"icon\":\"https://render.guildwars2.com/file/ACFF281E5F303662FCA067B814C70A2207B0E2FD/699257.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45872() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deldrimor Steel Chestplate Padding\",\"description\":\"Used to craft Deldrimor Steel Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45872,\"icon\":\"https://render.guildwars2.com/file/442714D3EF4701F290D703C7AC299F355521DC0C/699258.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45873() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deldrimor Steel Gauntlet Lining\",\"description\":\"Used to craft Deldrimor Steel Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45873,\"icon\":\"https://render.guildwars2.com/file/9E4958CA14983004B378DA2643913D4C5EBCE676/699259.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45874() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deldrimor Steel Helmet Lining\",\"description\":\"Used to craft Deldrimor Steel Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45874,\"icon\":\"https://render.guildwars2.com/file/4630CEC57F470EA075D6203872979B9792CC2FCD/699260.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45875() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deldrimor Steel Legging Lining\",\"description\":\"Used to craft Deldrimor Steel Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45875,\"icon\":\"https://render.guildwars2.com/file/FD2B12FCBF45909F45A0F871D99614E032C73209/699261.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45876() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deldrimor Steel Pauldron Lining\",\"description\":\"Used to craft Deldrimor Steel Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45876,\"icon\":\"https://render.guildwars2.com/file/2D4DE3B02A0DB7A86560DA48DFBF54337D4D05C6/699262.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45877() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deldrimor Steel Boot Casing\",\"description\":\"Used to craft Deldrimor Steel Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45877,\"icon\":\"https://render.guildwars2.com/file/7844451CF966AAF65AAAF651DF0A5C23781A0690/699263.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45878() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deldrimor Steel Chestplate Panel\",\"description\":\"Used to craft Deldrimor Steel Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45878,\"icon\":\"https://render.guildwars2.com/file/E916ED787BD1EFE1FE05AC0A0CBF014A6E067DB0/699264.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45879() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deldrimor Steel Gauntlet Plates\",\"description\":\"Used to craft Deldrimor Steel Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45879,\"icon\":\"https://render.guildwars2.com/file/0BDA76BF17D9F89D55C6D0F071B5B0C5EF0B0B5E/699265.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45880() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deldrimor Steel Helmet Casing\",\"description\":\"Used to craft Deldrimor Steel Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45880,\"icon\":\"https://render.guildwars2.com/file/10760F5ADB6FAFF2C8CE0271BE1A96569BDA04BD/699266.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45881() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deldrimor Steel Legging Panel\",\"description\":\"Used to craft Deldrimor Steel Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45881,\"icon\":\"https://render.guildwars2.com/file/70925952DC45D72BF4DB1EA53EF42A45E4D353DE/699267.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45882() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deldrimor Steel Pauldron Casing\",\"description\":\"Used to craft Deldrimor Steel Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45882,\"icon\":\"https://render.guildwars2.com/file/A1E8F0A02B0262F2E5FD5691A9BBD9A9E44D47BC/699268.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45883() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spiritwood Focus Casing\",\"description\":\"Used in focus crafting.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45883,\"icon\":\"https://render.guildwars2.com/file/F208B1A2C272C102DCB6B262F4081F6B267113B5/631198.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45884() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spiritwood Focus Core\",\"description\":\"Used in focus crafting.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45884,\"icon\":\"https://render.guildwars2.com/file/08DD7224CB563780C0BAA412109572E90221529D/631199.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45885() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spiritwood Scepter Core\",\"description\":\"Used to craft scepters.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45885,\"icon\":\"https://render.guildwars2.com/file/F938213B20FCBB6769A0B0DB6BB19E22CDF47F56/631200.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45886() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spiritwood Scepter Rod\",\"description\":\"Used to craft scepters.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45886,\"icon\":\"https://render.guildwars2.com/file/E22BAE5A3A94A036DC4A5E54F805ED07D9D2A862/631201.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45887() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spiritwood Staff Head\",\"description\":\"Used in staff crafting.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45887,\"icon\":\"https://render.guildwars2.com/file/DEA7B7CB565A665D935BC7A4C377C4E60802E73C/631202.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}