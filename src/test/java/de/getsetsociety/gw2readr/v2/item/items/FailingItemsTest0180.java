package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0180 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem42973() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Flute\",\"description\":\"Double-click to change your skill bar and play a flute for your friends.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42973,\"icon\":\"https://render.guildwars2.com/file/C61FFFF84E10D7143920E8291B80DA75C6315A3C/603292.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42974() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Kite Fortune\",\"description\":\"Double-click to get a fortune and 10 minutes of either a speed boost, magic find boost, karma boost, or experience boost.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42974,\"icon\":\"https://render.guildwars2.com/file/60B941CA76737D34DD100A09E5C9434AD3D632D2/603293.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42976() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Boost Enchantment Powder\",\"description\":\"Repackages boosts in your inventory to take up less space and allows you to change boosts to another similar type.\n\nEach powder will grant one Enchanted Boost in exchange for the following boosts in the quantity listed in the parentheses:\n• Karma Booster (2)\n• Experience Booster (1)\n• Gathering Booster (1)\n• Crafting Booster (1)\n• Magic Find Booster (1)\n• Killstreak Experience Booster (1)\n• Armor Booster (1)\n• Strength Booster (1)\n• Speed Booster (1)\n• Rejuvenation Booster (1)\n\nDouble-click to activate.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":125,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42976,\"icon\":\"https://render.guildwars2.com/file/B80CE8037A7541798002059E0DBD0A37B27108DA/819620.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42978() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wintersday Minis 3-Pack\",\"description\":\"Double-click to receive the holiday trio: Mini Fawn, Mini Puppy, and Mini Arctic Fox Kit.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42978,\"icon\":\"https://render.guildwars2.com/file/4B5345024E2D5A0503E04F7D923562422806FB4D/681030.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42979() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Heroic Chest\",\"description\":\"Contains boosters and a legacy suit of armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42979,\"icon\":\"https://render.guildwars2.com/file/A7AE2BB2D21619CC09FB44E878090740C20A5ED6/625926.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42981() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bazaar Quaggan Mini Pack\",\"description\":\"Double-click to receive miniature Poowulpi the Persnicketous, Peggellegg the \\\"Pirate,\\\" and Kookoochoo the Incredulous.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42981,\"icon\":\"https://render.guildwars2.com/file/760D01E692A9F8DC000C23E95C29A0933CC63B9B/603294.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43016() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Zodiac Heavy Armor Skin\",\"description\":\"This full set of heavy armor skins can replace the appearance of heavy armor pieces, once per slot. The skins will also be unlocked in your account wardrobe.\n\nSkins have no stats of their own.\nCan only be used by characters who wear heavy armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43016,\"icon\":\"https://render.guildwars2.com/file/2793703E07C7E0D15EA2EE95E6C116DA75674F0C/740302.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43017() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Zodiac Medium Armor Skin\",\"description\":\"This full set of medium armor skins can replace the appearance of medium armor pieces, once per slot. The skins will also be unlocked in your account wardrobe.\n\nSkins have no stats of their own.\nCan only be used by characters who wear medium armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43017,\"icon\":\"https://render.guildwars2.com/file/CACA37AA4734936B5E062003940CAB4B11092F6C/740303.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43018() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Zodiac Light Armor Skin\",\"description\":\"This full set of light armor skins can replace the appearance of light armor pieces, once per slot. The skins will also be unlocked in your account wardrobe.\n\nSkins have no stats of their own.\nCan only be used by characters who wear light armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43018,\"icon\":\"https://render.guildwars2.com/file/9A22FCFF1B3DDC290D5360DAC77595C86D36F9F8/740304.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43073() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Evon Gnashblade Support Bundle\",\"description\":\"Contains a support booster and support banners for this candidate.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43073,\"icon\":\"https://render.guildwars2.com/file/6BD3EC55E7A00396BA10DC95F4BE0D107D80A15B/607652.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43074() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ellen Kiel Support Bundle\",\"description\":\"Contains a support booster and support banners for this candidate.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43074,\"icon\":\"https://render.guildwars2.com/file/31D6562827E6B917C9E6755F205D27AD9969F6FF/607653.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43076() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wind Kite\",\"description\":\"Double-click to take out your kite.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"NotUpgradeable\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43076,\"icon\":\"https://render.guildwars2.com/file/6EFE433340221491B09239B80CEED423D160BD64/603297.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43077() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Black Lion Introductory Package\",\"description\":\"This pack contains the following items:\n•1 Box o' Fun\n•5 Dye Packs\n•5 Black Lion Chest Keys\n•1 Recovery Package\n•1 Tradesman's Package\n•5 Experience Boosters\n•5 Speed Boosters\n•1 Minis 3-Pack (Series 2)\n•1 Black Lion Trading Satchel (18-Slot Bag)\n•1 500-Point Essence of Luck\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43077,\"icon\":\"https://render.guildwars2.com/file/10C33E980EEBECD4CD600243EF9CB33D3E5BEB5D/681031.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43078() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lion's Arch Commemorative Dye Kit\",\"description\":\"Double-click to gain one of 25 random colors commemorating Lion's Arch of old. Includes six exclusive colors.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43078,\"icon\":\"https://render.guildwars2.com/file/7F3328A7A7997C7BD4396F383C3AB017342DB298/780271.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43091() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bloody Prince's Outfit\",\"description\":\"Contains a Bloody Prince outfit, which is usable in combat, and a Bloody Prince Staff toy for costume brawl.\n\nOutfits are full sets of clothing that hide other armor. This will not change individual armor pieces, and you will still receive your current armor stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43091,\"icon\":\"https://render.guildwars2.com/file/0297679A65D858DFC61B9C02ECC4964FDEC7AA1A/648158.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43098() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Executioner's Outfit\",\"description\":\"Contains an Executioner Outfit, which is usable in combat, and an Executioner Axe toy for costume brawl.\n\nOutfits are full sets of clothing that hide other armor. This will not change individual armor pieces, and you will still receive your current armor stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43098,\"icon\":\"https://render.guildwars2.com/file/606BC169F95F7FF8470DD2CE6D30016AD5B646EA/648164.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43100() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Phalanx Heavy-Armor Skin\",\"description\":\"This full set of heavy armor skins can replace the appearance of heavy armor pieces, once per slot. The skins will also be unlocked in your account wardrobe.\n\nSkins have no stats of their own.\nCan only be used by characters who wear heavy armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43100,\"icon\":\"https://render.guildwars2.com/file/3727CC685744360817FA5CE8430BBD164F6241FD/665784.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43101() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Viper's Medium-Armor Skin\",\"description\":\"This full set of medium armor skins can replace the appearance of medium armor pieces, once per slot. The skins will also be unlocked in your account wardrobe.\n\nSkins have no stats of their own.\nCan only be used by characters who wear medium armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43101,\"icon\":\"https://render.guildwars2.com/file/29FF069D1B19BC79B8B1CDD6D8DACE3E189114AC/665785.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43102() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Trickster's Light-Armor Skin\",\"description\":\"This full set of light armor skins can replace the appearance of light armor pieces, once per slot. The skins will also be unlocked in your account wardrobe.\n\nSkins have no stats of their own.\nCan only be used by characters who wear light armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43102,\"icon\":\"https://render.guildwars2.com/file/B2525293D7E825EDD50124F64C0EB7436FACD2DB/665786.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43157() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Braham's Heavy Armor Skin\",\"description\":\"Contains a single-use armor skin for heavy helm, coat, legs, boots, shoulders and gloves.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43157,\"icon\":\"https://render.guildwars2.com/file/F346F56DCB0C0D48EA2955F808157F7F7A3D082E/607631.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43158() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Magitech Medium Armor Skin\",\"description\":\"Contains a single-use armor skin for medium helm, coat, legs, boots, shoulders and gloves.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43158,\"icon\":\"https://render.guildwars2.com/file/385FE06436453DDC0E7499710EE871B990751D61/607632.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43159() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Phoenix Light Armor Skin\",\"description\":\"Contains a single-use armor skin for light helm, coat, legs, boots, shoulders and gloves.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43159,\"icon\":\"https://render.guildwars2.com/file/373DE53305C7FF04067FD22EF23DC7594D3E0FE4/607633.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43230() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sample Detector\",\"description\":\"Levvi's jury-rigged device for locating and collecting anomalous environmental samples.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":43230,\"icon\":\"https://render.guildwars2.com/file/02F191D77DDAC53C9D74EA0D0B33B357D0B80BCE/499504.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43244() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Heroes\",\"description\":\"When used in the Mystic Forge, this gift upgrades Hero's weapons to Mistforged Hero's weapons.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43244,\"icon\":\"https://render.guildwars2.com/file/B31614931F3A3340590528A9BE2742169A62A921/819599.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43245() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Settler's Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":528,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":43245,\"icon\":\"https://render.guildwars2.com/file/5606ABB8CEAFB9CE0D573EA46C6504CC00E6FAFD/222360.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":90},{\"attribute\":\"Healing\",\"modifier\":64},{\"attribute\":\"ConditionDamage\",\"modifier\":64}]},\"suffix_item_id\":37906,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}