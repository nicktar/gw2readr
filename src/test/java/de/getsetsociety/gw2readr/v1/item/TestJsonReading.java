package  de.getsetsociety.gw2readr.v1.item;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Map;
import java.util.Map.Entry;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.ContentLoader;
import de.getsetsociety.gw2readr.general.enums.Language;
import de.getsetsociety.gw2readr.v1.colors.AllColorsReader;
import de.getsetsociety.gw2readr.v1.colors.interfaces.IColor;
import de.getsetsociety.gw2readr.v1.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v1.factories.HibernateItemEntityFactory;
import de.getsetsociety.gw2readr.v1.files.FilesReader;
import de.getsetsociety.gw2readr.v1.files.interfaces.IFileInfo;
import de.getsetsociety.gw2readr.v1.item.allitems.json.AllItems;
import de.getsetsociety.gw2readr.v1.item.items.ItemReader;
import de.getsetsociety.gw2readr.v1.item.items.enums.DamageType;
import de.getsetsociety.gw2readr.v1.item.items.enums.ItemFlags;
import de.getsetsociety.gw2readr.v1.item.items.enums.Rarity;
import de.getsetsociety.gw2readr.v1.item.items.enums.WeaponType;
import de.getsetsociety.gw2readr.v1.item.items.hibernateentities.UpgradeComponent;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IArmor;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IBag;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IBaseItem;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IConsumable;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.ICraftingMaterial;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IInfixUpgrade;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IWeapon;
import de.getsetsociety.gw2readr.v1.item.items.json.ItemJson;

public class TestJsonReading {
	
	private ItemReader reader = new ItemReader();
	
	@Test
	public void testCraftingMaterialLemongrass() throws JsonParseException, JsonMappingException, MalformedURLException, IOException {
		ICraftingMaterial cm = (ICraftingMaterial) reader.readItem(12546);
		assertEquals(true, cm.getAvailableInActivity());
		assertEquals(true, cm.getAvailableInDungeon());
		assertEquals(true, cm.getAvailableInPvE());
		assertEquals(false, cm.getAvailableInPvP());
		assertEquals(false, cm.getAvailableInPvPLobby());
		assertEquals(true, cm.getAvailableInWvW());
		assertEquals("Ingredient", cm.getDescription());
		assertEquals(true, cm.getFlags().isEmpty());
		assertEquals(Integer.valueOf(219490), cm.getIconFileId());
		assertEquals("DF5612F93A11DB5F53FECA523F50D15DBF5A9AA5", cm.getIconFileSignature());
		assertEquals("Lemongrass", cm.getName());
		assertEquals(Integer.valueOf(12546), cm.getId());
		assertEquals(Integer.valueOf(80), cm.getLevel());
		assertEquals(Rarity.Basic, cm.getRarity());
		assertEquals(Integer.valueOf(9), cm.getVendorValue());
	}

	@Test
	public void testWeaponWayfarersTribalBow() throws MalformedURLException, IOException {
		IWeapon o = (IWeapon)reader.readItem(38875);
		assertEquals(DamageType.Physical, o.getDamageType());
		assertEquals(Integer.valueOf(0), o.getDefense());
		IInfixUpgrade upgrade = o.getInfixUpgrade();
		assertEquals(null, upgrade.getBuff());
		assertTrue(upgrade.getAttributes().isEmpty());
		assertTrue(o.getInfusionSlots().isEmpty());
		assertEquals(Integer.valueOf(1080), o.getMaxPower());
		assertEquals(Integer.valueOf(920), o.getMinPower());
		assertEquals(null, o.getSuffixItemId());
		assertEquals(WeaponType.LongBow, o.getWeaponType());
		assertEquals(Integer.valueOf(38875), o.getId());
		assertEquals("Wayfarer's Tribal Bow", o.getName());
		assertEquals(Integer.valueOf(80), o.getLevel());
		assertEquals(Rarity.Exotic, o.getRarity());
		assertEquals(Integer.valueOf(396), o.getVendorValue());
		assertEquals(Integer.valueOf(67297), o.getIconFileId());
		assertEquals("A51ADB360705467301EC46B62D39BECFDEDE4810", o.getIconFileSignature());
		assertTrue(o.getAvailableInActivity());
		assertTrue(o.getAvailableInDungeon());
		assertTrue(o.getAvailableInPvE());
		assertFalse(o.getAvailableInPvP());
		assertFalse(o.getAvailableInPvPLobby());
		assertTrue(o.getAvailableInWvW());
		assertTrue(o.getFlags().contains(ItemFlags.SoulBindOnUse));
		assertTrue(o.getFlags().contains(ItemFlags.AccountBound));
		assertEquals(2, o.getFlags().size());
		assertEquals("", o.getDescription());
	}
	
	@Test
	public void testConsumableLimitedUseBronzeDolyak() throws MalformedURLException, IOException {
		IConsumable o = (IConsumable)reader.readItem(49464);
		assertNotNull(o);
				
		
	}
	
	@Test 
	public void testArmorCarrionNobleBoots() throws MalformedURLException, IOException {
		IArmor o = (IArmor)reader.readItem(12079);
		assertNotNull(o);
		
	}
	
	@Test 
	public void testBag18SlotInvisibleLeatherPack() throws MalformedURLException, IOException {
		IBag o = (IBag)reader.readItem(9579);
		assertNotNull(o);
		
	}
	
	public void testFindNextUnknownType() throws MalformedURLException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		String content = "";
		boolean start = true;
		Integer count = 0;
		try {
		for (Integer i: mapper.readValue(ContentLoader.getItemsUrlContent(), AllItems.class).getItems()) {
			start = start || i.equals(49386);
			if(start) {
				content = ContentLoader.getItemUrlContent(String.valueOf(i), Language.English);
			
				ItemJson<?> item = mapper.readValue(content, ItemJson.class);
				assertTrue(displayMap(item.getAdditionalProperties()), item.getAdditionalProperties().isEmpty());
			}
			count++;
		}
		} finally {
			System.out.println(count + " items gelesen");
			System.out.println(content);
		}
	}
	
	private String displayMap(Map<String, Object> map) {
		StringBuilder retValue = new StringBuilder();
		for (Entry<String, Object> e: map.entrySet()) {
			retValue.append("Map entry: ").append(e.getKey()).append(" - ").append(e.getValue()).append("\n");
		}
		return retValue.toString();
	}
	
	@Test
	public void testReadintItem24586() {
		ItemReader ir = new ItemReader();
		EntityFactoryProvider.setItemEntityFactory(new HibernateItemEntityFactory());
		IBaseItem i = ir.readItem(24589);
		assertTrue(i.getDescription().length() < 512);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("de.getsetsociety.gw2readr");

		EntityManager em = emf.createEntityManager();
		
		if (em.find(UpgradeComponent.class, 24589) != null) {
			em.merge((UpgradeComponent)i);
		} else {
			em.persist((UpgradeComponent)i);
		}
		
	}
	
	@Test
	public void testReadingColors() {
		AllColorsReader ar = new AllColorsReader();
		Map<Integer, IColor> allColors = ar.readAllColors();
		assertNotNull(allColors);
	}
	
	@Test
	public void testReadingFileInfos() {
		FilesReader fir = new FilesReader();
		Map<String, IFileInfo> allFiles = fir.readFiles();
		assertNotNull(allFiles);
		assertFalse(allFiles.isEmpty());
	}
}
