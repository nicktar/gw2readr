package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0102 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem23386() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Stone Summit Badge\",\"description\":\"<c=@flavor>\\\"Did they really ride dolyaks? Must have been hard work climbing up those beasts.\\\"—Leandra</c>\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":85,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23386,\"icon\":\"https://render.guildwars2.com/file/0F69C2D7C004F3D4FCD0F3750D7AD6CFD0333014/455913.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":15},{\"attribute\":\"ConditionDamage\",\"modifier\":10}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23387() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hardened Destroyer Core\",\"description\":\"<c=@flavor>\\\"This core has cooled making it too hard to work with.\\\"<br>—Kruppa</c>\",\"type\":\"Trinket\",\"level\":36,\"rarity\":\"Masterwork\",\"vendor_value\":88,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23387,\"icon\":\"https://render.guildwars2.com/file/3EB374296D313F5C59EDDAD03F16CE0A9E5BBCC7/66827.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":15},{\"attribute\":\"Vitality\",\"modifier\":11}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23388() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Peg Leg Screw\",\"description\":\"<c=@flavor>\\\"One hit quaggan on the head.\\\"<br>—Queldip</c>\",\"type\":\"Trinket\",\"level\":36,\"rarity\":\"Masterwork\",\"vendor_value\":88,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23388,\"icon\":\"https://render.guildwars2.com/file/FC637AA3031B585F5B025B12670C6CD5A5C1BA51/63130.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":15},{\"attribute\":\"Power\",\"modifier\":11}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23389() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Order of Whispers Secret Message 4\",\"description\":\"<c=@flavor>\\\"31 254 13 56\\\"</c>\",\"type\":\"Trinket\",\"level\":37,\"rarity\":\"Masterwork\",\"vendor_value\":88,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23389,\"icon\":\"https://render.guildwars2.com/file/61BD98A8976CFF20A17F5FFB9C17215D0DABB697/66824.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":16},{\"attribute\":\"ConditionDamage\",\"modifier\":11}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23390() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Order of Whispers Secret Message 5\",\"description\":\"<c=@flavor>\\\"31 31 51 67 85\\\"</c>\",\"type\":\"Trinket\",\"level\":37,\"rarity\":\"Masterwork\",\"vendor_value\":88,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23390,\"icon\":\"https://render.guildwars2.com/file/61BD98A8976CFF20A17F5FFB9C17215D0DABB697/66824.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":16},{\"attribute\":\"ConditionDamage\",\"modifier\":11}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23391() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pirate Flask\",\"description\":\"<c=@flavor>\\\"Smells like rum and body odor.\\\"<br>—Duidda</c>\",\"type\":\"Trinket\",\"level\":37,\"rarity\":\"Masterwork\",\"vendor_value\":88,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23391,\"icon\":\"https://render.guildwars2.com/file/084D6ECEB001AD6C170E56B6ABCE0E69365D5ED4/63144.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":16},{\"attribute\":\"ConditionDamage\",\"modifier\":11}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23392() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hunting Trophy\",\"description\":\"<c=@flavor>\\\"This was taken from a large Jotun.\\\"<br>—Neida</c>\",\"type\":\"Trinket\",\"level\":38,\"rarity\":\"Masterwork\",\"vendor_value\":90,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23392,\"icon\":\"https://render.guildwars2.com/file/76063254FF6022ED7F4A759601F84BE9F702D05F/66825.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":16},{\"attribute\":\"ConditionDamage\",\"modifier\":12}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23393() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ettin Speaking Bone\",\"description\":\"<c=@flavor>\\\"He who holds the speaking bone may jabber.\\\"<br>—Bramm</c>\",\"type\":\"Trinket\",\"level\":39,\"rarity\":\"Masterwork\",\"vendor_value\":93,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23393,\"icon\":\"https://render.guildwars2.com/file/7D22375A92039A341B79017AF3650BF00B5B9D39/65681.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":17},{\"attribute\":\"Power\",\"modifier\":12}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23394() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jalis Family Ring\",\"description\":\"<c=@flavor>\\\"We find a lot of these. I wonder how many family members Jalis had.\\\" —Rinceword</c>\",\"type\":\"Trinket\",\"level\":30,\"rarity\":\"Masterwork\",\"vendor_value\":93,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23394,\"icon\":\"https://render.guildwars2.com/file/6B5050A3B959FAAF3D0E5E23CA3FAA6DE9E3CB0D/455905.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":15},{\"attribute\":\"ConditionDamage\",\"modifier\":11}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23395() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Drake Tooth Necklace\",\"description\":\"<c=@flavor>\\\"They look nicer on a necklace than clamping down on your neck.\\\"—Leandra</c>\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":136,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23395,\"icon\":\"https://render.guildwars2.com/file/090C47B6BFC5F70B5BA83D3B0F4630A51F07ED34/220642.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":23},{\"attribute\":\"Vitality\",\"modifier\":17}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23396() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steam Gasket Ring\",\"description\":\"<c=@flavor>\\\"These gaskets make good rings. I wonder what kind of metal this is.\\\"—Garrius</c>\",\"type\":\"Trinket\",\"level\":32,\"rarity\":\"Masterwork\",\"vendor_value\":96,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23396,\"icon\":\"https://render.guildwars2.com/file/AD6B2271461029C42F41BA9D9B4C90051B934B27/455916.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":16},{\"attribute\":\"Power\",\"modifier\":11}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23397() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deldrimor Ring\",\"description\":\"<c=@flavor>An old, but still beautiful object.</c>\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Fine\",\"vendor_value\":51,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23397,\"icon\":\"https://render.guildwars2.com/file/D64DC1C2DC15D6DAD002BACA34010D769FB35ECD/455914.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":16},{\"attribute\":\"ConditionDamage\",\"modifier\":11}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23398() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Durmand Priory Field Guide to Jormag\",\"description\":\"<c=@flavor>\\\"Knowledge of these dangers is the only path to true victory. Many have died for what we have learned.\\\"\n—Scholar Daphne</c>\",\"type\":\"Trinket\",\"level\":40,\"rarity\":\"Fine\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23398,\"icon\":\"https://render.guildwars2.com/file/90383BE37D081EAB372ABCC0F26749B0D9CE46CD/455917.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":16},{\"attribute\":\"Vitality\",\"modifier\":11}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23399() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Durmand Priory Field Guide to Skritt\",\"description\":\"<c=@flavor>\\\"Nothing will try your patience more than skritt.\\\"\n—Scholar Antal the Patient</c>\",\"type\":\"Trinket\",\"level\":41,\"rarity\":\"Fine\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23399,\"icon\":\"https://render.guildwars2.com/file/051BD8F9BEA757EF550B13ABD1022AA1DB11E42B/455918.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":16},{\"attribute\":\"Vitality\",\"modifier\":12}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23400() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Snow Leopard Totem\",\"description\":\"<c=@flavor>\\\"Walk swift in the path of Snow Leopard.\\\"\n—Toka Axegrinder</c>\",\"type\":\"Trinket\",\"level\":42,\"rarity\":\"Fine\",\"vendor_value\":49,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23400,\"icon\":\"https://render.guildwars2.com/file/C3F1230A37DA1F4178372440679E553154469CCD/66814.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":17},{\"attribute\":\"Vitality\",\"modifier\":12}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23401() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Travelen's Lodge Commemorative Spoon\",\"description\":\"<c=@flavor>\\\"I normally sell these, but you've been such a huge help to us. Thank you.\\\"\n—Disa</c>\",\"type\":\"Trinket\",\"level\":43,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23401,\"icon\":\"https://render.guildwars2.com/file/B59A08AB080ABBD6144036DA99F113E9040BB14D/434518.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":17},{\"attribute\":\"ConditionDamage\",\"modifier\":12}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23402() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Painted Mokooki Hunter's Pottery\",\"description\":\"<c=@flavor>\\\"Pictures of great hunts. No more with bad ice brutes around.\\\"\n—Mokooki</c>\",\"type\":\"Trinket\",\"level\":44,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23402,\"icon\":\"https://render.guildwars2.com/file/0B7EA6BDB06AC7335B77C2470A174912BEE99E0B/66512.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":18},{\"attribute\":\"Power\",\"modifier\":13}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23403() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Very Shiny Thing\",\"description\":\"<c=@flavor>\\\"Skritt are highly attracted to shiny things. Some postulate it's due to their enhanced subterranean vision.\\\"\n—Durmand Priory Field Guide to Skritt</c>\",\"type\":\"Trinket\",\"level\":45,\"rarity\":\"Fine\",\"vendor_value\":52,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23403,\"icon\":\"https://render.guildwars2.com/file/A64CDE12565E07F00470D710377A5EAB5E953816/62264.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":18},{\"attribute\":\"Power\",\"modifier\":13}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23404() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Priory Field Guide to Dredge\",\"description\":\"<c=@flavor>\\\"Dredge are among the most industrious races of Tyria. Their singular ability to dig is second to none.\\\"\n—Priory Field Guide to Dredge</c>\",\"type\":\"Trinket\",\"level\":46,\"rarity\":\"Fine\",\"vendor_value\":53,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23404,\"icon\":\"https://render.guildwars2.com/file/095B9410F480575B7EAF9CDA9F05163FB8530251/220884.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":19},{\"attribute\":\"ConditionDamage\",\"modifier\":13}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23405() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Priory Granite Citadel History\",\"description\":\"<c=@flavor>\\\"The first explorers of this area discovered abnormally powerful ore deposits.\\\"<br>—Arcanist Vance</c>\",\"type\":\"Trinket\",\"level\":47,\"rarity\":\"Fine\",\"vendor_value\":53,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23405,\"icon\":\"https://render.guildwars2.com/file/924E992B2217CFCAC6CA0F06663FA99C6629CDAB/220885.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":19},{\"attribute\":\"Power\",\"modifier\":14}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23406() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Priory Wilderness Survival Guide\",\"description\":\"<c=@flavor>\\\"It's not easy to survive in the wilds. There's probably something in here that could save your life.\\\"<br>—Magister Roslin</c>\",\"type\":\"Trinket\",\"level\":48,\"rarity\":\"Fine\",\"vendor_value\":54,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23406,\"icon\":\"https://render.guildwars2.com/file/C169769F7200EAFD31144DD0306909AF98B23449/220886.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":20},{\"attribute\":\"Power\",\"modifier\":14}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23407() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Priory Field Guide to Munitions\",\"description\":\"<c=@flavor>\\\"While normally verbose on topics, the Priory is succinct when it comes to the proper use of munitions: Point toward enemy. Stand back.\\\"\n— Priory Field Guide to Munitions</c>\",\"type\":\"Trinket\",\"level\":49,\"rarity\":\"Fine\",\"vendor_value\":55,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23407,\"icon\":\"https://render.guildwars2.com/file/926F023B08C5F9E77E6773220C2F677013F50F0A/455919.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":20},{\"attribute\":\"Power\",\"modifier\":15}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23408() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Priory Sorrow's Embrace History\",\"description\":\"<c=@flavor>\\\"This is one of the heaviest books in our collection. The older the book, and the thicker the paper, the heavier it gets.\\\"<br>—Magister Kathryn</c>\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Fine\",\"vendor_value\":57,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23408,\"icon\":\"https://render.guildwars2.com/file/031CBF0F0A4780304A1BC81B0F68FFCDFCC41343/220883.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":21},{\"attribute\":\"Vitality\",\"modifier\":15}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23409() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Granite Citadel Defender Ring\",\"description\":\"<c=@flavor>\\\"The Priory is in your debt. Thank you.\\\"<br>—Arcanist Vance</c>\",\"type\":\"Trinket\",\"level\":47,\"rarity\":\"Fine\",\"vendor_value\":63,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23409,\"icon\":\"https://render.guildwars2.com/file/04FA35B4422E02E2683FFD711EA935413BFA0BC6/66812.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":23},{\"attribute\":\"ConditionDamage\",\"modifier\":17}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23410() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Kilroy Stonekin Necklace\",\"description\":\"<c=@flavor>\\\"He always owed someone something. This necklace was probably used to pay off a stone summit slaver.\\\"\n—Priory History of Kilroy Stonekin</c>\",\"type\":\"Trinket\",\"level\":47,\"rarity\":\"Fine\",\"vendor_value\":84,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23410,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":31},{\"attribute\":\"Vitality\",\"modifier\":22}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}