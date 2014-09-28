package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0109 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem23566() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Renegade Wanted Poster\",\"description\":\"<c=@flavor>A poster alerting passerbys about the Charr Renegade threat.</c>\",\"type\":\"Trinket\",\"level\":38,\"rarity\":\"Fine\",\"vendor_value\":45,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23566,\"icon\":\"https://render.guildwars2.com/file/16327DC36F5962DDC8BBDE0C276C4E0711D3746B/455937.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":15},{\"attribute\":\"Power\",\"modifier\":11}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23567() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sentinel's Perch Scout Medal\",\"description\":\"<c=@flavor>For service in spotting at Sentinel's Perch.</c>\",\"type\":\"Trinket\",\"level\":39,\"rarity\":\"Fine\",\"vendor_value\":47,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23567,\"icon\":\"https://render.guildwars2.com/file/C00439EF2BE3B9E5F86299D9F47E32C0D40AD6C4/63109.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":15},{\"attribute\":\"ConditionDamage\",\"modifier\":11}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23568() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sentinel Chemistry Set\",\"description\":\"<c=@flavor>Used in the field by Sentinel engineers to study the Brand.</c>\",\"type\":\"Trinket\",\"level\":40,\"rarity\":\"Fine\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23568,\"icon\":\"https://render.guildwars2.com/file/2AD7D2CD06E537BC4D50E60A0A2632C90474543A/455938.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":16},{\"attribute\":\"Power\",\"modifier\":11}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23569() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Vanguard Captain's Crest\",\"description\":\"<c=@flavor>A Vanguard Captain's adornment.</c>\",\"type\":\"Trinket\",\"level\":32,\"rarity\":\"Fine\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23569,\"icon\":\"https://render.guildwars2.com/file/6A4462302556A1F5EC5B77AD6D63A4537E9022A1/63591.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":19},{\"attribute\":\"ConditionDamage\",\"modifier\":14}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23570() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thackeray Family Replica Ring\",\"description\":\"<c=@flavor>A replica of the Thackeray family ring.</c>\",\"type\":\"Trinket\",\"level\":30,\"rarity\":\"Fine\",\"vendor_value\":47,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23570,\"icon\":\"https://render.guildwars2.com/file/D69BA09A3BC8ECE6021CF30396474D34ABAF1941/455939.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":13},{\"attribute\":\"Vitality\",\"modifier\":10}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23571() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Charr Decoder Ring\",\"description\":\"<c=@flavor>Decipher every Charr battle plan you find</c>\",\"type\":\"Trinket\",\"level\":38,\"rarity\":\"Fine\",\"vendor_value\":54,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23571,\"icon\":\"https://render.guildwars2.com/file/251B516BFE4F11714F6EE6172ABF70C306442FB9/220892.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":18},{\"attribute\":\"Vitality\",\"modifier\":13}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23572() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Broken Flute\",\"description\":\"<c=@flavor>A wellworn flute.</c>\",\"type\":\"Trinket\",\"level\":30,\"rarity\":\"Masterwork\",\"vendor_value\":78,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23572,\"icon\":\"https://render.guildwars2.com/file/5905765D7200C5D40B6A27EB4A0B700208F15F4C/455934.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":12},{\"attribute\":\"Vitality\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23573() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Charr Decoder Ring\",\"description\":\"<c=@flavor>Decipher every Charr battle plan you find</c>\",\"type\":\"Trinket\",\"level\":38,\"rarity\":\"Masterwork\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23573,\"icon\":\"https://render.guildwars2.com/file/251B516BFE4F11714F6EE6172ABF70C306442FB9/220892.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":19},{\"attribute\":\"Vitality\",\"modifier\":14}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23574() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Red Cape Piece\",\"description\":\"<c=@flavor>A torn piece of a red cape.</c>\",\"type\":\"Trinket\",\"level\":31,\"rarity\":\"Masterwork\",\"vendor_value\":78,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23574,\"icon\":\"https://render.guildwars2.com/file/9B2F7DF8C5BE57A257D16FB64AD474B63F1FC2AE/66788.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":13},{\"attribute\":\"Power\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23575() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Miner's Lantern\",\"description\":\"<c=@flavor>A light for exploring dark, dangerous places.</c>\",\"type\":\"Trinket\",\"level\":30,\"rarity\":\"Masterwork\",\"vendor_value\":78,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23575,\"icon\":\"https://render.guildwars2.com/file/C00439EF2BE3B9E5F86299D9F47E32C0D40AD6C4/63109.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":12},{\"attribute\":\"ConditionDamage\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23576() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vanguard Spy Badge\",\"description\":\"<c=@flavor>Awarded for service in the field.</c>\",\"type\":\"Trinket\",\"level\":30,\"rarity\":\"Masterwork\",\"vendor_value\":78,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23576,\"icon\":\"https://render.guildwars2.com/file/9E453379C7137EA17ADEA5AA05F39EC3E0F59641/455935.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":12},{\"attribute\":\"ConditionDamage\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23577() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Vanguard Captain's Crest\",\"description\":\"<c=@flavor>A Vanguard Captain's adornment.</c>\",\"type\":\"Trinket\",\"level\":32,\"rarity\":\"Masterwork\",\"vendor_value\":128,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23577,\"icon\":\"https://render.guildwars2.com/file/6A4462302556A1F5EC5B77AD6D63A4537E9022A1/63591.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":21},{\"attribute\":\"ConditionDamage\",\"modifier\":15}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23578() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Devourer Stinger\",\"description\":\"<c=@flavor>A poisonless, but impressive specimen from a devourer.</c>\",\"type\":\"Trinket\",\"level\":33,\"rarity\":\"Masterwork\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23578,\"icon\":\"https://render.guildwars2.com/file/BEA401EE03A79B017280E3ACE33249CE30C1F90B/66805.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":14},{\"attribute\":\"Power\",\"modifier\":10}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23579() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mortar Shell Propeller\",\"description\":\"<c=@flavor>An example of mortar propulsion done right.</c>\",\"type\":\"Trinket\",\"level\":33,\"rarity\":\"Masterwork\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23579,\"icon\":\"https://render.guildwars2.com/file/F17E5B7A18B64C715A19D454BC38DA4B19D20637/526363.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":14},{\"attribute\":\"Vitality\",\"modifier\":10}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23580() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Preserved Red Iris\",\"description\":\"<c=@flavor>A beautiful red flower, treated to last forever.</c>\",\"type\":\"Trinket\",\"level\":34,\"rarity\":\"Masterwork\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23580,\"icon\":\"https://render.guildwars2.com/file/629DE853F07A08FAF5FF7E0DD4140EC902644326/223541.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":14},{\"attribute\":\"Power\",\"modifier\":10}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23581() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ebonhawke Cease-Fire Agreement\",\"description\":\"<c=@flavor>This is a copy of the declaration of cease-fire between humans and charr, putting a pause on a war that has lasted for generations.</c>\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":85,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23581,\"icon\":\"https://render.guildwars2.com/file/5DDF09ED3C0A7CD4026DA5293F07A41C9178EC0C/66878.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":15},{\"attribute\":\"Vitality\",\"modifier\":10}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23582() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Charr Legions Cease Fire Agreement\",\"description\":\"<c=@flavor>This document details a standing, but not permanent end to charr hostilies against the humans.</c>\",\"type\":\"Trinket\",\"level\":36,\"rarity\":\"Masterwork\",\"vendor_value\":88,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23582,\"icon\":\"https://render.guildwars2.com/file/5E049D0E0F0A762592C00B4C75016B099F4321B0/220891.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":15},{\"attribute\":\"ConditionDamage\",\"modifier\":11}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23583() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rosko's Campsite's Famous Bean Spoon\",\"description\":\"<c=@flavor>A collector's favorite for bean eating.</c>\",\"type\":\"Trinket\",\"level\":37,\"rarity\":\"Masterwork\",\"vendor_value\":88,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23583,\"icon\":\"https://render.guildwars2.com/file/1414A8E7AB7F7CDDEAD20A00D649B7ADF854DDE5/434522.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":16},{\"attribute\":\"Power\",\"modifier\":11}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23584() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Renegade Wanted Poster\",\"description\":\"<c=@flavor>A despicable sort is shown to be wanted.</c>\",\"type\":\"Trinket\",\"level\":38,\"rarity\":\"Masterwork\",\"vendor_value\":90,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23584,\"icon\":\"https://render.guildwars2.com/file/16327DC36F5962DDC8BBDE0C276C4E0711D3746B/455937.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":16},{\"attribute\":\"Power\",\"modifier\":12}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23585() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sentinel's Perch Scout Medal\",\"description\":\"<c=@flavor>For service in spotting at Sentinel's Perch.</c>\",\"type\":\"Trinket\",\"level\":39,\"rarity\":\"Masterwork\",\"vendor_value\":93,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23585,\"icon\":\"https://render.guildwars2.com/file/C00439EF2BE3B9E5F86299D9F47E32C0D40AD6C4/63109.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":17},{\"attribute\":\"ConditionDamage\",\"modifier\":12}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23586() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sentinel Chemistry Set\",\"description\":\"<c=@flavor>Used in the field by Sentinel engineers to study the Brand.</c>\",\"type\":\"Trinket\",\"level\":40,\"rarity\":\"Masterwork\",\"vendor_value\":95,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23586,\"icon\":\"https://render.guildwars2.com/file/2AD7D2CD06E537BC4D50E60A0A2632C90474543A/455938.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":17},{\"attribute\":\"Power\",\"modifier\":12}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23587() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thackeray Family Replica Ring\",\"description\":\"<c=@flavor>A replica of the Thackeray family ring.</c>\",\"type\":\"Trinket\",\"level\":30,\"rarity\":\"Masterwork\",\"vendor_value\":93,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23587,\"icon\":\"https://render.guildwars2.com/file/D69BA09A3BC8ECE6021CF30396474D34ABAF1941/455939.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":15},{\"attribute\":\"Vitality\",\"modifier\":11}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23588() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Legion Badge\",\"description\":\"<c=@flavor>\\\"That tar would set us back if not for your leadership. We have a fighting chance thanks to you.\\\"<br>—Legionnaire Kress Rustmaw</c>\",\"type\":\"Trinket\",\"level\":60,\"rarity\":\"Fine\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23588,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":27},{\"attribute\":\"Precision\",\"modifier\":20},{\"attribute\":\"Vitality\",\"modifier\":20}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23589() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tar Removal Tool\",\"description\":\"<c=@flavor>\\\"These are far too dangerous to refill. It is nice to look at though. \\\"<br>—Engineer Verutum</c>\",\"type\":\"Trinket\",\"level\":61,\"rarity\":\"Fine\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23589,\"icon\":\"https://render.guildwars2.com/file/B73F53BA2F4BFA1EB8F0FA45F05C9DF542EDE952/65660.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":28},{\"attribute\":\"Toughness\",\"modifier\":20},{\"attribute\":\"Vitality\",\"modifier\":20}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23590() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Legionnaire Assault Badge\",\"description\":\"<c=@flavor>\\\"With a hero like you around the Flame Legion here wont last long.\\\"<br>—Legionnaire Neverburn</c>\",\"type\":\"Trinket\",\"level\":61,\"rarity\":\"Fine\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23590,\"icon\":\"https://render.guildwars2.com/file/07D9452FC00EC9A9803BC5540AC9346D4E69E73F/66818.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":28},{\"attribute\":\"Toughness\",\"modifier\":20},{\"attribute\":\"Vitality\",\"modifier\":20}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}