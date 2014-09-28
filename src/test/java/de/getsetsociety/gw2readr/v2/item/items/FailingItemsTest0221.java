package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0221 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem49942() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pirate Sword\",\"description\":\"<c=@abilitytype>Costume Brawl Toy:</c> Double-click to equip a bundle which grants fun costume brawl skills. Brawl skills will only hit other players also using costume brawl.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"NotUpgradeable\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49942,\"icon\":\"https://render.guildwars2.com/file/D10679012504F6AD5829D1DF9F36303FE2EB46B4/64343.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49943() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Scepter of Thorn\",\"description\":\"<c=@abilitytype>Costume Brawl Toy:</c> Double-click to equip a bundle which grants fun costume brawl skills. Brawl skills will only hit other players also using costume brawl.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"NotUpgradeable\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49943,\"icon\":\"https://render.guildwars2.com/file/30A2EE0E7D03796A4628FC00D00E43B6A20D223A/499478.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49948() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sonic Tunneling Tool\",\"description\":\"<c=@abilitytype>Travel:</c> Double-click to equip a bundle that can change how you move around the world.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"NotUpgradeable\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49948,\"icon\":\"https://render.guildwars2.com/file/9FEC256ECF05DFA21EBCD97B17F5AB010C4E14B4/575137.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49950() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Mai Trin\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":49950,\"icon\":\"https://render.guildwars2.com/file/4A775E96496E20FF05127513C6F8FF03C7AAF4E6/740290.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49959() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Chest of the Mists\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49959,\"icon\":\"https://render.guildwars2.com/file/3FCAC7800E032AD2544939E16648CA668019361D/602788.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49960() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chest of the Mists\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49960,\"icon\":\"https://render.guildwars2.com/file/3FCAC7800E032AD2544939E16648CA668019361D/602788.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50014() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Selfless Potion\",\"description\":\"<c=@flavor>For those who put others before themselves in this time of need.<c>\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":50014,\"icon\":\"https://render.guildwars2.com/file/E23273EA75032B302FA591146D0F2CD666117739/740198.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50024() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Alliance Supplies\",\"description\":\"<c=@flavor>Supplies from Scarlet's Alliance troops.<c>\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":50024,\"icon\":\"https://render.guildwars2.com/file/F435090B4D1205CD0491DA2D5D20A12FE2023B6E/740217.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50025() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Blade Shard\",\"description\":\"<c=@flavor>Pieces of a sharp blade.<c>\n\nUsed in the crafting of Spinal Blade Pack back items.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":50025,\"icon\":\"https://render.guildwars2.com/file/54D75A06FAAABDD6D69D3A7A4E5CD25F94FDC04A/740218.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50026() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Crate of Alliance Supplies\",\"description\":\"<c=@flavor>A crate of 50 bags of supplies from Scarlet's Alliance troops.<c>\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":50026,\"icon\":\"https://render.guildwars2.com/file/F07CA0EFB1E6EB587DD7BF0E31044B0ED2A93B16/740219.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50027() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Empyreal Fragments\",\"description\":\"<c=@flavor>Contains 50 Empyreal Fragments.<c>\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":50027,\"icon\":\"https://render.guildwars2.com/file/C9DE092130D3D77607C91E2E21E03DFDB1AA0CF0/740220.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50028() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Captain Magnus\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"NoUnderwater\"],\"restrictions\":[],\"id\":50028,\"icon\":\"https://render.guildwars2.com/file/4FD739CBAEED5FAD96F840772E91F173AEDEA034/740221.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50030() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Found Belonging\",\"description\":\"Turn in for various goods at the Order camps in Gendarran Fields, Bloodtide Coast, or Lornar's Pass.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":50030,\"icon\":\"https://render.guildwars2.com/file/9E730AACF1D51352E4660A2C924306695795104E/740222.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50035() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Barrel of Alliance Supplies\",\"description\":\"<c=@flavor>A barrel of 100 bags of supplies from Scarlet's Alliance troops.<c>\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":50035,\"icon\":\"https://render.guildwars2.com/file/DE41CBA1260CBF90FBDB314637F39EAAF1930C9A/740223.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50040() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Endless Mystery Quaggan Tonic\",\"description\":\"The aroma of sea breezes and simpler times wafts from the bottle. Use its self-replenishing contents to transform into...something.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":50040,\"icon\":\"https://render.guildwars2.com/file/34A8DB7C74E02075D5235CCBDE1DAA2FEDEDB35A/740227.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50042() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Endless Blue Quaggan Tonic\",\"description\":\"Double-click to transform into a quaggan for fifteen minutes. You will be unable to fight while transformed.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":50042,\"icon\":\"https://render.guildwars2.com/file/38F3D70D77AB4DC6EB04A3A351C0A0A53CA95796/740228.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50043() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Endless Pink Quaggan Tonic\",\"description\":\"Double-click to transform into a quaggan for fifteen minutes. You will be unable to fight while transformed.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":50043,\"icon\":\"https://render.guildwars2.com/file/D74E06F51C1C2EF3ED4065F99AB35D0F257B18AA/740229.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50046() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Endless Black Quaggan Tonic\",\"description\":\"Double-click to transform into a quaggan for fifteen minutes. You will be unable to fight while transformed.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":50046,\"icon\":\"https://render.guildwars2.com/file/D09903EE135E03D926A2E4665E02CEBA47D4EC78/740232.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50047() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Endless Green Quaggan Tonic\",\"description\":\"Double-click to transform into a quaggan for fifteen minutes. You will be unable to fight while transformed.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":50047,\"icon\":\"https://render.guildwars2.com/file/C05870B7DD6B10C4CB0B01E506509F74B56E3CED/740233.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50048() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thoughtless Potion\",\"description\":\"<c=@flavor>For those who only thought of themselves in this time of need.<c>\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":50048,\"icon\":\"https://render.guildwars2.com/file/644E75B238936C4C05C14E3117425A240C352C9A/740235.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50057() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Static Assault Knight Power Core\",\"description\":\"Can be combined in the Mystic Forge with Tempered Spinal Blades, Crystalline Dust, and Bottles of Elonian Wine to create a colored version of Tempered Spinal Blades.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\"],\"restrictions\":[],\"id\":50057,\"icon\":\"https://render.guildwars2.com/file/134F6448D27AAF026F7F013923B8D3EF0B0FA1AF/771006.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50058() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Synergetic Assault Knight Power Core\",\"description\":\"Can be combined in the Mystic Forge with Tempered Spinal Blades, Crystalline Dust, and Bottles of Elonian Wine to create a colored version of Tempered Spinal Blades.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\"],\"restrictions\":[],\"id\":50058,\"icon\":\"https://render.guildwars2.com/file/79E7DA3372392C73B66E26A562BF7C7964B9E50D/771007.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50059() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dynamic Assault Knight Power Core\",\"description\":\"Can be combined in the Mystic Forge with Tempered Spinal Blades, Crystalline Dust, and Bottles of Elonian Wine to create a colored version of Tempered Spinal Blades.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\"],\"restrictions\":[],\"id\":50059,\"icon\":\"https://render.guildwars2.com/file/803319FE1ABE1BC6EA692EAD6A6E475BA106CB0D/771008.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50065() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Blades\",\"description\":\"A gift of blades used to create Tempered Spinal Blades.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":50065,\"icon\":\"https://render.guildwars2.com/file/02F941EE376D490DDD5428294F2EF05EDB07E405/740277.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50069() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Found Heirloom\",\"description\":\"<c=@flavor>Assortment of objects that might be important to a Lion's Arch refugee.<c>\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Pve\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":50069,\"icon\":\"https://render.guildwars2.com/file/47932A921BD7A3902FA6714B36C1536795A97E74/740278.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}