package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0100 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem23336() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Jotun Runestone\",\"description\":\"<c=@flavor>\\\"I wonder what the jotun used these for...\\\"<br>—Sheriff Padra</c>\",\"type\":\"Trinket\",\"level\":8,\"rarity\":\"Fine\",\"vendor_value\":17,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23336,\"icon\":\"https://render.guildwars2.com/file/7F99FF3EAAB69C73DB155C4EF0B23EB627434B7D/455909.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23337() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Shiny Grawl Bauble\",\"description\":\"<c=@flavor>\\\"Grawl really like shiny things.\\\"<br>—Etta</c>\",\"type\":\"Trinket\",\"level\":9,\"rarity\":\"Fine\",\"vendor_value\":18,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23337,\"icon\":\"https://render.guildwars2.com/file/97F80405ED2C35242BF3750107BAC61276B82E40/63049.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23338() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Smashed Dragon Totem\",\"description\":\"<c=@flavor>\\\"It's odd to see the grawl worshipping something more powerful than barely shaped rocks.\\\"<br>—Tor the Tall</c>\",\"type\":\"Trinket\",\"level\":10,\"rarity\":\"Fine\",\"vendor_value\":19,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23338,\"icon\":\"https://render.guildwars2.com/file/18557F10485201B809A97BD35B90681130C44348/455910.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":5}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23339() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tiny Dredge Tuning Fork\",\"description\":\"<c=@flavor>\\\"How do they eat with these things?\\\"<br>—Surveyor Falki</c>\",\"type\":\"Trinket\",\"level\":11,\"rarity\":\"Fine\",\"vendor_value\":20,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23339,\"icon\":\"https://render.guildwars2.com/file/26AB33990D3CBAA9CD42255524290C273A58FC09/223395.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":5}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23340() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wurm Hunt Souvenir Stein\",\"description\":\"<c=@flavor>\\\"1325 AE\\\"</c>\",\"type\":\"Trinket\",\"level\":12,\"rarity\":\"Fine\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23340,\"icon\":\"https://render.guildwars2.com/file/98F9BE40CA7E1006DB98756EAE94199E3315EB09/66528.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":5}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23341() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Crossroads Lionscout Badge\",\"description\":\"<c=@flavor>\\\"Rank: Lionscout\\\"</c>\",\"type\":\"Trinket\",\"level\":13,\"rarity\":\"Fine\",\"vendor_value\":23,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23341,\"icon\":\"https://render.guildwars2.com/file/75B75FFE7557671254F31D0EDD94AEA06643AA02/455894.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":5}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23342() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dolyak-Herding Bell\",\"description\":\"<c=@flavor>\\\"Good for herding dolyaks.\\\"<br>—Maxtar Rapidstep</c>\",\"type\":\"Trinket\",\"level\":14,\"rarity\":\"Fine\",\"vendor_value\":24,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23342,\"icon\":\"https://render.guildwars2.com/file/5C514FC25F020AFD4018ADEF0C01D2BA50F5DF77/66799.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":6}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23343() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Frozen Ballista Arrowhead\",\"description\":\"<c=@flavor>\\\"That has to hurt.\\\"<br>—Lionscout Alli</c>\",\"type\":\"Trinket\",\"level\":15,\"rarity\":\"Fine\",\"vendor_value\":25,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23343,\"icon\":\"https://render.guildwars2.com/file/400A0174D4115E336FEF0DB2F51B561FE0C8C496/65905.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":6}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23344() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jora Totem\",\"description\":\"<c=@flavor>This totem features a relief of the fabled norn hero Jora.</c>\",\"type\":\"Trinket\",\"level\":12,\"rarity\":\"Fine\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23344,\"icon\":\"https://render.guildwars2.com/file/CCBC1D4001CF5715470F989101D6C2F59DFFAD36/455911.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":5}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23345() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Commemorative Beer Stein\",\"description\":\"<c=@flavor>The inscription reads \\\"In Commemoration Of The Krognars Pass Moot.\\\"</c>\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Fine\",\"vendor_value\":57,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23345,\"icon\":\"https://render.guildwars2.com/file/D0D82C22BD0892D55DD12CA00DC453294B312FF2/63146.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":21},{\"attribute\":\"ConditionDamage\",\"modifier\":15}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23346() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Mighty Oouo\",\"description\":\"<c=@flavor>\\\"A mini grawl might worship its mini likeness.\\\"<br>—Sizza</c>\",\"type\":\"Trinket\",\"level\":51,\"rarity\":\"Fine\",\"vendor_value\":57,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23346,\"icon\":\"https://render.guildwars2.com/file/51CD68AF3890AF526799952A273C7A0401727CA7/455912.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":22},{\"attribute\":\"Power\",\"modifier\":15}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23347() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Graffiti-covered Stone\",\"description\":\"<c=@flavor>\\\"If you want to keep a piece, it's all yours.\\\"<br>—Crusader Brice</c>\",\"type\":\"Trinket\",\"level\":54,\"rarity\":\"Fine\",\"vendor_value\":59,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23347,\"icon\":\"https://render.guildwars2.com/file/0A402568104F5BE5BC644665653302005F6266CF/66800.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":23},{\"attribute\":\"Vitality\",\"modifier\":17}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23348() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Goldenlight Hallow Lab Test Results\",\"description\":\"<c=@flavor>\\\"Normally only krewe members get to see these, but seeing how you helped generate the more interesting data points you can have them.\\\"<br>—Krewe Leader Seesa</c>\",\"type\":\"Trinket\",\"level\":53,\"rarity\":\"Fine\",\"vendor_value\":59,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23348,\"icon\":\"https://render.guildwars2.com/file/F2E1C224261C70C4D95E3A4B94B662750CA5D360/65726.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":23},{\"attribute\":\"ConditionDamage\",\"modifier\":16}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23349() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vigil Scout Medal\",\"description\":\"<c=@flavor>\\\"The Vigil recognizes your steadfastness in battle.\\\"<br>—Crusader Rugan</c>\",\"type\":\"Trinket\",\"level\":57,\"rarity\":\"Fine\",\"vendor_value\":62,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23349,\"icon\":\"https://render.guildwars2.com/file/E81974AFE544A89E0F9F9D08A87DD06594C10561/66772.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":25},{\"attribute\":\"ConditionDamage\",\"modifier\":18}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23350() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Stone Summit Dwarf Badge\",\"description\":\"<c=@flavor>\\\"These badges are amazing. There are so many interesting ranks, positions, honors. It was quite a complex military organization.\\\"<br>—Researcher Raekk</c>\",\"type\":\"Trinket\",\"level\":55,\"rarity\":\"Fine\",\"vendor_value\":60,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23350,\"icon\":\"https://render.guildwars2.com/file/0F69C2D7C004F3D4FCD0F3750D7AD6CFD0333014/455913.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":24},{\"attribute\":\"Precision\",\"modifier\":17},{\"attribute\":\"Toughness\",\"modifier\":17}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23351() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Priory Explorer's Medal\",\"description\":\"<c=@flavor>\\\"Takes courage to come out here. Thank you.\\\"<br>—Priory Explorer Cyara</c>\",\"type\":\"Trinket\",\"level\":56,\"rarity\":\"Fine\",\"vendor_value\":62,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23351,\"icon\":\"https://render.guildwars2.com/file/510AABA4DA240FFD6C0572975B04CDB56D5BD960/65902.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":25},{\"attribute\":\"Precision\",\"modifier\":18},{\"attribute\":\"Toughness\",\"modifier\":18}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23352() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mortar and Pestle\",\"description\":\"<c=@flavor>\\\"Some think our poisons are potent because of the ingredients, the real trick is how you extract them.\\\"<br>—Ichtaca</c>\",\"type\":\"Trinket\",\"level\":57,\"rarity\":\"Fine\",\"vendor_value\":62,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23352,\"icon\":\"https://render.guildwars2.com/file/5A51D1547EF42E58C954B756FC129C0F36D6E6BF/455898.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":25},{\"attribute\":\"Toughness\",\"modifier\":18},{\"attribute\":\"Vitality\",\"modifier\":18}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23353() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spleedoop's Friendship Shell\",\"description\":\"<c=@flavor>\\\"Thank you, friend.\\\"<br>—Commander Spleedoop</c>\",\"type\":\"Trinket\",\"level\":58,\"rarity\":\"Fine\",\"vendor_value\":63,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23353,\"icon\":\"https://render.guildwars2.com/file/D5681E4191C1634104D4D2442B2D20C67AD7A8E4/222364.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":26},{\"attribute\":\"Precision\",\"modifier\":19},{\"attribute\":\"Vitality\",\"modifier\":19}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23354() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Shiny Bottle Opener\",\"description\":\"<c=@flavor>\\\"We didn't need to steal these. We have claws. We took thems because they are so shiny. Cheers!\\\"<br>—Cakilak'ka</c>\",\"type\":\"Trinket\",\"level\":52,\"rarity\":\"Fine\",\"vendor_value\":58,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23354,\"icon\":\"https://render.guildwars2.com/file/16B2A4F155EB737271041C79124F2BDC537300D2/63603.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":22},{\"attribute\":\"ConditionDamage\",\"modifier\":16}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23355() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Order Of Whispers Secret Code\",\"description\":\"<c=@flavor>The only words visible are: \\\"Talk time dark snow.\\\"<br>—Mensorr</c>\",\"type\":\"Trinket\",\"level\":49,\"rarity\":\"Fine\",\"vendor_value\":55,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23355,\"icon\":\"https://render.guildwars2.com/file/DCA678B606AD70016D511892565421EC0EDB3C9C/223857.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":20},{\"attribute\":\"Power\",\"modifier\":15}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23356() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Deldrimor Ring\",\"description\":\"<c=@flavor>\\\"Their metal working rivals that of the norn.\\\"<br>—Researcher Raekk</c>\",\"type\":\"Trinket\",\"level\":53,\"rarity\":\"Rare\",\"vendor_value\":212,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23356,\"icon\":\"https://render.guildwars2.com/file/D64DC1C2DC15D6DAD002BACA34010D769FB35ECD/455914.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":32},{\"attribute\":\"Vitality\",\"modifier\":23}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23357() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Commander's Ring\",\"description\":\"<c=@flavor>\\\"You lead like quaggan now. OOOoooOOooo\\\"<br>—Commander Spleedoop</c>\",\"type\":\"Trinket\",\"level\":53,\"rarity\":\"Rare\",\"vendor_value\":212,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23357,\"icon\":\"https://render.guildwars2.com/file/0A402568104F5BE5BC644665653302005F6266CF/66800.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":32},{\"attribute\":\"Power\",\"modifier\":23}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23358() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hunter's Amulet\",\"description\":\"<c=@flavor>\\\"Helps your aim.\\\"<br>—Ichtaca</c>\",\"type\":\"Trinket\",\"level\":55,\"rarity\":\"Rare\",\"vendor_value\":288,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23358,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":46},{\"attribute\":\"Precision\",\"modifier\":33},{\"attribute\":\"Vitality\",\"modifier\":33}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23359() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Stone Summit Shoulder Spike\",\"description\":\"<c=@flavor>\\\"This artifact is more ornament than armament, but it gives hints of ancient craftsmanship.\\\"</c>\",\"type\":\"Trinket\",\"level\":53,\"rarity\":\"Rare\",\"vendor_value\":177,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23359,\"icon\":\"https://render.guildwars2.com/file/D9C8AAED4B80010B809E465D90E81634D62EEF16/63137.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":27},{\"attribute\":\"Vitality\",\"modifier\":19}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23360() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cooking Spoon\",\"description\":\"<c=@flavor>\\\"A good cook needs a trusty spoon.\\\"<br>—Hune</c>\",\"type\":\"Trinket\",\"level\":27,\"rarity\":\"Fine\",\"vendor_value\":35,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23360,\"icon\":\"https://render.guildwars2.com/file/6F2215EB6E98B707DA6214AABF510667A6CE6609/66821.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":10},{\"attribute\":\"Power\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}