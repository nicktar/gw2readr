package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0220 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem49847() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Scarlet's Lockbox Code Fragment\",\"description\":\"Double-click to combine 25 code fragments to complete a cypher.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49847,\"icon\":\"https://render.guildwars2.com/file/31FEF46CC4CE1391730B17B0487D56DF7075E536/711907.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49849() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Scarlet Briar's Journal, 1st Fragment\",\"description\":\"Double-click to read. Collect all 5 fragments and double-click to assemble the journal.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49849,\"icon\":\"https://render.guildwars2.com/file/420E49DB1E7D3DA8B91DCA15A747B19E1E06B4CD/711899.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49851() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Toxic Code Fragment\",\"description\":\"Double-click to combine 25 code fragments to complete a cypher.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49851,\"icon\":\"https://render.guildwars2.com/file/36326D7F5322B7B30294052552EC35A2BD2607C3/711910.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49852() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Scarlet Briar's Journal, 3rd Fragment\",\"description\":\"Double-click to read. Collect all 5 fragments and double-click to assemble the journal.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49852,\"icon\":\"https://render.guildwars2.com/file/420E49DB1E7D3DA8B91DCA15A747B19E1E06B4CD/711899.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49853() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Scarlet Briar's Journal, 4th Fragment\",\"description\":\"Double-click to read. Collect all 5 fragments and double-click to assemble the journal.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49853,\"icon\":\"https://render.guildwars2.com/file/420E49DB1E7D3DA8B91DCA15A747B19E1E06B4CD/711899.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49854() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Scarlet Briar's Journal, 5th Fragment\",\"description\":\"Double-click to read. Collect all 5 fragments and double-click to assemble the journal.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49854,\"icon\":\"https://render.guildwars2.com/file/420E49DB1E7D3DA8B91DCA15A747B19E1E06B4CD/711899.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49857() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Aetherblade Code Fragments\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49857,\"icon\":\"https://render.guildwars2.com/file/CBB030E8B6D4F24D1292D2BAE37F2549CAFB0717/63181.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49858() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Toxic Code Fragments\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49858,\"icon\":\"https://render.guildwars2.com/file/F5F6BA05016F3E480AA9BA5BE39E060EC362D367/63176.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49859() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Watchwork Code Fragments\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49859,\"icon\":\"https://render.guildwars2.com/file/611F3A54CC0F0BB36B7C58B8D4A5B941A5ED055D/63175.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49860() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Molten Code Fragments\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49860,\"icon\":\"https://render.guildwars2.com/file/9A17A2CE63A1C86D803E183671BB49BBBDB90715/63179.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49861() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Power Core Component\",\"description\":\"Double-click to combine 50 components to assemble a power core.\n<c=@flavor>This component was salvaged from an Energy Probe.</c>\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":1,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49861,\"icon\":\"https://render.guildwars2.com/file/28D33829D4E8CC67A56E0A073512204703374D5C/711912.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49863() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Keeper's Zealot Inscription\",\"description\":\"Used in the crafting of weapons with +Power, +Precision, and +Healing.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49863,\"icon\":\"https://render.guildwars2.com/file/D8E69FB73BA10ED6CAAEED92043F115794CCD841/711966.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49864() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Keeper's Zealot Insignia\",\"description\":\"Used in the crafting of armor with +Power, +Precision, and +Healing.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49864,\"icon\":\"https://render.guildwars2.com/file/35D5703D4379BD4F5D989D07B406C70EAFF86197/711967.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49865() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Zealot's Orichalcum Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Power, +Precision, and +Healing.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49865,\"icon\":\"https://render.guildwars2.com/file/2F79B05013F025ACAB90E7F83E6465B376D00F6A/711968.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49866() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Zealot's Intricate Gossamer Insignia\",\"description\":\"Used in the crafting of armor with +Power, +Precision, and +Healing.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49866,\"icon\":\"https://render.guildwars2.com/file/AE043BF212E6C378E3CA071303D37955CDFCF048/711969.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49867() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Identity Repair Kit\",\"description\":\"This kit contains a Total Makeover Kit and a Name Change Contract.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":12,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49867,\"icon\":\"https://render.guildwars2.com/file/496C7A44E19FEE44264BA6573C03E4C60B310C4B/729529.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49868() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Crimson Great Jungle Wurm\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49868,\"icon\":\"https://render.guildwars2.com/file/9FB6D0F706C275F64F030472BE0E15646DA3B5A9/711971.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49869() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Amber Great Jungle Wurm\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49869,\"icon\":\"https://render.guildwars2.com/file/7A90067D42E7A8F61CE57F68FA56EFA90E4B54AE/711972.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49870() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Cobalt Great Jungle Wurm\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49870,\"icon\":\"https://render.guildwars2.com/file/E6BB78D5C8AB61B8B8200E4531BAD97E66E794E6/711973.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49931() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Riding Broom\",\"description\":\"<c=@abilitytype>Travel:</c> Double-click to equip a bundle that can change how you move around the world.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"NotUpgradeable\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49931,\"icon\":\"https://render.guildwars2.com/file/0B041363F2E8D23B9CF828C51A77B81F303626BA/534228.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49932() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Enchanted Broom\",\"description\":\"<c=@abilitytype>Costume Brawl Toy:</c> Double-click to equip a bundle which grants fun costume brawl skills. Brawl skills will only hit other players also using costume brawl.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"NotUpgradeable\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49932,\"icon\":\"https://render.guildwars2.com/file/306AC2AA3648170B137FFF57030C5AD550F2615F/499494.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49933() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bouquet of Roses\",\"description\":\"<c=@abilitytype>Costume Brawl Toy:</c> Double-click to equip a bundle which grants fun costume brawl skills. Brawl skills will only hit other players also using costume brawl.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"NotUpgradeable\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49933,\"icon\":\"https://render.guildwars2.com/file/9B06346EC37F0DD0A2EF61F819F56962D11FE1BE/534227.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49939() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Frying Pan\",\"description\":\"<c=@abilitytype>Costume Brawl Toy:</c> Double-click to equip a bundle which grants fun costume brawl skills. Brawl skills will only hit other players also using costume brawl.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"NotUpgradeable\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49939,\"icon\":\"https://render.guildwars2.com/file/511DBF081277C7D470EE5322A1F5377460F95E0C/220578.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49940() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Executioner Axe Toy\",\"description\":\"<c=@abilitytype>Costume Brawl Toy:</c> Double-click to equip a bundle which grants fun costume brawl skills. Brawl skills will only hit other players also using costume brawl.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"NotUpgradeable\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49940,\"icon\":\"https://render.guildwars2.com/file/42A058A4DEBDDC980D9666E07B1E779839EFE32E/648165.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49941() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bloody Prince's Staff Toy\",\"description\":\"<c=@abilitytype>Costume Brawl Toy:</c> Double-click to equip a bundle which grants fun costume brawl skills. Brawl skills will only hit other players also using costume brawl.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"NotUpgradeable\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49941,\"icon\":\"https://render.guildwars2.com/file/DCAA16650655B79ADDAD02B44B590EA9397AD3DE/648159.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}