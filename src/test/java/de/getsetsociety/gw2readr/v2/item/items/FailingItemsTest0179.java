package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0179 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem42670() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Top 100 Qualifying Points Rewards Package\",\"description\":\"Double-click to receive your Qualifying Points rewards.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42670,\"icon\":\"https://render.guildwars2.com/file/6E9FA3C99A223677280CD9154A3FB50E2B43AE5B/66895.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42680() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Shiny Trinket\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":42680,\"icon\":\"https://render.guildwars2.com/file/E14D07FFB86444CD92F06A0198FB531211903352/66806.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42848() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sclerite Weapon Claim Ticket\",\"description\":\"Armament merchants from the Consortium can turn this into a nifty weapon.<br>Turn in to the Consortium weapon merchant at the Pearl Islet resort for your reward.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42848,\"icon\":\"https://render.guildwars2.com/file/6DAFC5DF3871A7AB207FB6A2B506DB1F37C1D867/582346.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42868() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Aetherblade Heavy Armor Skin\",\"description\":\"This full set of heavy armor skins can replace the appearance of heavy armor pieces, once per slot. The skins will also be unlocked in your account wardrobe.\n\nSkins have no stats of their own.\nCan only be used by characters who wear heavy armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42868,\"icon\":\"https://render.guildwars2.com/file/C6B7E2F2406F69EAB807D7022780D92B61200A06/591609.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42869() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Aetherblade Medium Armor Skin\",\"description\":\"This full set of medium armor skins can replace the appearance of medium armor pieces, once per slot. The skins will also be unlocked in your account wardrobe.\n\nSkins have no stats of their own.\nCan only be used by characters who wear medium armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42869,\"icon\":\"https://render.guildwars2.com/file/FC3FFC1A3B4F2D1908043191F2ACCFCE264D9F77/591610.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42870() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Aetherblade Light Armor Skin\",\"description\":\"This full set of light armor skins can replace the appearance of light armor pieces, once per slot. The skins will also be unlocked in your account wardrobe.\n\nSkins have no stats of their own.\nCan only be used by characters who wear light armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42870,\"icon\":\"https://render.guildwars2.com/file/2C03E12D440E9CB90399EB740F471ACB71C41CF3/591611.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42879() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Polla\",\"description\":\"<c=@flavor>\\\"This well-worn doll belonged to Cobiah Marriner's little sister, Biviane, who had her young life taken from her under the piers of Lion's Arch.\\\"</c>\",\"type\":\"Trinket\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":42879,\"icon\":\"https://render.guildwars2.com/file/CF17721B6D466EB160EB2C506BF81B0A09216D1E/591616.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":1},{\"attribute\":\"Precision\",\"modifier\":1},{\"attribute\":\"Toughness\",\"modifier\":1},{\"attribute\":\"Vitality\",\"modifier\":1}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42888() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Marriner's Horn\",\"description\":\"Double-click to pull out a horn and play for your friends.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\",\"NoUnderwater\"],\"restrictions\":[],\"id\":42888,\"icon\":\"https://render.guildwars2.com/file/21CDE31E53E0055C9DB4D8071A57EF755F4647C6/591621.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42897() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dragon Bash Mini Pack\",\"description\":\"Double-click to receive a miniature holographic Branded minotaur, axe-wielding destroyer, and corrupted wolf.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42897,\"icon\":\"https://render.guildwars2.com/file/55230DF1BDB980FE050461CE6EF3A95BCBA55BA8/591626.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42899() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rich Dragon Coffer\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42899,\"icon\":\"https://render.guildwars2.com/file/D6C1CD21C197B9A5F9DA0F6DBA21005572F04BBF/591628.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42931() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chop-It-All Logging Axe\",\"description\":\"Perfect for use on all types of trees. Unlimited use.\",\"type\":\"Gathering\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":192,\"default_skin\":2391,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":42931,\"icon\":\"https://render.guildwars2.com/file/15CF97BA7DC573E2BCA852FF1364721B98531470/598608.png\",\"details\":{\"type\":\"Logging\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42949() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"School Uniform\",\"description\":\"Contains three pieces of town clothes making up a school uniform.\n\nTown clothes cannot be worn in combat.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42949,\"icon\":\"https://render.guildwars2.com/file/1509D1B76FCECC111E28D2F50EBEAD5DA102995A/340522.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42951() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Mordrem Leyleecher\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42951,\"icon\":\"https://render.guildwars2.com/file/15C8BA68E214970BB468E15D715DEB630B6FEC31/841515.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42952() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Marjory Delaqua\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"NoUnderwater\"],\"restrictions\":[],\"id\":42952,\"icon\":\"https://render.guildwars2.com/file/B042D899249B9F0AED6EDE2FA259FE65A5246DD2/740298.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42953() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Aetherblade Admiral\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42953,\"icon\":\"https://render.guildwars2.com/file/0A9134302D18BA9C193ACBD37B335DEF71F959C6/740295.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42954() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Toxic Warlock\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42954,\"icon\":\"https://render.guildwars2.com/file/96D7E5597E3F373D061BD66874CB482DE7E405D9/740299.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42955() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Molten Berserker\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42955,\"icon\":\"https://render.guildwars2.com/file/CD75534094590D903901020596C678022862B80D/740300.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42956() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Armored Scarlet Briar\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42956,\"icon\":\"https://render.guildwars2.com/file/4693F973AFCE349E70D970DE36FFA61AA31174F5/740301.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42957() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Miniature Snow Owl\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42957,\"icon\":\"https://render.guildwars2.com/file/920F0BCD463E0AFE1F3BBA169D36F54B6211D311/771061.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42958() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Miniature Raven\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42958,\"icon\":\"https://render.guildwars2.com/file/98EF4EED4875EEB89B0A207F4C049DD10F096C0D/771062.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42959() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Miniature Hawk\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42959,\"icon\":\"https://render.guildwars2.com/file/CF4EDC010746AFC8960E54E5E808B308F6066EF0/771063.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42960() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Scruffy\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42960,\"icon\":\"https://render.guildwars2.com/file/7DE5D3B06A2275F545D3D8FDEA23774A9BE695F4/849449.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42961() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Six Finisher Package\",\"description\":\"This package contains a permanent version of each of the following finishers:\n\nCow, Spectre, Thornroot, Whump the Giant, Vigil Megalaser, Twisted Watchwork.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42961,\"icon\":\"https://render.guildwars2.com/file/BAB752D21F013C265E36C49DED0E081B452D18A4/681029.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42967() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lightning Kite\",\"description\":\"Double-click to take out your kite.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"NotUpgradeable\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42967,\"icon\":\"https://render.guildwars2.com/file/924F98BEB37F090204D31F0D262CF4C22A57C673/603291.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42968() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Captain's Airship Pass (2 weeks)\",\"description\":\"Grants access to the Havoc's Heir over Gendarran Fields. Redeemable at any time. Expires two weeks after first use. Double-click to use.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Pve\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42968,\"icon\":\"https://render.guildwars2.com/file/3B0C0B68B818DB93D2B5A4949C11CC5E6FA20DE7/740294.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}