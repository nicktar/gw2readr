package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0055 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem13486() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Emerald Mithril Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":70,\"rarity\":\"Fine\",\"vendor_value\":118,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13486,\"icon\":\"https://render.guildwars2.com/file/0605D2534DAD3DADEBFC4DEB736FA363734AC1E5/340224.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":55},{\"attribute\":\"Power\",\"modifier\":39},{\"attribute\":\"Precision\",\"modifier\":39}]},\"suffix_item_id\":24473,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13487() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ruby Mithril Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":264,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13487,\"icon\":\"https://render.guildwars2.com/file/ABCB6CB43ABEBBDDB0B22BCF0B2B99A2F07CF40F/340228.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":73},{\"attribute\":\"Precision\",\"modifier\":52},{\"attribute\":\"CritDamage\",\"modifier\":52}]},\"suffix_item_id\":24494,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13488() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coral Mithril Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":124,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13488,\"icon\":\"https://render.guildwars2.com/file/25BF51C0950B6CCEA71D35D03B4B51360AC4694F/340229.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":44},{\"attribute\":\"Precision\",\"modifier\":61},{\"attribute\":\"ConditionDamage\",\"modifier\":44}]},\"suffix_item_id\":24509,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13489() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Mithril Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":124,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13489,\"icon\":\"https://render.guildwars2.com/file/6053B72BB43CC6BA606610EFF5FB5069406B3302/340227.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"suffix_item_id\":24521,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13490() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coral Mithril Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":264,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13490,\"icon\":\"https://render.guildwars2.com/file/25BF51C0950B6CCEA71D35D03B4B51360AC4694F/340229.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":52},{\"attribute\":\"Precision\",\"modifier\":73},{\"attribute\":\"ConditionDamage\",\"modifier\":52}]},\"suffix_item_id\":24541,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13491() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chrysocola Mithril Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13491,\"icon\":\"https://render.guildwars2.com/file/09237E3DFA29A4FA97DCC940302CF791B8D79902/455593.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":79},{\"attribute\":\"Power\",\"modifier\":56},{\"attribute\":\"Vitality\",\"modifier\":56}]},\"suffix_item_id\":24920,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13492() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sapphire Mithril Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13492,\"icon\":\"https://render.guildwars2.com/file/A731A16D2A20E46275E310F51496E9C1AE9FA906/455594.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":79},{\"attribute\":\"Power\",\"modifier\":56},{\"attribute\":\"Toughness\",\"modifier\":56}]},\"suffix_item_id\":24925,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13493() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Mithril Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13493,\"icon\":\"https://render.guildwars2.com/file/7B9DEC4B7AC64DD26E94EC22FB0B177902E7B291/455595.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"suffix_item_id\":24923,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13494() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ruby Mithril Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13494,\"icon\":\"https://render.guildwars2.com/file/2A5CB710947ACCB257C5C9A961E5E2EE21470D16/455596.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":79},{\"attribute\":\"Precision\",\"modifier\":56},{\"attribute\":\"CritDamage\",\"modifier\":56}]},\"suffix_item_id\":24924,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13495() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coral Mithril Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13495,\"icon\":\"https://render.guildwars2.com/file/4E7F58636A5DFA1B104D30292CD99B4DDFFD1E73/455597.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":56},{\"attribute\":\"Precision\",\"modifier\":79},{\"attribute\":\"ConditionDamage\",\"modifier\":56}]},\"suffix_item_id\":24921,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13496() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Emerald Mithril Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13496,\"icon\":\"https://render.guildwars2.com/file/CC65AB4168F66DE64EB54B52911437C567E7E8D1/455598.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":79},{\"attribute\":\"Power\",\"modifier\":56},{\"attribute\":\"Precision\",\"modifier\":56}]},\"suffix_item_id\":24922,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13497() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Beryl Mithril Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13497,\"icon\":\"https://render.guildwars2.com/file/58DFC550985EA357FD0890446577373C0747B119/455599.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":79},{\"attribute\":\"CritDamage\",\"modifier\":56},{\"attribute\":\"Vitality\",\"modifier\":56}]},\"suffix_item_id\":24919,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13498() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chrysocola Orichalcum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":528,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13498,\"icon\":\"https://render.guildwars2.com/file/573BCC5BA8D3303201B061369D24704DCD0D7FDC/455600.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":90},{\"attribute\":\"Power\",\"modifier\":64},{\"attribute\":\"Vitality\",\"modifier\":64}]},\"suffix_item_id\":24496,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13499() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sapphire Orichalcum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":528,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13499,\"icon\":\"https://render.guildwars2.com/file/D618AC3E63F766062BD75061F8BE2DF7120E051E/455601.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":90},{\"attribute\":\"Power\",\"modifier\":64},{\"attribute\":\"Toughness\",\"modifier\":64}]},\"suffix_item_id\":24499,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13500() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Orichalcum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":528,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13500,\"icon\":\"https://render.guildwars2.com/file/02E9EFDEF9587130A25F17AC396913FBBE3C716D/455602.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"suffix_item_id\":24545,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13501() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ruby Orichalcum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":528,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13501,\"icon\":\"https://render.guildwars2.com/file/F211FA612DB698FEF8D19E27C56BF4E6960BE36F/455603.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":90},{\"attribute\":\"Precision\",\"modifier\":64},{\"attribute\":\"CritDamage\",\"modifier\":64}]},\"suffix_item_id\":24498,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13502() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coral Orichalcum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":528,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13502,\"icon\":\"https://render.guildwars2.com/file/70731890A029E7969932461B7BA93C59AD0BD554/455604.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":64},{\"attribute\":\"Precision\",\"modifier\":90},{\"attribute\":\"ConditionDamage\",\"modifier\":64}]},\"suffix_item_id\":24544,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13503() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Emerald Orichalcum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":528,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13503,\"icon\":\"https://render.guildwars2.com/file/4E0CA54266C349A1C5301C7B0D93747842ECC5C3/455605.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":90},{\"attribute\":\"Power\",\"modifier\":64},{\"attribute\":\"Precision\",\"modifier\":64}]},\"suffix_item_id\":24497,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13504() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Beryl Orichalcum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":528,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13504,\"icon\":\"https://render.guildwars2.com/file/791FFF3E69DF4DADA80949385E079BC150FD5C0D/455606.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":90},{\"attribute\":\"CritDamage\",\"modifier\":64},{\"attribute\":\"Vitality\",\"modifier\":64}]},\"suffix_item_id\":24543,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13505() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spinel Silver Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":30,\"rarity\":\"Fine\",\"vendor_value\":47,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13505,\"icon\":\"https://render.guildwars2.com/file/5C39B5F5592A13111514E06AA3357BEC9C5146A6/340237.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":13},{\"attribute\":\"Power\",\"modifier\":10}]},\"suffix_item_id\":24889,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13506() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spinel Silver Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":102,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13506,\"icon\":\"https://render.guildwars2.com/file/5C39B5F5592A13111514E06AA3357BEC9C5146A6/340237.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":17},{\"attribute\":\"Power\",\"modifier\":12}]},\"suffix_item_id\":24896,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13507() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spinel Gold Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":45,\"rarity\":\"Fine\",\"vendor_value\":62,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13507,\"icon\":\"https://render.guildwars2.com/file/CE2ADAE7399B99BD37B3DD74F3BDA70D05F9666B/340238.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":22},{\"attribute\":\"Power\",\"modifier\":16}]},\"suffix_item_id\":24526,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13508() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spinel Gold Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":135,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13508,\"icon\":\"https://render.guildwars2.com/file/CE2ADAE7399B99BD37B3DD74F3BDA70D05F9666B/340238.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":28},{\"attribute\":\"Power\",\"modifier\":20}]},\"suffix_item_id\":24897,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13509() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spinel Silver Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":30,\"rarity\":\"Fine\",\"vendor_value\":39,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13509,\"icon\":\"https://render.guildwars2.com/file/5974CEFB6A15CDA60ED038D7BAC32879CBAEAA99/340239.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":11},{\"attribute\":\"Power\",\"modifier\":8}]},\"suffix_item_id\":24889,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13510() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spinel Silver Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":85,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13510,\"icon\":\"https://render.guildwars2.com/file/5974CEFB6A15CDA60ED038D7BAC32879CBAEAA99/340239.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":15},{\"attribute\":\"Power\",\"modifier\":10}]},\"suffix_item_id\":24896,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}