package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0104 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem23436() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dredge Manifesto\",\"description\":\"<c=@flavor>\\\"Words are the sparks that start the flames of ideas.\\\"<br>—Rebel Isaak</c>\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":78,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23436,\"icon\":\"https://render.guildwars2.com/file/AB7619ACA2CEA6AC0FC25A6BEFE864E91C59E405/66823.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":38},{\"attribute\":\"Precision\",\"modifier\":27},{\"attribute\":\"Toughness\",\"modifier\":27}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23437() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Grawl Oil Paints\",\"description\":\"<c=@flavor>\\\"Not to give them too much credit, but this paint is just as good as some used by the great painters.\\\"<br>—Explorer Erikk</c>\",\"type\":\"Trinket\",\"level\":71,\"rarity\":\"Masterwork\",\"vendor_value\":148,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23437,\"icon\":\"https://render.guildwars2.com/file/06DF56D8B92ADF042C5D7C42574EF62F40D1D34A/455915.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":38},{\"attribute\":\"Precision\",\"modifier\":27},{\"attribute\":\"Toughness\",\"modifier\":27}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23438() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vigil Valor Commendation\",\"description\":\"<c=@flavor>\\\"Valor is the one flame that cannot be extinguished out here.\\\"<br>—Crusader D'Stolt</c>\",\"type\":\"Trinket\",\"level\":72,\"rarity\":\"Masterwork\",\"vendor_value\":150,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23438,\"icon\":\"https://render.guildwars2.com/file/DDFC7DCF675C04A73B069D0F78E92793656102A0/66819.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":39},{\"attribute\":\"Precision\",\"modifier\":28},{\"attribute\":\"Vitality\",\"modifier\":28}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23439() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Burnt Out Imp Stone\",\"description\":\"<c=@flavor>\\\"This seems to hold the key to the mysterious imps appearing.\\\"<br>—Scholar Inka</c>\",\"type\":\"Trinket\",\"level\":73,\"rarity\":\"Masterwork\",\"vendor_value\":153,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23439,\"icon\":\"https://render.guildwars2.com/file/E40D3C6ED10916BFB638016CB10495100EFA14B0/66931.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":40},{\"attribute\":\"Precision\",\"modifier\":28},{\"attribute\":\"Toughness\",\"modifier\":28}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23440() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Stone Summit Shoulder Spike\",\"description\":\"<c=@flavor>\\\"These spikes might have served a tactical purpose in battle, perhaps to denote rank.\\\"<br>—Tactician Sebastian</c>\",\"type\":\"Trinket\",\"level\":73,\"rarity\":\"Masterwork\",\"vendor_value\":153,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23440,\"icon\":\"https://render.guildwars2.com/file/DDFC7DCF675C04A73B069D0F78E92793656102A0/66819.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":40},{\"attribute\":\"Toughness\",\"modifier\":28},{\"attribute\":\"Vitality\",\"modifier\":28}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23441() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Symbol Of Balance\",\"description\":\"<c=@flavor>\\\"Find balance or fall into discord.\\\"<br>—Guardian Infinite Mind</c>\",\"type\":\"Trinket\",\"level\":74,\"rarity\":\"Masterwork\",\"vendor_value\":153,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23441,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":41},{\"attribute\":\"Precision\",\"modifier\":29},{\"attribute\":\"Vitality\",\"modifier\":29}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23442() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Blessing Of The Voice\",\"description\":\"<c=@flavor>\\\"Walk with wisdom, step with purpose.\\\"<br>—The Voice</c>\",\"type\":\"Trinket\",\"level\":78,\"rarity\":\"Masterwork\",\"vendor_value\":160,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23442,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":44},{\"attribute\":\"Precision\",\"modifier\":31},{\"attribute\":\"Vitality\",\"modifier\":31}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23443() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Shimmer Bauble of Mellaggan\",\"description\":\"<c=@flavor>\\\"Shhh-shhhimmery.\\\"<br>—Qualdup</c>\",\"type\":\"Trinket\",\"level\":77,\"rarity\":\"Masterwork\",\"vendor_value\":158,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23443,\"icon\":\"https://render.guildwars2.com/file/BDF5F226E5746470005DBE61FF03CAC3630F3405/455920.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":43},{\"attribute\":\"Toughness\",\"modifier\":31},{\"attribute\":\"Vitality\",\"modifier\":31}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23444() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mark Of The Claw\",\"description\":\"<c=@flavor>This item is scored with a deep, sharp gash and is off-set by images of water and the sky.</c>\",\"type\":\"Trinket\",\"level\":78,\"rarity\":\"Masterwork\",\"vendor_value\":160,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23444,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":44},{\"attribute\":\"Precision\",\"modifier\":31},{\"attribute\":\"Toughness\",\"modifier\":31}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23445() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Idol Of Koda\",\"description\":\"<c=@flavor>\\\"Stop. Pause. Think. Breathe.\\\"<br>—Motto Of Koda</c>\",\"type\":\"Trinket\",\"level\":79,\"rarity\":\"Masterwork\",\"vendor_value\":163,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23445,\"icon\":\"https://render.guildwars2.com/file/A036A140B400B0305F07D49AC64AC423260A65D4/455921.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":45},{\"attribute\":\"Precision\",\"modifier\":32},{\"attribute\":\"Toughness\",\"modifier\":32}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23446() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tattered Kodan Flag\",\"description\":\"<c=@flavor>\\\"Much like this flag, we too have become tattered.\\\"<br>—Shifting Waves</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23446,\"icon\":\"https://render.guildwars2.com/file/C1C6FA6651F24679FD2CF0D30EF31A08229E7D45/455922.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":46},{\"attribute\":\"Toughness\",\"modifier\":33},{\"attribute\":\"Vitality\",\"modifier\":33}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23447() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dredge Manifesto\",\"description\":\"<c=@flavor>\\\"Words are the sparks that start the flames of ideas.\\\"<br>—Rebel Isaak</c>\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Masterwork\",\"vendor_value\":155,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23447,\"icon\":\"https://render.guildwars2.com/file/AB7619ACA2CEA6AC0FC25A6BEFE864E91C59E405/66823.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":41},{\"attribute\":\"Precision\",\"modifier\":30},{\"attribute\":\"Toughness\",\"modifier\":30}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23448() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Twoloop Shell\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23448,\"icon\":\"https://render.guildwars2.com/file/243704DBD0D9F13B020910149854FA9F6775F594/222362.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":46},{\"attribute\":\"Precision\",\"modifier\":33},{\"attribute\":\"Vitality\",\"modifier\":33}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23449() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orsippus Shell\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23449,\"icon\":\"https://render.guildwars2.com/file/D5681E4191C1634104D4D2442B2D20C67AD7A8E4/222364.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":46},{\"attribute\":\"Precision\",\"modifier\":33},{\"attribute\":\"Toughness\",\"modifier\":33}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23450() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lucky Shell\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23450,\"icon\":\"https://render.guildwars2.com/file/243704DBD0D9F13B020910149854FA9F6775F594/222362.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":46},{\"attribute\":\"Precision\",\"modifier\":33},{\"attribute\":\"Toughness\",\"modifier\":33}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23451() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mining Suit Operations Manual\",\"description\":\"<c=@flavor>\\\"Written in a strange dredge script. Looks vaguely like Old Dwarven.\\\"<br>—Engineer Radley</c>\",\"type\":\"Trinket\",\"level\":47,\"rarity\":\"Fine\",\"vendor_value\":53,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23451,\"icon\":\"https://render.guildwars2.com/file/C5787913CC53E94FE477D106B1AD30A926F5D716/66752.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":19},{\"attribute\":\"ConditionDamage\",\"modifier\":14}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23452() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Order Of Whispers Secret Code\",\"description\":\"<c=@flavor>The only words visible are: \\\"Talk time dark snow.\\\"<br>—Mensorr</c>\",\"type\":\"Trinket\",\"level\":49,\"rarity\":\"Masterwork\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23452,\"icon\":\"https://render.guildwars2.com/file/DCA678B606AD70016D511892565421EC0EDB3C9C/223857.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":22},{\"attribute\":\"Power\",\"modifier\":16}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23453() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Commemorative Beer Stein\",\"description\":\"<c=@flavor>The inscription reads \\\"In Commemoration Of The Krognars Pass Moot.\\\"</c>\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":113,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23453,\"icon\":\"https://render.guildwars2.com/file/D0D82C22BD0892D55DD12CA00DC453294B312FF2/63146.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":23},{\"attribute\":\"ConditionDamage\",\"modifier\":16}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23454() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Mighty Oouo\",\"description\":\"<c=@flavor>\\\"A mini grawl might worship its mini likeness.\\\"<br>—Sizza</c>\",\"type\":\"Trinket\",\"level\":51,\"rarity\":\"Masterwork\",\"vendor_value\":113,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23454,\"icon\":\"https://render.guildwars2.com/file/51CD68AF3890AF526799952A273C7A0401727CA7/455912.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":24},{\"attribute\":\"Power\",\"modifier\":17}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23455() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Shiny Bottle Opener\",\"description\":\"<c=@flavor>\\\"We didn't need to steal these. We have claws. We took thems because they are so shiny. Cheers!\\\"<br>—Cakilak'ka</c>\",\"type\":\"Trinket\",\"level\":52,\"rarity\":\"Masterwork\",\"vendor_value\":115,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23455,\"icon\":\"https://render.guildwars2.com/file/16B2A4F155EB737271041C79124F2BDC537300D2/63603.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":24},{\"attribute\":\"ConditionDamage\",\"modifier\":17}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23456() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Goldenlight Hallow Lab Test Results\",\"description\":\"<c=@flavor>\\\"Normally only krewe members get to see these, but seeing how you helped generate the more interesting data points you can have them.\\\"<br>—Krewe Leader Seesa</c>\",\"type\":\"Trinket\",\"level\":53,\"rarity\":\"Masterwork\",\"vendor_value\":118,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23456,\"icon\":\"https://render.guildwars2.com/file/F2E1C224261C70C4D95E3A4B94B662750CA5D360/65726.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":25},{\"attribute\":\"ConditionDamage\",\"modifier\":18}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23457() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vigil Scout Medal\",\"description\":\"<c=@flavor>\\\"The Vigil recognizes your steadfastness in battle.\\\"<br>—Crusader Rugan</c>\",\"type\":\"Trinket\",\"level\":57,\"rarity\":\"Masterwork\",\"vendor_value\":123,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23457,\"icon\":\"https://render.guildwars2.com/file/E81974AFE544A89E0F9F9D08A87DD06594C10561/66772.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":28},{\"attribute\":\"ConditionDamage\",\"modifier\":20}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23458() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Graffiti-covered Stone\",\"description\":\"<c=@flavor>\\\"If you want to keep a piece, it's all yours.\\\"<br>—Crusader Brice</c>\",\"type\":\"Trinket\",\"level\":54,\"rarity\":\"Masterwork\",\"vendor_value\":118,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23458,\"icon\":\"https://render.guildwars2.com/file/0A402568104F5BE5BC644665653302005F6266CF/66800.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":26},{\"attribute\":\"Vitality\",\"modifier\":18}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23459() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Stone Summit Dwarf Badge\",\"description\":\"<c=@flavor>\\\"These badges are amazing. There are so many interesting ranks, positions, honors. It was quite a complex military organization.\\\"<br>—Researcher Raekk</c>\",\"type\":\"Trinket\",\"level\":55,\"rarity\":\"Masterwork\",\"vendor_value\":120,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23459,\"icon\":\"https://render.guildwars2.com/file/0F69C2D7C004F3D4FCD0F3750D7AD6CFD0333014/455913.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":26},{\"attribute\":\"Precision\",\"modifier\":19},{\"attribute\":\"Toughness\",\"modifier\":19}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23460() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Priory Explorer's Medal\",\"description\":\"<c=@flavor>\\\"Takes courage to come out here. Thank you.\\\"<br>—Priory Explorer Cyara</c>\",\"type\":\"Trinket\",\"level\":56,\"rarity\":\"Masterwork\",\"vendor_value\":123,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23460,\"icon\":\"https://render.guildwars2.com/file/510AABA4DA240FFD6C0572975B04CDB56D5BD960/65902.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":27},{\"attribute\":\"Precision\",\"modifier\":19},{\"attribute\":\"Toughness\",\"modifier\":19}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}