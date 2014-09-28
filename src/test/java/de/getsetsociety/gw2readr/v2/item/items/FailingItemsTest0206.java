package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0206 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem45913() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Mithril Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":198,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":45913,\"icon\":\"https://render.guildwars2.com/file/CE291D544423D3090EFAD37315E4CEC6E0F366A6/340185.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":55},{\"attribute\":\"Power\",\"modifier\":39},{\"attribute\":\"CritDamage\",\"modifier\":39}]},\"suffix_item_id\":24542,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45914() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Mithril Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":297,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":45914,\"icon\":\"https://render.guildwars2.com/file/CE291D544423D3090EFAD37315E4CEC6E0F366A6/340185.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":59},{\"attribute\":\"Power\",\"modifier\":42},{\"attribute\":\"CritDamage\",\"modifier\":42}]},\"suffix_item_id\":24923,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45915() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Orichalcum Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":45915,\"icon\":\"https://render.guildwars2.com/file/C0151CD7E203F6476DCC41292F6D17E2369269CE/455588.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":67},{\"attribute\":\"Power\",\"modifier\":48},{\"attribute\":\"CritDamage\",\"modifier\":48}]},\"suffix_item_id\":24545,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45916() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sunstone Silver Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":25,\"rarity\":\"Fine\",\"vendor_value\":34,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":45916,\"icon\":\"https://render.guildwars2.com/file/060CA40EF7AA13BA3FC6B7E0DC93DC52B3A42A90/340129.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":9},{\"attribute\":\"Power\",\"modifier\":7}]},\"suffix_item_id\":24471,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45917() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sunstone Silver Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":85,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":45917,\"icon\":\"https://render.guildwars2.com/file/060CA40EF7AA13BA3FC6B7E0DC93DC52B3A42A90/340129.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":15},{\"attribute\":\"Power\",\"modifier\":10}]},\"suffix_item_id\":24537,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45918() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sunstone Silver Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":128,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":45918,\"icon\":\"https://render.guildwars2.com/file/EDB0C80F063DC97F0C053C01594C13C40C5EC818/433710.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":16},{\"attribute\":\"Power\",\"modifier\":11}]},\"suffix_item_id\":24903,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45919() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sunstone Gold Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":40,\"rarity\":\"Fine\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":45919,\"icon\":\"https://render.guildwars2.com/file/09D170233E67A85321B09CCC6813EF7B652978FD/340164.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":16},{\"attribute\":\"Power\",\"modifier\":11}]},\"suffix_item_id\":24503,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45920() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sunstone Gold Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":113,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":45920,\"icon\":\"https://render.guildwars2.com/file/09D170233E67A85321B09CCC6813EF7B652978FD/340164.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":23},{\"attribute\":\"Power\",\"modifier\":16}]},\"suffix_item_id\":24539,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45921() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sunstone Gold Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":169,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":45921,\"icon\":\"https://render.guildwars2.com/file/662E762604C275B3974E37B824CB3751C09E44E2/433717.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":25},{\"attribute\":\"Power\",\"modifier\":18}]},\"suffix_item_id\":24910,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45922() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Platinum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":60,\"rarity\":\"Fine\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":45922,\"icon\":\"https://render.guildwars2.com/file/F75E010D69517678A090C4B37F33F4B755C6AD74/340201.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":27},{\"attribute\":\"Power\",\"modifier\":20},{\"attribute\":\"CritDamage\",\"modifier\":20}]},\"suffix_item_id\":24875,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45923() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Platinum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":138,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":45923,\"icon\":\"https://render.guildwars2.com/file/F75E010D69517678A090C4B37F33F4B755C6AD74/340201.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":33},{\"attribute\":\"Power\",\"modifier\":24},{\"attribute\":\"CritDamage\",\"modifier\":24}]},\"suffix_item_id\":24880,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45924() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Platinum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":207,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":45924,\"icon\":\"https://render.guildwars2.com/file/213D7EBCF9034610EA4093C95C4C5C115F1901F3/433723.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":36},{\"attribute\":\"Power\",\"modifier\":26},{\"attribute\":\"CritDamage\",\"modifier\":26}]},\"suffix_item_id\":24916,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45925() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Mithril Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":78,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":45925,\"icon\":\"https://render.guildwars2.com/file/D967E8DD9CF6575498243D6DE8116AEC70B22BDE/340206.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":38},{\"attribute\":\"Power\",\"modifier\":27},{\"attribute\":\"CritDamage\",\"modifier\":27}]},\"suffix_item_id\":24521,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45926() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Mithril Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":45926,\"icon\":\"https://render.guildwars2.com/file/D967E8DD9CF6575498243D6DE8116AEC70B22BDE/340206.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":46},{\"attribute\":\"Power\",\"modifier\":33},{\"attribute\":\"CritDamage\",\"modifier\":33}]},\"suffix_item_id\":24542,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45927() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Mithril Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":248,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":45927,\"icon\":\"https://render.guildwars2.com/file/BA4201104F604DDA3C45F5735333E0BB9EE2577D/433695.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":49},{\"attribute\":\"Power\",\"modifier\":35},{\"attribute\":\"CritDamage\",\"modifier\":35}]},\"suffix_item_id\":24923,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45928() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Orichalcum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":45928,\"icon\":\"https://render.guildwars2.com/file/5007F9AD422CA0F47619EC48DF1CE5E0D1B40276/433702.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":56},{\"attribute\":\"Power\",\"modifier\":40},{\"attribute\":\"CritDamage\",\"modifier\":40}]},\"suffix_item_id\":24545,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45929() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sunstone Silver Pendant\",\"description\":\"\",\"type\":\"Trinket\",\"level\":25,\"rarity\":\"Fine\",\"vendor_value\":54,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":45929,\"icon\":\"https://render.guildwars2.com/file/489E7C7ADB0F4274BDAC1AA202F8E439F6DA5BDB/340127.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":15},{\"attribute\":\"Power\",\"modifier\":10}]},\"suffix_item_id\":24471,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45930() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sunstone Silver Pendant\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":136,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":45930,\"icon\":\"https://render.guildwars2.com/file/489E7C7ADB0F4274BDAC1AA202F8E439F6DA5BDB/340127.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":23},{\"attribute\":\"Power\",\"modifier\":17}]},\"suffix_item_id\":24537,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45931() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sunstone Silver Pendant\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":204,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":45931,\"icon\":\"https://render.guildwars2.com/file/0C429E0AD299A1A9E058D7714AE4470502EDAB1A/455629.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":26},{\"attribute\":\"Power\",\"modifier\":18}]},\"suffix_item_id\":24903,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45932() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sunstone Gold Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":40,\"rarity\":\"Fine\",\"vendor_value\":76,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":45932,\"icon\":\"https://render.guildwars2.com/file/5AA810CBC8E96A072417ECC144151A13173D7A6F/340163.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":25},{\"attribute\":\"Power\",\"modifier\":18}]},\"suffix_item_id\":24503,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45933() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sunstone Gold Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":180,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":45933,\"icon\":\"https://render.guildwars2.com/file/5AA810CBC8E96A072417ECC144151A13173D7A6F/340163.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":37},{\"attribute\":\"Power\",\"modifier\":26}]},\"suffix_item_id\":24539,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45934() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sunstone Gold Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":270,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":45934,\"icon\":\"https://render.guildwars2.com/file/31F0BC3E5FA4B60D25AE094FFA32340ED02DC141/455636.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":40},{\"attribute\":\"Power\",\"modifier\":29}]},\"suffix_item_id\":24910,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45935() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Platinum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":60,\"rarity\":\"Fine\",\"vendor_value\":104,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":45935,\"icon\":\"https://render.guildwars2.com/file/EB40509F1874E14DD7BF07040263207B7059065F/340222.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":44},{\"attribute\":\"Power\",\"modifier\":31},{\"attribute\":\"CritDamage\",\"modifier\":31}]},\"suffix_item_id\":24875,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45936() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Platinum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":220,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":45936,\"icon\":\"https://render.guildwars2.com/file/EB40509F1874E14DD7BF07040263207B7059065F/340222.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":53},{\"attribute\":\"Power\",\"modifier\":38},{\"attribute\":\"CritDamage\",\"modifier\":38}]},\"suffix_item_id\":24880,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45937() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Platinum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":45937,\"icon\":\"https://render.guildwars2.com/file/5EE109B5BC364A616F6BFE3F5C322A13FE7F0A08/455641.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":58},{\"attribute\":\"Power\",\"modifier\":41},{\"attribute\":\"CritDamage\",\"modifier\":41}]},\"suffix_item_id\":24916,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}