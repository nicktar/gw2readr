package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0107 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem23516() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Meatoberfest Souvenir Mug\",\"description\":\"<c=@flavor>\\\"Meatoberfest—1325 AE\\\"</c>\",\"type\":\"Trinket\",\"level\":16,\"rarity\":\"Fine\",\"vendor_value\":25,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23516,\"icon\":\"https://render.guildwars2.com/file/5B6A00A7056C0DC8DA7448C0B1FC07560C6AD5B7/63092.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":6}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23517() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Platinum Cow Hoof\",\"description\":\"<c=@flavor>\\\"Cow Games Champ\\\"</c>\",\"type\":\"Trinket\",\"level\":16,\"rarity\":\"Fine\",\"vendor_value\":5000,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23517,\"icon\":\"https://render.guildwars2.com/file/04D35A310FE5C1E63F0A19D177FFF07BF20BD315/65722.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":6}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23518() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cow Bell\",\"description\":\"<c=@flavor>\\\"Everyone says we need more of these. I think we've got enough.\\\"<br>—Mad Mardine</c>\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Fine\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23518,\"icon\":\"https://render.guildwars2.com/file/5C514FC25F020AFD4018ADEF0C01D2BA50F5DF77/66799.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23519() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Skelk Training Whistle\",\"description\":\"<c=@flavor>\\\"Skelk love the sound of this thing.\\\"<br>—Skelk Wrangler</c>\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Fine\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23519,\"icon\":\"https://render.guildwars2.com/file/EBA905F8E06B409ABD17DB990D5E6F5162BFB315/455549.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23520() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Meatoberfest Souvenir Mug\",\"description\":\"<c=@flavor>\\\"Meatoberfest—1325 AE\\\"</c>\",\"type\":\"Trinket\",\"level\":16,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23520,\"icon\":\"https://render.guildwars2.com/file/5B6A00A7056C0DC8DA7448C0B1FC07560C6AD5B7/63092.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23521() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ghostly Scrap Metal\",\"description\":\"<c=@flavor>\\\"I'm still not sure how 'ghostly' metal can exist...\\\"<br>—Fyra </c>\",\"type\":\"Trinket\",\"level\":17,\"rarity\":\"Fine\",\"vendor_value\":27,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23521,\"icon\":\"https://render.guildwars2.com/file/B0C3CB68AFD818CCEE71023A6744FFDF4A2953B7/63141.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":6}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23522() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Skelk Training Whistle\",\"description\":\"<c=@flavor>\\\"Skelk love the sound of this thing.\\\"<br>—Skelk Wrangler</c>\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":60,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23522,\"icon\":\"https://render.guildwars2.com/file/EBA905F8E06B409ABD17DB990D5E6F5162BFB315/455549.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23523() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cow Bell\",\"description\":\"<c=@flavor>\\\"Everyone says we need more of these. I think we've got enough.\\\"<br>—Mad Mardine</c>\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":60,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23523,\"icon\":\"https://render.guildwars2.com/file/11039CB8AE67EF94119751A5951CD34FB1B508BA/62053.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23524() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Platinum Cow Hoof\",\"description\":\"<c=@flavor>\\\"Cow Games Champ\\\"</c>\",\"type\":\"Trinket\",\"level\":16,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23524,\"icon\":\"https://render.guildwars2.com/file/04D35A310FE5C1E63F0A19D177FFF07BF20BD315/65722.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23525() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Durmand Priory Guide to Exorcism\",\"description\":\"<c=@flavor>\\\"The first page will give you nightmares, ask Abel.\\\"<br>—Scholar Worfmir</c>\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Fine\",\"vendor_value\":57,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23525,\"icon\":\"https://render.guildwars2.com/file/0460B813B2D3FAD2C6A3BC04529A33174113EAAE/455930.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":21},{\"attribute\":\"ConditionDamage\",\"modifier\":15}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23526() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wall Fragment\",\"description\":\"<c=@flavor>\\\"What is it with people collecting pieces of this ghost cursed wall? Stone is stone. I prefer it when its not in my way.\\\"<br>—Legionnaire Bladechipper</c>\",\"type\":\"Trinket\",\"level\":52,\"rarity\":\"Fine\",\"vendor_value\":58,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23526,\"icon\":\"https://render.guildwars2.com/file/80CC5AAC2E1C0EF93A0624EC0CF0E7535EB30A37/62196.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":22},{\"attribute\":\"ConditionDamage\",\"modifier\":16}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23527() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Disarmed Mortar Shell\",\"description\":\"<c=@flavor>\\\"Just to remind the world what the Iron Legion is best at.\\\"<br>—Centurion Truthbringer</c>\",\"type\":\"Trinket\",\"level\":53,\"rarity\":\"Fine\",\"vendor_value\":59,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23527,\"icon\":\"https://render.guildwars2.com/file/80CC5AAC2E1C0EF93A0624EC0CF0E7535EB30A37/62196.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":23},{\"attribute\":\"Vitality\",\"modifier\":16}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23528() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cappo Family Crest\",\"description\":\"<c=@flavor>\\\"Take one as a momento of the excavation.\\\"<br>—Magister Razermane</c>\",\"type\":\"Trinket\",\"level\":54,\"rarity\":\"Fine\",\"vendor_value\":59,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23528,\"icon\":\"https://render.guildwars2.com/file/2EF6A4E4AA26E0380E38420D28111CEA2869B1DB/455931.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":23},{\"attribute\":\"ConditionDamage\",\"modifier\":17}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23529() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Devourer Toy\",\"description\":\"<c=@flavor>\\\"They love these sticks.\\\"<br>—Braxa Scalehunter</c>\",\"type\":\"Trinket\",\"level\":54,\"rarity\":\"Fine\",\"vendor_value\":59,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23529,\"icon\":\"https://render.guildwars2.com/file/4D80EB58D2C83705292201DF58B3C76FDEB405C9/65906.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":23},{\"attribute\":\"Vitality\",\"modifier\":17}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23530() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Shackles\",\"description\":\"<c=@flavor>\\\"We chain ourselves to fate by the decisions we make.\\\"<br>—Warden Scourgejaw</c>\",\"type\":\"Trinket\",\"level\":55,\"rarity\":\"Fine\",\"vendor_value\":60,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23530,\"icon\":\"https://render.guildwars2.com/file/347F6414029A0F95AFE0DC93026E9FC87C56C3A8/220890.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":24},{\"attribute\":\"Precision\",\"modifier\":17},{\"attribute\":\"Toughness\",\"modifier\":17}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23531() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Legion Machine Gun Gear\",\"description\":\"<c=@flavor>\\\"These guns have so many gears, I'm sure the one this is from wont be missing it.\\\"<br>—Legionnaire Sleekfur</c>\",\"type\":\"Trinket\",\"level\":56,\"rarity\":\"Fine\",\"vendor_value\":62,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23531,\"icon\":\"https://render.guildwars2.com/file/A64CDE12565E07F00470D710377A5EAB5E953816/62264.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":25},{\"attribute\":\"Precision\",\"modifier\":18},{\"attribute\":\"Toughness\",\"modifier\":18}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23532() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sentinel Scout Badge\",\"description\":\"<c=@flavor>\\\"Thanks. You really helped us out.\\\"<br>—Sentinel Staggerfoe</c>\",\"type\":\"Trinket\",\"level\":57,\"rarity\":\"Fine\",\"vendor_value\":62,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23532,\"icon\":\"https://render.guildwars2.com/file/09CF1C9B3FCF30206660E1B771B70F59FCB75AF8/455932.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":25},{\"attribute\":\"Precision\",\"modifier\":18},{\"attribute\":\"Toughness\",\"modifier\":18}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23533() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sentinel Survival Badge\",\"description\":\"<c=@flavor>\\\"Live to fight another day.\\\"<br>—Sentinel Jaggedclaw</c>\",\"type\":\"Trinket\",\"level\":58,\"rarity\":\"Fine\",\"vendor_value\":63,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23533,\"icon\":\"https://render.guildwars2.com/file/09CF1C9B3FCF30206660E1B771B70F59FCB75AF8/455932.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":26},{\"attribute\":\"Precision\",\"modifier\":19},{\"attribute\":\"Vitality\",\"modifier\":19}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23534() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Battle of Granite Front Commendation\",\"description\":\"<c=@flavor>\\\"The Iron Legion is built with soldiers like you. Thank you.\\\"<br>—Helo Murkhaunt</c>\",\"type\":\"Trinket\",\"level\":59,\"rarity\":\"Fine\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23534,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":27},{\"attribute\":\"Precision\",\"modifier\":19},{\"attribute\":\"Vitality\",\"modifier\":19}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23535() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ogre Gruel Spoon\",\"description\":\"<c=@flavor>A symbol of ogre friendship.</c>\",\"type\":\"Trinket\",\"level\":59,\"rarity\":\"Fine\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23535,\"icon\":\"https://render.guildwars2.com/file/6F2215EB6E98B707DA6214AABF510667A6CE6609/66821.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":27},{\"attribute\":\"Toughness\",\"modifier\":19},{\"attribute\":\"Vitality\",\"modifier\":19}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23536() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Manifest of Kalla Scorchrazor\",\"description\":\"<c=@flavor>\\\"All are equal when measured under the blade.\\\"<br>—Kalla Scorchrazor</c>\",\"type\":\"Trinket\",\"level\":60,\"rarity\":\"Fine\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23536,\"icon\":\"https://render.guildwars2.com/file/30FF0164E2C800230DE929AD053B9A335D03C2F7/455933.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":27},{\"attribute\":\"Precision\",\"modifier\":20},{\"attribute\":\"Vitality\",\"modifier\":20}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23537() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dog Tags\",\"description\":\"<c=@flavor>These tags are issued to every canine service member.</c>\",\"type\":\"Trinket\",\"level\":51,\"rarity\":\"Fine\",\"vendor_value\":57,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23537,\"icon\":\"https://render.guildwars2.com/file/F4486E0A6651C27F5D720CFF30D8A9CA33A855C7/66808.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":22},{\"attribute\":\"Vitality\",\"modifier\":15}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23538() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Legion Gunner's Ring\",\"description\":\"<c=@flavor>\\\"Looks like your heroics qualified you. You have the Iron Legion's thanks.\\\"<br>—Legionnaire Sleekfur</c>\",\"type\":\"Trinket\",\"level\":56,\"rarity\":\"Fine\",\"vendor_value\":71,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23538,\"icon\":\"https://render.guildwars2.com/file/C91B26DAC0E9C2B60F0C1E18ED35E0B39F3F4B20/63594.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":28},{\"attribute\":\"Precision\",\"modifier\":20},{\"attribute\":\"Vitality\",\"modifier\":20}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23539() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Scorch Warband Ring\",\"description\":\"<c=@flavor>\\\"If only this ring could talk...\\\"</c>\",\"type\":\"Trinket\",\"level\":60,\"rarity\":\"Fine\",\"vendor_value\":78,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23539,\"icon\":\"https://render.guildwars2.com/file/04FA35B4422E02E2683FFD711EA935413BFA0BC6/66812.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":33},{\"attribute\":\"Toughness\",\"modifier\":23},{\"attribute\":\"Vitality\",\"modifier\":23}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23540() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Scorch Warband Ring\",\"description\":\"<c=@flavor>\\\"If only this ring could talk...\\\"</c>\",\"type\":\"Trinket\",\"level\":60,\"rarity\":\"Masterwork\",\"vendor_value\":156,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23540,\"icon\":\"https://render.guildwars2.com/file/04FA35B4422E02E2683FFD711EA935413BFA0BC6/66812.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":36},{\"attribute\":\"Toughness\",\"modifier\":25},{\"attribute\":\"Vitality\",\"modifier\":25}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}