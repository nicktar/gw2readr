package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0182 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem43526() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Musical Frame Drum\",\"description\":\"Double-click to pull out a drum and play for your friends.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\",\"NoUnderwater\"],\"restrictions\":[],\"id\":43526,\"icon\":\"https://render.guildwars2.com/file/70C509C6B86CFEF9DDF847E441D4151E26513D40/648155.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43527() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bone Pick\",\"description\":\"Used to mine all metals. Unlimited use.\",\"type\":\"Gathering\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"default_skin\":2398,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":43527,\"icon\":\"https://render.guildwars2.com/file/9827C507181C6B305EA026C2F1EB7448AA390CD5/638367.png\",\"details\":{\"type\":\"Mining\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43528() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Chocolates\",\"description\":\"This box contains chocolates that you can eat or throw for various effects in Costume Brawl.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43528,\"icon\":\"https://render.guildwars2.com/file/39FD9EDC1AA019A0B53367A82DE9D63627B90C98/729530.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43552() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bit of Aetherized Metal Scrap\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":43552,\"icon\":\"https://render.guildwars2.com/file/E6CBAC4541017F082F45043D08546602F6B65B51/598595.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43553() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pile of Aetherized Metal Scrap\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":60,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":43553,\"icon\":\"https://render.guildwars2.com/file/76F5B1F5EA9F18140E4F5AC2FE2F9854B7B29BF4/598596.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43554() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jagged Aetherized Metal Scrap\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":84,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":43554,\"icon\":\"https://render.guildwars2.com/file/C996C534D443584544696ADD0AFA0ED7E3FA36F8/598597.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43555() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Aetherized Metal Scrap\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":105,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":43555,\"icon\":\"https://render.guildwars2.com/file/034978F6ED34E80168CF40179CAC090E5CC1C249/598598.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43556() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Salvageable Aetherized Metal Scrap\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":126,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":43556,\"icon\":\"https://render.guildwars2.com/file/F446BC45E948FA080B45EED34BFF65AD7CB5BE24/598599.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43574() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Flamewrath Heavy Armor Skin\",\"description\":\"This full set of heavy armor skins can replace the appearance of heavy armor pieces, once per slot. The skins will also be unlocked in your account wardrobe.\n\nSkins have no stats of their own.\nCan only be used by characters who wear heavy armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43574,\"icon\":\"https://render.guildwars2.com/file/5E7791D65C499D464206A01CB72E0E10D21009E9/681032.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43575() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Flamewalker Medium Armor Skin\",\"description\":\"This full set of medium armor skins can replace the appearance of medium armor pieces, once per slot. The skins will also be unlocked in your account wardrobe.\n\nSkins have no stats of their own.\nCan only be used by characters who wear medium armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43575,\"icon\":\"https://render.guildwars2.com/file/7C0CEF9C7B640B9FA3ED640D7102CC7CADD843DB/681033.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43576() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Flamekissed Light Armor Skin\",\"description\":\"This full set of light armor skins can replace the appearance of light armor pieces, once per slot. The skins will also be unlocked in your account wardrobe.\n\nSkins have no stats of their own.\nCan only be used by characters who wear light armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43576,\"icon\":\"https://render.guildwars2.com/file/DB589E3B2BC60EA1D558A9B5A6C509ABD02BE20D/681034.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43631() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tournament of Legends: Fourth Place\",\"description\":\"Double-click to receive your rewards.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43631,\"icon\":\"https://render.guildwars2.com/file/6E9FA3C99A223677280CD9154A3FB50E2B43AE5B/66895.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43632() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tournament of Legends: Third Place\",\"description\":\"Double-click to receive your rewards.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43632,\"icon\":\"https://render.guildwars2.com/file/6E9FA3C99A223677280CD9154A3FB50E2B43AE5B/66895.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43633() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tournament of Legends: Second Place\",\"description\":\"Double-click to receive your rewards.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43633,\"icon\":\"https://render.guildwars2.com/file/6E9FA3C99A223677280CD9154A3FB50E2B43AE5B/66895.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43634() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tournament of Legends: First Place\",\"description\":\"Double-click to receive your rewards.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43634,\"icon\":\"https://render.guildwars2.com/file/6E9FA3C99A223677280CD9154A3FB50E2B43AE5B/66895.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43760() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Achievement Chest\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43760,\"icon\":\"https://render.guildwars2.com/file/0946149B43355E23B5C7552E6E5DDB4A9160603E/603242.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43761() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Large Achievement Chest\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43761,\"icon\":\"https://render.guildwars2.com/file/E1BBB0CCDFFF63C3C958C229732707D0BAB21611/603243.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43762() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Heavy Achievement Chest\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43762,\"icon\":\"https://render.guildwars2.com/file/B270FAC7E775573DC44F08FA734E36C24E5CC30C/603244.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43763() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Massive Achievement Chest\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43763,\"icon\":\"https://render.guildwars2.com/file/6BA91E0A08689B40B09ECC3FB3C4589493E6C167/603245.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43764() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Achievement Chest\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43764,\"icon\":\"https://render.guildwars2.com/file/0946149B43355E23B5C7552E6E5DDB4A9160603E/603242.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43772() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Charged Quartz Crystal\",\"description\":\"Transform 25 Quartz into a Charged Quartz Crystal at a place of power.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43772,\"icon\":\"https://render.guildwars2.com/file/10ABB44B459640C30CB8BFAEA9DFEAE19C6ECD67/603251.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43773() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Quartz Crystal\",\"description\":\"Transform 25 Quartz into a Charged Quartz Crystal at a place of power.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":20,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":43773,\"icon\":\"https://render.guildwars2.com/file/6D0737BD7FC3E270D67A9C0D214CCAB70A4C1B74/603252.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43774() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Celestial Intricate Gossamer Insignia\",\"description\":\"Used in the crafting of armor with a bonus to all stats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43774,\"icon\":\"https://render.guildwars2.com/file/BFD0077336F91771530D59F46B7AEC1EFBF12BFA/434360.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43775() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Celestial Orichalcum Imbued Inscription\",\"description\":\"Used in the crafting of weapons with a bonus to all stats.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43775,\"icon\":\"https://render.guildwars2.com/file/9C1FA22BC16F3C7636CE324901ECD46E9700E9AC/340499.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43777() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Celestial Exalted Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43777,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}