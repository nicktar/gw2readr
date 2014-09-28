package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0154 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem36054() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Sigil of the Night\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":40,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":36054,\"icon\":\"https://render.guildwars2.com/file/086BE89006344FE16BD31734C026C60D91AA2D09/499392.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":15269,\"description\":\"Outgoing damage is increased by 7% at night.\"},\"attributes\":[]},\"suffix\":\"of the Night\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36055() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Sigil of the Night\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":36055,\"icon\":\"https://render.guildwars2.com/file/13CB0C64F646120D79DF9674E9E4303C517A1C05/499393.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":15270,\"description\":\"Outgoing damage is increased by 5% at night.\"},\"attributes\":[]},\"suffix\":\"of the Night\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36058() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Spiders\",\"description\":\"A gift used to create Mad King weapons.\",\"type\":\"CraftingMaterial\",\"level\":40,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":36058,\"icon\":\"https://render.guildwars2.com/file/CADC465A9678DE9F05463E906B7263AA942F4907/499396.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36059() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Plastic Fangs\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":37,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":36059,\"icon\":\"https://render.guildwars2.com/file/CF1CF7199B7EF969937A7A4E2D3A2652931C5D07/499397.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36060() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chattering Skull\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":37,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":36060,\"icon\":\"https://render.guildwars2.com/file/6B774901B743CDFE002A6258F6260CA93B03BB98/499398.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36061() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Nougat Center\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":37,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":36061,\"icon\":\"https://render.guildwars2.com/file/096A9B4F79A323C335921E30A824AFF505E270BE/499399.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36069() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of the Moon\",\"description\":\"A gift used to create Mad King weapons.\",\"type\":\"CraftingMaterial\",\"level\":40,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":36069,\"icon\":\"https://render.guildwars2.com/file/FE6CE07D9F9150DB4264449BFEBA9B11531670DC/499400.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36072() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Souls\",\"description\":\"A gift used to create Mad King weapons.\",\"type\":\"CraftingMaterial\",\"level\":40,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":36072,\"icon\":\"https://render.guildwars2.com/file/16F932213FB2B4179D5B9A0A0863A5D1D6C80808/499402.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36088() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Candy Corn Orichalcum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":528,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36088,\"icon\":\"https://render.guildwars2.com/file/4A16C159B5A3020C2BE9FBA367EB1CDADAF5EE91/499415.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"suffix_item_id\":24545,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36089() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Candy Corn Gold Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":270,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36089,\"icon\":\"https://render.guildwars2.com/file/A20680A9F44E60E4BA96C72B7A14B36E667E78F4/499416.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36090() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Candy Corn Silver Pendant\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":136,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36090,\"icon\":\"https://render.guildwars2.com/file/B4FC7D1A7D194CF6C2663153FA389556302DC695/499417.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36105() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Endless Multicolored Ooze Tonic\",\"description\":\"Double-click to transform into a random colored ooze for fifteen minutes. You will be unable to fight while transformed.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":36105,\"icon\":\"https://render.guildwars2.com/file/9B32F3B6A202023A10F1E9EC457A0EC1D809DC9A/219350.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36106() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Endless Halloween Tonic\",\"description\":\"Double-click to transform into a random Halloween creature for fifteen minutes. You will be unable to fight while transformed.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoUnderwater\"],\"restrictions\":[],\"id\":36106,\"icon\":\"https://render.guildwars2.com/file/3313DA0547A14A1AC5BE4076FEFD275519E8DF0E/499418.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36169() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Avian 3 Pack\",\"description\":\"Contains: \n• Mini Snow Owl\n• Mini Hawk\n• Mini Raven\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":36169,\"icon\":\"https://render.guildwars2.com/file/EF0CB6DCC726BCA2A740AB16FD0CEA3F3F53F10D/771060.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36171() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Banker Golem (2 weeks)\",\"description\":\"Double-click to access your account bank from anywhere. Reusable.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\",\"NoUnderwater\"],\"restrictions\":[],\"id\":36171,\"icon\":\"https://render.guildwars2.com/file/EE415AA4CF929ED93D5CC168C80F33D453D24EAF/66598.png\",\"details\":{\"type\":\"RentableContractNpc\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36172() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bobblehead Laboratory\",\"description\":\"Spawn a laboratory that you and your friends can interact with.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":36172,\"icon\":\"https://render.guildwars2.com/file/37E7F8187724466DF3E9C1D2AE03BD5D6F034BC4/819618.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36176() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Endless Riding Clothes Tonic\",\"description\":\"Double-click to transform into casual clothes for fifteen minutes. You will be unable to fight while transformed.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":36176,\"icon\":\"https://render.guildwars2.com/file/0C2F7D54EFB13178F70821910A3F331EE3D60471/543868.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36177() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Zephyrite Color Swatch: Green\",\"description\":\"Double-click to open and choose a dye from the green color spectrum.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":36177,\"icon\":\"https://render.guildwars2.com/file/7694437F1F9CBB3A250C95290A582219A113993D/849450.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36178() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Zephyrite Color Swatch: Red\",\"description\":\"Double-click to open and choose a nonexclusive dye from the red spectrum.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":36178,\"icon\":\"https://render.guildwars2.com/file/9B7D9E9D916CF63851920F5AEB05D22ABB7D42E0/831495.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36179() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Endless Common Clothing Tonic\",\"description\":\"Double-click to transform into casual clothes for fifteen minutes. You will be unable to fight while transformed.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":36179,\"icon\":\"https://render.guildwars2.com/file/A146C05DE3F7D9067204BD7EC80F5906B4212AE1/66608.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36180() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Endless Khaki Clothing Tonic\",\"description\":\"Double-click to transform into casual clothes for fifteen minutes. You will be unable to fight while transformed.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":36180,\"icon\":\"https://render.guildwars2.com/file/D80855EB569E5376ACF4D3EAEBB4ED3C5940A26C/575131.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36183() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Endless Designer Hoodie Clothing Tonic\",\"description\":\"Double-click to transform into casual clothes for fifteen minutes. You will be unable to fight while transformed.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":36183,\"icon\":\"https://render.guildwars2.com/file/3AE6C52608D603F46939E01401BBC945CB7CA8AC/543870.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36184() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Endless Leather Hoodie Clothing Tonic\",\"description\":\"Double-click to transform into casual clothes for fifteen minutes. You will be unable to fight while transformed.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":36184,\"icon\":\"https://render.guildwars2.com/file/F1915CB0F11804E5985098781E96616362AC17DD/543867.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36185() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Endless Silk Brocade Clothing Tonic\",\"description\":\"Double-click to transform into casual clothes for fifteen minutes. You will be unable to fight while transformed.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":36185,\"icon\":\"https://render.guildwars2.com/file/C82F075E5EB4E7C4CEA25DD35D03F4AD73FF0299/561963.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36186() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Endless Layered Vest Clothing Tonic\",\"description\":\"Double-click to transform into casual clothes for fifteen minutes. You will be unable to fight while transformed.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":36186,\"icon\":\"https://render.guildwars2.com/file/02AA5338F932FC970248CBAAB8DB4B2D6C075149/561961.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}