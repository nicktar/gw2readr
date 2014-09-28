package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0081 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem20317() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Heavy Bag of Coins\",\"description\":\"Double-click to open to discover the value of the coins inside.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSell\"],\"restrictions\":[],\"id\":20317,\"icon\":\"https://render.guildwars2.com/file/09D4231BE641D6C7B3170DA615CA021E030A505B/526355.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20319() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Endless Mystery Tonic\",\"description\":\"It smells like singed fur and feathers. Use this item to transform in to... something. You'll never know what until you try. The bottle seems to be self-replenishing.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\",\"NoUnderwater\"],\"restrictions\":[],\"id\":20319,\"icon\":\"https://render.guildwars2.com/file/5F3D98C8CFF353535A10530E3F38C5E8E3BDF50B/66557.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20320() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Endless Mystery Tonic\",\"description\":\"It smells like some sort of furniture polish. Use this item to transform in to... something. You'll never know what until you try. The bottle seems to be self-replenishing.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20320,\"icon\":\"https://render.guildwars2.com/file/FCFF0C9BA7F598FA96DCDC13B16C01E26407CDBF/66558.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20321() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Endless Mystery Tonic\",\"description\":\"It smells of the forest. Use this item to transform in to... something. You'll never know what until you try. The bottle seems to be self-replenishing.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20321,\"icon\":\"https://render.guildwars2.com/file/1275404EE30C0FDCC1EE6AB3A70136FB020158D7/66150.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20323() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unidentified Dye\",\"description\":\"Double-click to identify one random dye color, which can be unlocked for all of your characters or recycled at the Mystic Forge.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":20323,\"icon\":\"https://render.guildwars2.com/file/109A6B04C4E577D9266EEDA21CC30E6B800DD452/66587.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20324() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Black Lion Harvesting Sickle\",\"description\":\"Extremely efficient at gathering resources and uncovering rare components.\",\"type\":\"Gathering\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"default_skin\":2385,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20324,\"icon\":\"https://render.guildwars2.com/file/BD0DC17564A9BC9B2354EAB2122F086DBF699D15/526356.png\",\"details\":{\"type\":\"Foraging\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20325() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Black Lion Logging Axe\",\"description\":\"Extremely efficient at gathering resources and uncovering rare components.\",\"type\":\"Gathering\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"default_skin\":2388,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20325,\"icon\":\"https://render.guildwars2.com/file/6DFCC96980DF7EC5B9C094C63FC677BDE6AED30A/526357.png\",\"details\":{\"type\":\"Logging\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20326() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Black Lion Mining Pick\",\"description\":\"Extremely efficient at gathering resources and uncovering rare components.\",\"type\":\"Gathering\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"default_skin\":2395,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20326,\"icon\":\"https://render.guildwars2.com/file/DB422F44CD5FC897E1255D601736CD4807D2DF22/526358.png\",\"details\":{\"type\":\"Mining\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20760() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tradesman's Package\",\"description\":\"Double-click to open. Contains:\n• Merchant Express\n• Trading Post Express\n• Bank Access Express\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20760,\"icon\":\"https://render.guildwars2.com/file/D2220C0E96E928071992400BBC650AB4070B97DE/598604.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20761() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Air Rider Package\",\"description\":\"Double-click to open. Contains:\n• Riding Broom\n• Aviator Cap\n• Riding Pants\n• Riding Gloves\n• Riding Boots\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20761,\"icon\":\"https://render.guildwars2.com/file/F0CF7372955EAF6EB857ABA3463818C1F8FE7531/598606.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20764() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Recovery Package\",\"description\":\"Double-click to open. Contains:\n• Revive Orb\n• Instant Repair Canister\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20764,\"icon\":\"https://render.guildwars2.com/file/27BC3DBD022559C0BEEA0AA65CCF773037019108/598605.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20794() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Loot Bag\",\"description\":\"This box gives one random item.\nDouble-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":20794,\"icon\":\"https://render.guildwars2.com/file/7C544ABA635A78AC9F5B5DD14A99A5F5DC0B2AD3/66600.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20796() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Philosopher's stone\",\"description\":\"Used by the Mystic Forge to change one material into another.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20796,\"icon\":\"https://render.guildwars2.com/file/68FF9617BA1BE1AD58E83E4209AEF0FB58950702/434425.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20797() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bloodstone Shard\",\"description\":\"A orb of pure power used to create legendary weapons.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20797,\"icon\":\"https://render.guildwars2.com/file/D9F626FA79AA0C49436337B1C767023CCF14EFF9/434426.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20799() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Crystal\",\"description\":\"Used by the Mystic Forge.\n<c=@flavor>\\\"Zommoros loves crystals\\\"</c>\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20799,\"icon\":\"https://render.guildwars2.com/file/045C05C2F83A59FC4B6F15073465C5D3040E4DF5/65674.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20800() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Arcane Crystal\",\"description\":\"Used by the Mystic Forge to produce PvP items.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20800,\"icon\":\"https://render.guildwars2.com/file/045C05C2F83A59FC4B6F15073465C5D3040E4DF5/65674.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20801() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Arcane Powder\",\"description\":\"Used by the Mystic Forge to produce PvP items.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20801,\"icon\":\"https://render.guildwars2.com/file/EDB50E0A94E55ABCA12ED501141649F4060CF35D/66932.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20802() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Arcane Sliver\",\"description\":\"Used by the Mystic Forge to produce PvP items.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20802,\"icon\":\"https://render.guildwars2.com/file/6DD06745F5484B1F1CF0DD9BED26573504BF1575/66969.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20803() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Light Helm Token\",\"description\":\"Used by the Mystic Forge to produce PvP items.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20803,\"icon\":\"https://render.guildwars2.com/file/4E55BB99A10C9C724AE35253EC91B780A75F62F3/222856.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20804() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Light Pauldron Token\",\"description\":\"Used by the Mystic Forge to produce PvP items.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20804,\"icon\":\"https://render.guildwars2.com/file/1F4FEF6F41C299A7461763AC21D448464919D9B9/63525.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20805() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Light Coat Token\",\"description\":\"Used by the Mystic Forge to produce PvP items.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20805,\"icon\":\"https://render.guildwars2.com/file/F3C601B1F1480D05A4180C01C4277FB0AA314DB6/222872.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20806() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Light Gloves Token\",\"description\":\"Used by the Mystic Forge to produce PvP items.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20806,\"icon\":\"https://render.guildwars2.com/file/F8A1387F1AA09AEE7C5BC7B20DE0B7E73D34A120/63530.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20807() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Light Leggings Token\",\"description\":\"Used by the Mystic Forge to produce PvP items.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20807,\"icon\":\"https://render.guildwars2.com/file/5003B506C9FC60A1CE7473B8E24AD4F73F136709/222878.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20808() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Light Boots Token\",\"description\":\"Used by the Mystic Forge to produce PvP items.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20808,\"icon\":\"https://render.guildwars2.com/file/DFA36C6D9E7650C75D01C5B523D74334DBD9B751/219664.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20809() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Axe Token\",\"description\":\"Used by the Mystic Forge to produce PvP items.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20809,\"icon\":\"https://render.guildwars2.com/file/C8EAC643C02F41B918D79031B6060B0CBFE40CAD/64967.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}