package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0127 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem24098() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Devourer Egg\",\"description\":\"These eggs would be perfect source for the next generation of Drottot Lashtail's devourers!<br>Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24098,\"icon\":\"https://render.guildwars2.com/file/4A58480BE6669B605E909F44EAE64896DB030CDD/62389.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24100() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Durmand Priory Supply Container\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24100,\"icon\":\"https://render.guildwars2.com/file/900B6F07174AEFC96A664AC6115D2DABC90B06B8/66867.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24102() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Griffon Feather\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24102,\"icon\":\"https://render.guildwars2.com/file/D7A8443608F4C4FD501B25BD0D0E794097B19BAE/66833.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24103() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Harpy Gland\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24103,\"icon\":\"https://render.guildwars2.com/file/0B4FFF31B61723ECAE377D7C735EC9E815700397/66869.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24108() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cow Treat\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24108,\"icon\":\"https://render.guildwars2.com/file/3860D513FE259492F6B90EECB6675A1D520942CA/65732.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24109() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Catapult Part\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24109,\"icon\":\"https://render.guildwars2.com/file/179C606802985AD6DD5CD75EAE35053154CF2A42/65725.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24110() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elemental Lodestone\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24110,\"icon\":\"https://render.guildwars2.com/file/2DC13D5674BC1833DB03D102CAC1BF322AE01296/66826.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24113() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wurm Egg\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24113,\"icon\":\"https://render.guildwars2.com/file/08F00617B5302EE7B52550F4F6052EDFFC0BAECA/66875.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24114() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Slab of Wurm Meat\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24114,\"icon\":\"https://render.guildwars2.com/file/F5EA0A79447ED4D14B071704B4605096985CCA77/66876.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24122() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Data Core\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24122,\"icon\":\"https://render.guildwars2.com/file/6403060B50D222D6DF6B1479A34EA7930A401914/66581.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24126() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Firefly Luminescence\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24126,\"icon\":\"https://render.guildwars2.com/file/CACA50553B0899DB77E159F10493FCC95FC07046/66879.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24127() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sample of Hylek Poison\",\"description\":\"Hylek poison from the Durotl tribe that Blopp needs for his research.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24127,\"icon\":\"https://render.guildwars2.com/file/A8016DED106A6FA84D506A794EF1BAFA5B0CF8B6/63061.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24128() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Fire Opal\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24128,\"icon\":\"https://render.guildwars2.com/file/4637C1D3406AADED7DBC1E01687E3A1DAB4A04FE/62685.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24136() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Krait Skin\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24136,\"icon\":\"https://render.guildwars2.com/file/79B2099560FD1AFA3013917812666D92F31B6C14/66884.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24137() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cavern Scutter Energy\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24137,\"icon\":\"https://render.guildwars2.com/file/6BFE021904169FD0D1946297DB46BC5DB6FFD7C6/66864.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24138() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Air Elemental Essence\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24138,\"icon\":\"https://render.guildwars2.com/file/AC7104335A04D880B537183FF4BD2D7523667241/66885.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24145() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lion's Arch Supply Container\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24145,\"icon\":\"https://render.guildwars2.com/file/73090436997D49C05FAFD4462757971CADC2E6B4/63155.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24149() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pirate Outfit\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24149,\"icon\":\"https://render.guildwars2.com/file/F3AE202C03D4A4073463684A7A3CBB0D2C243DA0/66890.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24150() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Logging Tool\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24150,\"icon\":\"https://render.guildwars2.com/file/96FC4E4C22AB197862084B58923EBF18116017D5/66891.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24156() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Grub Remains\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24156,\"icon\":\"https://render.guildwars2.com/file/F855A00BF372FBF00590FED523BC7D1899B77C13/66893.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24158() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Divinity's Reach Supplies\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24158,\"icon\":\"https://render.guildwars2.com/file/666209104CCB024D53359C0EA0A299076E610771/65704.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24162() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Shiny Red Apple\",\"description\":\"Looks perfect for one of Farmer Eda's pies!<br>Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24162,\"icon\":\"https://render.guildwars2.com/file/17520D2F53CF62BFA696EDE02DA1F77445A9F796/63265.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24163() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Norn Supplies\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24163,\"icon\":\"https://render.guildwars2.com/file/09E0F46D4CCA08D8393513143CEA942FF5328074/66897.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24165() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Slab of Moa Meat\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24165,\"icon\":\"https://render.guildwars2.com/file/5334A677B308D69D0CED6B97C8154ABC7BBD12B9/66899.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24176() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dredge Helmet\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24176,\"icon\":\"https://render.guildwars2.com/file/2CAE10E25864EB0BFC040F3209AF04C639EFDD74/66906.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}