package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0118 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem23795() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Milton's Golden Apple Corer\",\"description\":\"<c=@flavor>\\\"Never worry about swallowing an apple seed ever again!\\\"<br>—Eilla</c>\",\"type\":\"Trinket\",\"level\":30,\"rarity\":\"Fine\",\"vendor_value\":39,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23795,\"icon\":\"https://render.guildwars2.com/file/42F9E4E9540B6E90F00E403E286F61AB34D47553/66846.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":11},{\"attribute\":\"Power\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23796() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Commemorative First Haven Silver Spoon\",\"description\":\"<c=@flavor>\\\"This spoon commemorates the first silverware produced by the fine folk of First Haven.\\\"</c>\",\"type\":\"Trinket\",\"level\":26,\"rarity\":\"Masterwork\",\"vendor_value\":70,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23796,\"icon\":\"https://render.guildwars2.com/file/6F2215EB6E98B707DA6214AABF510667A6CE6609/66821.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":11},{\"attribute\":\"Vitality\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23797() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Commemorative First Haven Metal Spoon\",\"description\":\"<c=@flavor>This spoon commemorates the first silverware produced by the fine folk of First Haven.</c>\",\"type\":\"Trinket\",\"level\":26,\"rarity\":\"Fine\",\"vendor_value\":35,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23797,\"icon\":\"https://render.guildwars2.com/file/6F2215EB6E98B707DA6214AABF510667A6CE6609/66821.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":9},{\"attribute\":\"Vitality\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23798() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Ebon Vanguard Amulet\",\"description\":\"<c=@flavor>An amulet once worn by Ebon Vanguard soldiers in the windswept north.</c>\",\"type\":\"Trinket\",\"level\":29,\"rarity\":\"Masterwork\",\"vendor_value\":120,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23798,\"icon\":\"https://render.guildwars2.com/file/942CDB0B3AA6AE4DD5081DBF79535BCE06EBDE6F/222378.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":19},{\"attribute\":\"Vitality\",\"modifier\":14}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23799() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Ebon Vanguard Amulet\",\"description\":\"<c=@flavor>An amulet once worn by Ebon Vanguard soldiers in the windswept north.</c>\",\"type\":\"Trinket\",\"level\":29,\"rarity\":\"Fine\",\"vendor_value\":60,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23799,\"icon\":\"https://render.guildwars2.com/file/942CDB0B3AA6AE4DD5081DBF79535BCE06EBDE6F/222378.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":17},{\"attribute\":\"Vitality\",\"modifier\":12}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23800() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Feather Duster\",\"description\":\"<c=@flavor>Good for cleaning those nooks and crannies.</c>\",\"type\":\"Trinket\",\"level\":29,\"rarity\":\"Fine\",\"vendor_value\":38,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23800,\"icon\":\"https://render.guildwars2.com/file/21FF236A656E0BAA217C6E2E5AEBD2D1A6E3B7BC/66426.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":11},{\"attribute\":\"ConditionDamage\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23801() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ornate Feather Duster\",\"description\":\"<c=@flavor>Mostly used for a decoration.</c>\",\"type\":\"Trinket\",\"level\":29,\"rarity\":\"Masterwork\",\"vendor_value\":75,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23801,\"icon\":\"https://render.guildwars2.com/file/21FF236A656E0BAA217C6E2E5AEBD2D1A6E3B7BC/66426.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":12},{\"attribute\":\"ConditionDamage\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23802() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sherrif's Battle Commendation\",\"description\":\"<c=@flavor>Sherrif Bloodclaw greatly appreciates your help in Junction Haven.</c>\",\"type\":\"Trinket\",\"level\":28,\"rarity\":\"Fine\",\"vendor_value\":37,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23802,\"icon\":\"https://render.guildwars2.com/file/C3E99C0522B5057698B021CAFC090E496DA33B25/66001.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":10},{\"attribute\":\"ConditionDamage\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23803() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lionguard's Battle Commendation\",\"description\":\"<c=@flavor>The Lionguard approve of your efforts in battle.</c>\",\"type\":\"Trinket\",\"level\":28,\"rarity\":\"Masterwork\",\"vendor_value\":73,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23803,\"icon\":\"https://render.guildwars2.com/file/C3E99C0522B5057698B021CAFC090E496DA33B25/66001.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":11},{\"attribute\":\"ConditionDamage\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23804() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unscathed Lionguard Field Trowel Manual\",\"description\":\"<c=@flavor>\\\"This one looks as though it hasn't been hit with a pickaxe.\\\"<br>—Lionguard Rhyn</c>\",\"type\":\"Trinket\",\"level\":27,\"rarity\":\"Masterwork\",\"vendor_value\":70,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23804,\"icon\":\"https://render.guildwars2.com/file/AB7619ACA2CEA6AC0FC25A6BEFE864E91C59E405/66823.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":11},{\"attribute\":\"Power\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23805() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dirty Lionguard Field Trowel Manual\",\"description\":\"<c=@flavor>\\\"This field manual appears to have had some heavy use, possibly as a shield. A few of the pages look like they've been gnawed on a bit.\\\"<br>—Lionguard Rhyn</c>\",\"type\":\"Trinket\",\"level\":27,\"rarity\":\"Fine\",\"vendor_value\":35,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23805,\"icon\":\"https://render.guildwars2.com/file/AB7619ACA2CEA6AC0FC25A6BEFE864E91C59E405/66823.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":10},{\"attribute\":\"Power\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23806() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Slade Pirate Flag\",\"description\":\"<c=@flavor>A trophy flag of the Slade Pirate crew.</c>\",\"type\":\"Trinket\",\"level\":31,\"rarity\":\"Masterwork\",\"vendor_value\":78,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23806,\"icon\":\"https://render.guildwars2.com/file/E95F65D07BC7DA120FC1DB53F0B5959F07B7246D/455966.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":13},{\"attribute\":\"Power\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23807() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tattered Slade Pirate Flag\",\"description\":\"<c=@flavor>A weather-beaten pirate flag.</c>\",\"type\":\"Trinket\",\"level\":31,\"rarity\":\"Fine\",\"vendor_value\":39,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23807,\"icon\":\"https://render.guildwars2.com/file/E95F65D07BC7DA120FC1DB53F0B5959F07B7246D/455966.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":12},{\"attribute\":\"Power\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23808() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gold-Lined Jackdaw Pirate Patch\",\"description\":\"<c=@flavor>This ensemble is only missing a parrot.</c>\",\"type\":\"Trinket\",\"level\":31,\"rarity\":\"Masterwork\",\"vendor_value\":78,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23808,\"icon\":\"https://render.guildwars2.com/file/7D10414BCCFDC35B3053036CC63A910B5D3F65C2/455967.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":13},{\"attribute\":\"Vitality\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23809() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jackdaw Pirate Patch\",\"description\":\"<c=@flavor>A handy change of clothes if it's every necessary to blend in with the local pirates.</c>\",\"type\":\"Trinket\",\"level\":31,\"rarity\":\"Fine\",\"vendor_value\":39,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23809,\"icon\":\"https://render.guildwars2.com/file/7D10414BCCFDC35B3053036CC63A910B5D3F65C2/455967.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":12},{\"attribute\":\"Vitality\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23810() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Krytan Royal Family Crest\",\"description\":\"<c=@flavor>\\\"A fine heirloom accessory from the ancient Krytan family.\\\"<br>—Farmhand Abhean</c>\",\"type\":\"Trinket\",\"level\":27,\"rarity\":\"Masterwork\",\"vendor_value\":70,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23810,\"icon\":\"https://render.guildwars2.com/file/4509BC03FA4ACBABBC103EF655A157CF66CE21AB/455968.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":11},{\"attribute\":\"ConditionDamage\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23811() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Blemished Ancient Krytan Royal Family Crest\",\"description\":\"<c=@flavor>\\\"A fine heirloom accessory from the ancient Krytan family.\\\"<br>—Farmhand Abhean</c>\",\"type\":\"Trinket\",\"level\":27,\"rarity\":\"Fine\",\"vendor_value\":35,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23811,\"icon\":\"https://render.guildwars2.com/file/4509BC03FA4ACBABBC103EF655A157CF66CE21AB/455968.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":10},{\"attribute\":\"ConditionDamage\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23812() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Broken Centaur Steel Shackles\",\"description\":\"<c=@flavor>\\\"Never again will these shackles be used to enslave another being.\\\"<br>—Bronson</c>\",\"type\":\"Trinket\",\"level\":28,\"rarity\":\"Masterwork\",\"vendor_value\":73,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23812,\"icon\":\"https://render.guildwars2.com/file/42F9E4E9540B6E90F00E403E286F61AB34D47553/66846.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":11},{\"attribute\":\"Vitality\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23813() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Broken Centaur Iron Shackles\",\"description\":\"<c=@flavor>\\\"Never again will these shackles be used to enslave another being.\\\"<br>—Bronson</c>\",\"type\":\"Trinket\",\"level\":28,\"rarity\":\"Fine\",\"vendor_value\":37,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23813,\"icon\":\"https://render.guildwars2.com/file/42F9E4E9540B6E90F00E403E286F61AB34D47553/66846.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":10},{\"attribute\":\"Vitality\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23814() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Antique Golden Ascalonian Ring\",\"description\":\"<c=@flavor>\\\"This beautiful ring represents a more peaceful time for the citizens of Ascalon.\\\"<br>—Bronson</c>\",\"type\":\"Trinket\",\"level\":28,\"rarity\":\"Masterwork\",\"vendor_value\":87,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23814,\"icon\":\"https://render.guildwars2.com/file/0A402568104F5BE5BC644665653302005F6266CF/66800.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":14},{\"attribute\":\"Power\",\"modifier\":10}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23815() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Antique Silver Ascalonian Ring\",\"description\":\"<c=@flavor>\\\"This beautiful ring represents a more peaceful time for the citizens of Ascalon.\\\"<br>—Bronson</c>\",\"type\":\"Trinket\",\"level\":28,\"rarity\":\"Fine\",\"vendor_value\":44,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23815,\"icon\":\"https://render.guildwars2.com/file/04FA35B4422E02E2683FFD711EA935413BFA0BC6/66812.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":12},{\"attribute\":\"Power\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23816() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pristine Ancient Krytan Dabloon\",\"description\":\"<c=@flavor>\\\"One day I was giving a pirate a lively thrashing. As he turned tail to run, I swung my sword a final time and slit his coin-purse straight down the middle.\\\"<br>—Lionguard Mei</c>\",\"type\":\"Trinket\",\"level\":32,\"rarity\":\"Masterwork\",\"vendor_value\":80,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23816,\"icon\":\"https://render.guildwars2.com/file/AB0317DF5B0E1BA47436A5420248660765154C08/62864.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":13},{\"attribute\":\"Power\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23817() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rusty Ancient Krytan Dabloon\",\"description\":\"<c=@flavor>\\\"One day I was giving a pirate a lively thrashing. As he turned tail to run, I swung my sword a final time and slit his coin-purse straight down the middle.\\\"<br>—Lionguard Mei</c>\",\"type\":\"Trinket\",\"level\":32,\"rarity\":\"Fine\",\"vendor_value\":40,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23817,\"icon\":\"https://render.guildwars2.com/file/AB0317DF5B0E1BA47436A5420248660765154C08/62864.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":12},{\"attribute\":\"Power\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23818() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Arena Armlet\",\"description\":\"<c=@flavor>Fashionable, yet functional.</c>\",\"type\":\"Trinket\",\"level\":26,\"rarity\":\"Masterwork\",\"vendor_value\":70,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23818,\"icon\":\"https://render.guildwars2.com/file/55010C3751D7C862064C5E6028CFB527DE376AB5/66847.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":11},{\"attribute\":\"Power\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23819() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pristine Gold Ring\",\"description\":\"<c=@flavor>A plain, but well-made piece of jewelry.</c>\",\"type\":\"Trinket\",\"level\":29,\"rarity\":\"Masterwork\",\"vendor_value\":90,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23819,\"icon\":\"https://render.guildwars2.com/file/0A402568104F5BE5BC644665653302005F6266CF/66800.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":14},{\"attribute\":\"ConditionDamage\",\"modifier\":10}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}