package de.getsetsociety.gw2readr.v1.item.items;

import static de.getsetsociety.gw2readr.v0.item.items.enums.ItemFlags.ACCOUNT_BIND_ON_USE;
import static de.getsetsociety.gw2readr.v0.item.items.enums.ItemFlags.ACCOUNT_BOUND;
import static de.getsetsociety.gw2readr.v0.item.items.enums.ItemFlags.DELETE_WARNING;
import static de.getsetsociety.gw2readr.v0.item.items.enums.ItemFlags.NO_MYSTIC_FORGE;
import static de.getsetsociety.gw2readr.v0.item.items.enums.ItemFlags.NO_SALVAGE;
import static de.getsetsociety.gw2readr.v0.item.items.enums.ItemFlags.NO_SELL;
import static de.getsetsociety.gw2readr.v0.item.items.enums.ItemFlags.NO_UNDERWATER;
import static de.getsetsociety.gw2readr.v0.item.items.enums.ItemFlags.SOUL_BIND_ON_ACQUIRE;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.ObjectMapperProvider;
import de.getsetsociety.gw2readr.v0.item.items.enums.ConsumableType;
import de.getsetsociety.gw2readr.v0.item.items.enums.Rarity;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IConsumable;
import de.getsetsociety.gw2readr.v1.item.items.json.ConsumableJson;
import de.getsetsociety.gw2readr.v1.item.items.json.ItemJson;


public class ConsumableTest {

    private ObjectMapper mapper = ObjectMapperProvider.getMapper();

    @Test
    public void testConsumableUnlock067224() {
        String content = "{\"item_id\":\"67224\",\"name\":\"Recipe: Hylek Maintenance Oil\",\"type\":\"Consumable\",\"level\":\"0\",\"rarity\":\"Masterwork\",\"vendor_value\":\"0\",\"icon_file_id\":\"849374\",\"icon_file_signature\":\"E19734B71C949924A1353106E513DE62729A5313\",\"game_types\":[\"Dungeon\",\n\"Pve\",\n\"PvpLobby\"],\"flags\":[\"AccountBound\",\n\"NoMysticForge\",\n\"NoSalvage\",\n\"NoSell\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"consumable\":{\"type\":\"Unlock\",\"unlock_type\":\"CraftingRecipe\",\"recipe_id\":\"9802\"}}";
        try {
	        ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
	        assertThat(itemJson, not(nullValue()));
	        assertThat(itemJson, instanceOf(ConsumableJson.class));
	        IConsumable item = (IConsumable) itemJson.getEntity();
	        assertThat(item.getId(), is(67224));
	        assertThat(item.getAvailableInActivity(), is(false));
	        assertThat(item.getAvailableInDungeon(), is(true));
	        assertThat(item.getAvailableInPvE(), is(true));
	        assertThat(item.getAvailableInPvP(), is(false));
	        assertThat(item.getAvailableInPvPLobby(), is(true));
	        assertThat(item.getAvailableInWvW(), is(false));
	        assertNull(item.getDescription());
	        assertThat(item.getName(), is("Recipe: Hylek Maintenance Oil"));
	        assertThat(item.getLevel(), is(0));
	        assertThat(item.getVendorValue(), is(0));
	        assertThat(item.getRarity(), is(Rarity.MASTERWORK));
	        assertThat(item.getFlags(), hasSize(5));
	        assertThat(item.getFlags(), hasItems(NO_SALVAGE, ACCOUNT_BIND_ON_USE, NO_SELL, ACCOUNT_BOUND, NO_MYSTIC_FORGE));
	        assertThat(item.getRestrictions(), empty());
	        assertNull(item.getDurationMs());
	        assertThat(item.getRecipeId(), is(9802));
	        assertNull(item.getColorId());
	        assertThat(item.getConsumableType(), is(ConsumableType.Unlock));
        } catch (Exception e) {
	        e.printStackTrace();
	        fail("Unexpected Exception");
        }
    }

