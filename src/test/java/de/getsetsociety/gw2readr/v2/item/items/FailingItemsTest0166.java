package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0166 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem38143() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Exquisite Snowflake\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":264,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":38143,\"icon\":\"https://render.guildwars2.com/file/970403B3C1091358E4AA97511ED35E000223FF9B/526251.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":16519,\"description\":\"+25 Toughness\n+15 Healing Power\n+1% Boon Duration\"},\"attributes\":[]},\"suffix\":\"of Winter\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38144() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Snowflake Orichalcum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":528,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":38144,\"icon\":\"https://render.guildwars2.com/file/B6A8B5C62CD65937370838C10ED6B336D0F73744/526252.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":16517,\"description\":\"+1% Boon Duration\"},\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":90},{\"attribute\":\"Healing\",\"modifier\":64}]},\"suffix_item_id\":38143,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38145() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Snowflake Mithril Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Rare\",\"vendor_value\":372,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":38145,\"icon\":\"https://render.guildwars2.com/file/332F5F3D9031A97F0AE70115B70C35470A02CFC5/526253.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":16517,\"description\":\"+1% Boon Duration\"},\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":72},{\"attribute\":\"Healing\",\"modifier\":51}]},\"suffix_item_id\":38142,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38146() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Snowflake Platinum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":38146,\"icon\":\"https://render.guildwars2.com/file/2A3E7F281DE83774D365D6E0041AA43E481E0901/526254.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":41},{\"attribute\":\"Toughness\",\"modifier\":58}]},\"suffix_item_id\":38141,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38147() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Snowflake Gold Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":270,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":38147,\"icon\":\"https://render.guildwars2.com/file/38179DD9050859D9B9B117F09F46196D2FAF3A69/526255.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":29},{\"attribute\":\"Toughness\",\"modifier\":40}]},\"suffix_item_id\":38140,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38148() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Snowflake Silver Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":204,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":38148,\"icon\":\"https://render.guildwars2.com/file/EDA7729B2011422566ED47B607BB9200F3DC0BD7/526256.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":18},{\"attribute\":\"Toughness\",\"modifier\":26}]},\"suffix_item_id\":38139,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38149() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Snowflake Copper Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":96,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":38149,\"icon\":\"https://render.guildwars2.com/file/772405D1A83EE0043027D8FEFF62C21A42EF154B/526257.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":16517,\"description\":\"+1% Boon Duration\"},\"attributes\":[]},\"suffix_item_id\":38138,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38150() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Snowflake Copper Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":60,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":38150,\"icon\":\"https://render.guildwars2.com/file/A7730D4A0B2933E6B838D203B01A6B45EE4220A9/526258.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":16517,\"description\":\"+1% Boon Duration\"},\"attributes\":[]},\"suffix_item_id\":38138,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38151() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Snowflake Silver Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":128,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":38151,\"icon\":\"https://render.guildwars2.com/file/12B7DF627254CFE15E540FA440BBC29D27C57CC6/526259.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":11},{\"attribute\":\"Toughness\",\"modifier\":16}]},\"suffix_item_id\":38139,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38152() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Snowflake Gold Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":169,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":38152,\"icon\":\"https://render.guildwars2.com/file/31F81D23CB1E66593371085F579BED4D7521E62B/526260.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":18},{\"attribute\":\"Toughness\",\"modifier\":25}]},\"suffix_item_id\":38140,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38153() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Snowflake Platinum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":207,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":38153,\"icon\":\"https://render.guildwars2.com/file/18A6F5355C03F209DA29BB530463A1519298BC07/526261.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":26},{\"attribute\":\"Toughness\",\"modifier\":36}]},\"suffix_item_id\":38141,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38154() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Snowflake Mithril Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Rare\",\"vendor_value\":233,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":38154,\"icon\":\"https://render.guildwars2.com/file/F0370369FF74DF1B2542CDE20D6419F63E042AC3/526262.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":16517,\"description\":\"+1% Boon Duration\"},\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":45},{\"attribute\":\"Healing\",\"modifier\":32}]},\"suffix_item_id\":38142,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38155() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Snowflake Orichalcum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":38155,\"icon\":\"https://render.guildwars2.com/file/5FCF0B00390AAF450D37F6F9B2181C6C23A1D439/526263.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":16517,\"description\":\"+1% Boon Duration\"},\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":56},{\"attribute\":\"Healing\",\"modifier\":40}]},\"suffix_item_id\":38143,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38156() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Snowflake Copper Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":72,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":38156,\"icon\":\"https://render.guildwars2.com/file/09F60B14DEDBDFBF3C0BFB27627380B8AEAA94B5/526264.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":16517,\"description\":\"+1% Boon Duration\"},\"attributes\":[]},\"suffix_item_id\":38138,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38157() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Snowflake Silver Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":153,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":38157,\"icon\":\"https://render.guildwars2.com/file/5F18C592A4540657C0C065975BF9C8AF1942C561/526265.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":14},{\"attribute\":\"Toughness\",\"modifier\":19}]},\"suffix_item_id\":38139,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38158() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Snowflake Gold Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":203,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":38158,\"icon\":\"https://render.guildwars2.com/file/F41D553B27592E3556D8DA45926212445C39CCFC/526266.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":21},{\"attribute\":\"Toughness\",\"modifier\":30}]},\"suffix_item_id\":38140,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38159() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Snowflake Platinum Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":248,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":38159,\"icon\":\"https://render.guildwars2.com/file/096DDC4D645D9F50467703ACC30241197232EB09/526267.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":31},{\"attribute\":\"Toughness\",\"modifier\":43}]},\"suffix_item_id\":38141,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38160() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Snowflake Mithril Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Rare\",\"vendor_value\":279,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":38160,\"icon\":\"https://render.guildwars2.com/file/08B85E77263E5BF8AB1F080898D8C2C973E36679/526268.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":16517,\"description\":\"+1% Boon Duration\"},\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":54},{\"attribute\":\"Healing\",\"modifier\":38}]},\"suffix_item_id\":38142,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38161() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Snowflake Orichalcum Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":38161,\"icon\":\"https://render.guildwars2.com/file/C37223DF0B0A33DEA2BC21E2CD37D2670F22693A/526269.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":16517,\"description\":\"+1% Boon Duration\"},\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":67},{\"attribute\":\"Healing\",\"modifier\":48}]},\"suffix_item_id\":38143,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38162() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Giver's Intricate Gossamer Insignia\",\"description\":\"Used in the crafting of armor with +Toughness, +Healing Power, and +Boon Duration.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":38162,\"icon\":\"https://render.guildwars2.com/file/732EA012150EA10899C3EE7AF6C3EE209EE0C617/526270.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38163() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Giver's Embroidered Cotton Insignia\",\"description\":\"Used in the crafting of armor with +Toughness and +Healing Power.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":38163,\"icon\":\"https://render.guildwars2.com/file/477B094607BEE40913AE6CD56D044E2D677C5412/526271.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38164() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Giver's Embroidered Wool Insignia\",\"description\":\"Used in the crafting of armor with +Toughness and +Healing Power.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":17,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":38164,\"icon\":\"https://render.guildwars2.com/file/FDB0046A9F58937D9E15F53CA6EADEF967185A25/526272.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38165() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Giver's Embroidered Jute Insignia\",\"description\":\"Used in the crafting of armor with +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":38165,\"icon\":\"https://render.guildwars2.com/file/99DFFFB20CD437B8E7AE2C413C17087E19B8FFFE/526273.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38166() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Giver's Embroidered Silk Insignia\",\"description\":\"Used in the crafting of armor with +Toughness, +Healing Power, and +Boon Duration.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":31,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":38166,\"icon\":\"https://render.guildwars2.com/file/DDC0E90BD06A9F3C3BC6134B510E00A2304FFE1A/526274.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38167() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Giver's Embroidered Linen Insignia\",\"description\":\"Used in the crafting of armor with +Toughness and +Healing Power.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":27,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":38167,\"icon\":\"https://render.guildwars2.com/file/CAEC0EDB14B735457BA121EAB1022E977FEB3856/526275.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}