package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0074 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem19922() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Knight's Orichalcum Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Toughness, +Power, and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19922,\"icon\":\"https://render.guildwars2.com/file/9C1FA22BC16F3C7636CE324901ECD46E9700E9AC/340499.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19923() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Valkyrie Orichalcum Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Power, +Ferocity, and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19923,\"icon\":\"https://render.guildwars2.com/file/CE980E0344A9F17A2F69560C79F74C7B9D2CFA11/340500.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19924() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lump of Primordium\",\"description\":\"Used with Platinum to refine Darksteel. Can be purchased from Master Craftsmen.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19924,\"icon\":\"https://render.guildwars2.com/file/3728DC6E10FA4DADCD3B0918A70FAE9DEA96BDD4/65962.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19925() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Obsidian Shard\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":300,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19925,\"icon\":\"https://render.guildwars2.com/file/AE16FCC326D80A3906B17B6A75E8A91980BE4670/434362.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19926() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rejuvenating Soft Inscription\",\"description\":\"Used in the crafting of weapons with +Healing Power and +Power.\",\"type\":\"CraftingMaterial\",\"level\":30,\"rarity\":\"Fine\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19926,\"icon\":\"https://render.guildwars2.com/file/4C9AA3E2B52DCD96CF217E3CF6906F98FB04ACF0/340501.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19927() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rejuvenating Iron Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Healing Power and +Power.\",\"type\":\"CraftingMaterial\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":17,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19927,\"icon\":\"https://render.guildwars2.com/file/AEB9CC9043012954054A1DB942384AC1F8CB3A4A/340502.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19928() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rejuvenating Seasoned Inscription\",\"description\":\"Used in the crafting of weapons with +Healing Power and +Power.\",\"type\":\"CraftingMaterial\",\"level\":45,\"rarity\":\"Fine\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19928,\"icon\":\"https://render.guildwars2.com/file/C5FE042812222E33B84C7A5CA44BDC04C67FA4E4/340503.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19929() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rejuvenating Steel Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Healing Power and +Power.\",\"type\":\"CraftingMaterial\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":23,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19929,\"icon\":\"https://render.guildwars2.com/file/0CA54D489636D4B47B225D9E6C2B6227FA6F17B3/340504.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19930() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rejuvenating Wool Insignia\",\"description\":\"Used in the crafting of armor with +Healing Power and +Power.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19930,\"icon\":\"https://render.guildwars2.com/file/D3CE1919EE1CB84E5606B343135A5953D943A723/220482.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19931() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rejuvenating Embroidered Wool Insignia\",\"description\":\"Used in the crafting of armor with +Healing Power and +Power.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":17,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19931,\"icon\":\"https://render.guildwars2.com/file/16B57F747B63434DE5C9A9A5052371F40AC5E83F/220483.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19932() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rejuvenating Cotton Insignia\",\"description\":\"Used in the crafting of armor with +Healing Power and +Power.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":10,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19932,\"icon\":\"https://render.guildwars2.com/file/4BC33F96D573ECD7B7DB36275D1E6993D3473672/340505.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19933() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rejuvenating Embroidered Cotton Insignia\",\"description\":\"Used in the crafting of armor with +Healing Power and +Power.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19933,\"icon\":\"https://render.guildwars2.com/file/089A5CF5C953B51F97ACBDEA33DA0871C601524E/340506.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19934() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ravaging Iron Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Condition Damage and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":26,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19934,\"icon\":\"https://render.guildwars2.com/file/463C671F45782CD65802F03304A4F4934E09A363/434363.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19935() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rejuvenating Iron Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Healing Power and +Power.\",\"type\":\"CraftingMaterial\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":26,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19935,\"icon\":\"https://render.guildwars2.com/file/1133AD061F26560FEED3B0BB236272FFC338744A/434364.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19936() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Honed Iron Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Power and +Ferocity.\",\"type\":\"CraftingMaterial\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":26,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19936,\"icon\":\"https://render.guildwars2.com/file/055769DCEEB263F10379A21C9BB64156F3DCA118/434365.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19937() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hunter's Iron Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Precision and +Power.\",\"type\":\"CraftingMaterial\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":26,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19937,\"icon\":\"https://render.guildwars2.com/file/643A3698BD3E15F2FD195A7718750FA2AD604900/434366.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19938() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Strong Iron Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Power and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":26,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19938,\"icon\":\"https://render.guildwars2.com/file/FA3D77153CBB48F4E1CB9D45B10971DA98BFDAD0/434367.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19939() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vigorous Iron Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Power and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":26,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19939,\"icon\":\"https://render.guildwars2.com/file/93030B20E21E7E2778032F65A7369563632B7701/434368.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19940() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hearty Iron Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Vitality and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":26,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19940,\"icon\":\"https://render.guildwars2.com/file/A9A13324FD1ED5080DEDCD4B0842910A6036C028/434369.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19941() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ravaging Steel Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Condition Damage and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":34,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19941,\"icon\":\"https://render.guildwars2.com/file/E6DE3A11D99264BF1D78F4EDB6350AC70BB60B0D/434370.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19942() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rejuvenating Steel Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Healing Power and +Power.\",\"type\":\"CraftingMaterial\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":34,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19942,\"icon\":\"https://render.guildwars2.com/file/FCD468B2559E96DA9D060F4341AE7010B37AED26/434371.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19943() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Honed Steel Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Power and +Ferocity.\",\"type\":\"CraftingMaterial\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":34,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19943,\"icon\":\"https://render.guildwars2.com/file/0C4E64933D3EC573735A450098A092AE241A5BAA/434372.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19944() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hunter's Steel Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Precision and +Power.\",\"type\":\"CraftingMaterial\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":34,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19944,\"icon\":\"https://render.guildwars2.com/file/5B79ED901748FB01D2D3D0230DDA9D541CA79153/434373.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19945() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Strong Steel Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Power and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":34,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19945,\"icon\":\"https://render.guildwars2.com/file/DA5A52C1C7194F00627E08CFD8C345F3F70CA155/434374.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19946() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vigorous Steel Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Power and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":34,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19946,\"icon\":\"https://render.guildwars2.com/file/383ABB4A3A93750D3B24547ED1066C000D0D1E6D/434375.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}