package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0143 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem24704() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of Infiltration\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24704,\"icon\":\"https://render.guildwars2.com/file/BE69A100DAD57E993253BE2CCA189377A5E33D72/221059.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+1% damage against foes with less than 50% health.\",\"+21 Precision\",\"+2% damage against foes with less than 50% health.\",\"+39 Precision\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Infiltration\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24705() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of Infiltration\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24705,\"icon\":\"https://render.guildwars2.com/file/77A09446A8DF044329F70D499F524BD22B01E3A7/221060.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+1% damage against foes with less than 50% health.\",\"+14 Precision\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Infiltration\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24706() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of Mercy\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24706,\"icon\":\"https://render.guildwars2.com/file/F80602571ED37E12EF0521F0FC947AB0D39CF70F/221061.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Toughness\",\"Gain up to 400 toughness while reviving an ally, based on your level.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Mercy\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24707() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of Mercy\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24707,\"icon\":\"https://render.guildwars2.com/file/769D6A2A4DDD1D666FB3012CE2560963015F9693/221062.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Toughness\",\"Gain up to 400 toughness while reviving an ally, based on your level.\",\"+30 Toughness\",\"You resurrect allies with 18% more health.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Mercy\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24708() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of Mercy\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24708,\"icon\":\"https://render.guildwars2.com/file/6866D3A85960F806E67C616E5709F97F0D025F02/220715.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Toughness\",\"Gain up to 400 toughness while reviving an ally, based on your level.\",\"+50 Toughness\",\"You resurrect allies with 30% more health.\",\"+100 Toughness\",\"You revive allied players 20% faster.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Mercy\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24709() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of Vampirism\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24709,\"icon\":\"https://render.guildwars2.com/file/A031C737D7A808F7037390FBF3F0F16364F244C9/221063.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Power\",\"6% chance when struck to cause your next attack to steal life. <c=@reminder>(Cooldown: 25s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Vampirism\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24710() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of Vampirism\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24710,\"icon\":\"https://render.guildwars2.com/file/18353AB79ED03D0D473D0E9D2B21B32533D6577E/221064.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Power\",\"9% chance when struck to cause your next attack to steal life. <c=@reminder>(Cooldown: 25s)</c>\",\"+30 Power\",\"Your next attack after using your heal skill steals some life.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Vampirism\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24711() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of Vampirism\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24711,\"icon\":\"https://render.guildwars2.com/file/F13EECC6AED473604A097A5DBB0861E3410702EF/220724.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Power\",\"15% chance when struck to cause your next attack to steal life. <c=@reminder>(Cooldown: 25s)</c>\",\"+50 Power\",\"After using your healing skill, your next attack skill steals health. <c=@reminder>(Cooldown: 10s)</c>\",\"+100 Power\",\"When struck below 20% health you become mist. <c=@reminder>(Cooldown: 60s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Vampirism\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24712() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of Strength\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24712,\"icon\":\"https://render.guildwars2.com/file/C834A95BDF012475585CE51F80B0E155613E9D02/221065.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Power\",\"+4% Might Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Strength\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24713() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of Strength\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24713,\"icon\":\"https://render.guildwars2.com/file/0E566697440608D7FA4096FD0F06DDAFF2A9B290/221066.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Power\",\"+6% Might Duration\",\"+30 Power\",\"+9% might duration; 15% chance when struck to gain might for 5 seconds. <c=@reminder>(Cooldown: 5s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Strength\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24714() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of Strength\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24714,\"icon\":\"https://render.guildwars2.com/file/F33F44776DFCB0D75B48005904E3C75456C4F5FA/220644.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Power\",\"+10% Might Duration\",\"+50 Power\",\"+15% might duration; 25% chance when struck to gain might for 5 seconds. <c=@reminder>(Cooldown: 5s)</c>\",\"+100 Power\",\"+20% might duration; +5% damage while under the effects of might.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Strength\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24715() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of Rage\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24715,\"icon\":\"https://render.guildwars2.com/file/096EAFD3D4D87EA17F0937B85001E44D20BD2216/221067.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Ferocity\",\"+4% Fury Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Rage\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24716() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of Rage\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24716,\"icon\":\"https://render.guildwars2.com/file/0CC327D309376221353C1199E80C0D145723F26F/221068.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Ferocity\",\"+6% Fury Duration\",\"+30 Ferocity\",\"15% chance when struck to gain fury for 15 seconds. <c=@reminder>(Cooldown: 30s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Rage\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24717() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of Rage\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24717,\"icon\":\"https://render.guildwars2.com/file/5F65FDA9D721B6BA5654E5ED29A42B01C04DF2DA/220719.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Ferocity\",\"+10% Fury Duration\",\"+50 Ferocity\",\"25% chance when struck to gain fury for 15 seconds. <c=@reminder>(Cooldown: 30s)</c>\",\"+100 Ferocity\",\"+20% fury duration; while under the effects of fury gain +5% damage.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Rage\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24718() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of Speed\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24718,\"icon\":\"https://render.guildwars2.com/file/AB0A0526902F293AB835BB0BB9EC9345742AC1F2/221069.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Vitality\",\"+4% Swiftness Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Speed\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24719() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of Speed\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24719,\"icon\":\"https://render.guildwars2.com/file/6946BB0F1FB8A1EA3D582CE4A043A85F93B36718/221070.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Vitality\",\"+6% Swiftness Duration\",\"+30 Vitality\",\"15% chance when struck to gain swiftness for 15 seconds. <c=@reminder>(Cooldown: 30s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Speed\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24720() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of Speed\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24720,\"icon\":\"https://render.guildwars2.com/file/1ED9421DC70174CA9BBC33075047381C3659C837/220722.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Vitality\",\"+10% Swiftness Duration\",\"+50 Vitality\",\"25% chance when struck to gain swiftness for 15 seconds. <c=@reminder>(Cooldown: 30s)</c>\",\"+100 Vitality\",\"+20% Swiftness Duration; +25% Movement Speed\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Speed\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24721() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Eagle\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24721,\"icon\":\"https://render.guildwars2.com/file/A46D7A04B79BC40141929FF9B1C2FAFA2A7F4025/221071.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Precision\",\"+14 Ferocity\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Eagle\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24722() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Eagle\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24722,\"icon\":\"https://render.guildwars2.com/file/B8565FC81408905306730C07E4311309D4F612F0/221072.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Precision\",\"+21 Ferocity\",\"+30 Precision\",\"+39 Ferocity\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Eagle\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24723() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Eagle\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24723,\"icon\":\"https://render.guildwars2.com/file/2966CB3D97E85EB0E4C33AFB6D1FB63D7304EC97/220700.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Precision\",\"+35 Ferocity\",\"+50 Precision\",\"+65 Ferocity\",\"+100 Precision\",\"+6% damage against targets with less than 50% health.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Eagle\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24724() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of Rata Sum\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24724,\"icon\":\"https://render.guildwars2.com/file/B72268073DB82060A15922915260335A950CD3FC/221073.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Precision\",\"+4% Poison Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Rata Sum\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24725() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of Rata Sum\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24725,\"icon\":\"https://render.guildwars2.com/file/4204FC47E0B47E9763592139431DB9B7C514C00B/221074.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Precision\",\"+6% Poison Duration\",\"+30 Precision\",\"+9% Weakness Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Rata Sum\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24726() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Rata Sum\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24726,\"icon\":\"https://render.guildwars2.com/file/1434C3CEC42A4F0D4861F013B899D9CBFE91E836/220720.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Precision\",\"+10% Poison Duration\",\"+50 Precision\",\"+15% Weakness Duration\",\"+100 Precision\",\"+20% poison duration; 50% chance when struck to summon a radiation field. <c=@reminder>(Cooldown: 90s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Rata Sum\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24727() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of Hoelbrak\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24727,\"icon\":\"https://render.guildwars2.com/file/1179C2C97DDDBAAE3F3E23493759F1010224CC09/221075.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Power\",\"+4% Might Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Hoelbrak\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24728() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of Hoelbrak\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24728,\"icon\":\"https://render.guildwars2.com/file/797FC80F676E93979BB20AF5F229AB0EB16E5260/221076.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Power\",\"+6% Might Duration\",\"+30 Power\",\"15% chance when struck to gain might for 10 seconds. <c=@reminder>(Cooldown: 5s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Hoelbrak\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}