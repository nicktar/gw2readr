package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0071 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem19847() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Knight's Elder Inscription\",\"description\":\"Used in the crafting of weapons with +Toughness, +Power, and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":70,\"rarity\":\"Fine\",\"vendor_value\":15,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19847,\"icon\":\"https://render.guildwars2.com/file/DDC9D9C4D5B2033E3F407C7754D2173D00365D68/340470.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19848() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Assassin's Elder Inscription\",\"description\":\"Used in the crafting of weapons with +Precision, +Power, and +Ferocity.\",\"type\":\"CraftingMaterial\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19848,\"icon\":\"https://render.guildwars2.com/file/B8DF63EA7FF85AC302F871D85C170D14A49E3599/340471.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19849() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Berserker's Embroidered Linen Insignia\",\"description\":\"Used in the crafting of armor with +Power, +Ferocity, and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":27,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19849,\"icon\":\"https://render.guildwars2.com/file/0D94FBC50B72DE0AF1ECCB3238ABBA0EED5FD068/340472.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19850() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Berserker's Linen Insignia\",\"description\":\"Used in the crafting of armor with +Power, +Ferocity, and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":13,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19850,\"icon\":\"https://render.guildwars2.com/file/ABCDF5ED3BD10E3B0BCF48BDF094DF91C008A22A/340473.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19851() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cleric's Linen Insignia\",\"description\":\"Used in the crafting of armor with +Healing Power, +Power, and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":13,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19851,\"icon\":\"https://render.guildwars2.com/file/AC0AA09B767E4694A43FED0C751F0208573259A2/340474.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19852() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rampager's Linen Insignia\",\"description\":\"Used in the crafting of armor with +Precision, +Condition Damage, and +Power.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":13,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19852,\"icon\":\"https://render.guildwars2.com/file/0D085EC1ABD2BBD4E19A9903AFFAD50C5410F802/340475.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19853() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Assassin's Silk Insignia\",\"description\":\"Used in the crafting of armor with +Precision, +Power, and +Ferocity.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19853,\"icon\":\"https://render.guildwars2.com/file/D505471EC8D12FBED7B4233E290D0F0294075A95/434330.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19854() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Assassin's Embroidered Silk Insignia\",\"description\":\"Used in the crafting of armor with +Precision, +Power, and +Ferocity.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19854,\"icon\":\"https://render.guildwars2.com/file/080F995FFD49691DA8ADF5A914FAB0D9FF282E0C/434331.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19855() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Berserker's Embroidered Silk Insignia\",\"description\":\"Used in the crafting of armor with +Power, +Ferocity, and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19855,\"icon\":\"https://render.guildwars2.com/file/300CCAE90859C8E7985B3A71677E6BCF90FFD3F5/434332.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19856() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Valkyrie Embroidered Silk Insignia\",\"description\":\"Used in the crafting of armor with +Power, +Ferocity, and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19856,\"icon\":\"https://render.guildwars2.com/file/B6010F64B3FE0550C2F06906B7F7082BAF0A7811/434333.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19857() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rampager's Embroidered Silk Insignia\",\"description\":\"Used in the crafting of armor with +Precision, +Condition Damage, and +Power.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19857,\"icon\":\"https://render.guildwars2.com/file/0A12C514204B4F0527EA60C0E2DEFD67D705C480/434334.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19858() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Knight's Embroidered Silk Insignia\",\"description\":\"Used in the crafting of armor with +Toughness, +Power, and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19858,\"icon\":\"https://render.guildwars2.com/file/03E16D3D685C2C4A18E4D2A9E74FAF0A1772FCA1/434335.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19859() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carrion Embroidered Silk Insignia\",\"description\":\"Used in the crafting of armor with +Condition Damage, +Power, and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19859,\"icon\":\"https://render.guildwars2.com/file/D2FB4E6BEFA65F047BD378E308F1F0790A01C160/434336.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19860() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cleric's Embroidered Silk Insignia\",\"description\":\"Used in the crafting of armor with +Healing Power, +Power, and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19860,\"icon\":\"https://render.guildwars2.com/file/30694C0DD8BDE7B440AC5CEC0B28286CBC5F49AF/434337.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19861() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Berserker's Silk Insignia\",\"description\":\"Used in the crafting of armor with +Power, +Ferocity, and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19861,\"icon\":\"https://render.guildwars2.com/file/6FA245980CF6E00EFD4DB70205D6CA1002259FB3/434338.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19862() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Valkyrie Silk Insignia\",\"description\":\"Used in the crafting of armor with +Power, +Ferocity, and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":15,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19862,\"icon\":\"https://render.guildwars2.com/file/0F33DB2D56922612410DF8FCE6E73C91D24309AF/434339.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19863() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rampager's Silk Insignia\",\"description\":\"Used in the crafting of armor with +Precision, +Condition Damage, and +Power.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19863,\"icon\":\"https://render.guildwars2.com/file/633A3B97E333C03D02EA1CD301BE7C947F7BA50B/434340.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19864() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Knight's Silk Insignia\",\"description\":\"Used in the crafting of armor with +Toughness, +Power, and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19864,\"icon\":\"https://render.guildwars2.com/file/1A050F35A802E200AD6B676CF74FC2E0704441B5/434341.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19865() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carrion Silk Insignia\",\"description\":\"Used in the crafting of armor with +Condition Damage, +Power, and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":15,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19865,\"icon\":\"https://render.guildwars2.com/file/FF227534422402060EFEC8D73C6F386EE72EB9AC/434342.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19866() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cleric's Silk Insignia\",\"description\":\"Used in the crafting of armor with +Healing Power, +Power, and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19866,\"icon\":\"https://render.guildwars2.com/file/DB0B497ABFFB21F2E5D4B046017A3F5B0AA475D0/434343.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19867() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ravaging Cotton Insignia\",\"description\":\"Used in the crafting of armor with +Condition Damage and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19867,\"icon\":\"https://render.guildwars2.com/file/7AD04F5F466966B1B74D092056AE16A6D950B252/340476.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19868() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ravaging Embroidered Cotton Insignia\",\"description\":\"Used in the crafting of armor with +Condition Damage and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19868,\"icon\":\"https://render.guildwars2.com/file/C3E0C74EE02BA967F790DCEFA6FBFE01A8464A72/340477.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19869() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Healing Embroidered Jute Insignia\",\"description\":\"Used in the crafting of armor with +Healing Power.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19869,\"icon\":\"https://render.guildwars2.com/file/4F04A59C1ABF7C0FED69D1E1638001CEC60DE46A/220476.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19870() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Malign Jute Insignia\",\"description\":\"Used in the crafting of armor with +Condition Damage.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19870,\"icon\":\"https://render.guildwars2.com/file/62C05CA4D8DE042301BA0D04C9C670D25E5A5B51/220477.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19871() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Malign Embroidered Jute Insignia\",\"description\":\"Used in the crafting of armor with +Condition Damage.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19871,\"icon\":\"https://render.guildwars2.com/file/A758A09C12DF6D27276A03089A4C7ED735115FF0/220478.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}