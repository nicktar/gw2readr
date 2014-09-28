package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0052 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem13411() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coral Mithril Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":297,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13411,\"icon\":\"https://render.guildwars2.com/file/A7B3400B0B6DA320275F966BBBA1D104F7BF463C/455584.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":42},{\"attribute\":\"Precision\",\"modifier\":59},{\"attribute\":\"ConditionDamage\",\"modifier\":42}]},\"suffix_item_id\":24921,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13412() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Emerald Mithril Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":297,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13412,\"icon\":\"https://render.guildwars2.com/file/197A25D77A0E463D0955CA9501EBB724EBD6B85F/340182.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":59},{\"attribute\":\"Power\",\"modifier\":42},{\"attribute\":\"Precision\",\"modifier\":42}]},\"suffix_item_id\":24922,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13413() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Beryl Mithril Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":297,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13413,\"icon\":\"https://render.guildwars2.com/file/517B031808EB6ADDCA6CF31441116A06680804D0/455585.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":59},{\"attribute\":\"CritDamage\",\"modifier\":42},{\"attribute\":\"Vitality\",\"modifier\":42}]},\"suffix_item_id\":24919,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13414() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chrysocola Orichalcum Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13414,\"icon\":\"https://render.guildwars2.com/file/059170AD16D431E3D5436D186F9C534B727D15DD/455586.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":67},{\"attribute\":\"Power\",\"modifier\":48},{\"attribute\":\"Vitality\",\"modifier\":48}]},\"suffix_item_id\":24496,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13415() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sapphire Orichalcum Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13415,\"icon\":\"https://render.guildwars2.com/file/742892571B436DF3C65B60E21632B7E90C010009/455587.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":67},{\"attribute\":\"Power\",\"modifier\":48},{\"attribute\":\"Toughness\",\"modifier\":48}]},\"suffix_item_id\":24499,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13416() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Orichalcum Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13416,\"icon\":\"https://render.guildwars2.com/file/C0151CD7E203F6476DCC41292F6D17E2369269CE/455588.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"suffix_item_id\":24545,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13417() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ruby Orichalcum Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13417,\"icon\":\"https://render.guildwars2.com/file/F60D6E7659B061E3BFE95F6A0102EE07A97CCF25/455589.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":67},{\"attribute\":\"Precision\",\"modifier\":48},{\"attribute\":\"CritDamage\",\"modifier\":48}]},\"suffix_item_id\":24498,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13418() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coral Orichalcum Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13418,\"icon\":\"https://render.guildwars2.com/file/1376EE0F090FBB94DB79D6176F020166F1F54CB2/455590.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":48},{\"attribute\":\"Precision\",\"modifier\":67},{\"attribute\":\"ConditionDamage\",\"modifier\":48}]},\"suffix_item_id\":24544,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13419() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Emerald Orichalcum Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13419,\"icon\":\"https://render.guildwars2.com/file/D7C5796FDD530ADD310318DD12CA48B533EA9A64/455591.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":67},{\"attribute\":\"Power\",\"modifier\":48},{\"attribute\":\"Precision\",\"modifier\":48}]},\"suffix_item_id\":24497,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13420() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Beryl Orichalcum Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13420,\"icon\":\"https://render.guildwars2.com/file/915D0C6EB426A22D52A94A9E14747C5D2E536F43/455592.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":67},{\"attribute\":\"CritDamage\",\"modifier\":48},{\"attribute\":\"Vitality\",\"modifier\":48}]},\"suffix_item_id\":24543,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13421() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Beryl Platinum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":55,\"rarity\":\"Fine\",\"vendor_value\":60,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13421,\"icon\":\"https://render.guildwars2.com/file/4CDD6C39321F22E0A5210B1D62ECC1440D7A0763/340195.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":24},{\"attribute\":\"CritDamage\",\"modifier\":17},{\"attribute\":\"Vitality\",\"modifier\":17}]},\"suffix_item_id\":24872,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13422() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chrysocola Platinum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":55,\"rarity\":\"Fine\",\"vendor_value\":60,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13422,\"icon\":\"https://render.guildwars2.com/file/CAB5B358389AA8007F9A927871937D692A0EF83F/340196.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":24},{\"attribute\":\"Power\",\"modifier\":17},{\"attribute\":\"Vitality\",\"modifier\":17}]},\"suffix_item_id\":24870,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13423() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Emerald Platinum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":55,\"rarity\":\"Fine\",\"vendor_value\":60,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13423,\"icon\":\"https://render.guildwars2.com/file/B4E1E95F004577345B15B52E263E70453306011D/340197.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":24},{\"attribute\":\"Power\",\"modifier\":17},{\"attribute\":\"Precision\",\"modifier\":17}]},\"suffix_item_id\":24871,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13424() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coral Platinum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":60,\"rarity\":\"Fine\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13424,\"icon\":\"https://render.guildwars2.com/file/192E4EEA5303035937D72D1BBE2FC76D07BF1F1F/340198.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":20},{\"attribute\":\"Precision\",\"modifier\":27},{\"attribute\":\"ConditionDamage\",\"modifier\":20}]},\"suffix_item_id\":24874,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13425() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ruby Platinum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":60,\"rarity\":\"Fine\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13425,\"icon\":\"https://render.guildwars2.com/file/973F553309319A79D662AF5F45C12B72E539032D/340199.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":27},{\"attribute\":\"Precision\",\"modifier\":20},{\"attribute\":\"CritDamage\",\"modifier\":20}]},\"suffix_item_id\":24873,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13426() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sapphire Platinum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":60,\"rarity\":\"Fine\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13426,\"icon\":\"https://render.guildwars2.com/file/E706E8572CFA0AEF231FD2FAA1AD6F4EB796F0B1/340200.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":27},{\"attribute\":\"Power\",\"modifier\":20},{\"attribute\":\"Toughness\",\"modifier\":20}]},\"suffix_item_id\":24876,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13427() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Platinum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":60,\"rarity\":\"Fine\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13427,\"icon\":\"https://render.guildwars2.com/file/F75E010D69517678A090C4B37F33F4B755C6AD74/340201.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"suffix_item_id\":24875,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13428() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ruby Platinum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":138,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13428,\"icon\":\"https://render.guildwars2.com/file/973F553309319A79D662AF5F45C12B72E539032D/340199.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":33},{\"attribute\":\"Precision\",\"modifier\":24},{\"attribute\":\"CritDamage\",\"modifier\":24}]},\"suffix_item_id\":24877,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13429() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sapphire Platinum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":138,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13429,\"icon\":\"https://render.guildwars2.com/file/E706E8572CFA0AEF231FD2FAA1AD6F4EB796F0B1/340200.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":33},{\"attribute\":\"Power\",\"modifier\":24},{\"attribute\":\"Toughness\",\"modifier\":24}]},\"suffix_item_id\":24882,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13430() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Beryl Platinum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":138,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13430,\"icon\":\"https://render.guildwars2.com/file/4CDD6C39321F22E0A5210B1D62ECC1440D7A0763/340195.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":33},{\"attribute\":\"CritDamage\",\"modifier\":24},{\"attribute\":\"Vitality\",\"modifier\":24}]},\"suffix_item_id\":24883,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13431() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chrysocola Platinum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":138,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13431,\"icon\":\"https://render.guildwars2.com/file/CAB5B358389AA8007F9A927871937D692A0EF83F/340196.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":33},{\"attribute\":\"Power\",\"modifier\":24},{\"attribute\":\"Vitality\",\"modifier\":24}]},\"suffix_item_id\":24878,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13432() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Emerald Platinum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":138,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13432,\"icon\":\"https://render.guildwars2.com/file/B4E1E95F004577345B15B52E263E70453306011D/340197.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":33},{\"attribute\":\"Power\",\"modifier\":24},{\"attribute\":\"Precision\",\"modifier\":24}]},\"suffix_item_id\":24881,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13433() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coral Platinum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":138,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13433,\"icon\":\"https://render.guildwars2.com/file/192E4EEA5303035937D72D1BBE2FC76D07BF1F1F/340198.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":24},{\"attribute\":\"Precision\",\"modifier\":33},{\"attribute\":\"ConditionDamage\",\"modifier\":24}]},\"suffix_item_id\":24879,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13434() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Platinum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":138,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13434,\"icon\":\"https://render.guildwars2.com/file/F75E010D69517678A090C4B37F33F4B755C6AD74/340201.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"suffix_item_id\":24880,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13435() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chrysocola Mithril Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":70,\"rarity\":\"Fine\",\"vendor_value\":74,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13435,\"icon\":\"https://render.guildwars2.com/file/2A0566A2B4C4106C6DB7D5CA2675666E450D495E/340202.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":34},{\"attribute\":\"Power\",\"modifier\":25},{\"attribute\":\"Vitality\",\"modifier\":25}]},\"suffix_item_id\":24511,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}