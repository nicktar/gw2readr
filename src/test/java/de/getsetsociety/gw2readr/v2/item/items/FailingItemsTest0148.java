package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0148 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem24829() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Adventurer\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24829,\"icon\":\"https://render.guildwars2.com/file/290D37585A38BE8004E7C9407719C6FCF766ACE0/221140.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Condition Damage\",\"+21 Power\",\"+30 Condition Damage\",\"+39 Power\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Adventure\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24830() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Adventurer\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24830,\"icon\":\"https://render.guildwars2.com/file/3C053CD2680D7DAE5E0899E8F6FF530D0E445704/221141.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Condition Damage\",\"+35 Power\",\"+50 Condition Damage\",\"+65 Power\",\"+100 Condition Damage\",\"When you use a heal skill you gain 50% endurance. <c=@reminder>(Cooldown: 10s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Adventure\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24831() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Brawler\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24831,\"icon\":\"https://render.guildwars2.com/file/E45FAD920C2E2CFC6FB61463064AC403B732C919/221142.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Power\",\"+14 Toughness\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Brawler\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24832() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Brawler\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24832,\"icon\":\"https://render.guildwars2.com/file/C4DF5316F5B1F4045E42D560015F2206CB9FF93F/221143.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Power\",\"+21 Toughness\",\"+30 Power\",\"+39 Toughness\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Brawler\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24833() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Brawler\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24833,\"icon\":\"https://render.guildwars2.com/file/65A51C02312B93452A6EA9F0BF6BB5240894500D/220735.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Power\",\"+35 Toughness\",\"+50 Power\",\"+65 Toughness\",\"+100 Power\",\"When you use a heal skill you gain 3 stacks of might for 10 seconds. <c=@reminder>(Cooldown: 10s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Brawler\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24834() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Scholar\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24834,\"icon\":\"https://render.guildwars2.com/file/62B3584D672417EB01DB4302E6767F04507B9390/221144.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Power\",\"+14 Ferocity\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Scholar\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24835() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Scholar\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24835,\"icon\":\"https://render.guildwars2.com/file/D8F1977354D820E26E26A40660B945FE9ED3EA3B/221145.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Power\",\"+21 Ferocity\",\"+30 Power\",\"+39 Ferocity\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Scholar\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24836() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Scholar\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24836,\"icon\":\"https://render.guildwars2.com/file/4378ABC0415950DAC6A05C76920392D72E242EC2/220736.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Power\",\"+35 Ferocity\",\"+50 Power\",\"+65 Ferocity\",\"+100 Power\",\"+10% damage while your health is above 90%\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Scholar\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24837() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Water\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24837,\"icon\":\"https://render.guildwars2.com/file/41DFE8A9374CCC7A1E7C5E6B14535DB7B544F874/221146.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Healing\",\"+2% Boon Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Water\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24838() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Water\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24838,\"icon\":\"https://render.guildwars2.com/file/BF001AE4ED5BD7335A49D64D2AD1090E1CA19E09/221147.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Healing\",\"+3% Boon Duration\",\"+30 Healing\",\"15% chance when struck to remove a condition. <c=@reminder>(Cooldown: 30s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Water\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24839() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Water\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24839,\"icon\":\"https://render.guildwars2.com/file/50C5E3125234FF4525162A052335354D47B50D0F/220737.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Healing\",\"+5% Boon Duration\",\"+50 Healing\",\"25% chance when struck to remove a condition. <c=@reminder>(Cooldown: 30s)</c>\",\"+100 Healing\",\"+15% Boon Duration; when you use a heal skill, you and nearby allies are healed for a small amount. <c=@reminder>(Cooldown: 10s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Water\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24840() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Monk\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":24840,\"icon\":\"https://render.guildwars2.com/file/AFBC93E29150DBB8CF3D050791FF0D0502354A0D/221148.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Healing\",\"+2% Boon Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Monk\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24841() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Monk\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":30,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":24841,\"icon\":\"https://render.guildwars2.com/file/B1A2E63356C76E6A14F8CF2EA17E1E54CF37060F/221149.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Healing\",\"+3% Boon Duration\",\"+30 Healing\",\"+6% boon duration; 15% chance when struck to heal for a small amount. <c=@reminder>(Cooldown: 15s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Monk\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24842() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Monk\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":24842,\"icon\":\"https://render.guildwars2.com/file/E028F4BC03E9EC36A368712463D824CEC30FCCDA/220738.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Healing\",\"+5% Boon Duration\",\"+50 Healing\",\"+10% boon duration; 25% chance when struck to heal for a small amount. <c=@reminder>(Cooldown: 15s)</c>\",\"+100 Healing\",\"+10% Outgoing heal effectiveness to allies.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Monk\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24843() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Aristocracy\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":24843,\"icon\":\"https://render.guildwars2.com/file/2DF7F00470797555D63DBD1B18E0B5D37BB60C55/221150.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Condition Damage\",\"+4% Might Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Aristocracy\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24844() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Aristocracy\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":24844,\"icon\":\"https://render.guildwars2.com/file/6C2F0103FA432A4ACF12F4BF0342A62C63DC6221/221151.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Condition Damage\",\"+6% Might Duration\",\"+30 Condition Damage\",\"+9% Might Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Aristocracy\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24845() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Aristocracy\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":24845,\"icon\":\"https://render.guildwars2.com/file/D8375410EAF95DB5D29CAB063051AD2AA8FAD740/221152.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Condition Damage\",\"+10% Might Duration\",\"+50 Condition Damage\",\"+15% Might Duration\",\"+100 Condition Damage\",\"+20% might duration; when you use a healing skill, gain 3 stacks of might for 10 seconds. <c=@reminder>(Cooldown: 10s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Aristocracy\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24846() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Nightmare\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":24846,\"icon\":\"https://render.guildwars2.com/file/2358D3A8F6DDBE7BE07B260103F55570F33B28CE/221153.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Condition Damage\",\"+2% Condition Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Nightmare\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24847() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Nightmare\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":24847,\"icon\":\"https://render.guildwars2.com/file/9A773955089AD896BD369B40F52ED73D0FEFB4A4/221154.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Condition Damage\",\"+3% Condition Duration\",\"+30 Condition Damage\",\"+6% Condition Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Nightmare\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24848() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Nightmare\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":24848,\"icon\":\"https://render.guildwars2.com/file/2420347B95791503F2E666E948E825A652095395/220739.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Condition Damage\",\"+5% Condition Duration\",\"+50 Condition Damage\",\"+10% Condition Duration\",\"+100 Condition Damage\",\"50% chance when struck to cause fear for 2 seconds. <c=@reminder>(Cooldown: 90s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Nightmare\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24849() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Forgeman\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":24849,\"icon\":\"https://render.guildwars2.com/file/D3906B07D5FB9B0A1007B6C3E4A109FC0B143943/221155.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Toughness\",\"+4% Burning Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Forgeman\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24850() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Forgeman\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":24850,\"icon\":\"https://render.guildwars2.com/file/98DD524B2FE81A21B83A62E6C80FBFEB149D0BFB/221156.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Toughness\",\"+6% Burning Duration\",\"+30 Toughness\",\"+9% Protection Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Forgeman\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24851() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Forgeman\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":24851,\"icon\":\"https://render.guildwars2.com/file/0764987FBB1369A74103DE3F1B279C02EA503D02/220740.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Toughness\",\"+10% Burning Duration\",\"+50 Toughness\",\"+15% Protection Duration\",\"+100 Toughness\",\"When struck below 50% health you gain protection for 10s and burn nearby foes. <c=@reminder>(Cooldown: 60s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Forgeman\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24852() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Baelfire\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":24852,\"icon\":\"https://render.guildwars2.com/file/9E0AC6BED930F2F50F79ECD6CDBF1FF5E3B7AB39/221157.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Power\",\"+4% Burning Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Baelfire\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24853() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Baelfire\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":24853,\"icon\":\"https://render.guildwars2.com/file/4AA4DF15A04E6D3B5FDE7E7CEDDB7E15F44314FF/221158.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Power\",\"+6% Burning Duration\",\"+30 Power\",\"15% chance to gain vigor for 5 seconds when struck. <c=@reminder>(Cooldown: 25s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Baelfire\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}