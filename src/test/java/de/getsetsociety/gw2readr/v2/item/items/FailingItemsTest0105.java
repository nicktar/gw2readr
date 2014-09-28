package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0105 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem23461() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mortar and Pestle\",\"description\":\"<c=@flavor>\\\"Some think our poisons are potent because of the ingredients, the real trick is how you extract them.\\\"<br>—Ichtaca</c>\",\"type\":\"Trinket\",\"level\":57,\"rarity\":\"Masterwork\",\"vendor_value\":123,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23461,\"icon\":\"https://render.guildwars2.com/file/5A51D1547EF42E58C954B756FC129C0F36D6E6BF/455898.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":28},{\"attribute\":\"Toughness\",\"modifier\":20},{\"attribute\":\"Vitality\",\"modifier\":20}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23462() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spleedoop's Friendship Shell\",\"description\":\"<c=@flavor>\\\"Thank you, friend.\\\"<br>—Commander Spleedoop</c>\",\"type\":\"Trinket\",\"level\":58,\"rarity\":\"Masterwork\",\"vendor_value\":125,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23462,\"icon\":\"https://render.guildwars2.com/file/D5681E4191C1634104D4D2442B2D20C67AD7A8E4/222364.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":28},{\"attribute\":\"Precision\",\"modifier\":20},{\"attribute\":\"Vitality\",\"modifier\":20}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23463() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Legion Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":96,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23463,\"icon\":\"https://render.guildwars2.com/file/EEA4CFB52C08E67E9461A09F3C040D20CE94FA09/66816.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":13}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23464() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Legion Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Fine\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23464,\"icon\":\"https://render.guildwars2.com/file/EEA4CFB52C08E67E9461A09F3C040D20CE94FA09/66816.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":12}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23465() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mine Pin\",\"description\":\"<c=@flavor>\\\"Yes, mines have pins, too. It helps keep them from blowing up when carring them.\\\"<br>—Tiga</c>\",\"type\":\"Trinket\",\"level\":15,\"rarity\":\"Fine\",\"vendor_value\":25,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23465,\"icon\":\"https://render.guildwars2.com/file/F54C970A597D0B060818B7F51745487106D2F904/66830.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":6}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23466() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Trusty Screw\",\"description\":\"<c=@flavor>\\\"When fighting ghosts, never leave home without a good screw.\\\"<br>—Zalvax</c>\",\"type\":\"Trinket\",\"level\":16,\"rarity\":\"Fine\",\"vendor_value\":25,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23466,\"icon\":\"https://render.guildwars2.com/file/E9049C11B0EC062CCD63B00E6CD00E0FD8029756/63587.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":6}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23467() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Engraved Longhorn\",\"description\":\"<c=@flavor>A horn awarded for a prize bull.</c>\",\"type\":\"Trinket\",\"level\":17,\"rarity\":\"Fine\",\"vendor_value\":27,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23467,\"icon\":\"https://render.guildwars2.com/file/BEA401EE03A79B017280E3ACE33249CE30C1F90B/66805.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":6}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23468() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Polished Stone\",\"description\":\"\",\"type\":\"Trinket\",\"level\":17,\"rarity\":\"Fine\",\"vendor_value\":27,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23468,\"icon\":\"https://render.guildwars2.com/file/5F6DF9FE5AC4F16CA95B6D50485896CF56546E0C/455923.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":6}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23469() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Crest of Nageling\",\"description\":\"<c=@flavor>\\\"No place like home.\\\"<br>—Kastaz</c>\",\"type\":\"Trinket\",\"level\":17,\"rarity\":\"Fine\",\"vendor_value\":27,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23469,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":6}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23470() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Meatoberfest Souvenir Spoon\",\"description\":\"<c=@flavor>\\\"Meatoberfest—1325 AE\\\"</c>\",\"type\":\"Trinket\",\"level\":15,\"rarity\":\"Fine\",\"vendor_value\":25,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23470,\"icon\":\"https://render.guildwars2.com/file/C4223358DA7DB70212CED1D1067462783D030235/434520.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":6}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23471() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dredge Spring\",\"description\":\"<c=@flavor>A spring salvaged from a dredge machine.</c>\",\"type\":\"Trinket\",\"level\":16,\"rarity\":\"Fine\",\"vendor_value\":25,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23471,\"icon\":\"https://render.guildwars2.com/file/FC637AA3031B585F5B025B12670C6CD5A5C1BA51/63130.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":6}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23472() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Petrified Tar Core\",\"description\":\"<c=@flavor>\\\"Always gotta make sure your drinking water's safe.\\\"<br>—Stout Darkmind</c>\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":60,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23472,\"icon\":\"https://render.guildwars2.com/file/0759C04469062C150B34010A15534E21A49A2C55/61968.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23473() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bent Nail\",\"description\":\"<c=@flavor>\\\"These always bring me good luck.\\\"<br>—Tamor Woodreave</c>\",\"type\":\"Trinket\",\"level\":22,\"rarity\":\"Fine\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23473,\"icon\":\"https://render.guildwars2.com/file/E9049C11B0EC062CCD63B00E6CD00E0FD8029756/63587.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23474() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Heartwood Fragment\",\"description\":\"<c=@flavor>\\\"This comes straight from the heart. Ha! Get it?\\\"<br>—Kona Timberrend</c>\",\"type\":\"Trinket\",\"level\":23,\"rarity\":\"Fine\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23474,\"icon\":\"https://render.guildwars2.com/file/365903EF113AAD5FF6E5F77F1E46CE1072046A3D/63126.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23475() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Broken Saw Tooth\",\"description\":\"<c=@flavor>\\\"These always break off at the worst possible time.\\\"<br>—Mara Ripsaw</c>\",\"type\":\"Trinket\",\"level\":23,\"rarity\":\"Fine\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23475,\"icon\":\"https://render.guildwars2.com/file/44AD4BA2AC1B1C5B4E78D6B7540E0B150BAB40F3/66831.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23476() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Flame Legion Crest\",\"description\":\"<c=@flavor>A souvenir from a Flame Legion battle.</c>\",\"type\":\"Trinket\",\"level\":24,\"rarity\":\"Fine\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23476,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23477() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ash Legion Crest\",\"description\":\"<c=@flavor>It looks like it's made to be easily hidden.</c>\",\"type\":\"Trinket\",\"level\":17,\"rarity\":\"Fine\",\"vendor_value\":27,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23477,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":6}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23478() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Stonefall Crest\",\"description\":\"\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":60,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23478,\"icon\":\"https://render.guildwars2.com/file/F4486E0A6651C27F5D720CFF30D8A9CA33A855C7/66808.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23479() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ash Legion Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Fine\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23479,\"icon\":\"https://render.guildwars2.com/file/0759C04469062C150B34010A15534E21A49A2C55/61968.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":12}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23480() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ash Legion Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":96,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23480,\"icon\":\"https://render.guildwars2.com/file/0759C04469062C150B34010A15534E21A49A2C55/61968.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":13}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23481() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ring of Stonefall\",\"description\":\"<c=@flavor>\\\"This is a symbol of strength around here.\\\"<br>—Rak Deathmane</c>\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Fine\",\"vendor_value\":36,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23481,\"icon\":\"https://render.guildwars2.com/file/0A402568104F5BE5BC644665653302005F6266CF/66800.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23482() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ring of Stonefall\",\"description\":\"<c=@flavor>\\\"This is a symbol of strength around here.\\\"<br>—Rak Deathmane</c>\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":72,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23482,\"icon\":\"https://render.guildwars2.com/file/0A402568104F5BE5BC644665653302005F6266CF/66800.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":10}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23483() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Meatoberfest Souvenir Spoon\",\"description\":\"<c=@flavor>\\\"Meatoberfest—1325 AE\\\"</c>\",\"type\":\"Trinket\",\"level\":15,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23483,\"icon\":\"https://render.guildwars2.com/file/C4223358DA7DB70212CED1D1067462783D030235/434520.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23484() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mine Pin\",\"description\":\"<c=@flavor>\\\"Yes, mines have pins, too. It helps keep them from blowing up when carring them.\\\"<br>—Tiga</c>\",\"type\":\"Trinket\",\"level\":15,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23484,\"icon\":\"https://render.guildwars2.com/file/F54C970A597D0B060818B7F51745487106D2F904/66830.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23485() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dredge Spring\",\"description\":\"<c=@flavor>A spring salvaged from a dredge machine.</c>\",\"type\":\"Trinket\",\"level\":16,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23485,\"icon\":\"https://render.guildwars2.com/file/FC637AA3031B585F5B025B12670C6CD5A5C1BA51/63130.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}