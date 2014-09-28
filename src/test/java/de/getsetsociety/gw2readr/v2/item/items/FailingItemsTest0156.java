package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0156 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem36481() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Wondrous Goods\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36481,\"icon\":\"https://render.guildwars2.com/file/350D02EDC4D2025C162107C60E78490C710EDDCF/63180.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36482() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Wondrous Goods\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36482,\"icon\":\"https://render.guildwars2.com/file/350D02EDC4D2025C162107C60E78490C710EDDCF/63180.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36483() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Wondrous Goods\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36483,\"icon\":\"https://render.guildwars2.com/file/350D02EDC4D2025C162107C60E78490C710EDDCF/63180.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36484() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Wondrous Goods\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36484,\"icon\":\"https://render.guildwars2.com/file/350D02EDC4D2025C162107C60E78490C710EDDCF/63180.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36485() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Wondrous Goods\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36485,\"icon\":\"https://render.guildwars2.com/file/350D02EDC4D2025C162107C60E78490C710EDDCF/63180.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36486() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Wondrous Goods\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36486,\"icon\":\"https://render.guildwars2.com/file/350D02EDC4D2025C162107C60E78490C710EDDCF/63180.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36506() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Custom Arena Starter Kit\",\"description\":\"Used to create a new PvP Custom Arena with 30 days of playing time. Double-click to open the \\\"Create a Custom Arena\\\" panel.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"NotUpgradeable\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":36506,\"icon\":\"https://render.guildwars2.com/file/759709571F7E6FFABEAAE6411D0F976DAA3A1052/575064.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36507() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Custom Arena Time Token\",\"description\":\"Used to add one day of time to a Custom Arena. Used from your Custom Arena management panel or double-click while playing in any Custom Arena to add time to that arena.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"NotUpgradeable\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":36507,\"icon\":\"https://render.guildwars2.com/file/62566FF228E11BD4FE3856A5187E36AE4E58B390/575065.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36520() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Coins\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36520,\"icon\":\"https://render.guildwars2.com/file/3BF274D1A323C002CDCFE80724912CDB7C78ABEE/62857.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36521() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Claw of the Howling King\",\"description\":\"<c=@flavor>A tiny sound still emanates from the ring.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36521,\"icon\":\"https://render.guildwars2.com/file/D30394C4BAB8D6F4BA747CA209FAD8B3A6D2032F/223747.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":67},{\"attribute\":\"Precision\",\"modifier\":48},{\"attribute\":\"Vitality\",\"modifier\":48}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36522() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ring of the Catacombs\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":198,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36522,\"icon\":\"https://render.guildwars2.com/file/CC727509301FFBE37A6527D637594517491E2832/223591.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":55},{\"attribute\":\"Precision\",\"modifier\":39},{\"attribute\":\"Vitality\",\"modifier\":39}]},\"suffix_item_id\":24516,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36523() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ring of the Catacombs\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":297,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36523,\"icon\":\"https://render.guildwars2.com/file/CC727509301FFBE37A6527D637594517491E2832/223591.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":59},{\"attribute\":\"Precision\",\"modifier\":42},{\"attribute\":\"Vitality\",\"modifier\":42}]},\"suffix_item_id\":24499,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36524() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Colossus Fang\",\"description\":\"<c=@flavor>Very large, and very sharp.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":528,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36524,\"icon\":\"https://render.guildwars2.com/file/090C47B6BFC5F70B5BA83D3B0F4630A51F07ED34/220642.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":90},{\"attribute\":\"Precision\",\"modifier\":64},{\"attribute\":\"Toughness\",\"modifier\":64}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36525() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Foefire Amulet\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":264,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36525,\"icon\":\"https://render.guildwars2.com/file/F82FF7C2693014663173FF717C403F02C4540F0C/62368.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":73},{\"attribute\":\"Precision\",\"modifier\":52},{\"attribute\":\"Toughness\",\"modifier\":52}]},\"suffix_item_id\":24510,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36526() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Foefire Amulet\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36526,\"icon\":\"https://render.guildwars2.com/file/C6B3A518FF90EC0C01F6D8E3E2A8B7E5F840170A/222396.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":79},{\"attribute\":\"Precision\",\"modifier\":56},{\"attribute\":\"Toughness\",\"modifier\":56}]},\"suffix_item_id\":24544,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36533() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Plague\",\"description\":\"<c=@flavor>Waves of darkness emanate from this twisted ring.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36533,\"icon\":\"https://render.guildwars2.com/file/04A84E79CEFBFB1ADBBB5D275E0857B1FD5D5D3E/223589.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":67},{\"attribute\":\"Precision\",\"modifier\":48},{\"attribute\":\"Toughness\",\"modifier\":48}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36536() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vallog's Demise\",\"description\":\"<c=@flavor>\\\"I should have never left the raft.\\\"<br>—Vallog</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36536,\"icon\":\"https://render.guildwars2.com/file/C169769F7200EAFD31144DD0306909AF98B23449/220886.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36539() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Eternal Flame\",\"description\":\"<c=@flavor>The flame is untouched by the wind.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":528,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36539,\"icon\":\"https://render.guildwars2.com/file/980527553D5D3629940ED90D3AD1AE0909297580/511741.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":90},{\"attribute\":\"Power\",\"modifier\":64},{\"attribute\":\"Vitality\",\"modifier\":64}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36545() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ashes of the Effigy\",\"description\":\"<c=@flavor>Burning embers are still visible.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36545,\"icon\":\"https://render.guildwars2.com/file/E40D3C6ED10916BFB638016CB10495100EFA14B0/66931.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":56},{\"attribute\":\"ConditionDamage\",\"modifier\":40},{\"attribute\":\"Healing\",\"modifier\":40}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36551() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Infinity Loop\",\"description\":\"<c=@flavor>A single twist in the band creates a continuous surface.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36551,\"icon\":\"https://render.guildwars2.com/file/A3473FFC3353576C2EF60C5A9CC47CDA6AB562C1/63613.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":67},{\"attribute\":\"ConditionDamage\",\"modifier\":48},{\"attribute\":\"Healing\",\"modifier\":48}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36552() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Charged Band\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":198,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36552,\"icon\":\"https://render.guildwars2.com/file/04FA35B4422E02E2683FFD711EA935413BFA0BC6/66812.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":55},{\"attribute\":\"ConditionDamage\",\"modifier\":39},{\"attribute\":\"Healing\",\"modifier\":39}]},\"suffix_item_id\":24512,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36553() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Charged Band\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":297,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36553,\"icon\":\"https://render.guildwars2.com/file/04FA35B4422E02E2683FFD711EA935413BFA0BC6/66812.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":59},{\"attribute\":\"ConditionDamage\",\"modifier\":42},{\"attribute\":\"Healing\",\"modifier\":42}]},\"suffix_item_id\":24496,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36554() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Alpha Conduit\",\"description\":\"<c=@flavor>A mysterious clear liquid runs through it.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":528,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36554,\"icon\":\"https://render.guildwars2.com/file/17116576C478FE08481E1F010C991A0BBEE92339/222408.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36555() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Diffraction Crystal\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":264,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36555,\"icon\":\"https://render.guildwars2.com/file/03C8FB276B146CB64E201F006D0FC0D2380E956B/220645.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"suffix_item_id\":24522,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem36556() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Diffraction Crystal\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":36556,\"icon\":\"https://render.guildwars2.com/file/03C8FB276B146CB64E201F006D0FC0D2380E956B/220645.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"suffix_item_id\":24545,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}