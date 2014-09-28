package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0101 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem23361() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pet Rock\",\"description\":\"<c=@flavor>This used to be a pet for a skritt. A lonely, lonely skritt.</c>\",\"type\":\"Trinket\",\"level\":28,\"rarity\":\"Fine\",\"vendor_value\":37,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23361,\"icon\":\"https://render.guildwars2.com/file/C15F220F0B4DAAE4FEC6673B4B9E3037F9E0114A/63125.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":10},{\"attribute\":\"Power\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23362() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mining Lantern\",\"description\":\"<c=@flavor>\\\"These help for those really dark caves.\\\"<br>—Adgils</c>\",\"type\":\"Trinket\",\"level\":28,\"rarity\":\"Fine\",\"vendor_value\":37,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23362,\"icon\":\"https://render.guildwars2.com/file/C0026CEBC6551C4113B8EFDD350DE5D1CA342341/455901.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":10},{\"attribute\":\"Vitality\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23363() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Grawl Tribal Paint\",\"description\":\"<c=@flavor>\\\"I wonder why grawl like orange so much.\\\"<br>—Arcanist Aurelio Shiverpaw</c>\",\"type\":\"Trinket\",\"level\":29,\"rarity\":\"Fine\",\"vendor_value\":38,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23363,\"icon\":\"https://render.guildwars2.com/file/06DF56D8B92ADF042C5D7C42574EF62F40D1D34A/455915.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":11},{\"attribute\":\"Power\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23364() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dredge Manifesto\",\"description\":\"<c=@flavor>\\\"I find it fascinating that a blind creature can write.\\\"<br>—Rinceword</c>\",\"type\":\"Trinket\",\"level\":30,\"rarity\":\"Fine\",\"vendor_value\":39,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23364,\"icon\":\"https://render.guildwars2.com/file/AB7619ACA2CEA6AC0FC25A6BEFE864E91C59E405/66823.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":11},{\"attribute\":\"Vitality\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23365() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Order of Whispers Commendation\",\"description\":\"<c=@flavor>\\\"The order thanks you for all your help.\\\"<br>—Agent Kaukiri</c>\",\"type\":\"Trinket\",\"level\":31,\"rarity\":\"Fine\",\"vendor_value\":39,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23365,\"icon\":\"https://render.guildwars2.com/file/61BD98A8976CFF20A17F5FFB9C17215D0DABB697/66824.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":12},{\"attribute\":\"Vitality\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23366() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steam Sprocket\",\"description\":\"<c=@flavor>\\\"This is a part from a steam creature. I've studied it all I could. Maybe you'll find it more useful.\\\"<br>—Garrius</c>\",\"type\":\"Trinket\",\"level\":32,\"rarity\":\"Fine\",\"vendor_value\":40,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23366,\"icon\":\"https://render.guildwars2.com/file/A64CDE12565E07F00470D710377A5EAB5E953816/62264.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":12},{\"attribute\":\"Power\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23367() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dolyak Blanket\",\"description\":\"<c=@flavor>\\\"You need a good blanket to keep your dolyaks happy, because when they get upset no telling what will happen.\\\"<br>—Lyot</c>\",\"type\":\"Trinket\",\"level\":33,\"rarity\":\"Fine\",\"vendor_value\":42,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23367,\"icon\":\"https://render.guildwars2.com/file/76063254FF6022ED7F4A759601F84BE9F702D05F/66825.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":12},{\"attribute\":\"ConditionDamage\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23368() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Frozen Imp Heart\",\"description\":\"<c=@flavor>\\\"Very interesting that the imp's heart seems frozen but still works.\\\"<br>—Suki</c>\",\"type\":\"Trinket\",\"level\":34,\"rarity\":\"Fine\",\"vendor_value\":42,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23368,\"icon\":\"https://render.guildwars2.com/file/2DC13D5674BC1833DB03D102CAC1BF322AE01296/66826.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":13},{\"attribute\":\"Power\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23369() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Stone Summit Badge\",\"description\":\"<c=@flavor>\\\"Did they really ride dolyaks? Must have been hard work climbing up those beasts.\\\"—Leandra</c>\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Fine\",\"vendor_value\":43,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23369,\"icon\":\"https://render.guildwars2.com/file/0F69C2D7C004F3D4FCD0F3750D7AD6CFD0333014/455913.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":13},{\"attribute\":\"Power\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23370() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hardened Destroyer Core\",\"description\":\"<c=@flavor>\\\"This core has cooled, making it too hard to work with.\\\"<br>—Kruppa</c>\",\"type\":\"Trinket\",\"level\":36,\"rarity\":\"Fine\",\"vendor_value\":44,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23370,\"icon\":\"https://render.guildwars2.com/file/3EB374296D313F5C59EDDAD03F16CE0A9E5BBCC7/66827.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":14},{\"attribute\":\"Vitality\",\"modifier\":10}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23371() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Peg Leg Screw\",\"description\":\"<c=@flavor>\\\"One hit quaggan on the head.\\\"<br>—Queldip</c>\",\"type\":\"Trinket\",\"level\":36,\"rarity\":\"Fine\",\"vendor_value\":44,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23371,\"icon\":\"https://render.guildwars2.com/file/FC637AA3031B585F5B025B12670C6CD5A5C1BA51/63130.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":14},{\"attribute\":\"Power\",\"modifier\":10}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23372() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Order of Whispers Secret Message 4\",\"description\":\"<c=@flavor>\\\"31 254 13 56\\\"</c>\",\"type\":\"Trinket\",\"level\":37,\"rarity\":\"Fine\",\"vendor_value\":44,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23372,\"icon\":\"https://render.guildwars2.com/file/61BD98A8976CFF20A17F5FFB9C17215D0DABB697/66824.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":14},{\"attribute\":\"ConditionDamage\",\"modifier\":10}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23373() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Order of Whispers Secret Message 5\",\"description\":\"<c=@flavor>\\\"31 31 51 67 85\\\"</c>\",\"type\":\"Trinket\",\"level\":37,\"rarity\":\"Fine\",\"vendor_value\":44,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23373,\"icon\":\"https://render.guildwars2.com/file/61BD98A8976CFF20A17F5FFB9C17215D0DABB697/66824.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":14},{\"attribute\":\"Vitality\",\"modifier\":10}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23374() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pirate Flask\",\"description\":\"<c=@flavor>\\\"Smells like rum and body odor.\\\"—Duidda</c>\",\"type\":\"Trinket\",\"level\":37,\"rarity\":\"Fine\",\"vendor_value\":44,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23374,\"icon\":\"https://render.guildwars2.com/file/084D6ECEB001AD6C170E56B6ABCE0E69365D5ED4/63144.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":14},{\"attribute\":\"Power\",\"modifier\":10}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23375() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hunting Trophy\",\"description\":\"<c=@flavor>\\\"This was taken from a large jotun.\\\"<br>—Neida</c>\",\"type\":\"Trinket\",\"level\":38,\"rarity\":\"Fine\",\"vendor_value\":45,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23375,\"icon\":\"https://render.guildwars2.com/file/76063254FF6022ED7F4A759601F84BE9F702D05F/66825.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":15},{\"attribute\":\"Vitality\",\"modifier\":11}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23376() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ettin Speaking Bone\",\"description\":\"<c=@flavor>\\\"He who holds the speaking bone may jabber.\\\"<br>—Bramm</c>\",\"type\":\"Trinket\",\"level\":39,\"rarity\":\"Fine\",\"vendor_value\":47,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23376,\"icon\":\"https://render.guildwars2.com/file/7D22375A92039A341B79017AF3650BF00B5B9D39/65681.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":15},{\"attribute\":\"Vitality\",\"modifier\":11}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23377() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cooking Spoon\",\"description\":\"<c=@flavor>\\\"A good cook needs a trusty spoon.\\\"<br>—Hune</c>\",\"type\":\"Trinket\",\"level\":27,\"rarity\":\"Masterwork\",\"vendor_value\":70,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23377,\"icon\":\"https://render.guildwars2.com/file/6F2215EB6E98B707DA6214AABF510667A6CE6609/66821.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":11},{\"attribute\":\"ConditionDamage\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23378() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pet Rock\",\"description\":\"<c=@flavor>This used to be a pet for a skritt. A lonely, lonely skritt.</c>\",\"type\":\"Trinket\",\"level\":28,\"rarity\":\"Masterwork\",\"vendor_value\":73,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23378,\"icon\":\"https://render.guildwars2.com/file/C15F220F0B4DAAE4FEC6673B4B9E3037F9E0114A/63125.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":11},{\"attribute\":\"Vitality\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23379() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mining Lantern\",\"description\":\"<c=@flavor>\\\"These help for those really dark caves.\\\"<br>—Adgils</c>\",\"type\":\"Trinket\",\"level\":28,\"rarity\":\"Masterwork\",\"vendor_value\":73,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23379,\"icon\":\"https://render.guildwars2.com/file/C0026CEBC6551C4113B8EFDD350DE5D1CA342341/455901.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":11},{\"attribute\":\"Power\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23380() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Grawl Tribal Paint\",\"description\":\"<c=@flavor>\\\"I wonder why grawl like orange so much.\\\"<br>—Arcanist Aurelio Shiverpaw</c>\",\"type\":\"Trinket\",\"level\":29,\"rarity\":\"Masterwork\",\"vendor_value\":75,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23380,\"icon\":\"https://render.guildwars2.com/file/06DF56D8B92ADF042C5D7C42574EF62F40D1D34A/455915.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":12},{\"attribute\":\"Vitality\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23381() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dredge Manifesto\",\"description\":\"<c=@flavor>\\\"I find it fascinating that a blind creature can write.\\\"<br>—Rinceword</c>\",\"type\":\"Trinket\",\"level\":30,\"rarity\":\"Masterwork\",\"vendor_value\":78,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23381,\"icon\":\"https://render.guildwars2.com/file/AB7619ACA2CEA6AC0FC25A6BEFE864E91C59E405/66823.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":12},{\"attribute\":\"Vitality\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23382() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Order of Whispers Commendation\",\"description\":\"<c=@flavor>\\\"The order thanks you for all your help.\\\"<br>—Agent Kaukiri</c>\",\"type\":\"Trinket\",\"level\":31,\"rarity\":\"Masterwork\",\"vendor_value\":78,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23382,\"icon\":\"https://render.guildwars2.com/file/61BD98A8976CFF20A17F5FFB9C17215D0DABB697/66824.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":13},{\"attribute\":\"ConditionDamage\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23383() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steam Sprocket\",\"description\":\"<c=@flavor>\\\"This is a part from a steam creature, I've studied it all I could maybe you'll find it more useful.\\\"<br>—Garrius</c>\",\"type\":\"Trinket\",\"level\":32,\"rarity\":\"Masterwork\",\"vendor_value\":80,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23383,\"icon\":\"https://render.guildwars2.com/file/A64CDE12565E07F00470D710377A5EAB5E953816/62264.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":13},{\"attribute\":\"ConditionDamage\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23384() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dolyak Blanket\",\"description\":\"<c=@flavor>\\\"You need a good blanket to keep your Dolyaks happy, because when they get upset no telling what will happen.\\\"<br>—Lyot</c>\",\"type\":\"Trinket\",\"level\":33,\"rarity\":\"Masterwork\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23384,\"icon\":\"https://render.guildwars2.com/file/76063254FF6022ED7F4A759601F84BE9F702D05F/66825.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":14},{\"attribute\":\"Vitality\",\"modifier\":10}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23385() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Frozen Imp Heart\",\"description\":\"<c=@flavor>\\\"Very interesting that the imp's heart seems frozen but still works.\\\"<br>—Suki</c>\",\"type\":\"Trinket\",\"level\":34,\"rarity\":\"Masterwork\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23385,\"icon\":\"https://render.guildwars2.com/file/2DC13D5674BC1833DB03D102CAC1BF322AE01296/66826.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":14},{\"attribute\":\"Vitality\",\"modifier\":10}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}