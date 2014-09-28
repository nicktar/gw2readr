package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0106 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem23486() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Trusty Screw\",\"description\":\"<c=@flavor>\\\"When fighting ghosts, never leave home without a good screw.\\\"<br>—Zalvax</c>\",\"type\":\"Trinket\",\"level\":16,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23486,\"icon\":\"https://render.guildwars2.com/file/E9049C11B0EC062CCD63B00E6CD00E0FD8029756/63587.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23487() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ash Legion Crest\",\"description\":\"<c=@flavor>It looks like it's made to be easily hidden.</c>\",\"type\":\"Trinket\",\"level\":17,\"rarity\":\"Masterwork\",\"vendor_value\":53,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23487,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23488() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Crest of Nageling\",\"description\":\"<c=@flavor>\\\"No place like home.\\\"<br>—Kastaz</c>\",\"type\":\"Trinket\",\"level\":17,\"rarity\":\"Masterwork\",\"vendor_value\":53,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23488,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23489() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Polished Stone\",\"description\":\"\",\"type\":\"Trinket\",\"level\":17,\"rarity\":\"Masterwork\",\"vendor_value\":53,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23489,\"icon\":\"https://render.guildwars2.com/file/5F6DF9FE5AC4F16CA95B6D50485896CF56546E0C/455923.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23490() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Engraved Longhorn\",\"description\":\"<c=@flavor>A horn awarded for a prize bull.</c>\",\"type\":\"Trinket\",\"level\":17,\"rarity\":\"Masterwork\",\"vendor_value\":53,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23490,\"icon\":\"https://render.guildwars2.com/file/BEA401EE03A79B017280E3ACE33249CE30C1F90B/66805.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23491() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bent Nail\",\"description\":\"<c=@flavor>\\\"These always bring me good luck.\\\"<br>—Tamor Woodreave</c>\",\"type\":\"Trinket\",\"level\":22,\"rarity\":\"Masterwork\",\"vendor_value\":63,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23491,\"icon\":\"https://render.guildwars2.com/file/E9049C11B0EC062CCD63B00E6CD00E0FD8029756/63587.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23492() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Broken Saw Tooth\",\"description\":\"<c=@flavor>\\\"These always break off at the worst possible time.\\\"<br>—Mara Ripsaw</c>\",\"type\":\"Trinket\",\"level\":23,\"rarity\":\"Masterwork\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23492,\"icon\":\"https://render.guildwars2.com/file/44AD4BA2AC1B1C5B4E78D6B7540E0B150BAB40F3/66831.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23493() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Heartwood Fragment\",\"description\":\"<c=@flavor>\\\"This comes straight from the heart. Ha! Get it?\\\"<br>—Kona Timberrend</c>\",\"type\":\"Trinket\",\"level\":23,\"rarity\":\"Masterwork\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23493,\"icon\":\"https://render.guildwars2.com/file/365903EF113AAD5FF6E5F77F1E46CE1072046A3D/63126.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23494() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Flame Legion Crest\",\"description\":\"<c=@flavor>A souvenir from a Flame Legion battle.</c>\",\"type\":\"Trinket\",\"level\":24,\"rarity\":\"Masterwork\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23494,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":10}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23495() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Band\",\"description\":\"\",\"type\":\"Trinket\",\"level\":17,\"rarity\":\"Fine\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23495,\"icon\":\"https://render.guildwars2.com/file/16B2A4F155EB737271041C79124F2BDC537300D2/63603.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23499() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Barradin Family Crest\",\"description\":\"<c=@flavor>\\\"The Barradin family crest is old but still strong and proud. You can still hear his roar echoing in the crypt.\\\"</c>\",\"type\":\"Trinket\",\"level\":4,\"rarity\":\"Fine\",\"vendor_value\":12,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23499,\"icon\":\"https://render.guildwars2.com/file/01EB73B9FD4216E325A8C708A739F27BF171365B/455926.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":3}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23501() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Effigy Horn\",\"description\":\"<c=@flavor>\\\"After sifting through the ash, this was all that was still recognizable.\\\"</c>\",\"type\":\"Trinket\",\"level\":5,\"rarity\":\"Fine\",\"vendor_value\":13,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23501,\"icon\":\"https://render.guildwars2.com/file/D9F5326A2B1C6371B3B45AEB13EF557AD80B3404/66437.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":3}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23502() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Blood Legion Primus Badge\",\"description\":\"<c=@flavor>\\\"By Bangar's blade!\\\"<br>—Blood Legion</c>\",\"type\":\"Trinket\",\"level\":6,\"rarity\":\"Fine\",\"vendor_value\":14,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23502,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23503() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Champion Plaque\",\"description\":\"<c=@flavor>\\\"Champion of the Pit!\\\"</c>\",\"type\":\"Trinket\",\"level\":7,\"rarity\":\"Fine\",\"vendor_value\":15,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23503,\"icon\":\"https://render.guildwars2.com/file/C3E99C0522B5057698B021CAFC090E496DA33B25/66001.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23504() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Harpy Feathers\",\"description\":\"<c=@flavor>\\\"Harpy down makes a good pillow. It's soft and warm.\\\"<br>—Sagum Relicseeker</c>\",\"type\":\"Trinket\",\"level\":8,\"rarity\":\"Fine\",\"vendor_value\":17,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23504,\"icon\":\"https://render.guildwars2.com/file/D7A8443608F4C4FD501B25BD0D0E794097B19BAE/66833.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23505() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sealed Iron Legion Ghost Trap\",\"description\":\"<c=@flavor>\\\"Putting your ear close to it, you can hear something trying to get out.\\\"</c>\",\"type\":\"Trinket\",\"level\":8,\"rarity\":\"Fine\",\"vendor_value\":17,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23505,\"icon\":\"https://render.guildwars2.com/file/E8C206B0F7969078E325589D14D31B110DC4D662/63604.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23506() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Grenade Pin\",\"description\":\"<c=@flavor>\\\"Remember that time we threw grenades at drakes?\\\"</c>\",\"type\":\"Trinket\",\"level\":9,\"rarity\":\"Fine\",\"vendor_value\":18,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23506,\"icon\":\"https://render.guildwars2.com/file/E501B92B0FA359006BFCE47D96FFF619EBA5200F/66834.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23507() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Separatist Wanted Poster\",\"description\":\"<c=@flavor>\\\"Remember: 'dead or alive' means dead.\\\"</c>\",\"type\":\"Trinket\",\"level\":9,\"rarity\":\"Fine\",\"vendor_value\":18,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23507,\"icon\":\"https://render.guildwars2.com/file/D86B26AEC9D9EB1EADF17E417BC0D95FE34A51E3/455927.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23508() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Trebuchet Arming Crank\",\"description\":\"<c=@flavor>\\\"You don't wanna know how many wrecked trebuchets I had to search through to find that.\\\"</c>\",\"type\":\"Trinket\",\"level\":10,\"rarity\":\"Fine\",\"vendor_value\":19,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23508,\"icon\":\"https://render.guildwars2.com/file/FC637AA3031B585F5B025B12670C6CD5A5C1BA51/63130.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":5}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23509() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Skale Tag\",\"description\":\"<c=@flavor>\\\"Skale number 354. Do not remove on penalty of death.\\\"</c>\",\"type\":\"Trinket\",\"level\":11,\"rarity\":\"Fine\",\"vendor_value\":20,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23509,\"icon\":\"https://render.guildwars2.com/file/0837FFBB17F349AFE268CC9F1ED22FADCCC49C5C/66836.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":5}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23510() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ash Legion Primus Badge\",\"description\":\"<c=@flavor>\\\"When Swordshadow comes for you, may she leave you alive.\\\"<br>—Ash Legion</c>\",\"type\":\"Trinket\",\"level\":12,\"rarity\":\"Fine\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23510,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":5}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23512() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pyre Fierceshot Arrowhead\",\"description\":\"<c=@flavor>\\\"This arrowhead once belonged to Pyre Fierceshot.\\\"</c>\",\"type\":\"Trinket\",\"level\":6,\"rarity\":\"Fine\",\"vendor_value\":14,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23512,\"icon\":\"https://render.guildwars2.com/file/C56364EF0CD5F8D8FE110C9CA93C285E4FEFA7E0/455928.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23513() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ascalonian Signet Ring\",\"description\":\"<c=@flavor>\\\"The inscription inside the ring is too worn to be discernable.\\\"</c>\",\"type\":\"Trinket\",\"level\":8,\"rarity\":\"Fine\",\"vendor_value\":20,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23513,\"icon\":\"https://render.guildwars2.com/file/DB6CBFA9FC2923CDD6AAFA1DA6B360437CFBF62D/455929.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":5}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23514() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ghostly Scrap Metal\",\"description\":\"<c=@flavor>\\\"I'm still not sure how 'ghostly' metal can exist...\\\"<br>—Fyra </c>\",\"type\":\"Trinket\",\"level\":17,\"rarity\":\"Fine\",\"vendor_value\":27,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23514,\"icon\":\"https://render.guildwars2.com/file/B0C3CB68AFD818CCEE71023A6744FFDF4A2953B7/63141.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":6}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23515() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ghostly Scrap Metal\",\"description\":\"<c=@flavor>\\\"I'm still not sure how 'ghostly' metal can exist...\\\"<br>—Fyra </c>\",\"type\":\"Trinket\",\"level\":17,\"rarity\":\"Masterwork\",\"vendor_value\":53,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23515,\"icon\":\"https://render.guildwars2.com/file/B0C3CB68AFD818CCEE71023A6744FFDF4A2953B7/63141.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}