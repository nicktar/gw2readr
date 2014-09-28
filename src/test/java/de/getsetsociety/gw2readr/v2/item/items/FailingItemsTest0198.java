package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0198 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem44779() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Costumed Mini 3-Pack\",\"description\":\"Double-click to receive the trick-or-treat trio: miniature asuran aviator, quaggan ghost, and assassin.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44779,\"icon\":\"https://render.guildwars2.com/file/29F135C235EDCCCCB3C714B70D24EEB907F69B5A/648175.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44876() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jack-in-the-Box Scythe\",\"description\":\"Used to harvest all plants. Unlimited use.\",\"type\":\"Gathering\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":192,\"default_skin\":2387,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":44876,\"icon\":\"https://render.guildwars2.com/file/B8FAB3CF449D4BF50BD29AEA7B1A753F7E5CE792/643281.png\",\"details\":{\"type\":\"Foraging\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44883() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Musical Harp\",\"description\":\"Double-click to change your skill bar, allowing you to play music for all those nearby.\n\nCannot be used in combat.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\",\"NoUnderwater\"],\"restrictions\":[],\"id\":44883,\"icon\":\"https://render.guildwars2.com/file/0880A31EA513FFD64A09A0DB2846A7043AE2A459/729531.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44886() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mist Herald Back Item Skin Set\",\"description\":\"Double-click to unpack. This backpack cover comes with a simple back strap to wear if you don't have another back-slot item.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":44886,\"icon\":\"https://render.guildwars2.com/file/4ED87AD3C56507310FC6AAF409AB53F63E3F04A0/866832.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44941() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Watchwork Sprocket\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":13,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":44941,\"icon\":\"https://render.guildwars2.com/file/F996013B7E4AB74F0D73EE38723521BEA9B8D67F/619700.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44942() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Sigil of Bursting\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":58,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":44942,\"icon\":\"https://render.guildwars2.com/file/FDF85F32FF2914C8620ECFAD4BD47F973819D601/619701.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":20472,\"description\":\"Adds 4% to current condition damage.\"},\"attributes\":[]},\"suffix\":\"of Bursting\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44943() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Sigil of Bursting\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":44943,\"icon\":\"https://render.guildwars2.com/file/23BB0880D81AE1C4B60D0C0297F9E1111D0A7352/619702.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":20473,\"description\":\"Adds 5% to current condition damage.\"},\"attributes\":[]},\"suffix\":\"of Bursting\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44944() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Bursting\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":44944,\"icon\":\"https://render.guildwars2.com/file/7ABFCEDF80329157F734FD56B293765D9B940FAD/619703.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":20474,\"description\":\"Adds 6% to current condition damage.\"},\"attributes\":[]},\"suffix\":\"of Bursting\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44945() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Sigil of Renewal\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":58,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":44945,\"icon\":\"https://render.guildwars2.com/file/2AFEFCED5B7F09EF5EA59368BF42DE1908E93695/619704.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":20469,\"description\":\"Heal Nearby Allies on Weapon Swap (180 Radius) <br><c=@reminder>(Cooldown: 9 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Renewal\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44946() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Sigil of Renewal\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":44946,\"icon\":\"https://render.guildwars2.com/file/EB6B3462F4459B07A02A07710F2C10A90AA6A37E/619705.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":20470,\"description\":\"Heal Nearby Allies on Weapon Swap (240 Radius) <br><c=@reminder>(Cooldown: 9 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Renewal\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44947() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Renewal\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":44947,\"icon\":\"https://render.guildwars2.com/file/F3F0730D5FEE09A7340E2E24E35A7AF304EDAAB7/619706.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":20471,\"description\":\"Heal Nearby Allies on Weapon Swap (360 Radius) <br><c=@reminder>(Cooldown: 9 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Renewal\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44948() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Sigil of Malice\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":58,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":44948,\"icon\":\"https://render.guildwars2.com/file/7396B40F4A32F91DCB0BB04F9171F32FD040C5EE/619707.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":20466,\"description\":\"+5% condition duration.\"},\"attributes\":[]},\"suffix\":\"of Malice\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44949() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Sigil of Malice\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":44949,\"icon\":\"https://render.guildwars2.com/file/FABB48962E60E6D8C625FF76760B9C080877157A/619708.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":20467,\"description\":\"+7% condition duration.\"},\"attributes\":[]},\"suffix\":\"of Malice\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44950() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Malice\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":44950,\"icon\":\"https://render.guildwars2.com/file/797D052CB4EA63A61A3225962128D197ACB3ED17/619709.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":20468,\"description\":\"+10% condition duration.\"},\"attributes\":[]},\"suffix\":\"of Malice\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44951() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of Exuberance\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":44951,\"icon\":\"https://render.guildwars2.com/file/5FBA08E65429F5AF91CE4776F6AC4972FCF93E50/619710.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Vitality\",\"3% of vitality is converted to healing power.\",\"+50 Vitality\",\"5% of vitality is converted to precision.\",\"+100 Vitality\",\"7% of vitality is converted to power.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Exuberance\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44952() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of Exuberance\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Rare\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":44952,\"icon\":\"https://render.guildwars2.com/file/D69FBE744029E8227DF4E8E4386D1EE9130ADF2A/619711.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Vitality\",\"2% of vitality is converted to healing power.\",\"+30 Vitality\",\"3% of vitality is converted to precision.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Exuberance\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44953() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of Exuberance\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Masterwork\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":44953,\"icon\":\"https://render.guildwars2.com/file/C3E82DAE35CCCE9CAAB9DEA2B047E0290F0EC778/619712.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Vitality\",\"1% of vitality is converted to healing power.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Exuberance\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44954() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of Tormenting\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Masterwork\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":44954,\"icon\":\"https://render.guildwars2.com/file/130C622C3AAF42F30312DD6CBB2F39A5574FA411/619713.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Condition Damage\",\"+4% Torment Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Tormenting\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44955() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of Tormenting\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Rare\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":44955,\"icon\":\"https://render.guildwars2.com/file/B02ED24F950F615DD79DC9056D5C2C78A6B95A57/619714.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Condition Damage\",\"+6% Torment Duration\",\"+30 Condition Damage\",\"+9% Torment Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Tormenting\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44956() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of Tormenting\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":44956,\"icon\":\"https://render.guildwars2.com/file/F8BC046221EA49EB3D349B5D3C50DDF33213D8B3/619715.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Condition Damage\",\"+10% Torment Duration\",\"+50 Condition Damage\",\"+15% Torment Duration\",\"+100 Condition Damage\",\"+20% torment duration; when you use a heal skill, apply two stacks of torment to nearby foes. <c=@reminder>(Cooldown: 20s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Tormenting\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44957() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of Perplexity\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":44957,\"icon\":\"https://render.guildwars2.com/file/F67A922A4624470EBAD493920DC1EE2616769E9D/619716.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Condition Damage\",\"+10% Confusion Duration\",\"+50 Condition Damage\",\"25% chance when struck to inflict 3 stacks of confusion for 5 seconds. <c=@reminder>(Cooldown: 25 Seconds)</c>\",\"+100 Condition Damage\",\"+20% confusion duration; when you interrupt a foe, cause 5 stacks of confusion for 8 seconds. <c=@reminder>(Cooldown: 15s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Perplexity\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44958() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of Perplexity\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Rare\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":44958,\"icon\":\"https://render.guildwars2.com/file/C9EE974805056E33E274A7300BB8A65CC66EECE0/619717.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Condition Damage\",\"+6% Confusion Duration\",\"+30 Condition Damage\",\"15% chance when struck to inflict 3 stacks of confusion for 5 seconds. <c=@reminder>(Cooldown: 25 Seconds)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Perplexity\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem44959() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of Perplexity\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Masterwork\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":44959,\"icon\":\"https://render.guildwars2.com/file/13E6EFBC38DF95C6F62D0BBB55B8BC63C29BA806/619718.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Condition Damage\",\"+4% Confusion Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Perplexity\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45001() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Queen Jennah\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":100,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45001,\"icon\":\"https://render.guildwars2.com/file/203CEDF1FD17B3BAB99A244DAC49FD5C4838B60C/625610.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45002() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"First Birthday Gift\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":100,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":45002,\"icon\":\"https://render.guildwars2.com/file/5C759EC1C95F3BE53C167A7D9F0D27BF3AE56277/625611.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}