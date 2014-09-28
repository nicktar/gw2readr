package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0277 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem63680() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Novice's Bag of Crafting Supplies\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":63680,\"icon\":\"https://render.guildwars2.com/file/C007CABA2A4CA303B10C733246C352276D080762/619524.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem63690() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Journeyman's Bag of Crafting Supplies\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":63690,\"icon\":\"https://render.guildwars2.com/file/C007CABA2A4CA303B10C733246C352276D080762/619524.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem63691() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Master's Bag of Crafting Supplies\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":63691,\"icon\":\"https://render.guildwars2.com/file/C007CABA2A4CA303B10C733246C352276D080762/619524.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem63713() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Adept's Bag of Crafting Supplies\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":63713,\"icon\":\"https://render.guildwars2.com/file/C007CABA2A4CA303B10C733246C352276D080762/619524.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem63714() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Expert's Bag of Crafting Supplies\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":63714,\"icon\":\"https://render.guildwars2.com/file/C007CABA2A4CA303B10C733246C352276D080762/619524.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem63847() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Liberator of Lion's Arch Chest\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":63847,\"icon\":\"https://render.guildwars2.com/file/1C05EB01613D5F494D0F63D94262E6026E24C954/740280.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem63862() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ornate Watchwork Box\",\"description\":\"A reward bag for a good deed.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":63862,\"icon\":\"https://render.guildwars2.com/file/365B90C31CE0EFECC8B3EFA807D27D2B3AA70323/740279.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem63870() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minis 3-Pack (Set 3)\",\"description\":\"Double-click to receive 3 randomly selected Minis (2 common and 1 uncommon) to add to your collection.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":63870,\"icon\":\"https://render.guildwars2.com/file/AF0C0F3E296A13C4F1E3D2FA72DF9D05DEE29CD0/771009.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem63872() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Llama\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":63872,\"icon\":\"https://render.guildwars2.com/file/046CCFBB2A9AFF53A9C3FFE9BD5D90C7F805B912/831435.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem63899() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Strider's Medium Armor Skin\",\"description\":\"This full set of medium armor skins can replace the appearance of medium armor pieces, once per slot. The skins will also be unlocked in your account wardrobe.\n\nSkins have no stats of their own.\nCan only be used by characters who wear medium armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":63899,\"icon\":\"https://render.guildwars2.com/file/0693AAC360F6689E32A001DB94F10D2BD10D53C1/780246.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem63909() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Incarnate Light Armor Skin\",\"description\":\"This full set of light armor skins can replace the appearance of light armor pieces, once per slot. The skins will also be unlocked in your account wardrobe.\n\nSkins have no stats of their own.\nCan only be used by characters who wear light armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":63909,\"icon\":\"https://render.guildwars2.com/file/56DE0A4536614858401C62C33C9EA044A592B2D1/780247.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem63929() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rampart Heavy Armor Skin\",\"description\":\"This full set of heavy armor skins can replace the appearance of heavy armor pieces, once per slot. The skins will also be unlocked in your account wardrobe.\n\nSkins have no stats of their own.\nCan only be used by characters who wear heavy armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":63929,\"icon\":\"https://render.guildwars2.com/file/4CF1A392BF377AA7170B1D7B2C3278ED9701C2DB/780253.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64101() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Copper Logging Axe\",\"description\":\"Used to chop down Aspen Saplings, Kertch Saplings, and Ekku saplings.\",\"type\":\"Gathering\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"default_skin\":2388,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64101,\"icon\":\"https://render.guildwars2.com/file/201CC6E60448CB4BA8AD919C74904EE1F9AEC54F/66597.png\",\"details\":{\"type\":\"Logging\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64114() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Copper Harvesting Sickle\",\"description\":\"Used to gather Blueberries, Button Mushrooms, Onions, Carrots, Herb Seedlings, Potatoes, and Lettuce.\",\"type\":\"Gathering\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"default_skin\":2385,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64114,\"icon\":\"https://render.guildwars2.com/file/AA1BD042F1EAB6A0F5D614DC6113E356C4B836C1/66591.png\",\"details\":{\"type\":\"Foraging\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64115() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Copper Mining Pick\",\"description\":\"Used to mine Copper Ore.\",\"type\":\"Gathering\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"default_skin\":2395,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64115,\"icon\":\"https://render.guildwars2.com/file/3CD995B576C8CB39B02D4826EA04690701755ECB/66254.png\",\"details\":{\"type\":\"Mining\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64127() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":17,\"rarity\":\"Masterwork\",\"vendor_value\":63,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":64127,\"icon\":\"https://render.guildwars2.com/file/16B2A4F155EB737271041C79124F2BDC537300D2/63603.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":9}]},\"suffix_item_id\":24464,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64128() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":17,\"rarity\":\"Masterwork\",\"vendor_value\":63,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":64128,\"icon\":\"https://render.guildwars2.com/file/16B2A4F155EB737271041C79124F2BDC537300D2/63603.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":9}]},\"suffix_item_id\":24534,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64129() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hardy Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":96,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":64129,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":13}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64130() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mighty Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":96,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":64130,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":13}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64131() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carrion Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":96,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":64131,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":13}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64133() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":17,\"rarity\":\"Masterwork\",\"vendor_value\":63,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":64133,\"icon\":\"https://render.guildwars2.com/file/16B2A4F155EB737271041C79124F2BDC537300D2/63603.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":9}]},\"suffix_item_id\":24466,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64141() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Powerful Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":46,\"rarity\":\"Rare\",\"vendor_value\":252,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":64141,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":36},{\"attribute\":\"Power\",\"modifier\":26}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64142() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Powerful Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":47,\"rarity\":\"Rare\",\"vendor_value\":189,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":64142,\"icon\":\"https://render.guildwars2.com/file/0A402568104F5BE5BC644665653302005F6266CF/66800.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":28},{\"attribute\":\"Power\",\"modifier\":20}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64144() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Virulent Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":46,\"rarity\":\"Rare\",\"vendor_value\":252,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":64144,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":36},{\"attribute\":\"Vitality\",\"modifier\":26}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64145() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Virulent Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":47,\"rarity\":\"Rare\",\"vendor_value\":189,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":64145,\"icon\":\"https://render.guildwars2.com/file/0A402568104F5BE5BC644665653302005F6266CF/66800.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":28},{\"attribute\":\"Vitality\",\"modifier\":20}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}