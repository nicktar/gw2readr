package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0199 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem45008() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Steamrider\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":100,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":45008,\"icon\":\"https://render.guildwars2.com/file/B5B1517418243E40C639A0000EC5E4D8434701CA/625755.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45009() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Steam Hulk\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":500,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":45009,\"icon\":\"https://render.guildwars2.com/file/0E6076E5F8D062744C0B03F373FBAC4C219E95A6/625756.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45010() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Steam Minotaur\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":45010,\"icon\":\"https://render.guildwars2.com/file/EE1153E63CDC2BC007161575BF2EDB6E3308F436/625757.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45011() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Mr. Sparkles\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45011,\"icon\":\"https://render.guildwars2.com/file/0393CA0E917FB445B2060C00AB935FB96EAE2A0A/625604.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45022() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Oscillating Diaphragm\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":45022,\"icon\":\"https://render.guildwars2.com/file/1F2963C0F8331BC508A2F0E27B3039AC0172E0B9/219369.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45023() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Focusing Crystal\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":45023,\"icon\":\"https://render.guildwars2.com/file/7A9976EFAD9745A1E2E80273CB10A0491F20D067/219370.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45024() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Translocator Beacon\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":45024,\"icon\":\"https://render.guildwars2.com/file/B670B12A2D1444920856944E1B98D60A4F28C17B/219371.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45029() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift From Scarlet\",\"description\":\"How thoughtful! What could it be?\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":100,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":45029,\"icon\":\"https://render.guildwars2.com/file/7CDD184BD1A3A243C8A77BAB76AC5803F360770A/625764.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45030() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Twisted Watchwork Shoulder Scrap\",\"description\":\"Double-click a stack of 250 to assemble a Twisted Watchwork Shoulder Skin.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45030,\"icon\":\"https://render.guildwars2.com/file/B39F55A2EBAF486E785619E3E90517A655A19764/625765.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45031() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Scarlet's Secret Stash\",\"description\":\"Contains random objects of value. Random chance for Twisted Watchwork Shoulders.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45031,\"icon\":\"https://render.guildwars2.com/file/441EF9BAB614527809557206EA5FF3D45A70CBCE/222566.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45039() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bit of Twisted Watchwork Scrap\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45039,\"icon\":\"https://render.guildwars2.com/file/C67ADC33C9E0BB700E5B66087E47F8CEEEA863F3/625767.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45040() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pile of Twisted Watchwork Scrap\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":60,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45040,\"icon\":\"https://render.guildwars2.com/file/04D14076FF5A0CBFC2A80AFE7B077ABE3C2D30FC/625768.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45041() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jagged Twisted Watchwork Scrap\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":84,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45041,\"icon\":\"https://render.guildwars2.com/file/39E80AC2F69C64E35A710AEB64201596E16B1E02/625769.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45042() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Twisted Watchwork Scrap\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":105,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45042,\"icon\":\"https://render.guildwars2.com/file/45A068F061087736E33832B176B956EA91765E99/625770.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45043() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Salvageable Twisted Watchwork Scrap\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":126,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45043,\"icon\":\"https://render.guildwars2.com/file/3A4C1B1ABDC2F7C307E40A74D3E00ED0A3D1C057/625771.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45044() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Frostbite\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45044,\"icon\":\"https://render.guildwars2.com/file/A3B6DB6565A2929A94310D32450729DE69463FCB/831497.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45050() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Primeval Armor Chest\",\"description\":\"For Guardian and Warrior professions. Contains a heavy helm, coat, legs, boots, shoulders, and gloves, and a Primeval armor skin.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45050,\"icon\":\"https://render.guildwars2.com/file/C403787F7A41E178C32CF878CE49EDF0D5D12D74/625927.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45051() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Profane Armor Chest\",\"description\":\"For Elementalist, Mesmer, and Necromancer professions. Contains a light helm, coat, legs, boots, shoulders, and gloves, and a Profane armor skin.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45051,\"icon\":\"https://render.guildwars2.com/file/00D869C85A5906AA29AC790F07591CBF0D2D7496/625928.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45052() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Krytan Armor Chest\",\"description\":\"For Engineer, Ranger, and Thief professions. Contains a medium helm, coat, legs, boots, shoulders, and gloves, and a Krytan armor skin.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45052,\"icon\":\"https://render.guildwars2.com/file/0F401757C5930E9354B1FBD1DAE4B052176894AF/625929.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45053() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"18 Slot Mithril Box\",\"description\":\"18 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":27,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45053,\"icon\":\"https://render.guildwars2.com/file/00A876DFF0B89D18026B9BE4C1239E0BB7BAB81E/220595.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":18}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45061() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Candy Corn Gold Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":270,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":45061,\"icon\":\"https://render.guildwars2.com/file/A20680A9F44E60E4BA96C72B7A14B36E667E78F4/499416.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":40},{\"attribute\":\"Power\",\"modifier\":29}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45062() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Candy Corn Silver Pendant\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":136,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":45062,\"icon\":\"https://render.guildwars2.com/file/B4FC7D1A7D194CF6C2663153FA389556302DC695/499417.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":23},{\"attribute\":\"Power\",\"modifier\":17}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45181() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wupwup Weapon Chest\",\"description\":\"Double-click to choose an ascended weapon with Celestial stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45181,\"icon\":\"https://render.guildwars2.com/file/2E684B7FFB18C9A780413F21F4613BD71A2DE92F/631153.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45182() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Occam's Weapon Chest\",\"description\":\"Double-click to choose an ascended weapon with Carrion stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45182,\"icon\":\"https://render.guildwars2.com/file/EF343D1E706DD5290693FDBD7FB01B4952050C21/631154.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45183() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Grizzlemouth's Weapon Chest\",\"description\":\"Double-click to choose an ascended weapon with Rabid stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45183,\"icon\":\"https://render.guildwars2.com/file/E532C0CC9CBDAC3FE867EC7C4CF8FD09011D6F1B/631155.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}