	@Test
	public void testZodiacHeavyPauldronSkin() throws IOException {
		ItemJson<?> itemJson = mapper.readValue(getClass().getResource("ZodiacHeavyPauldronSkin.json"), ItemJson.class);
		assertThat(itemJson, not(nullValue()));
		assertThat(itemJson, instanceOf(ConsumableJson.class));
		IConsumable item = (IConsumable) itemJson.getEntity();
		assertThat(item.getId(), is(43030));
		assertThat(item.getAvailableInActivity(), is(true));
		assertThat(item.getAvailableInDungeon(), is(true));
		assertThat(item.getAvailableInPvE(), is(true));
		assertThat(item.getAvailableInPvP(), is(false));
		assertThat(item.getAvailableInPvPLobby(), is(true));
		assertThat(item.getAvailableInWvW(), is(true));
		assertThat(item.getDescription(), is("Double-click to apply this look to any other heavy shoulders."));
		assertThat(item.getName(), is("Zodiac Heavy Pauldron Skin"));
		assertThat(item.getLevel(), is(0));
		assertThat(item.getVendorValue(), is(0));
		assertThat(item.getRarity(), is(Rarity.RARE));
		assertThat(item.getFlags(), hasSize(6));
		assertThat(item.getFlags(), hasItems(ACCOUNT_BOUND, NO_MYSTIC_FORGE, NO_SALVAGE, NO_SELL, DELETE_WARNING, ACCOUNT_BIND_ON_USE));
		assertThat(item.getRestrictions(), empty());
		assertNull(item.getDurationMs());
		assertNull(item.getRecipeId());
		assertNull(item.getColorId());
		assertThat(item.getConsumableType(), is(ConsumableType.Transmutation));
	}

	@Test
	public void testConsumableFood012438() {
		String content = "{\"item_id\":\"12438\",\"name\":\"Roasted Parsnip\",\"type\":\"Consumable\",\"level\":\"60\",\"rarity\":\"Fine\",\"vendor_value\":\"28\",\"icon_file_id\":\"433631\",\"icon_file_signature\":\"9BDEC1C190259D0D27C727621C4E0853EEE84726\",\"game_types\":[\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"consumable\":{\"type\":\"Food\",\"duration_ms\":\"1800000\",\"description\":\"-36% Stun Duration\n+60 Toughness\n+10% Experience from Kills\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertThat(itemJson, not(nullValue()));
			assertThat(itemJson, instanceOf(ConsumableJson.class));
			IConsumable item = (IConsumable) itemJson.getEntity();
			assertThat(item.getId(), is(12438));
			assertThat(item.getAvailableInActivity(), is(false));
			assertThat(item.getAvailableInDungeon(), is(true));
			assertThat(item.getAvailableInPvE(), is(true));
			assertThat(item.getAvailableInPvP(), is(false));
			assertThat(item.getAvailableInPvPLobby(), is(false));
			assertThat(item.getAvailableInWvW(), is(true));
			assertThat(item.getDescription(), is("-36% Stun Duration\n+60 Toughness\n+10% Experience from Kills"));
			assertThat(item.getName(), is("Roasted Parsnip"));
			assertThat(item.getLevel(), is(60));
			assertThat(item.getVendorValue(), is(28));
			assertThat(item.getRarity(), is(Rarity.FINE));
			assertThat(item.getFlags(), hasSize(1));
			assertThat(item.getFlags(), hasItems(NO_SELL));
			assertThat(item.getRestrictions(), empty());
			assertThat(item.getDurationMs(), is(1800000));
			assertNull(item.getRecipeId());
			assertNull(item.getColorId());
			assertThat(item.getConsumableType(), is(ConsumableType.Food));
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
	}

	@Test
	public void testConsumableGeneric020328() throws IOException {
		ItemJson<?> itemJson = mapper.readValue(getClass().getResource("OwlTonic.json"), ItemJson.class);
		assertThat(itemJson, not(nullValue()));
		assertThat(itemJson, instanceOf(ConsumableJson.class));
		IConsumable item = (IConsumable) itemJson.getEntity();
		assertThat(item.getId(), is(20328));
		assertThat(item.getAvailableInActivity(), is(false));
		assertThat(item.getAvailableInDungeon(), is(true));
		assertThat(item.getAvailableInPvE(), is(true));
		assertThat(item.getAvailableInPvP(), is(false));
		assertThat(item.getAvailableInPvPLobby(), is(true));
		assertThat(item.getAvailableInWvW(), is(true));
		assertThat(item.getDescription(), is("Double-click to drink, transforming you into an animal for fifteen minutes. You will be unable to fight while transformed."));
		assertThat(item.getName(), is("Owl Tonic"));
		assertThat(item.getLevel(), is(0));
		assertThat(item.getVendorValue(), is(0));
		assertThat(item.getRarity(), is(Rarity.BASIC));
		assertThat(item.getFlags(), hasSize(5));
		assertThat(item.getFlags(), hasItems(ACCOUNT_BIND_ON_USE, NO_SELL, NO_UNDERWATER, ACCOUNT_BOUND));
		assertThat(item.getRestrictions(), empty());
		assertNull(item.getDurationMs());
		assertNull(item.getRecipeId());
		assertNull(item.getColorId());
		assertThat(item.getConsumableType(), is(ConsumableType.Generic));
	}

