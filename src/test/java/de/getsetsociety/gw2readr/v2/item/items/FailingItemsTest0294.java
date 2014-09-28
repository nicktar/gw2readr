package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0294 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem66611() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Scarlet's Box of Desert Knickknacks\",\"description\":\"<c=@flavor>Odds and ends Scarlet collected during her time in Dry Top.<c>\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66611,\"icon\":\"https://render.guildwars2.com/file/ECB3A779653905C796A543F000CCC5F0F603F375/831463.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66614() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dusty Bag of Loot\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66614,\"icon\":\"https://render.guildwars2.com/file/10ACE47195709F69F366026507FEB0080DF39BE7/63194.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66621() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Saboteur's Rucksack\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66621,\"icon\":\"https://render.guildwars2.com/file/CB6FA01074224ECA4BF2AE03B7AFC407264B98F3/619521.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66622() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Inquest Research Supplies\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66622,\"icon\":\"https://render.guildwars2.com/file/14A754524227DA043013B9EA09C2ADD505DCBB1F/222416.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66624() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Zephyrite Lockpick\",\"description\":\"This key opens a buried locked chest in Dry Top. These chests are only visible during sandstorms.\n\n<c=@flavor>Buried locked chests can contain armor, weapons, rare skins, recipes, ambrite, and more.</c>\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66624,\"icon\":\"https://render.guildwars2.com/file/A6F57A2C946B2A02062AC0A9452703505CF8B3BE/831466.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66636() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ambrite Fossilized Centipede\",\"description\":\"Used to craft the sword Cryptopidae.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66636,\"icon\":\"https://render.guildwars2.com/file/7DE2340F06BBB2E532095EDB16CEB6FFB6CE05F0/831470.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66637() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Piece of Ambrite\",\"description\":\"Refine into Sheets of Ambrite.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":46,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":66637,\"icon\":\"https://render.guildwars2.com/file/D2CC0E0A9C4E391BC2D1B6EFADB0EC9D6CE0DFFC/831471.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66638() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Nomad's Orichalcum Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Toughness, +Healing, and +Vitality. Nomad's weapon recipes are found in buried chests in the Maguuma Wastes.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66638,\"icon\":\"https://render.guildwars2.com/file/B0AE7C0856D4B9CA04BC381409CCFD2C71136E7A/831472.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66639() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ventari's Nomad Inscription\",\"description\":\"Used in the crafting of weapons with +Toughness, +Healing, and +Vitality. Nomad's ascended weapon recipes are found in buried chests in the Maguuma Wastes.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66639,\"icon\":\"https://render.guildwars2.com/file/95FA584E53F301204B3CEE053C6857F59BC60733/831473.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66640() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ambrite Fossilized Butterfly\",\"description\":\"Used to craft the axe Lepidoptera.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66640,\"icon\":\"https://render.guildwars2.com/file/FE0B590E4306B50CAB07E62B7A366DA1ADF14D05/831474.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66641() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Nomad's Intricate Gossamer Insignia\",\"description\":\"Used in the crafting of armor with +Toughness, +Healing, and +Vitality. Nomad's armor recipes are found in buried chests in the Maguuma Wastes.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66641,\"icon\":\"https://render.guildwars2.com/file/72DBFA4BDFFFE055B919B30D48B1C05A3EC5DFD7/831475.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66642() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ambrite Fossilized Termite\",\"description\":\"Used to craft the dagger Blattodea.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66642,\"icon\":\"https://render.guildwars2.com/file/DA2B5172792EE5D90677DC039A6F351D033D0708/831476.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66643() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ventari's Nomad Insignia\",\"description\":\"Used in the crafting of armor with +Toughness, +Healing, and +Vitality. Nomad's ascended armor recipes are found in buried chests in the Maguuma Wastes.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66643,\"icon\":\"https://render.guildwars2.com/file/BF9D29CC02669C4C1451B616E6D22C027BDCAFAE/831477.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66644() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ambrite Fossilized Firefly\",\"description\":\"Used to craft the torch Lampyridae.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66644,\"icon\":\"https://render.guildwars2.com/file/2601C1EFFFF29A27B771912ED4DD130CC7F84963/831478.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66645() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ambrite Fossilized Millipede\",\"description\":\"Used to craft the focus Spirobolidae.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66645,\"icon\":\"https://render.guildwars2.com/file/03C0075FFEB4611BFA3842BB6B67A70AA74FF3CD/831479.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66646() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ambrite Fossilized Dragonfly\",\"description\":\"Used to craft the longbow Odonata.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66646,\"icon\":\"https://render.guildwars2.com/file/DCAE0E13574320674C6DFB20E1B7799908E8B94A/831480.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66647() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ambrite Fossilized Grub\",\"description\":\"Used to craft the hammer Diptera.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66647,\"icon\":\"https://render.guildwars2.com/file/E543F0ECE094EB95271E1138472B63B4E442A8B8/831481.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66648() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ambrite Fossilized Hornet\",\"description\":\"Used to craft the staff Hymenoptera.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66648,\"icon\":\"https://render.guildwars2.com/file/BFEF98DE70716FDBEE59AAD87B0E281AC059120A/831482.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66649() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ambrite Fossilized Cricket\",\"description\":\"Used to craft the warhorn Orthoptera.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66649,\"icon\":\"https://render.guildwars2.com/file/B317A00F07EC1F110E2E78C1BE040C2E414E0C2D/831483.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66650() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sheet of Ambrite\",\"description\":\"Refined from Ambrite.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":66650,\"icon\":\"https://render.guildwars2.com/file/A87B2A37E3400D19E0BF2D9206DF80DD6C98066E/831484.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66651() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ambrite Fossilized Spider\",\"description\":\"Used to craft the scepter Latrodectus.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66651,\"icon\":\"https://render.guildwars2.com/file/FE73F012119252F1935797B2EC2C94482AB5A308/831485.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66652() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ambrite Fossilized Cockroach\",\"description\":\"Used to craft the mace Blattellidae.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66652,\"icon\":\"https://render.guildwars2.com/file/02D30DC2B611B1EB0FE141534A377AA5DE3303D8/831486.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66653() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ambrite Fossilized Beetle\",\"description\":\"Used to craft the shield Coleoptera.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66653,\"icon\":\"https://render.guildwars2.com/file/916A26C2C1E223F380C548A96CD6C3D1469C5F0B/831487.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66654() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ambrite Fossilized Devourer\",\"description\":\"Used to craft the greatsword Scorpiones.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66654,\"icon\":\"https://render.guildwars2.com/file/094608C0F60836BE2A52F254FDE5276FC201484F/831488.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem66655() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ambrite Fossilized Bee\",\"description\":\"Used to craft the pistol Apidae.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":66655,\"icon\":\"https://render.guildwars2.com/file/01C5A7B5B0B01C3605090750B44B760F70C07A05/831489.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}