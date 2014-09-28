package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0279 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem64187() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Defender's Chest of Ascended Coats\",\"description\":\"Double-click to choose a piece of Ascended armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64187,\"icon\":\"https://render.guildwars2.com/file/332FB161D6B23EBA0814C5550091AD5A3D4C2EC3/771004.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64192() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Baby Minis Series 1 Pack\",\"description\":\"Contains:\n• Mini Black Bear Cub\n• Mini Hippo Calf\n• Mini White Kitten\n• Mini Lion Cub\n• Mini Moa Chick\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64192,\"icon\":\"https://render.guildwars2.com/file/3BC6E8CE4F744B57CC67A1019FEBFDAAAFD1271B/780156.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64195() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Black Lion Salvage Kit\",\"description\":\"Double-click then select an item in your inventory to salvage for crafting materials. 100% chance of recovering upgrades. 50% chance to get rarer materials.\",\"type\":\"Tool\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64195,\"icon\":\"https://render.guildwars2.com/file/2204EE5D7B1F7BEE9261CBAE3BF1DB5B027EE607/66551.png\",\"details\":{\"type\":\"Salvage\",\"charges\":1}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64196() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Engagement Ring\",\"description\":\"\\\"JP, will you marry me?\\\"\n—Candice\n<c=@flavor>I said yes!</c>\",\"type\":\"Trinket\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"NotUpgradeable\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":64196,\"icon\":\"https://render.guildwars2.com/file/742892571B436DF3C65B60E21632B7E90C010009/455587.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":23990},\"attributes\":[]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64197() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ring Box\",\"description\":\"<c=@flavor>\\\"JP, will you marry me?\\\"\n—Candice</c>\nAccount bound on use.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":64197,\"icon\":\"https://render.guildwars2.com/file/9E0BAFF636D296EF96FB9CF37F3CB425A92CC7F0/619517.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64205() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Iron Legion Soldier\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":64205,\"icon\":\"https://render.guildwars2.com/file/0CD715056EBE07C7B315780605E7E25FC49AA503/771010.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64206() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Aetherblade Elementalist\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":64206,\"icon\":\"https://render.guildwars2.com/file/BE53F503516713D8AF1C911CB85562BE2AF9F903/771011.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64207() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Vulture Raptor\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":64207,\"icon\":\"https://render.guildwars2.com/file/69485E12640871A0933C9A95EF220431CC1C9B09/771012.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64208() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Aetherblade Swashbuckler\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":64208,\"icon\":\"https://render.guildwars2.com/file/13A6280313A96AB89891FD42509138A65D7E331A/771013.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64209() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Bandit Bomber\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":64209,\"icon\":\"https://render.guildwars2.com/file/CDB399D0FD54FACC5C080EFBDA66AE62050CF6FC/771014.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64210() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Consortium Pacifier\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":64210,\"icon\":\"https://render.guildwars2.com/file/CA9509C03FC80C72EEFB3FAD2BCEF42B2AD0D82C/771015.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64211() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Freshwater Crab\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":64211,\"icon\":\"https://render.guildwars2.com/file/802B56061BE3663CCADC90963FF8D20BAE11FC18/771016.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64212() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Grawl Berserker\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":64212,\"icon\":\"https://render.guildwars2.com/file/F57C34951F1F955355133397C210EBCF6A2E96F5/771017.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64213() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Lionguard\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":64213,\"icon\":\"https://render.guildwars2.com/file/05E8B1177DB8036F5D49C2E85A40EE75C7F7A835/771018.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64214() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Salamander Drake\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":64214,\"icon\":\"https://render.guildwars2.com/file/2A1202AB6CE7ADEC58202BA4FF1C124296AF3E32/771019.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64215() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Ministry Guard\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":64215,\"icon\":\"https://render.guildwars2.com/file/E4F37EB19C1666C49F1FD83B1626AD0506F9FAAC/771020.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64216() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Mosquito\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":64216,\"icon\":\"https://render.guildwars2.com/file/E954A272EDBC119F9B182EE2EE9B37B379629853/771021.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64217() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Priory Historian\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":64217,\"icon\":\"https://render.guildwars2.com/file/0733080DB9EC0A6FB3D7599894FDEA6A03CEA09A/771022.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64218() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Sylvan Pup\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":64218,\"icon\":\"https://render.guildwars2.com/file/CB2A2AF419543305DCBF0297B6F101EFC60E1C63/771023.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64219() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Toxic Skale\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":64219,\"icon\":\"https://render.guildwars2.com/file/6E23C8640328D9592C0EA9545D64F3425075B0DD/771024.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64220() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Toxic Spider Queen\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":64220,\"icon\":\"https://render.guildwars2.com/file/FA9A1F92A66B06070C3C0FD4D329E209D43B53C2/771025.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64221() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Vigil Marksman\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":64221,\"icon\":\"https://render.guildwars2.com/file/39FE5F5F6EB308DCE648A9FA541448C2215DF3BC/771026.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64222() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Whispers Creator\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":64222,\"icon\":\"https://render.guildwars2.com/file/560B6FBFDEC05866B05DCC6725AE9C2727F5A85C/771027.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64223() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Ogre\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":64223,\"icon\":\"https://render.guildwars2.com/file/93337DFCC10B58392FB07493AE0B0BF490050818/771028.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem64224() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Destroyer Crab\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":64224,\"icon\":\"https://render.guildwars2.com/file/BEC355AE5F94F62506E7495B2372201C75DA44D0/771029.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}