	@Test
	public void testArtisanTuningCrystal() throws IOException {
		ItemJson<?> itemJson = mapper.readValue(getClass().getResource("ArtisanTuningCrystal.json"), ItemJson.class);
		assertThat(itemJson, not(nullValue()));
		assertThat(itemJson, instanceOf(ConsumableJson.class));
		IConsumable item = (IConsumable) itemJson.getEntity();
		assertThat(item.getId(), is(9472));
		assertThat(item.getName(), is("Artisan Tuning Crystal"));
		assertThat(item.getLevel(), is(45));
		assertThat(item.getRarity(), is(Rarity.FINE));
		assertThat(item.getVendorValue(), is(23));
		assertThat(item.getAvailableInActivity(), is(false));
		assertThat(item.getAvailableInDungeon(), is(true));
		assertThat(item.getAvailableInPvE(), is(true));
		assertThat(item.getAvailableInPvP(), is(false));
		assertThat(item.getAvailableInPvPLobby(), is(false));
		assertThat(item.getAvailableInWvW(), is(true));
		assertThat(item.getDescription(), is("Gain Condition Damage Equal to 2% of Your Precision\nGain Condition Damage Equal to 3% of Your Expertise\n+10% Experience from Kills"));
		assertThat(item.getFlags(), empty());
		assertThat(item.getRestrictions(), empty());
		assertThat(item.getDurationMs(), is(1800000));
		assertNull(item.getRecipeId());
		assertNull(item.getColorId());
		assertThat(item.getConsumableType(), is(ConsumableType.Utility));
	}

	@Test
	public void testConsumableBooze008583() {
		String content = "{\"item_id\":\"8583\",\"name\":\"Jug of Hard Apple Cider\",\"type\":\"Consumable\",\"level\":\"0\",\"rarity\":\"Basic\",\"vendor_value\":\"2\",\"icon_file_id\":\"63060\",\"icon_file_signature\":\"9995D3ED4F139D289C02C258C1F6953B2742173A\",\"game_types\":[\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[],\"restrictions\":[],\"consumable\":{\"type\":\"Booze\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertThat(itemJson, not(nullValue()));
			assertThat(itemJson, instanceOf(ConsumableJson.class));
			IConsumable item = (IConsumable) itemJson.getEntity();
			assertThat(item.getId(), is(8583));
			assertThat(item.getAvailableInActivity(), is(false));
			assertThat(item.getAvailableInDungeon(), is(true));
			assertThat(item.getAvailableInPvE(), is(true));
			assertThat(item.getAvailableInPvP(), is(false));
			assertThat(item.getAvailableInPvPLobby(), is(false));
			assertThat(item.getAvailableInWvW(), is(true));
			assertNull(item.getDescription());
			assertThat(item.getName(), is("Jug of Hard Apple Cider"));
			assertThat(item.getLevel(), is(0));
			assertThat(item.getVendorValue(), is(2));
			assertThat(item.getRarity(), is(Rarity.BASIC));
			assertThat(item.getFlags(), empty());
			assertThat(item.getRestrictions(), empty());
			assertNull(item.getDurationMs());
			assertNull(item.getRecipeId());
			assertNull(item.getColorId());
			assertThat(item.getConsumableType(), is(ConsumableType.Booze));
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
	}

