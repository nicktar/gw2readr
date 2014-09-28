package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0026 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem12529() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bowl of Risotto Base\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":60,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12529,\"icon\":\"https://render.guildwars2.com/file/D2C27CF6A3629EC972745F6406569F1A9D6A2624/219479.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12530() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jar of Citrus Cream Sauce\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":60,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12530,\"icon\":\"https://render.guildwars2.com/file/08CFF001CFB701540B9F384D55EFA24FFCAA19F5/219480.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12531() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coriander Seed\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":45,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12531,\"icon\":\"https://render.guildwars2.com/file/B90C503BF3B83A3AD34533D3A5DE634B1CFF1D72/219481.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12532() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Head of Cauliflower\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":45,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12532,\"icon\":\"https://render.guildwars2.com/file/327E15CA0B5D069908C8F96E0AA335140BD302CD/219482.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12533() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Green Onion\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":45,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12533,\"icon\":\"https://render.guildwars2.com/file/DB03DC50A5BA020811221B04D1D4FB3957F81512/63389.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12534() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Clove\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":45,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12534,\"icon\":\"https://render.guildwars2.com/file/959295E70911D30D9EE9973FA7A097BA55F40AAF/219483.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12535() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rutabaga\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":45,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12535,\"icon\":\"https://render.guildwars2.com/file/900364553607A5BCA06370F8B320B00A0A19ABD7/63390.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12536() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mint Leaf\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":45,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12536,\"icon\":\"https://render.guildwars2.com/file/2D0726C61FBA172F6B96E3BF91420ACED83FB554/219484.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12537() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Blackberry\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":45,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12537,\"icon\":\"https://render.guildwars2.com/file/EB324BCF05D270CAFE77C132BA97E2FA2DEF4B0E/219485.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12538() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sugar Pumpkin\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":45,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12538,\"icon\":\"https://render.guildwars2.com/file/6ED9FE4CB6DCDA7F542718507DC33305FDD9A62C/63386.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12539() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bowl of Mango Pie Filling\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Basic\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12539,\"icon\":\"https://render.guildwars2.com/file/D8170B02AAAE8061C7FEA397B9AEFB926A4F0EBA/433680.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12540() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bowl of Omnomberry Pie Filling\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Basic\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12540,\"icon\":\"https://render.guildwars2.com/file/2C6C0B6FAB5029E2459B0DB93D0B5D20A8E6EFDF/433681.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12541() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bowl of Chocolate Omnomberry Frosting\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Basic\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12541,\"icon\":\"https://render.guildwars2.com/file/F16B94C9EF0A2F15F1559263F39FDFB44AE2EAFC/433682.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12542() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jar of Red Curry Paste\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Basic\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12542,\"icon\":\"https://render.guildwars2.com/file/A10E77B83A7BACC6D83A051D40F2F31AC42ADCCE/219486.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12543() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mango\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":12543,\"icon\":\"https://render.guildwars2.com/file/C62DA37F0796A3DD0755BB019790F9C3FEB95D1B/219487.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12544() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ghost Pepper\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Basic\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12544,\"icon\":\"https://render.guildwars2.com/file/01051F0458C052BF08916A555273FF6145592FE6/219488.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12545() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orrian Truffle\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Basic\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12545,\"icon\":\"https://render.guildwars2.com/file/0AF0FD06192106D5D9C73A35A3E364CE6B4A1FC0/219489.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12546() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lemongrass\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Basic\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12546,\"icon\":\"https://render.guildwars2.com/file/DF5612F93A11DB5F53FECA523F50D15DBF5A9AA5/219490.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12547() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Saffron Thread\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Basic\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12547,\"icon\":\"https://render.guildwars2.com/file/FE1C9BB06AF7E83EDCBD655B030EB8EC00CBD350/219491.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12740() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unidentified Blue Dye\",\"description\":\"Double-click to identify a Common, Uncommon or Rare Dye from the Blue spectrum.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12740,\"icon\":\"https://render.guildwars2.com/file/09206A087606CFC674AC19E1E5CCADB6B3302061/66601.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12741() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unidentified Brown Dye\",\"description\":\"Double-click to identify a Common, Uncommon or Rare Dye from the Brown spectrum.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12741,\"icon\":\"https://render.guildwars2.com/file/09206A087606CFC674AC19E1E5CCADB6B3302061/66601.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12742() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unidentified Gray Dye\",\"description\":\"Double-click to identify a Common, Uncommon or Rare Dye from the Gray spectrum.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12742,\"icon\":\"https://render.guildwars2.com/file/09206A087606CFC674AC19E1E5CCADB6B3302061/66601.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12743() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unidentified Green Dye\",\"description\":\"Double-click to identify a Common, Uncommon or Rare Dye from the Green spectrum.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12743,\"icon\":\"https://render.guildwars2.com/file/09206A087606CFC674AC19E1E5CCADB6B3302061/66601.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12744() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unidentified Orange Dye\",\"description\":\"Double-click to identify a Common, Uncommon or Rare Dye from the Orange spectrum.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12744,\"icon\":\"https://render.guildwars2.com/file/09206A087606CFC674AC19E1E5CCADB6B3302061/66601.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12745() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unidentified Purple Dye\",\"description\":\"Double-click to identify a Common, Uncommon or Rare Dye from the Purple spectrum.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12745,\"icon\":\"https://render.guildwars2.com/file/09206A087606CFC674AC19E1E5CCADB6B3302061/66601.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}