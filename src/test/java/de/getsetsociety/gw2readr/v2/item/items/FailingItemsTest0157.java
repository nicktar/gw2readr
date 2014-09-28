package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0157 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem36557() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Koda's Gift\",\"description\":\"<c=@flavor>The symbol of Koda: a serrated oval, reminiscent of the jaws of a bear.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36557,\"icon\":\"https://render.guildwars2.com/file/DFE3E0A6D10D0B0AC1A772F0700D660EF83C8011/511744.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":56},{\"attribute\":\"Power\",\"modifier\":40},{\"attribute\":\"Vitality\",\"modifier\":40}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36558() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carving of Jormag\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36558,\"icon\":\"https://render.guildwars2.com/file/18557F10485201B809A97BD35B90681130C44348/455910.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":46},{\"attribute\":\"Power\",\"modifier\":33},{\"attribute\":\"Vitality\",\"modifier\":33}]},\"suffix_item_id\":24512,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36559() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carving of Jormag\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":248,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36559,\"icon\":\"https://render.guildwars2.com/file/18557F10485201B809A97BD35B90681130C44348/455910.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":49},{\"attribute\":\"Power\",\"modifier\":35},{\"attribute\":\"Vitality\",\"modifier\":35}]},\"suffix_item_id\":24496,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36560() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"The Zealot's Amulet\",\"description\":\"<c=@flavor>A powerful talisman of kodan design.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":528,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36560,\"icon\":\"https://render.guildwars2.com/file/B1FEA5BFD9AEDE1D1F9E7B0B6A0708E32E0FC60B/66852.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":90},{\"attribute\":\"ConditionDamage\",\"modifier\":64},{\"attribute\":\"Healing\",\"modifier\":64}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36561() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Svanir Talisman\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":264,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36561,\"icon\":\"https://render.guildwars2.com/file/18557F10485201B809A97BD35B90681130C44348/455910.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":73},{\"attribute\":\"ConditionDamage\",\"modifier\":52},{\"attribute\":\"Healing\",\"modifier\":52}]},\"suffix_item_id\":24512,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36562() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Svanir Talisman\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36562,\"icon\":\"https://render.guildwars2.com/file/90383BE37D081EAB372ABCC0F26749B0D9CE46CD/455917.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":79},{\"attribute\":\"ConditionDamage\",\"modifier\":56},{\"attribute\":\"Healing\",\"modifier\":56}]},\"suffix_item_id\":24496,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36563() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ring of Blood\",\"description\":\"<c=@flavor>It glitters with malice.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36563,\"icon\":\"https://render.guildwars2.com/file/92140FF998C910373AFF3C25607504FA364AA4BA/511745.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36564() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Arctic Ring\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":198,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36564,\"icon\":\"https://render.guildwars2.com/file/925CE1CB16413341E2475A54B45E2DBF0D0A03DC/511746.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"suffix_item_id\":24522,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36565() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Arctic Ring\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":297,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36565,\"icon\":\"https://render.guildwars2.com/file/925CE1CB16413341E2475A54B45E2DBF0D0A03DC/511746.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"suffix_item_id\":24545,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36566() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Operative's Creed\",\"description\":\"<c=@flavor>\\\"Objective 1: Find them. Objective 2: Destroy them.\\\"<br>—First Page of the Operative's Creed.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36566,\"icon\":\"https://render.guildwars2.com/file/924E992B2217CFCAC6CA0F06663FA99C6629CDAB/220885.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":56},{\"attribute\":\"Precision\",\"modifier\":40},{\"attribute\":\"Vitality\",\"modifier\":40}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36567() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orrian Artifact Shards\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36567,\"icon\":\"https://render.guildwars2.com/file/EB2AF7C99C3CFF4B28536162CEB334C528FC4CA0/455945.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":46},{\"attribute\":\"Precision\",\"modifier\":33},{\"attribute\":\"Vitality\",\"modifier\":33}]},\"suffix_item_id\":24516,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36568() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orrian Artifact Shards\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":248,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36568,\"icon\":\"https://render.guildwars2.com/file/EB2AF7C99C3CFF4B28536162CEB334C528FC4CA0/455945.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":49},{\"attribute\":\"Precision\",\"modifier\":35},{\"attribute\":\"Vitality\",\"modifier\":35}]},\"suffix_item_id\":24499,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36569() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bloodstone Fragment\",\"description\":\"<c=@flavor>\\\"That's not really made of blood, is it?\\\"<br>—Anonymous Child</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":528,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36569,\"icon\":\"https://render.guildwars2.com/file/5044509F3DB0F391576CCAD891BC654DC5FE79B3/63600.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":90},{\"attribute\":\"Toughness\",\"modifier\":64},{\"attribute\":\"Vitality\",\"modifier\":64}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36570() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Amulet of the Dead\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":264,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36570,\"icon\":\"https://render.guildwars2.com/file/0921674EB12510D9559C553F96E762CCDF96C835/63599.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":73},{\"attribute\":\"Toughness\",\"modifier\":52},{\"attribute\":\"Vitality\",\"modifier\":52}]},\"suffix_item_id\":24520,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36571() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Amulet of the Dead\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36571,\"icon\":\"https://render.guildwars2.com/file/0921674EB12510D9559C553F96E762CCDF96C835/63599.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":79},{\"attribute\":\"Toughness\",\"modifier\":56},{\"attribute\":\"Vitality\",\"modifier\":56}]},\"suffix_item_id\":24543,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36575() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"The Replicator\",\"description\":\"<c=@flavor>A mostly faithful reproduction of Tazza's design, though it doesn't work.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":528,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36575,\"icon\":\"https://render.guildwars2.com/file/13B161C32BE5DF4A5A637E78C10A61555AD917E3/222384.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":90},{\"attribute\":\"Precision\",\"modifier\":64},{\"attribute\":\"Vitality\",\"modifier\":64}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36576() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dissonance Amplifier\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":264,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36576,\"icon\":\"https://render.guildwars2.com/file/5380F0DE942303D76A529BF7EB09F96AB6492721/222368.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":73},{\"attribute\":\"Precision\",\"modifier\":52},{\"attribute\":\"Vitality\",\"modifier\":52}]},\"suffix_item_id\":24516,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36577() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dissonance Amplifier\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36577,\"icon\":\"https://render.guildwars2.com/file/5380F0DE942303D76A529BF7EB09F96AB6492721/222368.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":79},{\"attribute\":\"Precision\",\"modifier\":56},{\"attribute\":\"Vitality\",\"modifier\":56}]},\"suffix_item_id\":24499,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36579() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Revolutionary Flyers\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36579,\"icon\":\"https://render.guildwars2.com/file/09D5CC42680FED30CE9A5AC2EB7EFCA93F522B06/66843.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":46},{\"attribute\":\"Toughness\",\"modifier\":33},{\"attribute\":\"Vitality\",\"modifier\":33}]},\"suffix_item_id\":24520,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36580() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Revolutionary Flyers\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":248,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36580,\"icon\":\"https://render.guildwars2.com/file/09D5CC42680FED30CE9A5AC2EB7EFCA93F522B06/66843.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":49},{\"attribute\":\"Toughness\",\"modifier\":35},{\"attribute\":\"Vitality\",\"modifier\":35}]},\"suffix_item_id\":24543,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36581() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Husk of the Destroyer\",\"description\":\"<c=@flavor>It glows with hatred.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36581,\"icon\":\"https://render.guildwars2.com/file/03E1C357EA05636A0801DF6FF94201CD67E001C9/511747.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":67},{\"attribute\":\"Power\",\"modifier\":48},{\"attribute\":\"Vitality\",\"modifier\":48}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36582() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Band of the Moliarchy\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":198,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36582,\"icon\":\"https://render.guildwars2.com/file/5FC42F5F68A079925F4A1C6050FFD14C51AAAF9A/63590.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":55},{\"attribute\":\"Power\",\"modifier\":39},{\"attribute\":\"Vitality\",\"modifier\":39}]},\"suffix_item_id\":24512,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36583() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Band of the Moliarchy\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":297,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36583,\"icon\":\"https://render.guildwars2.com/file/5FC42F5F68A079925F4A1C6050FFD14C51AAAF9A/63590.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":59},{\"attribute\":\"Power\",\"modifier\":42},{\"attribute\":\"Vitality\",\"modifier\":42}]},\"suffix_item_id\":24496,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36587() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Nightmare Coil\",\"description\":\"<c=@flavor>A circle of dark, twisted vines.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36587,\"icon\":\"https://render.guildwars2.com/file/F2A90C600A25B19908FA66357FB6567949DC7D7B/66853.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":67},{\"attribute\":\"Toughness\",\"modifier\":48},{\"attribute\":\"Vitality\",\"modifier\":48}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36590() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tortured Root\",\"description\":\"<c=@flavor>Gnarled and knotted, this root is still strong.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36590,\"icon\":\"https://render.guildwars2.com/file/0DED39029743D2794F214502E228A6089FEB37DE/220453.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":56},{\"attribute\":\"Precision\",\"modifier\":40},{\"attribute\":\"Toughness\",\"modifier\":40}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}