package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0111 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem23616() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ash Legion Covert Demolition Field Guide FM-29B\",\"description\":\"<c=@flavor>\\\"What you think you know can kill you just a quickly as what you don't.\\\"<br>—Sava Quicksnarl</c>\",\"type\":\"Trinket\",\"level\":69,\"rarity\":\"Masterwork\",\"vendor_value\":145,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23616,\"icon\":\"https://render.guildwars2.com/file/AC51A891D812FB67DF72B851280E6B96A2A2B940/220887.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":37},{\"attribute\":\"Toughness\",\"modifier\":26},{\"attribute\":\"Vitality\",\"modifier\":26}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23617() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ash Legion Spy Ring\",\"description\":\"<c=@flavor>\\\"Flame. Dark. Shadow. Burn.\\\"<br>—Secret Code 872SQ</c>\",\"type\":\"Trinket\",\"level\":69,\"rarity\":\"Masterwork\",\"vendor_value\":174,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23617,\"icon\":\"https://render.guildwars2.com/file/0A402568104F5BE5BC644665653302005F6266CF/66800.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":44},{\"attribute\":\"Precision\",\"modifier\":31},{\"attribute\":\"Toughness\",\"modifier\":31}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23618() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Toy Stuffed Bear\",\"description\":\"<c=@flavor>A toy bear. Can be classifed as fuzzy, wuzzy.</c>\",\"type\":\"Trinket\",\"level\":30,\"rarity\":\"Rare\",\"vendor_value\":113,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23618,\"icon\":\"https://render.guildwars2.com/file/2657676C9380B29B4ACD95C941340C0874A5673E/66810.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":13},{\"attribute\":\"Power\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23619() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Enchanted Spider Web\",\"type\":\"Trinket\",\"level\":67,\"rarity\":\"Fine\",\"vendor_value\":112,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23619,\"icon\":\"https://render.guildwars2.com/file/675657EF9EF8AF79C341BEDC5E18F4685B215CC7/220896.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":51},{\"attribute\":\"Toughness\",\"modifier\":37},{\"attribute\":\"Vitality\",\"modifier\":37}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23620() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Enchanted Spider Web\",\"type\":\"Trinket\",\"level\":67,\"rarity\":\"Masterwork\",\"vendor_value\":224,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23620,\"icon\":\"https://render.guildwars2.com/file/675657EF9EF8AF79C341BEDC5E18F4685B215CC7/220896.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":56},{\"attribute\":\"Toughness\",\"modifier\":40},{\"attribute\":\"Vitality\",\"modifier\":40}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23621() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spider Eye Amulet\",\"type\":\"Trinket\",\"level\":67,\"rarity\":\"Masterwork\",\"vendor_value\":224,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23621,\"icon\":\"https://render.guildwars2.com/file/0921674EB12510D9559C553F96E762CCDF96C835/63599.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":56},{\"attribute\":\"Precision\",\"modifier\":40},{\"attribute\":\"Vitality\",\"modifier\":40}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23622() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spider Eye Amulet\",\"type\":\"Trinket\",\"level\":67,\"rarity\":\"Fine\",\"vendor_value\":112,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23622,\"icon\":\"https://render.guildwars2.com/file/0921674EB12510D9559C553F96E762CCDF96C835/63599.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":51},{\"attribute\":\"Precision\",\"modifier\":37},{\"attribute\":\"Vitality\",\"modifier\":37}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23623() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Peace Treaty Memo\",\"description\":\"<c=@flavor>\\\"Sometimes it's not what the leaders say publicly that shapes the outcome. A memo by an assistant can mean the difference between war and peace.\\\"<br>—Kai</c>\",\"type\":\"Trinket\",\"level\":40,\"rarity\":\"Fine\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23623,\"icon\":\"https://render.guildwars2.com/file/61BD98A8976CFF20A17F5FFB9C17215D0DABB697/66824.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":16},{\"attribute\":\"Vitality\",\"modifier\":11}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23624() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deno's Fish Hook\",\"description\":\"<c=@flavor>\\\"The trick is a little rabbit fur around the top, and tie it down with a little luck all around.\\\"<br>—Deno</c>\",\"type\":\"Trinket\",\"level\":41,\"rarity\":\"Fine\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23624,\"icon\":\"https://render.guildwars2.com/file/58CC7A110853DA7E9FD46DD996A6E8640A75B7DF/220901.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":16},{\"attribute\":\"Vitality\",\"modifier\":12}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23625() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Stone Of Rinn\",\"description\":\"<c=@flavor>\\\"Ghosts hate tresspassers, and the branded hate everything. Take some stones from one ruin, put it by some branded, and you'll have a battle in no time.\\\"<br>—Erria</c>\",\"type\":\"Trinket\",\"level\":42,\"rarity\":\"Fine\",\"vendor_value\":49,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23625,\"icon\":\"https://render.guildwars2.com/file/0CC1D9193269BEE6C56C1AE85EE7960CD81DFF3F/66840.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":17},{\"attribute\":\"Vitality\",\"modifier\":12}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23626() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Legion Badge of Bravery\",\"description\":\"<c=@flavor>\\\"The Iron Legion thanks you. Maybe now we can get back to fixing up this blasted fort.\\\"<br>—Engineer Burlage Firestoker</c>\",\"type\":\"Trinket\",\"level\":43,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23626,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":17},{\"attribute\":\"ConditionDamage\",\"modifier\":12}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23627() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ogre Pet Tags\",\"description\":\"<c=@flavor>\\\"They say the Ogres infuse these with some kind of magic. Thus the bond with their pets. We just collect them because it's fun.\\\"<br>—Avarr Sneakpaw</c>\",\"type\":\"Trinket\",\"level\":43,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23627,\"icon\":\"https://render.guildwars2.com/file/0837FFBB17F349AFE268CC9F1ED22FADCCC49C5C/66836.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":17},{\"attribute\":\"Power\",\"modifier\":12}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23628() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tiny Crystal Shard\",\"description\":\"<c=@flavor>\\\"Those silly monkies will worship anything. Enjoy this tiny pockey sized \\\"Star God\\\"<br>—Olenn</c>\",\"type\":\"Trinket\",\"level\":44,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23628,\"icon\":\"https://render.guildwars2.com/file/2332B23B307FE24836C6B49CF9C53133967C21CD/220897.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":18},{\"attribute\":\"Vitality\",\"modifier\":13}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23629() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Flashing Mine Blinker\",\"description\":\"<c=@flavor>\\\"Skritt rip these out of the mines all the time. Looks like this one survived the explosion. The skritt didn't.\\\"<br>—Faithspotter</c>\",\"type\":\"Trinket\",\"level\":45,\"rarity\":\"Fine\",\"vendor_value\":52,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23629,\"icon\":\"https://render.guildwars2.com/file/9F28AFEAB395AECCCB0225220A2D489ADD4F4164/220898.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":18},{\"attribute\":\"Vitality\",\"modifier\":13}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23630() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Scriptures of Dwayna\",\"description\":\"<c=@flavor>\\\"The writing in these are ancient and beautiful. Makes you wonder what else was lost when Ascalon fell.\\\"<br>—Jinell</c>\",\"type\":\"Trinket\",\"level\":45,\"rarity\":\"Fine\",\"vendor_value\":52,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23630,\"icon\":\"https://render.guildwars2.com/file/5024A3B0410876D41AA8D1263828C17ECFD2B2ED/455943.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":18},{\"attribute\":\"Power\",\"modifier\":13}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23631() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pressed Friendship Flower\",\"description\":\"<c=@flavor>\\\"Thank you friend of Degun Shun.\\\"<br>—Shelp</c>\",\"type\":\"Trinket\",\"level\":46,\"rarity\":\"Fine\",\"vendor_value\":53,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23631,\"icon\":\"https://render.guildwars2.com/file/062ADB6BBF5758635B98DF447634BDC9E22F3007/220899.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":19},{\"attribute\":\"ConditionDamage\",\"modifier\":13}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23632() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sentinel's Scout Badge\",\"description\":\"<c=@flavor>\\\"Thank you for your help. Your work helps us get rid of those trouble making inquest.\\\"<br>—Sentinel Liharn</c>\",\"type\":\"Trinket\",\"level\":46,\"rarity\":\"Fine\",\"vendor_value\":53,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23632,\"icon\":\"https://render.guildwars2.com/file/09CF1C9B3FCF30206660E1B771B70F59FCB75AF8/455932.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":19},{\"attribute\":\"Vitality\",\"modifier\":13}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23633() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Harpy Love Momento\",\"description\":\"<c=@flavor>\\\"As much as you try to understand it. Alchemically speaking, love is still a mystery, even to my genius intellect.\\\"<br>—Wode</c>\",\"type\":\"Trinket\",\"level\":47,\"rarity\":\"Fine\",\"vendor_value\":53,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23633,\"icon\":\"https://render.guildwars2.com/file/66DF56D6BA10D6C22216AD5D02557E7CB875000E/63058.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":19},{\"attribute\":\"Power\",\"modifier\":14}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23634() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Night Vision Enhancers\",\"description\":\"<c=@flavor>\\\"Darkness, like anything else, is best when its enhanced.\\\"<br>—Fina Duskmaker</c>\",\"type\":\"Trinket\",\"level\":48,\"rarity\":\"Fine\",\"vendor_value\":54,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23634,\"icon\":\"https://render.guildwars2.com/file/37A5D8F1E53EF725042874B2D2D6450D3DCECB7C/219368.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":20},{\"attribute\":\"ConditionDamage\",\"modifier\":14}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23635() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bomb Fuse\",\"description\":\"<c=@flavor>\\\"Careful what sparks you create.\\\"<br>—Jahr Duskrend</c>\",\"type\":\"Trinket\",\"level\":49,\"rarity\":\"Fine\",\"vendor_value\":55,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23635,\"icon\":\"https://render.guildwars2.com/file/FE3280996C7B53BDB497143268031C117592DD14/62483.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":20},{\"attribute\":\"Vitality\",\"modifier\":15}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23636() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Scout Commendation Letter\",\"description\":\"<c=@flavor>\\\"On behalf of the Sentinels, thank you.\\\"<br>—Fahrtak </c>\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Fine\",\"vendor_value\":57,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23636,\"icon\":\"https://render.guildwars2.com/file/61BD98A8976CFF20A17F5FFB9C17215D0DABB697/66824.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":21},{\"attribute\":\"Vitality\",\"modifier\":15}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23637() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sweptweave Schematic\",\"description\":\"<c=@flavor>\\\"Everything starts with a plan, but nothing ever goes according to it.\\\"<br>—Torruh Sweptweave</c>\",\"type\":\"Trinket\",\"level\":42,\"rarity\":\"Fine\",\"vendor_value\":49,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23637,\"icon\":\"https://render.guildwars2.com/file/B6745C0DA4CB49665746CA04022E244606115B9F/65628.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":17},{\"attribute\":\"Power\",\"modifier\":12}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23638() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Promise Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":47,\"rarity\":\"Fine\",\"vendor_value\":63,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23638,\"icon\":\"https://render.guildwars2.com/file/0A402568104F5BE5BC644665653302005F6266CF/66800.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":23},{\"attribute\":\"ConditionDamage\",\"modifier\":17}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23639() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Old Ascalon Necklace\",\"description\":\"\",\"type\":\"Trinket\",\"level\":49,\"rarity\":\"Fine\",\"vendor_value\":88,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23639,\"icon\":\"https://render.guildwars2.com/file/0A402568104F5BE5BC644665653302005F6266CF/66800.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":33},{\"attribute\":\"ConditionDamage\",\"modifier\":23}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23640() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Old Ascalon Necklace\",\"description\":\"\",\"type\":\"Trinket\",\"level\":43,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23640,\"icon\":\"https://render.guildwars2.com/file/03C8FB276B146CB64E201F006D0FC0D2380E956B/220645.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":17},{\"attribute\":\"Vitality\",\"modifier\":12}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}