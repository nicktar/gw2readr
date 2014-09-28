package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0153 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem35737() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Flawless Mystic Jewel\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":10000,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NotUpgradeable\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":35737,\"icon\":\"https://render.guildwars2.com/file/96CB2DDF39107E4CBF17D09B3AFD035537BF6D34/223461.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35738() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mystic Jewel Fragment\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2000,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NotUpgradeable\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":35738,\"icon\":\"https://render.guildwars2.com/file/3022C7C568A105BD2F195DEFEFEFD55966CB9443/67022.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35739() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Perfect Mystic Jewel\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":20000,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NotUpgradeable\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":35739,\"icon\":\"https://render.guildwars2.com/file/2CA6B41EC84B9706C7BE1938ABC2BC710303331F/223481.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35740() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mystic Jewel\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":3000,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NotUpgradeable\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":35740,\"icon\":\"https://render.guildwars2.com/file/582641FE0D5FD2AB0903CA0050049167A89CB97C/67028.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35741() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Polished Mystic Jewel\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":4000,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NotUpgradeable\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":35741,\"icon\":\"https://render.guildwars2.com/file/954711A9D7016CAA06E2420B1D5FBF6E9517B67F/223473.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35742() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pristine Mystic Jewel\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":6000,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NotUpgradeable\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":35742,\"icon\":\"https://render.guildwars2.com/file/39BCCB95B74B032EFFF0E8B12480DB7302402060/223469.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35747() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cold Potion\",\"description\":\"Double-click to transform into an Ice Elemental.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"NotUpgradeable\",\"NoUnderwater\"],\"restrictions\":[],\"id\":35747,\"icon\":\"https://render.guildwars2.com/file/DAFCBF617A0CD468E20F911DD64BB9616195543F/63169.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35748() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hard Potion\",\"description\":\"Double-click to transform into an Earth Elemental.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"NotUpgradeable\",\"NoUnderwater\"],\"restrictions\":[],\"id\":35748,\"icon\":\"https://render.guildwars2.com/file/76CFFE3E686A3F03E5571890F903221E9719EACE/222642.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35749() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Charged Potion\",\"description\":\"Double-click to transform into an Air Elemental.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"NotUpgradeable\",\"NoUnderwater\"],\"restrictions\":[],\"id\":35749,\"icon\":\"https://render.guildwars2.com/file/80DDFCD0B326F7FE3A264A58BAB4B377DA274D70/222650.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35750() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Warm Potion\",\"description\":\"Double-click to transform into an Fire Elemental.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"NotUpgradeable\",\"NoUnderwater\"],\"restrictions\":[],\"id\":35750,\"icon\":\"https://render.guildwars2.com/file/5FD20F09226805DF9C08BE23F4C418442F4DAE93/222648.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35751() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mystic Chest\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":192,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"NotUpgradeable\"],\"restrictions\":[],\"id\":35751,\"icon\":\"https://render.guildwars2.com/file/441EF9BAB614527809557206EA5FF3D45A70CBCE/222566.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35976() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Personal Trader Express\",\"description\":\"Double-click to summon a personal Black Lion Delivery Agent for 5 minutes, allowing you to pick up trading post purchases and profits. Reusable.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":32,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":35976,\"icon\":\"https://render.guildwars2.com/file/550278CE4303EB99084810B33F6A9ECA1FEBE693/220569.png\",\"details\":{\"type\":\"RentableContractNpc\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35977() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Personal Merchant Express\",\"description\":\"Double-click to summon a personal Black Lion Merchant for 5 minutes, allowing you to access basic supplies and sell loot. Reusable.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":32,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":35977,\"icon\":\"https://render.guildwars2.com/file/400957BB0BA4670F08DA58CC26C33F910C2B16B6/220570.png\",\"details\":{\"type\":\"RentableContractNpc\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35978() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Permanent Bank Access Express\",\"description\":\"Double-click to access your account bank from anywhere. Reusable.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":32,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":35978,\"icon\":\"https://render.guildwars2.com/file/B0BBF3DF137745A6BEFFAC3E72DB95F899137B07/66553.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35984() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Permanent Bank Access Contract\",\"description\":\"Double-click to bind this item to your account. Allows reusable bank access from anywhere.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":10000,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":35984,\"icon\":\"https://render.guildwars2.com/file/ED29E93A25B541DAFAFB9B137DC1FA741030F634/222548.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35985() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Permanent Black Lion Merchant Contract\",\"description\":\"Double-click to bind this item to your account.\nWill summon a personal Black Lion Merchant for 5 minutes anywhere. Allows you to access basic supplies and sell loot. Reusable.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":10000,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":35985,\"icon\":\"https://render.guildwars2.com/file/ED29E93A25B541DAFAFB9B137DC1FA741030F634/222548.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35986() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Permanent Trading Post Express Contract\",\"description\":\"Double-click to bind this item to your account.\nSummons a personal Black Lion Delivery Agent for 5 minutes anywhere. Allows you to pick up trading post purchases and profits. Reusable.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":10000,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":35986,\"icon\":\"https://render.guildwars2.com/file/ED29E93A25B541DAFAFB9B137DC1FA741030F634/222548.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36038() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Trick-or-Treat Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":18,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":36038,\"icon\":\"https://render.guildwars2.com/file/E6017363449406DEE3DD3B80263AA2A91716F1DE/499375.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36039() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Personalized Trick-or-Treat Bag\",\"description\":\"<c=@flavor>Someone stitched your name on this bag. What a nice gift. Double-click to open.</c>\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36039,\"icon\":\"https://render.guildwars2.com/file/E6017363449406DEE3DD3B80263AA2A91716F1DE/499375.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36040() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"10 Slot Trick-or-Treat Bag\",\"description\":\"10 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36040,\"icon\":\"https://render.guildwars2.com/file/E6017363449406DEE3DD3B80263AA2A91716F1DE/499375.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":10}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36042() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of the Mad King\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":36042,\"icon\":\"https://render.guildwars2.com/file/0BD956A7BD1EB67433C8637D1B1F1222FA4E2A2F/499377.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Power\",\"+2% Condition Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Mad King\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36043() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of the Mad King\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":40,\"rarity\":\"Rare\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":36043,\"icon\":\"https://render.guildwars2.com/file/C3920894BC0EF476D761B027B1F8A1721AE0B49E/499378.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Power\",\"+3% Condition Duration\",\"+30 Power\",\"+9% Bleeding Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Mad King\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36044() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Mad King\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":36044,\"icon\":\"https://render.guildwars2.com/file/0A0E6F80DA16D7764FFEA33893B66051FBE07A3F/499379.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Power\",\"+5% Condition Duration\",\"+50 Power\",\"+15% Bleeding Duration\",\"+100 Power\",\"+20% bleeding duration; summon ravens to attack nearby enemies when you activate an elite skill. <c=@reminder>(Cooldown: 45 Seconds)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Mad King\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36052() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bowl of Candy Corn Glaze\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":36052,\"icon\":\"https://render.guildwars2.com/file/2ACFBC231FBB3B0DF9920D0800DEDFEB43DBB295/499390.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36053() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of the Night\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":36053,\"icon\":\"https://render.guildwars2.com/file/CFDC642093029E790C03381D73C703BDFFA9CDFF/499391.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":15268,\"description\":\"Outgoing damage is increased by 10% at night.\"},\"attributes\":[]},\"suffix\":\"of the Night\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}