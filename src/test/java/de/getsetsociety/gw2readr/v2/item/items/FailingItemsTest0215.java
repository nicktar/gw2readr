package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0215 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem49147() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unopened Endless Mystery Tonic\",\"description\":\"It smells of the forest. Use this item to transform into...something. The bottle seems to be self-replenishing.\n\nAccount bound on use.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSell\"],\"restrictions\":[],\"id\":49147,\"icon\":\"https://render.guildwars2.com/file/1275404EE30C0FDCC1EE6AB3A70136FB020158D7/66150.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49149() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Royal Terrace Pass\",\"description\":\"Grants access to the Royal Terrace in Divinity's Reach. Double-click to travel to the Royal Terrace.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49149,\"icon\":\"https://render.guildwars2.com/file/470C33B838D5541D39C91DD5C65A53EFB9BCEB79/699314.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49206() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hoard of Ascended Materials\",\"description\":\"Double-click to open. Contains 1 Empyreal Star, 1 Dragonite Ingot, and 1 Bloodstone Brick.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49206,\"icon\":\"https://render.guildwars2.com/file/F65D7736D39BA408AB9480C976D7081ED7BCF83D/222564.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49277() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Endless Fractal Tonic\",\"description\":\"It smells like some sort of furniture polish. Use this item to transform into...something. You'll never know what until you try.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49277,\"icon\":\"https://render.guildwars2.com/file/AE4C703E2B78E5777123132C47B3F0E311ACD35E/681018.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49286() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tixx's Toybox\",\"description\":\"Double-click to open and choose between one of Tixx's toy miniatures or a Generous Wintersday Gift.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49286,\"icon\":\"https://render.guildwars2.com/file/2C5CC521500764E6CDDA46D064143A38A49567F6/681020.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49287() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Generous Wintersday Gift\",\"description\":\"Contains 100 Giant Wintersday Gifts.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":49287,\"icon\":\"https://render.guildwars2.com/file/420CE6DF804B1429750A115F9B6CEDA504A036F4/526220.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49291() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Fawn\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49291,\"icon\":\"https://render.guildwars2.com/file/E52B4240470CE01FB2F87139C256284BB07ECFFE/681021.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49292() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Arctic Fox Kit\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49292,\"icon\":\"https://render.guildwars2.com/file/7A6F3DC80A961A2DBC7EB64D693008ABC1255960/681022.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49293() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Puppy\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49293,\"icon\":\"https://render.guildwars2.com/file/C805A20144A24C954203579E314838FEDC96D839/681023.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49294() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Dolyak Calf\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49294,\"icon\":\"https://render.guildwars2.com/file/B762EADCBB01980DB6A5BC18C334757380C99274/681024.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49308() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thresher-Sickle 5000\",\"description\":\"Used to harvest all plants. Unlimited use.\",\"type\":\"Gathering\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"default_skin\":2384,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49308,\"icon\":\"https://render.guildwars2.com/file/F1C5657FB4F6F269E4763FA754055C9A4D127311/740325.png\",\"details\":{\"type\":\"Foraging\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49361() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Black Lion Trading Satchel\",\"description\":\"18 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":60,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49361,\"icon\":\"https://render.guildwars2.com/file/34D1F91F1525EDA9B3D39707FCB606653545F643/681055.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":18}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49394() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Royal Signet of Doric (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":49394,\"icon\":\"https://render.guildwars2.com/file/F96BD9BAB00592D001EB5B36350E0AD1AA09EFA4/511817.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]},{\"flags\":[]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15757,\"description\":\"+32 Power\n+18 Toughness\n+18 Vitality\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":71},{\"attribute\":\"Toughness\",\"modifier\":50},{\"attribute\":\"Vitality\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49395() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lost Seal of Usoku (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":49395,\"icon\":\"https://render.guildwars2.com/file/016D1DF853B6B97B5D165EC0BE9F0597FAA1125E/511829.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]},{\"flags\":[]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15757,\"description\":\"+32 Power\n+18 Toughness\n+18 Vitality\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":71},{\"attribute\":\"Toughness\",\"modifier\":50},{\"attribute\":\"Vitality\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49396() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Marriner's Compass (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":49396,\"icon\":\"https://render.guildwars2.com/file/225D50B7193C17213C092F6439A72AE8CBAE7180/511822.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]},{\"flags\":[]}],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49397() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Circle of Light (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":49397,\"icon\":\"https://render.guildwars2.com/file/2022E87E78C511102A3D0506241B02F4AD1BBE4D/522591.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]},{\"flags\":[]}],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49398() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rurik's Royal Signet Ring (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":49398,\"icon\":\"https://render.guildwars2.com/file/5D37E17ED2A3A058166D02A170650D0F03A81CA3/511830.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]},{\"flags\":[]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15759,\"description\":\"+32 Toughness\n+18 Power\n+18 Ferocity\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":71},{\"attribute\":\"Power\",\"modifier\":50},{\"attribute\":\"CritDamage\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49399() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Adelbern's Royal Signet Ring (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":49399,\"icon\":\"https://render.guildwars2.com/file/09DB6AF70B2FFA4B0FBF986A1F3AF70057DCED9A/511820.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]},{\"flags\":[]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15759,\"description\":\"+32 Toughness\n+18 Power\n+18 Ferocity\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":71},{\"attribute\":\"Power\",\"modifier\":50},{\"attribute\":\"CritDamage\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49400() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ouroboros Loop (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":49400,\"icon\":\"https://render.guildwars2.com/file/2ACFDD50233369F8CFAB75EDB8761DDDEBDD6AD2/511825.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]},{\"flags\":[]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15752,\"description\":\"+32 Condition Damage\n+18 Precision\n+18 Toughness\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":71},{\"attribute\":\"Precision\",\"modifier\":50},{\"attribute\":\"Toughness\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49401() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Khilbron's Phylactery (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":49401,\"icon\":\"https://render.guildwars2.com/file/55A6A999A52591BB7607421A13996D5DA6530780/511815.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]},{\"flags\":[]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15752,\"description\":\"+32 Condition Damage\n+18 Precision\n+18 Toughness\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":71},{\"attribute\":\"Precision\",\"modifier\":50},{\"attribute\":\"Toughness\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49402() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Crystalline Band (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":49402,\"icon\":\"https://render.guildwars2.com/file/3B1CC13C0A3747B4A00277113E6ACD64D522B1D1/511816.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]},{\"flags\":[]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15755,\"description\":\"+32 Power\n+18 Ferocity\n+18 Precision\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":71},{\"attribute\":\"Precision\",\"modifier\":50},{\"attribute\":\"CritDamage\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49403() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ring of Red Death (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":49403,\"icon\":\"https://render.guildwars2.com/file/B155B37AD048CA9054F749043C3E4E99973DF8DF/511826.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]},{\"flags\":[]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15755,\"description\":\"+32 Power\n+18 Ferocity\n+18 Precision\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":71},{\"attribute\":\"Precision\",\"modifier\":50},{\"attribute\":\"CritDamage\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49404() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vassar's Band (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":49404,\"icon\":\"https://render.guildwars2.com/file/F62F7509E6A1F8C4A8E3F026040B6EB9E8E590A9/511827.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]},{\"flags\":[]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15752,\"description\":\"+32 Condition Damage\n+18 Precision\n+18 Toughness\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":71},{\"attribute\":\"Vitality\",\"modifier\":50},{\"attribute\":\"Toughness\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49405() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ralena's Band (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":49405,\"icon\":\"https://render.guildwars2.com/file/5C6368E7DDAA72C8BEE158002374F19D5F69DA51/511818.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]},{\"flags\":[]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15752,\"description\":\"+32 Condition Damage\n+18 Precision\n+18 Toughness\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":71},{\"attribute\":\"Vitality\",\"modifier\":50},{\"attribute\":\"Toughness\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49406() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vine of the Pale Tree (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":49406,\"icon\":\"https://render.guildwars2.com/file/F19213545C48BBBB6D7C0AE7BB362004B59276C2/511821.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]},{\"flags\":[]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15756,\"description\":\"+32 Power\n+18 Ferocity\n+18 Vitality\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":71},{\"attribute\":\"Precision\",\"modifier\":50},{\"attribute\":\"CritDamage\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}