package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0072 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem19872() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ravaging Wool Insignia\",\"description\":\"Used in the crafting of armor with +Condition Damage and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19872,\"icon\":\"https://render.guildwars2.com/file/C198A7D464DAF04D197431ACD6F31BCB0913172E/220479.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19873() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ravaging Embroidered Wool Insignia\",\"description\":\"Used in the crafting of armor with +Condition Damage and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":17,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19873,\"icon\":\"https://render.guildwars2.com/file/687B323E0A1E964241D215E01976176D38B49144/220480.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19874() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hearty Wool Insignia\",\"description\":\"Used in the crafting of armor with +Vitality and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19874,\"icon\":\"https://render.guildwars2.com/file/0DC0993F3CD724C629A8A880D8F26B9313C812AB/340478.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19875() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hearty Embroidered Wool Insignia\",\"description\":\"Used in the crafting of armor with +Vitality and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":17,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19875,\"icon\":\"https://render.guildwars2.com/file/1BDA777E2E7BFEC845010366C607B9B636247FF5/220481.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19876() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Assassin's Linen Insignia\",\"description\":\"Used in the crafting of armor with +Precision, +Power, and +Ferocity.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":13,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19876,\"icon\":\"https://render.guildwars2.com/file/F7756273F47016E30DD3F647F9019AE3B6DCFECF/340479.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19877() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cleric's Embroidered Linen Insignia\",\"description\":\"Used in the crafting of armor with +Healing Power, +Power, and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":27,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19877,\"icon\":\"https://render.guildwars2.com/file/715D451FB50B9ACF093105BB003CD9EF040259D8/340480.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19878() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Assassin's Embroidered Linen Insignia\",\"description\":\"Used in the crafting of armor with +Precision, +Power, and +Ferocity.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":27,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19878,\"icon\":\"https://render.guildwars2.com/file/23DC68AE9765C6E0F83E7E720821EF72A65BA31C/340481.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19879() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rampager's Embroidered Linen Insignia\",\"description\":\"Used in the crafting of armor with +Precision, +Condition Damage, and +Power.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":27,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19879,\"icon\":\"https://render.guildwars2.com/file/489722BF0DCB0AAF537FD0296C3A5C1CF23502B1/340482.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19880() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carrion Intricate Silk Insignia\",\"description\":\"Used in the crafting of armor with +Condition Damage, +Power, and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19880,\"icon\":\"https://render.guildwars2.com/file/C9C2D975E1047145ACEBF2AAB86CAEBB07B20C2D/434344.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19881() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cleric's Intricate Silk Insignia\",\"description\":\"Used in the crafting of armor with +Healing Power, +Power, and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19881,\"icon\":\"https://render.guildwars2.com/file/3DEB69AA9619D19952C74FF1642DB245B6F42A5A/434345.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19882() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Assassin's Intricate Silk Insignia\",\"description\":\"Used in the crafting of armor with +Precision, +Power, and +Ferocity.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19882,\"icon\":\"https://render.guildwars2.com/file/D3024E65FFFEA3C6034A23FFDF615F0A0691AF5B/434346.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19883() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Berserker's Intricate Silk Insignia\",\"description\":\"Used in the crafting of armor with +Power, +Ferocity, and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19883,\"icon\":\"https://render.guildwars2.com/file/F6AA9B9F7D4ED35217A96900AED4D16545721B91/434347.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19884() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rampager's Intricate Silk Insignia\",\"description\":\"Used in the crafting of armor with +Precision, +Condition Damage, and +Power.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19884,\"icon\":\"https://render.guildwars2.com/file/7EB5D1AB4C1CE4ACA57A1AEEBE74E7C7EA4A7C45/434348.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19885() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Knight's Intricate Silk Insignia\",\"description\":\"Used in the crafting of armor with +Toughness, +Power, and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19885,\"icon\":\"https://render.guildwars2.com/file/A1CF902A51CA7F5FCD0299F479F0F5F5BCA2A1B3/434349.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19886() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Valkyrie Intricate Silk Insignia\",\"description\":\"Used in the crafting of armor with +Power, +Ferocity, and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19886,\"icon\":\"https://render.guildwars2.com/file/E87B3AA1321EBB41CE77730ABC03A1547A165532/434350.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19887() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Malign Green Inscription\",\"description\":\"Used in the crafting of weapons with +Condition Damage.\",\"type\":\"CraftingMaterial\",\"level\":10,\"rarity\":\"Fine\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19887,\"icon\":\"https://render.guildwars2.com/file/26C1362C010B306FF55706A410CFED6D7BD0F15A/66037.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19888() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Malign Bronze Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Condition Damage.\",\"type\":\"CraftingMaterial\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":12,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19888,\"icon\":\"https://render.guildwars2.com/file/405F565D23D30F4C58FC36C00D2610BC0A0E3FF5/66038.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19889() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Healing Bronze Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Healing Power.\",\"type\":\"CraftingMaterial\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":12,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19889,\"icon\":\"https://render.guildwars2.com/file/C49DB908ECDDAE725CA844ECD0710E2776FCE5CE/66039.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19890() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ravaging Iron Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Condition Damage and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":17,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19890,\"icon\":\"https://render.guildwars2.com/file/0CDF3BF11398D0E93FD9F50B525E73157DE4F8C3/66040.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19891() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hearty Iron Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Vitality and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":17,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19891,\"icon\":\"https://render.guildwars2.com/file/333E107FB101512319BDDC7AC02509F9BB0F54EC/66041.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19892() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ravaging Soft Inscription\",\"description\":\"Used in the crafting of weapons with +Condition Damage and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":25,\"rarity\":\"Fine\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19892,\"icon\":\"https://render.guildwars2.com/file/37FA3060E34C13E702A04880ECF0AC2B777953BE/66042.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19893() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cleric's Darksteel Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Healing Power, +Power, and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":28,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19893,\"icon\":\"https://render.guildwars2.com/file/319A399932CAC3B3DCCBA40C15D473170228DA68/340484.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19894() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Assassin's Darksteel Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Precision, +Power, and +Ferocity.\",\"type\":\"CraftingMaterial\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":28,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19894,\"icon\":\"https://render.guildwars2.com/file/3833B8F0B0D5F6950CD5BB595FDD566E6A497F51/340485.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19895() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rampager's Darksteel Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Precision, +Condition Damage, and +Power.\",\"type\":\"CraftingMaterial\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":28,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19895,\"icon\":\"https://render.guildwars2.com/file/F4624FB3E2961BEC2408DC1F7C45B43ADFAAC7F5/66045.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19896() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Assassin's Hard Inscription\",\"description\":\"Used in the crafting of weapons with +Precision, +Power, and +Ferocity.\",\"type\":\"CraftingMaterial\",\"level\":60,\"rarity\":\"Fine\",\"vendor_value\":13,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19896,\"icon\":\"https://render.guildwars2.com/file/F1C02805C412FA5D9C0014AEABA20696800F6E0E/340487.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}