	@Test
	public void testRejuvenationBooster() throws IOException {
		ItemJson<?> itemJson = mapper.readValue(getClass().getResource("RejuvenationBooster.json"), ItemJson.class);
		assertThat(itemJson, not(nullValue()));
		assertThat(itemJson, instanceOf(ConsumableJson.class));
		IConsumable item = (IConsumable) itemJson.getEntity();
		assertThat(item.getId(), is(8459));
		assertThat(item.getAvailableInActivity(), is(false));
		assertThat(item.getAvailableInDungeon(), is(true));
		assertThat(item.getAvailableInPvE(), is(true));
		assertThat(item.getAvailableInPvP(), is(false));
		assertThat(item.getAvailableInPvPLobby(), is(false));
		assertThat(item.getAvailableInWvW(), is(true));
		assertThat(item.getDescription(), is("Regenerate health.\n<c=@reminder>Will be removed if you enter competitive PvP or a raid.</c>"));
		assertThat(item.getName(), is("Rejuvenation Booster"));
		assertThat(item.getLevel(), is(0));
		assertThat(item.getVendorValue(), is(0));
		assertThat(item.getRarity(), is(Rarity.MASTERWORK));
		assertThat(item.getFlags(), hasItems(NO_SALVAGE, ACCOUNT_BIND_ON_USE, NO_SELL, ACCOUNT_BOUND, NO_MYSTIC_FORGE, DELETE_WARNING));
		assertThat(item.getRestrictions(), empty());
		assertThat(item.getDurationMs(), is(3600000));
		assertNull(item.getRecipeId());
		assertNull(item.getColorId());
		assertThat(item.getConsumableType(), is(ConsumableType.Immediate));
	}

	@Test
	public void testConsumableHalloween020015() {
		String content = "{\"item_id\":\"20015\",\"name\":\"Speed Booster\",\"description\":\"Double-click to gain a buff that increases your speed by 15% for one hour.\",\"type\":\"Consumable\",\"level\":\"0\",\"rarity\":\"Masterwork\",\"vendor_value\":\"0\",\"icon_file_id\":\"434414\",\"icon_file_signature\":\"084BE7C2740C735DEA6F0FA4A6C4CA0639B49F4B\",\"game_types\":[\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"NoSell\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"consumable\":{\"type\":\"Halloween\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertThat(itemJson, not(nullValue()));
			assertThat(itemJson, instanceOf(ConsumableJson.class));
			IConsumable item = (IConsumable) itemJson.getEntity();
			assertThat(item.getId(), is(20015));
			assertThat(item.getAvailableInActivity(), is(false));
			assertThat(item.getAvailableInDungeon(), is(true));
			assertThat(item.getAvailableInPvE(), is(true));
			assertThat(item.getAvailableInPvP(), is(false));
			assertThat(item.getAvailableInPvPLobby(), is(false));
			assertThat(item.getAvailableInWvW(), is(true));
			assertThat(item.getDescription(), is("Double-click to gain a buff that increases your speed by 15% for one hour."));
			assertThat(item.getName(), is("Speed Booster"));
			assertThat(item.getLevel(), is(0));
			assertThat(item.getVendorValue(), is(0));
			assertThat(item.getRarity(), is(Rarity.MASTERWORK));
			assertThat(item.getFlags(), hasSize(3));
			assertThat(item.getFlags(), hasItems(ACCOUNT_BIND_ON_USE, NO_SELL, ACCOUNT_BOUND));
			assertThat(item.getRestrictions(), empty());
			assertNull(item.getDurationMs());
			assertNull(item.getRecipeId());
			assertNull(item.getColorId());
			assertThat(item.getConsumableType(), is(ConsumableType.Halloween));
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
	}

