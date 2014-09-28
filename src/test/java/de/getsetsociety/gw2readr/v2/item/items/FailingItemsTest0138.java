package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0138 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem24579() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Sigil of Perception\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24579,\"icon\":\"https://render.guildwars2.com/file/9CBD050D236E76282C16460BD4C4A01006DCD3A6/340592.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9381,\"description\":\"Gain a charge of +7 precision each time you kill a foe, five if you kill an enemy player. <c=@reminder>(Max 25 stacks; ends on down.)</c> <br><c=@reminder>(Only one attribute-stacking sigil can be active at a time.)</c>\"},\"attributes\":[]},\"suffix\":\"of Perception\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24580() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Perception\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24580,\"icon\":\"https://render.guildwars2.com/file/FA237EF63BC111701FAEC13E312A022E9D44ED93/340593.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9382,\"description\":\"Gain a charge of +10 precision each time you kill a foe, five if you kill an enemy player. <c=@reminder>(Max 25 stacks; ends on down.)</c> <br><c=@reminder>(Only one attribute-stacking sigil can be active at a time.)</c>\"},\"attributes\":[]},\"suffix\":\"of Perception\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24581() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Sigil of Life\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24581,\"icon\":\"https://render.guildwars2.com/file/01D533A1E2373B80A7ED246075BA45060C765557/220992.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9390,\"description\":\"Gain a charge of +7 healing each time you kill a foe, five if you kill an enemy player. <c=@reminder>(Max 25 stacks; ends on down.)</c> <br><c=@reminder>(Only one attribute-stacking sigil can be active at a time.)</c>\"},\"attributes\":[]},\"suffix\":\"of Life\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24582() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Life\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24582,\"icon\":\"https://render.guildwars2.com/file/A7AE0E9D0DF64B69EF309D93E44FFAA90859ABA0/220670.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9389,\"description\":\"Gain a charge of +10 healing each time you kill a foe, five if you kill an enemy player. <c=@reminder>(Max 25 stacks; ends on down.)</c> <br><c=@reminder>(Only one attribute-stacking sigil can be active at a time.)</c>\"},\"attributes\":[]},\"suffix\":\"of Life\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24583() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Demon Summoning\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24583,\"icon\":\"https://render.guildwars2.com/file/52D5D9FE5E0B9091415092A9E21DE830010D2E0E/220674.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9395,\"description\":\"Gain a summoning charge whenever you kill a foe. At 25 charges, you summon a fleshreaver. <c=@reminder>(You lose all charges on down.)</c>\"},\"attributes\":[]},\"suffix\":\"of Demon Summoning\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24584() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Benevolence\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24584,\"icon\":\"https://render.guildwars2.com/file/0147AE350DEB5561D427EC41F6F4B35523707320/220672.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9401,\"description\":\"Gain a charge that grants 0.5% outgoing healing effectiveness toward other allies each time you kill a foe, five if you kill an enemy player. <c=@reminder>(Max 25 stacks; ends on down.)</c><br><c=@reminder>(Only one attribute-stacking sigil can be active at a time.)</c>\"},\"attributes\":[]},\"suffix\":\"of Benevolence\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24585() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Sigil of Benevolence\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24585,\"icon\":\"https://render.guildwars2.com/file/7D2CCD49CD52B9F896E7E13B5354287ACA3D7A7D/220993.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9403,\"description\":\"Gain a charge that grants 0.3% outgoing healing effectiveness toward other allies each time you kill a foe, five if you kill an enemy player. <c=@reminder>(Max 25 stacks; ends on down.)</c><br><c=@reminder>(Only one attribute-stacking sigil can be active at a time.)</c>\"},\"attributes\":[]},\"suffix\":\"of Benevolence\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24586() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Sigil of Benevolence\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24586,\"icon\":\"https://render.guildwars2.com/file/DCF110D5DB069E00B7074554C77CE0C1A72F036E/220994.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9402,\"description\":\"Gain a charge that grants 0.4% outgoing healing effectiveness toward other allies each time you kill a foe, five if you kill an enemy player. <c=@reminder>(Max 25 stacks; ends on down.)</c><br><c=@reminder>(Only one attribute-stacking sigil can be active at a time.)</c>\"},\"attributes\":[]},\"suffix\":\"of Benevolence\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24587() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Sigil of Speed\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24587,\"icon\":\"https://render.guildwars2.com/file/711A3D1E05217250029D01A2B19042690BDC112E/220995.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9406,\"description\":\"Gain Swiftness (10 Seconds) on Killing a Foe\"},\"attributes\":[]},\"suffix\":\"of Speed\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24588() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Sigil of Speed\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24588,\"icon\":\"https://render.guildwars2.com/file/286CB822EA9FDD683C6B114207BC0E1E6DE33743/220996.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9405,\"description\":\"Gain Swiftness (14 Seconds) on Killing a Foe\"},\"attributes\":[]},\"suffix\":\"of Speed\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24589() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Speed\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24589,\"icon\":\"https://render.guildwars2.com/file/E2BE561DB46692BF67F7AF2FDCA21FCA5D250D36/220675.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9404,\"description\":\"Gain Swiftness (20 Seconds) on Killing a Foe\"},\"attributes\":[]},\"suffix\":\"of Speed\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24590() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Sigil of Luck\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24590,\"icon\":\"https://render.guildwars2.com/file/B12C03F39EC76E7B0E3703426E39F6E8DB0A2E0A/220997.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9411,\"description\":\"50% chance to gain a random boon on killing an enemy.\"},\"attributes\":[]},\"suffix\":\"of Luck\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24591() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Luck\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24591,\"icon\":\"https://render.guildwars2.com/file/A4A317BFD72846C27107A97EED7508A10606D50A/220998.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9410,\"description\":\"75% chance to gain a random boon on killing an enemy.\"},\"attributes\":[]},\"suffix\":\"of Luck\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24592() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Stamina\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24592,\"icon\":\"https://render.guildwars2.com/file/970DD319EC0E7455E941CD5DA840C10EA6EF160E/220669.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9414,\"description\":\"Your endurance is refilled each time you kill a foe.\"},\"attributes\":[]},\"suffix\":\"of Stamina\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24593() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Sigil of Restoration\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24593,\"icon\":\"https://render.guildwars2.com/file/35762B7FD5C598C0362A66CB6B5ABC5CE037CCAB/220999.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9298,\"description\":\"Gain Health on Killing a Foe\"},\"attributes\":[]},\"suffix\":\"of Restoration\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24594() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Restoration\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24594,\"icon\":\"https://render.guildwars2.com/file/0877D8E26B3CE964B3A7C2C324C4629B04362A09/220671.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9413,\"description\":\"Gain Health on Killing a Foe\"},\"attributes\":[]},\"suffix\":\"of Restoration\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24595() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Sigil of Hydromancy\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24595,\"icon\":\"https://render.guildwars2.com/file/0729CED7DFF7F9DBD548E7A2420776DF1E33590B/221000.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9426,\"description\":\"Damage nearby foes and chill them for 1 second when you swap to this weapon while in combat.<br><c=@reminder>(Cooldown: 9 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of the Hydromancer\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24596() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Sigil of Hydromancy\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24596,\"icon\":\"https://render.guildwars2.com/file/39CBE5E0E4EDAB33469B0DB8AF93A192920205EF/221001.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9429,\"description\":\"Damage nearby foes and chill them for 1.5 seconds when you swap to this weapon while in combat.<br><c=@reminder>(Cooldown: 9 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of the Hydromancer\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24597() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Hydromancy\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24597,\"icon\":\"https://render.guildwars2.com/file/B5F3E2021863079919299707290698504B5C7E90/220689.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9430,\"description\":\"Damage nearby foes and chill them for 2 seconds when you swap to this weapon while in combat.<br><c=@reminder>(Cooldown: 9 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of the Hydromancer\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24598() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Sigil of Leeching\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24598,\"icon\":\"https://render.guildwars2.com/file/A469E4E2C6D02AA1DC611ABE1ED8A368E57CCFC4/221002.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9419,\"description\":\"Your next attack after swapping to this weapon while in combat steals a small amount of health. <c=@reminder>(Cooldown: 9 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Leeching\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24599() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Leeching\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24599,\"icon\":\"https://render.guildwars2.com/file/BC276BC8AD2497A1E5A905CBDB20425CF2133D78/220690.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9420,\"description\":\"Your next attack after swapping to this weapon while in combat steals some health. <c=@reminder>(Cooldown: 9 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Leeching\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24600() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Intelligence\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24600,\"icon\":\"https://render.guildwars2.com/file/1F41DBAFFA5979D7496F2BB9E4D9AE0F2FA4F940/220685.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9421,\"description\":\"Your next three attacks after swapping to this weapon while in combat have a 100% critical chance. <c=@reminder>(Cooldown: 9 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Intelligence\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24601() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Battle\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24601,\"icon\":\"https://render.guildwars2.com/file/A25A5E7D74A6B293B5C6B8EC7EDA1A06C649CBEF/220691.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9424,\"description\":\"Gain 3 stacks of might (20 seconds) when you swap to this weapon while in combat. <c=@reminder>(Cooldown: 9 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Battle\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24602() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Sigil of Battle\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24602,\"icon\":\"https://render.guildwars2.com/file/70F00CDADC69E69EBE11490E0F047CDA9474C140/221003.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9423,\"description\":\"Gain 2 stacks of might (20 seconds) when you swap to this weapon while in combat. <c=@reminder>(Cooldown: 9 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Battle\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24603() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Sigil of Geomancy\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24603,\"icon\":\"https://render.guildwars2.com/file/B4F6FC2ABADE9335543CA4450F33A85F28C157F2/221004.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9434,\"description\":\"Inflict bleeding on nearby foes for 6 seconds when you swap to this weapon while in combat.<br><c=@reminder>(Cooldown: 9 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of the Geomancer\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}