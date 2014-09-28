package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0092 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem23104() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Green Lucky Rabbit's Foot\",\"description\":\"<c=@flavor>\\\"This rabbit died of natural causes!\\\"<br>—Dena</c>\",\"type\":\"Trinket\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23104,\"icon\":\"https://render.guildwars2.com/file/15BCE4A6FC0EA8FBFB7CA437CC41226728FC9433/66785.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23105() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Swift Griffon Necklace\",\"description\":\"\",\"type\":\"Trinket\",\"level\":40,\"rarity\":\"Rare\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23105,\"icon\":\"https://render.guildwars2.com/file/AA26E9092621670E6C55A65307B7F43C0CC5F138/63595.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":28},{\"attribute\":\"CritDamage\",\"modifier\":20}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23106() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Insightful Griffon Necklace\",\"description\":\"\",\"type\":\"Trinket\",\"level\":40,\"rarity\":\"Rare\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23106,\"icon\":\"https://render.guildwars2.com/file/AA26E9092621670E6C55A65307B7F43C0CC5F138/63595.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":28},{\"attribute\":\"Power\",\"modifier\":20}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23107() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mighty Griffon Necklace\",\"description\":\"\",\"type\":\"Trinket\",\"level\":40,\"rarity\":\"Rare\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23107,\"icon\":\"https://render.guildwars2.com/file/AA26E9092621670E6C55A65307B7F43C0CC5F138/63595.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":28},{\"attribute\":\"ConditionDamage\",\"modifier\":20}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23108() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Topaz Heart\",\"description\":\"\",\"type\":\"Trinket\",\"level\":9,\"rarity\":\"Basic\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23108,\"icon\":\"https://render.guildwars2.com/file/7056017FCDF3E273CB3F2ECE66DBE435B25B7631/66786.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23109() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carnelian Heart\",\"description\":\"\",\"type\":\"Trinket\",\"level\":9,\"rarity\":\"Basic\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23109,\"icon\":\"https://render.guildwars2.com/file/B79A06ABD63013093A4ABC380425A439AE48A967/66787.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23110() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ruby Heart\",\"description\":\"\",\"type\":\"Trinket\",\"level\":9,\"rarity\":\"Basic\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23110,\"icon\":\"https://render.guildwars2.com/file/9B2F7DF8C5BE57A257D16FB64AD474B63F1FC2AE/66788.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23111() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Emerald Heart\",\"description\":\"\",\"type\":\"Trinket\",\"level\":9,\"rarity\":\"Basic\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23111,\"icon\":\"https://render.guildwars2.com/file/927747D7FF36EC5D7807AA80FF307D0A6D78F661/66789.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23112() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Amethyst Heart\",\"description\":\"\",\"type\":\"Trinket\",\"level\":9,\"rarity\":\"Basic\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23112,\"icon\":\"https://render.guildwars2.com/file/D82CC45CC9B206AADFD6A9F392426B75115D794B/66790.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23113() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sapphire Heart\",\"description\":\"\",\"type\":\"Trinket\",\"level\":9,\"rarity\":\"Basic\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23113,\"icon\":\"https://render.guildwars2.com/file/C00439EF2BE3B9E5F86299D9F47E32C0D40AD6C4/63109.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23117() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Whisper's Power\",\"type\":\"Trinket\",\"level\":28,\"rarity\":\"Masterwork\",\"vendor_value\":116,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23117,\"icon\":\"https://render.guildwars2.com/file/B9595BAFC57D70621D0A0C745C6E475FC540707C/66230.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":18},{\"attribute\":\"ConditionDamage\",\"modifier\":13}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23120() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vigil's Might\",\"type\":\"Trinket\",\"level\":28,\"rarity\":\"Masterwork\",\"vendor_value\":116,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23120,\"icon\":\"https://render.guildwars2.com/file/B9595BAFC57D70621D0A0C745C6E475FC540707C/66230.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":18},{\"attribute\":\"ConditionDamage\",\"modifier\":13}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23123() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Priory Pride\",\"type\":\"Trinket\",\"level\":28,\"rarity\":\"Masterwork\",\"vendor_value\":116,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23123,\"icon\":\"https://render.guildwars2.com/file/B9595BAFC57D70621D0A0C745C6E475FC540707C/66230.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":18},{\"attribute\":\"ConditionDamage\",\"modifier\":13}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23131() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Copper Cowbell\",\"description\":\"A sturdy cowbell.\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Fine\",\"vendor_value\":28,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23131,\"icon\":\"https://render.guildwars2.com/file/4A623D4E30B908406605930BA89551D9ECF7B4D5/66797.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23134() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Silver Cowbell\",\"description\":\"\\\"I gotta have more cowbell, baby!\\\"\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":55,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23134,\"icon\":\"https://render.guildwars2.com/file/5C514FC25F020AFD4018ADEF0C01D2BA50F5DF77/66799.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23136() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mighty Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":14,\"rarity\":\"Masterwork\",\"vendor_value\":76,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23136,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":10}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23137() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mighty Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":96,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23137,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":13}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23138() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Strong Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":26,\"rarity\":\"Masterwork\",\"vendor_value\":112,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23138,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":17},{\"attribute\":\"Precision\",\"modifier\":12}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23139() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Strong Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":32,\"rarity\":\"Masterwork\",\"vendor_value\":128,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23139,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":21},{\"attribute\":\"Precision\",\"modifier\":15}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23140() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Strong Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":44,\"rarity\":\"Masterwork\",\"vendor_value\":160,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23140,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":31},{\"attribute\":\"Precision\",\"modifier\":22}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23141() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Strong Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":56,\"rarity\":\"Masterwork\",\"vendor_value\":196,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23141,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":43},{\"attribute\":\"Precision\",\"modifier\":31}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23142() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Strong Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":38,\"rarity\":\"Masterwork\",\"vendor_value\":144,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23142,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":26},{\"attribute\":\"Precision\",\"modifier\":18}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23143() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Strong Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":180,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23143,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":37},{\"attribute\":\"Precision\",\"modifier\":26}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23144() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Berserker's Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":264,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23144,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":73},{\"attribute\":\"Precision\",\"modifier\":52},{\"attribute\":\"CritDamage\",\"modifier\":52}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23145() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Precise Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":45,\"rarity\":\"Masterwork\",\"vendor_value\":164,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23145,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":32}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}