	@Test
	public void testConsumableAppearanceChange036285() {
		String content = "{\"item_id\":\"36285\",\"name\":\"Total Makeover Kit\",\"description\":\"Double-click to modify your appearance: height, physique, skin color, markings, face, hair, even gender. Race and profession will remain the same. This kit is consumed on accepting a new appearance.\",\"type\":\"Consumable\",\"level\":\"0\",\"rarity\":\"Masterwork\",\"vendor_value\":\"8\",\"icon_file_id\":\"495503\",\"icon_file_signature\":\"91BD906F3DB001B01D18B505CC0C9920C4451E97\",\"game_types\":[\"Dungeon\",\n\"Pve\",\n\"PvpLobby\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"NoMysticForge\",\n\"NoSalvage\",\n\"NoSell\",\n\"SoulbindOnAcquire\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"consumable\":{\"type\":\"AppearanceChange\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertThat(itemJson, not(nullValue()));
			assertThat(itemJson, instanceOf(ConsumableJson.class));
			IConsumable item = (IConsumable) itemJson.getEntity();
			assertThat(item.getId(), is(36285));
			assertThat(item.getAvailableInActivity(), is(false));
			assertThat(item.getAvailableInDungeon(), is(true));
			assertThat(item.getAvailableInPvE(), is(true));
			assertThat(item.getAvailableInPvP(), is(false));
			assertThat(item.getAvailableInPvPLobby(), is(true));
			assertThat(item.getAvailableInWvW(), is(true));
			assertThat(item.getDescription(), is("Double-click to modify your appearance: height, physique, skin color, markings, face, hair, even gender. Race and profession will remain the same. This kit is consumed on accepting a new appearance."));
			assertThat(item.getName(), is("Total Makeover Kit"));
			assertThat(item.getLevel(), is(0));
			assertThat(item.getVendorValue(), is(8));
			assertThat(item.getRarity(), is(Rarity.MASTERWORK));
			assertThat(item.getFlags(), hasSize(6));
			assertThat(item.getFlags(), hasItems(NO_SALVAGE, ACCOUNT_BIND_ON_USE, NO_SELL, SOUL_BIND_ON_ACQUIRE, ACCOUNT_BOUND, NO_MYSTIC_FORGE));
			assertThat(item.getRestrictions(), empty());
			assertNull(item.getDurationMs());
			assertNull(item.getRecipeId());
			assertNull(item.getColorId());
			assertThat(item.getConsumableType(), is(ConsumableType.AppearanceChange));
		} catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testConsumableContractNpc020018() {
        String content = "{\"item_id\":\"20018\",\"name\":\"Merchant Express\",\"description\":\"Double-click to summon a Black Lion Merchant for 15 minutes, allowing you and your allies to access basic supplies and sell loot. Single-use.\",\"type\":\"Consumable\",\"level\":\"0\",\"rarity\":\"Fine\",\"vendor_value\":\"4\",\"icon_file_id\":\"220570\",\"icon_file_signature\":\"400957BB0BA4670F08DA58CC26C33F910C2B16B6\",\"game_types\":[\"Dungeon\",\n\"Pve\",\n\"PvpLobby\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"NoSalvage\",\n\"NoSell\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"consumable\":{\"type\":\"ContractNpc\"}}";
        try {
	        ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
	        assertThat(itemJson, not(nullValue()));
	        assertThat(itemJson, instanceOf(ConsumableJson.class));
	        IConsumable item = (IConsumable) itemJson.getEntity();
	        assertThat(item.getId(), is(20018));
	        assertThat(item.getAvailableInActivity(), is(false));
	        assertThat(item.getAvailableInDungeon(), is(true));
	        assertThat(item.getAvailableInPvE(), is(true));
	        assertThat(item.getAvailableInPvP(), is(false));
	        assertThat(item.getAvailableInPvPLobby(), is(true));
	        assertThat(item.getAvailableInWvW(), is(true));
	        assertThat(item.getDescription(), is("Double-click to summon a Black Lion Merchant for 15 minutes, allowing you and your allies to access basic supplies and sell loot. Single-use."));
	        assertThat(item.getName(), is("Merchant Express"));
	        assertThat(item.getLevel(), is(0));
	        assertThat(item.getVendorValue(), is(4));
	        assertThat(item.getRarity(), is(Rarity.FINE));
	        assertThat(item.getFlags(), hasSize(4));
	        assertThat(item.getFlags(), hasItems(NO_SALVAGE, ACCOUNT_BIND_ON_USE, NO_SELL, ACCOUNT_BOUND));
	        assertThat(item.getRestrictions(), empty());
	        assertNull(item.getDurationMs());
	        assertNull(item.getRecipeId());
	        assertNull(item.getColorId());
	        assertThat(item.getConsumableType(), is(ConsumableType.ContractNpc));
        } catch (Exception e) {
	        e.printStackTrace();
	        fail("Unexpected Exception");
        }
    }

