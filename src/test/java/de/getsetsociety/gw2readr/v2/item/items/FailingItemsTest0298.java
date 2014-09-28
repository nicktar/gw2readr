package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0298 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem67086() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Champion Arid Devourer Cache\",\"description\":\"Double-click to gain Champion Bags, Dragonite Ore, Empyreal Fragments, Geodes, a Zephyrite Lockpick, Silky Sand, and other loot.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67086,\"icon\":\"https://render.guildwars2.com/file/B79141B64E77DE99C80B725B9F0E3FBCD1F54C69/619509.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67087() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Champion Dust Mite Cache\",\"description\":\"Double-click to gain Champion Bags, Dragonite Ore, Empyreal Fragments, Geodes, a Zephyrite Lockpick, Silky Sand, and other loot.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67087,\"icon\":\"https://render.guildwars2.com/file/9E0BAFF636D296EF96FB9CF37F3CB425A92CC7F0/619517.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67089() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Champion Vined Cache\",\"description\":\"Double-click to gain Champion Bags, Dragonite Ore, Empyreal Fragments, Geodes, a Zephyrite Lockpick, Silky Sand, and other loot.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67089,\"icon\":\"https://render.guildwars2.com/file/74921BC51FFC732180CAD2019266B1F3A1E97999/619516.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67090() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Veteran Arid Inquest Cache\",\"description\":\"Double-click to gain Obsidian Shards, Geodes, Silky Sand, and other loot.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67090,\"icon\":\"https://render.guildwars2.com/file/18EA4E0B4BA170249AD2B67ED80F6E06AA49BDF7/222608.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67091() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Arid Vined Cache\",\"description\":\"Double-click to gain Silky Sand and loot.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67091,\"icon\":\"https://render.guildwars2.com/file/FD3B9CF7AB1DCE34610D76017E56AA5618529E7E/222604.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67176() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Uncanny Jar\",\"description\":\"20 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67176,\"icon\":\"https://render.guildwars2.com/file/12C0B0AF58905AE9D8E796E0D5C664AC0144A696/866415.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":20}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67188() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chalice of Rhendak\",\"description\":\"This item only has value as part of a collection.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":198,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67188,\"icon\":\"https://render.guildwars2.com/file/20021CCC250C79D061E0E90C95D5B7AC520053B6/67005.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67190() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wylenn's Manual of Style\",\"description\":\"<c=@flavor>\\\"Using words is hard, because words mean things.\\\"</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67190,\"icon\":\"https://render.guildwars2.com/file/EED00CA379DA7F7D03D567085FFFBF1226B53CDA/223707.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67191() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Twister in a Jar\",\"description\":\"<c=@flavor>The tiny dust mite inside shows no signs of slowing.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":67191,\"icon\":\"https://render.guildwars2.com/file/300EBE9F22AFB676E4ED372BB8D493233831BCBB/455973.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":56},{\"attribute\":\"Healing\",\"modifier\":40},{\"attribute\":\"Vitality\",\"modifier\":40}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67192() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jar of Lost Souls\",\"description\":\"<c=@flavor>Based on Ash Legion containment technology. Seems unstable.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":67192,\"icon\":\"https://render.guildwars2.com/file/2C49060C264F6843174B279C28A442F15A41C5D4/455965.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":46},{\"attribute\":\"Vitality\",\"modifier\":33}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67193() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Fractal Spoon\",\"description\":\"This item only has value as part of a collection.\",\"type\":\"Trophy\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":1000,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67193,\"icon\":\"https://render.guildwars2.com/file/495070DBD74559472740C9E9F8D85E764FF9FF03/866766.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67194() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carved Bone Spoon\",\"description\":\"This item only has value as part of a collection.\",\"type\":\"Trophy\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":1000,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67194,\"icon\":\"https://render.guildwars2.com/file/B8B5D04C06E17502AC0A71626FFF72611BF147F6/866767.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67195() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Siege Commander's Spoon\",\"description\":\"This item only has value as part of a collection.\",\"type\":\"Trophy\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":1000,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67195,\"icon\":\"https://render.guildwars2.com/file/DD0C7EEAB353E906990005959158C5F859970FB4/866768.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67198() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Enchanted Map Scrap (3/4)\",\"description\":\"Double-click to combine all four pieces of the Enchanted Map.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":198,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67198,\"icon\":\"https://render.guildwars2.com/file/70F77FFC1256276864EF97EF92052DA93F2D24DA/866769.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67206() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Enchanted Map Scrap (4/4)\",\"description\":\"Double-click to combine all four pieces of the Enchanted Map.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":198,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67206,\"icon\":\"https://render.guildwars2.com/file/21AFFD12CBCD0EB095BF0D1C9EB3907CD30A2DAF/866773.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67207() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Enchanted Map Scrap (1/4)\",\"description\":\"Double-click to combine all four pieces of the Enchanted Map.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":198,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67207,\"icon\":\"https://render.guildwars2.com/file/BC0FD9ED2E160590FD7EA6BBB3E5DF06EC5A4D38/866774.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67208() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Enchanted Map Scrap (2/4)\",\"description\":\"Double-click to combine all four pieces of the Enchanted Map.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":198,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67208,\"icon\":\"https://render.guildwars2.com/file/47476D2369FA0B36C37C5AF25D40560BB64C73A9/866775.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67213() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ascended Armor Chest\",\"description\":\"Double-click to choose a piece of ascended armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67213,\"icon\":\"https://render.guildwars2.com/file/7C6795436FBF05D52F1B34929FAE301B480A4997/771005.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67214() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Grand Weapon Crate\",\"description\":\"Contains your choice of a unique exotic weapon.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67214,\"icon\":\"https://render.guildwars2.com/file/0946149B43355E23B5C7552E6E5DDB4A9160603E/603242.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67217() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hylek Maintenance Kit\",\"description\":\"Contains the recipe and ingredients to craft hylek maintenance oil.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67217,\"icon\":\"https://render.guildwars2.com/file/96B4F02C0D0464901EC7671A09E836B25AB32770/780301.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67218() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Krait Tuning Kit\",\"description\":\"Contains the recipe and ingredients to craft krait tuning crystals.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67218,\"icon\":\"https://render.guildwars2.com/file/38B579B45A60D21CD306E50130360E75EE0B627A/780295.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67219() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jormag Defender's Kit\",\"description\":\"Contains 10 icy runestones, obsidian shards, essence of luck, and rare and exotic gear.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67219,\"icon\":\"https://render.guildwars2.com/file/EF521943989433FB7F2FF50CAAF1BEC0180634E2/780362.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67220() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ogre Sharpening Kit\",\"description\":\"Contains the recipe and ingredients to craft ogre sharpening stones.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67220,\"icon\":\"https://render.guildwars2.com/file/6EC75210B1296392A990683621F5F4710139EF0A/780313.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67221() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dwayna's Reliquary\",\"description\":\"Contains obsidian shards, essence of luck, and rare and exotic gear.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67221,\"icon\":\"https://render.guildwars2.com/file/E1BBB0CCDFFF63C3C958C229732707D0BAB21611/603243.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67222() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Regal Bag of Goods\",\"description\":\"Contains a lesser vision crystal, dark matter, and obsidian shards.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67222,\"icon\":\"https://render.guildwars2.com/file/74A00DFE964BFF6243029A93CD0CDD9348B21E09/866779.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}