package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0091 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem23028() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Master Mining Pick\",\"description\":\"More efficient at gathering resources and uncovering rare components.\",\"type\":\"Gathering\",\"level\":60,\"rarity\":\"Masterwork\",\"vendor_value\":108,\"default_skin\":2395,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":23028,\"icon\":\"https://render.guildwars2.com/file/3CD995B576C8CB39B02D4826EA04690701755ECB/66254.png\",\"details\":{\"type\":\"Mining\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23029() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Copper Harvesting Sickle\",\"description\":\"Used to gather Blueberries, Button Mushrooms, Onions, Carrots, Herb Seedlings, Potatoes, and Lettuce.\",\"type\":\"Gathering\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"default_skin\":2385,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":23029,\"icon\":\"https://render.guildwars2.com/file/AA1BD042F1EAB6A0F5D614DC6113E356C4B836C1/66591.png\",\"details\":{\"type\":\"Foraging\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23030() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Copper Logging Axe\",\"description\":\"Used to chop down Aspen Saplings, Kertch Saplings, and Ekku saplings.\",\"type\":\"Gathering\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"default_skin\":2388,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":23030,\"icon\":\"https://render.guildwars2.com/file/201CC6E60448CB4BA8AD919C74904EE1F9AEC54F/66597.png\",\"details\":{\"type\":\"Logging\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23031() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Copper Mining Pick\",\"description\":\"Used to mine Copper Ore.\",\"type\":\"Gathering\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"default_skin\":2395,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":23031,\"icon\":\"https://render.guildwars2.com/file/3CD995B576C8CB39B02D4826EA04690701755ECB/66254.png\",\"details\":{\"type\":\"Mining\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23032() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Master Harvesting Sickle\",\"description\":\"More efficient at gathering resources and uncovering rare components.\",\"type\":\"Gathering\",\"level\":15,\"rarity\":\"Masterwork\",\"vendor_value\":44,\"default_skin\":2385,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":23032,\"icon\":\"https://render.guildwars2.com/file/AA1BD042F1EAB6A0F5D614DC6113E356C4B836C1/66591.png\",\"details\":{\"type\":\"Foraging\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23033() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Master Logging Axe\",\"description\":\"More efficient at gathering resources and uncovering rare components.\",\"type\":\"Gathering\",\"level\":15,\"rarity\":\"Masterwork\",\"vendor_value\":44,\"default_skin\":2388,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":23033,\"icon\":\"https://render.guildwars2.com/file/201CC6E60448CB4BA8AD919C74904EE1F9AEC54F/66597.png\",\"details\":{\"type\":\"Logging\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23034() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Master Mining Pick\",\"description\":\"More efficient at gathering resources and uncovering rare components.\",\"type\":\"Gathering\",\"level\":15,\"rarity\":\"Masterwork\",\"vendor_value\":44,\"default_skin\":2395,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":23034,\"icon\":\"https://render.guildwars2.com/file/3CD995B576C8CB39B02D4826EA04690701755ECB/66254.png\",\"details\":{\"type\":\"Mining\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23038() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Crude Salvage Kit\",\"description\":\"Double-click to salvage crafting materials from an item in your inventory. Has a small chance of recovering upgrades from items.\",\"type\":\"Tool\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":23038,\"icon\":\"https://render.guildwars2.com/file/9F09ACD431CE4906631E271E650ABB0454F90705/63123.png\",\"details\":{\"type\":\"Salvage\",\"charges\":15}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23040() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Basic Salvage Kit\",\"description\":\"Double-click to salvage crafting materials from an item in your inventory. 10% chance of rarer materials. 20% chance of recovering upgrades.\",\"type\":\"Tool\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":23040,\"icon\":\"https://render.guildwars2.com/file/F0B4025A23D3D1ADE0466FFEAA7023D8EFD8422C/66765.png\",\"details\":{\"type\":\"Salvage\",\"charges\":25}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23041() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Fine Salvage Kit\",\"description\":\"Double-click to salvage crafting materials from an item in your inventory. 15% chance of rarer materials. 40% chance of recovering upgrades.\",\"type\":\"Tool\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":36,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":23041,\"icon\":\"https://render.guildwars2.com/file/CA01D91B20EB19359FFF313C6DC5C2480A0872B0/66766.png\",\"details\":{\"type\":\"Salvage\",\"charges\":25}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23042() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Journeyman's Salvage Kit\",\"description\":\"Double-click to salvage crafting materials from an item in your inventory. 20% chance of rarer materials. 60% chance of recovering upgrades.\",\"type\":\"Tool\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":100,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":23042,\"icon\":\"https://render.guildwars2.com/file/7902452AAF4824D66ED0A914CB1C0864D33A116F/66767.png\",\"details\":{\"type\":\"Salvage\",\"charges\":25}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23045() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mystic Salvage Kit\",\"description\":\"Double-click to salvage crafting materials from an item in your inventory. 25% chance of rarer materials. 80% chance of recovering upgrades from items.\",\"type\":\"Tool\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":192,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":23045,\"icon\":\"https://render.guildwars2.com/file/9F09ACD431CE4906631E271E650ABB0454F90705/63123.png\",\"details\":{\"type\":\"Salvage\",\"charges\":250}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23046() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"PvP Salvage Kit\",\"description\":\"Double-click to salvage materials from a PvP reward item in your inventory. These materials can be recombined in the Mystic Forge.\",\"type\":\"Tool\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSell\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23046,\"icon\":\"https://render.guildwars2.com/file/9F09ACD431CE4906631E271E650ABB0454F90705/63123.png\",\"details\":{\"type\":\"Salvage\",\"charges\":15}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23092() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Blue Coral Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":15,\"rarity\":\"Fine\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":23092,\"icon\":\"https://render.guildwars2.com/file/F72942065C9028739427806FA89AA69E1526F13A/66769.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23093() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Purple Coral Ring\",\"type\":\"Trinket\",\"level\":15,\"rarity\":\"Masterwork\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23093,\"icon\":\"https://render.guildwars2.com/file/D9127171A2330B0B7C19C1EE3E2B58C20ABC6657/66770.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23094() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"White Coral Ring\",\"type\":\"Trinket\",\"level\":15,\"rarity\":\"Basic\",\"vendor_value\":17,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":23094,\"icon\":\"https://render.guildwars2.com/file/7DFD0F47B8EF9D929904EA655C0CE6FA4D245F11/66771.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23095() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Triforge Pendant\",\"description\":\"\\\"True greatness comes for those who have wisdom to do right, the courage to embark, and the power to follow through.\\\" -Logan Thackeray\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":528,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23095,\"icon\":\"https://render.guildwars2.com/file/E60B5A47DA0A9702580267066637C2DBE071E8D6/222402.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":42},{\"attribute\":\"Precision\",\"modifier\":42},{\"attribute\":\"Toughness\",\"modifier\":42},{\"attribute\":\"Vitality\",\"modifier\":42},{\"attribute\":\"Healing\",\"modifier\":42},{\"attribute\":\"ConditionDamage\",\"modifier\":42},{\"attribute\":\"CritDamage\",\"modifier\":42}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23096() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Emerald Pendant\",\"description\":\"True courage understands the importance of fear.\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":528,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23096,\"icon\":\"https://render.guildwars2.com/file/B866BC350C206B007C06B61E65ADE60D28EA016E/222404.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":90},{\"attribute\":\"Toughness\",\"modifier\":64},{\"attribute\":\"Vitality\",\"modifier\":64}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23097() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ruby Pendant\",\"description\":\"True power comes from the heart.\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":528,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23097,\"icon\":\"https://render.guildwars2.com/file/ED460DE2CFE378F9C27E0C9876AFC009D62406C0/222406.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":90},{\"attribute\":\"Precision\",\"modifier\":64},{\"attribute\":\"CritDamage\",\"modifier\":64}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23098() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sapphire Pendant\",\"description\":\"Wisdom comes with experience, not age.\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":528,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23098,\"icon\":\"https://render.guildwars2.com/file/2F110FE312A1FB3D094C0DF330211C2654A20EDD/222400.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":90},{\"attribute\":\"ConditionDamage\",\"modifier\":64},{\"attribute\":\"Healing\",\"modifier\":64}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23099() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orange Lucky Rabbit's Foot\",\"description\":\"<c=@flavor>\\\"This rabbit died of natural causes!\\\"<br>—Dena</c>\",\"type\":\"Trinket\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23099,\"icon\":\"https://render.guildwars2.com/file/4EC8344C64B3A074E90DF8BAA1FA7D2D11660B7E/66778.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23100() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Blue Lucky Rabbit's Foot\",\"description\":\"<c=@flavor>\\\"This rabbit died of natural causes!\\\"<br>—Dena</c>\",\"type\":\"Trinket\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23100,\"icon\":\"https://render.guildwars2.com/file/0F98D8071FEB0D7010AAE2E6F5BC9F1706E04191/66780.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23101() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Red Lucky Rabbit's Foot\",\"description\":\"<c=@flavor>\\\"This rabbit died of natural causes!\\\"<br>—Dena</c>\",\"type\":\"Trinket\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23101,\"icon\":\"https://render.guildwars2.com/file/3F9C0D7C01E13538201594D19EA9115D2D4AD76D/66781.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23102() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Purple Lucky Rabbit's Foot\",\"description\":\"<c=@flavor>\\\"This rabbit died of natural causes!\\\"<br>—Dena</c>\",\"type\":\"Trinket\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23102,\"icon\":\"https://render.guildwars2.com/file/2EA425194C09AF19767D760E50CA420DF7E36AED/66783.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23103() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Yellow Lucky Rabbit's Foot\",\"description\":\"<c=@flavor>\\\"This rabbit died of natural causes!\\\"<br>—Dena</c>\",\"type\":\"Trinket\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23103,\"icon\":\"https://render.guildwars2.com/file/E96CD62B46D140D429E1B55E0AF7A1DAFFD112D4/66784.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}