package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0207 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem45938() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Mithril Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":124,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":45938,\"icon\":\"https://render.guildwars2.com/file/6053B72BB43CC6BA606610EFF5FB5069406B3302/340227.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":61},{\"attribute\":\"Power\",\"modifier\":44},{\"attribute\":\"CritDamage\",\"modifier\":44}]},\"suffix_item_id\":24521,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45939() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Mithril Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":264,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":45939,\"icon\":\"https://render.guildwars2.com/file/6053B72BB43CC6BA606610EFF5FB5069406B3302/340227.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":73},{\"attribute\":\"Power\",\"modifier\":52},{\"attribute\":\"CritDamage\",\"modifier\":52}]},\"suffix_item_id\":24542,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45940() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Mithril Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":45940,\"icon\":\"https://render.guildwars2.com/file/7B9DEC4B7AC64DD26E94EC22FB0B177902E7B291/455595.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":79},{\"attribute\":\"Power\",\"modifier\":56},{\"attribute\":\"CritDamage\",\"modifier\":56}]},\"suffix_item_id\":24923,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45941() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Orichalcum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":528,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":45941,\"icon\":\"https://render.guildwars2.com/file/02E9EFDEF9587130A25F17AC396913FBBE3C716D/455602.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":90},{\"attribute\":\"Power\",\"modifier\":64},{\"attribute\":\"CritDamage\",\"modifier\":64}]},\"suffix_item_id\":24545,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem45942() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lucky White Rabbit's Foot\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":45942,\"icon\":\"https://render.guildwars2.com/file/7262FAFBEE60B5A846E3093573C950A1C1335B97/66777.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":79},{\"attribute\":\"Power\",\"modifier\":56},{\"attribute\":\"CritDamage\",\"modifier\":56}]},\"suffix_item_id\":24542,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46440() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Caudecus's Journal\",\"type\":\"Trinket\",\"level\":45,\"rarity\":\"Masterwork\",\"vendor_value\":103,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":46440,\"icon\":\"https://render.guildwars2.com/file/095B9410F480575B7EAF9CDA9F05163FB8530251/220884.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":20},{\"attribute\":\"Power\",\"modifier\":14}]},\"suffix_item_id\":24539,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46442() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Caudecus's Journal\",\"type\":\"Trinket\",\"level\":45,\"rarity\":\"Rare\",\"vendor_value\":154,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":46442,\"icon\":\"https://render.guildwars2.com/file/095B9410F480575B7EAF9CDA9F05163FB8530251/220884.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":22},{\"attribute\":\"Power\",\"modifier\":16}]},\"suffix_item_id\":24910,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46451() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Stargazer Pendant\",\"description\":\"<c=@flavor>The jotun have many secrets. This is but one.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":528,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":46451,\"icon\":\"https://render.guildwars2.com/file/35A76FF749801A31BDE750017C2DF371DB200D4A/222374.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":90},{\"attribute\":\"Toughness\",\"modifier\":64},{\"attribute\":\"Vitality\",\"modifier\":64}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46452() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coral Pendant\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":264,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":46452,\"icon\":\"https://render.guildwars2.com/file/D5681E4191C1634104D4D2442B2D20C67AD7A8E4/222364.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":73},{\"attribute\":\"Toughness\",\"modifier\":52},{\"attribute\":\"Vitality\",\"modifier\":52}]},\"suffix_item_id\":24522,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46453() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coral Pendant\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":46453,\"icon\":\"https://render.guildwars2.com/file/D5681E4191C1634104D4D2442B2D20C67AD7A8E4/222364.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":79},{\"attribute\":\"Toughness\",\"modifier\":56},{\"attribute\":\"Vitality\",\"modifier\":56}]},\"suffix_item_id\":24545,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46454() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vallog's Demise\",\"description\":\"<c=@flavor>\\\"I should have never left the raft.\\\"<br>—Vallog</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":46454,\"icon\":\"https://render.guildwars2.com/file/C169769F7200EAFD31144DD0306909AF98B23449/220886.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":56},{\"attribute\":\"Toughness\",\"modifier\":40},{\"attribute\":\"Vitality\",\"modifier\":40}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46461() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ring of Blood\",\"description\":\"<c=@flavor>It glitters with malice.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":46461,\"icon\":\"https://render.guildwars2.com/file/92140FF998C910373AFF3C25607504FA364AA4BA/511745.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":67},{\"attribute\":\"Toughness\",\"modifier\":48},{\"attribute\":\"Vitality\",\"modifier\":48}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46462() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Arctic Ring\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":198,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":46462,\"icon\":\"https://render.guildwars2.com/file/925CE1CB16413341E2475A54B45E2DBF0D0A03DC/511746.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":55},{\"attribute\":\"Toughness\",\"modifier\":39},{\"attribute\":\"Vitality\",\"modifier\":39}]},\"suffix_item_id\":24522,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46463() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Arctic Ring\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":297,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":46463,\"icon\":\"https://render.guildwars2.com/file/925CE1CB16413341E2475A54B45E2DBF0D0A03DC/511746.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":59},{\"attribute\":\"Toughness\",\"modifier\":42},{\"attribute\":\"Vitality\",\"modifier\":42}]},\"suffix_item_id\":24545,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46464() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Alpha Conduit\",\"description\":\"<c=@flavor>A mysterious clear liquid runs through it.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":528,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":46464,\"icon\":\"https://render.guildwars2.com/file/17116576C478FE08481E1F010C991A0BBEE92339/222408.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":90},{\"attribute\":\"Toughness\",\"modifier\":64},{\"attribute\":\"Vitality\",\"modifier\":64}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46465() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Diffraction Crystal\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":264,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":46465,\"icon\":\"https://render.guildwars2.com/file/03C8FB276B146CB64E201F006D0FC0D2380E956B/220645.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":73},{\"attribute\":\"Toughness\",\"modifier\":52},{\"attribute\":\"Vitality\",\"modifier\":52}]},\"suffix_item_id\":24522,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46466() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Diffraction Crystal\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":46466,\"icon\":\"https://render.guildwars2.com/file/03C8FB276B146CB64E201F006D0FC0D2380E956B/220645.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":79},{\"attribute\":\"Toughness\",\"modifier\":56},{\"attribute\":\"Vitality\",\"modifier\":56}]},\"suffix_item_id\":24545,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46467() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sam\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":46467,\"icon\":\"https://render.guildwars2.com/file/FC652099E73BB298DA24FB644E050D3EFBC1592D/220905.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":56},{\"attribute\":\"Power\",\"modifier\":40},{\"attribute\":\"CritDamage\",\"modifier\":40}]},\"suffix_item_id\":24923,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46468() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"All Seeing\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":528,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":46468,\"icon\":\"https://render.guildwars2.com/file/5192966328AD06F3A33812C0C3056CDD1E9EBC66/66848.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":90},{\"attribute\":\"Power\",\"modifier\":64},{\"attribute\":\"CritDamage\",\"modifier\":64}]},\"suffix_item_id\":24514,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46493() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Plush Moto Backpack Cover\",\"description\":\"This backpack cover comes with a simple back strap for ease of wearing if you don't have another back-slot item.\nDouble-click to unpack.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":46493,\"icon\":\"https://render.guildwars2.com/file/13084C07270F979E07FF6A78FF2443E3E2FFE5A7/631261.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46494() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Super Banana\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":46494,\"icon\":\"https://render.guildwars2.com/file/A393297D5E5F10293F2215241E62B477E856631D/631267.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46495() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Super Raccoon\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":46495,\"icon\":\"https://render.guildwars2.com/file/DB350ECA1EEBB544C4F9A5432B9E3805DB6998D3/631268.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46496() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Super Yeti\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":46496,\"icon\":\"https://render.guildwars2.com/file/A25FB1AADCF0D34E5E7740C6F93EF0B60306053A/631269.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46497() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Super Assassin\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":46497,\"icon\":\"https://render.guildwars2.com/file/27ACBEAD0857A5B0740D5E050C071526DC320F2D/631270.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46498() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Miniature Super Trio—World 2\",\"description\":\"Double-click to receive the Super Banana, Super Yeti, and Super Raccoon miniatures.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":46498,\"icon\":\"https://render.guildwars2.com/file/954441540A6EA9BCF7BFEA0B5F9702C2C77B09E3/631271.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}