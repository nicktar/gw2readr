package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0165 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem38048() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Snowman\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":38048,\"icon\":\"https://render.guildwars2.com/file/6F0FDF537904E015AFA870ED784C01313660340E/526114.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38049() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Infinirarium\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\",\"NoUnderwater\"],\"restrictions\":[],\"id\":38049,\"icon\":\"https://render.guildwars2.com/file/39F6086548535CB0009C985B65EF56F7C7BB4557/526115.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38058() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Fancy Winter Outfit\",\"description\":\"Contains a Winter Outfit, which is usable in combat, and a Crystal Scepter toy for costume brawl.\n\nOutfits are full sets of clothing that hide other armor. This will not change individual armor pieces, and you will still receive your current armor stats.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":38058,\"icon\":\"https://render.guildwars2.com/file/5F4776E9357CDC37600A4250021856115EF40C3E/526123.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38087() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Winter's Weapon Claim Ticket\",\"description\":\"Take this ticket to Evon Gnashblade at the Lion's Arch trading post to select a Wintersday weapon skin.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":38087,\"icon\":\"https://render.guildwars2.com/file/6A5CD11EC2E1BB1EE5493330E9E34EF0B679A464/526209.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38115() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Endless Toymaker's Tonic\",\"description\":\"Double-click to transform into a random Wintersday toy for fifteen minutes. You will be unable to fight while transformed.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\",\"NoUnderwater\"],\"restrictions\":[],\"id\":38115,\"icon\":\"https://render.guildwars2.com/file/E3EAA9D80D4216D1E092915AFD90C069CEE8E470/222694.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38116() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Endless Toy Ventari Tonic\",\"description\":\"Double-click to transform into a Wintersday toy for fifteen minutes. You will be unable to fight while transformed.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\",\"NoUnderwater\"],\"restrictions\":[],\"id\":38116,\"icon\":\"https://render.guildwars2.com/file/4B7616083E7522FD9C2B4AD9CAE97A09510047A6/222688.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38117() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Endless Plush Griffon Tonic\",\"description\":\"Double-click to transform into a Wintersday toy for fifteen minutes. You will be unable to fight while transformed.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\",\"NoUnderwater\"],\"restrictions\":[],\"id\":38117,\"icon\":\"https://render.guildwars2.com/file/013AB4320905006666653B19A6C82ED4D70EA013/222690.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38118() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Endless Toy Golem Tonic\",\"description\":\"Double-click to transform into a Wintersday toy for fifteen minutes. You will be unable to fight while transformed.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\",\"NoUnderwater\"],\"restrictions\":[],\"id\":38118,\"icon\":\"https://render.guildwars2.com/file/5F3D98C8CFF353535A10530E3F38C5E8E3BDF50B/66557.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38119() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Endless Toy Soldier Tonic\",\"description\":\"Double-click to transform into a Wintersday toy for fifteen minutes. You will be unable to fight while transformed.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\",\"NoUnderwater\"],\"restrictions\":[],\"id\":38119,\"icon\":\"https://render.guildwars2.com/file/6D41597AEC924EE557A8E0D0AFF655D04CEB0D14/222696.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38120() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Endless Princess Doll Tonic\",\"description\":\"Double-click to transform into a Wintersday toy for fifteen minutes. You will be unable to fight while transformed.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\",\"NoUnderwater\"],\"restrictions\":[],\"id\":38120,\"icon\":\"https://render.guildwars2.com/file/174704B30FDA745201AB51EB710CBC385939F571/222692.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38121() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Endless Gift Dolyak Tonic\",\"description\":\"Double-click to transform into a Wintersday toy for fifteen minutes. You will be unable to fight while transformed.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\",\"NoUnderwater\"],\"restrictions\":[],\"id\":38121,\"icon\":\"https://render.guildwars2.com/file/180EC0CD5E21096CE8B4F4BA54E459BC597B7D58/222698.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38129() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unbreakable Choir Bell\",\"description\":\"Double-click to pull out a choir bell and play for your friends.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"NoUnderwater\"],\"restrictions\":[],\"id\":38129,\"icon\":\"https://render.guildwars2.com/file/5D9A0349AAE30B1DB8FD011A06A9DF79186493ED/526233.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38130() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tiny Snowflake\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":38130,\"icon\":\"https://render.guildwars2.com/file/99E8B669F94A3ED511B84AEDDF970E3A6057EDC2/526240.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38131() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Delicate Snowflake\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":38131,\"icon\":\"https://render.guildwars2.com/file/29FFF132F428A46D0F64DF31720A3E574E5DA177/526241.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38132() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Glittering Snowflake\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":38132,\"icon\":\"https://render.guildwars2.com/file/624467FA340D2461C95F1168D765901BAFFBBEA8/526242.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38133() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unique Snowflake\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":38133,\"icon\":\"https://render.guildwars2.com/file/74D6ABFA685AB25923B20100FBD6C5FD0CD55915/526243.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38134() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pristine Snowflake\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":38134,\"icon\":\"https://render.guildwars2.com/file/6E9809B82F370D7E73F7971AE49D3F034D0CB348/526244.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38135() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Flawless Snowflake\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":13,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":38135,\"icon\":\"https://render.guildwars2.com/file/D5763C0411E0DDB5634260D3E05E07DF2459641D/526245.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38136() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Small Wintersday Gift\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":38136,\"icon\":\"https://render.guildwars2.com/file/420CE6DF804B1429750A115F9B6CEDA504A036F4/526220.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38137() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unsafe Wintersday Gift\",\"description\":\"<c=@flavor>Warning: small parts. Not for children. Double-click to open.</c>\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":38137,\"icon\":\"https://render.guildwars2.com/file/420CE6DF804B1429750A115F9B6CEDA504A036F4/526220.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38138() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Adorned Snowflake\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":38138,\"icon\":\"https://render.guildwars2.com/file/4624EBCF41B761650A0EC0A8CA623C11277BA5D7/526246.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":16517,\"description\":\"+1% Boon Duration\"},\"attributes\":[]},\"suffix\":\"of Winter\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38139() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Intricate Snowflake\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":38139,\"icon\":\"https://render.guildwars2.com/file/55362E7D2711D263AE76DA2A57B596A0B4E00FEF/526247.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":16522,\"description\":\"+1% Boon Duration\n+7 Healing Power\"},\"attributes\":[]},\"suffix\":\"of Winter\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38140() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gilded Snowflake\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":68,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":38140,\"icon\":\"https://render.guildwars2.com/file/E4066C58A0BF05FF1FB8480CE4639760E729AB47/526248.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":16521,\"description\":\"+1% Boon Duration\n+9 Healing Power\"},\"attributes\":[]},\"suffix\":\"of Winter\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38141() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ornate Snowflake\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":90,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":38141,\"icon\":\"https://render.guildwars2.com/file/C0C16C980B5F06E2E3F33F92FF94462907D8062E/526249.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":16520,\"description\":\"+14 Toughness\n+9 Healing Power\n+1% Boon Duration\"},\"attributes\":[]},\"suffix\":\"of Winter\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38142() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Brilliant Snowflake\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":38142,\"icon\":\"https://render.guildwars2.com/file/D3B0CAF4CAE9D50E33F54B394160B91A45C6E521/526250.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":16518,\"description\":\"+18 Toughness\n+12 Healing Power\n+1% Boon Duration\"},\"attributes\":[]},\"suffix\":\"of Winter\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}