package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0022 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem12177() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pile of Cinnamon and Sugar\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":1,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12177,\"icon\":\"https://render.guildwars2.com/file/F90EEC96BB0C70D5CC2F30BA2E0B45B8326965A8/219351.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12178() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pile of Salt and Pepper\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":1,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12178,\"icon\":\"https://render.guildwars2.com/file/DE066D3C502075B90ECE290F5B95FFA87875DFAB/63274.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12179() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pile of Simple Stew Herbs\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":25,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12179,\"icon\":\"https://render.guildwars2.com/file/2D5B9BB20336CC06CC364FE699151C5621BA313B/219402.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12180() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pile of Ascalonian Herbs\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":20,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12180,\"icon\":\"https://render.guildwars2.com/file/C4ED67EE9ABA0CB10E3FF80C58D85AADF3F2425B/219403.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12181() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pile of Tangy Seasoning\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":20,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12181,\"icon\":\"https://render.guildwars2.com/file/FF98B1BF45D9CB955B0500AFE9797F9C49D7A6D5/219404.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12228() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cup of Banana Cream Pie Filling\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":20,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12228,\"icon\":\"https://render.guildwars2.com/file/B00A2ADD1B1FF01CB11BCC18B514D0C3F97C4B90/63309.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12229() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chocolate Bar\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":1,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12229,\"icon\":\"https://render.guildwars2.com/file/F86CB32339ED0202394753B2ED26091BA1B9B643/63310.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12232() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Green Bean\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":12232,\"icon\":\"https://render.guildwars2.com/file/BAF90306496EF5C802CAE306AC2802CEAF20CAA3/63313.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12234() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vanilla Bean\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":1,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12234,\"icon\":\"https://render.guildwars2.com/file/0B2624A031FBF37DECBA167B5C057EDFC76FA3DD/63148.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12235() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bell Pepper\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":12235,\"icon\":\"https://render.guildwars2.com/file/78E1DB20FF0FF36FCE0E7205220EE5C6E8F47133/63314.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12236() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Black Peppercorn\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":1,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12236,\"icon\":\"https://render.guildwars2.com/file/54BB5F03AFE3FA75E59F432418A6C7BE9F07EC6A/63315.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12237() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Black Bean\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":12237,\"icon\":\"https://render.guildwars2.com/file/0A4B02E6059ABBDE9A989257A9B10552B97DA2A6/63316.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12238() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Head of Lettuce\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":1,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12238,\"icon\":\"https://render.guildwars2.com/file/F370E14DE5C1FACE91D19F19FD65CD19C5F74F75/63317.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12239() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Kidney Bean\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":12239,\"icon\":\"https://render.guildwars2.com/file/C54B576F9E694819C57EDE5E0B750B20BE4D56EE/63318.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12240() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Celery Stalk\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":12240,\"icon\":\"https://render.guildwars2.com/file/50023B45F50B065D06AAEDAF903E5D809C459D31/63118.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12241() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spinach Leaf\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":20,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12241,\"icon\":\"https://render.guildwars2.com/file/0E1D68AE260A72F91CCF00239BCA3261B1C5D1A9/63319.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12243() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sage Leaf\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":20,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12243,\"icon\":\"https://render.guildwars2.com/file/CFAEA7F4C824573764E23023940C0B9DAE450854/219410.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12244() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Oregano Leaf\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":20,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12244,\"icon\":\"https://render.guildwars2.com/file/DB0BBE38079CE5D72C427EE462C0E480E3E9F2C4/63322.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12245() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Basil Leaf\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":12245,\"icon\":\"https://render.guildwars2.com/file/042B9F252DF717B6E1A760A45DE7EF4CD1A60203/219411.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12246() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Parsley Leaf\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":1,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12246,\"icon\":\"https://render.guildwars2.com/file/99FCC3355228E746D03250E915A16699B22E2847/219412.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12247() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bay Leaf\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":15,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12247,\"icon\":\"https://render.guildwars2.com/file/4DB7FDDC35DD95F5B0B606F775ED23CE209BA127/63325.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12248() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thyme Leaf\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":1,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12248,\"icon\":\"https://render.guildwars2.com/file/EC13E2DE5F0FD6BBB00B07BA067B2291BE54C64B/219413.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12249() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Nutmeg Seed\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":12249,\"icon\":\"https://render.guildwars2.com/file/28A16F9934422541D4091EA1A599049AF22693A5/219414.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12250() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Walnut\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":15,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12250,\"icon\":\"https://render.guildwars2.com/file/ACA9C1764C4BFD7CFEF6661593C307254FA0D6A8/63327.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12251() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Banana\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":12251,\"icon\":\"https://render.guildwars2.com/file/0CF6F3FFEF0D55632B0B17F1596CC903A3969903/63328.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}