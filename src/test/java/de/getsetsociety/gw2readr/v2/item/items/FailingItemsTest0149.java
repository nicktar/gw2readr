package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0149 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem24854() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Baelfire\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":24854,\"icon\":\"https://render.guildwars2.com/file/BE044D76F2F1762634B00A5E4216E7B8C104D1FB/220741.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Power\",\"+10% Burning Duration\",\"+50 Power\",\"25% chance to gain vigor for 5 seconds when struck. <c=@reminder>(Cooldown: 25s)</c>\",\"+100 Power\",\"+20% burning duration; 50% chance when struck to cause a fire nova. <c=@reminder>(Cooldown: 30s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Baelfire\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24855() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of Sanctuary\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":24855,\"icon\":\"https://render.guildwars2.com/file/05E9F9B479D150E692EABB48EBD60999C2DEEC7A/221159.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Vitality\",\"+2% Boon Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Sanctuary\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24856() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of Sanctuary\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":24856,\"icon\":\"https://render.guildwars2.com/file/1853F3C5FC0FB599B3F252537603040CC90A04B4/221160.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Vitality\",\"+3% Boon Duration\",\"+30 Vitality\",\"15% chance when struck to gain retaliation for 4 seconds.<c=@reminder>(Cooldown: 30s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Sanctuary\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24857() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of Sanctuary\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":24857,\"icon\":\"https://render.guildwars2.com/file/7C142C0B6558D2DCDB01E580A04321302F4F5B40/220742.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Vitality\",\"+5% Boon Duration\",\"+50 Vitality\",\"25% chance when struck to gain retaliation for 4 seconds.<c=@reminder>(Cooldown: 30s)</c>\",\"+100 Vitality\",\"When struck below 20% health gain stability for 5 seconds. <c=@reminder>(Cooldown: 60s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Sanctuary\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24858() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of Orr\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":24858,\"icon\":\"https://render.guildwars2.com/file/7AB17CADDC7DEDE890372F945D7B243A223C2DB9/221161.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Condition Damage\",\"+4% Poison Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Orr\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24859() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of Orr\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":24859,\"icon\":\"https://render.guildwars2.com/file/286D197E55CF9110E910DF02922610C31F4A5B22/221162.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Condition Damage\",\"+6% Poison Duration\",\"+30 Condition Damage\",\"15% chance when struck to cause poison for 10 seconds. <c=@reminder>(Cooldown: 20s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Orr\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24860() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of Orr\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":24860,\"icon\":\"https://render.guildwars2.com/file/27245474E83839DC6648F22CF6B5F4B09514DF11/220743.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Condition Damage\",\"+10% Poison Duration\",\"+50 Condition Damage\",\"25% chance when struck to cause poison for 10 seconds. <c=@reminder>(Cooldown: 20s)</c>\",\"+100 Condition Damage\",\"+20% poison duration; when struck below 20% health gain quickness for 5 seconds. <c=@reminder>(Cooldown: 90s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Orr\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24861() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Sigil of Luck\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":58,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24861,\"icon\":\"https://render.guildwars2.com/file/504DECC200E3D0B83E0857A4700EB90307BF0F3A/221163.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9412,\"description\":\"25% chance to gain a random boon on killing an enemy.\"},\"attributes\":[]},\"suffix\":\"of Luck\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24862() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Sigil of Doom\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":58,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24862,\"icon\":\"https://render.guildwars2.com/file/48367EFEB6E9D6E7D272143DFED3386906EB1D23/221164.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9702,\"description\":\"Your next attack after you swap to this weapon while in combat inflicts poison (2 seconds).<br><c=@reminder>(Cooldown: 9 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Doom\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24863() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Sigil of Celerity\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24863,\"icon\":\"https://render.guildwars2.com/file/189E0C31491DC9DAE65FBADAE2D54E7C4C329401/221165.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":24206,\"description\":\"Gain a charge when you kill a foe, five if you kill an enemy player. At 25 charges, gain quickness for 3 seconds. <c=@reminder>(You lose all stacks on down.)</c>\"},\"attributes\":[]},\"suffix\":\"of Celerity\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24864() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Sigil of Celerity\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24864,\"icon\":\"https://render.guildwars2.com/file/483E71CD0D524C08FF08F3BE51050806A27D6B18/221166.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":24207,\"description\":\"Gain a charge when you kill a foe, five if you kill an enemy player. At 25 charges, gain quickness for 4 seconds. <c=@reminder>(You lose all stacks on down.)</c>\"},\"attributes\":[]},\"suffix\":\"of Celerity\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24865() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Celerity\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24865,\"icon\":\"https://render.guildwars2.com/file/731850AB48F9944BB5FE4A050A71366C0903253E/221167.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":24208,\"description\":\"Gain a charge when you kill a foe, five if you kill an enemy player. At 25 charges, gain quickness for 5 seconds. <c=@reminder>(You lose all stacks on down.)</c>\"},\"attributes\":[]},\"suffix\":\"of Celerity\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24866() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Sigil of Impact\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":58,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24866,\"icon\":\"https://render.guildwars2.com/file/98C91534B4C45949E329EFB237669295649C2D03/221168.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9716,\"description\":\"+3% damage vs. stunned or knocked down foes.\"},\"attributes\":[]},\"suffix\":\"of Impact\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24867() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Sigil of Impact\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24867,\"icon\":\"https://render.guildwars2.com/file/4E5DD75B291F40DDF6C4E4770DED0C2FC70F2C77/221169.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9717,\"description\":\"+5% damage vs. stunned or knocked down foes.\"},\"attributes\":[]},\"suffix\":\"of Impact\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24868() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Impact\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24868,\"icon\":\"https://render.guildwars2.com/file/D9ACA0C94D90A76B1C500D5DE6D62B6820FEDAE2/221170.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9718,\"description\":\"+10% damage vs. stunned or knocked down foes.\"},\"attributes\":[]},\"suffix\":\"of Impact\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24869() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of Life\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24869,\"icon\":\"https://render.guildwars2.com/file/4C5567CE4AAC6F381701BA7791C17B6DE34D2D35/66663.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9708,\"description\":\"+20 health\"},\"attributes\":[]},\"suffix\":\"of Life\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24870() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chrysocola Shard\",\"description\":\"Double-click to apply to an item with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":50,\"rarity\":\"Fine\",\"vendor_value\":45,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24870,\"icon\":\"https://render.guildwars2.com/file/6B2F59D4A0C2F0C0CB3C66B2FF677D1B19AA996B/221171.png\",\"details\":{\"type\":\"Gem\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":276,\"description\":\"+11 Condition Damage\n+8 Power\n+8 Vitality\"},\"attributes\":[]},\"suffix\":\"of Chrysocola\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24871() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Emerald Shard\",\"description\":\"Double-click to apply to an item with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":50,\"rarity\":\"Fine\",\"vendor_value\":45,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24871,\"icon\":\"https://render.guildwars2.com/file/ABC7A420B199269CA97CD45BA595387D46362C5A/221172.png\",\"details\":{\"type\":\"Gem\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":294,\"description\":\"+11 Precision\n+8 Toughness\n+8 Power\"},\"attributes\":[]},\"suffix\":\"of Emerald\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24872() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Beryl Shard\",\"description\":\"Double-click to apply to an item with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":50,\"rarity\":\"Fine\",\"vendor_value\":45,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24872,\"icon\":\"https://render.guildwars2.com/file/AE93DE9F1BDFEF18A63D9163B0EA3E5632BFF939/221173.png\",\"details\":{\"type\":\"Gem\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":296,\"description\":\"+11 Power\n+8 Ferocity\n+8 Vitality\"},\"attributes\":[]},\"suffix\":\"of Beryl\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24873() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ruby Shard\",\"description\":\"Double-click to apply to an item with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":50,\"rarity\":\"Fine\",\"vendor_value\":45,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24873,\"icon\":\"https://render.guildwars2.com/file/94FF174423B920D7D10BD70F9A08EB34B5FA47DA/221174.png\",\"details\":{\"type\":\"Gem\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":288,\"description\":\"+11 Power\n+8 Ferocity\n+8 Precision\"},\"attributes\":[]},\"suffix\":\"of Ruby\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24874() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coral Chunk\",\"description\":\"Double-click to apply to an item with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":50,\"rarity\":\"Fine\",\"vendor_value\":45,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24874,\"icon\":\"https://render.guildwars2.com/file/E3EE022F17127B45FDFC266BDAD05033359BF9E2/221175.png\",\"details\":{\"type\":\"Gem\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":292,\"description\":\"+11 Precision\n+8 Condition Damage\n+8 Power\"},\"attributes\":[]},\"suffix\":\"of Coral\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24875() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Shard\",\"description\":\"Double-click to apply to an item with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":50,\"rarity\":\"Fine\",\"vendor_value\":45,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24875,\"icon\":\"https://render.guildwars2.com/file/EB9C9C6F061D545F2EA4EF07C8436AEF0CDE0E90/221176.png\",\"details\":{\"type\":\"Gem\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":286,\"description\":\"+11 Precision\n+8 Ferocity\n+8 Power\"},\"attributes\":[]},\"suffix\":\"of Opal\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24876() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sapphire Shard\",\"description\":\"Double-click to apply to an item with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":50,\"rarity\":\"Fine\",\"vendor_value\":45,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24876,\"icon\":\"https://render.guildwars2.com/file/DACC0A0351559BA034986F4E0FB9435428A1D6F2/221177.png\",\"details\":{\"type\":\"Gem\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":282,\"description\":\"+11 Healing\n+8 Power\n+8 Toughness\"},\"attributes\":[]},\"suffix\":\"of Sapphire\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24877() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ornate Ruby Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":90,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24877,\"icon\":\"https://render.guildwars2.com/file/D0935A78D4625963AD3493C8725290755E0A3948/221178.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":289,\"description\":\"+14 Power\n+9 Ferocity\n+9 Precision\"},\"attributes\":[]},\"suffix\":\"of Ruby\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24878() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ornate Chrysocola Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":90,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24878,\"icon\":\"https://render.guildwars2.com/file/077A424ECFA8D7CC981965206A22E47302603268/221179.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":277,\"description\":\"+14 Condition Damage\n+9 Power\n+9 Vitality\"},\"attributes\":[]},\"suffix\":\"of Chrysocola\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}