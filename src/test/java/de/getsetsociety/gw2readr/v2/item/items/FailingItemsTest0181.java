package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0181 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem43246() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Settler's Keepsake\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":43246,\"icon\":\"https://render.guildwars2.com/file/701826D2FCA61752AEECBDE80CF3BD361814FB33/62978.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":56},{\"attribute\":\"Healing\",\"modifier\":40},{\"attribute\":\"ConditionDamage\",\"modifier\":40}]},\"suffix_item_id\":37906,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43247() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Settler's Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":43247,\"icon\":\"https://render.guildwars2.com/file/F72942065C9028739427806FA89AA69E1526F13A/66769.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":67},{\"attribute\":\"Healing\",\"modifier\":48},{\"attribute\":\"ConditionDamage\",\"modifier\":48}]},\"suffix_item_id\":37906,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43248() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Reef Rider\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":43248,\"icon\":\"https://render.guildwars2.com/file/9867FDE21E27090FEFE95001F4A09BB699DF074A/587044.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43249() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Coins\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":43249,\"icon\":\"https://render.guildwars2.com/file/3BF274D1A323C002CDCFE80724912CDB7C78ABEE/62857.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43250() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Healing WvW Infusion\",\"description\":\"Double-click to apply to an unused defensive infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43250,\"icon\":\"https://render.guildwars2.com/file/7E12A199E052DB414D2AF309FAB03DAAA0148090/587071.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[\"Defense\"],\"infix_upgrade\":{\"buff\":{\"skill_id\":19062,\"description\":\"+5 Healing\n-1% Damage taken from Guards, Lords, and Supervisors\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43251() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Resilient WvW Infusion\",\"description\":\"Double-click to apply to an unused defensive infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43251,\"icon\":\"https://render.guildwars2.com/file/C0F15CC7A245C804C71F31F6B1037F5B043F3905/587072.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[\"Defense\"],\"infix_upgrade\":{\"buff\":{\"skill_id\":19065,\"description\":\"+5 Toughness\n-1% Damage taken from Guards, Lords, and Supervisors\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43252() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vital WvW Infusion\",\"description\":\"Double-click to apply to an unused defensive infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43252,\"icon\":\"https://render.guildwars2.com/file/C6029E732FBF2839F598B6E4D224BDD793241315/587073.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[\"Defense\"],\"infix_upgrade\":{\"buff\":{\"skill_id\":19066,\"description\":\"+5 Vitality\n-1% Damage taken from Guards, Lords, and Supervisors\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43253() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Malign WvW Infusion\",\"description\":\"Double-click to apply to an unused offensive infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43253,\"icon\":\"https://render.guildwars2.com/file/CB3B7590105E3EDC390C626735035361990CB1C0/587074.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[\"Offense\"],\"infix_upgrade\":{\"buff\":{\"skill_id\":19061,\"description\":\"+5 Condition Damage\n+1% Damage to Guards, Lords, and Supervisors\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43254() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mighty WvW Infusion\",\"description\":\"Double-click to apply to an unused offensive infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43254,\"icon\":\"https://render.guildwars2.com/file/F1B068BFD7E6AC11ED90FE09CAB916F6D4DC2C63/587075.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[\"Offense\"],\"infix_upgrade\":{\"buff\":{\"skill_id\":19063,\"description\":\"+5 Power\n+1% Damage to Guards, Lords, and Supervisors\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43255() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Precise WvW Infusion\",\"description\":\"Double-click to apply to an unused offensive infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43255,\"icon\":\"https://render.guildwars2.com/file/A95E4CE2CF099967CA2CED9329C031D2709F62EB/587076.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[\"Offense\"],\"infix_upgrade\":{\"buff\":{\"skill_id\":19064,\"description\":\"+5 Precision\n+1% Damage to Guards, Lords, and Supervisors\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43320() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jorbreaker\",\"description\":\"A sweet candy with a hard shell.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":16,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":43320,\"icon\":\"https://render.guildwars2.com/file/D1679CEA0B0207B8D196F1F39C913C14CB282901/591443.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43330() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Coins\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":43330,\"icon\":\"https://render.guildwars2.com/file/3BF274D1A323C002CDCFE80724912CDB7C78ABEE/62857.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43334() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of the Dragon Bash\",\"description\":\"This box contains a gift for participating in the Dragon Bash festival.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43334,\"icon\":\"https://render.guildwars2.com/file/C9640303BA980204A755F45803A59B5F1CBB0BFD/222420.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43352() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Infinite Aetherized Tonic\",\"description\":\"Double-click to drink, transforming you into a Aetherblade Cannoneer for 5 minutes. You will be unable to fight while transformed.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"NotUpgradeable\"],\"restrictions\":[],\"id\":43352,\"icon\":\"https://render.guildwars2.com/file/056E9CE8D954D997C1052E0D4A6FF3DE04ADB738/591462.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43353() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Marjory's Journal\",\"description\":\"Double-click to replay a scene from Marjory's Journal.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43353,\"icon\":\"https://render.guildwars2.com/file/C169769F7200EAFD31144DD0306909AF98B23449/220886.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43357() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dragon Coffer\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":43357,\"icon\":\"https://render.guildwars2.com/file/3CA03D7273EE0469B12A40BDEE5DE0E5064F3E70/591468.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43413() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dragon's Jade Claim Ticket\",\"description\":\"Take this ticket to a Black Lion Weapons Specialist to select a Dragon's Jade weapon skin.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43413,\"icon\":\"https://render.guildwars2.com/file/7AD62FBA3C56109D28CC1F02F950E8E821A231F4/591571.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43425() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Holographic Branded Minotaur\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43425,\"icon\":\"https://render.guildwars2.com/file/3E4FFC7646463FAA4597095676BBA801DBDC36DE/591572.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43426() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Holographic Axe-Wielding Destroyer\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43426,\"icon\":\"https://render.guildwars2.com/file/C5B83EA476A9EE535DC82FD6A9E076EC17C7F566/591573.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43427() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Holographic Corrupted Wolf\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43427,\"icon\":\"https://render.guildwars2.com/file/1CAB5AB03027617C702A297E0356D4C6C76EA216/591574.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43428() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Holographic Colossus\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43428,\"icon\":\"https://render.guildwars2.com/file/D8CFAACB6DEB0F7C68C496B80CC29AD2EA13BC08/591575.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43429() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Holographic Risen Knight\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":43429,\"icon\":\"https://render.guildwars2.com/file/56011D25606DE0D6A6E70F692BD600809A487053/591576.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43430() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Helmed Moa Racer\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":43430,\"icon\":\"https://render.guildwars2.com/file/2E095D7824C3260509267DC606CFF7F1A4D11136/591577.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43431() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini First Mate Horrik\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43431,\"icon\":\"https://render.guildwars2.com/file/DD0EB44775BC6636959F4066097A099AF3801AFE/591578.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43487() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sun Kite\",\"description\":\"Double-click to take out your kite.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"NotUpgradeable\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43487,\"icon\":\"https://render.guildwars2.com/file/B0A144777D986E4EDAAFCD032CBA0B5F45B066C0/603295.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}