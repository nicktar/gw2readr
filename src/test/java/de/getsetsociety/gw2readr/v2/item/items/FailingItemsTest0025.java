package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0025 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem12503() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Peach\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":12503,\"icon\":\"https://render.guildwars2.com/file/19DA4B1B140A02D7600C3AEF2E269C5BF00BE1D0/219465.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12504() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cayenne Pepper\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":65,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12504,\"icon\":\"https://render.guildwars2.com/file/0B4DFEC1F0F270F4AE01E854FFF3CC64124C25C9/219466.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12505() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Asparagus Spear\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":65,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12505,\"icon\":\"https://render.guildwars2.com/file/693F7207FB74B962DE327E355C18D680E0357965/219467.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12506() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tarragon Leaves\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":65,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12506,\"icon\":\"https://render.guildwars2.com/file/471BB29A5EEA3F96ECC5C9B4282C42407D10B106/219468.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12507() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Parsnip\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":65,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12507,\"icon\":\"https://render.guildwars2.com/file/243B97AD9B5B521EA32E55113E60D9386406082A/63383.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12508() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Leek\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":65,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12508,\"icon\":\"https://render.guildwars2.com/file/3DA4DD5CC90EA1DEE3427562BF4DA344D776345C/219469.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12509() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Seaweed\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Basic\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12509,\"icon\":\"https://render.guildwars2.com/file/35C6906CCA6A0541383D5AE31E656456DC3418E5/63385.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12510() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lotus Root\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Basic\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12510,\"icon\":\"https://render.guildwars2.com/file/2BCA0A07077D3899C3F601AF1FAEFB18C67FB30F/219470.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12511() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Butternut Squash\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":65,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12511,\"icon\":\"https://render.guildwars2.com/file/D46839D1040447D5E417D848A10DC2B7D8A73493/219471.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12512() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Artichoke\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":65,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12512,\"icon\":\"https://render.guildwars2.com/file/3FF00D3CF70B4AB4E117040F541D384302E7D93E/219472.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12513() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bowl of Strawberry Pie Filling\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":25,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12513,\"icon\":\"https://render.guildwars2.com/file/1E2A1B48A36277E3CC6008AD2960411DF6574EAF/219418.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12514() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pear\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":12514,\"icon\":\"https://render.guildwars2.com/file/47C55AABEE0437EFECD0FDF6E45C3A2E4C5905D6/63387.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12515() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chickpea\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":12515,\"icon\":\"https://render.guildwars2.com/file/6698A1A0EFD87EB5EDEAE85B92CB0ECF6D0B5E33/219473.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12516() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pinenut\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":12516,\"icon\":\"https://render.guildwars2.com/file/7BAB6B4AF0EB400BB8E4E2B06F0604FD300D72C3/219474.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12517() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Shallot\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":12517,\"icon\":\"https://render.guildwars2.com/file/38E4A1DE07DD390F91FB9B9FB56B0AD10BD0CA50/63388.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12518() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Horseradish Root\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":12518,\"icon\":\"https://render.guildwars2.com/file/C418D01321CF0DF62216261AD6C5C852F97E57E2/219475.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12519() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pile of Pumpkin Pie Spice\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":45,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12519,\"icon\":\"https://render.guildwars2.com/file/FF98B1BF45D9CB955B0500AFE9797F9C49D7A6D5/219404.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12520() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bowl of Pumpkin Pie Filling\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":60,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12520,\"icon\":\"https://render.guildwars2.com/file/431736B23539A6B2355208D2734475FA371CDC0B/219461.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12521() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jar of Orange Sauce\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":55,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12521,\"icon\":\"https://render.guildwars2.com/file/26BF0A1AB04716EAF3B70F4AFF450FA595E2A2A3/219476.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12523() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bowl of Orange Coconut Frosting\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":55,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12523,\"icon\":\"https://render.guildwars2.com/file/170F2704F53FC2785D1EBC67605B145A0D0ACAD7/339962.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12524() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bowl of Blackberry Pie Filling\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":60,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12524,\"icon\":\"https://render.guildwars2.com/file/F63F2B11ABD1A1D9750492BD78B1157266BC71C1/339963.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12525() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bowl of Eztlitl Stuffing\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":60,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12525,\"icon\":\"https://render.guildwars2.com/file/E9B2081ABF6C3F9F9604FFD6E66E6DB5E9766879/339964.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12526() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bowl of Pesto\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":60,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12526,\"icon\":\"https://render.guildwars2.com/file/C8DEE3580B2AE19455774251B6B325B1D7DCD115/219477.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12527() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jar of Mint Sauce\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":60,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12527,\"icon\":\"https://render.guildwars2.com/file/226BD93F5A36EEB6EFAA91B1E8BE7A6F24B6ADA3/219458.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12528() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bowl of Fancy Tangy Sautee Mix\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":60,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12528,\"icon\":\"https://render.guildwars2.com/file/2917EF724629BD0D401E6E520859C3D10C5E7136/219478.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}