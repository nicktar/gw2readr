package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0176 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem39617() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Resilient Infusion\",\"description\":\"Double-click to apply to an unused defensive infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39617,\"icon\":\"https://render.guildwars2.com/file/4DF43AFD06A460A19C90B011D3157BA969AD21CE/511844.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[\"Defense\"],\"infix_upgrade\":{\"buff\":{\"skill_id\":17067,\"description\":\"+7 Toughness\n+6 Agony Resistance\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39619() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Malign Infusion\",\"description\":\"Double-click to apply to an unused offensive infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39619,\"icon\":\"https://render.guildwars2.com/file/9A137B0106F9DE9A044596FE95C20D072CA093F3/511840.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[\"Offense\"],\"infix_upgrade\":{\"buff\":{\"skill_id\":17063,\"description\":\"+7 Condition Damage\n+6 Agony Resistance\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39711() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Endless Guild Banner Tonic\",\"description\":\"Transform into your guild's banner for 15 minutes or until hit. You cannot move while transformed.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"NotUpgradeable\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39711,\"icon\":\"https://render.guildwars2.com/file/80DDFCD0B326F7FE3A264A58BAB4B377DA274D70/222650.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39712() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Miniature Red Siege Golem\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39712,\"icon\":\"https://render.guildwars2.com/file/BD472564B2C0ECDE5107EEDFD9F3ED9AB0970C2D/543943.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39713() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Miniature Green Siege Golem\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39713,\"icon\":\"https://render.guildwars2.com/file/3EA8685D80E6CC2B0A629B9ADEAC46A41AFB2AA9/543944.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39714() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Miniature Blue Siege Golem\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39714,\"icon\":\"https://render.guildwars2.com/file/B813D84A073EFC5867614B77BF72C743EC9DE010/543945.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39751() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Match Win Reward Chest\",\"description\":\"Double-click to receive your PvP rewards.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":39751,\"icon\":\"https://render.guildwars2.com/file/666209104CCB024D53359C0EA0A299076E610771/65704.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39752() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bauble\",\"description\":\"Spend these in shops inside the Super Adventure Box.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39752,\"icon\":\"https://render.guildwars2.com/file/AE5AE77B1B291BA6A418B9F80B43CF3D437D0806/561983.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41368() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Order Cryptotranslator\",\"description\":\"This device decrypts dead drop messages left by an undercover Order of Whispers agent.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":41368,\"icon\":\"https://render.guildwars2.com/file/E2AE67DCD291FB4901659E679BA6E7679DB44225/66656.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41446() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Azurite Mithril Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":124,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":41446,\"icon\":\"https://render.guildwars2.com/file/9CFA13B14A097DA34851035DBC64DC9BBECCA0FB/561694.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":61},{\"attribute\":\"Power\",\"modifier\":44},{\"attribute\":\"Toughness\",\"modifier\":44}]},\"suffix_item_id\":42006,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41447() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Azurite Mithril Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":264,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":41447,\"icon\":\"https://render.guildwars2.com/file/9CFA13B14A097DA34851035DBC64DC9BBECCA0FB/561694.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":73},{\"attribute\":\"Power\",\"modifier\":52},{\"attribute\":\"Toughness\",\"modifier\":52}]},\"suffix_item_id\":42007,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41448() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Azurite Mithril Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":41448,\"icon\":\"https://render.guildwars2.com/file/0B6261F83EF3019B70E23C2472CE19BF724ABCD5/561695.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":79},{\"attribute\":\"Power\",\"modifier\":56},{\"attribute\":\"Toughness\",\"modifier\":56}]},\"suffix_item_id\":42009,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41449() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Azurite Orichalcum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":528,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":41449,\"icon\":\"https://render.guildwars2.com/file/E9D34D4C3A0BABDABDA61C2AC82B0AEDAB5CAA50/561696.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":90},{\"attribute\":\"Power\",\"modifier\":64},{\"attribute\":\"Toughness\",\"modifier\":64}]},\"suffix_item_id\":42008,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41450() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Azurite Mithril Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":78,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":41450,\"icon\":\"https://render.guildwars2.com/file/5E090DFE5D52190D999BCBFDF5AAFD716878DB1F/561697.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":38},{\"attribute\":\"Power\",\"modifier\":27},{\"attribute\":\"Toughness\",\"modifier\":27}]},\"suffix_item_id\":42006,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41451() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Azurite Mithril Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":41451,\"icon\":\"https://render.guildwars2.com/file/5E090DFE5D52190D999BCBFDF5AAFD716878DB1F/561697.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":46},{\"attribute\":\"Power\",\"modifier\":33},{\"attribute\":\"Toughness\",\"modifier\":33}]},\"suffix_item_id\":42007,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41452() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Azurite Mithril Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":248,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":41452,\"icon\":\"https://render.guildwars2.com/file/CD59700FCF716BDDA21D145EA1DBEDA722BDC3CA/561698.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":49},{\"attribute\":\"Power\",\"modifier\":35},{\"attribute\":\"Toughness\",\"modifier\":35}]},\"suffix_item_id\":42009,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41453() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Azurite Orichalcum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":41453,\"icon\":\"https://render.guildwars2.com/file/06D7B56D16B36A4968B862CBBEB942520D61809D/561699.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":56},{\"attribute\":\"Power\",\"modifier\":40},{\"attribute\":\"Toughness\",\"modifier\":40}]},\"suffix_item_id\":42008,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41454() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Azurite Mithril Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":93,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":41454,\"icon\":\"https://render.guildwars2.com/file/2376774BA3013306D5AB659B0D98C8A203C0270F/561700.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":46},{\"attribute\":\"Power\",\"modifier\":33},{\"attribute\":\"Toughness\",\"modifier\":33}]},\"suffix_item_id\":42006,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41455() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Azurite Mithril Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":198,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":41455,\"icon\":\"https://render.guildwars2.com/file/2376774BA3013306D5AB659B0D98C8A203C0270F/561700.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":55},{\"attribute\":\"Power\",\"modifier\":39},{\"attribute\":\"Toughness\",\"modifier\":39}]},\"suffix_item_id\":42007,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41456() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Azurite Mithril Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":297,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":41456,\"icon\":\"https://render.guildwars2.com/file/971ECEBAA0CE41AC3EBB1597B72574C43B7F0AFC/561701.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":59},{\"attribute\":\"Power\",\"modifier\":42},{\"attribute\":\"Toughness\",\"modifier\":42}]},\"suffix_item_id\":42009,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41457() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Azurite Orichalcum Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":41457,\"icon\":\"https://render.guildwars2.com/file/B0C192B16CDE79809196965E92D0C1EBDE0AF408/561702.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":67},{\"attribute\":\"Power\",\"modifier\":48},{\"attribute\":\"Toughness\",\"modifier\":48}]},\"suffix_item_id\":42008,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41553() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sentinel's Silk Insignia\",\"description\":\"Used in the crafting of armor with +Vitality, +Power, and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":41553,\"icon\":\"https://render.guildwars2.com/file/E6AAAECBAB0AE39FD7D465CF69FFA9122EA10494/561703.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41554() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sentinel's Embroidered Silk Insignia\",\"description\":\"Used in the crafting of armor with +Vitality, +Power, and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":41554,\"icon\":\"https://render.guildwars2.com/file/FCE12C63DEC706090DC6D021C2CD3DF5A548205D/561704.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41555() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sentinel's Intricate Silk Insignia\",\"description\":\"Used in the crafting of armor with +Vitality, +Power, and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":41555,\"icon\":\"https://render.guildwars2.com/file/0192966497087360BC7CD42796D90BC405645DF6/561705.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41556() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sentinel's Intricate Gossamer Insignia\",\"description\":\"Used in the crafting of armor with +Vitality, +Power, and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":41556,\"icon\":\"https://render.guildwars2.com/file/9F02A47A7EFD422C7561EBB7A67C922FB1A190DC/561706.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}