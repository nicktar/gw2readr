package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0174 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem39527() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Plush Tybalt Backpack Set\",\"description\":\"This backpack cover comes with a simple back strap to wear if you don't have another back-slot item.\nDouble-click to unpack.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":39527,\"icon\":\"https://render.guildwars2.com/file/D22D50C33B2153FE74C9912F245E1B90E6CB1BB5/543855.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39546() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Preserved Red Iris Flower\",\"description\":\"<c=@flavor>Lovingly preserved specimen of an exceedingly rare iris.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39546,\"icon\":\"https://render.guildwars2.com/file/A739E36ADE1D15561536583A4D79E8F70FB402A3/543891.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17069,\"description\":\"+32 Healing Power\n+18 Toughness\n+18 Power\"},\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":59},{\"attribute\":\"Power\",\"modifier\":42},{\"attribute\":\"Toughness\",\"modifier\":42}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39547() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Kurzick Bauble\",\"description\":\"<c=@flavor>Smuggled out of Cantha long ago, a relic of the Great House of Lutgardis.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39547,\"icon\":\"https://render.guildwars2.com/file/9039BCCFE009DBDD17FBEFFBB96E0B653F7A58DE/543892.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17069,\"description\":\"+32 Healing Power\n+18 Toughness\n+18 Power\"},\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":59},{\"attribute\":\"Power\",\"modifier\":42},{\"attribute\":\"Toughness\",\"modifier\":42}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39548() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Preserved Red Iris Flower (Infused)\",\"description\":\"<c=@flavor>Lovingly preserved specimen of an exceedingly rare iris.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39548,\"icon\":\"https://render.guildwars2.com/file/A739E36ADE1D15561536583A4D79E8F70FB402A3/543891.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17073,\"description\":\"+32 Healing Power\n+18 Toughness\n+18 Power\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":59},{\"attribute\":\"Power\",\"modifier\":42},{\"attribute\":\"Toughness\",\"modifier\":42}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39549() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Kurzick Bauble (Infused)\",\"description\":\"<c=@flavor>Smuggled out of Cantha long ago, a relic of the Great House of Lutgardis.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39549,\"icon\":\"https://render.guildwars2.com/file/9039BCCFE009DBDD17FBEFFBB96E0B653F7A58DE/543892.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17073,\"description\":\"+32 Healing Power\n+18 Toughness\n+18 Power\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":59},{\"attribute\":\"Power\",\"modifier\":42},{\"attribute\":\"Toughness\",\"modifier\":42}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39550() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Warmaster's Family Heirloom\",\"description\":\"<c=@flavor>Generations of norn-etched runes cover this dolyak horn. The most recent is a symbol of the Vigil.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39550,\"icon\":\"https://render.guildwars2.com/file/A045DFB51BAEB8D6A7F8C5E139720E763A94971A/543893.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17070,\"description\":\"+32 Toughness\n+18 Power\n+18 Precision\"},\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":59},{\"attribute\":\"Power\",\"modifier\":42},{\"attribute\":\"Precision\",\"modifier\":42}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39551() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Totem of the Gorilla\",\"description\":\"<c=@flavor>An intrepid norn artist paid respect to a far-flung Spirit of the Wild with this carving.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39551,\"icon\":\"https://render.guildwars2.com/file/F94523012B513334626E47593E5C49BF1A25FE4F/543894.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17070,\"description\":\"+32 Toughness\n+18 Power\n+18 Precision\"},\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":59},{\"attribute\":\"Power\",\"modifier\":42},{\"attribute\":\"Precision\",\"modifier\":42}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39552() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Warmaster's Family Heirloom (Infused)\",\"description\":\"<c=@flavor>Generations of norn-etched runes cover this dolyak horn. The most recent is a symbol of the Vigil.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39552,\"icon\":\"https://render.guildwars2.com/file/A045DFB51BAEB8D6A7F8C5E139720E763A94971A/543893.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17074,\"description\":\"+32 Toughness\n+18 Power\n+18 Precision\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":59},{\"attribute\":\"Power\",\"modifier\":42},{\"attribute\":\"Precision\",\"modifier\":42}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39554() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Fledgling Charm\",\"description\":\"<c=@flavor>Young tengu are given charms like this for protection.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39554,\"icon\":\"https://render.guildwars2.com/file/D03A63B5BDFB98C04E9B42EE10F352E361D4C7F9/543895.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17071,\"description\":\"+32 Precision\n+18 Power\n+18 Condition Damage\"},\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":59},{\"attribute\":\"Power\",\"modifier\":42},{\"attribute\":\"ConditionDamage\",\"modifier\":42}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39555() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Anton's Secret\",\"description\":\"<c=@flavor>An item to be hidden in the most unlikely of places.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39555,\"icon\":\"https://render.guildwars2.com/file/3E3D6950611F4CAAF991E2120D25C6F8AA09945C/543896.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17071,\"description\":\"+32 Precision\n+18 Power\n+18 Condition Damage\"},\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":59},{\"attribute\":\"Power\",\"modifier\":42},{\"attribute\":\"ConditionDamage\",\"modifier\":42}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39558() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Passiflora Karkinata\",\"description\":\"<c=@flavor>An extremely rare and powerful floral specimen.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39558,\"icon\":\"https://render.guildwars2.com/file/FD6F0D9220CF050CCAEBCDC42873E7A613E2CB6C/543897.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15745,\"description\":\"+32 Healing\n+18 Condition Damage\n+18 Toughness\"},\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":59},{\"attribute\":\"Toughness\",\"modifier\":42},{\"attribute\":\"ConditionDamage\",\"modifier\":42}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39559() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Karka Carapace\",\"description\":\"<c=@flavor>Part of the ancient karka that attacked Lion's Arch. Mysterious magics seem to be woven into its chitinous shell.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39559,\"icon\":\"https://render.guildwars2.com/file/54B7081754096FB299A3E9241FE103E2B4A2CDF2/543898.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15745,\"description\":\"+32 Healing\n+18 Condition Damage\n+18 Toughness\"},\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":59},{\"attribute\":\"Toughness\",\"modifier\":42},{\"attribute\":\"ConditionDamage\",\"modifier\":42}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39562() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Molten Ore\",\"description\":\"<c=@flavor>A dark artifact of the combined forces of the Flame Legion and dredge. This ore seems too impure to properly refine, but it gleams with dark potential.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39562,\"icon\":\"https://render.guildwars2.com/file/05BBDC6F1C34F70A3C0E180C1B3A09D301FEF16D/543899.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17072,\"description\":\"+32 Precision\n+18 Toughness\n+18 Power\"},\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":59},{\"attribute\":\"Power\",\"modifier\":42},{\"attribute\":\"Toughness\",\"modifier\":42}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39563() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Big Mama's Tooth\",\"description\":\"<c=@flavor>Legends speak of \\\"Big Mama,\\\" the largest drake broodmother that ever lived. If she still does, it seems she's short at least one tooth.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":413,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39563,\"icon\":\"https://render.guildwars2.com/file/6332FDCADCFBADE54BFE71B8C5057FF280C5A9CC/543900.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17072,\"description\":\"+32 Precision\n+18 Toughness\n+18 Power\"},\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":59},{\"attribute\":\"Power\",\"modifier\":42},{\"attribute\":\"Toughness\",\"modifier\":42}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39566() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Amulet of Protection\",\"description\":\"<c=@flavor>Stolen from the body of a long-forgotten lord during the Guild Wars.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39566,\"icon\":\"https://render.guildwars2.com/file/387ECC1FB5D8301D6BEC9C94E71B0617CF07A66E/543901.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17069,\"description\":\"+32 Healing Power\n+18 Toughness\n+18 Power\"},\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":94},{\"attribute\":\"Power\",\"modifier\":67},{\"attribute\":\"Toughness\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39567() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Salma's Diamond Jubilee Necklace\",\"description\":\"<c=@flavor>Queen Salma's reign was long and prosperous. Such prosperity has long been missed in Kryta.<c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39567,\"icon\":\"https://render.guildwars2.com/file/A36EB8D4BACBFEA6D7BD02F67C5CECEA6C45386D/543902.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17069,\"description\":\"+32 Healing Power\n+18 Toughness\n+18 Power\"},\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":94},{\"attribute\":\"Power\",\"modifier\":67},{\"attribute\":\"Toughness\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39568() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Amulet of Protection (Infused)\",\"description\":\"<c=@flavor>Stolen from the body of a long-forgotten lord during the Guild Wars.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39568,\"icon\":\"https://render.guildwars2.com/file/387ECC1FB5D8301D6BEC9C94E71B0617CF07A66E/543901.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17073,\"description\":\"+32 Healing Power\n+18 Toughness\n+18 Power\n+5 Agony Resistance\"},\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":94},{\"attribute\":\"Power\",\"modifier\":67},{\"attribute\":\"Toughness\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39570() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Kodan Prayer Beads\",\"description\":\"<c=@flavor>A string of 49 ivory beads.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39570,\"icon\":\"https://render.guildwars2.com/file/2D1BC2EC75776E7AC85BAB7D7CAD715623A99C44/543903.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17070,\"description\":\"+32 Toughness\n+18 Power\n+18 Precision\"},\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":94},{\"attribute\":\"Power\",\"modifier\":67},{\"attribute\":\"Precision\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39571() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Amulet of the Skies\",\"description\":\"<c=@flavor>A talented Durmand Priory scholar based this necklace on ancient astrological charts found on jotun megaliths.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39571,\"icon\":\"https://render.guildwars2.com/file/BE9F103DCB1E2A77907E7A909DD9C10448A04FC1/543904.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17070,\"description\":\"+32 Toughness\n+18 Power\n+18 Precision\"},\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":94},{\"attribute\":\"Power\",\"modifier\":67},{\"attribute\":\"Precision\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39575() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Nornbear's Remembrance\",\"description\":\"<c=@flavor>Once a painful reminder to Jora of her brother's curse.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39575,\"icon\":\"https://render.guildwars2.com/file/C4737C6E6CC01DF2F896B70214545F05CD073952/543906.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17071,\"description\":\"+32 Precision\n+18 Power\n+18 Condition Damage\"},\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":94},{\"attribute\":\"Power\",\"modifier\":67},{\"attribute\":\"ConditionDamage\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39578() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Archaic Grawl Necklace\",\"description\":\"<c=@flavor>From a time before the grawl had a spoken language.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39578,\"icon\":\"https://render.guildwars2.com/file/90E8685541985D58F41D1DA6080E0D18A24DBFAB/543907.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15745,\"description\":\"+32 Healing\n+18 Condition Damage\n+18 Toughness\"},\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":94},{\"attribute\":\"Toughness\",\"modifier\":67},{\"attribute\":\"ConditionDamage\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39579() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"The Southsun Rose\",\"description\":\"<c=@flavor>The largest pink diamond in all of Tyria.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39579,\"icon\":\"https://render.guildwars2.com/file/CFB17C440E002A07B433B59B5279E6F8E1EC964A/543908.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15745,\"description\":\"+32 Healing\n+18 Condition Damage\n+18 Toughness\"},\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":94},{\"attribute\":\"Toughness\",\"modifier\":67},{\"attribute\":\"ConditionDamage\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39582() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Charisma\",\"description\":\"<c=@flavor>The locket contains a picture of Kolijn Johansson, Trade Administrator of Hoelbrak.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39582,\"icon\":\"https://render.guildwars2.com/file/92B00043701EAB16679D0D757A562C60BAAD7B08/543909.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17072,\"description\":\"+32 Precision\n+18 Toughness\n+18 Power\"},\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":94},{\"attribute\":\"Power\",\"modifier\":67},{\"attribute\":\"Toughness\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39583() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Third-Place Medal\",\"description\":\"<c=@flavor>Congratulations from the Divinity's Reach Fancy Cat Association! Everyone is fancy in their own way.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39583,\"icon\":\"https://render.guildwars2.com/file/DEBDAA99D9DFBC36596076963FCA7F09052D376C/543910.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17072,\"description\":\"+32 Precision\n+18 Toughness\n+18 Power\"},\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":94},{\"attribute\":\"Power\",\"modifier\":67},{\"attribute\":\"Toughness\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39586() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Prayer to Otter\",\"description\":\"<c=@flavor>Otter is a fickle spirit, but when she does grant a boon, it is a powerful gift indeed.</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":39586,\"icon\":\"https://render.guildwars2.com/file/C241147CD02EC9337A0FA379A9A5E896AF0CB61F/543911.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Utility\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":17069,\"description\":\"+32 Healing Power\n+18 Toughness\n+18 Power\"},\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":94},{\"attribute\":\"Power\",\"modifier\":67},{\"attribute\":\"Toughness\",\"modifier\":67}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}