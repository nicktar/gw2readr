package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0142 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem24679() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Sigil of Dreams\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24679,\"icon\":\"https://render.guildwars2.com/file/DB20007F3635A3EC0C3152D04A944CD90A70491E/340615.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9368,\"description\":\"+3% Damage vs. Nightmare Court\"},\"attributes\":[]},\"suffix\":\"of Dreams\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24680() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Sigil of Dreams\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24680,\"icon\":\"https://render.guildwars2.com/file/B4D1482CB3C3B3A3C2321940555C61800A2CBB0A/340616.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9369,\"description\":\"+5% Damage vs. Nightmare Court\"},\"attributes\":[]},\"suffix\":\"of Dreams\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24681() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Dreams\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24681,\"icon\":\"https://render.guildwars2.com/file/3971AF5B6948AF53F9D5A1382F66063234D43301/340617.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9370,\"description\":\"+10% Damage vs. Nightmare Court\"},\"attributes\":[]},\"suffix\":\"of Dreams\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24682() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Sigil of Sorrow\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24682,\"icon\":\"https://render.guildwars2.com/file/770FBA642FA8DD420BD91DDCFEE3E4F0C4AFE541/340618.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9371,\"description\":\"+3% Damage vs. Dredge\"},\"attributes\":[]},\"suffix\":\"of Sorrow\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24683() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Sigil of Sorrow\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24683,\"icon\":\"https://render.guildwars2.com/file/C65E2D6ADA0B99050BFC0F17DB0C1CA76AE3B5E1/340619.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9372,\"description\":\"+5% Damage vs. Dredge\"},\"attributes\":[]},\"suffix\":\"of Sorrow\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24684() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Sorrow\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24684,\"icon\":\"https://render.guildwars2.com/file/7B045AB2949D75A131027B71BC01CAAE4F240D09/340620.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9373,\"description\":\"+10% Damage vs. Dredge\"},\"attributes\":[]},\"suffix\":\"of Sorrow\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24685() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Afflicted\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24685,\"icon\":\"https://render.guildwars2.com/file/210FF7F029E12330094E209AD9F170DBEF7AC833/221046.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Condition Damage\",\"+4% Bleeding Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Afflicted\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24686() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Afflicted\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24686,\"icon\":\"https://render.guildwars2.com/file/B60F2022B79792C5AE920E124D5C3D26F05AC294/221047.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Condition Damage\",\"+6% Bleeding Duration\",\"+30 Condition Damage\",\"+9% Poison Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Afflicted\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24687() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Afflicted\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24687,\"icon\":\"https://render.guildwars2.com/file/B952E2BB3ACDF477F4C823655DAC1294C9A12745/220692.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Condition Damage\",\"+10% Bleeding Duration\",\"+50 Condition Damage\",\"+15% Poison Duration\",\"+100 Condition Damage\",\"+20% bleeding duration; when you are downed, you create a death nova. <c=@reminder>(Cooldown: 30s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Afflicted\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24688() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Lich\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24688,\"icon\":\"https://render.guildwars2.com/file/10324E350DEFA2276F0FD22299D4BAFD00736D18/220712.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Vitality\",\"+5% Condition Duration\",\"+50 Vitality\",\"+10% Condition Duration\",\"+100 Vitality\",\"50% chance when struck to summon a jagged horror. <c=@reminder>(Cooldown: 60s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Lich\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24689() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Lich\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24689,\"icon\":\"https://render.guildwars2.com/file/37E30F90D477DAD66E687F075E9803B23206024C/221048.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Vitality\",\"+2% Condition Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Lich\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24690() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Lich\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24690,\"icon\":\"https://render.guildwars2.com/file/5B4F73989C077C6426350606296E46391EC708A0/221049.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Vitality\",\"+3% Condition Duration\",\"+30 Vitality\",\"+6% Condition Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Lich\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24691() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Traveler\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24691,\"icon\":\"https://render.guildwars2.com/file/3CCCAB48D5D5FAEA14912BC6D3DB1A79DFC4C846/221050.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+8 to All Stats\",\"+5% Boon Duration\",\"+12 to All Stats\",\"+10% Boon Duration; +10% Condition Duration\",\"+16 to All Stats\",\"+25% Movement Speed\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Traveler\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24692() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Traveler\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24692,\"icon\":\"https://render.guildwars2.com/file/0E4724F511EC68679D935270172FBA557ABCC2FB/221051.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+5 to all stats\",\"+3% Boon Duration\",\"+7 to All Stats\",\"+6% Boon Duration; +6% Condition Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Traveler\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24693() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Traveler\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24693,\"icon\":\"https://render.guildwars2.com/file/94181173FF0DC80CF7F606FEC32E3A741D42646B/221052.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+4 to All Stats\",\"+2% Boon Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Traveler\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24694() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Flock\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24694,\"icon\":\"https://render.guildwars2.com/file/2838951E64CAF578D2426D7AED6ECEBD05390D61/221053.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Healing\",\"6% chance when struck to summon a bird to strike the attacking foe. <c=@reminder>(Cooldown: 10s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Flock\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24695() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Flock\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24695,\"icon\":\"https://render.guildwars2.com/file/2BA523C17A3BE0D6D2EC773361746A6FE3282E23/222500.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Healing\",\"9% chance when struck to summon a bird to strike the attacking foe. <c=@reminder>(Cooldown: 10s)</c>\",\"+30 Healing\",\"When the summoned bird strikes a foe, it also inflicts blindness for 3 seconds.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Flock\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24696() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Flock\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24696,\"icon\":\"https://render.guildwars2.com/file/F9D5AFF9E79806AF490FA1E6DD73041D15D401A7/220704.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Healing\",\"15% chance when struck to summon a bird to strike the attacking foe. <c=@reminder>(Cooldown: 10s)</c>\",\"+50 Healing\",\"When the summoned bird strikes a foe, it also inflicts blindness for 5 seconds.\",\"+100 Healing\",\"When you use a heal skill, you and nearby allies are healed for a small amount. <c=@reminder>(Cooldown: 10s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Flock\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24697() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Dolyak\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24697,\"icon\":\"https://render.guildwars2.com/file/B9E7783564FAF32E70265839E899FE2C190E291C/221055.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Toughness\",\"+14 Vitality\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Dolyak\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24698() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Dolyak\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24698,\"icon\":\"https://render.guildwars2.com/file/1447959B65EB2BB34F0C9BBD02BB1A4FE1009F1B/221056.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Toughness\",\"+21 Vitality\",\"+30 Toughness\",\"+39 Vitality\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Dolyak\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24699() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Dolyak\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24699,\"icon\":\"https://render.guildwars2.com/file/217571E95C4742460B033E0F5F2B3FB611C9DC4A/220698.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Toughness\",\"+35 Vitality\",\"+50 Toughness\",\"+65 Vitality\",\"+100 Toughness\",\"Regenerate health every second.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Dolyak\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24700() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Pack\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24700,\"icon\":\"https://render.guildwars2.com/file/051994CAE324079D0E0806D49358406B60074A77/221057.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Power\",\"+4% Swiftness Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Pack\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24701() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Pack\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24701,\"icon\":\"https://render.guildwars2.com/file/3F6CE23F992D2A5B4E12794B094CFA4477FAC067/221058.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Power\",\"+6% Swiftness Duration\",\"+30 Power\",\"15% chance when struck to grant nearby allies might, fury, and swiftness for 10s . <c=@reminder>(Cooldown: 20s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Pack\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24702() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Pack\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24702,\"icon\":\"https://render.guildwars2.com/file/FEF77764F24C0548271F29337268970C092DA5D3/220717.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Power\",\"+10% Swiftness Duration\",\"+50 Power\",\"25% chance when struck to grant nearby allies might, fury, and swiftness for 10s . <c=@reminder>(Cooldown: 20s)</c>\",\"+100 Power\",\"+20% Swiftness Duration; +125 Precision\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Pack\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24703() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of Infiltration\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24703,\"icon\":\"https://render.guildwars2.com/file/F9C62BCFB70106EEBCA33C4AC35352CE2A082F10/220710.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+2% damage against foes with less than 50% health.\",\"+35 Precision\",\"+4% damage against foes with less than 50% health.\",\"+65 Precision\",\"+6% damage against targets with less than 50% health.\",\"When struck below 20% health, cloak for 4 seconds. <c=@reminder>(Cooldown: 60s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Infiltration\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}