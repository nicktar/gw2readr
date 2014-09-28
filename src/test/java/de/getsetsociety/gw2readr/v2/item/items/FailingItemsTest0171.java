package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0171 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem39277() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Conundrum of Maut\",\"description\":\"<c=@flavor>Maut's frustrations forever locked away.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39277,\"icon\":\"https://render.guildwars2.com/file/061706F92EEA0F4F78F6061401BFEA30C246DB3C/534256.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15744,\"description\":\"+32 Power\n+18 Ferocity\n+18 Vitality\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":94},{\"attribute\":\"Precision\",\"modifier\":67},{\"attribute\":\"CritDamage\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39279() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Blood of the Khan-Ur\",\"description\":\"<c=@flavor>Forged in the blazing fires of the Black Citadel's foundry.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39279,\"icon\":\"https://render.guildwars2.com/file/B75600450DE85E0A9D102642E9AEEE54F1D101DF/222352.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15745,\"description\":\"+32 Healing\n+18 Condition Damage\n+18 Toughness\"},\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":94},{\"attribute\":\"Precision\",\"modifier\":67},{\"attribute\":\"Toughness\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39280() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Star of Elona\",\"description\":\"<c=@flavor>A jewel from faraway Elona.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39280,\"icon\":\"https://render.guildwars2.com/file/F9FA024609017040EF27FD680C709F1D0B751A6B/534257.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39281() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jewel of Ahdashim\",\"description\":\"<c=@flavor>The crown jewel from the vaults of Ahdashim.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39281,\"icon\":\"https://render.guildwars2.com/file/7999DD49A8DF6775CF5437EB03462A0432F9AFDC/534258.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39282() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"The Eyes of Abaddon\",\"description\":\"<c=@flavor>They burn with the fire of a forgotten god.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39282,\"icon\":\"https://render.guildwars2.com/file/7B3F98BE2207099272CC2B9C196EB002C9A39EDF/534259.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15750,\"description\":\"+13 Condition Damage\n+13 Precision\n+13 Toughness\n+13 Power\n+13 Vitality\n+13 Healing Power\n+13 Ferocity\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":44},{\"attribute\":\"Precision\",\"modifier\":44},{\"attribute\":\"Toughness\",\"modifier\":44},{\"attribute\":\"Vitality\",\"modifier\":44},{\"attribute\":\"Healing\",\"modifier\":44},{\"attribute\":\"ConditionDamage\",\"modifier\":44},{\"attribute\":\"CritDamage\",\"modifier\":44}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39283() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Eye of Janthir\",\"description\":\"<c=@flavor>A tiny replica of a long-forgotten power.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39283,\"icon\":\"https://render.guildwars2.com/file/3AF7AFAE6190F1FBEA029DAEB47F423F0D1B04D3/534260.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15750,\"description\":\"+13 Condition Damage\n+13 Precision\n+13 Toughness\n+13 Power\n+13 Vitality\n+13 Healing Power\n+13 Ferocity\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":44},{\"attribute\":\"Precision\",\"modifier\":44},{\"attribute\":\"Toughness\",\"modifier\":44},{\"attribute\":\"Vitality\",\"modifier\":44},{\"attribute\":\"Healing\",\"modifier\":44},{\"attribute\":\"ConditionDamage\",\"modifier\":44},{\"attribute\":\"CritDamage\",\"modifier\":44}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39291() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hymn to the Prophets (Infused)\",\"description\":\"<c=@flavor>Straight from the dark depths of krait-infested waters.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39291,\"icon\":\"https://render.guildwars2.com/file/290E9C01A5D902A62E2EC10B3BB15938BC70980A/534250.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15752,\"description\":\"+32 Condition Damage\n+18 Precision\n+18 Toughness\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":94},{\"attribute\":\"Precision\",\"modifier\":67},{\"attribute\":\"Toughness\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39304() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Barradin Family Crest\",\"description\":\"<c=@flavor>Family crest of the Barradin line.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39304,\"icon\":\"https://render.guildwars2.com/file/0A6FEE1D42C7FCD1B30CB31A0ADF68C8E87A7EDC/534261.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Utility\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15749,\"description\":\"+32 Power\n+18 Toughness\n+18 Vitality\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":94},{\"attribute\":\"Toughness\",\"modifier\":67},{\"attribute\":\"Vitality\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39305() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vekk's Solidified Aether Circuit\",\"description\":\"<c=@flavor>A concoction of old technology and a tremendous ego.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39305,\"icon\":\"https://render.guildwars2.com/file/91EC7A42FB69D15A3838E97456037590A26971AB/534262.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Utility\"]}],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39306() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jalis Ironhammer's Crest\",\"description\":\"<c=@flavor>Crest of the last king of the Deldrimor dwarves, Jalis Ironhammer.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39306,\"icon\":\"https://render.guildwars2.com/file/A50A6AEA0675F178E4BFB01BF5042208B7E5F96B/534263.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Utility\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15743,\"description\":\"+32 Toughness\n+18 Power\n+18 Ferocity\"},\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":94},{\"attribute\":\"Power\",\"modifier\":67},{\"attribute\":\"CritDamage\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39307() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Speaker's Dawncord\",\"description\":\"<c=@flavor>A hylek speaker's prized medallion.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39307,\"icon\":\"https://render.guildwars2.com/file/9DE6640EDB6D71EDF4DC5BDC9F94770A081C0468/534264.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Utility\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15741,\"description\":\"+32 Condition Damage\n+18 Precision\n+18 Toughness\"},\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":94},{\"attribute\":\"Precision\",\"modifier\":67},{\"attribute\":\"Toughness\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39308() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Distinguished Circle of Logic\",\"description\":\"<c=@flavor>A Rata Sum award for extraordinary genius.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39308,\"icon\":\"https://render.guildwars2.com/file/C6F842BBDC44B64B07CC34D21708C8E55896C86C/534265.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Utility\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15742,\"description\":\"+32 Power\n+18 Ferocity\n+18 Precision\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":94},{\"attribute\":\"Precision\",\"modifier\":67},{\"attribute\":\"CritDamage\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39309() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"The Master's Special Serum\",\"description\":\"<c=@flavor>A closely held secret.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39309,\"icon\":\"https://render.guildwars2.com/file/FF7A0A0FFD6FAC2C14F8151CC7A674B393F735BB/222410.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Utility\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15741,\"description\":\"+32 Condition Damage\n+18 Precision\n+18 Toughness\"},\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":94},{\"attribute\":\"Vitality\",\"modifier\":67},{\"attribute\":\"Toughness\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39310() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bud of the Pale Tree\",\"description\":\"<c=@flavor>A delicate gift from the Grove.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39310,\"icon\":\"https://render.guildwars2.com/file/9CD80DEDD0C0B2CF599815B8C619E30ADAA8C7A4/534266.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Utility\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15744,\"description\":\"+32 Power\n+18 Ferocity\n+18 Vitality\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":94},{\"attribute\":\"Precision\",\"modifier\":67},{\"attribute\":\"CritDamage\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39312() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"The Golden Lotus\",\"description\":\"<c=@flavor>An exotic gift that speaks of faraway lands.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39312,\"icon\":\"https://render.guildwars2.com/file/CAFDED73BC7A61789FF48009CAACF9B15B0AC514/534268.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Utility\"]}],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39313() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Syzygy\",\"description\":\"<c=@flavor>A powerful alignment.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39313,\"icon\":\"https://render.guildwars2.com/file/541C48535B97654CD816F553B67770F7BCB595B5/534269.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Utility\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15750,\"description\":\"+13 Condition Damage\n+13 Precision\n+13 Toughness\n+13 Power\n+13 Vitality\n+13 Healing Power\n+13 Ferocity\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":44},{\"attribute\":\"Precision\",\"modifier\":44},{\"attribute\":\"Toughness\",\"modifier\":44},{\"attribute\":\"Vitality\",\"modifier\":44},{\"attribute\":\"Healing\",\"modifier\":44},{\"attribute\":\"ConditionDamage\",\"modifier\":44},{\"attribute\":\"CritDamage\",\"modifier\":44}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39317() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Speaker's Dawncord (Infused)\",\"description\":\"<c=@flavor>A hylek speaker's prized medallion.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39317,\"icon\":\"https://render.guildwars2.com/file/9DE6640EDB6D71EDF4DC5BDC9F94770A081C0468/534264.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Utility\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15752,\"description\":\"+32 Condition Damage\n+18 Precision\n+18 Toughness\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":94},{\"attribute\":\"Precision\",\"modifier\":67},{\"attribute\":\"Toughness\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39318() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Distinguished Circle of Logic (Infused)\",\"description\":\"<c=@flavor>A Rata Sum award for extraordinary genius.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39318,\"icon\":\"https://render.guildwars2.com/file/C6F842BBDC44B64B07CC34D21708C8E55896C86C/534265.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Utility\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15755,\"description\":\"+32 Power\n+18 Ferocity\n+18 Precision\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":94},{\"attribute\":\"Precision\",\"modifier\":67},{\"attribute\":\"CritDamage\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39323() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Syzygy (Infused)\",\"description\":\"<c=@flavor>A powerful alignment.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39323,\"icon\":\"https://render.guildwars2.com/file/541C48535B97654CD816F553B67770F7BCB595B5/534269.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Utility\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15751,\"description\":\"+13 Condition Damage\n+13 Precision\n+13 Toughness\n+13 Power\n+13 Vitality\n+13 Healing Power\n+13 Ferocity\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":44},{\"attribute\":\"Precision\",\"modifier\":44},{\"attribute\":\"Toughness\",\"modifier\":44},{\"attribute\":\"Vitality\",\"modifier\":44},{\"attribute\":\"Healing\",\"modifier\":44},{\"attribute\":\"ConditionDamage\",\"modifier\":44},{\"attribute\":\"CritDamage\",\"modifier\":44}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39328() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Circle of Light\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39328,\"icon\":\"https://render.guildwars2.com/file/2022E87E78C511102A3D0506241B02F4AD1BBE4D/522591.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39331() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gilded Infusion\",\"description\":\"Double-click to apply to an unused utility infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39331,\"icon\":\"https://render.guildwars2.com/file/04716CEDA6593593DDF1DEF826D521D39E6875A1/534271.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[\"Utility\"],\"infix_upgrade\":{\"buff\":{\"skill_id\":16979,\"description\":\"+20% Gold from Monsters\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39332() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Karmic Infusion\",\"description\":\"Double-click to apply to an unused utility infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39332,\"icon\":\"https://render.guildwars2.com/file/F508A75DDFBFC87133FFC5ADA3DADFF5640A2E0C/534272.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[\"Utility\"],\"infix_upgrade\":{\"buff\":{\"skill_id\":16978,\"description\":\"+15% Karma\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39333() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Magical Infusion\",\"description\":\"Double-click to apply to an unused utility infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39333,\"icon\":\"https://render.guildwars2.com/file/5D073A680E66AE473CAC54D1B775AE0DE90E776E/534273.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[\"Utility\"],\"infix_upgrade\":{\"buff\":{\"skill_id\":16980,\"description\":\"+20% Magic Find\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39335() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Precise Infusion\",\"description\":\"Double-click to apply to an unused offensive infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39335,\"icon\":\"https://render.guildwars2.com/file/C605E2EF280B5E4CF9A249E80AB3053843C5EBE3/511839.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[\"Offense\"],\"infix_upgrade\":{\"buff\":{\"skill_id\":16984,\"description\":\"+4 Precision\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39336() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mighty Infusion\",\"description\":\"Double-click to apply to an unused offensive infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39336,\"icon\":\"https://render.guildwars2.com/file/AE7C224D02E7F16F19FAFAE1CC50B80E5DC80214/511838.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[\"Offense\"],\"infix_upgrade\":{\"buff\":{\"skill_id\":16985,\"description\":\"+4 Power\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}