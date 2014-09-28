package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0147 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem24804() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Necromancer\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24804,\"icon\":\"https://render.guildwars2.com/file/CC1C11004B6C0CD92B52B3315A57FB054D667E77/221125.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Condition Damage\",\"+14 Vitality\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Necromancer\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24805() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Necromancer\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24805,\"icon\":\"https://render.guildwars2.com/file/6D72ECD6A4E97F1CBE016155E02AEF71B1AD1A94/221126.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Condition Damage\",\"+21 Vitality\",\"+30 Condition Damage\",\"+39 Vitality\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Necromancer\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24806() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Necromancer\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24806,\"icon\":\"https://render.guildwars2.com/file/653A411208E7310CDCE628750C39A5C237F5F220/220726.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Condition Damage\",\"+35 Vitality\",\"+50 Condition Damage\",\"+65 Vitality\",\"+100 Condition Damage\",\"+20% Fear Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Necromancer\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24807() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Sigil of Ghost Slaying\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24807,\"icon\":\"https://render.guildwars2.com/file/E70857C7599154B579E19903A2595053650F03DA/340621.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9699,\"description\":\"+3% Damage vs. Ghosts\"},\"attributes\":[]},\"suffix\":\"of Ghost Slaying\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24808() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Sigil of Ghost Slaying\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24808,\"icon\":\"https://render.guildwars2.com/file/4359561C0B763B437D0DB4F598A92958AFDA0116/340622.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9700,\"description\":\"+5% Damage vs. Ghosts\"},\"attributes\":[]},\"suffix\":\"of Ghost Slaying\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24809() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Ghost Slaying\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24809,\"icon\":\"https://render.guildwars2.com/file/53B41B4FF6EBD8D45A52F79B5A74D2A6184C0408/340623.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9701,\"description\":\"+10% Damage vs. Ghosts\"},\"attributes\":[]},\"suffix\":\"of Ghost Slaying\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24810() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Engineer\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24810,\"icon\":\"https://render.guildwars2.com/file/95C56F914FD9AA056B1F58DA324E68F929B51C2B/221127.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Toughness\",\"+14 Condition Damage\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Engineer\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24811() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Engineer\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24811,\"icon\":\"https://render.guildwars2.com/file/9734150EF6DFF744C9DE55666758E0EFC76049C8/221128.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Toughness\",\"+21 Condition Damage\",\"+30 Toughness\",\"+39 Condition Damage\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Engineer\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24812() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Engineer\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24812,\"icon\":\"https://render.guildwars2.com/file/9896142965DE036D05030D04220A036062545B43/220728.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Toughness\",\"+35 Condition Damage\",\"+50 Toughness\",\"+65 Condition Damage\",\"+100 Toughness\",\"While wielding a conjured weapon, environmental weapons, kits, banners, and stolen items gain +7% damage.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Engineer\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24813() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Ranger\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24813,\"icon\":\"https://render.guildwars2.com/file/D6D8B0411F97625CF867D66BF22366CE44FEE41B/221129.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Precision\",\"+14 Ferocity\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Ranger\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24814() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Ranger\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24814,\"icon\":\"https://render.guildwars2.com/file/3339317CA53FBA2BC79D37952542DDCE193305EB/221130.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Precision\",\"+21 Ferocity\",\"+30 Precision\",\"+39 Ferocity\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Ranger\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24815() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Ranger\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24815,\"icon\":\"https://render.guildwars2.com/file/74190770191950B5CD9439B93B487816959E9D3B/220729.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Precision\",\"+35 Ferocity\",\"+50 Precision\",\"+65 Ferocity\",\"+100 Precision\",\"+7% damage while you have an active companion.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Ranger\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24816() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Thief\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24816,\"icon\":\"https://render.guildwars2.com/file/9EB91FAC0E5A76C33B0A8074E0E1270D9A175A24/221131.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Precision\",\"+14 Condition Damage\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Thief\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24817() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Thief\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24817,\"icon\":\"https://render.guildwars2.com/file/0156A90F23F469320891CB6EFB6E180A787008A2/221132.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Precision\",\"+21 Condition Damage\",\"+30 Precision\",\"+39 Condition Damage\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Thief\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24818() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Thief\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24818,\"icon\":\"https://render.guildwars2.com/file/997AEFF0927F640DE515B4DA516911B3B3B6B9EA/220731.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Precision\",\"+35 Condition Damage\",\"+50 Precision\",\"+65 Condition Damage\",\"+100 Precision\",\"When striking your foe from behind or the side gain +10% damage.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Thief\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24819() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Warrior\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24819,\"icon\":\"https://render.guildwars2.com/file/C050E563435C45C95FACD8553ECDBE54297EA8B4/221133.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Vitality\",\"+14 Power\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Warrior\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24820() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Warrior\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24820,\"icon\":\"https://render.guildwars2.com/file/ABE4A9CBDFBA43D09AC744AAA7646B0114B0FD20/221134.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Vitality\",\"+21 Power\",\"+30 Vitality\",\"+39 Power\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Warrior\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24821() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Warrior\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24821,\"icon\":\"https://render.guildwars2.com/file/ACA8355625070B3706CAE0B49B0549CB12123420/220732.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Vitality\",\"+35 Power\",\"+50 Vitality\",\"+65 Power\",\"+100 Vitality\",\"-20% recharge on weapon swap.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Warrior\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24822() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Guardian\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24822,\"icon\":\"https://render.guildwars2.com/file/0C42C10329C0466810D84601192270FA55F6EDF4/221135.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Toughness\",\"+14 Healing\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Guardian\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24823() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Guardian\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24823,\"icon\":\"https://render.guildwars2.com/file/2852E61702DD700A3E67C3723A91133666134C1C/221136.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Toughness\",\"+21 Healing\",\"+30 Toughness\",\"+39 Healing\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Guardian\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24824() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Guardian\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24824,\"icon\":\"https://render.guildwars2.com/file/AE08720A7849BB97DA0E299C00440EFA5C6B1F98/220733.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Toughness\",\"+35 Healing\",\"+50 Toughness\",\"+65 Healing\",\"+100 Toughness\",\"When you block a foe's attack, burn that foe for 1 second.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Guardian\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24825() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Trooper\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24825,\"icon\":\"https://render.guildwars2.com/file/4AC62C07E3C1722F3EE192E118356AAC68D34551/221137.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Vitality\",\"+14 Toughness\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Trooper\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24826() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Trooper\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24826,\"icon\":\"https://render.guildwars2.com/file/B200943606037445CB7302BFA2053A200C9F0BE0/221138.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Vitality\",\"+21 Toughness\",\"+30 Vitality\",\"+39 Toughness\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Trooper\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24827() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Trooper\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24827,\"icon\":\"https://render.guildwars2.com/file/643A3C23647EF27F520860F0EFC7FEEB29766B1A/220734.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Vitality\",\"+35 Toughness\",\"+50 Vitality\",\"+65 Toughness\",\"+100 Vitality\",\"Shouts remove a condition from each affected ally.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Trooper\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24828() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Adventurer\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24828,\"icon\":\"https://render.guildwars2.com/file/9F12213103E017ACA475F10A3220C0D5DD58B50C/221139.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Condition Damage\",\"+14 Power\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Adventure\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}