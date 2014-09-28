package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0021 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem12144() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Snow Truffle\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Basic\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12144,\"icon\":\"https://render.guildwars2.com/file/917E9C5504FE06715DCBE04D75F826BE5DB895BA/219398.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12147() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mushroom\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":1,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12147,\"icon\":\"https://render.guildwars2.com/file/2713C5787FCB403F25A4F7144D2B1E52291E3178/219399.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12151() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Packet of Baking Powder\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":1,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12151,\"icon\":\"https://render.guildwars2.com/file/2602760FB17294424AB0A71B3668046E064A4068/63255.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12152() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Packet of Yeast\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":12152,\"icon\":\"https://render.guildwars2.com/file/272BFDA5485572127E24F7D4E5409256DB58D9BC/63256.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12153() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Packet of Salt\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":1,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12153,\"icon\":\"https://render.guildwars2.com/file/135535073FE49205B57801F3A94F35F7270274EF/63257.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12155() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Sugar\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":1,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12155,\"icon\":\"https://render.guildwars2.com/file/C9A8A4781A07393016AFF9A47E1B356255FC9F0F/63258.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12156() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jug of Water\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":1,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12156,\"icon\":\"https://render.guildwars2.com/file/C23FA1EA0827E97312D6064F4A08B402FE9943B9/63071.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12157() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jar of Vinegar\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":1,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12157,\"icon\":\"https://render.guildwars2.com/file/116B302CC6143B753304B771760EB9735918B4FB/63102.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12158() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jar of Vegetable Oil\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":1,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12158,\"icon\":\"https://render.guildwars2.com/file/750AB0461B36DAC2B9970E4C6328911364DE2552/63259.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12159() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cheese Wedge\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":12159,\"icon\":\"https://render.guildwars2.com/file/1F94DD1796790CD30C2CC35F66E6DADD0508C44A/63260.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12161() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Beet\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":20,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12161,\"icon\":\"https://render.guildwars2.com/file/CE0105F7035E55544A75D71FD0EC1A0095E7062C/63261.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12162() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Turnip\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":20,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12162,\"icon\":\"https://render.guildwars2.com/file/753BAA18664504123A54FC9E7060A10107C9A574/63262.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12163() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Head of Garlic\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":20,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12163,\"icon\":\"https://render.guildwars2.com/file/3FF6110C2B976FBCCD4F4DC6B19D33ED010431AA/63263.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12165() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Apple\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":12165,\"icon\":\"https://render.guildwars2.com/file/17520D2F53CF62BFA696EDE02DA1F77445A9F796/63265.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12166() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ball of Dough\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":1,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12166,\"icon\":\"https://render.guildwars2.com/file/653F995228B62DF626BBEFC96902961400DE21EE/63266.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12167() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bowl of Staple Soup Vegetables\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":10,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12167,\"icon\":\"https://render.guildwars2.com/file/0B7B6F6568FC90411B71D5C19D4516920145ACF0/63267.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12168() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bowl of White Frosting\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":40,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12168,\"icon\":\"https://render.guildwars2.com/file/2623121EB739D3DA24AC1DAEC2717E4457F15CDC/63268.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12169() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bowl of Baker's Dry Ingredients\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":25,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12169,\"icon\":\"https://render.guildwars2.com/file/546639E30FF804FF50E1187BE6E3CAA75CE46DA5/63269.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12170() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bowl of Baker's Wet Ingredients\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":25,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12170,\"icon\":\"https://render.guildwars2.com/file/08EFE0B5291B2BB75766224E08CB465CFC9368E8/63270.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12171() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pasta Noodles\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":10,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12171,\"icon\":\"https://render.guildwars2.com/file/340F42DB44797B2E123E1F7BC69C08243F0F5F47/63271.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12172() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jar of Tomato Sauce\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":25,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12172,\"icon\":\"https://render.guildwars2.com/file/2CBD5D5F4F076716CBE6B59434E9E12A38B37C62/63272.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12173() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bowl of Sage Stuffing\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":25,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12173,\"icon\":\"https://render.guildwars2.com/file/6001550DAF4E24209C13A553196ACECB6AE50845/63120.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12174() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bowl of Tangy Sautee Mix\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":25,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12174,\"icon\":\"https://render.guildwars2.com/file/2A06311AD4A97ACB09B8A2D8DEFEB8ABE6615264/219400.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12175() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bottle of Ascalonian Dressing\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":25,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12175,\"icon\":\"https://render.guildwars2.com/file/9995D3ED4F139D289C02C258C1F6953B2742173A/63060.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12176() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bottle of Simple Dressing\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":10,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12176,\"icon\":\"https://render.guildwars2.com/file/9591D8DA7D73685659E0AAB8AA28139B937475CF/219401.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}