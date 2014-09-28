package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0056 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem13511() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spinel Gold Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":45,\"rarity\":\"Fine\",\"vendor_value\":52,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13511,\"icon\":\"https://render.guildwars2.com/file/E8D033E8B404A1660CC3665FB59419ABAD791F55/340240.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":18},{\"attribute\":\"Power\",\"modifier\":13}]},\"suffix_item_id\":24526,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13512() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spinel Gold Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":113,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13512,\"icon\":\"https://render.guildwars2.com/file/E8D033E8B404A1660CC3665FB59419ABAD791F55/340240.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":23},{\"attribute\":\"Power\",\"modifier\":16}]},\"suffix_item_id\":24897,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13513() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spinel Silver Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":30,\"rarity\":\"Fine\",\"vendor_value\":62,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13513,\"icon\":\"https://render.guildwars2.com/file/C3CEDB4249676D5BF4FA0D5E94A427713CC50A0B/340241.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":18},{\"attribute\":\"Power\",\"modifier\":13}]},\"suffix_item_id\":24889,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13514() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spinel Silver Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":136,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13514,\"icon\":\"https://render.guildwars2.com/file/C3CEDB4249676D5BF4FA0D5E94A427713CC50A0B/340241.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":23},{\"attribute\":\"Power\",\"modifier\":17}]},\"suffix_item_id\":24896,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13515() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spinel Gold Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":45,\"rarity\":\"Fine\",\"vendor_value\":82,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13515,\"icon\":\"https://render.guildwars2.com/file/58B2052EC6FD80BBED7F0A0CC21F6DB719E22792/340242.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":29},{\"attribute\":\"Power\",\"modifier\":21}]},\"suffix_item_id\":24526,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13516() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spinel Gold Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":180,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13516,\"icon\":\"https://render.guildwars2.com/file/58B2052EC6FD80BBED7F0A0CC21F6DB719E22792/340242.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":37},{\"attribute\":\"Power\",\"modifier\":26}]},\"suffix_item_id\":24897,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13517() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darksteel Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":207,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13517,\"icon\":\"https://render.guildwars2.com/file/91FE537914152F60B96E14A102E5B21B736A0F12/219697.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":36},{\"attribute\":\"Precision\",\"modifier\":26},{\"attribute\":\"CritDamage\",\"modifier\":26}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13518() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lucky Pink Rabbit's Foot\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13518,\"icon\":\"https://render.guildwars2.com/file/E862939E49E4DE4EFEA7AE52D402739CAB427505/66779.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":79},{\"attribute\":\"CritDamage\",\"modifier\":56},{\"attribute\":\"Vitality\",\"modifier\":56}]},\"suffix_item_id\":24540,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13519() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lucky White Rabbit's Foot\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13519,\"icon\":\"https://render.guildwars2.com/file/7262FAFBEE60B5A846E3093573C950A1C1335B97/66777.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"suffix_item_id\":24542,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13520() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Topaz Silver Band\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":153,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13520,\"icon\":\"https://render.guildwars2.com/file/0C4DB1973E4997DAED0CE7CF2255D8FA22AFE407/455607.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":19},{\"attribute\":\"Precision\",\"modifier\":14}]},\"suffix_item_id\":24904,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13521() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spinel Silver Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":153,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13521,\"icon\":\"https://render.guildwars2.com/file/39E4674999F43B024E3995B62950E8AD75C42D6A/455608.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":19},{\"attribute\":\"Power\",\"modifier\":14}]},\"suffix_item_id\":24902,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13522() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Peridot Silver Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":153,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13522,\"icon\":\"https://render.guildwars2.com/file/71CB314B179C5697FF0115A1B203C0FDF53FFD97/455609.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":19},{\"attribute\":\"CritDamage\",\"modifier\":14}]},\"suffix_item_id\":24901,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13523() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sunstone Silver Band\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":153,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13523,\"icon\":\"https://render.guildwars2.com/file/41FD0AE201704F5E0751EB92AADD9EE80BD46C7E/455610.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"suffix_item_id\":24903,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13524() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carnelian Silver Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":153,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13524,\"icon\":\"https://render.guildwars2.com/file/04D9770A01D716F7C17549F5C4A67E326A45F406/455611.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":19},{\"attribute\":\"Precision\",\"modifier\":14}]},\"suffix_item_id\":24899,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13525() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Amethyst Silver Band\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":153,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13525,\"icon\":\"https://render.guildwars2.com/file/58ADC5463CF96B2C9E11A1EAB70DFB48B45AFA38/455612.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":19},{\"attribute\":\"Vitality\",\"modifier\":14}]},\"suffix_item_id\":24898,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13526() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lapis Silver Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":153,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13526,\"icon\":\"https://render.guildwars2.com/file/58BEE97EC56E04A67E1A2AA271D5EA7355A1F39B/455613.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":19},{\"attribute\":\"Toughness\",\"modifier\":14}]},\"suffix_item_id\":24900,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13527() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Topaz Gold Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":203,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13527,\"icon\":\"https://render.guildwars2.com/file/EA50C6D81DB452079E98617CB72107A11DD01F7E/340150.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":30},{\"attribute\":\"Precision\",\"modifier\":21}]},\"suffix_item_id\":24911,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13528() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spinel Gold Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":203,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13528,\"icon\":\"https://render.guildwars2.com/file/F6F840468020FD2E0AA4C6FDBDC14F10BAB1E751/455614.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":30},{\"attribute\":\"Power\",\"modifier\":21}]},\"suffix_item_id\":24909,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13529() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Peridot Gold Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":203,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13529,\"icon\":\"https://render.guildwars2.com/file/D7047B1C15DD48311D719806C616ABA4E8090602/455615.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":30},{\"attribute\":\"CritDamage\",\"modifier\":21}]},\"suffix_item_id\":24908,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13530() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sunstone Gold Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":203,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13530,\"icon\":\"https://render.guildwars2.com/file/96A0A65E7C181D26554F3092F79139529FE8D89D/455616.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"suffix_item_id\":24910,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13531() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carnelian Gold Band\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":203,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13531,\"icon\":\"https://render.guildwars2.com/file/CD7AFD1B6C1F5BA2451F5250E040B50FDC6A115C/455617.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":30},{\"attribute\":\"Precision\",\"modifier\":21}]},\"suffix_item_id\":24906,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13532() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Amethyst Gold Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":203,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13532,\"icon\":\"https://render.guildwars2.com/file/2524124C777C22CC4DFDE29375DE96E9122A692A/455618.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":30},{\"attribute\":\"Vitality\",\"modifier\":21}]},\"suffix_item_id\":24905,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13533() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lapis Gold Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":203,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13533,\"icon\":\"https://render.guildwars2.com/file/38F93A40B1AFAD26F40D3123A47BB25FE17D5495/455619.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":30},{\"attribute\":\"Toughness\",\"modifier\":21}]},\"suffix_item_id\":24907,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13534() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chrysocola Platinum Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":248,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13534,\"icon\":\"https://render.guildwars2.com/file/DF289E07ECF4DB4259221A7254C39F64E077B806/340175.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":43},{\"attribute\":\"Power\",\"modifier\":31},{\"attribute\":\"Vitality\",\"modifier\":31}]},\"suffix_item_id\":24913,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13535() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sapphire Platinum Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":248,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13535,\"icon\":\"https://render.guildwars2.com/file/9D594B807FCCDC561D04D4730BA641BE40B3C4D8/455620.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":43},{\"attribute\":\"Power\",\"modifier\":31},{\"attribute\":\"Toughness\",\"modifier\":31}]},\"suffix_item_id\":24918,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}