	@Test
	public void testConsumableUpgradeRemoval020349() throws IOException {
		String content = "{\"item_id\":\"20349\",\"name\":\"Upgrade Extractor\",\"description\":\"This tool will remove the upgrades from any item, without destroying either the upgrade or the item.\",\"type\":\"Consumable\",\"level\":\"0\",\"rarity\":\"Fine\",\"vendor_value\":\"0\",\"icon_file_id\":\"674829\",\"icon_file_signature\":\"0E92A458B335144232EB357A3C96DB273B09AD3B\",\"game_types\":[\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"NoMysticForge\",\n\"NoSell\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"consumable\":{\"type\":\"UpgradeRemoval\"}}";
		ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
		assertThat(itemJson, not(nullValue()));
		assertThat(itemJson, instanceOf(ConsumableJson.class));
		IConsumable item = (IConsumable) itemJson.getEntity();
		assertThat(item.getId(), is(20349));
		assertThat(item.getAvailableInActivity(), is(false));
		assertThat(item.getAvailableInDungeon(), is(true));
		assertThat(item.getAvailableInPvE(), is(true));
		assertThat(item.getAvailableInPvP(), is(false));
		assertThat(item.getAvailableInPvPLobby(), is(false));
		assertThat(item.getAvailableInWvW(), is(true));
		assertThat(item.getDescription(), is("This tool will remove the upgrades from any item, without destroying either the upgrade or the item."));
		assertThat(item.getName(), is("Upgrade Extractor"));
		assertThat(item.getLevel(), is(0));
		assertThat(item.getVendorValue(), is(0));
		assertThat(item.getRarity(), is(Rarity.FINE));
		assertThat(item.getFlags(), hasSize(4));
		assertThat(item.getFlags(), hasItems(ACCOUNT_BIND_ON_USE, NO_SELL, ACCOUNT_BOUND, NO_MYSTIC_FORGE));
		assertThat(item.getRestrictions(), empty());
		assertNull(item.getDurationMs());
		assertNull(item.getRecipeId());
		assertNull(item.getColorId());
		assertThat(item.getConsumableType(), is(ConsumableType.UpgradeRemoval));
	}

	@Test
	public void testBloodOrgange73351() throws IOException {
		String content = "{\"item_id\":\"73351\",\"name\":\"Blood Orange\",\"description\":\"<c=@flavor>A pirate needs her vitamin C, lest she get scurvy.<c>\",\"type\":\"Consumable\",\"level\":\"45\",\"rarity\":\"Exotic\",\"vendor_value\":\"90\",\"icon_file_id\":\"1205379\",\"icon_file_signature\":\"ADAB49FE33C2190245B3B331E59AADF21CAF591B\",\"upgrade_recipes\":[],\"game_types\":[\"Activity\",\"Wvw\",\"Dungeon\",\"Pve\"],\"flags\":[\"AccountBound\",\"DeleteWarning\",\"AccountBindOnUse\"],\"restrictions\":[],\"consumable\":{\"type\":\"Food\",\"duration_ms\":\"900000\",\"apply_count\":1,\"name\":\"Nourishment\",\"icon\":{\"file_id\":436367,\"signature\":\"779D3F0ABE5B46C09CFC57374DA8CC3A495F291C\"},\"description\":\"+100 Expertise\\n+70 Condition Damage\\n+10% Experience from Kills\"}}";
		ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
		assertThat(itemJson, not(nullValue()));
		assertThat(itemJson, instanceOf(ConsumableJson.class));
		IConsumable item = (IConsumable) itemJson.getEntity();
		assertThat(item.getId(), is(73351));
		assertThat(item.getAvailableInActivity(), is(true));
		assertThat(item.getAvailableInDungeon(), is(true));
		assertThat(item.getAvailableInPvE(), is(true));
		assertThat(item.getAvailableInPvP(), is(false));
		assertThat(item.getAvailableInPvPLobby(), is(false));
		assertThat(item.getAvailableInWvW(), is(true));
		assertThat(item.getDescription(), is("+100 Expertise\n+70 Condition Damage\n+10% Experience from Kills"));
		assertThat(item.getName(), is("Blood Orange"));
		assertThat(item.getLevel(), is(45));
		assertThat(item.getVendorValue(), is(90));
		assertThat(item.getRarity(), is(Rarity.EXOTIC));
		assertThat(item.getFlags(), hasSize(3));
		assertThat(item.getFlags(), hasItems(ACCOUNT_BIND_ON_USE, ACCOUNT_BOUND, DELETE_WARNING));
		assertThat(item.getRestrictions(), empty());
		assertThat(item.getDurationMs(), is(900000));
		assertNull(item.getRecipeId());
		assertNull(item.getColorId());
		assertThat(item.getConsumableType(), is(ConsumableType.Food));
		assertThat(item.getApplyCount(), is(1));
		assertThat(item.getName(), is("Nourishment"));
	}
}
