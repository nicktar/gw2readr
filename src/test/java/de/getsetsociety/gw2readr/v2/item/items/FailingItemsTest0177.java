package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0177 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem41557() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sentinel's Elder Inscription\",\"description\":\"Used in the crafting of weapons with +Vitality, +Power, and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":41557,\"icon\":\"https://render.guildwars2.com/file/DD2915237CCA267A3E0F7DBDD8C56E4AC64519D6/561707.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41558() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sentinel's Mithril Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Vitality, +Power, and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":41558,\"icon\":\"https://render.guildwars2.com/file/D29B6AC6BC930A1B333141911806EB2E96AE204E/561708.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41559() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sentinel's Mithril Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Vitality, +Power, and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":41559,\"icon\":\"https://render.guildwars2.com/file/BFE83DC735195E0AF8C2910C5ACF99A336BF9BAF/561709.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41560() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sentinel's Orichalcum Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Vitality, +Power, and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":41560,\"icon\":\"https://render.guildwars2.com/file/147A39BF92DC010C0B43A06BCF2CBD6C3A6C074A/561710.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41570() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pile of Walnut Crumble Topping\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Basic\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":41570,\"icon\":\"https://render.guildwars2.com/file/5591CCD7D6DB7DD06C76B80AC7A879F07AF29502/561720.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41571() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bowl of Garlic Butter Sauce\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Basic\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":41571,\"icon\":\"https://render.guildwars2.com/file/9F440AD122D1BD2DC921D5A27628F7C9AB5FC5B9/561721.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41572() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pile of Zesty Herbs\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Basic\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":41572,\"icon\":\"https://render.guildwars2.com/file/0606AB99D69D0FA4EBA777AA269C09B43AD71402/561722.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41733() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bit of Fused Metal Scrap\",\"description\":\"Salvage Item\n<c=@flavor>The fused scrap remains from the forges of the Molten Alliance.</c>\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":41733,\"icon\":\"https://render.guildwars2.com/file/A7E027D8C4D709A327C3501809490F501E01C050/561723.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41734() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pile of Fused Metal Scrap\",\"description\":\"Salvage Item\n<c=@flavor>The fused scrap remains from the forges of the Molten Alliance.</c>\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":60,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":41734,\"icon\":\"https://render.guildwars2.com/file/31AA0FFAA1E822BF32B6F7D3260A07E990049674/561724.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41735() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jagged Fused Metal Scrap\",\"description\":\"Salvage Item\n<c=@flavor>The fused scrap remains from the forges of the Molten Alliance.</c>\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":84,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":41735,\"icon\":\"https://render.guildwars2.com/file/2F0A5DFFE23CE863FF13CA4A466340C5C9594BBF/561725.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41736() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Fused Metal Scrap\",\"description\":\"Salvage Item\n<c=@flavor>The fused scrap remains from the forges of the Molten Alliance.</c>\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":105,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":41736,\"icon\":\"https://render.guildwars2.com/file/3476E9B5C9BC029BE652EBC808545C0B066F629B/561726.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41737() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Salvageable Fused Metal Scrap\",\"description\":\"Salvage Item\n<c=@flavor>The fused scrap remains from the forges of the Molten Alliance.</c>\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":126,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":41737,\"icon\":\"https://render.guildwars2.com/file/FDBBCDF64A1C06A5006C67D21F7C072301E5D52A/561727.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41739() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rox's Treat Bag\",\"description\":\"12 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":27,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":41739,\"icon\":\"https://render.guildwars2.com/file/96784FB5994B02F30924C066E8F10B99052669D2/561729.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":12}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41740() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sonic Periscope Audio Log\",\"description\":\"This device has recorded several conversations. Vigil Audio Log Collectors will want this information.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":41740,\"icon\":\"https://render.guildwars2.com/file/647A80CEB2BDC014BA564CA2CC54CFCFA525675C/561730.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41744() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Flame Dye Kit\",\"description\":\"Double-click to gain one random flame-inspired color. Includes a chance at 1 of 6 exclusive colors.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":41744,\"icon\":\"https://render.guildwars2.com/file/2247E82DA2260643CBD94B9C14FB223606447450/561732.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41745() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Frost Dye Kit\",\"description\":\"Double-click to gain one random frost-inspired color. Includes a chance at 1 of 6 exclusive colors.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":41745,\"icon\":\"https://render.guildwars2.com/file/FF9E2C614DAB80050EB009CDE27E0CED0A972892/561733.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41797() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Fused Weapon Claim Ticket\",\"description\":\"Take this ticket to Evon Gnashblade at the Lion's Arch Trading Post to select a Fused weapon skin.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":41797,\"icon\":\"https://render.guildwars2.com/file/DF60A0647432ABABE19F5042EE0D66A64ED0AD28/561802.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41807() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Molten Alliance Mining Pick\",\"description\":\"Used to mine all metals. Unlimited use.\",\"type\":\"Gathering\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":192,\"default_skin\":2399,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":41807,\"icon\":\"https://render.guildwars2.com/file/ACF90CA6BCD9CEEFD4D0DCEF2AA87C97B50BDC56/561815.png\",\"details\":{\"type\":\"Mining\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41824() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Continue Coin\",\"description\":\"Grants a player five lives inside the Super Adventure Box. See Moto in Rata Sum for details on how to play.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":41824,\"icon\":\"https://render.guildwars2.com/file/669B427B9735DC61EF3A566064083F1DC37E9D5A/561825.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41886() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bauble Bubble\",\"description\":\"A bubble of compressed baubles from Super Adventure Box. Trade these with Moto in Rata Sum.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":41886,\"icon\":\"https://render.guildwars2.com/file/231E351E042921F8BE94B2E3717D2DF734D4B9F4/561863.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41907() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Miniature Super Trio\",\"description\":\"Double-click to receive a miniature each of Super Spider, Super Bee Dog, and Super Monkey.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":41907,\"icon\":\"https://render.guildwars2.com/file/585F9BB737B667437F4DE015A5076D9EA49122F5/561873.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41908() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Super Spider\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":41908,\"icon\":\"https://render.guildwars2.com/file/08292E09FDD36C0592F515574069C8022E376271/561874.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41909() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Super Bee Dog\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":41909,\"icon\":\"https://render.guildwars2.com/file/68A863124F2A07707F43371C3427220309D14AD1/561875.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem41910() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Super Monkey\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":41910,\"icon\":\"https://render.guildwars2.com/file/165A0FD325B3107D0204329BFA06CE73551C69A8/561876.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem42006() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Azurite Crystal\",\"description\":\"Double-click to apply to an item with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":42006,\"icon\":\"https://render.guildwars2.com/file/1214625C57FE02B8A50644365AC862019CD06C6E/561994.png\",\"details\":{\"type\":\"Gem\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":17757,\"description\":\"+14 Vitality\n+10 Power\n+10 Toughness\"},\"attributes\":[]},\"suffix\":\"of Azurite\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}