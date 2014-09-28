package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0296 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem66913() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Clay Pot\",\"description\":\"<c=@flavor>Missing just a few things needed to germinate a seed.<c>\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":66913,\"icon\":\"https://render.guildwars2.com/file/A16C9EFFD44CAD0827F4BB5E80F8C2120934366B/849433.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66914() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Polarized Ley Line Infused Stone\",\"description\":\"Combine in the Mystic Forge with a Clay Pot, Bloodstone Dust, and Foxfire Clusters to create a Ley Line Infused Clay Pot.\n\n<c=@flavor>It's very difficult to focus your eyes on this stone. The space around it is rich with magical energy.<c>\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66914,\"icon\":\"https://render.guildwars2.com/file/BB11FE61EB237DBECB316049AA38490EEE3E5C62/849434.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66915() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ley Line Infused Stone\",\"description\":\"The polarity of this stone is locked in a stable matrix. A Ley Line disrupting device could unlock its potential forces.\nDouble-click to show.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66915,\"icon\":\"https://render.guildwars2.com/file/3CC904193FD5C5229CFFD0077E585F500C03387F/849435.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66916() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Package of Sacred Plant Food\",\"description\":\"Double-click to feed to a Mysterious Seedling.\n\n<c=@flavor>Purified with Sacred Glacial Water to keep a wild plant well behaved while it matures.<c>\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66916,\"icon\":\"https://render.guildwars2.com/file/74EDD7063E7D01D112A128071DBCA801BB68BF9A/849436.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66917() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Plate of Meaty Plant Food\",\"description\":\"<c=@flavor>This mash of meaty, semi-toxic ingredients needs just a few more things to be the kind of food needed to calm a wild carnivorous plant.<c>\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":66917,\"icon\":\"https://render.guildwars2.com/file/D3AF0F153675FEED2FF155990EA69E1F253BEEE3/849437.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66918() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vial of Sacred Glacial Water\",\"description\":\"This water is warm and murky. It could be purified, but only at its source.\nDouble-click to show.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66918,\"icon\":\"https://render.guildwars2.com/file/ABAF20A7D506CDCDD20143DB33A8C4FE2FF553EB/849438.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66920() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Package of Phantasmally Infused Plant Food\",\"description\":\"Double-click to feed to a Mysterious Sprout.\n\n<c=@flavor>This spicy snack has been infused with the essence of a phantasm and magically prepared for the connoisseur of carnivorous plants.<c>\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66920,\"icon\":\"https://render.guildwars2.com/file/7654557DE2567B2FC8784116E9E56F6434411D43/849440.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66922() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pile of Phantasmal Residue\",\"description\":\"This residue lies dormant. It could be imbued at a strong phantasmal energy source.\nDouble-click to show.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66922,\"icon\":\"https://render.guildwars2.com/file/CEDD6E450F44706F0B070D7158E30E3E293AFE73/849442.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66923() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Plate of Piquant Plant Food\",\"description\":\"<c=@flavor>Just a couple ingredients shy of having the kind of kick an especially persnickety carnivorous plant would enjoy.<c>\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":66923,\"icon\":\"https://render.guildwars2.com/file/7102024A5FA50AD002FBE915F7FE69D7CDD919B3/849443.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66926() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Endless Monkey King Tonic\",\"description\":\"Double-click to drink, transforming you into the Monkey King for fifteen minutes. You will be unable to fight while transformed.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSell\",\"NoUnderwater\"],\"restrictions\":[],\"id\":66926,\"icon\":\"https://render.guildwars2.com/file/9223F0F12E9B42809021CADFBD5F6DE5E045F6A2/841522.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66927() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Home Portal Stone\",\"description\":\"Double-click to be transported to your home in your racial city.\nDouble-click while in your home to return to where you entered from.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Pve\",\"PvpLobby\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66927,\"icon\":\"https://render.guildwars2.com/file/FA290C7D3EE1BE71A0702765F091263D4519BE20/849446.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66933() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Foxfire Cluster\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\"],\"restrictions\":[],\"id\":66933,\"icon\":\"https://render.guildwars2.com/file/16C3F5FEBCE2765E67BA183B34B723E234499429/849453.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66953() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Birthday Gift\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":100,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":66953,\"icon\":\"https://render.guildwars2.com/file/5C759EC1C95F3BE53C167A7D9F0D27BF3AE56277/625611.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66955() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Birthday Gift\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":100,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":66955,\"icon\":\"https://render.guildwars2.com/file/5C759EC1C95F3BE53C167A7D9F0D27BF3AE56277/625611.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66961() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Birthday Blaster\",\"description\":\"Click to equip the Birthday Blaster.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\",\"Unique\",\"NoUnderwater\"],\"restrictions\":[],\"id\":66961,\"icon\":\"https://render.guildwars2.com/file/0C7E685C63F9DE19773912E935E31BCCE7CB0756/757307.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66966() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Beetle Remains\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":66966,\"icon\":\"https://render.guildwars2.com/file/F855A00BF372FBF00590FED523BC7D1899B77C13/66893.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66969() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Monkey King\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":66969,\"icon\":\"https://render.guildwars2.com/file/ABA37FE7730EAE3E6D0DEF0C659B2C4E04A678A6/855348.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66977() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Summit Hero's Reward\",\"description\":\"<c=@flavor>A gift given in gratitude from the leaders of Tyria.</c>\n\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66977,\"icon\":\"https://render.guildwars2.com/file/B270FAC7E775573DC44F08FA734E36C24E5CC30C/603244.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66980() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cultivated Seedling\",\"description\":\"<c=@flavor>This young carnivorous plant looks hungry for something particularly magical. Some Ley Line Dusted Plant Food should satisfy its cravings.</c>\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66980,\"icon\":\"https://render.guildwars2.com/file/09D4806693A444A9F41FDB7B1A38AE2FF73796F9/849429.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66981() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cultivated Seed\",\"description\":\"<c=@flavor>The first seed cultivated and produced by your own hand. To cultivate this new specimen to be even better than the last, plant in a Chaos Infused Clay Pot to germinate.</c>\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66981,\"icon\":\"https://render.guildwars2.com/file/6942DE21A976BBE209D605F7A1069A16C0B25FF7/849430.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66984() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chaos Infused Clay Pot\",\"description\":\"Double-click to plant a Cultivated Seed in this pot.\n\n<c=@flavor>A pot so infused with energy, it's sure to germinate a more powerful seedling.</c>\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66984,\"icon\":\"https://render.guildwars2.com/file/3DA1FC3FE85CBDF793B065007FC95B0719072E35/855353.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66985() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chaos Orb\",\"description\":\"A humming emanates from this orb. It could be amplified with an additional source of Chaotic Radiation.\nDouble-click to show.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66985,\"icon\":\"https://render.guildwars2.com/file/7B3644AAF86208FE5ECE1CE7D55B067E3ECB6452/855352.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66987() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Package of Ley Line Dusted Plant Food\",\"description\":\"Double-click to feed to a Cultivated Seedling.\n\n<c=@flavor>Dusted with Ley Line power to nourish a growing magical carnivorous plant.</c>\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66987,\"icon\":\"https://render.guildwars2.com/file/56781A7C4F5E06492101ACE1F8660C024254A4F8/855355.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66988() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pile of Ley Line Dust\",\"description\":\"An inert pile of dust from a ley line. A jolt of energy from a specialized asuran lab will energize it.\nDouble-click to show.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66988,\"icon\":\"https://render.guildwars2.com/file/DDC70802133FD17CD9C538E89D94FB222730D6C5/855356.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66989() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Package of Oasis Soaked Plant Food\",\"description\":\"Double-click to feed to a Cultivated Sprout.\n\n<c=@flavor>Soaked in the clean, cool waters from a Maguuma oasis.</c>\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66989,\"icon\":\"https://render.guildwars2.com/file/7654557DE2567B2FC8784116E9E56F6434411D43/849440.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}