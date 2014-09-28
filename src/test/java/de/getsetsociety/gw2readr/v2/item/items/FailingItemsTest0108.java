package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0108 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem23541() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Legion Gunner's Ring\",\"description\":\"<c=@flavor>\\\"Looks like your heroics qualified you. You have the Iron Legion's thanks.\\\"<br>—Legionnaire Sleekfur</c>\",\"type\":\"Trinket\",\"level\":56,\"rarity\":\"Masterwork\",\"vendor_value\":141,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23541,\"icon\":\"https://render.guildwars2.com/file/C91B26DAC0E9C2B60F0C1E18ED35E0B39F3F4B20/63594.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":31},{\"attribute\":\"Precision\",\"modifier\":22},{\"attribute\":\"Vitality\",\"modifier\":22}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23542() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Durmand Priory Guide to Exorcism\",\"description\":\"<c=@flavor>\\\"The first page will give you nightmares, ask Abel.\\\"<br>—Scholar Worfmir</c>\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":113,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23542,\"icon\":\"https://render.guildwars2.com/file/0460B813B2D3FAD2C6A3BC04529A33174113EAAE/455930.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":23},{\"attribute\":\"ConditionDamage\",\"modifier\":16}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23543() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dog Tags\",\"description\":\"<c=@flavor>These tags are issued to every canine service member.</c>\",\"type\":\"Trinket\",\"level\":51,\"rarity\":\"Masterwork\",\"vendor_value\":113,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23543,\"icon\":\"https://render.guildwars2.com/file/F4486E0A6651C27F5D720CFF30D8A9CA33A855C7/66808.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":24},{\"attribute\":\"Vitality\",\"modifier\":17}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23544() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wall Fragment\",\"description\":\"<c=@flavor>\\\"What is it with people collecting pieces of this ghost cursed wall? Stone is stone. I prefer it when its not in my way.\\\"<br>—Legionnaire Bladechipper</c>\",\"type\":\"Trinket\",\"level\":52,\"rarity\":\"Masterwork\",\"vendor_value\":115,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23544,\"icon\":\"https://render.guildwars2.com/file/80CC5AAC2E1C0EF93A0624EC0CF0E7535EB30A37/62196.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":24},{\"attribute\":\"ConditionDamage\",\"modifier\":17}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23545() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Disarmed Mortar Shell\",\"description\":\"<c=@flavor>\\\"Just to remind the world what the Iron Legion is best at.\\\"<br>—Centurion Truthbringer</c>\",\"type\":\"Trinket\",\"level\":53,\"rarity\":\"Masterwork\",\"vendor_value\":118,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23545,\"icon\":\"https://render.guildwars2.com/file/80CC5AAC2E1C0EF93A0624EC0CF0E7535EB30A37/62196.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":25},{\"attribute\":\"Vitality\",\"modifier\":18}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23546() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Devourer Toy\",\"description\":\"<c=@flavor>\\\"They love these sticks.\\\"<br>—Braxa Scalehunter</c>\",\"type\":\"Trinket\",\"level\":54,\"rarity\":\"Masterwork\",\"vendor_value\":118,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23546,\"icon\":\"https://render.guildwars2.com/file/4D80EB58D2C83705292201DF58B3C76FDEB405C9/65906.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":26},{\"attribute\":\"Vitality\",\"modifier\":18}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23547() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cappo Family Crest\",\"description\":\"<c=@flavor>\\\"Take one as a momento of the excavation.\\\"<br>—Magister Razermane</c>\",\"type\":\"Trinket\",\"level\":54,\"rarity\":\"Masterwork\",\"vendor_value\":118,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23547,\"icon\":\"https://render.guildwars2.com/file/2EF6A4E4AA26E0380E38420D28111CEA2869B1DB/455931.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":26},{\"attribute\":\"ConditionDamage\",\"modifier\":18}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23548() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Shackles\",\"description\":\"<c=@flavor>\\\"We chain ourselves to fate by the decisions we make.\\\"<br>—Warden Scourgejaw</c>\",\"type\":\"Trinket\",\"level\":55,\"rarity\":\"Masterwork\",\"vendor_value\":120,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23548,\"icon\":\"https://render.guildwars2.com/file/347F6414029A0F95AFE0DC93026E9FC87C56C3A8/220890.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":26},{\"attribute\":\"Precision\",\"modifier\":19},{\"attribute\":\"Toughness\",\"modifier\":19}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23549() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Legion Machine Gun Gear\",\"description\":\"<c=@flavor>\\\"These guns have so many gears, I'm sure the one this is from wont be missing it.\\\"<br>—Legionnaire Sleekfur</c>\",\"type\":\"Trinket\",\"level\":56,\"rarity\":\"Masterwork\",\"vendor_value\":123,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23549,\"icon\":\"https://render.guildwars2.com/file/A64CDE12565E07F00470D710377A5EAB5E953816/62264.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":27},{\"attribute\":\"Precision\",\"modifier\":19},{\"attribute\":\"Toughness\",\"modifier\":19}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23550() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sentinel Scout Badge\",\"description\":\"<c=@flavor>\\\"Thanks. You really helped us out.\\\"<br>—Sentinel Staggerfoe</c>\",\"type\":\"Trinket\",\"level\":57,\"rarity\":\"Masterwork\",\"vendor_value\":123,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23550,\"icon\":\"https://render.guildwars2.com/file/09CF1C9B3FCF30206660E1B771B70F59FCB75AF8/455932.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":28},{\"attribute\":\"Precision\",\"modifier\":20},{\"attribute\":\"Toughness\",\"modifier\":20}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23551() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sentinel Survival Badge\",\"description\":\"<c=@flavor>\\\"Live to fight another day.\\\"<br>—Sentinel Jaggedclaw</c>\",\"type\":\"Trinket\",\"level\":58,\"rarity\":\"Masterwork\",\"vendor_value\":125,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23551,\"icon\":\"https://render.guildwars2.com/file/09CF1C9B3FCF30206660E1B771B70F59FCB75AF8/455932.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":28},{\"attribute\":\"Precision\",\"modifier\":20},{\"attribute\":\"Vitality\",\"modifier\":20}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23552() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Battle of Granite Front Commendation\",\"description\":\"<c=@flavor>\\\"The Iron Legion is built with soldiers like you. Thank you.\\\"<br>—Helo Murkhaunt</c>\",\"type\":\"Trinket\",\"level\":59,\"rarity\":\"Masterwork\",\"vendor_value\":128,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23552,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":29},{\"attribute\":\"Precision\",\"modifier\":21},{\"attribute\":\"Vitality\",\"modifier\":21}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23553() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ogre Gruel Spoon\",\"description\":\"<c=@flavor>\\\"A symbol of ogre friendship.\\\"</c>\",\"type\":\"Trinket\",\"level\":59,\"rarity\":\"Masterwork\",\"vendor_value\":128,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23553,\"icon\":\"https://render.guildwars2.com/file/6F2215EB6E98B707DA6214AABF510667A6CE6609/66821.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":29},{\"attribute\":\"Toughness\",\"modifier\":21},{\"attribute\":\"Vitality\",\"modifier\":21}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23554() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Manifest of Kalla Scorchrazor\",\"description\":\"<c=@flavor>\\\"All are equal when measured under the blade.\\\"<br>—Kalla Scorchrazor</c>\",\"type\":\"Trinket\",\"level\":60,\"rarity\":\"Masterwork\",\"vendor_value\":130,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23554,\"icon\":\"https://render.guildwars2.com/file/30FF0164E2C800230DE929AD053B9A335D03C2F7/455933.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":30},{\"attribute\":\"Precision\",\"modifier\":21},{\"attribute\":\"Vitality\",\"modifier\":21}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23555() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Piken Necklace\",\"description\":\"<c=@flavor>\\\"We have all the jewlery from this site we can handle. That is a beautiful artifact though.\\\"<br>—Magister Razermane</c>\",\"type\":\"Trinket\",\"level\":54,\"rarity\":\"Fine\",\"vendor_value\":94,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23555,\"icon\":\"https://render.guildwars2.com/file/6A4462302556A1F5EC5B77AD6D63A4537E9022A1/63591.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":37},{\"attribute\":\"ConditionDamage\",\"modifier\":27}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23556() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Broken Flute\",\"description\":\"<c=@flavor>A wellworn flute.</c>\",\"type\":\"Trinket\",\"level\":30,\"rarity\":\"Fine\",\"vendor_value\":39,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23556,\"icon\":\"https://render.guildwars2.com/file/5905765D7200C5D40B6A27EB4A0B700208F15F4C/455934.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":11},{\"attribute\":\"Vitality\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23557() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Red Cape Piece\",\"description\":\"<c=@flavor>A torn piece of a red cape.</c>\",\"type\":\"Trinket\",\"level\":31,\"rarity\":\"Fine\",\"vendor_value\":39,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23557,\"icon\":\"https://render.guildwars2.com/file/9B2F7DF8C5BE57A257D16FB64AD474B63F1FC2AE/66788.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":12},{\"attribute\":\"Power\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23558() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Miner's Lantern\",\"description\":\"<c=@flavor>A light for exploring dark, dangerous places.</c>\",\"type\":\"Trinket\",\"level\":30,\"rarity\":\"Fine\",\"vendor_value\":39,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23558,\"icon\":\"https://render.guildwars2.com/file/C00439EF2BE3B9E5F86299D9F47E32C0D40AD6C4/63109.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":11},{\"attribute\":\"ConditionDamage\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23559() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vanguard Spy Badge\",\"description\":\"<c=@flavor>Awarded for service in the field.</c>\",\"type\":\"Trinket\",\"level\":30,\"rarity\":\"Fine\",\"vendor_value\":39,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23559,\"icon\":\"https://render.guildwars2.com/file/9E453379C7137EA17ADEA5AA05F39EC3E0F59641/455935.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":11},{\"attribute\":\"ConditionDamage\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23560() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Devourer Stinger\",\"description\":\"<c=@flavor>A poisonless, but impressive specimen from a devourer.</c>\",\"type\":\"Trinket\",\"level\":33,\"rarity\":\"Fine\",\"vendor_value\":42,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23560,\"icon\":\"https://render.guildwars2.com/file/BEA401EE03A79B017280E3ACE33249CE30C1F90B/66805.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":12},{\"attribute\":\"Power\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23561() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mortar Shell Propeller\",\"description\":\"<c=@flavor>An example of mortar propulsion done right.</c>\",\"type\":\"Trinket\",\"level\":33,\"rarity\":\"Fine\",\"vendor_value\":42,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23561,\"icon\":\"https://render.guildwars2.com/file/F17E5B7A18B64C715A19D454BC38DA4B19D20637/526363.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":12},{\"attribute\":\"Vitality\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23562() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Preserved Red Iris\",\"description\":\"<c=@flavor>A beautiful red flower, treated to last forever.</c>\",\"type\":\"Trinket\",\"level\":34,\"rarity\":\"Fine\",\"vendor_value\":42,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23562,\"icon\":\"https://render.guildwars2.com/file/D237341E2D2F74B529597B37E7D85DE62EA46B99/455936.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":13},{\"attribute\":\"Power\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23563() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ebonhawke Cease-Fire Agreement\",\"description\":\"<c=@flavor>This is a copy of the declaration of cease-fire between humans and charr, putting a pause on a war that has lasted for generations.</c>\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Fine\",\"vendor_value\":43,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23563,\"icon\":\"https://render.guildwars2.com/file/5DDF09ED3C0A7CD4026DA5293F07A41C9178EC0C/66878.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":13},{\"attribute\":\"Vitality\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23564() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Charr Legions Cease Fire Agreement\",\"description\":\"<c=@flavor>This document details a standing, but not permanent end to charr hostilies against the humans.</c>\",\"type\":\"Trinket\",\"level\":36,\"rarity\":\"Fine\",\"vendor_value\":44,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23564,\"icon\":\"https://render.guildwars2.com/file/5E049D0E0F0A762592C00B4C75016B099F4321B0/220891.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":14},{\"attribute\":\"ConditionDamage\",\"modifier\":10}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23565() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rosko's Campsite's Famous Bean Spoon\",\"description\":\"<c=@flavor>A collector's favorite for bean eating.</c>\",\"type\":\"Trinket\",\"level\":37,\"rarity\":\"Fine\",\"vendor_value\":44,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23565,\"icon\":\"https://render.guildwars2.com/file/1414A8E7AB7F7CDDEAD20A00D649B7ADF854DDE5/434522.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":14},{\"attribute\":\"Power\",\"modifier\":10}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}