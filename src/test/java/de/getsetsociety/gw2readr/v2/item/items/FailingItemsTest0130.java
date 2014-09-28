package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0130 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem24294() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vial of Potent Blood\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24294,\"icon\":\"https://render.guildwars2.com/file/99AAE49EABF9A2415940FDB83CA1CE5E6E256020/66949.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24295() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vial of Powerful Blood\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":13,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24295,\"icon\":\"https://render.guildwars2.com/file/1A930A6A7B5B01EAB4CB36E79014C12B500BF6B3/66950.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24296() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tiny Totem\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24296,\"icon\":\"https://render.guildwars2.com/file/7AE87D4DE89F16B7B6E1EF6D133F3B28AA3971C9/66951.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24297() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Small Totem\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24297,\"icon\":\"https://render.guildwars2.com/file/ABE928F56C08C9ED47664948EB30A25B08DC5DEF/66952.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24298() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Totem\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24298,\"icon\":\"https://render.guildwars2.com/file/52A92F9505FD49FB655A0631525556D5B80E55C0/66953.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24299() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Intricate Totem\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24299,\"icon\":\"https://render.guildwars2.com/file/4DBC299E4B036A0DD3119A0F06BACA147C03B5C7/66954.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24300() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elaborate Totem\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":13,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24300,\"icon\":\"https://render.guildwars2.com/file/C1ABF9082901FC3CEABC3138CBCCA1DAD5D41812/66955.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24301() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Charged Sliver\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24301,\"icon\":\"https://render.guildwars2.com/file/3E2CD04924CFA55FEBF9614DA490D7AE660C1D24/66956.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24302() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Charged Fragment\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":21,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24302,\"icon\":\"https://render.guildwars2.com/file/3E2CD04924CFA55FEBF9614DA490D7AE660C1D24/66956.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24303() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Charged Shard\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24303,\"icon\":\"https://render.guildwars2.com/file/306AB62DEBCD6D02113CD0730BDC6F95BA9B9AC4/65587.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24304() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Charged Core\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":42,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24304,\"icon\":\"https://render.guildwars2.com/file/3903CB74F8D64657FFCCAADB934AF42DFB941E6C/66957.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24305() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Charged Lodestone\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\"],\"restrictions\":[],\"id\":24305,\"icon\":\"https://render.guildwars2.com/file/02EFB1C5E11B2FF4B4AC25A84E2302D244C82AA3/66958.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24306() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Onyx Sliver\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24306,\"icon\":\"https://render.guildwars2.com/file/9BAD413B9A2F18BE1DA83C0638560F98ED300A15/66959.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24307() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Onyx Fragment\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":21,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24307,\"icon\":\"https://render.guildwars2.com/file/C9F32DD525689EC3ADABDD7B633F1815A2C93080/66960.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24308() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Onyx Shard\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24308,\"icon\":\"https://render.guildwars2.com/file/F0C133B3E8FADB3C070DA35C015551A7E50692F8/66961.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24309() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Onyx Core\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":42,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24309,\"icon\":\"https://render.guildwars2.com/file/EDE00E4F3F3802F8064D7640A345ADA0E85D045C/66962.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24310() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Onyx Lodestone\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\"],\"restrictions\":[],\"id\":24310,\"icon\":\"https://render.guildwars2.com/file/2232AA41E3DF20EB249C0B6D10BC0D37FF6C0E3D/66963.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24311() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Molten Sliver\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24311,\"icon\":\"https://render.guildwars2.com/file/0B55A8510D75CBF6DF6BEF4FD3D52C349B1C4129/66964.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24312() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Molten Fragment\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":21,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24312,\"icon\":\"https://render.guildwars2.com/file/FB6878B6DC31AFC10F3B7DB8D1F93C0CFB5C08BF/66965.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24313() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Molten Shard\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24313,\"icon\":\"https://render.guildwars2.com/file/F7A947B33B0710FF2D34EAD478E7C9C430A4CFE4/66966.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24314() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Molten Core\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":42,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24314,\"icon\":\"https://render.guildwars2.com/file/F23608C7DE13B2BC903D3F6EB9734B423E96A6CB/66967.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24315() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Molten Lodestone\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\"],\"restrictions\":[],\"id\":24315,\"icon\":\"https://render.guildwars2.com/file/76910A3A41C33D0FF09EF3CBDA4B079706150FB9/66968.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24316() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Glacial Sliver\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24316,\"icon\":\"https://render.guildwars2.com/file/6DD06745F5484B1F1CF0DD9BED26573504BF1575/66969.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24317() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Glacial Fragment\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":21,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24317,\"icon\":\"https://render.guildwars2.com/file/6909C7740DF404434BA1D32E4F7042D050FF7FE7/63150.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24318() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Glacial Shard\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24318,\"icon\":\"https://render.guildwars2.com/file/C3FD9D339FFF55543CB33643C91B0E4BA9D2F4A4/65591.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}