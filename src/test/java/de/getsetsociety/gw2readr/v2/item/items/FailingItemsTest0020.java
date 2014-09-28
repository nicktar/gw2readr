package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0020 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem9569() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"18 Slot Invisible Bag\",\"description\":\"18 Slots. Items in this bag will never appear in a sell-to-vendor list and will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9569,\"icon\":\"https://render.guildwars2.com/file/D65F01A57E4BBABC5D465EFD035A5A5518CA9900/433575.png\",\"details\":{\"no_sell_or_sort\":true,\"size\":18}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9571() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"20 Slot Gossamer Bag\",\"description\":\"20 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":27,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9571,\"icon\":\"https://render.guildwars2.com/file/CCCF23C7F9F8AC41D25B2B67A469DA951C669467/219390.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":20}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9572() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"20 Slot Craftsman's Bag\",\"description\":\"20 Slots. If possible, crafting materials and upgrade components will fill this bag before other empty spaces. The contents of this bag will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9572,\"icon\":\"https://render.guildwars2.com/file/5F7362DEF112DCAED4D615B94E9D1C3CEA040011/433577.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":20}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9574() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"20 Slot Invisible Bag\",\"description\":\"20 Slots. Items in this bag will never appear in a sell-to-vendor list and will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9574,\"icon\":\"https://render.guildwars2.com/file/C6D16D1D43120B28C0011277EE5E2AD8085E473B/433579.png\",\"details\":{\"no_sell_or_sort\":true,\"size\":20}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9576() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"18 Slot Thick Leather Pack\",\"description\":\"18 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":27,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9576,\"icon\":\"https://render.guildwars2.com/file/545E084015DC05A555170BB3D063193A346E1573/222432.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":18}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9579() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"18 Slot Invisible Pack\",\"description\":\"18 Slots. Items in this pack will never appear in a sell-to-vendor list and will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9579,\"icon\":\"https://render.guildwars2.com/file/32EDA3695F0451925EB2B8730F711FB5AEE2044E/433583.png\",\"details\":{\"no_sell_or_sort\":true,\"size\":18}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9580() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"18 Slot Oiled Pack\",\"description\":\"18 Slots. If possible, junk items will fill this pack before other empty spaces. The contents of this pack will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9580,\"icon\":\"https://render.guildwars2.com/file/0E9BA1E66AD7B209B2394A747D2B1CD20ABF4521/433584.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":18}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9581() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"20 Slot Hardened Leather Pack\",\"description\":\"20 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":27,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9581,\"icon\":\"https://render.guildwars2.com/file/A149FD302E9128B0DEFAF7BA71726A5842B7D2EB/222426.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":20}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9584() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"20 Slot Invisible Pack\",\"description\":\"20 Slots. Items in this pack will never appear in a sell-to-vendor list and will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9584,\"icon\":\"https://render.guildwars2.com/file/B7B7EB4291550C3BBE50C6E7C223C59A15614D33/433587.png\",\"details\":{\"no_sell_or_sort\":true,\"size\":20}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9585() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"20 Slot Oiled Pack\",\"description\":\"20 Slots. If possible, junk items will fill this pack before other empty spaces. The contents of this pack will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9585,\"icon\":\"https://render.guildwars2.com/file/703717137DF44401D7B2C45A736C5C90482F0673/433588.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":20}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9586() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"18 Slot Mithril Box\",\"description\":\"18 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":27,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9586,\"icon\":\"https://render.guildwars2.com/file/00A876DFF0B89D18026B9BE4C1239E0BB7BAB81E/220595.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":18}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9588() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"18 Slot Equipment Box\",\"description\":\"18 Slots. If possible, weapons and armor will fill this box before other empty spaces. The contents of this box will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":54,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9588,\"icon\":\"https://render.guildwars2.com/file/4A03D390C73ABC0415F20958083ADE31935F40C6/433590.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":18}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9589() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"18 Slot Safe Box\",\"description\":\"18 Slots. Items in this box will never appear in a sell-to-vendor list and will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":54,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9589,\"icon\":\"https://render.guildwars2.com/file/CFDAEFFF27E76909474170BC52C501E444496378/433591.png\",\"details\":{\"no_sell_or_sort\":true,\"size\":18}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9591() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"20 Slot Orichalcum Box\",\"description\":\"20 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":27,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9591,\"icon\":\"https://render.guildwars2.com/file/FE2CFC2DF2AA02C24C9FE810119D0539266CDB42/222418.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":20}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9593() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"20 Slot Equipment Box\",\"description\":\"20 Slots. If possible, weapons and armor will fill this box before other empty spaces. The contents of this box will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":54,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9593,\"icon\":\"https://render.guildwars2.com/file/5519EC3E90D9CF07B9052902BFD80C08C364DAE8/433594.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":20}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9594() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"20 Slot Safe Box\",\"description\":\"20 Slots. Items in this box will never appear in a sell-to-vendor list and will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":54,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9594,\"icon\":\"https://render.guildwars2.com/file/12F22D0BB1723B256CA44CE0D0B611A1089DCA2B/433595.png\",\"details\":{\"no_sell_or_sort\":true,\"size\":20}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12128() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Omnomberry\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Basic\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12128,\"icon\":\"https://render.guildwars2.com/file/9C5457B024D9152906D808A53BFF67539BB94FA0/219396.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12134() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carrot\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":1,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12134,\"icon\":\"https://render.guildwars2.com/file/F06472A03B49AA6C9256195FC43B49BEA26595D0/62859.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12135() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Potato\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":1,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12135,\"icon\":\"https://render.guildwars2.com/file/24CE9454113F0609E6E9B655EF0670B40D5522EC/63245.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12136() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Flour\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":1,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12136,\"icon\":\"https://render.guildwars2.com/file/D4D43D9FF51498B204D1C83F6DF32A1394303373/63246.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12137() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Glass of Buttermilk\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":12137,\"icon\":\"https://render.guildwars2.com/file/5820BA34BBED9C17C6A9CCF79EC9C8A0E2C7D53C/63247.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12138() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Stick of Butter\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":1,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12138,\"icon\":\"https://render.guildwars2.com/file/CA45CEE2BA3BA040E7C294965CA3756FC3F33FD1/63248.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12141() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tomato\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":12141,\"icon\":\"https://render.guildwars2.com/file/9A90C6EFADEB957FDA43A3EB0CE5D7ABCB1A1AAF/63249.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12142() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Onion\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":1,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12142,\"icon\":\"https://render.guildwars2.com/file/62FEA707A3547EA74113C29A110B40B23501B75C/63115.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12143() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Egg\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":1,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12143,\"icon\":\"https://render.guildwars2.com/file/5FC1B2D9C0BC0365CB6E5C943D2E7E1F58520241/63158.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}