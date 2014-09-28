package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0066 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem19713() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Soft Wood Plank\",\"description\":\"Refined from Logs.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19713,\"icon\":\"https://render.guildwars2.com/file/5903B1BDD6DB016204B11ADFF1CCFE22265CF566/65937.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19714() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Seasoned Wood Plank\",\"description\":\"Refined from Logs.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19714,\"icon\":\"https://render.guildwars2.com/file/6CFF221BAA7877C54B243D1DE9C8A211BB6AE170/65938.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19717() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sun Bead\",\"description\":\"Used in crafting for making Hylek items.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19717,\"icon\":\"https://render.guildwars2.com/file/582641FE0D5FD2AB0903CA0050049167A89CB97C/67028.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19718() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jute Scrap\",\"description\":\"Refine into Bolts.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19718,\"icon\":\"https://render.guildwars2.com/file/A03B07F2A625FE01B01A59042BDD06C7C5AC30D2/65939.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19719() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rawhide Leather Section\",\"description\":\"Refine into Squares.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19719,\"icon\":\"https://render.guildwars2.com/file/0CB8030AD26C3C7563B10E5EC397490F991ED795/65940.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19720() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bolt of Jute\",\"description\":\"Refined from Scraps.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19720,\"icon\":\"https://render.guildwars2.com/file/B7BA22DDCF0F4277A692D5D75271F9491AC303AD/63573.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19721() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Glob of Ectoplasm\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19721,\"icon\":\"https://render.guildwars2.com/file/18CE5D78317265000CF3C23ED76AB3CEE86BA60E/65941.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19722() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elder Wood Log\",\"description\":\"Refine into Planks.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19722,\"icon\":\"https://render.guildwars2.com/file/205871B734054D0206986FB44D6DC5425E572B0B/220465.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19723() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Green Wood Log\",\"description\":\"Refine into Planks.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19723,\"icon\":\"https://render.guildwars2.com/file/DAF50142ADC06FB11FBC02F8FFEF504F4E674047/65942.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19724() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hard Wood Log\",\"description\":\"Refine into Planks.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19724,\"icon\":\"https://render.guildwars2.com/file/576ED6A37FA1130DDD230D5D0E0D80484E25260C/220466.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19725() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Wood Log\",\"description\":\"Refine into Planks.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19725,\"icon\":\"https://render.guildwars2.com/file/5C999770AB7CC1F85D270A50C205673DF8B6E104/220467.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19726() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Soft Wood Log\",\"description\":\"Refine into Planks.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19726,\"icon\":\"https://render.guildwars2.com/file/AB6C5501209B91D9B890B1F84B29BC0142CB59D8/65943.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19727() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Seasoned Wood Log\",\"description\":\"Refine into Planks.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19727,\"icon\":\"https://render.guildwars2.com/file/66BEAC3E5D0EDA160AA4A7942D0C46C27DC0E7AA/65944.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19728() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thin Leather Section\",\"description\":\"Refine into Squares.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19728,\"icon\":\"https://render.guildwars2.com/file/ACB203A4381C7B690A7C9BAA2EFEBD01A418E3AD/65945.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19729() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thick Leather Section\",\"description\":\"Refine into Squares.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19729,\"icon\":\"https://render.guildwars2.com/file/CC3A2CAADBB2F2B13B1E70079E7E207B08D16E93/65946.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19730() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coarse Leather Section\",\"description\":\"Refine into Squares.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19730,\"icon\":\"https://render.guildwars2.com/file/0BDAA40E3795930BBF3DC5ACE366ABAE2D5BBFB2/65947.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19731() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rugged Leather Section\",\"description\":\"Refine into Squares.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19731,\"icon\":\"https://render.guildwars2.com/file/73E9DCD5D9E50BBE3DDC97B8120E0EB9BDC590E6/65948.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19732() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hardened Leather Section\",\"description\":\"Refine into Squares.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19732,\"icon\":\"https://render.guildwars2.com/file/C4600FB8F97F2618F4DFA2CE9FD2C669FAE9DE6F/65949.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19733() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cured Thin Leather Square\",\"description\":\"Refined from Sections.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19733,\"icon\":\"https://render.guildwars2.com/file/A7491F3EFD42E8AED665150C05B8D09D55B1325F/65950.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19734() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cured Coarse Leather Square\",\"description\":\"Refined from Sections.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19734,\"icon\":\"https://render.guildwars2.com/file/060124C6B61BBFD79333E063AA28E37B300F210A/65951.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19735() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cured Thick Leather Square\",\"description\":\"Refined from Sections.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19735,\"icon\":\"https://render.guildwars2.com/file/12B5A77DE31564F344BFD46875C3200E9105E0A8/65952.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19736() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cured Rugged Leather Square\",\"description\":\"Refined from Sections.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19736,\"icon\":\"https://render.guildwars2.com/file/3158B2B14EC72A93D05F07AD3FAF0EB9BC7E3E0C/65953.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19737() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cured Hardened Leather Square\",\"description\":\"Refined from Sections.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19737,\"icon\":\"https://render.guildwars2.com/file/BB34A319132236042659CE7B31DF6FA890FF6501/65954.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19738() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Stretched Rawhide Leather Square\",\"description\":\"Refined from Sections.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19738,\"icon\":\"https://render.guildwars2.com/file/6E0F2811CBEA77DF5344499E6B4C01673EE6DAC9/65955.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19739() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wool Scrap\",\"description\":\"Refine into Bolts.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19739,\"icon\":\"https://render.guildwars2.com/file/4F4E176F0B5B040F690AB7AE7B7A6844C83F2D0D/65956.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}