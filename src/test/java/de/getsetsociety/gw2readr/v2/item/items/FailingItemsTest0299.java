package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0299 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem67323() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Glorious Victor's Armor Box\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67323,\"icon\":\"https://render.guildwars2.com/file/0E02699DEBB3C6306A163DE8D3E7D4B41FEAE501/866841.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67324() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Glorious Armor Box\",\"description\":\"This armor box contains unique armor skins, dragonite ore, empyreal fragments, obsidian shards, and mystic clovers.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67324,\"icon\":\"https://render.guildwars2.com/file/0E02699DEBB3C6306A163DE8D3E7D4B41FEAE501/866841.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67339() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Trapper\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67339,\"icon\":\"https://render.guildwars2.com/file/4A322301EDD61898193B9B94A0A6A1F1DC06BF24/866844.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Condition Damage\",\"The duration of conditions you apply last 10% longer.\",\"+50 Condition Damage\",\"When you use a trap skill, you gain 3 seconds of super speed.\",\"+100 Condition Damage\",\"Gain 3 seconds of stealth when using a trap skill.<c=@reminder>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Trapper\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67340() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Cleansing\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67340,\"icon\":\"https://render.guildwars2.com/file/011CEE62DABFE502E839CA19ECEAA5C523089407/866845.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":25519,\"description\":\"Remove 1 condition when you swap to this weapon while in combat. <c=@reminder>(Cooldown: 9 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Cleansing\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67341() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Cruelty\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67341,\"icon\":\"https://render.guildwars2.com/file/057D6F9E40020AF09E420B09EBDB4FCD9DE37951/866846.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":25522,\"description\":\"Gain a charge of +10 ferocity each time you kill a foe—five if you kill an enemy player. <c=@reminder>(Max 25 stacks; ends on down.)</c> <br><c=@reminder>(Only one attribute-stacking sigil can be active at a time.)</c>\"},\"attributes\":[]},\"suffix\":\"of Cruelty\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67342() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of Radiance\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67342,\"icon\":\"https://render.guildwars2.com/file/BAB7FAD330A0EC183426D646C2440BCB7F74324D/866847.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Vitality\",\"When you receive an aura, you gain 5 seconds of swiftness. <c=@reminder>(Cooldown: 20s)</c>\",\"+50 Vitality\",\"When you use a heal skill, you gain 4 seconds of light aura. <c=@reminder>(Cooldown: 20s)</c>\",\"+100 Vitality\",\"The duration of auras you apply are increased by 33%.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Radiance\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem67344() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of Evasion\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":67344,\"icon\":\"https://render.guildwars2.com/file/32C4042A0F1D53041C4190760B7BCA1FDADA90E1/866849.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Ferocity\",\"When executing a dodge roll, you gain 3 seconds of swiftness. <c=@reminder>(Cooldown: 10s)</c>\",\"+50 Ferocity\",\"When executing a dodge roll, you gain 3 seconds of fury. <c=@reminder>(Cooldown: 10s)</c>\",\"+100 Ferocity\",\"When executing a dodge roll, deal a crippling strike to nearby enemies. <c=@reminder>(Cooldown: 9s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Evasion\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}
