package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0144 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem24729() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of Hoelbrak\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24729,\"icon\":\"https://render.guildwars2.com/file/150204B4552ED82CD15204ACC7360198F51F6C13/220708.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Power\",\"+10% Might Duration\",\"+50 Power\",\"25% chance when struck to gain might for 10s. <c=@reminder>(Cooldown: 5s)</c>\",\"+100 Power\",\"+20% might duration; -20% condition duration applied to you.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Hoelbrak\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24730() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of Divinity\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24730,\"icon\":\"https://render.guildwars2.com/file/37FDB69F2F0B6B7AB09031C830B8C2680B684217/221077.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+3 to all stats\",\"+4 to All Stats\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Divinity\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24731() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of Divinity\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24731,\"icon\":\"https://render.guildwars2.com/file/180B220095B0529703B17BD928BFFAE62B435B99/221078.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+5 to all stats\",\"+6 to All Stats\",\"+7 to All Stats\",\"+8 to All Stats\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Divinity\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24732() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of Divinity\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24732,\"icon\":\"https://render.guildwars2.com/file/7431F5E2780106172D4A97C863D80BDAAC681FBF/220697.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+8 to All Stats\",\"+10 to all stats\",\"+12 to All Stats\",\"+14 to All Stats\",\"+16 to All Stats\",\"+18 to All Stats\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Divinity\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24733() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Grove\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24733,\"icon\":\"https://render.guildwars2.com/file/C4FC74F5CED7E2617BF077112E486AFB910F7409/221079.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Healing\",\"+4% Protection Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Grove\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24734() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Grove\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24734,\"icon\":\"https://render.guildwars2.com/file/FC593CD611461F0C5AD600313ADC4A67DFD4C118/221054.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Healing\",\"+6% Protection Duration\",\"+30 Healing\",\"15% chance when struck to gain protection for 4 seconds. <c=@reminder>(Cooldown: 30s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Grove\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24735() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Grove\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24735,\"icon\":\"https://render.guildwars2.com/file/1A4B11313EA4B3076232AAA10D0F2F62A50A6179/220707.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Healing\",\"+10% Protection Duration\",\"+50 Healing\",\"25% chance when struck to gain protection for 4 seconds. <c=@reminder>(Cooldown: 30s)</c>\",\"+100 Healing\",\"+20% protection duration; 50% chance when struck to root the attacking foe. <c=@reminder>(Cooldown: 90s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Grove\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24736() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of Scavenging\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24736,\"icon\":\"https://render.guildwars2.com/file/AA3AF67FAE0FEE05EE0357B8C0DA7DB05CF69CB6/221080.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Condition Damage\",\"10% chance when struck to cause your next attack to steal life. <c=@reminder>(Cooldown: 25s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Scavenging\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24737() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of Scavenging\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24737,\"icon\":\"https://render.guildwars2.com/file/07D40C246503D3E71AC8CC0F3A729973031EF170/221081.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Condition Damage\",\"15% chance when struck to cause your next attack to steal life. <c=@reminder>(Cooldown: 25s)</c>\",\"+30 Condition Damage\",\"After using your healing skill, your next attack skill steals health. <c=@reminder>(Cooldown: 10s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Scavenging\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24738() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of Scavenging\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24738,\"icon\":\"https://render.guildwars2.com/file/C9BEBEB9D8ADA51C1D9DEB67A3C079B5037E9833/221082.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Condition Damage\",\"25% chance when struck to cause your next attack to steal life. <c=@reminder>(Cooldown: 25s)</c>\",\"+50 Condition Damage\",\"After using your healing skill, your next attack skill steals health. <c=@reminder>(Cooldown: 10s)</c>\",\"+100 Condition Damage\",\"7% of vitality is converted to condition damage.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Scavenging\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24739() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Citadel\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24739,\"icon\":\"https://render.guildwars2.com/file/D4EFA21D1AE400414926D605ED38F0BB0EC64100/221083.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Power\",\"+4% Fury Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Citadel\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24740() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Citadel\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24740,\"icon\":\"https://render.guildwars2.com/file/CD0D015F43E455EA3D341DE27AD9A035A503C408/221084.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Power\",\"+6% Fury Duration\",\"+30 Power\",\"15% chance when struck to gain fury for 15 seconds. <c=@reminder>(Cooldown: 30s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Citadel\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24741() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Citadel\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24741,\"icon\":\"https://render.guildwars2.com/file/2647384A4CFBDA013F974944C501E19D092B37A8/220696.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Power\",\"+10% Fury Duration\",\"+50 Power\",\"25% chance when struck to gain fury for 15s. <c=@reminder>(Cooldown: 30s)</c>\",\"+100 Power\",\"20% fury duration; 50% chance when struck to summon a bomb. <c=@reminder>(Cooldown: 15s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Citadel\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24742() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Earth\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24742,\"icon\":\"https://render.guildwars2.com/file/105BEB076265E3AB434D05E80D6C5B3524C251B8/221085.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Toughness\",\"+4% Protection Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Earth\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24743() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Earth\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24743,\"icon\":\"https://render.guildwars2.com/file/44D423DB2A94017CE208BB99967FB89371081213/221086.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Toughness\",\"+6% Protection Duration\",\"+30 Toughness\",\"15% chance when struck to gain protection for 4 seconds. <c=@reminder>(Cooldown: 30s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Earth\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24744() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Earth\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24744,\"icon\":\"https://render.guildwars2.com/file/93A53AB1F304354ED1981AB465BCDD51B2F4D857/220701.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Toughness\",\"+10% Protection Duration\",\"+50 Toughness\",\"25% chance when struck to gain protection for 4 seconds. <c=@reminder>(Cooldown: 30s)</c>\",\"+100 Toughness\",\"+20% protection duration; when struck below 20% health you gain a magnetic aura for 5 seconds. <c=@reminder>(Cooldown: 90s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Earth\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24745() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Fire\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24745,\"icon\":\"https://render.guildwars2.com/file/ECD5C90BE62709F37CFBDB4B09ADAFAA5F3F94A4/221087.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Power\",\"+4% Might Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Fire\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24746() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Fire\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24746,\"icon\":\"https://render.guildwars2.com/file/F67ED111FF4DCCE50C1102080C92371577FB364D/221088.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Power\",\"+6% Might Duration\",\"+30 Power\",\"15% chance when struck to gain might for 10 seconds. <c=@reminder>(Cooldown: 5s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Fire\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24747() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Fire\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24747,\"icon\":\"https://render.guildwars2.com/file/6967534DA6E09150241DC411B0F4A4B415520FF7/220702.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Power\",\"+10% Might Duration\",\"+50 Power\",\"25% chance when struck to gain might for 10s. <c=@reminder>(Cooldown: 5s)</c>\",\"+100 Power\",\"+20% burning duration; when struck below 80% health you gain a fire aura for 5s. <c=@reminder>(Cooldown: 60s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Fire\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24748() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Air\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24748,\"icon\":\"https://render.guildwars2.com/file/B94E38CBC5B5BD10E79B35C40F6D59ACF358C493/221089.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Ferocity\",\"+4% Swiftness Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Air\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24749() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Air\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24749,\"icon\":\"https://render.guildwars2.com/file/14761994A9B03C644D92B171E523BEA5EE0BF9E7/221090.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Ferocity\",\"+6% Swiftness Duration\",\"+30 Ferocity\",\"When you use a heal skill you gain swiftness for 3 seconds. <c=@reminder>(Cooldown: 10s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Air\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24750() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Air\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24750,\"icon\":\"https://render.guildwars2.com/file/0A0CF1DD44A26CCC6BF9ADEE623DCED5070901BB/220693.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Ferocity\",\"+10% Swiftness Duration\",\"+50 Ferocity\",\"When you use a heal skill you gain swiftness for 5 seconds. <c=@reminder>(Cooldown: 10s)</c>\",\"+100 Ferocity\",\"+20% swiftness duration; 50% chance when struck  to hit the foe with a lightning strike. <c=@reminder>(Cooldown: 20s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Air\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24751() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Ice\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24751,\"icon\":\"https://render.guildwars2.com/file/3B046CA10C0271EB96B42E232999542FF2372B7E/221091.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Vitality\",\"+4% Chill Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Ice\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24752() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Ice\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24752,\"icon\":\"https://render.guildwars2.com/file/034B1CA4A91154AE59F3AA6BDD029EB43A9CA6CB/221092.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Vitality\",\"+6% Chill Duration\",\"+30 Vitality\",\"15% chance when struck to cause an ice nova. <c=@reminder>(Cooldown: 30s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Ice\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24753() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Ice\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24753,\"icon\":\"https://render.guildwars2.com/file/B34492445E5F38655FF49B7FB9EFD4DB03A37A90/220709.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Vitality\",\"+10% Chill Duration\",\"+50 Vitality\",\"25% chance when struck to cause an ice nova. <c=@reminder>(Cooldown: 30s)</c>\",\"+100 Vitality\",\"+20% chill duration; +7% damage against chilled foes.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Ice\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}