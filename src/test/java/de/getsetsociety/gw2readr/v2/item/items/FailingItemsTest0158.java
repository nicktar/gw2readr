package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0158 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem36593() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Stargazer Pendant\",\"description\":\"<c=@flavor>The jotun have many secrets. This is but one.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":528,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36593,\"icon\":\"https://render.guildwars2.com/file/35A76FF749801A31BDE750017C2DF371DB200D4A/222374.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36594() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coral Pendant\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":264,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36594,\"icon\":\"https://render.guildwars2.com/file/D5681E4191C1634104D4D2442B2D20C67AD7A8E4/222364.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"suffix_item_id\":24522,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36595() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coral Pendant\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36595,\"icon\":\"https://render.guildwars2.com/file/D5681E4191C1634104D4D2442B2D20C67AD7A8E4/222364.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"suffix_item_id\":24545,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36621() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Caudecus's Journal\",\"type\":\"Trinket\",\"level\":45,\"rarity\":\"Masterwork\",\"vendor_value\":103,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36621,\"icon\":\"https://render.guildwars2.com/file/095B9410F480575B7EAF9CDA9F05163FB8530251/220884.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"suffix_item_id\":24539,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36622() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Beetlestone's Band\",\"type\":\"Trinket\",\"level\":45,\"rarity\":\"Masterwork\",\"vendor_value\":123,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36622,\"icon\":\"https://render.guildwars2.com/file/1E1679D99ADB6102D05454354EFA6FD707CFC8D9/511740.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":24},{\"attribute\":\"Precision\",\"modifier\":17}]},\"suffix_item_id\":24490,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36624() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Caudecus's Journal\",\"type\":\"Trinket\",\"level\":45,\"rarity\":\"Rare\",\"vendor_value\":154,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36624,\"icon\":\"https://render.guildwars2.com/file/095B9410F480575B7EAF9CDA9F05163FB8530251/220884.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"suffix_item_id\":24910,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36625() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Beetlestone's Band\",\"type\":\"Trinket\",\"level\":45,\"rarity\":\"Rare\",\"vendor_value\":185,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36625,\"icon\":\"https://render.guildwars2.com/file/1E1679D99ADB6102D05454354EFA6FD707CFC8D9/511740.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":26},{\"attribute\":\"Precision\",\"modifier\":19}]},\"suffix_item_id\":24911,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36657() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darkened Vine\",\"type\":\"Trinket\",\"level\":55,\"rarity\":\"Masterwork\",\"vendor_value\":120,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36657,\"icon\":\"https://render.guildwars2.com/file/0FFCB6F430ECDD6DCD58BFCFA9147D0EC677CC9F/223873.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":26},{\"attribute\":\"Precision\",\"modifier\":19}]},\"suffix_item_id\":24490,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36658() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Twisted Tendril\",\"type\":\"Trinket\",\"level\":55,\"rarity\":\"Masterwork\",\"vendor_value\":144,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36658,\"icon\":\"https://render.guildwars2.com/file/7DFD0F47B8EF9D929904EA655C0CE6FA4D245F11/66771.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":31},{\"attribute\":\"Toughness\",\"modifier\":22}]},\"suffix_item_id\":24487,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36660() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darkened Vine\",\"type\":\"Trinket\",\"level\":55,\"rarity\":\"Rare\",\"vendor_value\":180,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36660,\"icon\":\"https://render.guildwars2.com/file/0FFCB6F430ECDD6DCD58BFCFA9147D0EC677CC9F/223873.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":28},{\"attribute\":\"Precision\",\"modifier\":20}]},\"suffix_item_id\":24911,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36661() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Twisted Tendril\",\"type\":\"Trinket\",\"level\":55,\"rarity\":\"Rare\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36661,\"icon\":\"https://render.guildwars2.com/file/7DFD0F47B8EF9D929904EA655C0CE6FA4D245F11/66771.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":34},{\"attribute\":\"Toughness\",\"modifier\":24}]},\"suffix_item_id\":24907,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36675() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Flame Legion Ritual Book\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Masterwork\",\"vendor_value\":155,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36675,\"icon\":\"https://render.guildwars2.com/file/0D2CEE30F7CF9E03E997E5A80ED946A755B7BA31/511743.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":41},{\"attribute\":\"ConditionDamage\",\"modifier\":30},{\"attribute\":\"Healing\",\"modifier\":30}]},\"suffix_item_id\":24492,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36676() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wildfire Talisman\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Masterwork\",\"vendor_value\":248,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36676,\"icon\":\"https://render.guildwars2.com/file/3EAA067B1D4E9553C13A74060D7B020E311AD251/220893.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":66},{\"attribute\":\"Power\",\"modifier\":47},{\"attribute\":\"Vitality\",\"modifier\":47}]},\"suffix_item_id\":24492,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36678() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Flame Legion Ritual Book\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Rare\",\"vendor_value\":233,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36678,\"icon\":\"https://render.guildwars2.com/file/0D2CEE30F7CF9E03E997E5A80ED946A755B7BA31/511743.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":45},{\"attribute\":\"ConditionDamage\",\"modifier\":32},{\"attribute\":\"Healing\",\"modifier\":32}]},\"suffix_item_id\":24920,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36679() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wildfire Talisman\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Rare\",\"vendor_value\":372,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36679,\"icon\":\"https://render.guildwars2.com/file/3EAA067B1D4E9553C13A74060D7B020E311AD251/220893.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":72},{\"attribute\":\"Power\",\"modifier\":51},{\"attribute\":\"Vitality\",\"modifier\":51}]},\"suffix_item_id\":24920,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36681() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Foefire Amulet\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":136,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36681,\"icon\":\"https://render.guildwars2.com/file/F82FF7C2693014663173FF717C403F02C4540F0C/62368.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":23},{\"attribute\":\"Precision\",\"modifier\":17}]},\"suffix_item_id\":24489,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36682() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ring of the Catacombs\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":102,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36682,\"icon\":\"https://render.guildwars2.com/file/CC727509301FFBE37A6527D637594517491E2832/223591.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":17},{\"attribute\":\"Vitality\",\"modifier\":12}]},\"suffix_item_id\":24896,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36710() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Arcane Converter\",\"description\":\"Used by the Mystic Forge to convert arcane components.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":36710,\"icon\":\"https://render.guildwars2.com/file/5DDF09ED3C0A7CD4026DA5293F07A41C9178EC0C/66878.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36729() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Karka Shell Box\",\"description\":\"20 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":36729,\"icon\":\"https://render.guildwars2.com/file/CFFC295D57E0423CA5360AD4E669D2DAFCD9E580/511766.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":20}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36731() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Passion Fruit\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Basic\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":36731,\"icon\":\"https://render.guildwars2.com/file/245EB89D59905C2857587A1A2E02FC1645EBF740/511768.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36737() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Passiflora Orichalcum Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36737,\"icon\":\"https://render.guildwars2.com/file/71B847FBF9D974EDFC7D44C909B8EAF763603434/511769.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":67},{\"attribute\":\"Toughness\",\"modifier\":48},{\"attribute\":\"ConditionDamage\",\"modifier\":48}]},\"suffix_item_id\":37906,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36741() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Passiflora Mithril Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":297,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36741,\"icon\":\"https://render.guildwars2.com/file/E7CCF15E5C9A02680FBD991FC11F95F3BADA7651/511771.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":59},{\"attribute\":\"Toughness\",\"modifier\":42},{\"attribute\":\"ConditionDamage\",\"modifier\":42}]},\"suffix_item_id\":37908,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36751() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Passiflora Mithril Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":198,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36751,\"icon\":\"https://render.guildwars2.com/file/493C5EBAFFF103BD71A6AE300EFC170A487BA89E/511772.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":55},{\"attribute\":\"Toughness\",\"modifier\":39},{\"attribute\":\"ConditionDamage\",\"modifier\":39}]},\"suffix_item_id\":37909,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36755() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bottle of Tropical Dressing\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":45,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":36755,\"icon\":\"https://render.guildwars2.com/file/02A0CEEDA174D5DE490A0CBFD2757895637AB0B3/511774.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36760() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Passiflora Mithril Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":93,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":36760,\"icon\":\"https://render.guildwars2.com/file/493C5EBAFFF103BD71A6AE300EFC170A487BA89E/511772.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":46},{\"attribute\":\"Toughness\",\"modifier\":33},{\"attribute\":\"ConditionDamage\",\"modifier\":33}]},\"suffix_item_id\":37907,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}