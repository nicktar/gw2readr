package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0073 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem19897() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carrion Mithril Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Condition Damage, +Power, and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19897,\"icon\":\"https://render.guildwars2.com/file/FF97D8634CA694CCB55D3AF9B2E64144D55E5E11/66028.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19898() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cleric's Mithril Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Healing Power, +Power, and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19898,\"icon\":\"https://render.guildwars2.com/file/35EB4C9BBB459B0A220B050253CCC9FFFED6C4A9/340429.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19899() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Assassin's Mithril Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Precision, +Power, and +Ferocity.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19899,\"icon\":\"https://render.guildwars2.com/file/F494B5672CADF02546F20F2E6704972D2035B64C/340466.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19900() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Berserker's Mithril Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Power, +Ferocity, and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19900,\"icon\":\"https://render.guildwars2.com/file/433A0372D7FD3A3100EEE6DFDE1A1A9774F049A9/65970.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19901() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rampager's Mithril Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Precision, +Condition Damage, and +Power.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19901,\"icon\":\"https://render.guildwars2.com/file/7D5EC6D40473910BA8D7194C4BE15EDCB7CEF8B6/65975.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19902() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Knight's Mithril Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Toughness, +Power, and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19902,\"icon\":\"https://render.guildwars2.com/file/B7DDF69D762A9B18B497EBE304E247C9079FF51E/340468.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19903() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Valkyrie Mithril Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Power, +Ferocity, and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19903,\"icon\":\"https://render.guildwars2.com/file/BA0E14B6A36752745197D3FC473F49F54051CBB5/340433.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19904() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carrion Linen Insignia\",\"description\":\"Used in the crafting of armor with +Condition Damage, +Power, and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":15,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19904,\"icon\":\"https://render.guildwars2.com/file/0B07DEAE045DA317B4023103D26036EFEFAD6B72/340488.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19905() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Knight's Linen Insignia\",\"description\":\"Used in the crafting of armor with +Toughness, +Power, and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19905,\"icon\":\"https://render.guildwars2.com/file/3AE15090B4792EC3BEC2582C56D3C60266D89815/340489.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19906() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Valkyrie Linen Insignia\",\"description\":\"Used in the crafting of armor with +Power, +Ferocity, and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":15,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19906,\"icon\":\"https://render.guildwars2.com/file/4E3F0ABE372506CA3C787D8050AE315A211A011B/340490.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19907() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carrion Embroidered Linen Insignia\",\"description\":\"Used in the crafting of armor with +Condition Damage, +Power, and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19907,\"icon\":\"https://render.guildwars2.com/file/07B83D61A0BD72070DDD32E624D8AA3560A00F76/340491.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19908() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Knight's Embroidered Linen Insignia\",\"description\":\"Used in the crafting of armor with +Toughness, +Power, and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19908,\"icon\":\"https://render.guildwars2.com/file/F22F09C198053F0855BFCD3456AF962774BA331A/340492.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19909() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Valkyrie Embroidered Linen Insignia\",\"description\":\"Used in the crafting of armor with +Power, +Ferocity, and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19909,\"icon\":\"https://render.guildwars2.com/file/0B084811F6B991B1D4450E55A10BF2B42A20FB14/340493.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19910() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carrion Intricate Gossamer Insignia\",\"description\":\"Used in the crafting of armor with +Condition Damage, +Power, and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19910,\"icon\":\"https://render.guildwars2.com/file/A86D9B0A1347403269C580B3C405070D695045BB/434355.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19911() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cleric's Intricate Gossamer Insignia\",\"description\":\"Used in the crafting of armor with +Healing Power, +Power, and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19911,\"icon\":\"https://render.guildwars2.com/file/9206D1B2080668D30A3035F122EC08A5E4691ADB/434356.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19912() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Assassin's Intricate Gossamer Insignia\",\"description\":\"Used in the crafting of armor with +Precision, +Power, and +Ferocity.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19912,\"icon\":\"https://render.guildwars2.com/file/9C9CE90AFF4A0507491DFA071FE242FB1EDFE9FF/699283.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19913() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Berserker's Intricate Gossamer Insignia\",\"description\":\"Used in the crafting of armor with +Power, +Ferocity, and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19913,\"icon\":\"https://render.guildwars2.com/file/E25A066F0509A91A382E0235360276BEB91A68E0/434358.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19914() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rampager's Intricate Gossamer Insignia\",\"description\":\"Used in the crafting of armor with +Precision, +Condition Damage, and +Power.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19914,\"icon\":\"https://render.guildwars2.com/file/FED3CBCEA87D145E0A2C80D2276F3051F9995D1A/434359.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19915() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Knight's Intricate Gossamer Insignia\",\"description\":\"Used in the crafting of armor with +Toughness, +Power, and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19915,\"icon\":\"https://render.guildwars2.com/file/BFD0077336F91771530D59F46B7AEC1EFBF12BFA/434360.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19916() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Valkyrie Intricate Gossamer Insignia\",\"description\":\"Used in the crafting of armor with +Power, +Ferocity, and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19916,\"icon\":\"https://render.guildwars2.com/file/34E062BDAD050B073B26580E3000232EB005963A/434361.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19917() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carrion Orichalcum Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Condition Damage, +Power, and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19917,\"icon\":\"https://render.guildwars2.com/file/CA24F644F50DC5AD4E69AB0E5430473F154731EB/340494.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19918() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cleric's Orichalcum Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Healing Power, +Power, and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19918,\"icon\":\"https://render.guildwars2.com/file/F07DACB30D43770708D2C6380E6D522778B41190/340495.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19919() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Assassin's Orichalcum Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Precision, +Power, and +Ferocity.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19919,\"icon\":\"https://render.guildwars2.com/file/A79A3A61A31898C79ADBA041442446CE7F4A03CF/631471.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19920() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Berserker's Orichalcum Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Power, +Ferocity, and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19920,\"icon\":\"https://render.guildwars2.com/file/46B662E128E45C2D7C04EFBD2265689AA9651E5B/340497.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19921() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rampager's Orichalcum Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Precision, +Condition Damage, and +Power.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19921,\"icon\":\"https://render.guildwars2.com/file/E12D1750F8D5730FBF0723A3204F6A15199A0DF7/340498.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}