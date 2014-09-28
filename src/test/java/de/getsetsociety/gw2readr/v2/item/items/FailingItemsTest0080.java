package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0080 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem20198() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini High Inquisitor Maut\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":100,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20198,\"icon\":\"https://render.guildwars2.com/file/F40916542A101090CD071925DE014ECF13986939/66105.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20199() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Inquest Golemcaster\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20199,\"icon\":\"https://render.guildwars2.com/file/053300B236D6F12705105FBF083B74414F1AE4EF/66106.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20200() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Inquest Extinguisher\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":100,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20200,\"icon\":\"https://render.guildwars2.com/file/250931E25D924B31E3FE2BBA0F6D495BACBE964D/66107.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20201() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Inquest Technician\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20201,\"icon\":\"https://render.guildwars2.com/file/F6593332CBD8041D2CD972D0802BB2B79D0B3846/66108.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20202() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Peacemaker Shocktrooper\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20202,\"icon\":\"https://render.guildwars2.com/file/ABBD2F49BF076BA42393E6E7E8FB77F50C457345/66109.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20203() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Zojja\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":500,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20203,\"icon\":\"https://render.guildwars2.com/file/073B51B7F1032E69D240A20B9C1698E4085518F6/66111.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20204() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Peacemaker Sharpshot\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20204,\"icon\":\"https://render.guildwars2.com/file/1FDC75380198B0EF79C93A1A5EA27A0CACE9C96A/66112.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20205() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Peacemaker Soldier\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20205,\"icon\":\"https://render.guildwars2.com/file/26AEEC09DBD8FE6496D7D1CC7179B4004C256229/66113.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20207() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Seraph Juggernaut\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20207,\"icon\":\"https://render.guildwars2.com/file/B3BD5D329D4ADEFCC8CAB962A569D7AC1555705F/638365.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20208() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Seraph Medic\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":100,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20208,\"icon\":\"https://render.guildwars2.com/file/0B5DBBAED8CFCB78060C010BCF6172E360F6F749/638366.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20211() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Black Moa\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":100,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20211,\"icon\":\"https://render.guildwars2.com/file/F0350D36C73DCE3EA29A0451A4403BC3A8A172ED/220516.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20212() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Blue Moa\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20212,\"icon\":\"https://render.guildwars2.com/file/240706953605C5C2C042C30AD26140F7F3A8F475/220517.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20213() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Skale Brackish\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20213,\"icon\":\"https://render.guildwars2.com/file/CB4F11A16832C619D219AEC495A540F7D2615EE4/625793.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20214() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Skritt Bottle Lobber\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20214,\"icon\":\"https://render.guildwars2.com/file/A33ECF6913FE047F7CCDB02B4DFAD7090D771CD7/220519.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20215() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Lynx\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20215,\"icon\":\"https://render.guildwars2.com/file/592594AB02D0FF3FFBBA08275C9B9E72BB639232/220492.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20217() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Krait Damoss\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":100,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20217,\"icon\":\"https://render.guildwars2.com/file/2E27E2E31B01A04BCAFDFF5E557B347509E247BB/220506.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20218() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Black Wind Rider\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":100,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20218,\"icon\":\"https://render.guildwars2.com/file/FA0E5D7E013B171A96EE7F0B576C06DC09A4BBE5/625794.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20248() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cook's Outfit\",\"description\":\"Contains a Cook's Outfit, which is usable in combat, and a Frying Pan toy for costume brawl.\n\nOutfits are full sets of clothing that hide other armor. This will not change individual armor pieces, and you will still receive your current armor stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20248,\"icon\":\"https://render.guildwars2.com/file/1509D1B76FCECC111E28D2F50EBEAD5DA102995A/340522.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20251() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pirate Captain's Outfit\",\"description\":\"Contains a Pirate Outfit, which is usable in combat, and a Wooden Sword toy for costume brawl.\n\nOutfits are full sets of clothing that hide other armor. This will not change individual armor pieces, and you will still receive your current armor stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20251,\"icon\":\"https://render.guildwars2.com/file/983CE77CC0D921A1EE100D4ECFFE3F01FC61CC6B/66637.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20272() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Primeval Heavy Armor Skin\",\"description\":\"This full set of heavy armor skins can replace the appearance of heavy armor pieces, once per slot. The skins will also be unlocked in your account wardrobe.\n\nSkins have no stats of their own.\nCan only be used by characters who wear heavy armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20272,\"icon\":\"https://render.guildwars2.com/file/D57103D6520ECFC07DBA564E5E76F13D96B8B1E7/455865.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20273() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Krytan Medium Armor Skin\",\"description\":\"This full set of medium armor skins can replace the appearance of medium armor pieces, once per slot. The skins will also be unlocked in your account wardrobe.\n\nSkins have no stats of their own.\nCan only be used by characters who wear medium armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20273,\"icon\":\"https://render.guildwars2.com/file/0793E7E47832AFFBFAA71A6801066E2A41606BBA/455866.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20274() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Profane Light Armor Skin\",\"description\":\"This full set of light armor skins can replace the appearance of light armor pieces, once per slot. The skins will also be unlocked in your account wardrobe.\n\nSkins have no stats of their own.\nCan only be used by characters who wear light armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20274,\"icon\":\"https://render.guildwars2.com/file/0DA0BEC80AF6FEBA33ABB8D463B00FB8F3F3D861/455867.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20312() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"How to Dance, Volume 1\",\"description\":\"This volume teaches you how to perform the \\\"Dodge Step,\\\" \\\"Inventory Shuffle,\\\" and \\\"Gear Grind\\\" dance moves. You also gain the ability to invite others to follow along in a dance you control.\n\nDouble-click to receive these dance skills and the Dancing Spirit buff.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\",\"NoUnderwater\"],\"restrictions\":[],\"id\":20312,\"icon\":\"https://render.guildwars2.com/file/0378716BA836504AF1C5AF550019689F4F99ED18/575158.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20313() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Black Lion Chest (Unlocked)\",\"description\":\"Contains a random booster plus two more random items from the Black Lion Trading Company warehouse.\nThese may include weapon tickets redeemable for unique skins and other rare items not available anywhere else.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20313,\"icon\":\"https://render.guildwars2.com/file/48E4CEEAEEF8F3419A63D4F6295AB77136B86656/711974.png\",\"details\":{\"type\":\"OpenUI\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20316() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Black Lion Chest\",\"description\":\"Contains a random booster plus two more random items from the Black Lion Trading Company warehouse.\nThese may include weapon tickets redeemable for unique skins and other rare items not available anywhere else.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":20316,\"icon\":\"https://render.guildwars2.com/file/48E4CEEAEEF8F3419A63D4F6295AB77136B86656/711974.png\",\"details\":{\"type\":\"OpenUI\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}