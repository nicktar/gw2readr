package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0116 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem23745() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tengu Feather Charm\",\"description\":\"<c=@flavor>\\\"It is said our feathers can control the winds.\\\"<br>—Sangdo Swiftwing</c>\",\"type\":\"Trinket\",\"level\":21,\"rarity\":\"Fine\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23745,\"icon\":\"https://render.guildwars2.com/file/CD641E313C19ACDDAE34CDC52B48181EC763089F/63110.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23746() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Togatl Truffle Charm\",\"description\":\"<c=@flavor>\\\"The truffle is a symbol of survival in tough times.\\\"<br>—Matlal</c>\",\"type\":\"Trinket\",\"level\":22,\"rarity\":\"Fine\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23746,\"icon\":\"https://render.guildwars2.com/file/7D70420B60279BB1019EE840FD0B493CB41EF993/66820.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23747() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Togatl Magic Vial\",\"description\":\"<c=@flavor>\\\"The truffle oil is mixed with our tribal magic.\\\"<br>—Matlal</c>\",\"type\":\"Trinket\",\"level\":22,\"rarity\":\"Fine\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23747,\"icon\":\"https://render.guildwars2.com/file/E850A6E39F5011B2FBEF45973AAD40A5309D5ABB/63059.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23748() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Brightheart Orchid\",\"description\":\"<c=@flavor>\\\"We've managed to save a handful of these beautiful, rare flowers. Protect it with your life.\\\"<br>—Caedmon</c>\",\"type\":\"Trinket\",\"level\":22,\"rarity\":\"Fine\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23748,\"icon\":\"https://render.guildwars2.com/file/FA53FDE67AB9FE0D6632301269ECA119AD4809DF/66782.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23749() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Seraph Scout Badge\",\"description\":\"<c=@flavor>\\\"The queen and the Seraph honor you.\\\"<br>—Erika Rane</c>\",\"type\":\"Trinket\",\"level\":22,\"rarity\":\"Fine\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23749,\"icon\":\"https://render.guildwars2.com/file/5393A43CA27FBDE60D500102342BB21A5FC45910/455903.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23750() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Doolsileep's Seashell Charm\",\"description\":\"<c=@flavor>\\\"Quaggan makes these bejeweled sea shells to protect others from the blood witch's curses. Maybe one day it can protect you.\\\"<br>—Doolsileep</c>\",\"type\":\"Trinket\",\"level\":23,\"rarity\":\"Fine\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23750,\"icon\":\"https://render.guildwars2.com/file/0CC1D9193269BEE6C56C1AE85EE7960CD81DFF3F/66840.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23751() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dwayna's Salmic Charm\",\"description\":\"<c=@flavor>\\\"While some may pray to Balthazar, this reminds me that a soldier's peace is inevitable.\\\"<br>—Sergeant Yarbrough</c>\",\"type\":\"Trinket\",\"level\":22,\"rarity\":\"Fine\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23751,\"icon\":\"https://render.guildwars2.com/file/64B50BFCE210C96DBDA5405394DD913A2155DC98/66839.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23752() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Shining Blade Emblem\",\"description\":\"<c=@flavor>\\\"These must have some kind of old power inbued in them.\\\"<br>—Seraph Soldier Dianna</c>\",\"type\":\"Trinket\",\"level\":24,\"rarity\":\"Fine\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23752,\"icon\":\"https://render.guildwars2.com/file/F4486E0A6651C27F5D720CFF30D8A9CA33A855C7/66808.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23753() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Harathi Catapult Spring\",\"description\":\"<c=@flavor>\\\"Bet their catapult won't work without this!\\\"<br>—Tripp</c>\",\"type\":\"Trinket\",\"level\":25,\"rarity\":\"Fine\",\"vendor_value\":34,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23753,\"icon\":\"https://render.guildwars2.com/file/A64CDE12565E07F00470D710377A5EAB5E953816/62264.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":9},{\"attribute\":\"ConditionDamage\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23754() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mona's Ring\",\"description\":\"<c=@flavor>\\\"Quit talking and buy something.\\\"<br>—Mona</c>\",\"type\":\"Trinket\",\"level\":5,\"rarity\":\"Fine\",\"vendor_value\":15,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23754,\"icon\":\"https://render.guildwars2.com/file/04FA35B4422E02E2683FFD711EA935413BFA0BC6/66812.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23755() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Queen's Medal\",\"description\":\"<c=@flavor>\\\"A medal rewarded by the queen for exemplary efforts.\\\"</c>\",\"type\":\"Trinket\",\"level\":22,\"rarity\":\"Fine\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23755,\"icon\":\"https://render.guildwars2.com/file/F4486E0A6651C27F5D720CFF30D8A9CA33A855C7/66808.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23756() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Black Haven Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":22,\"rarity\":\"Masterwork\",\"vendor_value\":75,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23756,\"icon\":\"https://render.guildwars2.com/file/02776ECC5702B415A0F65D474B14245D1F17209F/63593.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":11}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23757() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jeweled Broach\",\"description\":\"\",\"type\":\"Trinket\",\"level\":15,\"rarity\":\"Fine\",\"vendor_value\":36,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23757,\"icon\":\"https://render.guildwars2.com/file/DDFC7DCF675C04A73B069D0F78E92793656102A0/66819.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23758() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Emily's Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":16,\"rarity\":\"Fine\",\"vendor_value\":40,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23758,\"icon\":\"https://render.guildwars2.com/file/F1A44C38AF1B01E76C23A9FB40FD4B73906563DC/222366.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":10}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23759() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sweet Ring\",\"description\":\"<c=@flavor>\\\"This ring is made of rock candy.\\\"</c>\",\"type\":\"Trinket\",\"level\":15,\"rarity\":\"Fine\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23759,\"icon\":\"https://render.guildwars2.com/file/DB7DE5A24393E53EC84DED20B1C26F57677C3691/455959.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23760() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Super Sweet Ring\",\"description\":\"<c=@flavor>\\\"This ring is made of rock candy.\\\"</c>\",\"type\":\"Trinket\",\"level\":15,\"rarity\":\"Masterwork\",\"vendor_value\":60,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23760,\"icon\":\"https://render.guildwars2.com/file/A4E7120FCFFC99EF7139E40A339F6349005156A6/66842.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23761() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Small Troll Stone\",\"description\":\"<c=@flavor>\\\"I find these all over. The trolls seem to really like them.\\\"<br>—Rune Hunter</c>\",\"type\":\"Trinket\",\"level\":11,\"rarity\":\"Fine\",\"vendor_value\":20,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23761,\"icon\":\"https://render.guildwars2.com/file/510AABA4DA240FFD6C0572975B04CDB56D5BD960/65902.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":5}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23762() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Frog in a Jar\",\"description\":\"<c=@flavor>The frog contained in the vessel is resting. Holes poked in the top ensure the frog will have plenty of air.</c>\",\"type\":\"Trinket\",\"level\":45,\"rarity\":\"Fine\",\"vendor_value\":52,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23762,\"icon\":\"https://render.guildwars2.com/file/0B26F0BB696D5628214C1C72B3C8C4F8E44FC3C0/455960.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":18},{\"attribute\":\"Vitality\",\"modifier\":13}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23763() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Frog in a Jar\",\"description\":\"<c=@flavor>The frog contained in the vessel is resting. Holes poked in the top ensure the frog will have plenty of air.</c>\",\"type\":\"Trinket\",\"level\":45,\"rarity\":\"Masterwork\",\"vendor_value\":103,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23763,\"icon\":\"https://render.guildwars2.com/file/0B26F0BB696D5628214C1C72B3C8C4F8E44FC3C0/455960.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":20},{\"attribute\":\"Vitality\",\"modifier\":14}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23764() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ghostly Doubloon\",\"description\":\"<c=@flavor>\\\"This used to be cursed but the Durmand Priory removed it.\\\"<br>—Professor Maciver</c>\",\"type\":\"Trinket\",\"level\":45,\"rarity\":\"Masterwork\",\"vendor_value\":103,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23764,\"icon\":\"https://render.guildwars2.com/file/E1EDF8D1120BA409AB0E5FE69CF8B65F1424B731/455961.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":20},{\"attribute\":\"Vitality\",\"modifier\":14}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23765() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ghostly Doubloon\",\"description\":\"<c=@flavor>\\\"This used to be cursed but the Durmand Priory removed it.\\\"<br>—Professor Maciver</c>\",\"type\":\"Trinket\",\"level\":45,\"rarity\":\"Fine\",\"vendor_value\":52,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23765,\"icon\":\"https://render.guildwars2.com/file/E1EDF8D1120BA409AB0E5FE69CF8B65F1424B731/455961.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":18},{\"attribute\":\"Power\",\"modifier\":13}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23766() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Crab Bedazzler\",\"description\":\"<c=@flavor>Perfect for giving any drab crab some style.</c>\",\"type\":\"Trinket\",\"level\":46,\"rarity\":\"Fine\",\"vendor_value\":53,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23766,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":19},{\"attribute\":\"Power\",\"modifier\":13}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23767() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Crab Bedazzler\",\"description\":\"<c=@flavor>Perfect for giving any drab crab some style.</c>\",\"type\":\"Trinket\",\"level\":46,\"rarity\":\"Masterwork\",\"vendor_value\":105,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23767,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":21},{\"attribute\":\"Power\",\"modifier\":15}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23768() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Smashed Inquest Capacitor\",\"description\":\"<c=@flavor>The capacitor is broken, but it might be useful elsewhere.</c>\",\"type\":\"Trinket\",\"level\":46,\"rarity\":\"Masterwork\",\"vendor_value\":105,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23768,\"icon\":\"https://render.guildwars2.com/file/ACAB265A3CC65F0F7A9BCA3051D528B478546EC8/455962.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":21},{\"attribute\":\"Vitality\",\"modifier\":15}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23769() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Smashed Inquest Capacitor\",\"description\":\"<c=@flavor>The capacitor is broken, but it might be useful elsewhere.</c>\",\"type\":\"Trinket\",\"level\":47,\"rarity\":\"Fine\",\"vendor_value\":53,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23769,\"icon\":\"https://render.guildwars2.com/file/ACAB265A3CC65F0F7A9BCA3051D528B478546EC8/455962.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":19},{\"attribute\":\"Vitality\",\"modifier\":14}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}