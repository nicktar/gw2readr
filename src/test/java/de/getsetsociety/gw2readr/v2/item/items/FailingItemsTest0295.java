package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0295 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem66656() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ambrite Fossilized Mosquito\",\"description\":\"Used to craft the short bow Culicidae.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66656,\"icon\":\"https://render.guildwars2.com/file/DFBFD3CDFDF99D0A3A37C0A4B3B7A113051E0546/831490.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66657() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ambrite Fossilized Mantis\",\"description\":\"Used to craft the rifle Mantodea.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66657,\"icon\":\"https://render.guildwars2.com/file/974921320A2807D7F27A31016474E3EC42C6E639/831491.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66660() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"PvP Qualifier Prizes: First and Second Place\",\"description\":\"Congratulations on your placement in the qualifying tournament. Double-click to receive your rewards.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66660,\"icon\":\"https://render.guildwars2.com/file/6E9FA3C99A223677280CD9154A3FB50E2B43AE5B/66895.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66661() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"PvP Qualifier Prizes: Third and Fourth Place\",\"description\":\"Congratulations on your placement in the qualifying tournament. Double-click to receive your rewards.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66661,\"icon\":\"https://render.guildwars2.com/file/6E9FA3C99A223677280CD9154A3FB50E2B43AE5B/66895.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66662() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tournament of Legends: 5th through 8th Place\",\"description\":\"Double-click to receive your rewards.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66662,\"icon\":\"https://render.guildwars2.com/file/6E9FA3C99A223677280CD9154A3FB50E2B43AE5B/66895.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66665() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"PvP Qualifier Prizes: 9th through 16th Place\",\"description\":\"Double-click to receive your rewards.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66665,\"icon\":\"https://render.guildwars2.com/file/6E9FA3C99A223677280CD9154A3FB50E2B43AE5B/66895.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66666() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"PvP Qualifier Prizes: 5th through 8th Place\",\"description\":\"Double-click to receive your rewards.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66666,\"icon\":\"https://render.guildwars2.com/file/6E9FA3C99A223677280CD9154A3FB50E2B43AE5B/66895.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66670() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lump of Raw Ambrite\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":25,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":66670,\"icon\":\"https://render.guildwars2.com/file/ED1D15DCA3FF6EC502E10D3923EDEB916ABC0261/831511.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66671() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Exquisite Ambrite Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":264,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66671,\"icon\":\"https://render.guildwars2.com/file/B9CD5EE8F59703DB0E4B70EA0D1D127C0FFA5F1B/831512.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":24611,\"description\":\"+25 Toughness\n+15 Healing\n+15 Vitality\"},\"attributes\":[]},\"suffix\":\"of Ambrite\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66760() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Token of Taimi's Gratitude\",\"description\":\"<c=@flavor>Some things from Dry Top that Taimi would like you to have as a thank-you.</c>\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66760,\"icon\":\"https://render.guildwars2.com/file/9C071C5B9F0466CDA1D9321743430AD9A52B0C61/841514.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66764() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mordrem Seed Pouch\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66764,\"icon\":\"https://render.guildwars2.com/file/E19A2AF4B4B14EB29E0FBD0EA5B804A50F527B77/841516.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66766() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unidentified Fossilized Insect\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66766,\"icon\":\"https://render.guildwars2.com/file/C8679503540375F77074E8C3D7AB06CBAD36055A/841520.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66768() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Endless Monkey King Tonic\",\"description\":\"Double-click to drink, transforming you into the Monkey King for fifteen minutes. You will be unable to fight while transformed.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\",\"NoUnderwater\"],\"restrictions\":[],\"id\":66768,\"icon\":\"https://render.guildwars2.com/file/9223F0F12E9B42809021CADFBD5F6DE5E045F6A2/841522.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66893() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unopened Prosperity Mine Kite\",\"description\":\"Double-click to take out your kite. This kite provides a 5% speed increase, 33% during sandstorms.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\"],\"flags\":[\"NoMysticForge\",\"NoSell\",\"NoUnderwater\"],\"restrictions\":[],\"id\":66893,\"icon\":\"https://render.guildwars2.com/file/29FBE9CEAB02C8E97F53EF72AC58F1E916EB9650/849425.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66895() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unopened Crystal Shard Kite\",\"description\":\"Double-click to take out your kite. This kite provides a 5% speed increase, 33% during sandstorms.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\"],\"flags\":[\"NoMysticForge\",\"NoSell\",\"NoUnderwater\"],\"restrictions\":[],\"id\":66895,\"icon\":\"https://render.guildwars2.com/file/10D455B90E0798977B23CF4A0699DE9F7FA7E41D/849426.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66896() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unopened Ventari Follower Kite\",\"description\":\"Double-click to take out your kite. This kite provides a 5% speed increase, 33% during sandstorms.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\"],\"flags\":[\"NoMysticForge\",\"NoSell\",\"NoUnderwater\"],\"restrictions\":[],\"id\":66896,\"icon\":\"https://render.guildwars2.com/file/F904106578C3A4633F39C5D705CDC630D17AFD2F/849427.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66897() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Prosperity Mine Kite\",\"description\":\"Double-click to take out your kite. This kite provides a 5% speed increase, 33% during sandstorms.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"NotUpgradeable\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66897,\"icon\":\"https://render.guildwars2.com/file/29FBE9CEAB02C8E97F53EF72AC58F1E916EB9650/849425.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66898() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Crystal Shard Kite\",\"description\":\"Double-click to take out your kite. This kite provides a 5% speed increase, 33% during sandstorms.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"NotUpgradeable\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66898,\"icon\":\"https://render.guildwars2.com/file/10D455B90E0798977B23CF4A0699DE9F7FA7E41D/849426.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66900() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ventari Follower Kite\",\"description\":\"Double-click to take out your kite. This kite provides a 5% speed increase, 33% during sandstorms.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"NotUpgradeable\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66900,\"icon\":\"https://render.guildwars2.com/file/F904106578C3A4633F39C5D705CDC630D17AFD2F/849427.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66902() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Brick of Clay\",\"description\":\"Used in the making of pottery.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66902,\"icon\":\"https://render.guildwars2.com/file/3344FFF73E551B6BBE954A58EE521AD0D9FB9396/849428.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66903() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Frozen Loot\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66903,\"icon\":\"https://render.guildwars2.com/file/F92967D9142C0B93C3259C560161784CE20D2200/63195.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66904() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Last Good-Bye\",\"description\":\"<c=@flavor>And just like that, he's gone. A bag of his old belongings is all that's left.</c>\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66904,\"icon\":\"https://render.guildwars2.com/file/10ACE47195709F69F366026507FEB0080DF39BE7/63194.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66909() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mysterious Seed\",\"description\":\"<c=@flavor>Plant in a Ley Line Infused Clay Pot to germinate.<c>\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66909,\"icon\":\"https://render.guildwars2.com/file/6942DE21A976BBE209D605F7A1069A16C0B25FF7/849430.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66910() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pet Seed\",\"description\":\"<c=@flavor>The next generation of cultivated seed produced by your own hand. To cultivate this new specimen to be even better than the last, plant it in a Mists Infused Clay Pot to germinate.</c>\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66910,\"icon\":\"https://render.guildwars2.com/file/6942DE21A976BBE209D605F7A1069A16C0B25FF7/849430.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66912() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ley Line Infused Clay Pot\",\"description\":\"Double-click to plant a Mysterious Seed in this pot.\n\n<c=@flavor>Everything needed to germinate a very special seed is in this pot now.<c>\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66912,\"icon\":\"https://render.guildwars2.com/file/633E9308CB9B4C6DF51454BA10A3C77155342A80/849432.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}