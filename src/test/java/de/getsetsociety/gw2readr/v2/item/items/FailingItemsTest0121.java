package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0121 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem23881() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Caer Astorea Defend Emblem\",\"description\":\"<c=@flavor>\\\"Your strength and bravery are inspirations to us all.\\\"<br>—Warden Llew</c>\",\"type\":\"Trinket\",\"level\":6,\"rarity\":\"Fine\",\"vendor_value\":14,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23881,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23882() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Engraved Sea Shell\",\"description\":\"<c=@flavor>\\\"This is the prettiest one I have ever found.\\\"<br>—Harvester Mavad</c>\",\"type\":\"Trinket\",\"level\":7,\"rarity\":\"Fine\",\"vendor_value\":15,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23882,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23883() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Moss Woven Charm\",\"description\":\"<c=@flavor>\\\"A reminder of the power inside yourself.\\\"<br>—Arias</c>\",\"type\":\"Trinket\",\"level\":7,\"rarity\":\"Fine\",\"vendor_value\":15,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23883,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23884() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Silent Conch Shell\",\"description\":\"<c=@flavor>\\\"Try as you might, this one is soundless.\\\"<br>—Eona</c>\",\"type\":\"Trinket\",\"level\":8,\"rarity\":\"Fine\",\"vendor_value\":17,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23884,\"icon\":\"https://render.guildwars2.com/file/2EF065513E0D6BA50BFE46BD63E96ED44272C738/455976.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23885() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thorny Prison Key\",\"description\":\"<c=@flavor>\\\"These wont unlock anything else, but they do grow in a pretty pattern.\\\"<br>—Tovar</c>\",\"type\":\"Trinket\",\"level\":9,\"rarity\":\"Fine\",\"vendor_value\":18,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23885,\"icon\":\"https://render.guildwars2.com/file/332FF8697F27CEC0A599A008C901ACD8273E0C1E/65724.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23886() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Painted Battle Jar\",\"description\":\"<c=@flavor>\\\"We hold our war paint in this jar. When the battle is over we give to the hero, in this case, that would be you.\\\"<br>—Atzintli</c>\",\"type\":\"Trinket\",\"level\":10,\"rarity\":\"Fine\",\"vendor_value\":19,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23886,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":5}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23887() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Shiny Thing Tracker\",\"description\":\"<c=@flavor>\\\"Don't worry. I won't sell your personal data to another lab.\\\"<br>—Zippti</c>\",\"type\":\"Trinket\",\"level\":11,\"rarity\":\"Fine\",\"vendor_value\":20,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23887,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":5}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23888() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Krait Tooth Pendant\",\"description\":\"<c=@flavor>\\\"We use these teeth as inspiration for our spears, you can see how deadly all those little ridges are. Use you enemies against themselves.\\\"<br>—Yoal</c>\",\"type\":\"Trinket\",\"level\":11,\"rarity\":\"Fine\",\"vendor_value\":20,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23888,\"icon\":\"https://render.guildwars2.com/file/090C47B6BFC5F70B5BA83D3B0F4630A51F07ED34/220642.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":5}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23889() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Friendship Shell\",\"description\":\"<c=@flavor>It's shaped like a hug.<br>\",\"type\":\"Trinket\",\"level\":12,\"rarity\":\"Fine\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23889,\"icon\":\"https://render.guildwars2.com/file/0C7B393FC55792DCFD2B74FF17CAD1D992F4F057/455947.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":5}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23890() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Reassignment Papers\",\"description\":\"<c=@flavor>\\\"I might be stuck here, but you don't need to be.\\\"<br>—Lionguard Hester</c>\",\"type\":\"Trinket\",\"level\":13,\"rarity\":\"Fine\",\"vendor_value\":23,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23890,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":5}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23891() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pungent Vial\",\"description\":\"<c=@flavor>\\\"A potent reminder of our beautiful swamp.\\\"<br>—Laewyn</c>\",\"type\":\"Trinket\",\"level\":14,\"rarity\":\"Fine\",\"vendor_value\":24,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23891,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":6}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23892() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tiny Troll Runestone\",\"description\":\"<c=@flavor>\\\"The trolls weave these in their hair. I can't explain it. Maybe they may have some magical powers.\\\"<br>—Lionguard Cern</c>\",\"type\":\"Trinket\",\"level\":15,\"rarity\":\"Fine\",\"vendor_value\":25,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23892,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":6}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23893() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Enchanted Rock Pendant\",\"description\":\"\",\"type\":\"Trinket\",\"level\":5,\"rarity\":\"Fine\",\"vendor_value\":13,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23893,\"icon\":\"https://render.guildwars2.com/file/68EC5E0B00ADDC56C53B0774C6059559FF357CAE/220903.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":3}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23894() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Aethervolt Pigmentation Reference Guide\",\"description\":\"<c=@flavor>\\\"Three of my own discoveries are right there on the cover.\\\"<br>—Aerixx</c>\",\"type\":\"Trinket\",\"level\":16,\"rarity\":\"Fine\",\"vendor_value\":25,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23894,\"icon\":\"https://render.guildwars2.com/file/4B9801930DE6F9F9F647F858D60CD000E01939E0/65629.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":6}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23895() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Aethervolt Pigmentation Reference Guide\",\"description\":\"<c=@flavor>\\\"If you ever find yourself surrounded by a group of hylek pointing spears at you, you'll want this.\\\"<br>—Aerixx</c>\",\"type\":\"Trinket\",\"level\":16,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23895,\"icon\":\"https://render.guildwars2.com/file/4B9801930DE6F9F9F647F858D60CD000E01939E0/65629.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23896() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dried Seed Pod\",\"description\":\"<c=@flavor>\\\"Seed pods remind us of those who have not yet awakened.\\\"<br>—Diantha</c>\",\"type\":\"Trinket\",\"level\":16,\"rarity\":\"Fine\",\"vendor_value\":25,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23896,\"icon\":\"https://render.guildwars2.com/file/5206713FF14917631B0674CA6440DA7BE25391F9/220906.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":6}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23897() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dried Seed Pod\",\"description\":\"<c=@flavor>\\\"Even the tallest tree starts as a tiny seed.\\\"<br>—Diantha</c>\",\"type\":\"Trinket\",\"level\":16,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23897,\"icon\":\"https://render.guildwars2.com/file/5206713FF14917631B0674CA6440DA7BE25391F9/220906.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23898() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Amulet of Thorns\",\"description\":\"<c=@flavor>\\\"Thorns can be as beautiful as they are painful.\\\"<br>—Diantha</c>\",\"type\":\"Trinket\",\"level\":16,\"rarity\":\"Fine\",\"vendor_value\":40,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23898,\"icon\":\"https://render.guildwars2.com/file/F2D20755F15F39F7EC9CAF5DF8370650DB41697A/222398.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":10}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23899() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Amulet of Thorns\",\"description\":\"<c=@flavor>\\\"A thorn is only as dangerous as you are careless.\\\"<br>—Diantha</c>\",\"type\":\"Trinket\",\"level\":16,\"rarity\":\"Masterwork\",\"vendor_value\":80,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23899,\"icon\":\"https://render.guildwars2.com/file/F2D20755F15F39F7EC9CAF5DF8370650DB41697A/222398.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":11}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23900() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cracked Golem Eye\",\"description\":\"<c=@flavor>\\\"Nothing I build would crack like this, but it'll work.\\\"<br>—Nessi</c>\",\"type\":\"Trinket\",\"level\":17,\"rarity\":\"Fine\",\"vendor_value\":27,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23900,\"icon\":\"https://render.guildwars2.com/file/7F9A0CB7190FC434E7E80F9472CBA168B3CA3B09/61638.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":6}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23901() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cracked Golem Eye\",\"description\":\"<c=@flavor>\\\"Just imagine the crack as your targeting sight.\\\"<br>—Nessi</c>\",\"type\":\"Trinket\",\"level\":17,\"rarity\":\"Masterwork\",\"vendor_value\":53,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23901,\"icon\":\"https://render.guildwars2.com/file/3F6CD0D1A067BA497C550CFBC5DB06F69C143FA1/455944.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23902() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Terebinth Leaf\",\"description\":\"<c=@flavor>\\\"You can still feel magic pulsing through it's veins.\\\"<br>—Leigheara</c>\",\"type\":\"Trinket\",\"level\":17,\"rarity\":\"Fine\",\"vendor_value\":27,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23902,\"icon\":\"https://render.guildwars2.com/file/CDB7C0030CF276C418EF0E3AB54A03EFF36EC5FA/223879.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":6}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23903() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Terebinth Leaf\",\"description\":\"<c=@flavor>\\\"Just holding it makes me feel better.\\\"<br>—Leigheara</c>\",\"type\":\"Trinket\",\"level\":17,\"rarity\":\"Masterwork\",\"vendor_value\":53,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23903,\"icon\":\"https://render.guildwars2.com/file/CDB7C0030CF276C418EF0E3AB54A03EFF36EC5FA/223879.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23904() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Terebinth Loop\",\"description\":\"<c=@flavor>\\\"Even the smallest sapling can still be useful.\\\"<br>—Leigheara</c>\",\"type\":\"Trinket\",\"level\":17,\"rarity\":\"Fine\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23904,\"icon\":\"https://render.guildwars2.com/file/F2A90C600A25B19908FA66357FB6567949DC7D7B/66853.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23905() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Terebinth Loop\",\"description\":\"<c=@flavor>\\\"Just a small piece of the Terebinth's power.\\\"<br>—Leigheara</c>\",\"type\":\"Trinket\",\"level\":17,\"rarity\":\"Masterwork\",\"vendor_value\":63,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23905,\"icon\":\"https://render.guildwars2.com/file/F2A90C600A25B19908FA66357FB6567949DC7D7B/66853.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}