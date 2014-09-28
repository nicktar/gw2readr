package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0203 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem45838() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deldrimor Steel Torch Head\",\"description\":\"Used to craft torches.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45838,\"icon\":\"https://render.guildwars2.com/file/3EC224A35EEBF24D460D2EA5669B5D3CEDD1AC5E/631177.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45839() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deldrimor Steel Horn\",\"description\":\"Used to craft warhorns.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45839,\"icon\":\"https://render.guildwars2.com/file/B62143F6C2D19C559FAB7DCAB956CF0F7BF9B0D0/631178.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45840() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deldrimor Steel Warhorn Mouthpiece\",\"description\":\"Used to craft warhorns.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45840,\"icon\":\"https://render.guildwars2.com/file/DC93D14595ACAA4322A1EA5966ADA94C92B4D90E/631179.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45841() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spiritwood Longbow Stave\",\"description\":\"Used to craft longbows.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45841,\"icon\":\"https://render.guildwars2.com/file/1BB0F47A3E650B2E3B7AAC38501D6942D69462B2/631180.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45842() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spiritwood Short-Bow Stave\",\"description\":\"Used to craft short bows.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45842,\"icon\":\"https://render.guildwars2.com/file/1261FC6E517A2301AD06030B125718B67E0EE594/631181.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45843() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spiritwood Rifle Stock\",\"description\":\"Used to craft rifles and harpoon guns.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45843,\"icon\":\"https://render.guildwars2.com/file/A8A453A7DBA5F3761C46E5D8569A66170E5D0CE5/631182.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45844() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elonian String\",\"description\":\"Used to craft bows.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45844,\"icon\":\"https://render.guildwars2.com/file/A443EA99354F5F5CD635CBED016F7469056598EC/631183.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45845() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deldrimor Steel Axe Blade\",\"description\":\"Used to craft axes.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45845,\"icon\":\"https://render.guildwars2.com/file/2AE5B21A0BBD16BE1EECB4A46DC5B31AEFC06594/631184.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45846() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deldrimor Steel Dagger Blade\",\"description\":\"Used to craft daggers.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45846,\"icon\":\"https://render.guildwars2.com/file/1196910FABD4C4183D350A6D5FE4A72F68FE5B49/631185.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45847() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deldrimor Steel Greatsword Blade\",\"description\":\"Used to craft greatswords.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45847,\"icon\":\"https://render.guildwars2.com/file/62633E46275C43C265943E4AD443160227AE38BA/631186.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45848() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deldrimor Steel Sword Blade\",\"description\":\"Used to craft swords.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45848,\"icon\":\"https://render.guildwars2.com/file/255FD4C5FF3F716B0B9929E3457BC403B1A75EC8/631187.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45849() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Large Spiritwood Haft\",\"description\":\"Used to craft hammers and spears.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45849,\"icon\":\"https://render.guildwars2.com/file/433CF4DA76C544E8013DF73E6D1ABDEFC91666F8/631188.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45850() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Small Spiritwood Haft\",\"description\":\"Used to craft axes and maces.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45850,\"icon\":\"https://render.guildwars2.com/file/08C435556E659AC8C9781C0E702A57DD42AF94F8/631189.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45851() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deldrimor Steel Hammer Head\",\"description\":\"Used to craft hammers.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45851,\"icon\":\"https://render.guildwars2.com/file/A2D392AED121FA5CD1AC14DE0E50F15FC93B4513/631190.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45852() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deldrimor Steel Mace Head\",\"description\":\"Used to craft maces.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45852,\"icon\":\"https://render.guildwars2.com/file/15E0AAD6062F943A5FC777F834FB6E1EE74D3C05/631191.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45853() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deldrimor Steel Spear Head\",\"description\":\"Used to craft spears.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45853,\"icon\":\"https://render.guildwars2.com/file/9F3FFFEC68C193464F5502D73A4D970C7EDD5D55/631192.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45854() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deldrimor Steel Dagger Hilt\",\"description\":\"Used to craft daggers.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45854,\"icon\":\"https://render.guildwars2.com/file/047A9DE714050BAFFE49B2C56920E898AC0668F9/631193.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45855() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deldrimor Steel Greatsword Hilt\",\"description\":\"Used to craft greatswords.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45855,\"icon\":\"https://render.guildwars2.com/file/BEBE00D6E80D1CC64606099B633D275F3EF55B7C/631194.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45856() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deldrimor Steel Sword Hilt\",\"description\":\"Used to craft swords.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45856,\"icon\":\"https://render.guildwars2.com/file/7FDA0C27169FF5CC4B46903729465F1D4807429B/631195.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45857() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deldrimor Steel Shield Backing\",\"description\":\"Used to craft shields.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45857,\"icon\":\"https://render.guildwars2.com/file/AD9F0305DC3391F367D12B1DC65EF77E2FBE00BE/631196.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45858() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deldrimor Steel Shield Boss\",\"description\":\"Used to craft shields.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45858,\"icon\":\"https://render.guildwars2.com/file/AC43909F49B164B302127F4C9434104D99EB97D0/631197.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45859() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elonian Glove Lining\",\"description\":\"Used to craft Elonian Leather Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45859,\"icon\":\"https://render.guildwars2.com/file/B0CF09720250E92742D1030255DDBE32553944FB/699245.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45860() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elonian Helmet Padding\",\"description\":\"Used to craft Elonian Leather Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45860,\"icon\":\"https://render.guildwars2.com/file/5E3753C2C70FC605B733262FA8E1B4E53E59B8E0/699246.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45861() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elonian Longcoat Padding\",\"description\":\"Used to craft Elonian Leather Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45861,\"icon\":\"https://render.guildwars2.com/file/D69A7DD63FCE3EEAB91A09CBF2FB78284ECB3DB4/699247.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45862() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elonian Shoulderguard Padding\",\"description\":\"Used to craft Elonian Leather Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45862,\"icon\":\"https://render.guildwars2.com/file/A9E676E85F550CBEBB04920DB90C133BCC270AE9/699248.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}