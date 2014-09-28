package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0160 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem37086() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ring of Red Death\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37086,\"icon\":\"https://render.guildwars2.com/file/B155B37AD048CA9054F749043C3E4E99973DF8DF/511826.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15742,\"description\":\"+32 Power\n+18 Ferocity\n+18 Precision\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":71},{\"attribute\":\"Precision\",\"modifier\":50},{\"attribute\":\"CritDamage\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37087() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vassar's Band\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37087,\"icon\":\"https://render.guildwars2.com/file/F62F7509E6A1F8C4A8E3F026040B6EB9E8E590A9/511827.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15741,\"description\":\"+32 Condition Damage\n+18 Precision\n+18 Toughness\"},\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":71},{\"attribute\":\"Vitality\",\"modifier\":50},{\"attribute\":\"Toughness\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37088() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Solaria, Circle of the Sun\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37088,\"icon\":\"https://render.guildwars2.com/file/7428E75D16DDDF12342B629B5A32311105EBD00F/511828.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15750,\"description\":\"+13 Condition Damage\n+13 Precision\n+13 Toughness\n+13 Power\n+13 Vitality\n+13 Healing Power\n+13 Ferocity\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":33},{\"attribute\":\"Precision\",\"modifier\":33},{\"attribute\":\"Toughness\",\"modifier\":33},{\"attribute\":\"Vitality\",\"modifier\":33},{\"attribute\":\"Healing\",\"modifier\":33},{\"attribute\":\"ConditionDamage\",\"modifier\":33},{\"attribute\":\"CritDamage\",\"modifier\":33}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37089() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lost Seal of Usoku\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37089,\"icon\":\"https://render.guildwars2.com/file/016D1DF853B6B97B5D165EC0BE9F0597FAA1125E/511829.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15749,\"description\":\"+32 Power\n+18 Toughness\n+18 Vitality\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":71},{\"attribute\":\"Toughness\",\"modifier\":50},{\"attribute\":\"Vitality\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37090() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rurik's Royal Signet Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37090,\"icon\":\"https://render.guildwars2.com/file/5D37E17ED2A3A058166D02A170650D0F03A81CA3/511830.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15743,\"description\":\"+32 Toughness\n+18 Power\n+18 Ferocity\"},\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":71},{\"attribute\":\"Power\",\"modifier\":50},{\"attribute\":\"CritDamage\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37091() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Seal of the Khan-Ur\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37091,\"icon\":\"https://render.guildwars2.com/file/24F3597F9A7B386E629AE3C69F0E56780720A1ED/511831.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15745,\"description\":\"+32 Healing\n+18 Condition Damage\n+18 Toughness\"},\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":71},{\"attribute\":\"Precision\",\"modifier\":50},{\"attribute\":\"Toughness\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37092() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bagh Nakh\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37092,\"icon\":\"https://render.guildwars2.com/file/4F9F6F2DE6C6726A593C231BA00510BE347304F0/511832.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15744,\"description\":\"+32 Power\n+18 Ferocity\n+18 Vitality\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":71},{\"attribute\":\"Precision\",\"modifier\":50},{\"attribute\":\"CritDamage\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37093() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Snaff's Gyre\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37093,\"icon\":\"https://render.guildwars2.com/file/2807D67190AF5ADC1618B9135678EF3F0CA6ED61/511833.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37094() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Khilbron's Phylactery (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37094,\"icon\":\"https://render.guildwars2.com/file/55A6A999A52591BB7607421A13996D5DA6530780/511815.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]},{\"flags\":[],\"item_id\":49428}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15752,\"description\":\"+32 Condition Damage\n+18 Precision\n+18 Toughness\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":71},{\"attribute\":\"Precision\",\"modifier\":50},{\"attribute\":\"Toughness\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37095() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Circle of Light (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37095,\"icon\":\"https://render.guildwars2.com/file/2022E87E78C511102A3D0506241B02F4AD1BBE4D/522591.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]},{\"flags\":[],\"item_id\":49428}],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37096() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Crystalline Band (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37096,\"icon\":\"https://render.guildwars2.com/file/3B1CC13C0A3747B4A00277113E6ACD64D522B1D1/511816.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]},{\"flags\":[],\"item_id\":49428}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15755,\"description\":\"+32 Power\n+18 Ferocity\n+18 Precision\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":71},{\"attribute\":\"Precision\",\"modifier\":50},{\"attribute\":\"CritDamage\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37097() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ouroboros Loop (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37097,\"icon\":\"https://render.guildwars2.com/file/2ACFDD50233369F8CFAB75EDB8761DDDEBDD6AD2/511825.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]},{\"flags\":[],\"item_id\":49428}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15752,\"description\":\"+32 Condition Damage\n+18 Precision\n+18 Toughness\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":71},{\"attribute\":\"Precision\",\"modifier\":50},{\"attribute\":\"Toughness\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37098() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Royal Signet of Doric (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37098,\"icon\":\"https://render.guildwars2.com/file/F96BD9BAB00592D001EB5B36350E0AD1AA09EFA4/511817.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]},{\"flags\":[],\"item_id\":49428}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15757,\"description\":\"+32 Power\n+18 Toughness\n+18 Vitality\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":71},{\"attribute\":\"Toughness\",\"modifier\":50},{\"attribute\":\"Vitality\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37099() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ring of Red Death (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37099,\"icon\":\"https://render.guildwars2.com/file/B155B37AD048CA9054F749043C3E4E99973DF8DF/511826.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]},{\"flags\":[],\"item_id\":49428}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15755,\"description\":\"+32 Power\n+18 Ferocity\n+18 Precision\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":71},{\"attribute\":\"Precision\",\"modifier\":50},{\"attribute\":\"CritDamage\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37100() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ralena's Band (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37100,\"icon\":\"https://render.guildwars2.com/file/5C6368E7DDAA72C8BEE158002374F19D5F69DA51/511818.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]},{\"flags\":[],\"item_id\":49428}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15752,\"description\":\"+32 Condition Damage\n+18 Precision\n+18 Toughness\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":71},{\"attribute\":\"Vitality\",\"modifier\":50},{\"attribute\":\"Toughness\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37101() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vassar's Band (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37101,\"icon\":\"https://render.guildwars2.com/file/F62F7509E6A1F8C4A8E3F026040B6EB9E8E590A9/511827.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]},{\"flags\":[],\"item_id\":49428}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15752,\"description\":\"+32 Condition Damage\n+18 Precision\n+18 Toughness\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":71},{\"attribute\":\"Vitality\",\"modifier\":50},{\"attribute\":\"Toughness\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37102() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lunaria, Circle of the Moon (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37102,\"icon\":\"https://render.guildwars2.com/file/EFF8434DFE2B67026FA202091FD1F6ED2653E4A9/511819.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]},{\"flags\":[],\"item_id\":49428}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15751,\"description\":\"+13 Condition Damage\n+13 Precision\n+13 Toughness\n+13 Power\n+13 Vitality\n+13 Healing Power\n+13 Ferocity\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":33},{\"attribute\":\"Precision\",\"modifier\":33},{\"attribute\":\"Toughness\",\"modifier\":33},{\"attribute\":\"Vitality\",\"modifier\":33},{\"attribute\":\"Healing\",\"modifier\":33},{\"attribute\":\"ConditionDamage\",\"modifier\":33},{\"attribute\":\"CritDamage\",\"modifier\":33}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37103() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Solaria, Circle of the Sun (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37103,\"icon\":\"https://render.guildwars2.com/file/7428E75D16DDDF12342B629B5A32311105EBD00F/511828.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]},{\"flags\":[],\"item_id\":49428}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15751,\"description\":\"+13 Condition Damage\n+13 Precision\n+13 Toughness\n+13 Power\n+13 Vitality\n+13 Healing Power\n+13 Ferocity\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":33},{\"attribute\":\"Precision\",\"modifier\":33},{\"attribute\":\"Toughness\",\"modifier\":33},{\"attribute\":\"Vitality\",\"modifier\":33},{\"attribute\":\"Healing\",\"modifier\":33},{\"attribute\":\"ConditionDamage\",\"modifier\":33},{\"attribute\":\"CritDamage\",\"modifier\":33}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37104() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Adelbern's Royal Signet Ring (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37104,\"icon\":\"https://render.guildwars2.com/file/09DB6AF70B2FFA4B0FBF986A1F3AF70057DCED9A/511820.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]},{\"flags\":[],\"item_id\":49428}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15759,\"description\":\"+32 Toughness\n+18 Power\n+18 Ferocity\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":71},{\"attribute\":\"Power\",\"modifier\":50},{\"attribute\":\"CritDamage\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37105() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lost Seal of Usoku (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37105,\"icon\":\"https://render.guildwars2.com/file/016D1DF853B6B97B5D165EC0BE9F0597FAA1125E/511829.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]},{\"flags\":[],\"item_id\":49428}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15757,\"description\":\"+32 Power\n+18 Toughness\n+18 Vitality\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":71},{\"attribute\":\"Toughness\",\"modifier\":50},{\"attribute\":\"Vitality\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37106() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vine of the Pale Tree (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37106,\"icon\":\"https://render.guildwars2.com/file/F19213545C48BBBB6D7C0AE7BB362004B59276C2/511821.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]},{\"flags\":[],\"item_id\":49428}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15756,\"description\":\"+32 Power\n+18 Ferocity\n+18 Vitality\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":71},{\"attribute\":\"Precision\",\"modifier\":50},{\"attribute\":\"CritDamage\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37107() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rurik's Royal Signet Ring (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37107,\"icon\":\"https://render.guildwars2.com/file/5D37E17ED2A3A058166D02A170650D0F03A81CA3/511830.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]},{\"flags\":[],\"item_id\":49428}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15759,\"description\":\"+32 Toughness\n+18 Power\n+18 Ferocity\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":71},{\"attribute\":\"Power\",\"modifier\":50},{\"attribute\":\"CritDamage\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37108() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Marriner's Compass (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37108,\"icon\":\"https://render.guildwars2.com/file/225D50B7193C17213C092F6439A72AE8CBAE7180/511822.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]},{\"flags\":[],\"item_id\":49428}],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37109() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Seal of the Khan-Ur (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37109,\"icon\":\"https://render.guildwars2.com/file/24F3597F9A7B386E629AE3C69F0E56780720A1ED/511831.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]},{\"flags\":[],\"item_id\":49428}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15753,\"description\":\"+32 Healing\n+18 Condition Damage\n+18 Toughness\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":71},{\"attribute\":\"Precision\",\"modifier\":50},{\"attribute\":\"Toughness\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37110() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mellaggan's Whorl (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37110,\"icon\":\"https://render.guildwars2.com/file/4AFA1C77379C26F10ADC37BA960C2DEC080725A7/511823.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]},{\"flags\":[],\"item_id\":49428}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15753,\"description\":\"+32 Healing\n+18 Condition Damage\n+18 Toughness\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":71},{\"attribute\":\"Precision\",\"modifier\":50},{\"attribute\":\"Toughness\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}