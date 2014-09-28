package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0145 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem24754() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Ogre\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24754,\"icon\":\"https://render.guildwars2.com/file/F30630104F4D982F3FF0297C0E7AABA9B844DBBC/221093.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Power\",\"+14 Ferocity\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Ogre\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24755() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Ogre\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24755,\"icon\":\"https://render.guildwars2.com/file/F70EF6D9C39A676A6FA7054C78C35A052A4E3C09/221094.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Power\",\"+21 Ferocity\",\"+30 Power\",\"15% chance when struck to summon a rock dog. <c=@reminder>(Cooldown: 90s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Ogre\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24756() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Ogre\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24756,\"icon\":\"https://render.guildwars2.com/file/136590B36FFC2053D135743B063405C9A54A9E6A/220716.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Power\",\"+35 Ferocity\",\"+50 Power\",\"25% chance when struck to summon a rock dog. <c=@reminder>(Cooldown: 90s)</c>\",\"+100 Power\",\"+4% damage\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Ogre\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24757() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Undead\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24757,\"icon\":\"https://render.guildwars2.com/file/D32651C75E09C23F0ECD234CE8B1C666E032296C/220723.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Condition Damage\",\"+35 Toughness\",\"+50 Condition Damage\",\"+65 Toughness\",\"+100 Condition Damage\",\"7% of toughness is converted to condition damage.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Undead\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24758() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Undead\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24758,\"icon\":\"https://render.guildwars2.com/file/C659B4F92DCBF906A091E854F85A6968C1C14BE4/221095.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Condition Damage\",\"+21 Toughness\",\"+30 Condition Damage\",\"+39 Toughness\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Undead\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24759() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Undead\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24759,\"icon\":\"https://render.guildwars2.com/file/43FB5A05AD1828090A1818D6CD2E04B30BD50DE6/221096.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Condition Damage\",\"+14 Toughness\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Undead\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24760() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Krait\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24760,\"icon\":\"https://render.guildwars2.com/file/2F1C0BA94DADC4329467CCD4C2DAA4B7D5E77566/221097.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Condition Damage\",\"+4% Bleeding Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Krait\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24761() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Krait\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24761,\"icon\":\"https://render.guildwars2.com/file/D01507065265FA223590C22FDEFE727030301AFD/221098.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Condition Damage\",\"+6% Bleeding Duration\",\"+30 Condition Damage\",\"+9% bleeding duration; 15% chance when struck to cause bleeding for 10 seconds. <c=@reminder>(Cooldown: 15s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Krait\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24762() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Krait\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24762,\"icon\":\"https://render.guildwars2.com/file/F0932EF967413023BE0CC1EEF5E2536B2764E65A/220711.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Condition Damage\",\"+10% Bleeding Duration\",\"+50 Condition Damage\",\"+15% bleeding duration; 25% chance when struck to cause bleeding for 10 seconds. <c=@reminder>(Cooldown: 15s)</c>\",\"+100 Condition Damage\",\"+20% bleeding duration; when you use your elite skill you inflict bleeding, torment, and poison for 8 seconds to nearby foes. <c=@reminder>(Cooldown: 30s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Krait\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24763() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of Balthazar\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24763,\"icon\":\"https://render.guildwars2.com/file/0D402432F053666F99590DD6AA661E939A256D54/221099.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Condition Damage\",\"+4% Burning Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Balthazar\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24764() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of Balthazar\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24764,\"icon\":\"https://render.guildwars2.com/file/2AEA022CAA75AF7907C9407E76544308795B2990/221100.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Condition Damage\",\"+6% Burning Duration\",\"+30 Condition Damage\",\"+9% burning duration; when you're struck below 20% health gain quickness for 5 seconds. <c=@reminder>(Cooldown: 90s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Balthazar\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24765() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of Balthazar\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24765,\"icon\":\"https://render.guildwars2.com/file/7CEF770BE7E6A5E507B6D98018155CD2395FAD18/220694.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Condition Damage\",\"+10% Burning Duration\",\"+50 Condition Damage\",\"+15% burning duration; when you're struck below 20% health gain quickness for 5 seconds. <c=@reminder>(Cooldown: 90s)</c>\",\"+100 Condition Damage\",\"+20% burning duration; when you use a heal skill nearby foes are burned for 3 seconds. <c=@reminder>Cooldown: 10s</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Balthazar\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24766() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of Dwayna\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24766,\"icon\":\"https://render.guildwars2.com/file/BC7E4DD2B7717AD7054CAFE103C7BEAC55C8142B/222502.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Healing\",\"+4% Regeneration Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Dwayna\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24767() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of Dwayna\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24767,\"icon\":\"https://render.guildwars2.com/file/18D12BA363989D7F223DD2A22E1DC87A6203D744/221101.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Healing\",\"+6% Regeneration Duration\",\"+30 Healing\",\"15% chance when struck to gain regeneration for 10 seconds. <c=@reminder>(Cooldown: 45s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Dwayna\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24768() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of Dwayna\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24768,\"icon\":\"https://render.guildwars2.com/file/AFB370B09F230D76014E55662924CDFB5AD947A3/220699.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Healing\",\"+10% Regeneration Duration\",\"+50 Healing\",\"25% chance when struck to gain regeneration for 10 seconds. <c=@reminder>(Cooldown: 45s)</c>\",\"+100 Healing\",\"+20% regeneration duration; when you use a heal skill, you and all nearby allies gain regeneration for 5 seconds. <c=@reminder>(Cooldown: 10s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Dwayna\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24769() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of Melandru\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24769,\"icon\":\"https://render.guildwars2.com/file/F51EE3CFB4C63ACB21232E2BC42C7C1AFCA4E075/221102.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Toughness\",\"+14 Vitality\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Melandru\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24770() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of Melandru\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24770,\"icon\":\"https://render.guildwars2.com/file/90E02AE6C40429F7E7BB5997D50E10DF63E37CDE/221103.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Toughness\",\"+21 Vitality\",\"+30 Toughness\",\"-6% Condition Duration; -6% Stun Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Melandru\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24771() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of Melandru\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24771,\"icon\":\"https://render.guildwars2.com/file/66A56E6838D707BBBAD0B8D0091425502F7E3AF4/220714.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Toughness\",\"+35 Vitality\",\"+50 Toughness\",\"-10% Incoming Condition Duration; -10% Incoming Stun Duration\",\"+100 Toughness\",\"-15% Incoming Condition Duration; -15% Incoming Stun Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Melandru\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24772() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gold Doubloon\",\"description\":\"Double-click to apply to an item with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":102,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24772,\"icon\":\"https://render.guildwars2.com/file/C7ECB96451CD1493215DBBE967AD0B62A1585461/221104.png\",\"details\":{\"type\":\"Gem\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":21040,\"description\":\"+3% Boon Duration\"},\"attributes\":[]},\"suffix\":\"of Gold\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24773() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Platinum Doubloon\",\"description\":\"Double-click to apply to an item with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":135,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24773,\"icon\":\"https://render.guildwars2.com/file/E5C1AB06B16DEC154546D21F63620173780AC860/434543.png\",\"details\":{\"type\":\"Gem\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":21041,\"description\":\"+4% Boon Duration\"},\"attributes\":[]},\"suffix\":\"of Platinum\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24774() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of Lyssa\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24774,\"icon\":\"https://render.guildwars2.com/file/0AFC0E5BAC23C905C8CB699B2AA9CCC20C12CE17/221105.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Precision\",\"+2% Condition Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Lyssa\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24775() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of Lyssa\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24775,\"icon\":\"https://render.guildwars2.com/file/6D2AF76A2CEE6031FBE610B1BCB949B246D4FE4E/221106.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Precision\",\"+3% Condition Duration\",\"+30 Precision\",\"When you use a heal skill you gain a random boon for 6 seconds. <c=@reminder>(Cooldown: 10s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Lyssa\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24776() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of Lyssa\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24776,\"icon\":\"https://render.guildwars2.com/file/0A5ED9EE533DC7116A7D50EAAECD5A1FF024ACFE/220713.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Precision\",\"+5% Condition Duration\",\"+50 Precision\",\"When you use a heal skill you gain a random boon for 10 seconds. <c=@reminder>(Cooldown: 10s)</c>\",\"+100 Precision\",\"When you use an elite skill, convert up to 5 conditions into boons. <c=@reminder>(Cooldown: 45s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Lyssa\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24777() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of Grenth\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24777,\"icon\":\"https://render.guildwars2.com/file/72644F90F75A200B24717649960B12A427F820B8/221107.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Condition Damage\",\"+4% Chill Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Grenth\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24778() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of Grenth\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24778,\"icon\":\"https://render.guildwars2.com/file/D35BFBE536330093B0983F9345FADE6A4C240D24/221108.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Condition Damage\",\"+6% Chill Duration\",\"+30 Condition Damage\",\"15% chance when struck to cause chill for 3 seconds. <c=@reminder>(Cooldown: 30s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Grenth\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}