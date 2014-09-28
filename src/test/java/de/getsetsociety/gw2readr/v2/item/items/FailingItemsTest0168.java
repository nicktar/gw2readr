package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0168 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem38429() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Giver's Green Inscription\",\"description\":\"Used in the crafting of weapons with +Condition Duration.\",\"type\":\"CraftingMaterial\",\"level\":15,\"rarity\":\"Fine\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":38429,\"icon\":\"https://render.guildwars2.com/file/CF215066D60CDE3C71D053385F03786F7294204C/526298.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38430() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Giver's Iron-Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Condition Duration and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":17,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":38430,\"icon\":\"https://render.guildwars2.com/file/CC666D2015E9379AD920012AAC03ACA30CB07245/526299.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38431() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Giver's Steel-Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Condition Duration and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":23,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":38431,\"icon\":\"https://render.guildwars2.com/file/A5675F793211CD585606102E09A4BCD2E093946C/526300.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38432() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Giver's Mithril Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Condition Duration, +Vitality, and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":38432,\"icon\":\"https://render.guildwars2.com/file/64616108DFFC7CABF91BDABFE95C4B1B0C93E8B5/526301.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38433() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Giver's Darksteel Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Condition Duration, +Vitality, and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":42,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":38433,\"icon\":\"https://render.guildwars2.com/file/ED0606C7453E021E56F54248DD6BB604C0B4E813/526302.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38434() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Giver's Orichalcum Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Condition Duration, +Vitality, and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":38434,\"icon\":\"https://render.guildwars2.com/file/48D6B8B8334159063195E3DB63F622ADB866A312/526303.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38448() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ugly Wool Sock\",\"description\":\"Ugly wool socks can be exchanged for other rewards at one of the Lionguard's gift-exchange representatives.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":38448,\"icon\":\"https://render.guildwars2.com/file/A314E6A94A6AF4A8EB245F4E5C9DD6CEF62F5958/526314.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38449() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ugly Wool Hat\",\"description\":\"Ugly wool hats can be exchanged for other rewards at one of the Lionguard's gift-exchange representatives.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":14,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":38449,\"icon\":\"https://render.guildwars2.com/file/C53C16E4280A177204D8B1CC0E77107493ACD402/526315.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38450() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ugly Wool Sweater\",\"description\":\"Ugly wool sweaters can be exchanged for other rewards at one of the Lionguard's gift-exchange representatives.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":26,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":38450,\"icon\":\"https://render.guildwars2.com/file/742AE9D5A062D4AE0E559C6993BAA5C4CC59DC2C/526316.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38451() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Princess Doll\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":38451,\"icon\":\"https://render.guildwars2.com/file/1358E502FB2F9C9AD5CF0AA80580C353ABE8B869/526317.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38452() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Toy Ventari\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":38452,\"icon\":\"https://render.guildwars2.com/file/22A5D499D0BA2AB9FA77FDD9D7C88052F47046C7/526318.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38453() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Toy Soldier\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":38453,\"icon\":\"https://render.guildwars2.com/file/B1C2AACE933A677F40187004DC5D51561DB3FF38/526319.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38454() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Toy Golem\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":38454,\"icon\":\"https://render.guildwars2.com/file/FFF9987321789234043801D13BB226B94F65DF00/526320.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38455() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Plush Griffon\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":38455,\"icon\":\"https://render.guildwars2.com/file/9A7507807FC264B576932BC3CD0AB257CFD54404/526321.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38506() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Permanent Self-Style Hair Kit\",\"description\":\"Double-click to modify your appearance settings for hair style, hair color, horns, and facial hair.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":32,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":38506,\"icon\":\"https://render.guildwars2.com/file/DE6F0E04D5E3579BAB466127C268C55726B607F8/526360.png\",\"details\":{\"type\":\"UnlimitedConsumable\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38507() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Permanent Hair Stylist Contract\",\"description\":\"Double-click to bind this item to your account.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":10000,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":38507,\"icon\":\"https://render.guildwars2.com/file/ED29E93A25B541DAFAFB9B137DC1FA741030F634/222548.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39078() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pristine Fractal Relic\",\"description\":\"A small portion of the Mists, magically crystallized and perfectly preserved. Double-click to convert to 15 Fractal Relics.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":49,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39078,\"icon\":\"https://render.guildwars2.com/file/130FCE6AF6B704CF5AE554EFC0312AC573555856/526362.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39079() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Toymaker Tixx's Gift\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39079,\"icon\":\"https://render.guildwars2.com/file/420CE6DF804B1429750A115F9B6CEDA504A036F4/526220.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39090() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Risen Priest of Balthazar\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39090,\"icon\":\"https://render.guildwars2.com/file/3F9A1CA7C192FAFFDEE13E28A09AD8DA0F165FE4/534184.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39101() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Endless Mystery Cat Tonic\",\"description\":\"A faint, feline scent emanates from the bottle. Use its self-replenishing contents to transform into...something.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39101,\"icon\":\"https://render.guildwars2.com/file/CD32DE71FB72130237D60446AF319DBB5F80A120/534193.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39103() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chauncey von Snuffles III\",\"description\":\"Placed second in the Divinity's Reach Fanciest Cat competition. Double-click to summon. Only one miniature can be active.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39103,\"icon\":\"https://render.guildwars2.com/file/C69DEDA60D6346EC9B1FC8BA481B130FF909CA1A/534194.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39104() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Goedulf\",\"description\":\"Legendary wolf-cub spirit that protects lost norn kids. Double-click to summon. Only one miniature can be active.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39104,\"icon\":\"https://render.guildwars2.com/file/B16F7809AC181AD4FEB1F1E6DA2FC1A76B6DE89E/534195.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39107() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Warrior Gear\",\"description\":\"Contains a rare or exotic piece of level 78-80 gear for warriors. Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39107,\"icon\":\"https://render.guildwars2.com/file/7C107A9D26051C049AFFFD3EFE4922F96A51687D/534198.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39109() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Guardian Gear\",\"description\":\"Contains a rare or exotic piece of level 78-80 gear for guardians. Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39109,\"icon\":\"https://render.guildwars2.com/file/605107FD3667E62F3B0400F7BDE1F03AEEDAD24F/534200.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39110() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elementalist Gear\",\"description\":\"Contains a rare or exotic piece of level 78-80 gear for elementalists. Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39110,\"icon\":\"https://render.guildwars2.com/file/F367291FA1C24698E53EF0D11F6E0DEB582C05AC/534201.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}