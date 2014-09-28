package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0214 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem48833() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Splendid Chest\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":48833,\"icon\":\"https://render.guildwars2.com/file/730A99AC6A69DD0F5352DAD56A91FC09D76F0D39/62860.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48877() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Toxic Hybrid\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSell\"],\"restrictions\":[],\"id\":48877,\"icon\":\"https://render.guildwars2.com/file/0B18DC4908C424B43F36DCB3F019AE5CC090470C/665770.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48879() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Toxic Nimross\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48879,\"icon\":\"https://render.guildwars2.com/file/9DA3485C5FDAB0041E192A0A693A26C203350C53/665772.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48882() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mushed Spore Sample\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":17,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":48882,\"icon\":\"https://render.guildwars2.com/file/A9900F02F8CB0CB124FD5E94979855BDBEDA77F7/65897.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48884() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pristine Toxic Spore Sample\",\"description\":\"Use in crafting recipes.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":147,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSell\"],\"restrictions\":[],\"id\":48884,\"icon\":\"https://render.guildwars2.com/file/78B90364F0FA4806E6600DD260BE2EBC51D1431D/665773.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48907() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of Antitoxin\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":48907,\"icon\":\"https://render.guildwars2.com/file/0747F00D03B499F1CEE2075F9FFE9F4998C6D2B6/665777.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+28 Condition Damage\",\"-4% condition duration applied to you.\",\"+55 Condition Damage\",\"-8% condition duration applied to you.\",\"+100 Condition Damage\",\"-12% condition duration applied to you.\nGain 5 stacks of might for 10 seconds on incoming poison or torment (20s cooldown)\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Antitoxin\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48911() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Torment\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":48911,\"icon\":\"https://render.guildwars2.com/file/E42EB6198022E5B4D71C5EE41465DD4EB84A0465/665778.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":21824,\"description\":\"50% chance on critical: Apply AoE torment (5 seconds, 180 radius).<br><c=@reminder>(Cooldown: 5 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Torment\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48930() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Consortium Harvesting Sickle\",\"description\":\"Used to harvest all plants. Unlimited use.\",\"type\":\"Gathering\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"default_skin\":2387,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48930,\"icon\":\"https://render.guildwars2.com/file/17EED9D8F570EF1EF00045533F65CD791EA4D0FB/582347.png\",\"details\":{\"type\":\"Foraging\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48931() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chop-It-All Logging Axe\",\"description\":\"Perfect for use on all types of trees. Unlimited use.\",\"type\":\"Gathering\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"default_skin\":2391,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48931,\"icon\":\"https://render.guildwars2.com/file/15CF97BA7DC573E2BCA852FF1364721B98531470/598608.png\",\"details\":{\"type\":\"Logging\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48932() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bone Pick\",\"description\":\"Used to mine all metals. Unlimited use.\",\"type\":\"Gathering\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"default_skin\":2398,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48932,\"icon\":\"https://render.guildwars2.com/file/9827C507181C6B305EA026C2F1EB7448AA390CD5/638367.png\",\"details\":{\"type\":\"Mining\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48933() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Molten Alliance Mining Pick\",\"description\":\"Used to mine all metals. Unlimited use.\",\"type\":\"Gathering\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"default_skin\":2399,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48933,\"icon\":\"https://render.guildwars2.com/file/ACF90CA6BCD9CEEFD4D0DCEF2AA87C97B50BDC56/561815.png\",\"details\":{\"type\":\"Mining\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48934() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jack-in-the-Box Scythe\",\"description\":\"Used to harvest all plants. Unlimited use.\",\"type\":\"Gathering\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"default_skin\":2387,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48934,\"icon\":\"https://render.guildwars2.com/file/B8FAB3CF449D4BF50BD29AEA7B1A753F7E5CE792/643281.png\",\"details\":{\"type\":\"Foraging\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48936() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Great Jungle Wurm 3 Pack\",\"description\":\"Contains 1 of each of these miniatures:\n• Mini Amber Great Jungle Wurm\n• Mini Crimson Great Jungle Wurm\n• Mini Cobalt Great Jungle Wurm\n\nEach mini can be activated from your inventory to follow you around the world.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48936,\"icon\":\"https://render.guildwars2.com/file/6A2AC1F20D745298A26444277F3FDA680E7EE1A0/711987.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48954() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Toxic Dye Kit\",\"description\":\"Double-click to gain one random toxic-inspired color. Includes a chance at 1 of 6 exclusive colors.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48954,\"icon\":\"https://render.guildwars2.com/file/9CA420D41AC95B0507CE2F5BBFF9E0BBE8C44E3E/665807.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem48955() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dreamcleaver Logging Axe\",\"description\":\"Perfect for use on all types of trees. Unlimited use.\",\"type\":\"Gathering\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":192,\"default_skin\":2392,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":48955,\"icon\":\"https://render.guildwars2.com/file/0334AF66EB5E182C4C0FB2576A31B8A25292E951/665808.png\",\"details\":{\"type\":\"Logging\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49037() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Coins\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":49037,\"icon\":\"https://render.guildwars2.com/file/3BF274D1A323C002CDCFE80724912CDB7C78ABEE/62857.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49038() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Shell Pouch\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49038,\"icon\":\"https://render.guildwars2.com/file/C007CABA2A4CA303B10C733246C352276D080762/619524.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49039() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Heirloom Seed Pouch\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49039,\"icon\":\"https://render.guildwars2.com/file/74921BC51FFC732180CAD2019266B1F3A1E97999/619516.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49129() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mysterious Blue Key\",\"description\":\"Combine the 3 colored keys to be able to open the tri-key chest within the tower rubble. This key is primarily found in the western area of Kessex Hills.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49129,\"icon\":\"https://render.guildwars2.com/file/7D71011EB2F21C674725F9CD7AC2A37DA4D972DF/674807.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49130() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mysterious Green Key\",\"description\":\"Combine the 3 colored keys to be able to open the tri-key chest within the tower rubble. This key is primarily found in the central area of Kessex Hills.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49130,\"icon\":\"https://render.guildwars2.com/file/18494052323E3D0F776F707D184A6575BA6A52BA/674808.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49131() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mysterious Pink Key\",\"description\":\"Combine the 3 colored keys to be able to open the tri-key chest within the tower rubble. This key is primarily found in the eastern area of Kessex Hills.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49131,\"icon\":\"https://render.guildwars2.com/file/41C00CA047D6CA65AF57C8C711FBFFB34D990B06/674809.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49132() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tricolor Key\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49132,\"icon\":\"https://render.guildwars2.com/file/0D2FACB7EBAA534CA1090F57B6CC4971597119F1/674810.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49133() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Infinite Toxic Krait Tonic\",\"description\":\"Double-click to transform into a toxic krait. You will be unable to fight while transformed.\",\"type\":\"Gizmo\",\"level\":1,\"rarity\":\"Exotic\",\"vendor_value\":264,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49133,\"icon\":\"https://render.guildwars2.com/file/C6A3FFF06BB4D50050D3B1FE75E3AACBFA0F8009/63129.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49145() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unopened Endless Mystery Tonic\",\"description\":\"It smells like singed fur and feathers. Use this item to transform into...something. The bottle seems to be self-replenishing.\n\nAccount bound on use.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSell\",\"NoUnderwater\"],\"restrictions\":[],\"id\":49145,\"icon\":\"https://render.guildwars2.com/file/5F3D98C8CFF353535A10530E3F38C5E8E3BDF50B/66557.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49146() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unopened Endless Mystery Tonic\",\"description\":\"It smells like some sort of furniture polish. Use this item to transform into...something. The bottle seems to be self-replenishing.\n\nAccount bound on use.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSell\"],\"restrictions\":[],\"id\":49146,\"icon\":\"https://render.guildwars2.com/file/FCFF0C9BA7F598FA96DCDC13B16C01E26407CDBF/66558.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}