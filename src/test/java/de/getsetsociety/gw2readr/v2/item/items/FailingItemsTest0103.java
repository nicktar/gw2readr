package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0103 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem23411() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Arctodus Tooth Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":47,\"rarity\":\"Masterwork\",\"vendor_value\":168,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23411,\"icon\":\"https://render.guildwars2.com/file/201607919EC5C8670DE04FD6049B0F08BB2F6EAC/434519.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":34},{\"attribute\":\"ConditionDamage\",\"modifier\":24}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23412() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deldrimor Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":47,\"rarity\":\"Fine\",\"vendor_value\":63,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23412,\"icon\":\"https://render.guildwars2.com/file/D64DC1C2DC15D6DAD002BACA34010D769FB35ECD/455914.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":23},{\"attribute\":\"Power\",\"modifier\":17}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23413() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Durmand Priory Field Guide to Jormag\",\"description\":\"<c=@flavor>\\\"Knowledge of these dangers is the only path to true victory. Many have died for what we have learned.\\\"<br>—Scholar Daphne</c>\",\"type\":\"Trinket\",\"level\":40,\"rarity\":\"Masterwork\",\"vendor_value\":95,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23413,\"icon\":\"https://render.guildwars2.com/file/90383BE37D081EAB372ABCC0F26749B0D9CE46CD/455917.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":17},{\"attribute\":\"Vitality\",\"modifier\":12}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23414() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Durmand Priory Field Guide to Skritt\",\"description\":\"<c=@flavor>\\\"Nothing will try your patience more than skritt.\\\"<br>—Scholar Antal the Patient</c>\",\"type\":\"Trinket\",\"level\":41,\"rarity\":\"Masterwork\",\"vendor_value\":95,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23414,\"icon\":\"https://render.guildwars2.com/file/051BD8F9BEA757EF550B13ABD1022AA1DB11E42B/455918.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":18},{\"attribute\":\"Vitality\",\"modifier\":13}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23415() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Snow Leopard Totem\",\"description\":\"<c=@flavor>\\\"Walk swift in the path of Snow Leopard.\\\"<br>—Toka Axegrinder</c>\",\"type\":\"Trinket\",\"level\":42,\"rarity\":\"Masterwork\",\"vendor_value\":98,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23415,\"icon\":\"https://render.guildwars2.com/file/C3F1230A37DA1F4178372440679E553154469CCD/66814.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":18},{\"attribute\":\"Vitality\",\"modifier\":13}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23416() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Travelen's Lodge Commemorative Spoon\",\"description\":\"<c=@flavor>\\\"I normally sell these, but you've been such a huge help to us. Thank you.\\\"\n—Disa</c>\",\"type\":\"Trinket\",\"level\":43,\"rarity\":\"Masterwork\",\"vendor_value\":100,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23416,\"icon\":\"https://render.guildwars2.com/file/B59A08AB080ABBD6144036DA99F113E9040BB14D/434518.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":19},{\"attribute\":\"ConditionDamage\",\"modifier\":13}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23417() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Painted Mokooki Hunter's Pottery\",\"description\":\"<c=@flavor>\\\"Pictures of great hunts. No more with bad ice brutes around.\\\"<br>—Mokooki</c>\",\"type\":\"Trinket\",\"level\":44,\"rarity\":\"Masterwork\",\"vendor_value\":100,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23417,\"icon\":\"https://render.guildwars2.com/file/0B7EA6BDB06AC7335B77C2470A174912BEE99E0B/66512.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":19},{\"attribute\":\"Power\",\"modifier\":14}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23418() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Very Shiny Thing\",\"description\":\"<c=@flavor>\\\"Skritt are highly attracted to shiney things. Some postulate it is due to their enhanced subteranean vision.\\\"<br>—Durmand Priory Field Guide to Skritt</c>\",\"type\":\"Trinket\",\"level\":45,\"rarity\":\"Masterwork\",\"vendor_value\":103,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23418,\"icon\":\"https://render.guildwars2.com/file/A64CDE12565E07F00470D710377A5EAB5E953816/62264.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":20},{\"attribute\":\"Power\",\"modifier\":14}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23419() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Priory Field Guide to Dredge\",\"description\":\"<c=@flavor>\\\"Dredge are among the most industrious of all the races of Tyria. Their singular ability to dig is second to none.\\\"<br>—Priory Field Guide to Dredge</c>\",\"type\":\"Trinket\",\"level\":46,\"rarity\":\"Masterwork\",\"vendor_value\":105,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23419,\"icon\":\"https://render.guildwars2.com/file/095B9410F480575B7EAF9CDA9F05163FB8530251/220884.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":21},{\"attribute\":\"ConditionDamage\",\"modifier\":15}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23420() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Priory Granite Citadel history\",\"description\":\"<c=@flavor>\\\"The first explorers of this area discovered abnormally powerful ore deposits.\\\"<br>—Arcanist Vance</c>\",\"type\":\"Trinket\",\"level\":47,\"rarity\":\"Masterwork\",\"vendor_value\":105,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23420,\"icon\":\"https://render.guildwars2.com/file/924E992B2217CFCAC6CA0F06663FA99C6629CDAB/220885.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":21},{\"attribute\":\"Power\",\"modifier\":15}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23421() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Granite Citadel Defender Ring\",\"description\":\"<c=@flavor>\\\"The Priory is in your debt. Thank you.\\\"<br>—Arcanist Vance</c>\",\"type\":\"Trinket\",\"level\":47,\"rarity\":\"Masterwork\",\"vendor_value\":126,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23421,\"icon\":\"https://render.guildwars2.com/file/04FA35B4422E02E2683FFD711EA935413BFA0BC6/66812.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":25},{\"attribute\":\"ConditionDamage\",\"modifier\":18}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23422() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Priory Wilderness Survival Guide\",\"description\":\"<c=@flavor>\\\"It's not easy to survive in the wilds. There's probably something in here that could save your life.\\\"<br>—Magister Roslin</c>\",\"type\":\"Trinket\",\"level\":48,\"rarity\":\"Masterwork\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23422,\"icon\":\"https://render.guildwars2.com/file/C169769F7200EAFD31144DD0306909AF98B23449/220886.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":22},{\"attribute\":\"Power\",\"modifier\":16}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23423() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Priory Field Guide to Munitions\",\"description\":\"<c=@flavor>\\\"While normally verbose on topics, the Priory will remain succinct when it comes to the proper use of munitions. Point toward enemy. Stand back.\\\"<br>— Priory Field Guide to Munitions</c>\",\"type\":\"Trinket\",\"level\":49,\"rarity\":\"Masterwork\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23423,\"icon\":\"https://render.guildwars2.com/file/926F023B08C5F9E77E6773220C2F677013F50F0A/455919.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":22},{\"attribute\":\"Power\",\"modifier\":16}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23424() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Priory Sorrows Embrace History\",\"description\":\"<c=@flavor>\\\"This is one of the heaviest books in our collection. The older the book, and the thicker the paper, the heavier it gets.\\\"<br>—Magister Kathryn</c>\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":113,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23424,\"icon\":\"https://render.guildwars2.com/file/031CBF0F0A4780304A1BC81B0F68FFCDFCC41343/220883.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":23},{\"attribute\":\"Vitality\",\"modifier\":16}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23425() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Kilroy Stonekin Necklace\",\"description\":\"<c=@flavor>\\\"He always owed someone something. This necklace was probably used to pay off a stone summit slaver.\\\"<br>—Priory History Of Kilroy Stonekin</c>\",\"type\":\"Trinket\",\"level\":47,\"rarity\":\"Masterwork\",\"vendor_value\":126,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23425,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":25},{\"attribute\":\"Vitality\",\"modifier\":18}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23426() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Grawl Oil Paints\",\"description\":\"<c=@flavor>\\\"Not to give them too much credit, but this paint is just as good as some used by the great painters.\\\"<br>—Explorer Erikk</c>\",\"type\":\"Trinket\",\"level\":71,\"rarity\":\"Fine\",\"vendor_value\":74,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23426,\"icon\":\"https://render.guildwars2.com/file/06DF56D8B92ADF042C5D7C42574EF62F40D1D34A/455915.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":35},{\"attribute\":\"Precision\",\"modifier\":25},{\"attribute\":\"Toughness\",\"modifier\":25}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23427() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vigil Valor Commendation\",\"description\":\"<c=@flavor>\\\"Valor is the one flame that cannot be extinguished out here.\\\"<br>—Crusader D'Stolt</c>\",\"type\":\"Trinket\",\"level\":72,\"rarity\":\"Fine\",\"vendor_value\":75,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23427,\"icon\":\"https://render.guildwars2.com/file/DDFC7DCF675C04A73B069D0F78E92793656102A0/66819.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":36},{\"attribute\":\"Precision\",\"modifier\":26},{\"attribute\":\"Vitality\",\"modifier\":26}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23428() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Burnt Out Imp Stone\",\"description\":\"<c=@flavor>\\\"This seems to hold the key to the mysterious imps appearing.\\\"<br>—Scholar Inka</c>\",\"type\":\"Trinket\",\"level\":73,\"rarity\":\"Fine\",\"vendor_value\":77,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23428,\"icon\":\"https://render.guildwars2.com/file/E40D3C6ED10916BFB638016CB10495100EFA14B0/66931.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":37},{\"attribute\":\"Precision\",\"modifier\":26},{\"attribute\":\"Toughness\",\"modifier\":26}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23429() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Stone Summit Shoulder Spike\",\"description\":\"<c=@flavor>\\\"These spikes might have served a tactical purpose in battle, perhaps to denote rank.\\\"<br>—Tactician Sebastian</c>\",\"type\":\"Trinket\",\"level\":73,\"rarity\":\"Fine\",\"vendor_value\":77,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23429,\"icon\":\"https://render.guildwars2.com/file/DDFC7DCF675C04A73B069D0F78E92793656102A0/66819.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":37},{\"attribute\":\"Toughness\",\"modifier\":26},{\"attribute\":\"Vitality\",\"modifier\":26}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23430() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Symbol Of Balance\",\"description\":\"<c=@flavor>\\\"Find balance or fall into discord.\\\"<br>—Guardian Infinite Mind</c>\",\"type\":\"Trinket\",\"level\":74,\"rarity\":\"Fine\",\"vendor_value\":77,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23430,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":37},{\"attribute\":\"Precision\",\"modifier\":27},{\"attribute\":\"Vitality\",\"modifier\":27}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23431() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Blessing Of The Voice\",\"description\":\"<c=@flavor>\\\"Walk with wisdom, step with purpose.\\\"<br>—The Voice</c>\",\"type\":\"Trinket\",\"level\":78,\"rarity\":\"Fine\",\"vendor_value\":80,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23431,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":41},{\"attribute\":\"Precision\",\"modifier\":29},{\"attribute\":\"Vitality\",\"modifier\":29}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23432() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Shimmer Bauble of Mellaggan\",\"description\":\"<c=@flavor>\\\"Shhh-shhhimmery.\\\"<br>—Qualdup</c>\",\"type\":\"Trinket\",\"level\":77,\"rarity\":\"Fine\",\"vendor_value\":79,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23432,\"icon\":\"https://render.guildwars2.com/file/BDF5F226E5746470005DBE61FF03CAC3630F3405/455920.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":40},{\"attribute\":\"Toughness\",\"modifier\":28},{\"attribute\":\"Vitality\",\"modifier\":28}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23433() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mark Of The Claw\",\"description\":\"<c=@flavor>This item is scored with a deep, sharp gash and is off-set by images of water and the sky.</c>\",\"type\":\"Trinket\",\"level\":78,\"rarity\":\"Fine\",\"vendor_value\":80,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23433,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":41},{\"attribute\":\"Precision\",\"modifier\":29},{\"attribute\":\"Toughness\",\"modifier\":29}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23434() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Idol Of Koda\",\"description\":\"<c=@flavor>\\\"Stop. Pause. Think. Breathe.\\\"<br>—Motto Of Koda</c>\",\"type\":\"Trinket\",\"level\":79,\"rarity\":\"Fine\",\"vendor_value\":82,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23434,\"icon\":\"https://render.guildwars2.com/file/A036A140B400B0305F07D49AC64AC423260A65D4/455921.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":41},{\"attribute\":\"Precision\",\"modifier\":30},{\"attribute\":\"Toughness\",\"modifier\":30}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23435() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tattered Kodan Flag\",\"description\":\"<c=@flavor>\\\"Much like this flag, we too have become tattered.\\\"<br>—Shifting Waves</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Fine\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23435,\"icon\":\"https://render.guildwars2.com/file/C1C6FA6651F24679FD2CF0D30EF31A08229E7D45/455922.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":42},{\"attribute\":\"Toughness\",\"modifier\":30},{\"attribute\":\"Vitality\",\"modifier\":30}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}