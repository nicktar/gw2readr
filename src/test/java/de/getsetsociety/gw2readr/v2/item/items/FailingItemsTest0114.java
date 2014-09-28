package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0114 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem23691() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mellaggan Safety Shell\",\"description\":\"<c=@flavor>This shell keeps quaggan safe in dangerous waters.</c>\",\"type\":\"Trinket\",\"level\":79,\"rarity\":\"Fine\",\"vendor_value\":82,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23691,\"icon\":\"https://render.guildwars2.com/file/0C7B393FC55792DCFD2B74FF17CAD1D992F4F057/455947.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":41},{\"attribute\":\"Precision\",\"modifier\":30},{\"attribute\":\"Toughness\",\"modifier\":30}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23692() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chisel\",\"description\":\"<c=@flavor>The area is littered with these. The rumor is these were used by Malchor.\\\"</c>\",\"type\":\"Trinket\",\"level\":79,\"rarity\":\"Fine\",\"vendor_value\":82,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23692,\"icon\":\"https://render.guildwars2.com/file/F27E6014D4CCBFC959360D330336A072663EDFE1/455948.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":41},{\"attribute\":\"Toughness\",\"modifier\":30},{\"attribute\":\"Vitality\",\"modifier\":30}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23693() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orrian Mirror Shard\",\"description\":\"<c=@flavor>\\\"Are we mere reflections of the truth?\\\"<br>—Nessa</c>\",\"type\":\"Trinket\",\"level\":78,\"rarity\":\"Fine\",\"vendor_value\":80,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23693,\"icon\":\"https://render.guildwars2.com/file/BEBD340F6E312FE23B03FAA104AA20C835A0D674/455949.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":41},{\"attribute\":\"Precision\",\"modifier\":29},{\"attribute\":\"Vitality\",\"modifier\":29}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23694() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wren Trading Coin\",\"description\":\"<c=@flavor>\\\"They used these to trade goods a long time ago. Sometimes its easy to forget these used to be people.\\\"<br>—Lightbringer Zykk</c>\",\"type\":\"Trinket\",\"level\":77,\"rarity\":\"Masterwork\",\"vendor_value\":158,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23694,\"icon\":\"https://render.guildwars2.com/file/CD641E313C19ACDDAE34CDC52B48181EC763089F/63110.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":43},{\"attribute\":\"Toughness\",\"modifier\":31},{\"attribute\":\"Vitality\",\"modifier\":31}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23695() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Light Of Doric\",\"description\":\"<c=@flavor>\\\"Stories tell of a procession of lights through this area. It must have been beautiful with lights such as these.\\\"<br>—Keeper Lyrda</c>\",\"type\":\"Trinket\",\"level\":79,\"rarity\":\"Masterwork\",\"vendor_value\":163,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23695,\"icon\":\"https://render.guildwars2.com/file/F3BEB3B77A2B25D3687675021B99EF3E0CCF6AE9/66837.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":45},{\"attribute\":\"Precision\",\"modifier\":32},{\"attribute\":\"Vitality\",\"modifier\":32}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23696() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Magical Orrian Lure\",\"description\":\"<c=@flavor>\\\"So magical the fish catch it.\\\"<br>—Supply Sergeant Mattimer</c>\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Masterwork\",\"vendor_value\":155,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23696,\"icon\":\"https://render.guildwars2.com/file/CC2E01E0F566A6EEF4F2EC2B19AA7A3E1FEFB1B4/60984.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":41},{\"attribute\":\"Precision\",\"modifier\":30},{\"attribute\":\"Toughness\",\"modifier\":30}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23697() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Order of Whispers Secret Code\",\"description\":\"<c=@flavor>\\\"Asura, Orrian, Local, Attack\\\"</c>\",\"type\":\"Trinket\",\"level\":79,\"rarity\":\"Masterwork\",\"vendor_value\":163,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23697,\"icon\":\"https://render.guildwars2.com/file/CC2E01E0F566A6EEF4F2EC2B19AA7A3E1FEFB1B4/60984.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":45},{\"attribute\":\"Toughness\",\"modifier\":32},{\"attribute\":\"Vitality\",\"modifier\":32}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23698() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chisel\",\"description\":\"<c=@flavor>The area is littered with these. The rumor is these were used by Malchor.\\\"</c>\",\"type\":\"Trinket\",\"level\":79,\"rarity\":\"Masterwork\",\"vendor_value\":163,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23698,\"icon\":\"https://render.guildwars2.com/file/F27E6014D4CCBFC959360D330336A072663EDFE1/455948.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":45},{\"attribute\":\"Toughness\",\"modifier\":32},{\"attribute\":\"Vitality\",\"modifier\":32}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23699() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orrian Mirror Shard\",\"description\":\"<c=@flavor>\\\"Are we mere reflections of the truth?\\\"<br>—Nessa</c>\",\"type\":\"Trinket\",\"level\":78,\"rarity\":\"Masterwork\",\"vendor_value\":160,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23699,\"icon\":\"https://render.guildwars2.com/file/BEBD340F6E312FE23B03FAA104AA20C835A0D674/455949.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":44},{\"attribute\":\"Precision\",\"modifier\":31},{\"attribute\":\"Vitality\",\"modifier\":31}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23700() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Intercepted Inquest Calculations\",\"description\":\"<c=@flavor>\\\"(X, R(x,z) ≥ min(R(x,y),R(y,z) - X, A(x*y) ≥ min(A(x),B(x))) + A(x*y−1) ≥ min(A(x),A(y−1))\\\"</c>\",\"type\":\"Trinket\",\"level\":79,\"rarity\":\"Masterwork\",\"vendor_value\":163,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23700,\"icon\":\"https://render.guildwars2.com/file/6F2215EB6E98B707DA6214AABF510667A6CE6609/66821.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":45},{\"attribute\":\"Precision\",\"modifier\":32},{\"attribute\":\"Toughness\",\"modifier\":32}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23701() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pact Invasion Battle Plan\",\"description\":\"<c=@flavor>\\\"I'm surprised this survived first contact with the enemy.\\\"<br>—Magister Pagga</c>\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Masterwork\",\"vendor_value\":155,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23701,\"icon\":\"https://render.guildwars2.com/file/4BF50B0F80D6C20115B7DEB77A6B120435F4A694/222610.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":41},{\"attribute\":\"Precision\",\"modifier\":30},{\"attribute\":\"Vitality\",\"modifier\":30}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23702() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mellaggan Safety Shell\",\"description\":\"<c=@flavor>This shell keeps quaggan safe in dangerous waters.</c>\",\"type\":\"Trinket\",\"level\":79,\"rarity\":\"Masterwork\",\"vendor_value\":163,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23702,\"icon\":\"https://render.guildwars2.com/file/0C7B393FC55792DCFD2B74FF17CAD1D992F4F057/455947.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":45},{\"attribute\":\"Precision\",\"modifier\":32},{\"attribute\":\"Toughness\",\"modifier\":32}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23703() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orrian Pottery Shard\",\"description\":\"<c=@flavor>The historical significance of this shard barely makes up for its pungent odor.</c>\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Masterwork\",\"vendor_value\":155,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23703,\"icon\":\"https://render.guildwars2.com/file/EB2AF7C99C3CFF4B28536162CEB334C528FC4CA0/455945.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":41},{\"attribute\":\"Precision\",\"modifier\":30},{\"attribute\":\"Toughness\",\"modifier\":30}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23704() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Submarine Periscope Lens\",\"description\":\"<c=@flavor>\\\"It fell out and we can't get it back in...\\\"<br>—Nessa</c>\",\"type\":\"Trinket\",\"level\":78,\"rarity\":\"Masterwork\",\"vendor_value\":160,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23704,\"icon\":\"https://render.guildwars2.com/file/59599A7105A7777E64667F6D591E9721ADB3E6D3/455946.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":44},{\"attribute\":\"Precision\",\"modifier\":31},{\"attribute\":\"Vitality\",\"modifier\":31}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23705() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Runestone Necklace\",\"description\":\"\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":124,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23705,\"icon\":\"https://render.guildwars2.com/file/5029F1056F05432812FCDEB23A06C072F4A7DDFD/455950.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":61},{\"attribute\":\"Precision\",\"modifier\":44},{\"attribute\":\"Toughness\",\"modifier\":44}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23706() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Orrian Urn\",\"description\":\"\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":78,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23706,\"icon\":\"https://render.guildwars2.com/file/9E323FFE450FD1D1B22014A8F74074ADED8015B7/455951.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":38},{\"attribute\":\"Precision\",\"modifier\":27},{\"attribute\":\"Toughness\",\"modifier\":27}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23707() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cursed Pirate Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":93,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23707,\"icon\":\"https://render.guildwars2.com/file/0FBD3AE0A86297C46F63C935D622C4BEC601592F/455952.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":46},{\"attribute\":\"Precision\",\"modifier\":33},{\"attribute\":\"Vitality\",\"modifier\":33}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23708() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Abaddon Talisman\",\"description\":\"\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":78,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23708,\"icon\":\"https://render.guildwars2.com/file/FDA1D90665A4CABB117E5D59182D0B5D0FA46802/455953.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":38},{\"attribute\":\"Precision\",\"modifier\":27},{\"attribute\":\"Vitality\",\"modifier\":27}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23709() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orrian Pearl\",\"description\":\"\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":78,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23709,\"icon\":\"https://render.guildwars2.com/file/7D70420B60279BB1019EE840FD0B493CB41EF993/66820.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":38},{\"attribute\":\"Toughness\",\"modifier\":27},{\"attribute\":\"Vitality\",\"modifier\":27}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23710() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Airship Captain's Badge\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Fine\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23710,\"icon\":\"https://render.guildwars2.com/file/596749EC03A1D6B69F05AF90DE26FBF4B4A15FAA/455942.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":42},{\"attribute\":\"Precision\",\"modifier\":30},{\"attribute\":\"Toughness\",\"modifier\":30}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23711() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orrian Royal Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Fine\",\"vendor_value\":99,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23711,\"icon\":\"https://render.guildwars2.com/file/EBCEDABB02974DF76E21F730F834C150E8A5159C/455954.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":51},{\"attribute\":\"Precision\",\"modifier\":36},{\"attribute\":\"Toughness\",\"modifier\":36}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23712() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orrian Royal Necklace\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Fine\",\"vendor_value\":132,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23712,\"icon\":\"https://render.guildwars2.com/file/0D1025316B07D66B9762B7C49D7C1B923D3817E5/455955.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":68},{\"attribute\":\"Precision\",\"modifier\":48},{\"attribute\":\"Toughness\",\"modifier\":48}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23713() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orrian Master Scholar Certificate\",\"description\":\"<c=@flavor>\\\"...awarded for examplary wisdom, research, bravado, and intelligence in the field of...\\\"</c>\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Masterwork\",\"vendor_value\":155,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23713,\"icon\":\"https://render.guildwars2.com/file/5A586EB000C6F1082A94BE736602A615382D363B/223859.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":41},{\"attribute\":\"Precision\",\"modifier\":30},{\"attribute\":\"Toughness\",\"modifier\":30}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23714() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Orrian Urn\",\"description\":\"\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Masterwork\",\"vendor_value\":155,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23714,\"icon\":\"https://render.guildwars2.com/file/9E323FFE450FD1D1B22014A8F74074ADED8015B7/455951.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":41},{\"attribute\":\"Precision\",\"modifier\":30},{\"attribute\":\"Toughness\",\"modifier\":30}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23715() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Abaddon Talisman\",\"description\":\"\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Masterwork\",\"vendor_value\":155,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23715,\"icon\":\"https://render.guildwars2.com/file/FDA1D90665A4CABB117E5D59182D0B5D0FA46802/455953.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":41},{\"attribute\":\"Precision\",\"modifier\":30},{\"attribute\":\"Vitality\",\"modifier\":30}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}