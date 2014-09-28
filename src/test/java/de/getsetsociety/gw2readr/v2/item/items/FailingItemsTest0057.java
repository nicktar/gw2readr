package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0057 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem13536() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Platinum Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":248,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13536,\"icon\":\"https://render.guildwars2.com/file/B20FC548FEBB3CDB777CC3C2A2F0E99A5E1ACAFC/455621.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"suffix_item_id\":24916,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13537() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Beryl Platinum Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":248,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13537,\"icon\":\"https://render.guildwars2.com/file/34D54C7523B6A9243A99FBC0614D9849959BC8DA/455622.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":43},{\"attribute\":\"CritDamage\",\"modifier\":31},{\"attribute\":\"Vitality\",\"modifier\":31}]},\"suffix_item_id\":24912,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13538() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ruby Platinum Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":248,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13538,\"icon\":\"https://render.guildwars2.com/file/5822F752A654800EC6E65268F8972F03A4A60165/455623.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":43},{\"attribute\":\"Precision\",\"modifier\":31},{\"attribute\":\"CritDamage\",\"modifier\":31}]},\"suffix_item_id\":24917,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13539() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coral Platinum Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":248,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13539,\"icon\":\"https://render.guildwars2.com/file/7FC9EB910541007F3BEC37DE65EB763D20A90230/455624.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":31},{\"attribute\":\"Precision\",\"modifier\":43},{\"attribute\":\"ConditionDamage\",\"modifier\":31}]},\"suffix_item_id\":24914,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13540() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Emerald Platinum Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":248,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13540,\"icon\":\"https://render.guildwars2.com/file/97B4B0F044054B970CD170E0455953E0E6A19175/455625.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":43},{\"attribute\":\"Power\",\"modifier\":31},{\"attribute\":\"Precision\",\"modifier\":31}]},\"suffix_item_id\":24915,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13541() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Topaz Silver Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":128,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13541,\"icon\":\"https://render.guildwars2.com/file/4AFAC49C980112EA05729B27BD7D36976330C43A/433707.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":16},{\"attribute\":\"Precision\",\"modifier\":11}]},\"suffix_item_id\":24904,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13542() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spinel Silver Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":128,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13542,\"icon\":\"https://render.guildwars2.com/file/9400E969FD632F0BDC07555AC3D04A65F3D1F8C4/433708.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":16},{\"attribute\":\"Power\",\"modifier\":11}]},\"suffix_item_id\":24902,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13543() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Peridot Silver Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":128,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13543,\"icon\":\"https://render.guildwars2.com/file/087B4CA22906C6A2599A36A8CA7AA821C90A064D/433709.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":16},{\"attribute\":\"CritDamage\",\"modifier\":11}]},\"suffix_item_id\":24901,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13544() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sunstone Silver Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":128,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13544,\"icon\":\"https://render.guildwars2.com/file/EDB0C80F063DC97F0C053C01594C13C40C5EC818/433710.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"suffix_item_id\":24903,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13545() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carnelian Silver Stud\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":128,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13545,\"icon\":\"https://render.guildwars2.com/file/0E3E090F9FA4C171F3429180D34145C7F14EDFEF/433711.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":16},{\"attribute\":\"Precision\",\"modifier\":11}]},\"suffix_item_id\":24899,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13546() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Amethyst Silver Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":128,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13546,\"icon\":\"https://render.guildwars2.com/file/A43639E59B3A2A942FB99F62B0C997C8C903A71A/433712.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":16},{\"attribute\":\"Vitality\",\"modifier\":11}]},\"suffix_item_id\":24898,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13547() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lapis Silver Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":128,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13547,\"icon\":\"https://render.guildwars2.com/file/09A4B952CB3F9E510FAB7D5BB6E6360201C477B7/433713.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":16},{\"attribute\":\"Toughness\",\"modifier\":11}]},\"suffix_item_id\":24900,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13548() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Topaz Gold Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":169,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13548,\"icon\":\"https://render.guildwars2.com/file/C66CC875E22B6075C42AF754A8CD0C6FCB7A1219/433714.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":25},{\"attribute\":\"Precision\",\"modifier\":18}]},\"suffix_item_id\":24911,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13549() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spinel Gold Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":169,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13549,\"icon\":\"https://render.guildwars2.com/file/73C7A348740CBA5FF2B44A6054B1A8E9A4EC9C62/433715.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":25},{\"attribute\":\"Power\",\"modifier\":18}]},\"suffix_item_id\":24909,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13550() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Peridot Gold Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":169,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13550,\"icon\":\"https://render.guildwars2.com/file/BCADA20703689D6F7E5E02402E7B4A7C06E7C40A/433716.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":25},{\"attribute\":\"CritDamage\",\"modifier\":18}]},\"suffix_item_id\":24908,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13551() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sunstone Gold Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":169,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13551,\"icon\":\"https://render.guildwars2.com/file/662E762604C275B3974E37B824CB3751C09E44E2/433717.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"suffix_item_id\":24910,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13552() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carnelian Gold Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":169,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13552,\"icon\":\"https://render.guildwars2.com/file/07B1A3AC0A0ED24A9528E10B1EB419D3C175F93B/433718.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":25},{\"attribute\":\"Precision\",\"modifier\":18}]},\"suffix_item_id\":24906,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13553() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Amethyst Gold Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":169,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13553,\"icon\":\"https://render.guildwars2.com/file/78A80FDBA90137C8DC9D0D25EE0AFAF6012F28B0/433719.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":25},{\"attribute\":\"Vitality\",\"modifier\":18}]},\"suffix_item_id\":24905,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13554() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lapis Gold Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":169,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13554,\"icon\":\"https://render.guildwars2.com/file/2C04E068E806BFFED4A1CA0234E30E604F316EEC/433720.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":25},{\"attribute\":\"Toughness\",\"modifier\":18}]},\"suffix_item_id\":24907,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13555() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chrysocola Platinum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":207,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13555,\"icon\":\"https://render.guildwars2.com/file/DB42EF6D24725E18DF3A37A90B2EE318FBBCD941/433721.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":36},{\"attribute\":\"Power\",\"modifier\":26},{\"attribute\":\"Vitality\",\"modifier\":26}]},\"suffix_item_id\":24913,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13556() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sapphire Platinum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":207,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13556,\"icon\":\"https://render.guildwars2.com/file/61E970A6BE0E251671416DCC684D45081F25189E/433722.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":36},{\"attribute\":\"Power\",\"modifier\":26},{\"attribute\":\"Toughness\",\"modifier\":26}]},\"suffix_item_id\":24918,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13557() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Platinum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":207,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13557,\"icon\":\"https://render.guildwars2.com/file/213D7EBCF9034610EA4093C95C4C5C115F1901F3/433723.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"suffix_item_id\":24916,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13558() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Beryl Platinum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":207,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13558,\"icon\":\"https://render.guildwars2.com/file/D8A3341A03B4C72D02471BE519AF442DA880B015/433724.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":36},{\"attribute\":\"CritDamage\",\"modifier\":26},{\"attribute\":\"Vitality\",\"modifier\":26}]},\"suffix_item_id\":24912,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13559() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ruby Platinum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":207,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13559,\"icon\":\"https://render.guildwars2.com/file/10627D07E439CD0FA3DD24B5F1BA19925E75C3DF/433725.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":36},{\"attribute\":\"Precision\",\"modifier\":26},{\"attribute\":\"CritDamage\",\"modifier\":26}]},\"suffix_item_id\":24917,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13560() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coral Platinum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":207,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13560,\"icon\":\"https://render.guildwars2.com/file/40EFF26FE4D403060CB40E62CB62773E3CDA001F/433726.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":26},{\"attribute\":\"Precision\",\"modifier\":36},{\"attribute\":\"ConditionDamage\",\"modifier\":26}]},\"suffix_item_id\":24914,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}