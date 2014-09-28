package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0292 {

    private static ObjectMapper mapper = new ObjectMapper();

    @Test
    public void testItem65635() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Champion Avatar of Balthazar Loot Box\",\"description\":\"This champion container has champion bags, dragonite ore, and empyreal fragments.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65635,\"icon\":\"https://render.guildwars2.com/file/6352A0CDC02708386CCB2C0A4200BFB63862E8F6/780398.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65636() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hound of Balthazar Loot Box\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65636,\"icon\":\"https://render.guildwars2.com/file/900B6F07174AEFC96A664AC6115D2DABC90B06B8/66867.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65637() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Acolyte of Balthazar Loot Box\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65637,\"icon\":\"https://render.guildwars2.com/file/900B6F07174AEFC96A664AC6115D2DABC90B06B8/66867.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65638() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Disciple of Balthazar Loot Box\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65638,\"icon\":\"https://render.guildwars2.com/file/900B6F07174AEFC96A664AC6115D2DABC90B06B8/66867.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65639() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Champion Hound of Balthazar Loot Box\",\"description\":\"This champion container has champion bags, dragonite ore, and empyreal fragments.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65639,\"icon\":\"https://render.guildwars2.com/file/5DC1C9B7CE5D9DAF10B30FB6E602EBF466F094D6/780399.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65640() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Balthazar Backpack Box\",\"description\":\"This Balthazar backpack box contains the Balthazar backpack skin, dragonite ore, empyreal fragments, obsidian shards, and mystic clovers.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":65640,\"icon\":\"https://render.guildwars2.com/file/EB7E38553C1E0B91BD58C3309F6A0F3F40EBC809/779855.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem65841() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Trait Guide [Prismatic Understanding]\",\"type\":\"Trait\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[\"Mesmer\"],\"id\":65841,\"icon\":\"https://render.guildwars2.com/file/2DFB4EDF0408A8604100BB6A510D215CE637B03C/780409.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66115() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Trait Guide [Dogged March]\",\"type\":\"Trait\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[\"Warrior\"],\"id\":66115,\"icon\":\"https://render.guildwars2.com/file/07944E932465EF2D624808557257989007D0B5DC/780413.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66164() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Chickenado\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66164,\"icon\":\"https://render.guildwars2.com/file/293FCC43D8F065915D067FA55BE8E3ED2B405EAD/841530.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66208() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bronze Boss Blitz Chest\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66208,\"icon\":\"https://render.guildwars2.com/file/01E1F97E6302777D4AA225AD04316A7BBB3A620D/711848.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66209() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Festival Welcome Gift\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66209,\"icon\":\"https://render.guildwars2.com/file/42DB7C943734DA460A6BBC6E3316E9E6F71A70B3/603286.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66210() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gold Boss Blitz Chest\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66210,\"icon\":\"https://render.guildwars2.com/file/01E1F97E6302777D4AA225AD04316A7BBB3A620D/711848.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66211() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bounty of the Festival\",\"description\":\"Contains 1 Favor of the Festival and 1600 Festival Tokens. Use this wealth to purchase fabulous rewards in the Labyrinthine Cliffs or the Crown Pavilion.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66211,\"icon\":\"https://render.guildwars2.com/file/E1C5D2E7206D58DA48C80D08B20106B923FF0825/619510.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66213() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Horns of the Dragon Helm Set\",\"description\":\"This box contains light, medium, and heavy versions of the Horns of the Dragon helm skin.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66213,\"icon\":\"https://render.guildwars2.com/file/C9640303BA980204A755F45803A59B5F1CBB0BFD/222420.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66214() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Endless Dolyak Calf Tonic\",\"description\":\"Double-click to transform into a dolyak calf for fifteen minutes. You will be unable to fight while transformed.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66214,\"icon\":\"https://render.guildwars2.com/file/B762EADCBB01980DB6A5BC18C334757380C99274/681024.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66216() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Panda\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66216,\"icon\":\"https://render.guildwars2.com/file/C21FD13C4974B4F100E760ED350CCC7128EA380B/797785.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66217() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Silver Boss Blitz Chest\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66217,\"icon\":\"https://render.guildwars2.com/file/01E1F97E6302777D4AA225AD04316A7BBB3A620D/711848.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66220() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Favor of the Festival\",\"description\":\"Redeemable in the Labyrinthine Cliffs for a fabulous festival reward or in the Crown Pavilion for a Sovereign Weapon Skin. This item can be created by combining a Favor of the Bazaar and a Favor of the Pavilion.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66220,\"icon\":\"https://render.guildwars2.com/file/0C189A5DA7F75E9778A8BC950C3DEB365B2A744B/797786.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66224() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Festival Token\",\"description\":\"Redeemable in the Labyrinthine Cliffs for various rewards and prizes.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66224,\"icon\":\"https://render.guildwars2.com/file/63E1A0F023D101045B5BA2331C289327687FC7E3/797790.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66323() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Musical Lute\",\"description\":\"Double-click to change your skill bar, allowing you to play music for all those nearby.\\n\\nCannot be used in combat.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\",\"NoUnderwater\"],\"restrictions\":[],\"id\":66323,\"icon\":\"https://render.guildwars2.com/file/EB163F2BB848193BC6D9E5092C4E1FFEB63057DE/819605.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66342() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Water Fight Balloon Bucket\",\"description\":\"<c=@abilitytype>Costume Brawl Toy:</c> Double-click to equip a bundle which grants fun costume brawl skills. Brawl skills will only hit other players also using costume brawl.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"NotUpgradeable\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66342,\"icon\":\"https://render.guildwars2.com/file/13F82003EBC157075C3C6D45F8A932B237080CE1/819617.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66349() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"WvW Spring Tournament 2014 Reward Chest (Unlocked)\",\"description\":\"Contains rewards based on your world's performance in the previous WvW season.\\nDouble-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66349,\"icon\":\"https://render.guildwars2.com/file/6BA91E0A08689B40B09ECC3FB3C4589493E6C167/603245.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66350() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"WvW Spring Tournament 2014 Reward Chest (Unlocked)\",\"description\":\"Contains rewards based on your world's performance in the previous WvW season.\\nDouble-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66350,\"icon\":\"https://render.guildwars2.com/file/6BA91E0A08689B40B09ECC3FB3C4589493E6C167/603245.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66351() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"WvW Spring Tournament 2014 Reward Chest (Unlocked)\",\"description\":\"Contains rewards based on your world's performance in the previous WvW season.\\nDouble-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66351,\"icon\":\"https://render.guildwars2.com/file/6BA91E0A08689B40B09ECC3FB3C4589493E6C167/603245.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66352() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"WvW Tournament Claim Ticket\",\"description\":\"Take this ticket to a WvW Battle Historian.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66352,\"icon\":\"https://render.guildwars2.com/file/EA7D806F457FAEB924E1A3A2056D18404D9CE8F1/819624.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}