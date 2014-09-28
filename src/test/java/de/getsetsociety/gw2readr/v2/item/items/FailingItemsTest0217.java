package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0217 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem49432() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"+9 Agony Infusion\",\"description\":\"Double-click to apply to an unused agony-infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":49432,\"icon\":\"https://render.guildwars2.com/file/AE7C224D02E7F16F19FAFAE1CC50B80E5DC80214/511838.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":22108,\"description\":\"+9 Agony Resistance\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49433() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"+10 Agony Infusion\",\"description\":\"Double-click to apply to an unused agony-infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":49433,\"icon\":\"https://render.guildwars2.com/file/AE7C224D02E7F16F19FAFAE1CC50B80E5DC80214/511838.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":22109,\"description\":\"+10 Agony Resistance\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49434() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"+11 Agony Infusion\",\"description\":\"Double-click to apply to an unused agony-infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":49434,\"icon\":\"https://render.guildwars2.com/file/AE7C224D02E7F16F19FAFAE1CC50B80E5DC80214/511838.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":22110,\"description\":\"+11 Agony Resistance\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49435() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"+12 Agony Infusion\",\"description\":\"Double-click to apply to an unused agony-infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":49435,\"icon\":\"https://render.guildwars2.com/file/AE7C224D02E7F16F19FAFAE1CC50B80E5DC80214/511838.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":22111,\"description\":\"+12 Agony Resistance\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49436() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"+13 Agony Infusion\",\"description\":\"Double-click to apply to an unused agony-infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":49436,\"icon\":\"https://render.guildwars2.com/file/AE7C224D02E7F16F19FAFAE1CC50B80E5DC80214/511838.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":22112,\"description\":\"+13 Agony Resistance\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49437() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"+14 Agony Infusion\",\"description\":\"Double-click to apply to an unused agony-infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":49437,\"icon\":\"https://render.guildwars2.com/file/AE7C224D02E7F16F19FAFAE1CC50B80E5DC80214/511838.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":22113,\"description\":\"+14 Agony Resistance\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49438() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"+15 Agony Infusion\",\"description\":\"Double-click to apply to an unused agony-infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":49438,\"icon\":\"https://render.guildwars2.com/file/AE7C224D02E7F16F19FAFAE1CC50B80E5DC80214/511838.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":22114,\"description\":\"+15 Agony Resistance\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49439() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"+16 Agony Infusion\",\"description\":\"Double-click to apply to an unused agony-infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":49439,\"icon\":\"https://render.guildwars2.com/file/AE7C224D02E7F16F19FAFAE1CC50B80E5DC80214/511838.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":22115,\"description\":\"+16 Agony Resistance\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49451() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"+28 Agony Infusion\",\"description\":\"Double-click to apply to an unused agony-infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":49451,\"icon\":\"https://render.guildwars2.com/file/AE7C224D02E7F16F19FAFAE1CC50B80E5DC80214/511838.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":22127,\"description\":\"+28 Agony Resistance\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49457() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Momentum\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":49457,\"icon\":\"https://render.guildwars2.com/file/391000777F63F2CA05FC015E0C990AD1FEB73526/681056.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":22141,\"description\":\"Gain a charge of +5 toughness each time you kill a foe, five if you kill an enemy player. <c=@reminder>(Max 25 stacks; ends on down.)</c> <br><c=@reminder>(Only one attribute-stacking sigil can be active at a time.)</c>\"},\"attributes\":[]},\"suffix\":\"of Momentum\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49460() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of Resistance\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":49460,\"icon\":\"https://render.guildwars2.com/file/585BF273BFCD9D12F462087A19FBD12DF755269A/681057.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Toughness\",\"-5% Incoming Condition Duration\",\"+50 Toughness\",\"-10% Incoming Condition Duration\",\"+100 Toughness\",\"When you activate a signet skill you gain aegis for 8 seconds. <c=@reminder>(Cooldown: 30s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Resistance\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49475() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chest\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":49475,\"icon\":\"https://render.guildwars2.com/file/666209104CCB024D53359C0EA0A299076E610771/65704.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49476() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Splendid Chest\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":49476,\"icon\":\"https://render.guildwars2.com/file/730A99AC6A69DD0F5352DAD56A91FC09D76F0D39/62860.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49483() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Recipe: Ascended Heavy Boots\",\"description\":\"Double-click and choose which Ascended Heavy Boots recipe to receive.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49483,\"icon\":\"https://render.guildwars2.com/file/162616E65F5D247791C12B0BA27442536637E1D8/631170.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49484() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Recipe: Ascended Heavy Coat\",\"description\":\"Double-click and choose which Ascended Heavy Coat recipe to receive.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49484,\"icon\":\"https://render.guildwars2.com/file/162616E65F5D247791C12B0BA27442536637E1D8/631170.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49485() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Recipe: Ascended Heavy Gloves\",\"description\":\"Double-click and choose which Ascended Heavy Gloves recipe to receive.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49485,\"icon\":\"https://render.guildwars2.com/file/162616E65F5D247791C12B0BA27442536637E1D8/631170.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49486() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Recipe: Ascended Heavy Helm\",\"description\":\"Double-click and choose which Ascended Heavy Helm recipe to receive.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49486,\"icon\":\"https://render.guildwars2.com/file/162616E65F5D247791C12B0BA27442536637E1D8/631170.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49487() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Recipe: Ascended Heavy Leggings\",\"description\":\"Double-click and choose which Ascended Heavy Leggings recipe to receive.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49487,\"icon\":\"https://render.guildwars2.com/file/162616E65F5D247791C12B0BA27442536637E1D8/631170.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49488() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Recipe: Ascended Heavy Shoulders\",\"description\":\"Double-click and choose which Ascended Heavy Shoulders recipe to receive.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49488,\"icon\":\"https://render.guildwars2.com/file/162616E65F5D247791C12B0BA27442536637E1D8/631170.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49489() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Recipe: Ascended Medium Boots\",\"description\":\"Double-click and choose which Ascended Medium Boots recipe to receive.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49489,\"icon\":\"https://render.guildwars2.com/file/162616E65F5D247791C12B0BA27442536637E1D8/631170.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49490() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Recipe: Ascended Medium Coat\",\"description\":\"Double-click and choose which Ascended Medium Coat recipe to receive.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49490,\"icon\":\"https://render.guildwars2.com/file/162616E65F5D247791C12B0BA27442536637E1D8/631170.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49491() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Recipe: Ascended Medium Gloves\",\"description\":\"Double-click and choose which Ascended Medium Gloves recipe to receive.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49491,\"icon\":\"https://render.guildwars2.com/file/162616E65F5D247791C12B0BA27442536637E1D8/631170.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49492() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Recipe: Ascended Medium Helm\",\"description\":\"Double-click and choose which Ascended Medium Helm recipe to receive.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49492,\"icon\":\"https://render.guildwars2.com/file/162616E65F5D247791C12B0BA27442536637E1D8/631170.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49493() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Recipe: Ascended Medium Leggings\",\"description\":\"Double-click and choose which Ascended Medium Leggings recipe to receive.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49493,\"icon\":\"https://render.guildwars2.com/file/162616E65F5D247791C12B0BA27442536637E1D8/631170.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49494() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Recipe: Ascended Medium Shoulders\",\"description\":\"Double-click and choose which Ascended Medium Shoulders recipe to receive.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49494,\"icon\":\"https://render.guildwars2.com/file/162616E65F5D247791C12B0BA27442536637E1D8/631170.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}