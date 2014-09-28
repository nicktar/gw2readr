package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0208 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem46499() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Infinite Continue Coin\",\"description\":\"This coin grants ten lives when used in the Super Adventure Box's Game Over room. Item must be in your inventory to use it. Can be reused infinitely.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":46499,\"icon\":\"https://render.guildwars2.com/file/28A6C4EDADBFBD5CE0A8BD631B08BA15DBA1E517/631272.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46500() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"World 1 Super Boom Box\",\"description\":\"Double-click to pull out a boom box and play super tunes for your friends. Plays all 5 songs from Super Adventure Box World 1.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"NotUpgradeable\",\"AccountBindOnUse\",\"NoUnderwater\"],\"restrictions\":[],\"id\":46500,\"icon\":\"https://render.guildwars2.com/file/E4204EBD4499090B565665BA0D302F41A1914F7D/631273.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46504() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"World 2 Super Boom Box\",\"description\":\"Double-click to pull out a boom box and play super tunes for your friends. Plays all 5 songs from Super Adventure Box World 2.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"NotUpgradeable\",\"AccountBindOnUse\",\"NoUnderwater\"],\"restrictions\":[],\"id\":46504,\"icon\":\"https://render.guildwars2.com/file/46BDA56E18341E94706F4F0698FEA109B17C663B/631278.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46506() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"King Toad Z-1\",\"description\":\"Combine King Toad Z-1, Z-2, Z-3, and a Moto Weapon Design in the Mystic Forge.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":20,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":46506,\"icon\":\"https://render.guildwars2.com/file/0844635EDFBF68F1BA74EE1B6E097D935472E354/631279.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46507() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Storm Wizard Z-1\",\"description\":\"Combine Storm Wizard Z-1, Z-2, Z-3, and a Moto Weapon Design in the Mystic Forge.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":20,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":46507,\"icon\":\"https://render.guildwars2.com/file/CF45EC0C201F1694E51968399C56AF73F4790CD0/631280.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46508() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"King Toad Z-2\",\"description\":\"Combine King Toad Z-1, Z-2, Z-3, and a Moto Weapon Design in the Mystic Forge.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":20,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":46508,\"icon\":\"https://render.guildwars2.com/file/6CE4AC53C0FC9F602ADF247460F77CFDCBA95E7E/631281.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46509() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"King Toad Z-3\",\"description\":\"Combine King Toad Z-1, Z-2, Z-3, and a Moto Weapon Design in the Mystic Forge.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":20,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":46509,\"icon\":\"https://render.guildwars2.com/file/6CDBF115DD29B3C26BAFB90121A11E27CC953B19/631282.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46510() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Storm Wizard Z-2\",\"description\":\"Combine Storm Wizard Z-1, Z-2, Z-3, and a Moto Weapon Design in the Mystic Forge.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":20,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":46510,\"icon\":\"https://render.guildwars2.com/file/B0C90A4D3BB7E51B02A178F1275DEA40C801C176/631283.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46511() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Storm Wizard Z-3\",\"description\":\"Combine Storm Wizard Z-1, Z-2, Z-3, and a Moto Weapon Design in the Mystic Forge.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":20,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":46511,\"icon\":\"https://render.guildwars2.com/file/B8F87E1734E2C6D4CA971395A0314E46AB68015C/631284.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46644() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Princess Miya's Wig\",\"description\":\"Combine Princess Miya's Wig, Dress, and Tiara with Mini Moto in the Mystic Forge.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":20,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":46644,\"icon\":\"https://render.guildwars2.com/file/1915994170BE9E519457F5A2717C3115285236BD/631434.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46645() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Princess Miya's Dress\",\"description\":\"Combine Princess Miya's Wig, Dress, and Tiara with Mini Moto in the Mystic Forge.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":20,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":46645,\"icon\":\"https://render.guildwars2.com/file/2BA4600512A1C35F026B65986A19E51E31E7DD18/631435.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46646() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Princess Miya's Tiara\",\"description\":\"Combine Princess Miya's Wig, Dress, and Tiara with Mini Moto in the Mystic Forge.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":20,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":46646,\"icon\":\"https://render.guildwars2.com/file/DCF5DD1E4D0BBD027D08237CDCB00791A29DC33C/631436.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46653() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Princess Miya\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":46653,\"icon\":\"https://render.guildwars2.com/file/CB7BCD0BD772266120EB4B27B6EC431C4029EA0E/631441.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46654() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Moto\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":46654,\"icon\":\"https://render.guildwars2.com/file/F3EC7F246D09709261FA071C76FDAE576E48519F/631442.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46681() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Glob of Dark Matter\",\"description\":\"Used in crafting Ascended items.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":46681,\"icon\":\"https://render.guildwars2.com/file/2C3CCBD8A8C7B97F1BB0D4EA30D447130E01160C/631468.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46684() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Shaman's Orichalcum Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Vitality, +Condition Damage, and +Healing.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46684,\"icon\":\"https://render.guildwars2.com/file/97D807C9ED4BE1A820A79FD93CB56DA37AB9BA06/631472.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46685() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cavalier's Orichalcum Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Toughness, +Power, and +Ferocity.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46685,\"icon\":\"https://render.guildwars2.com/file/08B200F04861FCC86771A7EE0CBF9C78D275075A/631473.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46686() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rabid Orichalcum Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Condition Damage, +Precision, and Toughness.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46686,\"icon\":\"https://render.guildwars2.com/file/9EAD37F9A1DD703574B2A0BE62C60C356E4F01AC/631474.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46687() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Magi's Orichalcum Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Healing, +Precision, and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46687,\"icon\":\"https://render.guildwars2.com/file/1E2D626B133CBC9DC472E903D01F2FE2C5970732/631475.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46688() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Soldier's Orichalcum Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Power, +Vitality, and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46688,\"icon\":\"https://render.guildwars2.com/file/4B69327AC17E3A225E732F0FE6EE205B0F0B17ED/631476.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46689() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Settler's Orichalcum Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Toughness, +Healing, and +Condition Damage.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46689,\"icon\":\"https://render.guildwars2.com/file/9EA8212F48454FD479484A2E0D06459D38251906/631477.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46690() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dire Orichalcum Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Condition Damage, +Vitality, and Toughness.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46690,\"icon\":\"https://render.guildwars2.com/file/5065F7F45DBCBDF1D0220AF1F6565528AB72AB54/631478.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46691() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Occam's Carrion Inscription\",\"description\":\"Used in the crafting of weapons with +Condition Damage, +Power, and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46691,\"icon\":\"https://render.guildwars2.com/file/E87152EA9F33E4F36465CDA00DE909CE420D6CBC/674811.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46692() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Theodosus' Cleric Inscription\",\"description\":\"Used in the crafting of weapons with +Healing Power, +Power, and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46692,\"icon\":\"https://render.guildwars2.com/file/F8754471ED341B1177DBE2A69FDB3468A076C82D/674812.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46693() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ebonmane's Apothecary Inscription\",\"description\":\"Used in the crafting of weapons with +Healing Power, +Toughness, and +Condition Damage.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46693,\"icon\":\"https://render.guildwars2.com/file/3F08C753D83B99D7E939AB68030F32EFCDCC7FBB/674813.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}