package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0178 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem42007() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Brilliant Azurite Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":42007,\"icon\":\"https://render.guildwars2.com/file/C4DFBB5007D65E6CF17622312ACD01C377AB22E4/561995.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":17758,\"description\":\"+18 Vitality\n+12 Power\n+12 Toughness\"},\"attributes\":[]},\"suffix\":\"of Azurite\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42008() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Exquisite Azurite Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":264,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":42008,\"icon\":\"https://render.guildwars2.com/file/96966E9606695638B2A126EBC0F70F6DF0952B1D/561996.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":17761,\"description\":\"+25 Vitality\n+15 Power\n+15 Toughness\"},\"attributes\":[]},\"suffix\":\"of Azurite\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42009() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embellished Brilliant Azurite Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":42009,\"icon\":\"https://render.guildwars2.com/file/0FCC4F03C80200E2B3C63E6DE420E31F7009F809/561997.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":17759,\"description\":\"+21 Vitality\n+13 Power\n+13 Toughness\"},\"attributes\":[]},\"suffix\":\"of Azurite\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42010() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Azurite Orb\",\"description\":\"Double-click to apply to an item with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":198,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":42010,\"icon\":\"https://render.guildwars2.com/file/33A24CED131E010FB63B60C1303B5AEDC606B528/575165.png\",\"details\":{\"type\":\"Gem\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":17760,\"description\":\"+20 Vitality\n+14 Power\n+14 Toughness\"},\"attributes\":[]},\"suffix\":\"of Azurite\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42402() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Molten Firestorm\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":42402,\"icon\":\"https://render.guildwars2.com/file/55E7F7E69AD39332F40CC5EAC5949B0B6F556E43/575056.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42403() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Infinite Molten Berserker Tonic\",\"description\":\"Double-click to drink, transforming you into a Molten berserker for 5 minutes. You will be unable to fight while transformed.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\",\"NoUnderwater\"],\"restrictions\":[],\"id\":42403,\"icon\":\"https://render.guildwars2.com/file/5917380D6E59B749C438C1FF0D4B63A3063A6B65/575057.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42417() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Fused Gauntlet Ticket\",\"description\":\"Double-click to summon a vendor for 5 minutes, allowing you to purchase your choice of Fused Gauntlets. This ticket is the currency to obtain the item. Reusable until the ticket is exchanged.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\",\"NoUnderwater\"],\"restrictions\":[],\"id\":42417,\"icon\":\"https://render.guildwars2.com/file/F140F06C76657BB6D466180466C75B08760B0380/575062.png\",\"details\":{\"type\":\"RentableContractNpc\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42577() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Moa Chick\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42577,\"icon\":\"https://render.guildwars2.com/file/18C0CACC25966B6767BC7AA10BD37773BAF315B5/575066.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42578() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Piglet\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42578,\"icon\":\"https://render.guildwars2.com/file/6B584AC4ECA26C52573D192A75050101410D450F/780158.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42579() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Hippo Calf\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42579,\"icon\":\"https://render.guildwars2.com/file/B314031801A5AF1C7D5F45DB614D3E93A7BB695F/575067.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42581() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Arctodus Cub\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42581,\"icon\":\"https://render.guildwars2.com/file/F06F2429A95BC07508DA6EC7F5F800B1574B51EC/780159.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42582() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Polar Bear Cub\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42582,\"icon\":\"https://render.guildwars2.com/file/69602E5C0208035273105DFAE5153E707373FEA4/780160.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42583() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Orange Kitten\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42583,\"icon\":\"https://render.guildwars2.com/file/3B5E3F51DB7B9FC50D0EF5AE0AD9982EA92C2595/780161.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42584() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Jaguar Cub\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42584,\"icon\":\"https://render.guildwars2.com/file/4EE360A7C2DF553738B8D37C24F346EB98691845/780162.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42591() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini White Kitten\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42591,\"icon\":\"https://render.guildwars2.com/file/2894EAAF97F2260250B5223511A40A3FC36E4D50/575068.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42592() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Black Bear Cub\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42592,\"icon\":\"https://render.guildwars2.com/file/27CCA26572A9362BC1153F77C8DBFC0AAD2638F3/575069.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42593() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Lion Cub\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42593,\"icon\":\"https://render.guildwars2.com/file/7DA3DFCC7DC90302C3F0E23A5C919F242D1F485B/575070.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42594() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Consortium Harvesting Sickle\",\"description\":\"Used to harvest all plants. Unlimited use.\",\"type\":\"Gathering\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":192,\"default_skin\":2387,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":42594,\"icon\":\"https://render.guildwars2.com/file/17EED9D8F570EF1EF00045533F65CD791EA4D0FB/582347.png\",\"details\":{\"type\":\"Foraging\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42598() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Southsun Faren\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":42598,\"icon\":\"https://render.guildwars2.com/file/011A66FD2AED7A05DF3B91A1ACF5446058B7D5AB/582352.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42599() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Southsun Kasmeer\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":42599,\"icon\":\"https://render.guildwars2.com/file/18571536A2994F9622D9E4AC5BD5B14472AA2E4F/582353.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42600() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Southsun Supply Crate\",\"description\":\"Used by the new settlers of Southsun, these chests have a rare chance to contain a token for a new sclerite weapon skin, and even more rarely, new mini pets.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42600,\"icon\":\"https://render.guildwars2.com/file/C8D3D7C3E5A0C1EF48F9A855179B74FD171C2320/582354.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42661() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rox's Quiver Set\",\"description\":\"This quiver has a simple back strap to wear if you don't have another back-slot item.\nDouble-click to unpack.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42661,\"icon\":\"https://render.guildwars2.com/file/199C1663EB03FD02E20CD8DFE11C38C29B0FC1A2/575136.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42667() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Top 10 Qualifying Points Rewards Package\",\"description\":\"Double-click to receive your Qualifying Points rewards.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42667,\"icon\":\"https://render.guildwars2.com/file/6E9FA3C99A223677280CD9154A3FB50E2B43AE5B/66895.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42668() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Top 25 Qualifying Points Rewards Package\",\"description\":\"Double-click to receive your Qualifying Points rewards.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42668,\"icon\":\"https://render.guildwars2.com/file/6E9FA3C99A223677280CD9154A3FB50E2B43AE5B/66895.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42669() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Top 50 Qualifying Points Rewards Package\",\"description\":\"Double-click to receive your Qualifying Points rewards.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":42669,\"icon\":\"https://render.guildwars2.com/file/6E9FA3C99A223677280CD9154A3FB50E2B43AE5B/66895.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}