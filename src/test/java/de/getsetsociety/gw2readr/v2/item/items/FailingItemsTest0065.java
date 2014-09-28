package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0065 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem19676() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Icy Runestone\",\"description\":\"Used to create items of great power.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":1250,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19676,\"icon\":\"https://render.guildwars2.com/file/1AB22A149E9B807AA726CC6B1D7D0435A840A300/455856.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19677() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Exploration\",\"description\":\"A gift used to create legendary weapons.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19677,\"icon\":\"https://render.guildwars2.com/file/B0051EB5FF730C9EF7C2A3781D3F9B732D4D1A55/455857.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19678() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Battle\",\"description\":\"A gift used to create legendary weapons.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19678,\"icon\":\"https://render.guildwars2.com/file/EB593444A3ED065F7BE3EC71713CF80D145EABCB/455858.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19679() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bronze Ingot\",\"description\":\"Refined from Copper Ore and Tin.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19679,\"icon\":\"https://render.guildwars2.com/file/E3D6CBCEACAE61041366A4C0021B6E6B40630A0F/65908.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19680() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Copper Ingot\",\"description\":\"Refined from Ore.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19680,\"icon\":\"https://render.guildwars2.com/file/32D3BC4B5722155E15DC5A1DE5E9255C50F90609/65909.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19681() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darksteel Ingot\",\"description\":\"Refined from Platinum Ore and Primordium.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19681,\"icon\":\"https://render.guildwars2.com/file/EDC02674C339C0D5B0B8C9370013394ED6270FA7/65910.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19682() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gold Ingot\",\"description\":\"Refined from Ore.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19682,\"icon\":\"https://render.guildwars2.com/file/80C845F5ED06036F7E041C7214C29FA3D562A480/65911.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19683() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Ingot\",\"description\":\"Refined from Ore.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19683,\"icon\":\"https://render.guildwars2.com/file/69722C33064097766ABC44B20F5D4B551E599E32/65912.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19684() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Ingot\",\"description\":\"Refined from Ore.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19684,\"icon\":\"https://render.guildwars2.com/file/7B0701F4092237431EDC72340BC89AA126EA4EF0/65913.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19685() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Ingot\",\"description\":\"Refined from Ore.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19685,\"icon\":\"https://render.guildwars2.com/file/D1941454313ACCB234906840E1FB401D49091B96/220460.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19686() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Platinum Ingot\",\"description\":\"Refined from Ore.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19686,\"icon\":\"https://render.guildwars2.com/file/3F08D6044B2268BE57972DCB1F0424B5A60F2AEC/65914.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19687() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Silver Ingot\",\"description\":\"Refined from Ore.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19687,\"icon\":\"https://render.guildwars2.com/file/33150406A468526276071A0D0AD678B9F1D6EDCA/65915.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19688() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steel Ingot\",\"description\":\"Refined from Iron Ore and Coal.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19688,\"icon\":\"https://render.guildwars2.com/file/FCB6E507C84EDD01E2CE25665370FDE8423B58F9/65916.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19697() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Copper Ore\",\"description\":\"Refine into Copper Ingots or use Tin to refine into Bronze Ingots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":1,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19697,\"icon\":\"https://render.guildwars2.com/file/6E17C5A65955239640743E48B30A3425FACA5D02/65925.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19698() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gold Ore\",\"description\":\"Refine into Ingots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19698,\"icon\":\"https://render.guildwars2.com/file/D9C17CE765F921332DEBCA44681DFA2DA8586A36/65926.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19699() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Ore\",\"description\":\"Refine into Iron Ingots or use Coal to refine into Steel Ingots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19699,\"icon\":\"https://render.guildwars2.com/file/C1FD07F60E0B74C497761C1C014D03E402E60C6F/65927.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19700() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Ore\",\"description\":\"Refine into Ingots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19700,\"icon\":\"https://render.guildwars2.com/file/E90FE803CDC205CDEB13FE03694D4D04757ACF5D/65928.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19701() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Ore\",\"description\":\"Refine into Ingots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19701,\"icon\":\"https://render.guildwars2.com/file/A6E2C82153BA684E2D05D3FCA09F3E02431366ED/220461.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19702() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Platinum Ore\",\"description\":\"Refine into Platinum Ingots or use Primordium to refine into Darksteel Ingots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19702,\"icon\":\"https://render.guildwars2.com/file/413D7EE8CE04C0BC07C31A4B381EB6344150F849/65930.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19703() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Silver Ore\",\"description\":\"Refine into Ingots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19703,\"icon\":\"https://render.guildwars2.com/file/DA1D9FCF3006222DEE691016EFF8AEE162C3431D/65931.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19704() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lump of Tin\",\"description\":\"Used with Copper Ore to refine Bronze Ingots. Can be purchased from Master Craftsmen.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":1,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19704,\"icon\":\"https://render.guildwars2.com/file/B2705275944046734E4079651E6BB0CC0EEB3943/65932.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19709() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elder Wood Plank\",\"description\":\"Refined from Logs.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19709,\"icon\":\"https://render.guildwars2.com/file/DB5C0A4EB6E7F730DAC3B3DE7032482792E76FA7/220462.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19710() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Green Wood Plank\",\"description\":\"Refined from Logs.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19710,\"icon\":\"https://render.guildwars2.com/file/0DF93CAB2913940F5FD44FF66EF309632125DB28/65936.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19711() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hard Wood Plank\",\"description\":\"Refined from Logs.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19711,\"icon\":\"https://render.guildwars2.com/file/4DFCF8776C05F6D304B5BAB25F5715C57CB19FD6/220463.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19712() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Wood Plank\",\"description\":\"Refined from Logs.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19712,\"icon\":\"https://render.guildwars2.com/file/4A0C6F64BD7AD446ADCA0177C052D732582EE90A/220464.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}