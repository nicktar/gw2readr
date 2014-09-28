package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0205 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem45888() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spiritwood Staff Shaft\",\"description\":\"Used in staff crafting.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45888,\"icon\":\"https://render.guildwars2.com/file/0CD3E53802AD9FB9AF20F6C0E2AD6B0ACE1EDA56/631203.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45889() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deldrimor Steel Trident Head\",\"description\":\"Used to craft tridents.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45889,\"icon\":\"https://render.guildwars2.com/file/D995F418EB24DEBDB33DF10B5AB0977D72925746/631204.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45890() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spiritwood Trident Shaft\",\"description\":\"Used to craft tridents.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":45890,\"icon\":\"https://render.guildwars2.com/file/F0EEDE33FD98F8B5A340DDB4E33E237973CBBE01/631205.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45891() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Damask Coat Lining\",\"description\":\"Used to craft Damask Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45891,\"icon\":\"https://render.guildwars2.com/file/2D9A780C08EBB0E66BFE465C794527BFD2EFE831/699269.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45892() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Damask Coat Panel\",\"description\":\"Used to craft Damask Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45892,\"icon\":\"https://render.guildwars2.com/file/01FD07EEB93A1ED6BDB01D75D3EC15F320A91AF0/699270.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45893() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Damask Epaulet Padding\",\"description\":\"Used to craft Damask Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45893,\"icon\":\"https://render.guildwars2.com/file/9B083601AB2A2F41D3E9D8D1489B04F5FBD531EC/699271.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45894() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Damask Gloves Padding\",\"description\":\"Used to craft Damask Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45894,\"icon\":\"https://render.guildwars2.com/file/462EC5A558D2BDE6B950B49A0D68DC059C0B0257/699272.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45895() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Damask Gloves Panel\",\"description\":\"Used to craft Damask Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45895,\"icon\":\"https://render.guildwars2.com/file/52EF0164ABBF366B9DD4AB050AAB61F14F1942FB/699273.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45896() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Damask Helm Padding\",\"description\":\"Used to craft Damask Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45896,\"icon\":\"https://render.guildwars2.com/file/F4E2F0023A6B20687EEA11BB71E2FF10BB041841/699274.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45897() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Damask Helm Strap\",\"description\":\"Used to craft Damask Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45897,\"icon\":\"https://render.guildwars2.com/file/CF0FA8994371FCEFE8635BA5E96C56A10B3337E1/699275.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45898() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Damask Pants Lining\",\"description\":\"Used to craft Damask Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45898,\"icon\":\"https://render.guildwars2.com/file/4FA5E273611502729F586121A40D0A0DD67B5825/699276.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45899() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Damask Pants Panel\",\"description\":\"Used to craft Damask Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45899,\"icon\":\"https://render.guildwars2.com/file/4B0B064F035F02C027F3C1A47120067C36B57D36/699277.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45900() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Damask Shoe Upper\",\"description\":\"Used to craft Damask Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45900,\"icon\":\"https://render.guildwars2.com/file/4994464797BB0C9A37C5933BD95E2480DD1A474C/699278.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45901() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Damask Epaulet Panel\",\"description\":\"Used to craft Damask Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45901,\"icon\":\"https://render.guildwars2.com/file/4ECBACADAB14E4492D2DD5540CEBD4181E58E245/699279.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45902() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Damask Shoe Sole\",\"description\":\"Used to craft Damask Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":45902,\"icon\":\"https://render.guildwars2.com/file/E53E3277EB0552A9391C800FB7E1100FE3E20E92/699280.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45903() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sunstone Silver Band\",\"description\":\"\",\"type\":\"Trinket\",\"level\":25,\"rarity\":\"Fine\",\"vendor_value\":41,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":45903,\"icon\":\"https://render.guildwars2.com/file/97403B01953F402E37A9BA5C539C0C9EF9AB4BB3/340125.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":11},{\"attribute\":\"Power\",\"modifier\":8}]},\"suffix_item_id\":24471,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45904() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sunstone Silver Band\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":102,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":45904,\"icon\":\"https://render.guildwars2.com/file/97403B01953F402E37A9BA5C539C0C9EF9AB4BB3/340125.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":17},{\"attribute\":\"Power\",\"modifier\":12}]},\"suffix_item_id\":24537,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45905() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sunstone Silver Band\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":153,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":45905,\"icon\":\"https://render.guildwars2.com/file/41FD0AE201704F5E0751EB92AADD9EE80BD46C7E/455610.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":19},{\"attribute\":\"Power\",\"modifier\":14}]},\"suffix_item_id\":24903,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45906() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sunstone Gold Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":40,\"rarity\":\"Fine\",\"vendor_value\":57,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":45906,\"icon\":\"https://render.guildwars2.com/file/E607077D1D6003E515A8466EC73CDDE9B594ADE0/340162.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":19},{\"attribute\":\"Power\",\"modifier\":13}]},\"suffix_item_id\":24503,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45907() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sunstone Gold Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":135,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":45907,\"icon\":\"https://render.guildwars2.com/file/E607077D1D6003E515A8466EC73CDDE9B594ADE0/340162.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":28},{\"attribute\":\"Power\",\"modifier\":20}]},\"suffix_item_id\":24539,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45908() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sunstone Gold Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":203,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":45908,\"icon\":\"https://render.guildwars2.com/file/96A0A65E7C181D26554F3092F79139529FE8D89D/455616.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":30},{\"attribute\":\"Power\",\"modifier\":21}]},\"suffix_item_id\":24910,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45909() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Platinum Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":60,\"rarity\":\"Fine\",\"vendor_value\":78,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":45909,\"icon\":\"https://render.guildwars2.com/file/EB7A24B9BE7A6D44D955DAFFB239CE750A2AFEB2/340180.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":33},{\"attribute\":\"Power\",\"modifier\":23},{\"attribute\":\"CritDamage\",\"modifier\":23}]},\"suffix_item_id\":24875,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45910() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Platinum Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":45910,\"icon\":\"https://render.guildwars2.com/file/EB7A24B9BE7A6D44D955DAFFB239CE750A2AFEB2/340180.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":40},{\"attribute\":\"Power\",\"modifier\":29},{\"attribute\":\"CritDamage\",\"modifier\":29}]},\"suffix_item_id\":24880,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45911() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Platinum Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":248,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":45911,\"icon\":\"https://render.guildwars2.com/file/B20FC548FEBB3CDB777CC3C2A2F0E99A5E1ACAFC/455621.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":43},{\"attribute\":\"Power\",\"modifier\":31},{\"attribute\":\"CritDamage\",\"modifier\":31}]},\"suffix_item_id\":24916,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45912() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Mithril Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":93,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":45912,\"icon\":\"https://render.guildwars2.com/file/CE291D544423D3090EFAD37315E4CEC6E0F366A6/340185.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":46},{\"attribute\":\"Power\",\"modifier\":33},{\"attribute\":\"CritDamage\",\"modifier\":33}]},\"suffix_item_id\":24521,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}