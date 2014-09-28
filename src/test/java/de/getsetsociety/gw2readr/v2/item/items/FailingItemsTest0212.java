package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0212 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem47909() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Candy Corn Cob\",\"description\":\"Cobbled together from delicious candy corn.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":16,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":47909,\"icon\":\"https://render.guildwars2.com/file/1DEF3570D7499802B6D3F66756DF28C39536BCF5/648116.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48219() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wupwup Armor Chest\",\"description\":\"Double-click to choose an ascended armor piece with Celestial stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48219,\"icon\":\"https://render.guildwars2.com/file/2E684B7FFB18C9A780413F21F4613BD71A2DE92F/631153.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48220() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Occam's Armor Chest\",\"description\":\"Double-click to choose an ascended armor piece with Carrion stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48220,\"icon\":\"https://render.guildwars2.com/file/EF343D1E706DD5290693FDBD7FB01B4952050C21/631154.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48221() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ferratus's Armor Chest\",\"description\":\"Double-click to choose an ascended armor piece with Rabid stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48221,\"icon\":\"https://render.guildwars2.com/file/E532C0CC9CBDAC3FE867EC7C4CF8FD09011D6F1B/631155.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48222() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Morbach's Armor Chest\",\"description\":\"Double-click to choose an ascended armor piece with Dire stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48222,\"icon\":\"https://render.guildwars2.com/file/922DD2A8365A48C36812EA0D94CEDFD7F50F3908/631156.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48223() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tateos's Armor Chest\",\"description\":\"Double-click to choose an ascended armor piece with Cleric stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48223,\"icon\":\"https://render.guildwars2.com/file/5E032A630EDA99C24B1713FFFE9BD6222D5F6CD4/631157.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48224() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hronk's Armor Chest\",\"description\":\"Double-click to choose an ascended armor piece with Magi stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48224,\"icon\":\"https://render.guildwars2.com/file/DE075DCD059DD31F1011BAE5A0C63D0302CBC10C/631158.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48225() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Veldrunner Armor Chest\",\"description\":\"Double-click to choose an ascended armor piece with Apothecary stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48225,\"icon\":\"https://render.guildwars2.com/file/41805700F65A4A249D2352D35D0336BA40E5F909/631159.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48226() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gobrech's Armor Chest\",\"description\":\"Double-click to choose an ascended armor piece with Valkyrie stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48226,\"icon\":\"https://render.guildwars2.com/file/F9F35E94C10F1809906275299408477F2B09C906/631160.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48227() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Zojja's Armor Chest\",\"description\":\"Double-click to choose an ascended armor piece with Berserker stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48227,\"icon\":\"https://render.guildwars2.com/file/54C42771DFFCDC579D050BD51C1D3DA800120623/631161.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48228() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ahamid's Armor Chest\",\"description\":\"Double-click to choose an ascended armor piece with Soldier stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48228,\"icon\":\"https://render.guildwars2.com/file/11541098AA6030E4FB0797B3FEFDA0ED090CE3F5/631162.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48229() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Forgemaster's Armor Chest\",\"description\":\"Double-click to choose an ascended armor piece with Rampager stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48229,\"icon\":\"https://render.guildwars2.com/file/D1ADE9C9CD4D013B06E901412B24C35DFF25EE02/631163.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48230() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Saphir's Armor Chest\",\"description\":\"Double-click to choose an ascended armor piece with Assassin stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48230,\"icon\":\"https://render.guildwars2.com/file/610FAD0507DCCB6845025303673D78F8B8C461CD/631164.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48231() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Leftpaw's Armor Chest\",\"description\":\"Double-click to choose an ascended armor piece with Settler stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48231,\"icon\":\"https://render.guildwars2.com/file/48071CFCFEC1E9FD079C78B6D30198B657B4073F/631165.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48232() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Angchu Armor Chest\",\"description\":\"Double-click to choose an ascended armor piece with Cavalier stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48232,\"icon\":\"https://render.guildwars2.com/file/0F0E9BF9DFAAED023029DA4EC9B81FE0EE140613/631166.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48233() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Beigarth's Armor Chest\",\"description\":\"Double-click to choose an ascended armor piece with Knight stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48233,\"icon\":\"https://render.guildwars2.com/file/B3D1BCA875590CB29E980E4DE5CBAF649CE1E592/631167.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48234() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Zintl Armor Chest\",\"description\":\"Double-click to choose an ascended armor piece with Shaman stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48234,\"icon\":\"https://render.guildwars2.com/file/A10BAD75B4F075F7B75B1A7BF6E10F0EFA1F2621/631168.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48235() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wei Qi's Armor Chest\",\"description\":\"Double-click to choose an ascended armor piece with Sentinel stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48235,\"icon\":\"https://render.guildwars2.com/file/FC500935FF4ADB22A0E3B7C62218E9EE4516004E/631169.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48739() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Clockheart\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48739,\"icon\":\"https://render.guildwars2.com/file/D9DA0BF9DCFDBEB02A6116AF245E043EEBB156D6/643275.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48740() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Bloody Prince Thorn\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48740,\"icon\":\"https://render.guildwars2.com/file/0C045C44140E0A6A980A08EDD801C39064034E39/648145.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48741() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Ghost Carlotta\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48741,\"icon\":\"https://render.guildwars2.com/file/CD96DD28C950AE6F67496A152AB5C0F9BA5F6AF7/648146.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48742() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Candy-Corn Elemental\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48742,\"icon\":\"https://render.guildwars2.com/file/0FEAFFEFE90F79B6964262D63464592079B0E96F/648147.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48743() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Holographic Scarlet\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":48743,\"icon\":\"https://render.guildwars2.com/file/0E582F292430BD54C04AC7244BF8D2AFE4CDA158/643276.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48752() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Morbach's Dire Insignia\",\"description\":\"Used in the crafting of armor with +Condition Damage, +Vitality, and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":48752,\"icon\":\"https://render.guildwars2.com/file/C60FF2394908E6CDAA152B352B5B23D5FD08CBA2/699306.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48753() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Quaggan Ghost Trick-or-Treater\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":100,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48753,\"icon\":\"https://render.guildwars2.com/file/60F3076540ACEF04A9C850FB707B0FD5583CA74E/648152.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}