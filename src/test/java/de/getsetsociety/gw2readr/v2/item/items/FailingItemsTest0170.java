package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0170 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem39235() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Matriarch's Quill\",\"description\":\"<c=@flavor>Some of the savage power of the harpy that once wore this feather still resides in it.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39235,\"icon\":\"https://render.guildwars2.com/file/9E02F6AFAA63F5BA41E943F545B7AC074A995E58/543882.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15741,\"description\":\"+32 Condition Damage\n+18 Precision\n+18 Toughness\"},\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":59},{\"attribute\":\"Vitality\",\"modifier\":42},{\"attribute\":\"Toughness\",\"modifier\":42}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39236() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Zinn's Data Crystal\",\"description\":\"<c=@flavor>A rare copy of Zinn's research into the power of souls.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39236,\"icon\":\"https://render.guildwars2.com/file/F928CB7727AD0B807762CFCFA4467462F119D796/543883.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15744,\"description\":\"+32 Power\n+18 Ferocity\n+18 Vitality\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":59},{\"attribute\":\"Precision\",\"modifier\":42},{\"attribute\":\"CritDamage\",\"modifier\":42}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39237() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Experiment ZX-27115\",\"description\":\"<c=@flavor>The label reads: \\\"Danger.\\\" It hums pleasantly.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39237,\"icon\":\"https://render.guildwars2.com/file/6A0EA32BA763800D0FFE56EBB03F01031E6556CF/543884.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15744,\"description\":\"+32 Power\n+18 Ferocity\n+18 Vitality\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":59},{\"attribute\":\"Precision\",\"modifier\":42},{\"attribute\":\"CritDamage\",\"modifier\":42}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39238() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Imperial Chef Yileng's Golden Spoon\",\"description\":\"<c=@flavor>The legendary chef gave these to his finest students.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39238,\"icon\":\"https://render.guildwars2.com/file/D959D1D9C64E9221CA17CD0E041E29EF9E516D2F/543885.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15745,\"description\":\"+32 Healing\n+18 Condition Damage\n+18 Toughness\"},\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":59},{\"attribute\":\"Precision\",\"modifier\":42},{\"attribute\":\"Toughness\",\"modifier\":42}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39239() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gargoyle Skull\",\"description\":\"<c=@flavor>A remnant of the presumed-extinct gargoyles.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39239,\"icon\":\"https://render.guildwars2.com/file/2890FAD6277ECCE72FF40404BFA4CE62C770332A/543886.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15745,\"description\":\"+32 Healing\n+18 Condition Damage\n+18 Toughness\"},\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":59},{\"attribute\":\"Precision\",\"modifier\":42},{\"attribute\":\"Toughness\",\"modifier\":42}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39240() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Egg of the Crystal Queen\",\"description\":\"<c=@flavor>These undeveloped eggs were supposedly found in the lair of Glint, the dragon oracle.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39240,\"icon\":\"https://render.guildwars2.com/file/1B7704D732C72D3FE8ADCFF6131934D76CB6240A/543887.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39241() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Armbrace of Truth\",\"description\":\"<c=@flavor>An ancient Elonian relic said to have once been extremely valuable.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39241,\"icon\":\"https://render.guildwars2.com/file/1A55C204E901D644FE3397EB16A6371DCED71FF1/543888.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39242() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Celestial Sigil\",\"description\":\"<c=@flavor>A prized possession of guilds in ancient times.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39242,\"icon\":\"https://render.guildwars2.com/file/A9BBCB0DD64D783937BA990EEC744C9A7F959508/543889.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15750,\"description\":\"+13 Condition Damage\n+13 Precision\n+13 Toughness\n+13 Power\n+13 Vitality\n+13 Healing Power\n+13 Ferocity\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":28},{\"attribute\":\"Precision\",\"modifier\":28},{\"attribute\":\"Toughness\",\"modifier\":28},{\"attribute\":\"Vitality\",\"modifier\":28},{\"attribute\":\"Healing\",\"modifier\":28},{\"attribute\":\"ConditionDamage\",\"modifier\":28},{\"attribute\":\"CritDamage\",\"modifier\":28}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39243() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Mursaat Token\",\"description\":\"<c=@flavor>Some warn that the Mursaat will return to agonize the people of Tyria once more.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39243,\"icon\":\"https://render.guildwars2.com/file/FEA4F4FDCA4577A93F1E0E79C6110EDD71C16162/543890.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15750,\"description\":\"+13 Condition Damage\n+13 Precision\n+13 Toughness\n+13 Power\n+13 Vitality\n+13 Healing Power\n+13 Ferocity\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":28},{\"attribute\":\"Precision\",\"modifier\":28},{\"attribute\":\"Toughness\",\"modifier\":28},{\"attribute\":\"Vitality\",\"modifier\":28},{\"attribute\":\"Healing\",\"modifier\":28},{\"attribute\":\"ConditionDamage\",\"modifier\":28},{\"attribute\":\"CritDamage\",\"modifier\":28}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39250() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Marriner's Flask (Infused)\",\"description\":\"<c=@flavor>Said to have been the property of the legendary Cobiah Marriner, founder of Lion's Arch.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39250,\"icon\":\"https://render.guildwars2.com/file/52ABC308C6CC5E0ADBE0B7F72FC9D60906094196/543877.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15752,\"description\":\"+32 Condition Damage\n+18 Precision\n+18 Toughness\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":59},{\"attribute\":\"Precision\",\"modifier\":42},{\"attribute\":\"Toughness\",\"modifier\":42}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39251() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Fierceshot's Arrowhead (Infused)\",\"description\":\"<c=@flavor>Said to have belonged to the legendary charr archer Pyre Fierceshot.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39251,\"icon\":\"https://render.guildwars2.com/file/0EC50BA70DCC31056008209A2C9FFE7EEF0D0699/543878.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15752,\"description\":\"+32 Condition Damage\n+18 Precision\n+18 Toughness\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":59},{\"attribute\":\"Precision\",\"modifier\":42},{\"attribute\":\"Toughness\",\"modifier\":42}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39252() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Magister's Field Journal (Infused)\",\"description\":\"<c=@flavor>A collection of clever, dreamy notes penned in a flowing hand.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39252,\"icon\":\"https://render.guildwars2.com/file/59943B48509FD07DDD96D1A8674ADCCEEDBF2665/543879.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15755,\"description\":\"+32 Power\n+18 Ferocity\n+18 Precision\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":59},{\"attribute\":\"Precision\",\"modifier\":42},{\"attribute\":\"CritDamage\",\"modifier\":42}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39253() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Althea's Ashes (Infused)\",\"description\":\"<c=@flavor>The legendary beauty who captured the heart of Prince Rurik, only to perish in the Searing of Ascalon.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39253,\"icon\":\"https://render.guildwars2.com/file/0E4C0C67CA06D97FD9E93C08BC600103D15AAF6A/543880.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15755,\"description\":\"+32 Power\n+18 Ferocity\n+18 Precision\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":59},{\"attribute\":\"Precision\",\"modifier\":42},{\"attribute\":\"CritDamage\",\"modifier\":42}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39262() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Celestial Sigil (Infused)\",\"description\":\"<c=@flavor>A prized possession of guilds in ancient times.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39262,\"icon\":\"https://render.guildwars2.com/file/A9BBCB0DD64D783937BA990EEC744C9A7F959508/543889.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15751,\"description\":\"+13 Condition Damage\n+13 Precision\n+13 Toughness\n+13 Power\n+13 Vitality\n+13 Healing Power\n+13 Ferocity\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":28},{\"attribute\":\"Precision\",\"modifier\":28},{\"attribute\":\"Toughness\",\"modifier\":28},{\"attribute\":\"Vitality\",\"modifier\":28},{\"attribute\":\"Healing\",\"modifier\":28},{\"attribute\":\"ConditionDamage\",\"modifier\":28},{\"attribute\":\"CritDamage\",\"modifier\":28}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39264() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thackeray Family Crest\",\"description\":\"<c=@flavor>Family crest of the famous Thackerays.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39264,\"icon\":\"https://render.guildwars2.com/file/A175C8D10C2A980FC900DCA81F4C0B3DC19705DC/534244.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15749,\"description\":\"+32 Power\n+18 Toughness\n+18 Vitality\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":94},{\"attribute\":\"Toughness\",\"modifier\":67},{\"attribute\":\"Vitality\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39265() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mark of the Imperial Guard\",\"description\":\"<c=@flavor>Formerly worn by a member of the Imperial Guards of Cantha.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39265,\"icon\":\"https://render.guildwars2.com/file/16A1A4769340799F5AA02EACCF085902567B6C76/222376.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15749,\"description\":\"+32 Power\n+18 Toughness\n+18 Vitality\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":94},{\"attribute\":\"Toughness\",\"modifier\":67},{\"attribute\":\"Vitality\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39268() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Collar of the First Commissar\",\"description\":\"<c=@flavor>Rumored to be worn by the first dredge to break free from dwarven slavery.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39268,\"icon\":\"https://render.guildwars2.com/file/77B73F19A90A57A13CB1241BE09254E923F4B364/534247.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15743,\"description\":\"+32 Toughness\n+18 Power\n+18 Ferocity\"},\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":94},{\"attribute\":\"Power\",\"modifier\":67},{\"attribute\":\"CritDamage\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39269() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gwen's Necklace\",\"description\":\"<c=@flavor>Given to Gwen by her beloved Keiran.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39269,\"icon\":\"https://render.guildwars2.com/file/01152CA9DFEFEF2D1E006C4166733A45210851F5/534248.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15743,\"description\":\"+32 Toughness\n+18 Power\n+18 Ferocity\"},\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":94},{\"attribute\":\"Power\",\"modifier\":67},{\"attribute\":\"CritDamage\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39270() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"The Sleeping Seed\",\"description\":\"<c=@flavor>This mysterious seed appears to be dormant.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39270,\"icon\":\"https://render.guildwars2.com/file/9361D2AED0B24517F4AC1F990B4B65EAC993B61F/534249.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15741,\"description\":\"+32 Condition Damage\n+18 Precision\n+18 Toughness\"},\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":94},{\"attribute\":\"Precision\",\"modifier\":67},{\"attribute\":\"Toughness\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39271() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hymn to the Prophets\",\"description\":\"<c=@flavor>Straight from the dark depths of krait-infested waters.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39271,\"icon\":\"https://render.guildwars2.com/file/290E9C01A5D902A62E2EC10B3BB15938BC70980A/534250.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15741,\"description\":\"+32 Condition Damage\n+18 Precision\n+18 Toughness\"},\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":94},{\"attribute\":\"Precision\",\"modifier\":67},{\"attribute\":\"Toughness\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39272() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Call of the Wild\",\"description\":\"<c=@flavor>Audible to those who seek their legend.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39272,\"icon\":\"https://render.guildwars2.com/file/014DB599B81FAF2010BDF25928C178EA96465E73/534251.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15742,\"description\":\"+32 Power\n+18 Ferocity\n+18 Precision\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":94},{\"attribute\":\"Precision\",\"modifier\":67},{\"attribute\":\"CritDamage\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39273() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mark of the Tethyos Houses\",\"description\":\"<c=@flavor>This must have once belonged to a victim of a largos assassin.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39273,\"icon\":\"https://render.guildwars2.com/file/BF57DD6C72C551CE55EF0DECA9A23E619E5DB963/534252.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15742,\"description\":\"+32 Power\n+18 Ferocity\n+18 Precision\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":94},{\"attribute\":\"Precision\",\"modifier\":67},{\"attribute\":\"CritDamage\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39274() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jade Wind Orb\",\"description\":\"<c=@flavor>This relic of long-forgotten Cantha contains air captured from the Jade Winds.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39274,\"icon\":\"https://render.guildwars2.com/file/4A20D50FA45FD0EDACB941563E7D269045F03E40/534253.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15741,\"description\":\"+32 Condition Damage\n+18 Precision\n+18 Toughness\"},\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":94},{\"attribute\":\"Vitality\",\"modifier\":67},{\"attribute\":\"Toughness\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39275() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Symbol of the Deceiver\",\"description\":\"<c=@flavor>Some say the great deceiver of Cantha was a victim of the fates. Others call him a traitor.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39275,\"icon\":\"https://render.guildwars2.com/file/6F569E982A709BA405334F9597D0637501BF0D32/534254.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15741,\"description\":\"+32 Condition Damage\n+18 Precision\n+18 Toughness\"},\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":94},{\"attribute\":\"Vitality\",\"modifier\":67},{\"attribute\":\"Toughness\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39276() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Godrock Amulet\",\"description\":\"<c=@flavor>Once an object of worship among the grawl.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39276,\"icon\":\"https://render.guildwars2.com/file/D33DFD0435DBDE0C0CB7381B4D51BFDB5E75EFDD/534255.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15744,\"description\":\"+32 Power\n+18 Ferocity\n+18 Vitality\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":94},{\"attribute\":\"Precision\",\"modifier\":67},{\"attribute\":\"CritDamage\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}