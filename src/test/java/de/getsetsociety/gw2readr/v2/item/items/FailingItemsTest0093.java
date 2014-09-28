package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0093 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem23146() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Berserker's Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":68,\"rarity\":\"Masterwork\",\"vendor_value\":228,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23146,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":57},{\"attribute\":\"Precision\",\"modifier\":41},{\"attribute\":\"CritDamage\",\"modifier\":41}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23147() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Penetrating Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":33,\"rarity\":\"Masterwork\",\"vendor_value\":132,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23147,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":22},{\"attribute\":\"CritDamage\",\"modifier\":16}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23148() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Berserker's Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":62,\"rarity\":\"Masterwork\",\"vendor_value\":212,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23148,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":50},{\"attribute\":\"Precision\",\"modifier\":36},{\"attribute\":\"CritDamage\",\"modifier\":36}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23149() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Berserker's Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":74,\"rarity\":\"Masterwork\",\"vendor_value\":244,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23149,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":65},{\"attribute\":\"Precision\",\"modifier\":46},{\"attribute\":\"CritDamage\",\"modifier\":46}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23150() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Penetrating Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":27,\"rarity\":\"Masterwork\",\"vendor_value\":112,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23150,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":18},{\"attribute\":\"CritDamage\",\"modifier\":13}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23151() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Penetrating Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":39,\"rarity\":\"Masterwork\",\"vendor_value\":148,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23151,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":27},{\"attribute\":\"CritDamage\",\"modifier\":19}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23152() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carrion Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":69,\"rarity\":\"Masterwork\",\"vendor_value\":232,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23152,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":58},{\"attribute\":\"Power\",\"modifier\":42},{\"attribute\":\"Vitality\",\"modifier\":42}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23153() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Penetrating Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":57,\"rarity\":\"Masterwork\",\"vendor_value\":200,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23153,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":45},{\"attribute\":\"CritDamage\",\"modifier\":32}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23154() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carrion Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":264,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23154,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":73},{\"attribute\":\"Power\",\"modifier\":52},{\"attribute\":\"Vitality\",\"modifier\":52}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23155() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Penetrating Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":51,\"rarity\":\"Masterwork\",\"vendor_value\":180,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23155,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":38},{\"attribute\":\"CritDamage\",\"modifier\":27}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23156() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carrion Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":63,\"rarity\":\"Masterwork\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23156,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":51},{\"attribute\":\"Power\",\"modifier\":36},{\"attribute\":\"Vitality\",\"modifier\":36}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23157() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carrion Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Masterwork\",\"vendor_value\":248,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23157,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":66},{\"attribute\":\"Power\",\"modifier\":47},{\"attribute\":\"Vitality\",\"modifier\":47}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23158() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Strong Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":222,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23158,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":29},{\"attribute\":\"Precision\",\"modifier\":21}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23159() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Penetrating Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":47,\"rarity\":\"Rare\",\"vendor_value\":252,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23159,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":37},{\"attribute\":\"CritDamage\",\"modifier\":26}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23160() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Strong Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":53,\"rarity\":\"Rare\",\"vendor_value\":282,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23160,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":43},{\"attribute\":\"Precision\",\"modifier\":31}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23161() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Penetrating Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":54,\"rarity\":\"Rare\",\"vendor_value\":282,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23161,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":44},{\"attribute\":\"CritDamage\",\"modifier\":32}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23162() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Honed Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":55,\"rarity\":\"Rare\",\"vendor_value\":288,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23162,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":46},{\"attribute\":\"CritDamage\",\"modifier\":33}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23163() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Strong Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":60,\"rarity\":\"Rare\",\"vendor_value\":312,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23163,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":52},{\"attribute\":\"Precision\",\"modifier\":37}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23164() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carrion Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":61,\"rarity\":\"Rare\",\"vendor_value\":312,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23164,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":53},{\"attribute\":\"Power\",\"modifier\":38},{\"attribute\":\"Vitality\",\"modifier\":38}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23165() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rampager's Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":62,\"rarity\":\"Rare\",\"vendor_value\":318,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23165,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":39},{\"attribute\":\"Precision\",\"modifier\":54},{\"attribute\":\"ConditionDamage\",\"modifier\":39}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23166() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Berserker's Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":67,\"rarity\":\"Rare\",\"vendor_value\":336,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23166,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":60},{\"attribute\":\"Precision\",\"modifier\":43},{\"attribute\":\"CritDamage\",\"modifier\":43}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23167() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carrion Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":68,\"rarity\":\"Rare\",\"vendor_value\":342,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23167,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":62},{\"attribute\":\"Power\",\"modifier\":44},{\"attribute\":\"Vitality\",\"modifier\":44}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23168() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rampager's Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":69,\"rarity\":\"Rare\",\"vendor_value\":348,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23168,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":45},{\"attribute\":\"Precision\",\"modifier\":63},{\"attribute\":\"ConditionDamage\",\"modifier\":45}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23169() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Shaman's Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":70,\"rarity\":\"Rare\",\"vendor_value\":354,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23169,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":65},{\"attribute\":\"ConditionDamage\",\"modifier\":46},{\"attribute\":\"Healing\",\"modifier\":46}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23170() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Berserker's Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":74,\"rarity\":\"Rare\",\"vendor_value\":366,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23170,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":70},{\"attribute\":\"Precision\",\"modifier\":50},{\"attribute\":\"CritDamage\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}