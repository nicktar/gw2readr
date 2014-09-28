package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0084 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem21123() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sigil of Hobbling\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21123,\"icon\":\"https://render.guildwars2.com/file/AEB1F57BB591D53B3BD459445C42736722CDA8EE/220660.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9316,\"description\":\"Increase Inflicted Cripple Duration: 20%\"},\"attributes\":[]},\"suffix\":\"of Hobbling\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21124() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sigil of Accuracy\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21124,\"icon\":\"https://render.guildwars2.com/file/4B0EFF29FD064E5E93E4F8616BE309A451450AED/220661.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9325,\"description\":\"+7% Critical Chance\"},\"attributes\":[]},\"suffix\":\"of Accuracy\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21125() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sigil of Force\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21125,\"icon\":\"https://render.guildwars2.com/file/D7420E430D002E07382035EF0D0F77370C4EE6B8/220662.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9322,\"description\":\"+5% Damage\"},\"attributes\":[]},\"suffix\":\"of Force\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21126() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sigil of Chilling\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21126,\"icon\":\"https://render.guildwars2.com/file/F7C54D53F1CDB2094B9C4FEA2FA455ADC54492B4/220663.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9315,\"description\":\"Increase Inflicted Chill Duration: 20%\"},\"attributes\":[]},\"suffix\":\"of Chilling\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21127() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sigil of Venom\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21127,\"icon\":\"https://render.guildwars2.com/file/080B4F940A05E60A084AA4B1D230F923A1A47CEC/220664.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9317,\"description\":\"Increase Inflicted Poison Duration: 20%\"},\"attributes\":[]},\"suffix\":\"of Venom\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21128() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sigil of Paralyzation\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21128,\"icon\":\"https://render.guildwars2.com/file/0C1378BB6AADCB1C157332776C3476EBC66CD2DA/220665.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9328,\"description\":\"+30% Stun Duration\"},\"attributes\":[]},\"suffix\":\"of Paralyzation\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21129() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sigil of Peril\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21129,\"icon\":\"https://render.guildwars2.com/file/F9D2B90F653C555D08B2C62CAC7605AA2793929B/220666.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9318,\"description\":\"Increase Inflicted Vulnerability Duration: 20%\"},\"attributes\":[]},\"suffix\":\"of Peril\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21130() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sigil of Debility\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21130,\"icon\":\"https://render.guildwars2.com/file/33FB5EED4B3F16F3CC2538B178B645BE5CA67CF2/220667.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9319,\"description\":\"Increase Inflicted Weakness Duration: 20%\"},\"attributes\":[]},\"suffix\":\"of Debility\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21131() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sigil of Corruption\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21131,\"icon\":\"https://render.guildwars2.com/file/D574E4D29FA31DB815F76FD5FE4CA1EBFACA22B9/220668.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9377,\"description\":\"Gain a charge of +10 condition damage each time you kill a foe, five if you kill an enemy player. <c=@reminder>(Max 25 stacks; ends on down.)</c> <br><c=@reminder>(Only one attribute-stacking sigil can be active at a time.)</c>\"},\"attributes\":[]},\"suffix\":\"of Corruption\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21132() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sigil of Stamina\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21132,\"icon\":\"https://render.guildwars2.com/file/970DD319EC0E7455E941CD5DA840C10EA6EF160E/220669.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9414,\"description\":\"Your endurance is refilled each time you kill a foe.\"},\"attributes\":[]},\"suffix\":\"of Stamina\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21133() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sigil of Life\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21133,\"icon\":\"https://render.guildwars2.com/file/A7AE0E9D0DF64B69EF309D93E44FFAA90859ABA0/220670.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9389,\"description\":\"Gain a charge of +10 healing each time you kill a foe, five if you kill an enemy player. <c=@reminder>(Max 25 stacks; ends on down.)</c> <br><c=@reminder>(Only one attribute-stacking sigil can be active at a time.)</c>\"},\"attributes\":[]},\"suffix\":\"of Life\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21134() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sigil of Restoration\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21134,\"icon\":\"https://render.guildwars2.com/file/0877D8E26B3CE964B3A7C2C324C4629B04362A09/220671.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9413,\"description\":\"Gain Health on Killing a Foe\"},\"attributes\":[]},\"suffix\":\"of Restoration\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21135() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sigil of Benevolence\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21135,\"icon\":\"https://render.guildwars2.com/file/0147AE350DEB5561D427EC41F6F4B35523707320/220672.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9401,\"description\":\"Gain a charge that grants 0.5% outgoing healing effectiveness toward other allies each time you kill a foe, five if you kill an enemy player. <c=@reminder>(Max 25 stacks; ends on down.)</c><br><c=@reminder>(Only one attribute-stacking sigil can be active at a time.)</c>\"},\"attributes\":[]},\"suffix\":\"of Benevolence\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21136() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sigil of Bloodlust\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21136,\"icon\":\"https://render.guildwars2.com/file/77AAE10D3E03036D6E00642DEF01E5DF3468524F/220673.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9297,\"description\":\"Gain a charge of +10 power each time you kill a foe, five if you kill an enemy player. <c=@reminder>(Max 25 stacks; ends on down.)</c> <br><c=@reminder>(Only one attribute-stacking sigil can be active at a time.)</c>\"},\"attributes\":[]},\"suffix\":\"of Bloodlust\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21137() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sigil of Perception\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21137,\"icon\":\"https://render.guildwars2.com/file/4B0EFF29FD064E5E93E4F8616BE309A451450AED/220661.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9382,\"description\":\"Gain a charge of +10 precision each time you kill a foe, five if you kill an enemy player. <c=@reminder>(Max 25 stacks; ends on down.)</c> <br><c=@reminder>(Only one attribute-stacking sigil can be active at a time.)</c>\"},\"attributes\":[]},\"suffix\":\"of Perception\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21138() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sigil of Demon Summoning\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21138,\"icon\":\"https://render.guildwars2.com/file/52D5D9FE5E0B9091415092A9E21DE830010D2E0E/220674.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9395,\"description\":\"Gain a summoning charge whenever you kill a foe. At 25 charges, you summon a fleshreaver. <c=@reminder>(You lose all charges on down.)</c>\"},\"attributes\":[]},\"suffix\":\"of Demon Summoning\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21139() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sigil of Speed\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21139,\"icon\":\"https://render.guildwars2.com/file/E2BE561DB46692BF67F7AF2FDCA21FCA5D250D36/220675.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9404,\"description\":\"Gain Swiftness (20 Seconds) on Killing a Foe\"},\"attributes\":[]},\"suffix\":\"of Speed\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21140() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sigil of Air\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21140,\"icon\":\"https://render.guildwars2.com/file/C337CC61DF2F5EE44B7D053EFF33059111024444/220676.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9448,\"description\":\"50% Chance on Critical: Cause a Lightning Strike<br><c=@reminder>(Cooldown: 3 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Air\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21141() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sigil of Earth\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21141,\"icon\":\"https://render.guildwars2.com/file/251EE3B8B5ADB8D7F7A35DBAEFABA35AEACDF51B/220677.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9452,\"description\":\"60% Chance on Critical: Inflict Bleeding (5 Seconds)<br><c=@reminder>(Cooldown: 2 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Earth\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21142() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sigil of Fire\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21142,\"icon\":\"https://render.guildwars2.com/file/AFFE7977FCE450E8105EBADA7436050CB7011BDB/220678.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9444,\"description\":\"50% Chance on Critical: Trigger a Flame Blast for area of effect damage (240 radius). <br><c=@reminder>(Cooldown: 5 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Fire\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21143() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sigil of Rage\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21143,\"icon\":\"https://render.guildwars2.com/file/15310B48271FC15332C65C5E02FEC4FFF298B652/220679.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9295,\"description\":\"50% Chance on Critical: Gain Quickness (3 Seconds)<br><c=@reminder>(Cooldown: 30 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Rage\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21144() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sigil of Ice\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21144,\"icon\":\"https://render.guildwars2.com/file/10E0D93F4B303CD03F6FEE0C5AAEEB070E0EFAC1/220680.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9450,\"description\":\"30% Chance on Hit: Inflict Chill (2 Seconds)<br><c=@reminder>(Cooldown: 10 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Ice\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21145() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sigil of Blood\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21145,\"icon\":\"https://render.guildwars2.com/file/BFD4F5E6A8B95866BBA7CDC0E8920D0346337934/220681.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9458,\"description\":\"50% Chance on Critical: Steal Health <br><c=@reminder>(Cooldown: 5 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Blood\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21146() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sigil of Strength\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21146,\"icon\":\"https://render.guildwars2.com/file/71C00204BDD7FC11AAE1906FC2EF7D37A35DF82E/220682.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9454,\"description\":\"60% Chance on Critical: Gain Might (10 Seconds)<br><c=@reminder>(Cooldown: 1 Second)</c>\"},\"attributes\":[]},\"suffix\":\"of Strength\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21147() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sigil of Frailty\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21147,\"icon\":\"https://render.guildwars2.com/file/58EF3FB57B16D9F12ACCC2E67225CC2697C7C866/220683.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9456,\"description\":\"50% Chance on Hit: Inflict Vulnerability (10 Seconds)<br><c=@reminder>(Cooldown: 2 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Frailty\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}