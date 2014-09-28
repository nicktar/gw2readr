package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0155 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem36187() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Endless Casual Clothing Tonic\",\"description\":\"Double-click to transform into casual clothes for fifteen minutes. You will be unable to fight while transformed.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":36187,\"icon\":\"https://render.guildwars2.com/file/C33C2E360DFB77FA3509070AAAAB4C80644A28FB/561960.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36188() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Endless Striped Silk Clothing Tonic\",\"description\":\"Double-click to transform into casual clothes for fifteen minutes. You will be unable to fight while transformed.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":36188,\"icon\":\"https://render.guildwars2.com/file/56155F9AD09FAFFEF332A8E66C0C97AA080450BC/561962.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36189() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Endless Cherry Blossom Clothing Tonic\",\"description\":\"Double-click to transform into casual clothes for fifteen minutes. You will be unable to fight while transformed.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":36189,\"icon\":\"https://render.guildwars2.com/file/4E66CE8069617F4E0AC30333B96CA3E390F6FD16/575129.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36190() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Endless Country Lace Clothing Tonic\",\"description\":\"Double-click to transform into casual clothes for fifteen minutes. You will be unable to fight while transformed.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":36190,\"icon\":\"https://render.guildwars2.com/file/6B0871D143F40A9BF2E848CEFAC20F34F367C402/575130.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36191() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Endless Ornate Clothing Tonic\",\"description\":\"Double-click to transform into casual clothes for fifteen minutes. You will be unable to fight while transformed.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":36191,\"icon\":\"https://render.guildwars2.com/file/2592BB31349D2FD620E29A5F46553BFCF0E02AD2/575132.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36192() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Endless Dragon Emblem Clothing Tonic\",\"description\":\"Double-click to transform into casual clothes for fifteen minutes. You will be unable to fight while transformed.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":36192,\"icon\":\"https://render.guildwars2.com/file/0C07510296147FBF71B7084F4425D600D615109A/415002.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36200() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Endless Casual Hoodie Clothing Tonic\",\"description\":\"Double-click to transform into casual clothes for fifteen minutes. You will be unable to fight while transformed.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":36200,\"icon\":\"https://render.guildwars2.com/file/65F69797A63448BFCD4E7602F0FFD165E1069F40/543869.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36317() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Spooky Ghost\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":36317,\"icon\":\"https://render.guildwars2.com/file/CA35F7D73917D80B582AEE63DFC6EA2336924CE6/499439.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36319() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Spooky Spider\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":36319,\"icon\":\"https://render.guildwars2.com/file/CC2FA04E06D91DE05E02099EB6A9D164D6C75DF4/499441.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36320() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Miniature Spooky Trio\",\"description\":\"Double-click to receive a miniature spooky ghost, spooky skeleton, and spooky spider.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":36320,\"icon\":\"https://render.guildwars2.com/file/37DEE7E6294BD4D9345001C750BB37991A1931B8/499442.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36321() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Spooky Skeleton\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":36321,\"icon\":\"https://render.guildwars2.com/file/DBD5E9A718DD143DC8F89304B87DB4A84AB2051B/499443.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36323() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chainsaw the Skeleton\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":36323,\"icon\":\"https://render.guildwars2.com/file/B1B72521A6EDF44B03A2DEE8A762C2BA083C4D5F/499450.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36366() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mad King's Outfit\",\"description\":\"Contains a Mad King Outfit, which is usable in combat, and a Scepter of Thorn toy for costume brawl.\n\nOutfits are full sets of clothing that hide other armor. This will not change individual armor pieces, and you will still receive your current armor stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":36366,\"icon\":\"https://render.guildwars2.com/file/041DC1695CF0DD1A4438D45ACB036C510E1AFFB4/499488.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36379() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Witch's Outfit\",\"description\":\"Contains a Witch's Outfit, which is usable in combat, and a Broom toy for costume brawl.\n\nOutfits are full sets of clothing that hide other armor. This will not change individual armor pieces, and you will still receive your current armor stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":36379,\"icon\":\"https://render.guildwars2.com/file/F90DEF6BD1FA9EE60DC93BA31B0D367EBA60EC7A/499499.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36396() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Candy-Powered Matter Meter\",\"description\":\"This device detects power caches by attuning its frequency to one of the four types of matter: aqueous, gaseous, etheric, and corporeal. Activation requires at least one piece of candy corn. <br><c=@flavor>\\\"Tassi, where are you going with those blueprints? Those are Statics property! Hey!\\\"<br>—Councilor Ludo</c>\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36396,\"icon\":\"https://render.guildwars2.com/file/02F191D77DDAC53C9D74EA0D0B33B357D0B80BCE/499504.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36471() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Wondrous Goods\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36471,\"icon\":\"https://render.guildwars2.com/file/350D02EDC4D2025C162107C60E78490C710EDDCF/63180.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36472() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Wondrous Goods\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36472,\"icon\":\"https://render.guildwars2.com/file/350D02EDC4D2025C162107C60E78490C710EDDCF/63180.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36473() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Wondrous Goods\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36473,\"icon\":\"https://render.guildwars2.com/file/350D02EDC4D2025C162107C60E78490C710EDDCF/63180.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36474() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Wondrous Goods\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36474,\"icon\":\"https://render.guildwars2.com/file/350D02EDC4D2025C162107C60E78490C710EDDCF/63180.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36475() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Wondrous Goods\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36475,\"icon\":\"https://render.guildwars2.com/file/350D02EDC4D2025C162107C60E78490C710EDDCF/63180.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36476() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Wondrous Goods\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36476,\"icon\":\"https://render.guildwars2.com/file/350D02EDC4D2025C162107C60E78490C710EDDCF/63180.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36477() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Wondrous Goods\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36477,\"icon\":\"https://render.guildwars2.com/file/350D02EDC4D2025C162107C60E78490C710EDDCF/63180.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36478() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Wondrous Goods\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36478,\"icon\":\"https://render.guildwars2.com/file/350D02EDC4D2025C162107C60E78490C710EDDCF/63180.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36479() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Wondrous Goods\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36479,\"icon\":\"https://render.guildwars2.com/file/350D02EDC4D2025C162107C60E78490C710EDDCF/63180.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36480() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Wondrous Goods\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36480,\"icon\":\"https://render.guildwars2.com/file/350D02EDC4D2025C162107C60E78490C710EDDCF/63180.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}