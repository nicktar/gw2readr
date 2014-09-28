package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0079 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem20173() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Bandit Saboteur\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20173,\"icon\":\"https://render.guildwars2.com/file/C446B07E310B0AD179757A545692900ACAE4E073/66058.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20174() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Bandit Cutpurse\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20174,\"icon\":\"https://render.guildwars2.com/file/06443EA0AF3F2F26B0260E359AB0F5C404220897/66059.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20175() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini River Drake\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20175,\"icon\":\"https://render.guildwars2.com/file/4BEFBCB212E5A81F22FC1415243E5004583D500A/66060.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20176() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Yellow Moa\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":100,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20176,\"icon\":\"https://render.guildwars2.com/file/C004719B29F0BD905D644741BD404A76EB7D5B05/66064.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20177() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Modniir Ice Sage\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20177,\"icon\":\"https://render.guildwars2.com/file/E6371A00E39BE71AB912FBC407F41D74999C262A/66066.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20178() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Skarn Darkhoof\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":500,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20178,\"icon\":\"https://render.guildwars2.com/file/08B87B9D35C851D5A91592287B7F520855A5522C/66067.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20179() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Harathi Sharpshooter\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20179,\"icon\":\"https://render.guildwars2.com/file/BC7365602705EBD9D04E036A7F0792280C0FF010/66068.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20180() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Tamini Warrior\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20180,\"icon\":\"https://render.guildwars2.com/file/B56E02F226F24C1EF69F021A0F0220602F971C04/66069.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20181() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Seraph Archer\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20181,\"icon\":\"https://render.guildwars2.com/file/603D2AB6FBC4A26FF597236804F646F51B0912B8/66072.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20182() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Ragar Shardhammer\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":500,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20182,\"icon\":\"https://render.guildwars2.com/file/9A22B72F71B7D5AD910C0DE2754ED25C9446D7ED/66074.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20183() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Svanir Hunter\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20183,\"icon\":\"https://render.guildwars2.com/file/F51B033D05C2D035C451AB2E725D61F8FDB9D9BE/66075.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20184() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Wolfborn Berserker\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20184,\"icon\":\"https://render.guildwars2.com/file/6C50F056C20AE54B067C625CAEECB9474C5EC071/66077.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20185() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Wolfborn Shaman\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":100,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20185,\"icon\":\"https://render.guildwars2.com/file/40F89855B90863DD389680540E596A790528BBA0/66078.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20186() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Wolfborn Hunter\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":100,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20186,\"icon\":\"https://render.guildwars2.com/file/6009F0339FEB19212DB2D906222474B5F6E3EB7D/66079.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20187() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Wolfborn\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20187,\"icon\":\"https://render.guildwars2.com/file/CE45586EEA0BBC29B11A45492EE9777A7DCA0110/66081.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20188() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Frost Fang\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":100,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20188,\"icon\":\"https://render.guildwars2.com/file/463D5BEB4FB629FD734BA249C993CF4C12B84D9B/66083.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20189() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Dredge Resonator\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20189,\"icon\":\"https://render.guildwars2.com/file/3D47547407CA9FC52FA8536A32B0A080F8A1C941/66088.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20190() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Dredge Strazar\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":100,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20190,\"icon\":\"https://render.guildwars2.com/file/2FF329FFC0DB7B0EDEE25D7B7101560E4F1924C3/66089.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20191() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Shaman Of Jormag\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20191,\"icon\":\"https://render.guildwars2.com/file/432931B7A059F87C1D92C23A974B992C0C1C484E/66093.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20192() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Swamp Drake\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":100,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20192,\"icon\":\"https://render.guildwars2.com/file/D6A360416A35CA220F75982211FEB540BBD4FF0C/66094.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20193() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Swamp Spider\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20193,\"icon\":\"https://render.guildwars2.com/file/6601601BAFFB2C13912A516A92125FEFABC37941/66096.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20194() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Eelob Poisonfang\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":500,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20194,\"icon\":\"https://render.guildwars2.com/file/954AD8525BBCEDFC4ECAAF7999699F03012CF249/66097.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20195() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Hylek Tlamatini\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20195,\"icon\":\"https://render.guildwars2.com/file/C793C0C6F64CEC0BB2B1FB159E96DEC50712E515/66099.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20196() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Hylek Cuicani\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":100,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20196,\"icon\":\"https://render.guildwars2.com/file/7E7A6B2D9DDF565D07ACB0754055B279B209CA0F/66101.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20197() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Hylek Amini\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":100,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20197,\"icon\":\"https://render.guildwars2.com/file/54A7B4CA5B71782C27B8E31D07EA0579A26458CB/66103.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}