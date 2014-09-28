package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0159 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem36766() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Passiflora Orichalcum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36766,\"icon\":\"https://render.guildwars2.com/file/CE13384E71BE4FCE241962386F2DC80F0AC4ECB4/511775.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":56},{\"attribute\":\"Toughness\",\"modifier\":40},{\"attribute\":\"ConditionDamage\",\"modifier\":40}]},\"suffix_item_id\":37906,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36778() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Passiflora Mithril Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":248,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36778,\"icon\":\"https://render.guildwars2.com/file/61B19CD0F673D6B3B64DD80455B245029E1FAF69/511778.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":49},{\"attribute\":\"Toughness\",\"modifier\":35},{\"attribute\":\"ConditionDamage\",\"modifier\":35}]},\"suffix_item_id\":37908,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36784() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Passiflora Mithril Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36784,\"icon\":\"https://render.guildwars2.com/file/6E57D8075F04C041DB7B0009F41CF5D166942F32/511780.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":46},{\"attribute\":\"Toughness\",\"modifier\":33},{\"attribute\":\"ConditionDamage\",\"modifier\":33}]},\"suffix_item_id\":37909,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36790() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Passiflora Mithril Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":78,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":36790,\"icon\":\"https://render.guildwars2.com/file/6E57D8075F04C041DB7B0009F41CF5D166942F32/511780.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":38},{\"attribute\":\"Toughness\",\"modifier\":27},{\"attribute\":\"ConditionDamage\",\"modifier\":27}]},\"suffix_item_id\":37907,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36796() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bottle of Passion Fruit Sauce\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":30,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":36796,\"icon\":\"https://render.guildwars2.com/file/9995D3ED4F139D289C02C258C1F6953B2742173A/63060.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36801() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Passiflora Orichalcum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":528,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36801,\"icon\":\"https://render.guildwars2.com/file/06B670E5071E4BBE036C282E4E4398DE299A63BF/511782.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":90},{\"attribute\":\"Toughness\",\"modifier\":64},{\"attribute\":\"ConditionDamage\",\"modifier\":64}]},\"suffix_item_id\":37906,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36805() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Passiflora Mithril Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36805,\"icon\":\"https://render.guildwars2.com/file/A66B721BB15A552B7D1737A637084B3E1A64C615/511784.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":79},{\"attribute\":\"Toughness\",\"modifier\":56},{\"attribute\":\"ConditionDamage\",\"modifier\":56}]},\"suffix_item_id\":37908,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36811() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Passiflora Mithril Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":264,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36811,\"icon\":\"https://render.guildwars2.com/file/B9744EAE200311D312EE6A5C76E2A224FD2D0F99/511785.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":73},{\"attribute\":\"Toughness\",\"modifier\":52},{\"attribute\":\"ConditionDamage\",\"modifier\":52}]},\"suffix_item_id\":37909,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36823() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Passiflora Mithril Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":124,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":36823,\"icon\":\"https://render.guildwars2.com/file/B9744EAE200311D312EE6A5C76E2A224FD2D0F99/511785.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":61},{\"attribute\":\"Toughness\",\"modifier\":44},{\"attribute\":\"ConditionDamage\",\"modifier\":44}]},\"suffix_item_id\":37907,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36996() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Map Fragment\",\"description\":\"A piece of a Consortium map that features the Hanto Trading Post in Trader's Green.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36996,\"icon\":\"https://render.guildwars2.com/file/5A586EB000C6F1082A94BE736602A615382D363B/223859.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36997() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Map of Southsun Cove\",\"description\":\"Complete preliminary survey map of the Consortium's new venture, Southsun Cove.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36997,\"icon\":\"https://render.guildwars2.com/file/64B1DC3468F7D63ECDD86939AAF99ED9657E722D/511796.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36998() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unhatched Swarm Egg\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36998,\"icon\":\"https://render.guildwars2.com/file/27F030F5CAF6254CB0F57C9BC121AD47C372265E/511797.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37070() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Ascension\",\"description\":\"Used by the Mystic Forge.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":315,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":37070,\"icon\":\"https://render.guildwars2.com/file/EFE42371FCAF18C0BC49969CDC601AEAC0F3560E/511814.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37074() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Khilbron's Phylactery\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37074,\"icon\":\"https://render.guildwars2.com/file/55A6A999A52591BB7607421A13996D5DA6530780/511815.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15741,\"description\":\"+32 Condition Damage\n+18 Precision\n+18 Toughness\"},\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":71},{\"attribute\":\"Precision\",\"modifier\":50},{\"attribute\":\"Toughness\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37075() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Crystalline Band\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37075,\"icon\":\"https://render.guildwars2.com/file/3B1CC13C0A3747B4A00277113E6ACD64D522B1D1/511816.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15742,\"description\":\"+32 Power\n+18 Ferocity\n+18 Precision\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":71},{\"attribute\":\"Precision\",\"modifier\":50},{\"attribute\":\"CritDamage\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37076() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Royal Signet of Doric\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37076,\"icon\":\"https://render.guildwars2.com/file/F96BD9BAB00592D001EB5B36350E0AD1AA09EFA4/511817.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15749,\"description\":\"+32 Power\n+18 Toughness\n+18 Vitality\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":71},{\"attribute\":\"Toughness\",\"modifier\":50},{\"attribute\":\"Vitality\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37077() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ralena's Band\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37077,\"icon\":\"https://render.guildwars2.com/file/5C6368E7DDAA72C8BEE158002374F19D5F69DA51/511818.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15741,\"description\":\"+32 Condition Damage\n+18 Precision\n+18 Toughness\"},\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":71},{\"attribute\":\"Vitality\",\"modifier\":50},{\"attribute\":\"Toughness\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37078() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lunaria, Circle of the Moon\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37078,\"icon\":\"https://render.guildwars2.com/file/EFF8434DFE2B67026FA202091FD1F6ED2653E4A9/511819.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15750,\"description\":\"+13 Condition Damage\n+13 Precision\n+13 Toughness\n+13 Power\n+13 Vitality\n+13 Healing Power\n+13 Ferocity\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":33},{\"attribute\":\"Precision\",\"modifier\":33},{\"attribute\":\"Toughness\",\"modifier\":33},{\"attribute\":\"Vitality\",\"modifier\":33},{\"attribute\":\"Healing\",\"modifier\":33},{\"attribute\":\"ConditionDamage\",\"modifier\":33},{\"attribute\":\"CritDamage\",\"modifier\":33}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37079() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Adelbern's Royal Signet Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37079,\"icon\":\"https://render.guildwars2.com/file/09DB6AF70B2FFA4B0FBF986A1F3AF70057DCED9A/511820.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15743,\"description\":\"+32 Toughness\n+18 Power\n+18 Ferocity\"},\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":71},{\"attribute\":\"Power\",\"modifier\":50},{\"attribute\":\"CritDamage\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37080() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vine of the Pale Tree\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37080,\"icon\":\"https://render.guildwars2.com/file/F19213545C48BBBB6D7C0AE7BB362004B59276C2/511821.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15744,\"description\":\"+32 Power\n+18 Ferocity\n+18 Vitality\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":71},{\"attribute\":\"Precision\",\"modifier\":50},{\"attribute\":\"CritDamage\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37081() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Marriner's Compass\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37081,\"icon\":\"https://render.guildwars2.com/file/225D50B7193C17213C092F6439A72AE8CBAE7180/511822.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37082() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mellaggan's Whorl\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37082,\"icon\":\"https://render.guildwars2.com/file/4AFA1C77379C26F10ADC37BA960C2DEC080725A7/511823.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15745,\"description\":\"+32 Healing\n+18 Condition Damage\n+18 Toughness\"},\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":71},{\"attribute\":\"Precision\",\"modifier\":50},{\"attribute\":\"Toughness\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37083() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Yakkington's Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37083,\"icon\":\"https://render.guildwars2.com/file/57CC444123E8D75AF9AE19FC0DA961911E0A04B2/511824.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37084() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Circle of Light\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37084,\"icon\":\"https://render.guildwars2.com/file/2022E87E78C511102A3D0506241B02F4AD1BBE4D/522591.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37085() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ouroboros Loop\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37085,\"icon\":\"https://render.guildwars2.com/file/2ACFDD50233369F8CFAB75EDB8761DDDEBDD6AD2/511825.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15741,\"description\":\"+32 Condition Damage\n+18 Precision\n+18 Toughness\"},\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":71},{\"attribute\":\"Precision\",\"modifier\":50},{\"attribute\":\"Toughness\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}