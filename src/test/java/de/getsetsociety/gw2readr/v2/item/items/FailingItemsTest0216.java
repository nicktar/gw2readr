package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0216 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem49407() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bagh Nakh (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":49407,\"icon\":\"https://render.guildwars2.com/file/4F9F6F2DE6C6726A593C231BA00510BE347304F0/511832.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]},{\"flags\":[]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15756,\"description\":\"+32 Power\n+18 Ferocity\n+18 Vitality\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":71},{\"attribute\":\"Precision\",\"modifier\":50},{\"attribute\":\"CritDamage\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49408() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mellaggan's Whorl (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":49408,\"icon\":\"https://render.guildwars2.com/file/4AFA1C77379C26F10ADC37BA960C2DEC080725A7/511823.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]},{\"flags\":[]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15753,\"description\":\"+32 Healing\n+18 Condition Damage\n+18 Toughness\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":71},{\"attribute\":\"Precision\",\"modifier\":50},{\"attribute\":\"Toughness\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49409() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Seal of the Khan-Ur (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":49409,\"icon\":\"https://render.guildwars2.com/file/24F3597F9A7B386E629AE3C69F0E56780720A1ED/511831.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]},{\"flags\":[]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15753,\"description\":\"+32 Healing\n+18 Condition Damage\n+18 Toughness\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":71},{\"attribute\":\"Precision\",\"modifier\":50},{\"attribute\":\"Toughness\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49410() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Yakkington's Ring (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":49410,\"icon\":\"https://render.guildwars2.com/file/57CC444123E8D75AF9AE19FC0DA961911E0A04B2/511824.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]},{\"flags\":[]}],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49411() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Snaff's Gyre (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":49411,\"icon\":\"https://render.guildwars2.com/file/2807D67190AF5ADC1618B9135678EF3F0CA6ED61/511833.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]},{\"flags\":[]}],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49412() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lunaria, Circle of the Moon (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":49412,\"icon\":\"https://render.guildwars2.com/file/EFF8434DFE2B67026FA202091FD1F6ED2653E4A9/511819.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]},{\"flags\":[]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15751,\"description\":\"+13 Condition Damage\n+13 Precision\n+13 Toughness\n+13 Power\n+13 Vitality\n+13 Healing Power\n+13 Ferocity\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":33},{\"attribute\":\"Precision\",\"modifier\":33},{\"attribute\":\"Toughness\",\"modifier\":33},{\"attribute\":\"Vitality\",\"modifier\":33},{\"attribute\":\"Healing\",\"modifier\":33},{\"attribute\":\"ConditionDamage\",\"modifier\":33},{\"attribute\":\"CritDamage\",\"modifier\":33}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49413() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Solaria, Circle of the Sun (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":49413,\"icon\":\"https://render.guildwars2.com/file/7428E75D16DDDF12342B629B5A32311105EBD00F/511828.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]},{\"flags\":[]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15751,\"description\":\"+13 Condition Damage\n+13 Precision\n+13 Toughness\n+13 Power\n+13 Vitality\n+13 Healing Power\n+13 Ferocity\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":33},{\"attribute\":\"Precision\",\"modifier\":33},{\"attribute\":\"Toughness\",\"modifier\":33},{\"attribute\":\"Vitality\",\"modifier\":33},{\"attribute\":\"Healing\",\"modifier\":33},{\"attribute\":\"ConditionDamage\",\"modifier\":33},{\"attribute\":\"CritDamage\",\"modifier\":33}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49414() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Druid's Circle (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":49414,\"icon\":\"https://render.guildwars2.com/file/565A62A4C35466A35DD57BB53AD20B49467557AE/543916.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]},{\"flags\":[]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17073,\"description\":\"+32 Healing Power\n+18 Toughness\n+18 Power\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":71},{\"attribute\":\"Power\",\"modifier\":50},{\"attribute\":\"Toughness\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49415() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Healing Signet (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":49415,\"icon\":\"https://render.guildwars2.com/file/1528A3CFFC4BE66AC9D00FA10FEBA77D722F210C/543917.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]},{\"flags\":[]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17073,\"description\":\"+32 Healing Power\n+18 Toughness\n+18 Power\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":71},{\"attribute\":\"Power\",\"modifier\":50},{\"attribute\":\"Toughness\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49416() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ettinband (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":49416,\"icon\":\"https://render.guildwars2.com/file/0273056F7294E3CF08D8A45CA6BD374222720503/543918.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]},{\"flags\":[]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17074,\"description\":\"+32 Toughness\n+18 Power\n+18 Precision\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":71},{\"attribute\":\"Power\",\"modifier\":50},{\"attribute\":\"Precision\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49417() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ossa Family Signet Ring (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":49417,\"icon\":\"https://render.guildwars2.com/file/DCEF3552D4015213D806CED7633A7FB840CEE15B/543919.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]},{\"flags\":[]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17074,\"description\":\"+32 Toughness\n+18 Power\n+18 Precision\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":71},{\"attribute\":\"Power\",\"modifier\":50},{\"attribute\":\"Precision\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49418() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Barbed Signet (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":49418,\"icon\":\"https://render.guildwars2.com/file/CBFBD40394AC51F9DB4AFA054E51A2171A487AF8/543920.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]},{\"flags\":[]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17075,\"description\":\"+32 Precision\n+18 Power\n+18 Condition Damage\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":71},{\"attribute\":\"Power\",\"modifier\":50},{\"attribute\":\"ConditionDamage\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49419() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Palawa Joko's Finger Cuff (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":49419,\"icon\":\"https://render.guildwars2.com/file/196B03CE31642D45A8BEBBC79DC191217B005EA5/543921.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]},{\"flags\":[]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17075,\"description\":\"+32 Precision\n+18 Power\n+18 Condition Damage\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":71},{\"attribute\":\"Power\",\"modifier\":50},{\"attribute\":\"ConditionDamage\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49420() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lucce Seal (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":49420,\"icon\":\"https://render.guildwars2.com/file/B70636E414ED11E4E4599A95F9C24709763001E5/543922.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]},{\"flags\":[]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15753,\"description\":\"+32 Healing\n+18 Condition Damage\n+18 Toughness\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":71},{\"attribute\":\"Toughness\",\"modifier\":50},{\"attribute\":\"ConditionDamage\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49421() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Purge Signet (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":49421,\"icon\":\"https://render.guildwars2.com/file/D3CF347B560F0900E7723B38F5FA024FA2033E27/543923.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]},{\"flags\":[]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15753,\"description\":\"+32 Healing\n+18 Condition Damage\n+18 Toughness\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":71},{\"attribute\":\"Toughness\",\"modifier\":50},{\"attribute\":\"ConditionDamage\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49422() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Band of the Brotherhood (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":49422,\"icon\":\"https://render.guildwars2.com/file/D3340234F799E0DDF8FC48254B1EF16FAE69AB55/543924.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Defense\"]},{\"flags\":[]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17076,\"description\":\"+32 Precision\n+18 Toughness\n+18 Power\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":71},{\"attribute\":\"Power\",\"modifier\":50},{\"attribute\":\"Toughness\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49423() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cirque of Arah (Infused)\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":495,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":49423,\"icon\":\"https://render.guildwars2.com/file/EAF227BFCCD5491E0BED02285AE7CB924EE1CD7E/543925.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[{\"flags\":[\"Offense\"]},{\"flags\":[]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17076,\"description\":\"+32 Precision\n+18 Toughness\n+18 Power\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":71},{\"attribute\":\"Power\",\"modifier\":50},{\"attribute\":\"Toughness\",\"modifier\":50}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49424() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"+1 Agony Infusion\",\"description\":\"Double-click to apply to an unused agony-infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":49424,\"icon\":\"https://render.guildwars2.com/file/AE7C224D02E7F16F19FAFAE1CC50B80E5DC80214/511838.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":22100,\"description\":\"+1 Agony Resistance\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49425() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"+2 Agony Infusion\",\"description\":\"Double-click to apply to an unused agony-infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":49425,\"icon\":\"https://render.guildwars2.com/file/AE7C224D02E7F16F19FAFAE1CC50B80E5DC80214/511838.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":22101,\"description\":\"+2 Agony Resistance\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49426() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"+3 Agony Infusion\",\"description\":\"Double-click to apply to an unused agony-infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":49426,\"icon\":\"https://render.guildwars2.com/file/AE7C224D02E7F16F19FAFAE1CC50B80E5DC80214/511838.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":22102,\"description\":\"+3 Agony Resistance\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49427() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"+4 Agony Infusion\",\"description\":\"Double-click to apply to an unused agony-infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":49427,\"icon\":\"https://render.guildwars2.com/file/AE7C224D02E7F16F19FAFAE1CC50B80E5DC80214/511838.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":22103,\"description\":\"+4 Agony Resistance\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49428() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"+5 Agony Infusion\",\"description\":\"Double-click to apply to an unused agony-infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":49428,\"icon\":\"https://render.guildwars2.com/file/AE7C224D02E7F16F19FAFAE1CC50B80E5DC80214/511838.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":22104,\"description\":\"+5 Agony Resistance\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49429() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"+6 Agony Infusion\",\"description\":\"Double-click to apply to an unused agony-infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":49429,\"icon\":\"https://render.guildwars2.com/file/AE7C224D02E7F16F19FAFAE1CC50B80E5DC80214/511838.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":22105,\"description\":\"+6 Agony Resistance\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49430() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"+7 Agony Infusion\",\"description\":\"Double-click to apply to an unused agony-infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":49430,\"icon\":\"https://render.guildwars2.com/file/AE7C224D02E7F16F19FAFAE1CC50B80E5DC80214/511838.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":22106,\"description\":\"+7 Agony Resistance\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49431() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"+8 Agony Infusion\",\"description\":\"Double-click to apply to an unused agony-infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":49431,\"icon\":\"https://render.guildwars2.com/file/AE7C224D02E7F16F19FAFAE1CC50B80E5DC80214/511838.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":22107,\"description\":\"+8 Agony Resistance\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}