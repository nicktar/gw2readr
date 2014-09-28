package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0151 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem24904() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embellished Intricate Topaz Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":20,\"rarity\":\"Rare\",\"vendor_value\":72,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24904,\"icon\":\"https://render.guildwars2.com/file/AAD2F8900D324C11231927C706033CBE44247B68/340640.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":310,\"description\":\"+8 Condition Damage\n+4 Precision\"},\"attributes\":[]},\"suffix\":\"of Topaz\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24905() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embellished Gilded Amethyst Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":102,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24905,\"icon\":\"https://render.guildwars2.com/file/E4FCE70BA66E4CE25BD56DBA0AEBA92FB1EF770F/340641.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":319,\"description\":\"+10 Power\n+8 Vitality\"},\"attributes\":[]},\"suffix\":\"of Amethyst\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24906() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embellished Gilded Carnelian Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":102,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24906,\"icon\":\"https://render.guildwars2.com/file/08B84CCB62A0D66016951AF139C926EA17992BE5/340642.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":320,\"description\":\"+10 Power\n+8 Precision\"},\"attributes\":[]},\"suffix\":\"of Carnelian\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24907() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embellished Gilded Lapis Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":102,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24907,\"icon\":\"https://render.guildwars2.com/file/49E37FA7C052AF2C91DEDDA2CDF33FF9C4C3E97A/340643.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":321,\"description\":\"+10 Vitality\n+8 Toughness\"},\"attributes\":[]},\"suffix\":\"of Lapis\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24908() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embellished Gilded Peridot Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":102,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24908,\"icon\":\"https://render.guildwars2.com/file/8076E5F203B6D86C6F7ED34864E45C6EDBDD0B03/340644.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":322,\"description\":\"+10 Power\n+8 Ferocity\"},\"attributes\":[]},\"suffix\":\"of Peridot\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24909() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embellished Gilded Spinel Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":102,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24909,\"icon\":\"https://render.guildwars2.com/file/3250023BC455F3540102FAC875779148B89F0A7D/340645.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":318,\"description\":\"+10 Healing\n+8 Power\"},\"attributes\":[]},\"suffix\":\"of Spinel\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24910() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embellished Gilded Sunstone Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":102,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24910,\"icon\":\"https://render.guildwars2.com/file/0B62AEB73DBFE7226679EDD2534E57EB2B27313B/340646.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":323,\"description\":\"+10 Precision\n+8 Power\"},\"attributes\":[]},\"suffix\":\"of Sunstone\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24911() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embellished Gilded Topaz Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":102,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24911,\"icon\":\"https://render.guildwars2.com/file/0C6346B00DA6BA50EEAC1DA9A2B8A3CA0668C440/340647.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":317,\"description\":\"+10 Condition Damage\n+8 Precision\"},\"attributes\":[]},\"suffix\":\"of Topaz\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24912() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embellished Ornate Beryl Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":135,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24912,\"icon\":\"https://render.guildwars2.com/file/9148AE6070A6E715E3E548A1370302517347BAA8/340648.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":328,\"description\":\"+16 Power\n+10 Ferocity\n+10 Vitality\"},\"attributes\":[]},\"suffix\":\"of Beryl\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24913() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embellished Ornate Chrysocola Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":135,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24913,\"icon\":\"https://render.guildwars2.com/file/BDEDA235B223FF924EDF5FEA07CD61FF2DAC02A6/340649.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":324,\"description\":\"+16 Condition Damage\n+10 Power\n+10 Vitality\"},\"attributes\":[]},\"suffix\":\"of Chrysocola\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24914() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embellished Ornate Coral Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":135,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24914,\"icon\":\"https://render.guildwars2.com/file/59BD35FE19796C48004E5A5D25DD42B3D0A85757/340650.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":329,\"description\":\"+16 Precision\n+10 Condition Damage\n+10 Power\"},\"attributes\":[]},\"suffix\":\"of Coral\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24915() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embellished Ornate Emerald Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":135,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24915,\"icon\":\"https://render.guildwars2.com/file/5FC92B701040227E0E33DE1EB69E239CB172407D/340651.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":330,\"description\":\"+16 Precision\n+10 Toughness\n+10 Power\"},\"attributes\":[]},\"suffix\":\"of Emerald\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24916() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embellished Ornate Opal Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":135,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24916,\"icon\":\"https://render.guildwars2.com/file/EDBEE76DD364D6CE7F05C79A2895B56FF2D4AF0A/340652.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":326,\"description\":\"+16 Precision\n+10 Ferocity\n+10 Power\"},\"attributes\":[]},\"suffix\":\"of Opal\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24917() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embellished Ornate Ruby Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":135,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24917,\"icon\":\"https://render.guildwars2.com/file/F923A62371AE3A6C5DDAA751495A14730FBE0BE3/340653.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":327,\"description\":\"+16 Power\n+10 Ferocity\n+10 Precision\"},\"attributes\":[]},\"suffix\":\"of Ruby\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24918() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embellished Ornate Sapphire Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":135,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24918,\"icon\":\"https://render.guildwars2.com/file/C196803490DDE1070CDCFD2ECB0562FB6C1E7D0C/340654.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":325,\"description\":\"+16 Healing\n+10 Power\n+10 Toughness\"},\"attributes\":[]},\"suffix\":\"of Sapphire\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24919() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embellished Brilliant Beryl Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24919,\"icon\":\"https://render.guildwars2.com/file/0505F8A37408A5F1350A6B7A803E94AA089880F0/340655.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":335,\"description\":\"+21 Power\n+13 Ferocity\n+13 Vitality\"},\"attributes\":[]},\"suffix\":\"of Beryl\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24920() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embellished Brilliant Chrysocola Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24920,\"icon\":\"https://render.guildwars2.com/file/083E73E7730FDD7545520D436007D242B6535B5B/340656.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":331,\"description\":\"+21 Condition Damage\n+13 Power\n+13 Vitality\"},\"attributes\":[]},\"suffix\":\"of Chrysocola\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24921() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embellished Brilliant Coral Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24921,\"icon\":\"https://render.guildwars2.com/file/E3061AD00A2EDBF1C9AB5EB0AD3F2CB95DDFBCB3/340657.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":336,\"description\":\"+21 Precision\n+13 Condition Damage\n+13 Power\"},\"attributes\":[]},\"suffix\":\"of Coral\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24922() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embellished Brilliant Emerald Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24922,\"icon\":\"https://render.guildwars2.com/file/5CDBF832E3B4004E29456B28D5607B0DC8C80E6E/340658.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":337,\"description\":\"+21 Precision\n+13 Toughness\n+13 Power\"},\"attributes\":[]},\"suffix\":\"of Emerald\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24923() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embellished Brilliant Opal Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24923,\"icon\":\"https://render.guildwars2.com/file/6D7D745A169F789D14F85A134952B8233301D503/340659.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":333,\"description\":\"+21 Precision\n+13 Ferocity\n+13 Power\"},\"attributes\":[]},\"suffix\":\"of Opal\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24924() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embellished Brilliant Ruby Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24924,\"icon\":\"https://render.guildwars2.com/file/AF3AAF4AD50A09D0002DE409C2C77303D0F47867/340660.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":334,\"description\":\"+21 Power\n+13 Ferocity\n+13 Precision\"},\"attributes\":[]},\"suffix\":\"of Ruby\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24925() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embellished Brilliant Sapphire Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24925,\"icon\":\"https://render.guildwars2.com/file/C84FB26AA615465708F824054C1C51F09D7B1B6D/340661.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":332,\"description\":\"+21 Healing\n+13 Power\n+13 Toughness\"},\"attributes\":[]},\"suffix\":\"of Sapphire\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35511() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Top Half of the Mistwrought Key\",\"description\":\"Collect both halves to open the Mistwrought Vault.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":35511,\"icon\":\"https://render.guildwars2.com/file/7CD20D4B072AD23F97202F05E4130CF8A4B069C5/69116.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35512() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bottom Half of the Mistwrought Key\",\"description\":\"Collect both halves to open the Mistwrought Vault.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":35512,\"icon\":\"https://render.guildwars2.com/file/F7020A285FD7DF7190097D9A58660131C25CF20A/65797.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35516() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Rejuvenating Student Armor\",\"description\":\"Double-click to unpack a full set of level 30 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":35516,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}