package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0169 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem39113() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Necromancer Gear\",\"description\":\"Contains a rare or exotic piece of level 78-80 gear for necromancers. Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39113,\"icon\":\"https://render.guildwars2.com/file/E57102652D0C49F24928FEC25E073B0C37EDF908/534204.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39115() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ranger Gear\",\"description\":\"Contains a rare or exotic piece of level 78-80 gear for rangers. Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39115,\"icon\":\"https://render.guildwars2.com/file/F22C450ED578DA500C76FBD673FA49162AB5BA0A/534206.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39116() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thief Gear\",\"description\":\"Contains a rare or exotic piece of level 78-80 gear for thieves. Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39116,\"icon\":\"https://render.guildwars2.com/file/934194A24EB433E61BB4F7D7B23D24045ECB6FB7/534207.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39117() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mesmer Gear\",\"description\":\"Contains a rare or exotic piece of level 78-80 gear for mesmers. Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39117,\"icon\":\"https://render.guildwars2.com/file/FBCBA4297827182CDCD8309190D269DEF69E6B07/534208.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39118() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Engineer Gear\",\"description\":\"Contains a rare or exotic piece of level 78-80 gear for engineers. Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39118,\"icon\":\"https://render.guildwars2.com/file/79ED3A091FA87BBEA3F1360CF82948925CDF7CC8/534209.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39119() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tiny Crafting Bag\",\"description\":\"Contains first-tier crafting materials. Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":18,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39119,\"icon\":\"https://render.guildwars2.com/file/9A54C444930C7D0DEE6FFDDE92603CD851F7CB90/534210.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39120() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Small Crafting Bag\",\"description\":\"Contains second-tier crafting materials. Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":29,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39120,\"icon\":\"https://render.guildwars2.com/file/452575F50F3A7005BDF49F08F913DB0EE17441DC/534211.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39121() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Light Crafting Bag\",\"description\":\"Contains third-tier crafting materials. Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":43,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39121,\"icon\":\"https://render.guildwars2.com/file/940FF213716780060BA2760A0CC606C4333DE3FA/534212.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39122() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Medium Crafting Bag\",\"description\":\"Contains fourth-tier crafting materials. Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39122,\"icon\":\"https://render.guildwars2.com/file/780F646336EBBE9F6B904AA515441026F1E2FE25/534213.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39123() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Large Crafting Bag\",\"description\":\"Contains fifth-tier crafting materials. Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":57,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39123,\"icon\":\"https://render.guildwars2.com/file/190A14720A79FED075949798D29D136DBF7EBD92/534214.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39124() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Heavy Crafting Bag\",\"description\":\"Contains sixth-tier crafting materials. Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39124,\"icon\":\"https://render.guildwars2.com/file/6BA1C677C05D4C65044949FA1116EB112A4E053D/534215.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39125() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mystic Binding Agent\",\"description\":\"Replaces Elonian wine in some Mystic Forge recipes involving slivers, fragments, shards, and cores.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39125,\"icon\":\"https://render.guildwars2.com/file/2CB9736615E23CC0630B09B774CAA20FE9639906/534216.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39137() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Plush Quaggan Backpack Cover\",\"description\":\"This backpack cover comes with a simple back strap for ease of wearing if you don't have another back-slot item.\nDouble-click to unpack.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39137,\"icon\":\"https://render.guildwars2.com/file/56D1C1FD2EEB2AE1229136A0BAE61BD5D00CCD1E/534221.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39223() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unidentifiable Object\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":39223,\"icon\":\"https://render.guildwars2.com/file/BC3B1852C800AF7632AFA2CCC8957A913B443EB8/65901.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39224() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Durmand's Pen\",\"description\":\"<c=@flavor>It's said that the pen is mightier...</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39224,\"icon\":\"https://render.guildwars2.com/file/75EC69C8C20938B83CDDF7E69FEAEB35A3184FC6/543871.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15749,\"description\":\"+32 Power\n+18 Toughness\n+18 Vitality\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":59},{\"attribute\":\"Toughness\",\"modifier\":42},{\"attribute\":\"Vitality\",\"modifier\":42}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39225() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Golden Relic of Rin\",\"description\":\"<c=@flavor>Pillaged long ago from the ruined city of Rin.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39225,\"icon\":\"https://render.guildwars2.com/file/E20FAD6E15A3AC323E18D5139DFAE83507F3A73F/543872.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15749,\"description\":\"+32 Power\n+18 Toughness\n+18 Vitality\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":59},{\"attribute\":\"Toughness\",\"modifier\":42},{\"attribute\":\"Vitality\",\"modifier\":42}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39226() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Moon Shell\",\"description\":\"<c=@flavor>A rare and beautiful shell from far-off Istan.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39226,\"icon\":\"https://render.guildwars2.com/file/9718672C496DE81FA333A519A20521D60A49EAE3/543873.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39227() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Consortium Charm\",\"description\":\"<c=@flavor>Guaranteed* to protect against any of a multitude of threats and indignities!<br><br>*Guarantee not legally binding.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39227,\"icon\":\"https://render.guildwars2.com/file/0ED519FF5BBD0051B5950F12253CC0491548E72F/543874.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39228() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Halfmad's Mug\",\"description\":\"<c=@flavor>Claimed to be the property of Brothander Halfmad, creator of Bear's Brown Ale, and the first norn to bring the art of brewing to his people.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39228,\"icon\":\"https://render.guildwars2.com/file/42C15B580C17CC0CDE51002DE7261771DD2D4ED6/543875.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15743,\"description\":\"+32 Toughness\n+18 Power\n+18 Ferocity\"},\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":59},{\"attribute\":\"Power\",\"modifier\":42},{\"attribute\":\"CritDamage\",\"modifier\":42}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39229() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Appleseller's Lucky Cog\",\"description\":\"<c=@flavor>Smooth from having constantly been toyed with, the initials TL are etched roughly into the metal.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39229,\"icon\":\"https://render.guildwars2.com/file/9D1119ABD2E121B2AA13A3B9FF4697B5AE6A5C02/543876.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15743,\"description\":\"+32 Toughness\n+18 Power\n+18 Ferocity\"},\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":59},{\"attribute\":\"Power\",\"modifier\":42},{\"attribute\":\"CritDamage\",\"modifier\":42}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39230() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Marriner's Flask\",\"description\":\"<c=@flavor>Said to have been the property of the legendary Cobiah Marriner, founder of Lion's Arch.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39230,\"icon\":\"https://render.guildwars2.com/file/52ABC308C6CC5E0ADBE0B7F72FC9D60906094196/543877.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15741,\"description\":\"+32 Condition Damage\n+18 Precision\n+18 Toughness\"},\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":59},{\"attribute\":\"Precision\",\"modifier\":42},{\"attribute\":\"Toughness\",\"modifier\":42}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39231() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Fierceshot's Arrowhead\",\"description\":\"<c=@flavor>Said to have belonged to the legendary charr archer Pyre Fierceshot.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39231,\"icon\":\"https://render.guildwars2.com/file/0EC50BA70DCC31056008209A2C9FFE7EEF0D0699/543878.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15741,\"description\":\"+32 Condition Damage\n+18 Precision\n+18 Toughness\"},\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":59},{\"attribute\":\"Precision\",\"modifier\":42},{\"attribute\":\"Toughness\",\"modifier\":42}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39232() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Magister's Field Journal\",\"description\":\"<c=@flavor>A collection of clever, dreamy notes penned in a flowing hand.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39232,\"icon\":\"https://render.guildwars2.com/file/59943B48509FD07DDD96D1A8674ADCCEEDBF2665/543879.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15742,\"description\":\"+32 Power\n+18 Ferocity\n+18 Precision\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":59},{\"attribute\":\"Precision\",\"modifier\":42},{\"attribute\":\"CritDamage\",\"modifier\":42}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39233() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Althea's Ashes\",\"description\":\"<c=@flavor>The legendary beauty who captured the heart of Prince Rurik, only to perish in the Searing of Ascalon.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39233,\"icon\":\"https://render.guildwars2.com/file/0E4C0C67CA06D97FD9E93C08BC600103D15AAF6A/543880.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15742,\"description\":\"+32 Power\n+18 Ferocity\n+18 Precision\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":59},{\"attribute\":\"Precision\",\"modifier\":42},{\"attribute\":\"CritDamage\",\"modifier\":42}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39234() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Plague Idol\",\"description\":\"<c=@flavor>An ancient relic of old Cantha, from the time of its corruption by the Deceiver's dark magic.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39234,\"icon\":\"https://render.guildwars2.com/file/1671AA0E3D457E08B9F30579CBDE9FD6B42FD33C/543881.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15741,\"description\":\"+32 Condition Damage\n+18 Precision\n+18 Toughness\"},\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":59},{\"attribute\":\"Vitality\",\"modifier\":42},{\"attribute\":\"Toughness\",\"modifier\":42}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}