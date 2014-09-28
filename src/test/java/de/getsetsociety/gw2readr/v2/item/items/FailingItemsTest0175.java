package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0175 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem39587() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"The Queen's Necklace\",\"description\":\"<c=@flavor>Commissioned for Queen Jennah by a council member, but found too ornate for her tastes.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39587,\"icon\":\"https://render.guildwars2.com/file/D101C854D77B5EFABCDDB925170DD340B89CB411/543912.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Utility\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17070,\"description\":\"+32 Toughness\n+18 Power\n+18 Precision\"},\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":94},{\"attribute\":\"Power\",\"modifier\":67},{\"attribute\":\"Precision\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39588() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Luxon Pendant\",\"description\":\"<c=@flavor>Smuggled out of Cantha long ago, a relic of the Serpent Clan.<c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39588,\"icon\":\"https://render.guildwars2.com/file/AD036A32C62576C726F4490DF011C516C12BA84C/543913.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Utility\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17071,\"description\":\"+32 Precision\n+18 Power\n+18 Condition Damage\"},\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":94},{\"attribute\":\"Power\",\"modifier\":67},{\"attribute\":\"ConditionDamage\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39589() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"The Beetlestone Diamond\",\"description\":\"<c=@flavor>Mined from the Onyx Fields of Southsun Cove for the pleasure of Lord Beetlestone.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39589,\"icon\":\"https://render.guildwars2.com/file/A0971CBC0EB8D8D51A7F0EFE6092B8713171DDF6/543914.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Utility\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15745,\"description\":\"+32 Healing\n+18 Condition Damage\n+18 Toughness\"},\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":94},{\"attribute\":\"Toughness\",\"modifier\":67},{\"attribute\":\"ConditionDamage\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39590() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Protomatter Chain\",\"description\":\"<c=@flavor>Some strange, ethereal material from the Mists has solidified into this odd necklace.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39590,\"icon\":\"https://render.guildwars2.com/file/63C27CEE6D4909F7AC5075777A7741E057ED0413/543915.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Utility\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17072,\"description\":\"+32 Precision\n+18 Toughness\n+18 Power\"},\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":94},{\"attribute\":\"Power\",\"modifier\":67},{\"attribute\":\"Toughness\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39591() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Prayer to Otter (Infused)\",\"description\":\"<c=@flavor>Otter is a fickle spirit, but when she does grant a boon, it is a powerful gift indeed.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39591,\"icon\":\"https://render.guildwars2.com/file/C241147CD02EC9337A0FA379A9A5E896AF0CB61F/543911.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Utility\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17073,\"description\":\"+32 Healing Power\n+18 Toughness\n+18 Power\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":94},{\"attribute\":\"Power\",\"modifier\":67},{\"attribute\":\"Toughness\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39596() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Druid's Circle\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39596,\"icon\":\"https://render.guildwars2.com/file/565A62A4C35466A35DD57BB53AD20B49467557AE/543916.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17069,\"description\":\"+32 Healing Power\n+18 Toughness\n+18 Power\"},\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":71},{\"attribute\":\"Power\",\"modifier\":50},{\"attribute\":\"Toughness\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39597() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Healing Signet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39597,\"icon\":\"https://render.guildwars2.com/file/1528A3CFFC4BE66AC9D00FA10FEBA77D722F210C/543917.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17069,\"description\":\"+32 Healing Power\n+18 Toughness\n+18 Power\"},\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":71},{\"attribute\":\"Power\",\"modifier\":50},{\"attribute\":\"Toughness\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39598() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Druid's Circle (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39598,\"icon\":\"https://render.guildwars2.com/file/565A62A4C35466A35DD57BB53AD20B49467557AE/543916.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]},{\"flags\":[],\"item_id\":49428}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17073,\"description\":\"+32 Healing Power\n+18 Toughness\n+18 Power\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":71},{\"attribute\":\"Power\",\"modifier\":50},{\"attribute\":\"Toughness\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39599() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Healing Signet (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39599,\"icon\":\"https://render.guildwars2.com/file/1528A3CFFC4BE66AC9D00FA10FEBA77D722F210C/543917.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]},{\"flags\":[],\"item_id\":49428}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17073,\"description\":\"+32 Healing Power\n+18 Toughness\n+18 Power\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":71},{\"attribute\":\"Power\",\"modifier\":50},{\"attribute\":\"Toughness\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39600() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ettinband\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39600,\"icon\":\"https://render.guildwars2.com/file/0273056F7294E3CF08D8A45CA6BD374222720503/543918.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17070,\"description\":\"+32 Toughness\n+18 Power\n+18 Precision\"},\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":71},{\"attribute\":\"Power\",\"modifier\":50},{\"attribute\":\"Precision\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39601() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ossa Family Signet Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39601,\"icon\":\"https://render.guildwars2.com/file/DCEF3552D4015213D806CED7633A7FB840CEE15B/543919.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17070,\"description\":\"+32 Toughness\n+18 Power\n+18 Precision\"},\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":71},{\"attribute\":\"Power\",\"modifier\":50},{\"attribute\":\"Precision\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39602() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ettinband (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39602,\"icon\":\"https://render.guildwars2.com/file/0273056F7294E3CF08D8A45CA6BD374222720503/543918.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]},{\"flags\":[],\"item_id\":49428}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17074,\"description\":\"+32 Toughness\n+18 Power\n+18 Precision\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":71},{\"attribute\":\"Power\",\"modifier\":50},{\"attribute\":\"Precision\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39603() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ossa Family Signet Ring (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39603,\"icon\":\"https://render.guildwars2.com/file/DCEF3552D4015213D806CED7633A7FB840CEE15B/543919.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]},{\"flags\":[],\"item_id\":49428}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17074,\"description\":\"+32 Toughness\n+18 Power\n+18 Precision\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":71},{\"attribute\":\"Power\",\"modifier\":50},{\"attribute\":\"Precision\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39604() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Barbed Signet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39604,\"icon\":\"https://render.guildwars2.com/file/CBFBD40394AC51F9DB4AFA054E51A2171A487AF8/543920.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17071,\"description\":\"+32 Precision\n+18 Power\n+18 Condition Damage\"},\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":71},{\"attribute\":\"Power\",\"modifier\":50},{\"attribute\":\"ConditionDamage\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39605() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Palawa Joko's Finger Cuff\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39605,\"icon\":\"https://render.guildwars2.com/file/196B03CE31642D45A8BEBBC79DC191217B005EA5/543921.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17071,\"description\":\"+32 Precision\n+18 Power\n+18 Condition Damage\"},\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":71},{\"attribute\":\"Power\",\"modifier\":50},{\"attribute\":\"ConditionDamage\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39606() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Barbed Signet (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39606,\"icon\":\"https://render.guildwars2.com/file/CBFBD40394AC51F9DB4AFA054E51A2171A487AF8/543920.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]},{\"flags\":[],\"item_id\":49428}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17075,\"description\":\"+32 Precision\n+18 Power\n+18 Condition Damage\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":71},{\"attribute\":\"Power\",\"modifier\":50},{\"attribute\":\"ConditionDamage\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39607() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Palawa Joko's Finger Cuff (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39607,\"icon\":\"https://render.guildwars2.com/file/196B03CE31642D45A8BEBBC79DC191217B005EA5/543921.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]},{\"flags\":[],\"item_id\":49428}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17075,\"description\":\"+32 Precision\n+18 Power\n+18 Condition Damage\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":71},{\"attribute\":\"Power\",\"modifier\":50},{\"attribute\":\"ConditionDamage\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39608() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lucce Seal\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39608,\"icon\":\"https://render.guildwars2.com/file/B70636E414ED11E4E4599A95F9C24709763001E5/543922.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15745,\"description\":\"+32 Healing\n+18 Condition Damage\n+18 Toughness\"},\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":71},{\"attribute\":\"Toughness\",\"modifier\":50},{\"attribute\":\"ConditionDamage\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39609() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Purge Signet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39609,\"icon\":\"https://render.guildwars2.com/file/D3CF347B560F0900E7723B38F5FA024FA2033E27/543923.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15745,\"description\":\"+32 Healing\n+18 Condition Damage\n+18 Toughness\"},\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":71},{\"attribute\":\"Toughness\",\"modifier\":50},{\"attribute\":\"ConditionDamage\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39610() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lucce Seal (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39610,\"icon\":\"https://render.guildwars2.com/file/B70636E414ED11E4E4599A95F9C24709763001E5/543922.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]},{\"flags\":[],\"item_id\":49428}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15753,\"description\":\"+32 Healing\n+18 Condition Damage\n+18 Toughness\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":71},{\"attribute\":\"Toughness\",\"modifier\":50},{\"attribute\":\"ConditionDamage\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39611() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Purge Signet (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39611,\"icon\":\"https://render.guildwars2.com/file/D3CF347B560F0900E7723B38F5FA024FA2033E27/543923.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]},{\"flags\":[],\"item_id\":49428}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15753,\"description\":\"+32 Healing\n+18 Condition Damage\n+18 Toughness\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":71},{\"attribute\":\"Toughness\",\"modifier\":50},{\"attribute\":\"ConditionDamage\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39612() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Band of the Brotherhood\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39612,\"icon\":\"https://render.guildwars2.com/file/D3340234F799E0DDF8FC48254B1EF16FAE69AB55/543924.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17072,\"description\":\"+32 Precision\n+18 Toughness\n+18 Power\"},\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":71},{\"attribute\":\"Power\",\"modifier\":50},{\"attribute\":\"Toughness\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39613() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cirque of Arah\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39613,\"icon\":\"https://render.guildwars2.com/file/EAF227BFCCD5491E0BED02285AE7CB924EE1CD7E/543925.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17072,\"description\":\"+32 Precision\n+18 Toughness\n+18 Power\"},\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":71},{\"attribute\":\"Power\",\"modifier\":50},{\"attribute\":\"Toughness\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39614() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Band of the Brotherhood (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39614,\"icon\":\"https://render.guildwars2.com/file/D3340234F799E0DDF8FC48254B1EF16FAE69AB55/543924.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]},{\"flags\":[],\"item_id\":49428}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17076,\"description\":\"+32 Precision\n+18 Toughness\n+18 Power\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":71},{\"attribute\":\"Power\",\"modifier\":50},{\"attribute\":\"Toughness\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39615() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cirque of Arah (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39615,\"icon\":\"https://render.guildwars2.com/file/EAF227BFCCD5491E0BED02285AE7CB924EE1CD7E/543925.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]},{\"flags\":[],\"item_id\":49428}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17076,\"description\":\"+32 Precision\n+18 Toughness\n+18 Power\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":71},{\"attribute\":\"Power\",\"modifier\":50},{\"attribute\":\"Toughness\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}