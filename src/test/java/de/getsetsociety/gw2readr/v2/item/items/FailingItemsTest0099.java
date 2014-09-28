package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0099 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem23306() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dredge Mining Lantern\",\"description\":\"<c=@flavor>\\\"Why do they need lanterns? I thought they liked working in the dark.\\\"<br>—Leika</c>\",\"type\":\"Trinket\",\"level\":23,\"rarity\":\"Fine\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23306,\"icon\":\"https://render.guildwars2.com/file/C0026CEBC6551C4113B8EFDD350DE5D1CA342341/455901.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23307() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Order of Whispers Secret Badge\",\"description\":\"<c=@flavor>\\\"The way of codes and shadows.\\\"</c>\",\"type\":\"Trinket\",\"level\":24,\"rarity\":\"Fine\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23307,\"icon\":\"https://render.guildwars2.com/file/2A176AFD1B00969604E0DFFFDF7B17B47955D630/455902.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23308() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Seraph Outrider Badge\",\"description\":\"<c=@flavor>\\\"Speed is your ally.\\\"<br>—Brian</c>\",\"type\":\"Trinket\",\"level\":24,\"rarity\":\"Fine\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23308,\"icon\":\"https://render.guildwars2.com/file/5393A43CA27FBDE60D500102342BB21A5FC45910/455903.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23309() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dusty Priory Scroll\",\"description\":\"<c=@flavor>\\\"History must be preserved.\\\"<br>—Bink</c>\",\"type\":\"Trinket\",\"level\":25,\"rarity\":\"Fine\",\"vendor_value\":34,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23309,\"icon\":\"https://render.guildwars2.com/file/21FF236A656E0BAA217C6E2E5AEBD2D1A6E3B7BC/66426.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":9},{\"attribute\":\"Power\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23310() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dwarven Amulet Relic\",\"description\":\"<c=@flavor>\\\"Such a wondrous relic. Dwarven amulets seem to last forever.\\\"<br>—Bink</c>\",\"type\":\"Trinket\",\"level\":25,\"rarity\":\"Masterwork\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23310,\"icon\":\"https://render.guildwars2.com/file/4A585ACDE5E67927352DEC6FE431A0FBC6E1377A/455904.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":16},{\"attribute\":\"Power\",\"modifier\":12}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23311() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deldrimor Ring Replica\",\"description\":\"<c=@flavor>\\\"OK, so it's not really Deldrimor steel, but it's a good replica.\\\"<br>—Bink</c>\",\"type\":\"Trinket\",\"level\":25,\"rarity\":\"Masterwork\",\"vendor_value\":81,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23311,\"icon\":\"https://render.guildwars2.com/file/6B5050A3B959FAAF3D0E5E23CA3FAA6DE9E3CB0D/455905.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":12},{\"attribute\":\"Vitality\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23312() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lionguard Patrol Badge\",\"description\":\"<c=@flavor>\\\"Long hours and hard work pays off.\\\"<br>—Haral</c>\",\"type\":\"Trinket\",\"level\":15,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23312,\"icon\":\"https://render.guildwars2.com/file/75B75FFE7557671254F31D0EDD94AEA06643AA02/455894.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23313() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hand Drawn Charcoal Portrait\",\"description\":\"<c=@flavor>\\\"Bulsa's Son\\\"</c>\",\"type\":\"Trinket\",\"level\":16,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23313,\"icon\":\"https://render.guildwars2.com/file/0DD50C0496765C6395BE623D3E0FA97CD6190649/65711.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23314() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Giant Wolf Tooth\",\"description\":\"<c=@flavor>\\\"A clean kill.\\\"<br>—Meinolf Njordson</c>\",\"type\":\"Trinket\",\"level\":17,\"rarity\":\"Masterwork\",\"vendor_value\":53,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23314,\"icon\":\"https://render.guildwars2.com/file/A2C0B6089A07CFE9953CB85B04A297A68005090F/66997.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23315() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mortar and Pestle\",\"description\":\"<c=@flavor>For the use of making fine ingredients for potions and salves.</c>\",\"type\":\"Trinket\",\"level\":17,\"rarity\":\"Masterwork\",\"vendor_value\":53,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23315,\"icon\":\"https://render.guildwars2.com/file/5A51D1547EF42E58C954B756FC129C0F36D6E6BF/455898.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23316() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bent Jotun Crown\",\"description\":\"<c=@flavor>\\\"From a once-proud race.\\\"<br>—Lionguard Nadel</c>\",\"type\":\"Trinket\",\"level\":18,\"rarity\":\"Masterwork\",\"vendor_value\":55,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23316,\"icon\":\"https://render.guildwars2.com/file/B16EB57C08301C0C0099C7B41F5A1BEEC96B90A8/455895.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23317() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Charred Owl Totem\",\"description\":\"<c=@flavor>This object bears Owl's visage and is also slightly singed.</c>\",\"type\":\"Trinket\",\"level\":19,\"rarity\":\"Masterwork\",\"vendor_value\":58,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23317,\"icon\":\"https://render.guildwars2.com/file/D2A40203DC055BDD75783DFDD4BAA39FFE171B05/455896.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23318() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Quaggan Friendship Bracelet\",\"description\":\"<c=@flavor>\\\"oOooo Friend?\\\"—Guard Lugung</c>\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":60,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23318,\"icon\":\"https://render.guildwars2.com/file/D204A5DD7F56E2E27ED3CC55A3B83ABBE94CEA4F/455899.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23319() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tiny Snowman Effigy\",\"description\":\"<c=@flavor>\\\"The grawl seemed really attached to these.\\\"<br>—Bolla</c>\",\"type\":\"Trinket\",\"level\":21,\"rarity\":\"Masterwork\",\"vendor_value\":60,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23319,\"icon\":\"https://render.guildwars2.com/file/18C9770ADC423F071A0E385CF3C85BA3B30897F0/455900.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23320() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Little Norn Figurine\",\"description\":\"<c=@flavor>This hand-carved figurine bears a crude resemblance to a norn.</c>\",\"type\":\"Trinket\",\"level\":22,\"rarity\":\"Masterwork\",\"vendor_value\":63,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23320,\"icon\":\"https://render.guildwars2.com/file/365903EF113AAD5FF6E5F77F1E46CE1072046A3D/63126.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23321() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dredge Mining Lantern\",\"description\":\"<c=@flavor>\\\"Why do they need lanterns? I thought they liked working in the dark.\\\"<br>—Leika</c>\",\"type\":\"Trinket\",\"level\":23,\"rarity\":\"Masterwork\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23321,\"icon\":\"https://render.guildwars2.com/file/C0026CEBC6551C4113B8EFDD350DE5D1CA342341/455901.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23322() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Order of Whispers Secret Badge\",\"description\":\"<c=@flavor>\\\"The way of codes and shadows.\\\"</c>\",\"type\":\"Trinket\",\"level\":24,\"rarity\":\"Masterwork\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23322,\"icon\":\"https://render.guildwars2.com/file/2A176AFD1B00969604E0DFFFDF7B17B47955D630/455902.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":10}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23323() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Seraph Outrider Badge\",\"description\":\"<c=@flavor>\\\"Speed is your ally.\\\"<br>—Brian</c>\",\"type\":\"Trinket\",\"level\":24,\"rarity\":\"Masterwork\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23323,\"icon\":\"https://render.guildwars2.com/file/5393A43CA27FBDE60D500102342BB21A5FC45910/455903.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":10}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23324() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dusty Priory Scroll\",\"description\":\"<c=@flavor>\\\"History must be preserved.\\\"<br>—Bink</c>\",\"type\":\"Trinket\",\"level\":25,\"rarity\":\"Masterwork\",\"vendor_value\":68,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23324,\"icon\":\"https://render.guildwars2.com/file/21FF236A656E0BAA217C6E2E5AEBD2D1A6E3B7BC/66426.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":10},{\"attribute\":\"Power\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23325() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Owl Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":96,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23325,\"icon\":\"https://render.guildwars2.com/file/E81E74C6D904C3E4689D6A2EFEC6644CFEF9107D/222386.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":13}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23326() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Order of Whispers Decoder Ring A1\",\"description\":\"<c=@flavor>\\\"A1 15 35 1 15 95 85 65 15 12 5\\\"</c>\",\"type\":\"Trinket\",\"level\":24,\"rarity\":\"Masterwork\",\"vendor_value\":78,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23326,\"icon\":\"https://render.guildwars2.com/file/04FA35B4422E02E2683FFD711EA935413BFA0BC6/66812.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":12}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23327() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Black Moa Feather\",\"description\":\"<c=@flavor>A striking sample of a black moa's plumage.</c>\",\"type\":\"Trinket\",\"level\":15,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23327,\"icon\":\"https://render.guildwars2.com/file/AD1C523108A70A77553538F30B36343151251EDD/455906.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23333() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dented Dredge Gear\",\"description\":\"<c=@flavor>\\\"This had to be important for something.\\\"—Molesmasher</c>\",\"type\":\"Trinket\",\"level\":5,\"rarity\":\"Fine\",\"vendor_value\":13,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23333,\"icon\":\"https://render.guildwars2.com/file/EEA4CFB52C08E67E9461A09F3C040D20CE94FA09/66816.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":3}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23334() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hare Totem\",\"description\":\"<c=@flavor>\\\"Bunny watches us, too.\\\"<br>—Bjarni</c>\",\"type\":\"Trinket\",\"level\":6,\"rarity\":\"Fine\",\"vendor_value\":14,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23334,\"icon\":\"https://render.guildwars2.com/file/FC652099E73BB298DA24FB644E050D3EFBC1592D/220905.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23335() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Empty Honey Pot\",\"description\":\"<c=@flavor>\\\"Honey is gooood.\\\"—Carman Fawntracker</c>\",\"type\":\"Trinket\",\"level\":7,\"rarity\":\"Fine\",\"vendor_value\":15,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23335,\"icon\":\"https://render.guildwars2.com/file/D412EE3304E0C30CBC4B4695624C15C44BE169A9/455908.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}