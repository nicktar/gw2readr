package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0146 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem24779() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of Grenth\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24779,\"icon\":\"https://render.guildwars2.com/file/5930FE034AD9067EC7DF633C683927EB4A0F509F/220706.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Condition Damage\",\"+10% Chill Duration\",\"+50 Condition Damage\",\"25% chance when struck to cause chill for 3 seconds. <c=@reminder>(Cooldown: 30s)</c>\",\"+100 Condition Damage\",\"+20% chill duration; when you use a healing skill nearby foes are chilled for 3 seconds. <c=@reminder>Cooldown: 10s</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Grenth\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24780() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Privateer\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24780,\"icon\":\"https://render.guildwars2.com/file/1B9E351EC6B6C4422B41619A062667166DE6ACD7/221109.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Power\",\"+4% Might Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Privateer\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24781() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Privateer\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24781,\"icon\":\"https://render.guildwars2.com/file/3F0C3BD876779B6AEDC2A5DD0508A5794A5F4951/221110.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Power\",\"+6% Might Duration\",\"+30 Power\",\"15% chance when struck to shout \\\"Yarr\\\" and grant 3 stacks of might to nearby allies for 10 seconds. <c=@reminder>(Cooldown: 20s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Privateer\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24782() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Privateer\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24782,\"icon\":\"https://render.guildwars2.com/file/1C2095ADECD26F212D0F6C47BCCF5B7848B347CF/220718.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Power\",\"+10% Might Duration\",\"+50 Power\",\"25% chance when struck to shout \\\"Yarr\\\" and grant 3 stacks of might to nearby allies for 10 seconds. <c=@reminder>(Cooldown: 20s)</c>\",\"+100 Power\",\"50% chance to summon a parrot. <c=@reminder>Cooldown: 60s </c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Privateer\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24783() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Golemancer\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":24783,\"icon\":\"https://render.guildwars2.com/file/A2B901BDFC2C0A34AAECEEAC4CA6ECCDB73466B1/221111.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Ferocity\",\"+14 Precision\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Golemancer\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24784() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Golemancer\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":24784,\"icon\":\"https://render.guildwars2.com/file/01975DC1C81FB31E08EE04533C800E04330B74A8/221112.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Ferocity\",\"+21 Precision\",\"+30 Ferocity\",\"+39 Precision\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Golemancer\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24785() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Golemancer\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":24785,\"icon\":\"https://render.guildwars2.com/file/EB4F765E36EC9CF57526789A3EAB6702110D0949/220705.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Ferocity\",\"+35 Precision\",\"+50 Ferocity\",\"+65 Precision\",\"+100 Ferocity\",\"50% chance when struck to summon a golem. <c=@reminder>(Cooldown: 90s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Golemancer\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24786() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Centaur\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24786,\"icon\":\"https://render.guildwars2.com/file/BBB394450B1A613BA04449091FD0CF08C5B71DF3/221113.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Power\",\"+4% Swiftness Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Centaur\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24787() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Centaur\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24787,\"icon\":\"https://render.guildwars2.com/file/D3B7305A3F7A63FDFAA306F4B1DEDDA3EB0ADEA8/221114.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Power\",\"+6% Swiftness Duration\",\"+30 Power\",\"-30% Incoming Cripple Duration.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Centaur\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24788() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Centaur\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24788,\"icon\":\"https://render.guildwars2.com/file/37FB0225B2DE715BCB25B02D2914F35DBB080708/220695.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Power\",\"+10% Swiftness Duration\",\"+50 Power\",\"-50% Incoming Cripple Duration\",\"+100 Power\",\"+20% swiftness duration; when you use a heal skill, you and all nearby allies gain swiftness for 10 seconds. <c=@reminder>(Cooldown: 10s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Centaur\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24789() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Wurm\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24789,\"icon\":\"https://render.guildwars2.com/file/9B9C52779CE457967ADDA3B926423F4471486A05/221115.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Vitality\",\"+14 Ferocity\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Wurm\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24790() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Wurm\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24790,\"icon\":\"https://render.guildwars2.com/file/DDE5AD3902753361664FC94013DBE493B2C65202/221116.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Vitality\",\"+21 Ferocity\",\"+30 Vitality\",\"+39 Ferocity\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Wurm\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24791() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Wurm\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24791,\"icon\":\"https://render.guildwars2.com/file/D0076C2606409FD9AE49C562DD963B7B48B90136/220725.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Vitality\",\"+35 Ferocity\",\"+50 Vitality\",\"+65 Ferocity\",\"+100 Vitality\",\"7% of vitality is converted to ferocity.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Wurm\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24792() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of Svanir\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24792,\"icon\":\"https://render.guildwars2.com/file/E7F20D7A2374A0F819041BC9590466A3F7343B03/221117.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Toughness\",\"+4% Chill Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Svanir\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24793() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of Svanir\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24793,\"icon\":\"https://render.guildwars2.com/file/34911F65259C75D6BD0624340D6AFFB39CA895A0/221118.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Toughness\",\"+6% Chill Duration\",\"+30 Toughness\",\"-30% Incoming Chill Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Svanir\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24794() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of Svanir\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24794,\"icon\":\"https://render.guildwars2.com/file/65EA9C9AA55EF137657B65CA18EC98581B54DC0F/220721.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Toughness\",\"+10% Chill Duration\",\"+50 Toughness\",\"-50% Incoming Chill Duration\",\"+100 Toughness\",\"+20% chill duration; when you're struck below 20% health become a block of ice for 5 seconds. <c=@reminder>(Cooldown: 90s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Svanir\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24795() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Flame Legion\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24795,\"icon\":\"https://render.guildwars2.com/file/996BFF9344F72DD4269F324C056BB0E0FBD2E414/221119.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Power\",\"+4% Burning Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Flame Legion\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24796() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Flame Legion\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24796,\"icon\":\"https://render.guildwars2.com/file/60B7099FF1AE75359F6AE6AF9AA6EDC32511DA3C/221120.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Power\",\"+6% Burning Duration\",\"+30 Power\",\"15% chance to cause burning for 1 second when hit. <c=@reminder>(Cooldown: 10s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Flame Legion\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24797() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Flame Legion\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24797,\"icon\":\"https://render.guildwars2.com/file/776392A017E4DA16BF3DCA69292BB31ABA998010/220703.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Power\",\"+10% Burning Duration\",\"+50 Power\",\"25% chance to cause burning for 1s when hit. <c=@reminder>(Cooldown: 10s)</c>\",\"+100 Power\",\"+20% burning duration; +7% damage against burning foes.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Flame Legion\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24798() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Elementalist\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24798,\"icon\":\"https://render.guildwars2.com/file/7201CDC5A0FB519ECFC21C0CDBC63DED440C49A4/221121.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Power\",\"+14 Condition Damage\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Elementalist\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24799() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Elementalist\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24799,\"icon\":\"https://render.guildwars2.com/file/50C8C1AC0926099273CEC60E9DF2FE7808FA3CF0/221122.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Power\",\"+21 Condition Damage\",\"+30 Power\",\"+39 Condition Damage\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Elementalist\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24800() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Elementalist\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24800,\"icon\":\"https://render.guildwars2.com/file/F321ABCA3954145A4A17046D6170767740674866/220730.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Power\",\"+35 Condition Damage\",\"+50 Power\",\"+65 Condition Damage\",\"+100 Power\",\"+20% Burning Duration; +20% Chill Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Elementalist\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24801() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Mesmer\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24801,\"icon\":\"https://render.guildwars2.com/file/66BDF9379C39466D2B9F4152FC401143C9CB804D/221123.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Power\",\"+14 Precision\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Mesmer\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24802() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Mesmer\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24802,\"icon\":\"https://render.guildwars2.com/file/73F2B9B551BDD6E1F8309020725B640A25EF0B1A/221124.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Power\",\"+21 Precision\",\"+30 Power\",\"+39 Precision\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Mesmer\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24803() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Mesmer\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24803,\"icon\":\"https://render.guildwars2.com/file/D4099559DA2558F9B172EFB306EE0C942193B66F/220727.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Power\",\"+35 Precision\",\"+50 Power\",\"+65 Precision\",\"+100 Power\",\"+33% Daze Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Mesmer\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}