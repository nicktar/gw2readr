package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0278 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem64146() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Penetrating Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":47,\"rarity\":\"Rare\",\"vendor_value\":189,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":64146,\"icon\":\"https://render.guildwars2.com/file/0A402568104F5BE5BC644665653302005F6266CF/66800.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":28},{\"attribute\":\"CritDamage\",\"modifier\":20}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64149() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Penetrating Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":46,\"rarity\":\"Rare\",\"vendor_value\":252,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":64149,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":36},{\"attribute\":\"CritDamage\",\"modifier\":26}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64164() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Malicious Chest of Ascended Leggings\",\"description\":\"Double-click to choose a piece of Ascended armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64164,\"icon\":\"https://render.guildwars2.com/file/EEBFAE8014D42F375112DF9307C22D145619140C/771002.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64165() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Healer's Chest of Ascended Leggings\",\"description\":\"Double-click to choose a piece of Ascended armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64165,\"icon\":\"https://render.guildwars2.com/file/21E0CCFD196D174B0132CCE10909EFE560221DFC/771003.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64166() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Defender's Chest of Ascended Shoulders\",\"description\":\"Double-click to choose a piece of Ascended armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64166,\"icon\":\"https://render.guildwars2.com/file/332FB161D6B23EBA0814C5550091AD5A3D4C2EC3/771004.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64167() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Healer's Chest of Ascended Coats\",\"description\":\"Double-click to choose a piece of Ascended armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64167,\"icon\":\"https://render.guildwars2.com/file/21E0CCFD196D174B0132CCE10909EFE560221DFC/771003.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64168() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Defender's Chest of Ascended Leggings\",\"description\":\"Double-click to choose a piece of Ascended armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64168,\"icon\":\"https://render.guildwars2.com/file/332FB161D6B23EBA0814C5550091AD5A3D4C2EC3/771004.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64169() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Raider's Chest of Ascended Leggings\",\"description\":\"Double-click to choose a piece of Ascended armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64169,\"icon\":\"https://render.guildwars2.com/file/7C6795436FBF05D52F1B34929FAE301B480A4997/771005.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64170() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Healer's Chest of Ascended Gloves\",\"description\":\"Double-click to choose a piece of Ascended armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64170,\"icon\":\"https://render.guildwars2.com/file/21E0CCFD196D174B0132CCE10909EFE560221DFC/771003.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64171() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Malicious Chest of Ascended Gloves\",\"description\":\"Double-click to choose a piece of Ascended armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64171,\"icon\":\"https://render.guildwars2.com/file/EEBFAE8014D42F375112DF9307C22D145619140C/771002.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64172() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Raider's Chest of Ascended Gloves\",\"description\":\"Double-click to choose a piece of Ascended armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64172,\"icon\":\"https://render.guildwars2.com/file/7C6795436FBF05D52F1B34929FAE301B480A4997/771005.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64173() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Defender's Chest of Ascended Gloves\",\"description\":\"Double-click to choose a piece of Ascended armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64173,\"icon\":\"https://render.guildwars2.com/file/332FB161D6B23EBA0814C5550091AD5A3D4C2EC3/771004.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64174() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Defender's Chest of Ascended Boots\",\"description\":\"Double-click to choose a piece of Ascended armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64174,\"icon\":\"https://render.guildwars2.com/file/332FB161D6B23EBA0814C5550091AD5A3D4C2EC3/771004.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64175() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Raider's Chest of Ascended Boots\",\"description\":\"Double-click to choose a piece of Ascended armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64175,\"icon\":\"https://render.guildwars2.com/file/7C6795436FBF05D52F1B34929FAE301B480A4997/771005.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64176() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Malicious Chest of Ascended Boots\",\"description\":\"Double-click to choose a piece of Ascended armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64176,\"icon\":\"https://render.guildwars2.com/file/EEBFAE8014D42F375112DF9307C22D145619140C/771002.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64177() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Raider's Chest of Ascended Shoulders\",\"description\":\"Double-click to choose a piece of Ascended armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64177,\"icon\":\"https://render.guildwars2.com/file/7C6795436FBF05D52F1B34929FAE301B480A4997/771005.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64178() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Healer's Chest of Ascended Boots\",\"description\":\"Double-click to choose a piece of Ascended armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64178,\"icon\":\"https://render.guildwars2.com/file/21E0CCFD196D174B0132CCE10909EFE560221DFC/771003.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64179() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Malicious Chest of Ascended Coats\",\"description\":\"Double-click to choose a piece of Ascended armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64179,\"icon\":\"https://render.guildwars2.com/file/EEBFAE8014D42F375112DF9307C22D145619140C/771002.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64180() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Raider's Chest of Ascended Helms\",\"description\":\"Double-click to choose a piece of Ascended armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64180,\"icon\":\"https://render.guildwars2.com/file/7C6795436FBF05D52F1B34929FAE301B480A4997/771005.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64181() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Defender's Chest of Ascended Helms\",\"description\":\"Double-click to choose a piece of Ascended armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64181,\"icon\":\"https://render.guildwars2.com/file/332FB161D6B23EBA0814C5550091AD5A3D4C2EC3/771004.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64182() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Healer's Chest of Ascended Helms\",\"description\":\"Double-click to choose a piece of Ascended armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64182,\"icon\":\"https://render.guildwars2.com/file/21E0CCFD196D174B0132CCE10909EFE560221DFC/771003.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64183() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Malicious Chest of Ascended Helms\",\"description\":\"Double-click to choose a piece of Ascended armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64183,\"icon\":\"https://render.guildwars2.com/file/EEBFAE8014D42F375112DF9307C22D145619140C/771002.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64184() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Healer's Chest of Ascended Shoulders\",\"description\":\"Double-click to choose a piece of Ascended armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64184,\"icon\":\"https://render.guildwars2.com/file/21E0CCFD196D174B0132CCE10909EFE560221DFC/771003.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64185() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Malicious Chest of Ascended Shoulders\",\"description\":\"Double-click to choose a piece of Ascended armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64185,\"icon\":\"https://render.guildwars2.com/file/EEBFAE8014D42F375112DF9307C22D145619140C/771002.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64186() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Raider's Chest of Ascended Coats\",\"description\":\"Double-click to choose a piece of Ascended armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64186,\"icon\":\"https://render.guildwars2.com/file/7C6795436FBF05D52F1B34929FAE301B480A4997/771005.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}