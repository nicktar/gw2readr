package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0137 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem24554() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Air\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24554,\"icon\":\"https://render.guildwars2.com/file/C337CC61DF2F5EE44B7D053EFF33059111024444/220676.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9448,\"description\":\"50% Chance on Critical: Cause a Lightning Strike<br><c=@reminder>(Cooldown: 3 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Air\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24555() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Ice\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24555,\"icon\":\"https://render.guildwars2.com/file/10E0D93F4B303CD03F6FEE0C5AAEEB070E0EFAC1/220680.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9450,\"description\":\"30% Chance on Hit: Inflict Chill (2 Seconds)<br><c=@reminder>(Cooldown: 10 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Ice\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24556() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Sigil of Ice\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24556,\"icon\":\"https://render.guildwars2.com/file/105B5393BC6B17D641AECC133F410126C7592702/220978.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9449,\"description\":\"20% Chance on Hit: Inflict Chill (1 Second)<br><c=@reminder>(Cooldown: 10 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Ice\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24557() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Sigil of Ice\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24557,\"icon\":\"https://render.guildwars2.com/file/73AC614458AF591073381A0B262C28B0FEFC5E3B/220979.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9279,\"description\":\"10% Chance on Hit: Inflict Chill (1 Second)<br><c=@reminder>(Cooldown: 10 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Ice\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24558() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Sigil of Earth\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24558,\"icon\":\"https://render.guildwars2.com/file/1CEAD10096D3FB1B034F7D0A26090AEA387C28E4/220980.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9278,\"description\":\"30% Chance on Critical: Inflict Bleeding (3 Seconds)<br><c=@reminder>(Cooldown: 2 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Earth\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24559() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Sigil of Earth\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24559,\"icon\":\"https://render.guildwars2.com/file/C6F2F1B3013DCBAD1CE1E2D85DF30CB5D5337A05/220981.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9451,\"description\":\"45% Chance on Critical: Inflict Bleeding (4 Seconds)<br><c=@reminder>(Cooldown: 2 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Earth\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24560() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Earth\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24560,\"icon\":\"https://render.guildwars2.com/file/251EE3B8B5ADB8D7F7A35DBAEFABA35AEACDF51B/220677.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9452,\"description\":\"60% Chance on Critical: Inflict Bleeding (5 Seconds)<br><c=@reminder>(Cooldown: 2 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Earth\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24561() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Rage\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24561,\"icon\":\"https://render.guildwars2.com/file/15310B48271FC15332C65C5E02FEC4FFF298B652/220679.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9295,\"description\":\"50% Chance on Critical: Gain Quickness (3 Seconds)<br><c=@reminder>(Cooldown: 30 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Rage\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24562() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Strength\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24562,\"icon\":\"https://render.guildwars2.com/file/71C00204BDD7FC11AAE1906FC2EF7D37A35DF82E/220682.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9454,\"description\":\"60% Chance on Critical: Gain Might (10 Seconds)<br><c=@reminder>(Cooldown: 1 Second)</c>\"},\"attributes\":[]},\"suffix\":\"of Strength\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24563() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Sigil of Strength\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24563,\"icon\":\"https://render.guildwars2.com/file/9E796026D9E2F6550D959054EBB60D416E72A5EF/220982.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9453,\"description\":\"40% Chance on Critical: Gain Might (7 Seconds)<br><c=@reminder>(Cooldown: 1 Second)</c>\"},\"attributes\":[]},\"suffix\":\"of Strength\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24564() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Sigil of Strength\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24564,\"icon\":\"https://render.guildwars2.com/file/08357DEE4E055A09F82A3D2DC94B9A1C96ED5404/220983.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9277,\"description\":\"20% Chance on Critical: Gain Might (5 Seconds)<br><c=@reminder>(Cooldown: 1 Second)</c>\"},\"attributes\":[]},\"suffix\":\"of Strength\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24565() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Sigil of Frailty\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24565,\"icon\":\"https://render.guildwars2.com/file/5976D7EC1D0F307E5E801E6FCE9ED7291C5103AD/220984.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9287,\"description\":\"10% Chance on Hit: Inflict Vulnerability (10 Seconds)<br><c=@reminder>(Cooldown: 2 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Frailty\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24566() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Sigil of Frailty\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24566,\"icon\":\"https://render.guildwars2.com/file/421080E3E3C918F3C821CFF4109A4A15BB0EDA56/220985.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9455,\"description\":\"25% Chance on Hit: Inflict Vulnerability (10 Seconds)<br><c=@reminder>(Cooldown: 2 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Frailty\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24567() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Frailty\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24567,\"icon\":\"https://render.guildwars2.com/file/58EF3FB57B16D9F12ACCC2E67225CC2697C7C866/220683.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9456,\"description\":\"50% Chance on Hit: Inflict Vulnerability (10 Seconds)<br><c=@reminder>(Cooldown: 2 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Frailty\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24568() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Sigil of Blood\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24568,\"icon\":\"https://render.guildwars2.com/file/64A79CCD42D858AA7FF39A0CF1AEEC800FE1966F/220986.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9288,\"description\":\"10% Chance on Critical: Steal Health <br><c=@reminder>(Cooldown: 5 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Blood\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24569() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Sigil of Blood\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24569,\"icon\":\"https://render.guildwars2.com/file/010AF830E933C3C4D1B9912C4102D2A5FF021D91/220987.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9457,\"description\":\"25% Chance on Critical: Steal Health <br><c=@reminder>(Cooldown: 5 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Blood\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24570() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Blood\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24570,\"icon\":\"https://render.guildwars2.com/file/BFD4F5E6A8B95866BBA7CDC0E8920D0346337934/220681.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9458,\"description\":\"50% Chance on Critical: Steal Health <br><c=@reminder>(Cooldown: 5 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Blood\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24571() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Purity\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24571,\"icon\":\"https://render.guildwars2.com/file/C3E907DE24CF72CE490639710F46CDCD917D5B06/220745.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9289,\"description\":\"60% Chance on Hit: Remove a Condition<br><c=@reminder>(Cooldown: 10 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Purity\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24572() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Nullification\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24572,\"icon\":\"https://render.guildwars2.com/file/B926E1026E6E271D3B9F9A177710E3A8C801FFF3/220744.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9290,\"description\":\"60% Chance on Critical: Remove a Boon<br><c=@reminder>(Cooldown: 10 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Nullification\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24573() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Sigil of Bloodlust\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24573,\"icon\":\"https://render.guildwars2.com/file/2BE192D72AD8F3DF06AA54FD12066960A349C8F2/220988.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9282,\"description\":\"Gain a charge of +5 power each time you kill a foe, five if you kill an enemy player. <c=@reminder>(Max 25 stacks; ends on down.)</c> <br><c=@reminder>(Only one attribute-stacking sigil can be active at a time.)</c>\"},\"attributes\":[]},\"suffix\":\"of Bloodlust\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24574() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Sigil of Bloodlust\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24574,\"icon\":\"https://render.guildwars2.com/file/362F43FD9D03AE3D0A2E6B49F7720D010D4FA017/220989.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9296,\"description\":\"Gain a charge of +7 power each time you kill a foe, five if you kill an enemy player. <c=@reminder>(Max 25 stacks; ends on down.)</c> <br><c=@reminder>(Only one attribute-stacking sigil can be active at a time.)</c>\"},\"attributes\":[]},\"suffix\":\"of Bloodlust\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24575() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Bloodlust\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24575,\"icon\":\"https://render.guildwars2.com/file/77AAE10D3E03036D6E00642DEF01E5DF3468524F/220673.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9297,\"description\":\"Gain a charge of +10 power each time you kill a foe, five if you kill an enemy player. <c=@reminder>(Max 25 stacks; ends on down.)</c> <br><c=@reminder>(Only one attribute-stacking sigil can be active at a time.)</c>\"},\"attributes\":[]},\"suffix\":\"of Bloodlust\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24576() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Sigil of Corruption\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24576,\"icon\":\"https://render.guildwars2.com/file/066A6C02FB099CD023931E5A0A534E18FA7F5A1F/220990.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9379,\"description\":\"Gain a charge of +5 condition damage each time you kill a foe, five if you kill an enemy player. <c=@reminder>(Max 25 stacks; ends on down.)</c> <br><c=@reminder>(Only one attribute-stacking sigil can be active at a time.)</c>\"},\"attributes\":[]},\"suffix\":\"of Corruption\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24577() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Sigil of Corruption\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24577,\"icon\":\"https://render.guildwars2.com/file/0267261E50A5D8ACE7CAA9C55D2FAFB84C5C606A/220991.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9378,\"description\":\"Gain a charge of +7 condition damage each time you kill a foe, five if you kill an enemy player. <c=@reminder>(Max 25 stacks; ends on down.)</c> <br><c=@reminder>(Only one attribute-stacking sigil can be active at a time.)</c>\"},\"attributes\":[]},\"suffix\":\"of Corruption\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24578() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Corruption\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24578,\"icon\":\"https://render.guildwars2.com/file/D574E4D29FA31DB815F76FD5FE4CA1EBFACA22B9/220668.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9377,\"description\":\"Gain a charge of +10 condition damage each time you kill a foe, five if you kill an enemy player. <c=@reminder>(Max 25 stacks; ends on down.)</c> <br><c=@reminder>(Only one attribute-stacking sigil can be active at a time.)</c>\"},\"attributes\":[]},\"suffix\":\"of Corruption\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}