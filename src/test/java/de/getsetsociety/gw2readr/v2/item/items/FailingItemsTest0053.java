package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0053 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem13436() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Emerald Mithril Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":70,\"rarity\":\"Fine\",\"vendor_value\":74,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13436,\"icon\":\"https://render.guildwars2.com/file/0E690ED1016F28406EEB783B1BAABFD49538D6D3/340203.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":34},{\"attribute\":\"Power\",\"modifier\":25},{\"attribute\":\"Precision\",\"modifier\":25}]},\"suffix_item_id\":24473,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13437() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Beryl Mithril Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":70,\"rarity\":\"Fine\",\"vendor_value\":74,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13437,\"icon\":\"https://render.guildwars2.com/file/B5560307A891D69A5780ED62AC03063E3E2FBD92/340204.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":34},{\"attribute\":\"CritDamage\",\"modifier\":25},{\"attribute\":\"Vitality\",\"modifier\":25}]},\"suffix_item_id\":24519,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13438() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sapphire Mithril Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":78,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13438,\"icon\":\"https://render.guildwars2.com/file/0FA8319ABC359EC9DAC4D0B7B428576947ECFD9E/340205.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":38},{\"attribute\":\"Power\",\"modifier\":27},{\"attribute\":\"Toughness\",\"modifier\":27}]},\"suffix_item_id\":24475,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13439() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Mithril Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":78,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13439,\"icon\":\"https://render.guildwars2.com/file/D967E8DD9CF6575498243D6DE8116AEC70B22BDE/340206.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"suffix_item_id\":24521,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13440() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ruby Mithril Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":78,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13440,\"icon\":\"https://render.guildwars2.com/file/9DDB1A256F500B6B9AAC0396F3FFA3A3550CFC7D/340207.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":38},{\"attribute\":\"Precision\",\"modifier\":27},{\"attribute\":\"CritDamage\",\"modifier\":27}]},\"suffix_item_id\":24474,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13441() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coral Mithril Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":78,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13441,\"icon\":\"https://render.guildwars2.com/file/2824620F41287903D308ECF725A92FF0410B4C04/340208.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":27},{\"attribute\":\"Precision\",\"modifier\":38},{\"attribute\":\"ConditionDamage\",\"modifier\":27}]},\"suffix_item_id\":24509,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13442() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chrysocola Mithril Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13442,\"icon\":\"https://render.guildwars2.com/file/2A0566A2B4C4106C6DB7D5CA2675666E450D495E/340202.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":46},{\"attribute\":\"Power\",\"modifier\":33},{\"attribute\":\"Vitality\",\"modifier\":33}]},\"suffix_item_id\":24492,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13443() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sapphire Mithril Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13443,\"icon\":\"https://render.guildwars2.com/file/0FA8319ABC359EC9DAC4D0B7B428576947ECFD9E/340205.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":46},{\"attribute\":\"Power\",\"modifier\":33},{\"attribute\":\"Toughness\",\"modifier\":33}]},\"suffix_item_id\":24495,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13444() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Mithril Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13444,\"icon\":\"https://render.guildwars2.com/file/D967E8DD9CF6575498243D6DE8116AEC70B22BDE/340206.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"suffix_item_id\":24542,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13445() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ruby Mithril Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13445,\"icon\":\"https://render.guildwars2.com/file/9DDB1A256F500B6B9AAC0396F3FFA3A3550CFC7D/340207.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":46},{\"attribute\":\"Precision\",\"modifier\":33},{\"attribute\":\"CritDamage\",\"modifier\":33}]},\"suffix_item_id\":24494,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13446() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coral Mithril Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13446,\"icon\":\"https://render.guildwars2.com/file/2824620F41287903D308ECF725A92FF0410B4C04/340208.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":33},{\"attribute\":\"Precision\",\"modifier\":46},{\"attribute\":\"ConditionDamage\",\"modifier\":33}]},\"suffix_item_id\":24541,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13447() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Emerald Mithril Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13447,\"icon\":\"https://render.guildwars2.com/file/0E690ED1016F28406EEB783B1BAABFD49538D6D3/340203.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":46},{\"attribute\":\"Power\",\"modifier\":33},{\"attribute\":\"Precision\",\"modifier\":33}]},\"suffix_item_id\":24493,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13448() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Beryl Mithril Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13448,\"icon\":\"https://render.guildwars2.com/file/B5560307A891D69A5780ED62AC03063E3E2FBD92/340204.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":46},{\"attribute\":\"CritDamage\",\"modifier\":33},{\"attribute\":\"Vitality\",\"modifier\":33}]},\"suffix_item_id\":24540,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13449() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chrysocola Mithril Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":248,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13449,\"icon\":\"https://render.guildwars2.com/file/31059ECA58D4609B91EFDA61BFCDCDB5C1480D2B/433693.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":49},{\"attribute\":\"Power\",\"modifier\":35},{\"attribute\":\"Vitality\",\"modifier\":35}]},\"suffix_item_id\":24920,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13450() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sapphire Mithril Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":248,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13450,\"icon\":\"https://render.guildwars2.com/file/01E71E1EEB13ABF19F2DAE331427DC6BEBED0A4D/433694.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":49},{\"attribute\":\"Power\",\"modifier\":35},{\"attribute\":\"Toughness\",\"modifier\":35}]},\"suffix_item_id\":24925,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13451() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Mithril Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":248,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13451,\"icon\":\"https://render.guildwars2.com/file/BA4201104F604DDA3C45F5735333E0BB9EE2577D/433695.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"suffix_item_id\":24923,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13452() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ruby Mithril Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":248,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13452,\"icon\":\"https://render.guildwars2.com/file/A7072EAC559E62B2CFFFE9A5BEDD23250A787574/433696.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":49},{\"attribute\":\"Precision\",\"modifier\":35},{\"attribute\":\"CritDamage\",\"modifier\":35}]},\"suffix_item_id\":24924,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13453() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coral Mithril Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":248,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13453,\"icon\":\"https://render.guildwars2.com/file/4A2A304A779567DC9A76A330DB710DF80DAF04A6/433697.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":35},{\"attribute\":\"Precision\",\"modifier\":49},{\"attribute\":\"ConditionDamage\",\"modifier\":35}]},\"suffix_item_id\":24921,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13454() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Emerald Mithril Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":248,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13454,\"icon\":\"https://render.guildwars2.com/file/A8C82493049FB83D0366D40F9D11DD804A9CF497/433698.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":49},{\"attribute\":\"Power\",\"modifier\":35},{\"attribute\":\"Precision\",\"modifier\":35}]},\"suffix_item_id\":24922,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13455() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Beryl Mithril Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":248,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13455,\"icon\":\"https://render.guildwars2.com/file/2F0D6A1BAB03A6B20F37B39DFC0E8005EA01C06B/433699.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":49},{\"attribute\":\"CritDamage\",\"modifier\":35},{\"attribute\":\"Vitality\",\"modifier\":35}]},\"suffix_item_id\":24919,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13456() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chrysocola Orichalcum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13456,\"icon\":\"https://render.guildwars2.com/file/7EBCE390B2FD4BB26B055D65AE7F9F2BA3BA28DF/433700.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":56},{\"attribute\":\"Power\",\"modifier\":40},{\"attribute\":\"Vitality\",\"modifier\":40}]},\"suffix_item_id\":24496,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13457() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sapphire Orichalcum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13457,\"icon\":\"https://render.guildwars2.com/file/EB4C6E156858651F352C6F01E2B5547BBE26F5C7/433701.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":56},{\"attribute\":\"Power\",\"modifier\":40},{\"attribute\":\"Toughness\",\"modifier\":40}]},\"suffix_item_id\":24499,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13458() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Orichalcum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13458,\"icon\":\"https://render.guildwars2.com/file/5007F9AD422CA0F47619EC48DF1CE5E0D1B40276/433702.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"suffix_item_id\":24545,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13459() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ruby Orichalcum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13459,\"icon\":\"https://render.guildwars2.com/file/29F124099BBC31F0AA34B9596A163A99652D6512/433703.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":56},{\"attribute\":\"Precision\",\"modifier\":40},{\"attribute\":\"CritDamage\",\"modifier\":40}]},\"suffix_item_id\":24498,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13460() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coral Orichalcum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13460,\"icon\":\"https://render.guildwars2.com/file/B2B61CE6E05539492D7B546567AE980196D10811/433704.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":40},{\"attribute\":\"Precision\",\"modifier\":56},{\"attribute\":\"ConditionDamage\",\"modifier\":40}]},\"suffix_item_id\":24544,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}