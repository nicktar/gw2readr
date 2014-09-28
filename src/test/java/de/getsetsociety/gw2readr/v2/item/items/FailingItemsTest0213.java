package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0213 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem48754() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Assassin Trick-or-Treater\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":100,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48754,\"icon\":\"https://render.guildwars2.com/file/03A3AE19E10D31BE487D62F9CF680B3C4E222891/648153.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48755() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Aviator Trick-or-Treater\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":100,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48755,\"icon\":\"https://render.guildwars2.com/file/457952177815AE2F35A2136F95089C74C2E5FCC1/648154.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48756() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Caithe\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":100,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":48756,\"icon\":\"https://render.guildwars2.com/file/06B5187A3BB0A3F69CC09D3AC599D3410D343576/643278.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48761() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Dolyak\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\",\"NoUnderwater\"],\"restrictions\":[],\"id\":48761,\"icon\":\"https://render.guildwars2.com/file/0D531CE70875B1530BDEA8142768F00BE0517904/643287.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48762() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"WvW Season 1 Reward Chest Key\",\"description\":\"This key will unlock one WvW Season 1 Reward Chest containing rewards based on your server's performance in the previous season.\n\nWvW Season Reward Chests are awarded at the end of a WvW season to all players who achieved the meta-achievement for the season.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48762,\"icon\":\"https://render.guildwars2.com/file/9577036D9BF8A120CD02BCF110DDFA416303026A/65712.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48763() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"WvW Season 1 Participation Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48763,\"icon\":\"https://render.guildwars2.com/file/3BF274D1A323C002CDCFE80724912CDB7C78ABEE/62857.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48764() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"WvW Season 1 Achievement Chest\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48764,\"icon\":\"https://render.guildwars2.com/file/3FCAC7800E032AD2544939E16648CA668019361D/602788.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48765() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"WvW Season One Reward Chest (Locked)\",\"description\":\"Contains rewards based on your world's performance in the previous WvW season.\n<c=@flavor>Requires a WvW Season One Reward Chest Key to unlock.</c>\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48765,\"icon\":\"https://render.guildwars2.com/file/6BA91E0A08689B40B09ECC3FB3C4589493E6C167/603245.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48767() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"WvW Season One Reward Chest (Locked)\",\"description\":\"Contains rewards based on your world's performance in the previous WvW season.\n<c=@flavor>Requires a WvW Season One Reward Chest Key to unlock.</c>\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48767,\"icon\":\"https://render.guildwars2.com/file/6BA91E0A08689B40B09ECC3FB3C4589493E6C167/603245.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48769() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"WvW Season One Reward Chest (Locked)\",\"description\":\"Contains rewards based on your world's performance in the previous WvW season.\n<c=@flavor>Requires a WvW Season One Reward Chest Key to unlock.</c>\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48769,\"icon\":\"https://render.guildwars2.com/file/6BA91E0A08689B40B09ECC3FB3C4589493E6C167/603245.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48771() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"WvW Season One Reward Chest (Locked)\",\"description\":\"Contains rewards based on your world's performance in the previous WvW season.\n<c=@flavor>Requires a WvW Season One Reward Chest Key to unlock.</c>\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48771,\"icon\":\"https://render.guildwars2.com/file/6BA91E0A08689B40B09ECC3FB3C4589493E6C167/603245.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48773() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"WvW Season One Reward Chest (Locked)\",\"description\":\"Contains rewards based on your world's performance in the previous WvW season.\n<c=@flavor>Requires a WvW Season One Reward Chest Key to unlock.</c>\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48773,\"icon\":\"https://render.guildwars2.com/file/6BA91E0A08689B40B09ECC3FB3C4589493E6C167/603245.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48775() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"WvW Season One Reward Chest (Locked)\",\"description\":\"Contains rewards based on your world's performance in the previous WvW season.\n<c=@flavor>Requires a WvW Season One Reward Chest Key to unlock.</c>\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48775,\"icon\":\"https://render.guildwars2.com/file/6BA91E0A08689B40B09ECC3FB3C4589493E6C167/603245.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48777() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"WvW Season One Reward Chest (Locked)\",\"description\":\"Contains rewards based on your world's performance in the previous WvW season.\n<c=@flavor>Requires a WvW Season One Reward Chest Key to unlock.</c>\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48777,\"icon\":\"https://render.guildwars2.com/file/6BA91E0A08689B40B09ECC3FB3C4589493E6C167/603245.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48779() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"WvW Season One Reward Chest (Locked)\",\"description\":\"Contains rewards based on your world's performance in the previous WvW season.\n<c=@flavor>Requires a WvW Season One Reward Chest Key to unlock.</c>\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48779,\"icon\":\"https://render.guildwars2.com/file/6BA91E0A08689B40B09ECC3FB3C4589493E6C167/603245.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48781() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"WvW Season One Reward Chest (Locked)\",\"description\":\"Contains rewards based on your world's performance in the previous WvW season.\n<c=@flavor>Requires a WvW Season One Reward Chest Key to unlock.</c>\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48781,\"icon\":\"https://render.guildwars2.com/file/6BA91E0A08689B40B09ECC3FB3C4589493E6C167/603245.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48793() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Confiscated Treats\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":18,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48793,\"icon\":\"https://render.guildwars2.com/file/E6017363449406DEE3DD3B80263AA2A91716F1DE/499375.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48795() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Confiscated Treats\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":18,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48795,\"icon\":\"https://render.guildwars2.com/file/E6017363449406DEE3DD3B80263AA2A91716F1DE/499375.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48796() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mad King Chest\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48796,\"icon\":\"https://render.guildwars2.com/file/AC40E63DA407CA32DC0364CE68DBA1B00F94F5BD/222562.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48803() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tassi's Relay Golem\",\"description\":\"Double-click to occasionally receive messages from Tassi.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":48803,\"icon\":\"https://render.guildwars2.com/file/6D0AA296D7402CDE6F9BEB513F7007DEAD9B38B0/648139.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48805() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"High-Quality Plastic Fangs\",\"description\":\"Used in the creation of Gift of Spiders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":37,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":48805,\"icon\":\"https://render.guildwars2.com/file/F13AC2EC1990C5D97DFCF547D30CCA06340EB20E/648142.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48806() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tyria's Best Nougat Center\",\"description\":\"Used in the creation of Gift of Souls.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":37,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":48806,\"icon\":\"https://render.guildwars2.com/file/5C04007291E2AA26AEA65FB0D62E7303B303B45F/648143.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48807() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gibbering Skull\",\"description\":\"Used in the creation of Gift of the Moon.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":37,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":48807,\"icon\":\"https://render.guildwars2.com/file/9EA2050504ECB1A0B45538B2235C101795A92106/648144.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48825() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Frost Wasp Logging Tool\",\"description\":\"Perfect for use on all types of trees. Unlimited use.\",\"type\":\"Gathering\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":192,\"default_skin\":2389,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48825,\"icon\":\"https://render.guildwars2.com/file/0227CB6C96D2AC7FC20B6D465478E9BBF3ED09D9/771066.png\",\"details\":{\"type\":\"Logging\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48832() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chest\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":48832,\"icon\":\"https://render.guildwars2.com/file/666209104CCB024D53359C0EA0A299076E610771/65704.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}