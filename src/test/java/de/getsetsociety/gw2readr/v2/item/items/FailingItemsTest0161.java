package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0161 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem37111() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bagh Nakh (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37111,\"icon\":\"https://render.guildwars2.com/file/4F9F6F2DE6C6726A593C231BA00510BE347304F0/511832.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]},{\"flags\":[],\"item_id\":49428}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15756,\"description\":\"+32 Power\n+18 Ferocity\n+18 Vitality\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":71},{\"attribute\":\"Precision\",\"modifier\":50},{\"attribute\":\"CritDamage\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37112() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Yakkington's Ring (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37112,\"icon\":\"https://render.guildwars2.com/file/57CC444123E8D75AF9AE19FC0DA961911E0A04B2/511824.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]},{\"flags\":[],\"item_id\":49428}],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37113() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Snaff's Gyre (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37113,\"icon\":\"https://render.guildwars2.com/file/2807D67190AF5ADC1618B9135678EF3F0CA6ED61/511833.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]},{\"flags\":[],\"item_id\":49428}],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37123() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Healing Infusion\",\"description\":\"Double-click to apply to an unused defensive infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":37123,\"icon\":\"https://render.guildwars2.com/file/79FB4479F4A0E9DB923E48CAB1F777F8F70B974F/511834.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[\"Defense\"],\"infix_upgrade\":{\"buff\":{\"skill_id\":15738,\"description\":\"+5 Healing\n+5 Agony Resistance\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37125() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Versatile Healing Infusion\",\"description\":\"Double-click to apply to an unused infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":37125,\"icon\":\"https://render.guildwars2.com/file/F4DC0A52220F32D708D574D4E7AC322299FD4754/511836.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[\"Defense\",\"Offense\",\"Utility\"],\"infix_upgrade\":{\"buff\":{\"skill_id\":15738,\"description\":\"+5 Healing\n+5 Agony Resistance\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37127() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mighty Infusion\",\"description\":\"Double-click to apply to an unused offensive infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":37127,\"icon\":\"https://render.guildwars2.com/file/AE7C224D02E7F16F19FAFAE1CC50B80E5DC80214/511838.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[\"Offense\"],\"infix_upgrade\":{\"buff\":{\"skill_id\":15735,\"description\":\"+5 Power\n+5 Agony Resistance\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37128() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Precise Infusion\",\"description\":\"Double-click to apply to an unused offensive infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":37128,\"icon\":\"https://render.guildwars2.com/file/C605E2EF280B5E4CF9A249E80AB3053843C5EBE3/511839.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[\"Offense\"],\"infix_upgrade\":{\"buff\":{\"skill_id\":15736,\"description\":\"+5 Precision\n+5 Agony Resistance\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37129() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Malign Infusion\",\"description\":\"Double-click to apply to an unused offensive infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":37129,\"icon\":\"https://render.guildwars2.com/file/9A137B0106F9DE9A044596FE95C20D072CA093F3/511840.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[\"Offense\"],\"infix_upgrade\":{\"buff\":{\"skill_id\":15737,\"description\":\"+5 Condition Damage\n+5 Agony Resistance\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37130() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Versatile Malign Infusion\",\"description\":\"Double-click to apply to an unused infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":37130,\"icon\":\"https://render.guildwars2.com/file/0C2C363F1A73653E6EFA35B0787880F9F19FBD53/511841.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[\"Defense\",\"Offense\",\"Utility\"],\"infix_upgrade\":{\"buff\":{\"skill_id\":15737,\"description\":\"+5 Condition Damage\n+5 Agony Resistance\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37131() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Versatile Mighty Infusion\",\"description\":\"Double-click to apply to an unused infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":37131,\"icon\":\"https://render.guildwars2.com/file/F01F780FFAF267D5B9D593EE0402C9CACFF0A90D/511842.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[\"Defense\",\"Offense\",\"Utility\"],\"infix_upgrade\":{\"buff\":{\"skill_id\":15735,\"description\":\"+5 Power\n+5 Agony Resistance\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37132() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Versatile Precise Infusion\",\"description\":\"Double-click to apply to an unused infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":37132,\"icon\":\"https://render.guildwars2.com/file/0750303A4CCEA20E0915BB7FF9CABFFCA0CA2799/511843.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[\"Defense\",\"Offense\",\"Utility\"],\"infix_upgrade\":{\"buff\":{\"skill_id\":15736,\"description\":\"+5 Precision\n+5 Agony Resistance\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37133() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Resilient Infusion\",\"description\":\"Double-click to apply to an unused defensive infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":37133,\"icon\":\"https://render.guildwars2.com/file/4DF43AFD06A460A19C90B011D3157BA969AD21CE/511844.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[\"Defense\"],\"infix_upgrade\":{\"buff\":{\"skill_id\":15748,\"description\":\"+5 Toughness\n+5 Agony Resistance\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37134() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vital Infusion\",\"description\":\"Double-click to apply to an unused defensive infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":37134,\"icon\":\"https://render.guildwars2.com/file/66EC922E1AA5340FB5A63D997D92655775B524AA/511845.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[\"Defense\",\"Utility\"],\"infix_upgrade\":{\"buff\":{\"skill_id\":15747,\"description\":\"+5 Vitality\n+5 Agony Resistance\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37135() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Versatile Resilient Infusion\",\"description\":\"Double-click to apply to an unused infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":37135,\"icon\":\"https://render.guildwars2.com/file/D30D629DFA77550B9751AB48B9FCE99D40E056C8/511846.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[\"Defense\",\"Offense\",\"Utility\"],\"infix_upgrade\":{\"buff\":{\"skill_id\":15748,\"description\":\"+5 Toughness\n+5 Agony Resistance\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37136() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Versatile Vital Infusion\",\"description\":\"Double-click to apply to an unused infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":37136,\"icon\":\"https://render.guildwars2.com/file/2990C60568B16D1FC23E602B94D8173B3C6F39C3/511847.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[\"Defense\",\"Offense\",\"Utility\"],\"infix_upgrade\":{\"buff\":{\"skill_id\":15747,\"description\":\"+5 Vitality\n+5 Agony Resistance\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37138() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Versatile Simple Infusion\",\"description\":\"Double-click to apply to an unused infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":37138,\"icon\":\"https://render.guildwars2.com/file/B4DBD92E63C8B924D0FE00F20AA1E9CE3F1C2436/511849.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[\"Defense\",\"Offense\",\"Utility\"],\"infix_upgrade\":{\"buff\":{\"skill_id\":15760,\"description\":\"+5 Agony Resistance\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37140() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Versatile Bounteous Infusion\",\"description\":\"Double-click to apply to an unused defensive infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":37140,\"icon\":\"https://render.guildwars2.com/file/9DEA012C290DEFD21ED1986CDD0EE4F3DBA0486C/511851.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[\"Defense\",\"Offense\",\"Utility\"],\"infix_upgrade\":{\"buff\":{\"skill_id\":15761,\"description\":\"+1% Boon Duration\n+5 Agony Resistance\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37156() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Captain's Council Commendation\",\"description\":\"Bring your commendations to Lionguard Lyns in the Grand Piazza.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":37156,\"icon\":\"https://render.guildwars2.com/file/3DB0B4F6B36DEA435B022360334F051118484572/511853.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37157() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Donation Packaging\",\"description\":\"Give Zommoros armor, weapons, trinkets, food, wood planks, or metal ingots to receive a Captain's Council Commendation.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":37157,\"icon\":\"https://render.guildwars2.com/file/93F03B3C725542CCB220C0B56A662A32CA135197/222612.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37174() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Apothecary's Silk Insignia\",\"description\":\"Used in the crafting of armor with +Healing Power, +Toughness, and +Condition Damage.\",\"type\":\"CraftingMaterial\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":37174,\"icon\":\"https://render.guildwars2.com/file/E6D6CF06E637982EACFDC028B23B4E5FDFC82A79/511857.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37175() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Apothecary's Embroidered Silk Insignia\",\"description\":\"Used in the crafting of armor with +Healing Power, +Toughness, and +Condition Damage.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":37175,\"icon\":\"https://render.guildwars2.com/file/78431AAE5F590AEA015554F15D56A44123F67A11/511858.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37176() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Apothecary's Intricate Silk Insignia\",\"description\":\"Used in the crafting of armor with +Healing Power, +Toughness, and +Condition Damage.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":37176,\"icon\":\"https://render.guildwars2.com/file/78089E07A5211A3E027B05C0570E4E35763C159E/511859.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37177() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Apothecary's Intricate Gossamer Insignia\",\"description\":\"Used in the crafting of armor with +Healing Power, +Toughness, and +Condition Damage.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":37177,\"icon\":\"https://render.guildwars2.com/file/43409BD9CDABE31DAC3931680EBC99FA4CDBDAAE/511860.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37178() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Apothecary's Elder Inscription\",\"description\":\"Used in the crafting of weapons with +Healing Power, +Toughness, and +Condition Damage.\",\"type\":\"CraftingMaterial\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":37178,\"icon\":\"https://render.guildwars2.com/file/B44A803CBA91A3D39D373C1B52F4FA7AFDBA1875/511861.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37179() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Apothecary's Mithril Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Healing Power, +Toughness, and +Condition Damage.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":37179,\"icon\":\"https://render.guildwars2.com/file/0A4C7CFAD1C9E7F6989E0523CA18F564650117A2/511862.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}