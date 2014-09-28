package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0113 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem23666() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pact Dolyak Harness\",\"description\":\"<c=@flavor>\\\"You can read between the lines. More harnesses than dolyaks.\\\"<br>—Warmaster Jofast</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Fine\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23666,\"icon\":\"https://render.guildwars2.com/file/CC2E01E0F566A6EEF4F2EC2B19AA7A3E1FEFB1B4/60984.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":42},{\"attribute\":\"Precision\",\"modifier\":30},{\"attribute\":\"Vitality\",\"modifier\":30}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23667() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pact Medal of Accommodation\",\"description\":\"<c=@flavor>\\\"We are still sorting this out and as you can see our award naming scheme could use some improvement. Thanks none the less.\\\"<br>—Lightbringer Surefoot</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Fine\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23667,\"icon\":\"https://render.guildwars2.com/file/AB0317DF5B0E1BA47436A5420248660765154C08/62864.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":42},{\"attribute\":\"Precision\",\"modifier\":30},{\"attribute\":\"Toughness\",\"modifier\":30}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23668() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Smuggled Contraband\",\"description\":\"<c=@flavor>\\\"Share and share alike. Sometimes a person needs a little more—uh—motivation, to be of the giving sort.\\\"<br>—Maakel The Immortal</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Fine\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23668,\"icon\":\"https://render.guildwars2.com/file/CC2E01E0F566A6EEF4F2EC2B19AA7A3E1FEFB1B4/60984.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":42},{\"attribute\":\"Precision\",\"modifier\":30},{\"attribute\":\"Vitality\",\"modifier\":30}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23669() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pact Shell Casing\",\"description\":\"<c=@flavor>\\\"I have one thing to say to Zhaitan. Boom.\\\"<br>—Warmaster Chan</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Fine\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23669,\"icon\":\"https://render.guildwars2.com/file/589E277B72CD73BEFF06B299EBB5FBD93F1B4D1F/63607.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":42},{\"attribute\":\"Precision\",\"modifier\":30},{\"attribute\":\"Vitality\",\"modifier\":30}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23670() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pact Medal Of Recognition\",\"description\":\"<c=@flavor>\\\"For a hero. Your hardwork will not be forgotten.\\\"<br>—Keeper Jonez Deadrun</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Fine\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23670,\"icon\":\"https://render.guildwars2.com/file/64B50BFCE210C96DBDA5405394DD913A2155DC98/66839.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":42},{\"attribute\":\"Precision\",\"modifier\":30},{\"attribute\":\"Vitality\",\"modifier\":30}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23671() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pact Medal Of Valor\",\"description\":\"<c=@flavor>\\\"The Pact recognizes your valor in combat.\\\"<br>—Tactician Coehl</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Fine\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23671,\"icon\":\"https://render.guildwars2.com/file/A1B34EE0F99DF12B533EC52740DA0CBE55D9F39B/66436.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":42},{\"attribute\":\"Precision\",\"modifier\":30},{\"attribute\":\"Toughness\",\"modifier\":30}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23672() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lucky Rabbit's Foot\",\"description\":\"<c=@flavor>\\\"Poor rabbits. We will need more of this luck if we are to succeed.\\\"<br>—Lightbringer Ives</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23672,\"icon\":\"https://render.guildwars2.com/file/FA53FDE67AB9FE0D6632301269ECA119AD4809DF/66782.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":46},{\"attribute\":\"Precision\",\"modifier\":33},{\"attribute\":\"Toughness\",\"modifier\":33}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23673() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hardened Tar Elemental Core\",\"description\":\"<c=@flavor>\\\"We finally got it to harden! Now we just need to figure out...you know...what to do with it.\\\"<br>—Scholar Merla</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23673,\"icon\":\"https://render.guildwars2.com/file/CD641E313C19ACDDAE34CDC52B48181EC763089F/63110.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":46},{\"attribute\":\"Toughness\",\"modifier\":33},{\"attribute\":\"Vitality\",\"modifier\":33}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23674() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pact Sextant\",\"description\":\"<c=@flavor>\\\"Together.\\\"<br>—Pact Motto</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23674,\"icon\":\"https://render.guildwars2.com/file/F3BEB3B77A2B25D3687675021B99EF3E0CCF6AE9/66837.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":46},{\"attribute\":\"Precision\",\"modifier\":33},{\"attribute\":\"Vitality\",\"modifier\":33}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23675() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Orrian Spoon\",\"description\":\"<c=@flavor>\\\"Seems they had fancy spoons too. Well, that answers that question.\\\"<br>—Tactician Almonia</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23675,\"icon\":\"https://render.guildwars2.com/file/6B5A2D46DBDF9E100FD33909466FA3D46801EC31/434524.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":46},{\"attribute\":\"Toughness\",\"modifier\":33},{\"attribute\":\"Vitality\",\"modifier\":33}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23676() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Smashed Golem Crystal\",\"description\":\"<c=@flavor>\\\"These still have a little risidual arcane energy. We are going to need every little magical scrap and crumb to defeat Zhaitan.\\\"<br>—Scholar Blix</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23676,\"icon\":\"https://render.guildwars2.com/file/BF37B370A2F404A9DBCF773CB7CF536C6A543901/220900.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":46},{\"attribute\":\"Toughness\",\"modifier\":33},{\"attribute\":\"Vitality\",\"modifier\":33}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23677() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pact Dolyak Harness\",\"description\":\"<c=@flavor>\\\"You can read between the lines. More harnesses than Dolyaks.\\\"<br>—Warmaster Jofast</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23677,\"icon\":\"https://render.guildwars2.com/file/CC2E01E0F566A6EEF4F2EC2B19AA7A3E1FEFB1B4/60984.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":46},{\"attribute\":\"Precision\",\"modifier\":33},{\"attribute\":\"Vitality\",\"modifier\":33}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23678() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pact Medal of Accommodation\",\"description\":\"<c=@flavor>\\\"We are still sorting this out and as you can see our award naming scheme could use some improvement. Thanks none the less.\\\"<br>—Lightbringer Surefoot</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23678,\"icon\":\"https://render.guildwars2.com/file/AB0317DF5B0E1BA47436A5420248660765154C08/62864.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":46},{\"attribute\":\"Precision\",\"modifier\":33},{\"attribute\":\"Toughness\",\"modifier\":33}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23679() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Smuggled Contraband\",\"description\":\"<c=@flavor>\\\"Share and share alike. Sometimes a person needs a little more—uh—motivation, to be of the giving sort.\\\"<br>—Maakel The Immortal</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23679,\"icon\":\"https://render.guildwars2.com/file/CC2E01E0F566A6EEF4F2EC2B19AA7A3E1FEFB1B4/60984.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":46},{\"attribute\":\"Precision\",\"modifier\":33},{\"attribute\":\"Vitality\",\"modifier\":33}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23680() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pact Shell Casing\",\"description\":\"<c=@flavor>\\\"I have one thing to say to Zhaitan. Boom.\\\"<br>—Warmaster Chan</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23680,\"icon\":\"https://render.guildwars2.com/file/589E277B72CD73BEFF06B299EBB5FBD93F1B4D1F/63607.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":46},{\"attribute\":\"Precision\",\"modifier\":33},{\"attribute\":\"Vitality\",\"modifier\":33}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23681() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pact Medal Of Recognition\",\"description\":\"<c=@flavor>\\\"For a hero. Your hardwork will not be forgotten.\\\"<br>—Keeper Jonez Deadrun</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23681,\"icon\":\"https://render.guildwars2.com/file/64B50BFCE210C96DBDA5405394DD913A2155DC98/66839.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":46},{\"attribute\":\"Precision\",\"modifier\":33},{\"attribute\":\"Vitality\",\"modifier\":33}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23682() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pact Medal Of Valor\",\"description\":\"<c=@flavor>\\\"The Pact recognizes your valor in combat.\\\"<br>—Tactician Coehl</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23682,\"icon\":\"https://render.guildwars2.com/file/A1B34EE0F99DF12B533EC52740DA0CBE55D9F39B/66436.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":46},{\"attribute\":\"Precision\",\"modifier\":33},{\"attribute\":\"Toughness\",\"modifier\":33}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23683() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pact Invasion Battle Plan\",\"description\":\"<c=@flavor>\\\"I'm surprised this survived first contact with the enemy.\\\"<br>—Magister Pagga</c>\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":78,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23683,\"icon\":\"https://render.guildwars2.com/file/4BF50B0F80D6C20115B7DEB77A6B120435F4A694/222610.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":38},{\"attribute\":\"Precision\",\"modifier\":27},{\"attribute\":\"Vitality\",\"modifier\":27}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23684() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wren Trading Coin\",\"description\":\"<c=@flavor>\\\"They used these to trade goods a long time ago. Sometimes its easy to forget these used to be people.\\\"<br>—Lightbringer Zykk</c>\",\"type\":\"Trinket\",\"level\":77,\"rarity\":\"Fine\",\"vendor_value\":79,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23684,\"icon\":\"https://render.guildwars2.com/file/CD641E313C19ACDDAE34CDC52B48181EC763089F/63110.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":40},{\"attribute\":\"Toughness\",\"modifier\":28},{\"attribute\":\"Vitality\",\"modifier\":28}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23685() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Light Of Doric\",\"description\":\"<c=@flavor>\\\"Stories tell of a procession of lights through this area. It must have been beautiful with lights such as these.\\\"<br>—Keeper Lyrda</c>\",\"type\":\"Trinket\",\"level\":79,\"rarity\":\"Fine\",\"vendor_value\":82,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23685,\"icon\":\"https://render.guildwars2.com/file/F3BEB3B77A2B25D3687675021B99EF3E0CCF6AE9/66837.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":41},{\"attribute\":\"Precision\",\"modifier\":30},{\"attribute\":\"Vitality\",\"modifier\":30}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23686() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Intercepted Inquest Calculations\",\"description\":\"<c=@flavor>\\\"(X, R(x,z) ≥ min(R(x,y),R(y,z) - X, A(x*y) ≥ min(A(x),B(x))) + A(x*y−1) ≥ min(A(x),A(y−1))\\\"</c>\",\"type\":\"Trinket\",\"level\":79,\"rarity\":\"Fine\",\"vendor_value\":82,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23686,\"icon\":\"https://render.guildwars2.com/file/6F2215EB6E98B707DA6214AABF510667A6CE6609/66821.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":41},{\"attribute\":\"Precision\",\"modifier\":30},{\"attribute\":\"Toughness\",\"modifier\":30}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23687() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orrian Pottery Shard\",\"description\":\"<c=@flavor>The historical significance of this shard barely makes up for its pungent odor.</c>\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":78,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23687,\"icon\":\"https://render.guildwars2.com/file/EB2AF7C99C3CFF4B28536162CEB334C528FC4CA0/455945.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":38},{\"attribute\":\"Precision\",\"modifier\":27},{\"attribute\":\"Toughness\",\"modifier\":27}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23688() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Magical Orrian Lure\",\"description\":\"<c=@flavor>\\\"So magical the fish catch it.\\\"</c>\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":78,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23688,\"icon\":\"https://render.guildwars2.com/file/CC2E01E0F566A6EEF4F2EC2B19AA7A3E1FEFB1B4/60984.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":38},{\"attribute\":\"Precision\",\"modifier\":27},{\"attribute\":\"Toughness\",\"modifier\":27}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23689() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Submarine Periscope Lens\",\"description\":\"<c=@flavor>\\\"It fell out and we can't get it back in...\\\"<br>—Nessa</c>\",\"type\":\"Trinket\",\"level\":78,\"rarity\":\"Fine\",\"vendor_value\":80,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23689,\"icon\":\"https://render.guildwars2.com/file/59599A7105A7777E64667F6D591E9721ADB3E6D3/455946.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":41},{\"attribute\":\"Precision\",\"modifier\":29},{\"attribute\":\"Vitality\",\"modifier\":29}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23690() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Order of Whispers Secret Code\",\"description\":\"<c=@flavor>\\\"Asura, Orrian, Local, Attack\\\"</c>\",\"type\":\"Trinket\",\"level\":79,\"rarity\":\"Fine\",\"vendor_value\":82,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23690,\"icon\":\"https://render.guildwars2.com/file/CC2E01E0F566A6EEF4F2EC2B19AA7A3E1FEFB1B4/60984.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":41},{\"attribute\":\"Toughness\",\"modifier\":30},{\"attribute\":\"Vitality\",\"modifier\":30}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}