package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0054 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem13461() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Emerald Orichalcum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13461,\"icon\":\"https://render.guildwars2.com/file/41D90B0C700B16E8E2F507CCBCBF01FD09991A23/433705.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":56},{\"attribute\":\"Power\",\"modifier\":40},{\"attribute\":\"Precision\",\"modifier\":40}]},\"suffix_item_id\":24497,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13462() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Beryl Orichalcum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13462,\"icon\":\"https://render.guildwars2.com/file/16E2789553A380F593BE602B0B6FBB7E0C53792D/433706.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":56},{\"attribute\":\"CritDamage\",\"modifier\":40},{\"attribute\":\"Vitality\",\"modifier\":40}]},\"suffix_item_id\":24543,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13463() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Beryl Platinum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":55,\"rarity\":\"Fine\",\"vendor_value\":96,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13463,\"icon\":\"https://render.guildwars2.com/file/B6B26C027778CBDB38711F4E7608A2A17F53C5CD/340216.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":38},{\"attribute\":\"CritDamage\",\"modifier\":27},{\"attribute\":\"Vitality\",\"modifier\":27}]},\"suffix_item_id\":24872,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13464() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chrysocola Platinum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":55,\"rarity\":\"Fine\",\"vendor_value\":96,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13464,\"icon\":\"https://render.guildwars2.com/file/1A147B53A36CEC3B36EC029E9E7221DA440A54C2/340217.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":38},{\"attribute\":\"Power\",\"modifier\":27},{\"attribute\":\"Vitality\",\"modifier\":27}]},\"suffix_item_id\":24870,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13465() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Emerald Platinum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":55,\"rarity\":\"Fine\",\"vendor_value\":96,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13465,\"icon\":\"https://render.guildwars2.com/file/110B22937EC19D19ACA2F60F234437C2D45EF5B7/340218.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":38},{\"attribute\":\"Power\",\"modifier\":27},{\"attribute\":\"Precision\",\"modifier\":27}]},\"suffix_item_id\":24871,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13466() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coral Platinum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":60,\"rarity\":\"Fine\",\"vendor_value\":104,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13466,\"icon\":\"https://render.guildwars2.com/file/C4BD59E80DEE9D39970C90A42CBF059502AB67CC/340219.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":31},{\"attribute\":\"Precision\",\"modifier\":44},{\"attribute\":\"ConditionDamage\",\"modifier\":31}]},\"suffix_item_id\":24874,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13467() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ruby Platinum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":60,\"rarity\":\"Fine\",\"vendor_value\":104,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13467,\"icon\":\"https://render.guildwars2.com/file/1EB07006DF201DBB171ADACE0944A397BBA59991/340220.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":44},{\"attribute\":\"Precision\",\"modifier\":31},{\"attribute\":\"CritDamage\",\"modifier\":31}]},\"suffix_item_id\":24873,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13468() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sapphire Platinum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":60,\"rarity\":\"Fine\",\"vendor_value\":104,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13468,\"icon\":\"https://render.guildwars2.com/file/9D2704344808059F0CC793BE097E26C52564CD9F/340221.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":44},{\"attribute\":\"Power\",\"modifier\":31},{\"attribute\":\"Toughness\",\"modifier\":31}]},\"suffix_item_id\":24876,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13469() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Platinum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":60,\"rarity\":\"Fine\",\"vendor_value\":104,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13469,\"icon\":\"https://render.guildwars2.com/file/EB40509F1874E14DD7BF07040263207B7059065F/340222.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"suffix_item_id\":24875,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13470() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ruby Platinum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":220,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13470,\"icon\":\"https://render.guildwars2.com/file/1EB07006DF201DBB171ADACE0944A397BBA59991/340220.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":53},{\"attribute\":\"Precision\",\"modifier\":38},{\"attribute\":\"CritDamage\",\"modifier\":38}]},\"suffix_item_id\":24877,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13471() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sapphire Platinum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":220,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13471,\"icon\":\"https://render.guildwars2.com/file/9D2704344808059F0CC793BE097E26C52564CD9F/340221.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":53},{\"attribute\":\"Power\",\"modifier\":38},{\"attribute\":\"Toughness\",\"modifier\":38}]},\"suffix_item_id\":24882,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13472() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Beryl Platinum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":220,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13472,\"icon\":\"https://render.guildwars2.com/file/B6B26C027778CBDB38711F4E7608A2A17F53C5CD/340216.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":53},{\"attribute\":\"CritDamage\",\"modifier\":38},{\"attribute\":\"Vitality\",\"modifier\":38}]},\"suffix_item_id\":24883,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13473() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chrysocola Platinum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":220,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13473,\"icon\":\"https://render.guildwars2.com/file/1A147B53A36CEC3B36EC029E9E7221DA440A54C2/340217.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":53},{\"attribute\":\"Power\",\"modifier\":38},{\"attribute\":\"Vitality\",\"modifier\":38}]},\"suffix_item_id\":24878,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13474() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Emerald Platinum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":220,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13474,\"icon\":\"https://render.guildwars2.com/file/110B22937EC19D19ACA2F60F234437C2D45EF5B7/340218.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":53},{\"attribute\":\"Power\",\"modifier\":38},{\"attribute\":\"Precision\",\"modifier\":38}]},\"suffix_item_id\":24881,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13475() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coral Platinum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":220,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13475,\"icon\":\"https://render.guildwars2.com/file/C4BD59E80DEE9D39970C90A42CBF059502AB67CC/340219.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":38},{\"attribute\":\"Precision\",\"modifier\":53},{\"attribute\":\"ConditionDamage\",\"modifier\":38}]},\"suffix_item_id\":24879,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13476() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Platinum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":220,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13476,\"icon\":\"https://render.guildwars2.com/file/EB40509F1874E14DD7BF07040263207B7059065F/340222.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"suffix_item_id\":24880,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13477() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chrysocola Mithril Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":264,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13477,\"icon\":\"https://render.guildwars2.com/file/C620A54B0E104615BB406A4A6ADFA611B00C0678/340223.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":73},{\"attribute\":\"Power\",\"modifier\":52},{\"attribute\":\"Vitality\",\"modifier\":52}]},\"suffix_item_id\":24492,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13478() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Emerald Mithril Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":264,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13478,\"icon\":\"https://render.guildwars2.com/file/0605D2534DAD3DADEBFC4DEB736FA363734AC1E5/340224.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":73},{\"attribute\":\"Power\",\"modifier\":52},{\"attribute\":\"Precision\",\"modifier\":52}]},\"suffix_item_id\":24493,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13479() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Beryl Mithril Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":264,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13479,\"icon\":\"https://render.guildwars2.com/file/4C46A4534AE37C5914CF1E09CF9AD50D55969160/340225.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":73},{\"attribute\":\"CritDamage\",\"modifier\":52},{\"attribute\":\"Vitality\",\"modifier\":52}]},\"suffix_item_id\":24540,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13480() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sapphire Mithril Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":264,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13480,\"icon\":\"https://render.guildwars2.com/file/726213AF0D7831B35767483DC0E2A4746A5646C9/340226.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":73},{\"attribute\":\"Power\",\"modifier\":52},{\"attribute\":\"Toughness\",\"modifier\":52}]},\"suffix_item_id\":24495,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13481() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Mithril Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":264,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13481,\"icon\":\"https://render.guildwars2.com/file/6053B72BB43CC6BA606610EFF5FB5069406B3302/340227.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"suffix_item_id\":24542,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13482() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ruby Mithril Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":124,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13482,\"icon\":\"https://render.guildwars2.com/file/ABCB6CB43ABEBBDDB0B22BCF0B2B99A2F07CF40F/340228.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":61},{\"attribute\":\"Precision\",\"modifier\":44},{\"attribute\":\"CritDamage\",\"modifier\":44}]},\"suffix_item_id\":24474,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13483() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sapphire Mithril Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":124,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13483,\"icon\":\"https://render.guildwars2.com/file/726213AF0D7831B35767483DC0E2A4746A5646C9/340226.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":61},{\"attribute\":\"Power\",\"modifier\":44},{\"attribute\":\"Toughness\",\"modifier\":44}]},\"suffix_item_id\":24475,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13484() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Beryl Mithril Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":70,\"rarity\":\"Fine\",\"vendor_value\":118,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13484,\"icon\":\"https://render.guildwars2.com/file/4C46A4534AE37C5914CF1E09CF9AD50D55969160/340225.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":55},{\"attribute\":\"CritDamage\",\"modifier\":39},{\"attribute\":\"Vitality\",\"modifier\":39}]},\"suffix_item_id\":24519,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13485() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chrysocola Mithril Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":70,\"rarity\":\"Fine\",\"vendor_value\":118,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13485,\"icon\":\"https://render.guildwars2.com/file/C620A54B0E104615BB406A4A6ADFA611B00C0678/340223.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":55},{\"attribute\":\"Power\",\"modifier\":39},{\"attribute\":\"Vitality\",\"modifier\":39}]},\"suffix_item_id\":24511,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}