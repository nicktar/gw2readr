package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0123 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem23931() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Stolen Bandit Fork\",\"description\":\"<c=@flavor>\\\"I guess it's a weapon for really small people?\\\"<br>—Hua'racche</c>\",\"type\":\"Trinket\",\"level\":22,\"rarity\":\"Masterwork\",\"vendor_value\":63,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23931,\"icon\":\"https://render.guildwars2.com/file/155A060E0EEA20E6F354B19BA8E00E760AAD44ED/66817.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23932() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Trade Agreement\",\"description\":\"<c=@flavor>\\\"Looks like the bandits, Inquest, and Nightmare Court are working together?\\\"<br>—Mathair</c>\",\"type\":\"Trinket\",\"level\":23,\"rarity\":\"Fine\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23932,\"icon\":\"https://render.guildwars2.com/file/027D1D382447933D074BE45F405EA1F379471DEB/63127.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23933() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Trade Agreement\",\"description\":\"<c=@flavor>\\\"Pretty detailed trade agreement for a bunch of bandits. The Inquest must have written it.\\\"<br>—Mathair</c>\",\"type\":\"Trinket\",\"level\":23,\"rarity\":\"Masterwork\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23933,\"icon\":\"https://render.guildwars2.com/file/027D1D382447933D074BE45F405EA1F379471DEB/63127.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23934() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Emblem\",\"description\":\"<c=@flavor>\\\"Looks really old. I wonder where it came from.\\\"<br>—Rhea</c>\",\"type\":\"Trinket\",\"level\":23,\"rarity\":\"Fine\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23934,\"icon\":\"https://render.guildwars2.com/file/F4486E0A6651C27F5D720CFF30D8A9CA33A855C7/66808.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23935() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Emblem\",\"description\":\"<c=@flavor>\\\"Do you think it might be older than the dragons?\\\"<br>—Rhea</c>\",\"type\":\"Trinket\",\"level\":23,\"rarity\":\"Masterwork\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23935,\"icon\":\"https://render.guildwars2.com/file/F4486E0A6651C27F5D720CFF30D8A9CA33A855C7/66808.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23936() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Triforged Ring\",\"description\":\"<c=@flavor>\\\"Nothing can stand against our combined power.\\\"<br>—Rhea</c>\",\"type\":\"Trinket\",\"level\":23,\"rarity\":\"Fine\",\"vendor_value\":39,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23936,\"icon\":\"https://render.guildwars2.com/file/A4E7120FCFFC99EF7139E40A339F6349005156A6/66842.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":10}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23937() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Triforged Ring\",\"description\":\"<c=@flavor>\\\"Between the three of us, there's nothing we can't handle.\\\"<br>—Rhea</c>\",\"type\":\"Trinket\",\"level\":23,\"rarity\":\"Masterwork\",\"vendor_value\":78,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23937,\"icon\":\"https://render.guildwars2.com/file/A4E7120FCFFC99EF7139E40A339F6349005156A6/66842.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":11}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23938() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Asura Gate Tuning Crystal\",\"description\":\"<c=@flavor>\\\"Be careful with that! It's very fragile.\\\"<br>—Glaxx</c>\",\"type\":\"Trinket\",\"level\":24,\"rarity\":\"Fine\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23938,\"icon\":\"https://render.guildwars2.com/file/EBAC58106E97F3739FD94A1D4799017355110F7A/66850.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23939() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Asura Gate Tuning Crystal\",\"description\":\"<c=@flavor>\\\"Don't get any funny ideas. Only trained techs can replace a gate crystal.\\\"<br>—Glaxx</c>\",\"type\":\"Trinket\",\"level\":24,\"rarity\":\"Masterwork\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23939,\"icon\":\"https://render.guildwars2.com/file/EBAC58106E97F3739FD94A1D4799017355110F7A/66850.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":10}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23940() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Moss-Covered Emblem\",\"description\":\"<c=@flavor>\\\"Got to admit, I get a wierd feeling whenever I hold it.\\\"<br>—Issa</c>\",\"type\":\"Trinket\",\"level\":25,\"rarity\":\"Fine\",\"vendor_value\":34,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23940,\"icon\":\"https://render.guildwars2.com/file/AB9731B1DA09D963465D0C9ECD14A6539DA9B44F/66857.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":9},{\"attribute\":\"Vitality\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23941() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Moss-Covered Emblem\",\"description\":\"<c=@flavor>\\\"I feel like I've seen these markings somewhere before.\\\"<br>—Issa</c>\",\"type\":\"Trinket\",\"level\":25,\"rarity\":\"Masterwork\",\"vendor_value\":68,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23941,\"icon\":\"https://render.guildwars2.com/file/AB9731B1DA09D963465D0C9ECD14A6539DA9B44F/66857.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":10},{\"attribute\":\"Vitality\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23942() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Skritt Nobility Emblem\",\"description\":\"<c=@flavor>\\\"Usually only nobles wear these, but I just found a ton of 'em.\\\"<br>—Mrr'kkant</c>\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Fine\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23942,\"icon\":\"https://render.guildwars2.com/file/CC2E01E0F566A6EEF4F2EC2B19AA7A3E1FEFB1B4/60984.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23943() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Skritt Nobility Emblem\",\"description\":\"<c=@flavor>\\\"If anyone asks, you didn't get it from me.\\\"<br>—Mrr'kkant</c>\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":60,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23943,\"icon\":\"https://render.guildwars2.com/file/CC2E01E0F566A6EEF4F2EC2B19AA7A3E1FEFB1B4/60984.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23944() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Shiny Button\",\"description\":\"<c=@flavor>\\\"So shiny! You want it, yes? You won't find shinier!\\\"<br>—Mrr'kkant</c>\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Fine\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23944,\"icon\":\"https://render.guildwars2.com/file/EEA4CFB52C08E67E9461A09F3C040D20CE94FA09/66816.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23945() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Shiny Button\",\"description\":\"<c=@flavor>\\\"You're lucky day! I usually keep things this shiny.\\\"<br>—Mrr'kkant</c>\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":60,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23945,\"icon\":\"https://render.guildwars2.com/file/EEA4CFB52C08E67E9461A09F3C040D20CE94FA09/66816.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23946() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Inquest Targeting Reticle\",\"description\":\"<c=@flavor>\\\"Amateurish at best, but it's better than nothing.\\\"<br>—Wistt</c>\",\"type\":\"Trinket\",\"level\":25,\"rarity\":\"Fine\",\"vendor_value\":34,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23946,\"icon\":\"https://render.guildwars2.com/file/701826D2FCA61752AEECBDE80CF3BD361814FB33/62978.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":9},{\"attribute\":\"ConditionDamage\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23947() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Skritt Necklace\",\"description\":\"<c=@flavor>\\\"I don't think it would fit your neck.\\\"<br>—Mrr'kkant</c>\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":72,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23947,\"icon\":\"https://render.guildwars2.com/file/5AEB4CFC1AEEDB38256D6B68CDE8A52F0F0372BF/455977.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":10}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23948() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Skritt Necklace\",\"description\":\"<c=@flavor>\\\"Looks like a good ring for you.\\\"<br>—Mrr'kkant</c>\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Fine\",\"vendor_value\":36,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23948,\"icon\":\"https://render.guildwars2.com/file/5AEB4CFC1AEEDB38256D6B68CDE8A52F0F0372BF/455977.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23949() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Inquest Targeting Reticle\",\"description\":\"<c=@flavor>\\\"I've already learned everything I can from it.\\\"<br>—Wistt</c>\",\"type\":\"Trinket\",\"level\":25,\"rarity\":\"Masterwork\",\"vendor_value\":68,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23949,\"icon\":\"https://render.guildwars2.com/file/701826D2FCA61752AEECBDE80CF3BD361814FB33/62978.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":10},{\"attribute\":\"ConditionDamage\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23950() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Scroll\",\"description\":\"<c=@flavor>This scroll describes some practices of the ancient druids.</c>\",\"type\":\"Trinket\",\"level\":24,\"rarity\":\"Fine\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23950,\"icon\":\"https://render.guildwars2.com/file/027D1D382447933D074BE45F405EA1F379471DEB/63127.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23951() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Arcane Scroll\",\"description\":\"<c=@flavor>This scroll describes some practices of the ancient druids.</c>\",\"type\":\"Trinket\",\"level\":24,\"rarity\":\"Masterwork\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23951,\"icon\":\"https://render.guildwars2.com/file/027D1D382447933D074BE45F405EA1F379471DEB/63127.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":10}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23952() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Otherworldly Gear\",\"description\":\"<c=@flavor>\\\"This looks unlike any type of gear we've seen before.\\\"<br>—Gatekeeper</c>\",\"type\":\"Trinket\",\"level\":24,\"rarity\":\"Fine\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23952,\"icon\":\"https://render.guildwars2.com/file/A64CDE12565E07F00470D710377A5EAB5E953816/62264.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23953() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Otherworldly Shadow Gear\",\"description\":\"<c=@flavor>\\\"This looks unlike any type of gear we've seen before.\\\"<br>—Gatekeeper</c>\",\"type\":\"Trinket\",\"level\":24,\"rarity\":\"Masterwork\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23953,\"icon\":\"https://render.guildwars2.com/file/A64CDE12565E07F00470D710377A5EAB5E953816/62264.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":10}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23954() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tiny Light Globe\",\"type\":\"Trinket\",\"level\":12,\"rarity\":\"Fine\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23954,\"icon\":\"https://render.guildwars2.com/file/4D59B95AC418420104F20E9739785D43F36BAF26/66922.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":5}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23955() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Oola's Beacon Crystal\",\"description\":\"<c=@flavor>The crystal is old, but still glows faintly with power.</c>\",\"type\":\"Trinket\",\"level\":9,\"rarity\":\"Fine\",\"vendor_value\":18,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23955,\"icon\":\"https://render.guildwars2.com/file/EBAC58106E97F3739FD94A1D4799017355110F7A/66850.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}