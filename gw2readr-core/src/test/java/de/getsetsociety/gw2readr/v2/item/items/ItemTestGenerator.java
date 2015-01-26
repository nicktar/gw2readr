package de.getsetsociety.gw2readr.v2.item.items;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.ContentLoader;
import de.getsetsociety.gw2readr.v0.item.items.enums.ArmorType;
import de.getsetsociety.gw2readr.v0.item.items.enums.ItemFlags;
import de.getsetsociety.gw2readr.v0.item.items.enums.RestrictionType;
import de.getsetsociety.gw2readr.v0.item.items.enums.WeightClass;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IArmor;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IAttributeModifier;
import de.getsetsociety.gw2readr.v1.item.items.json.ArmorJson;
import de.getsetsociety.gw2readr.v1.item.items.json.ItemJson;

public class ItemTestGenerator {

	private static ObjectMapper mapper = new ObjectMapper();
	private static boolean needArmor = true;
	private static Set<ArmorType> neededArmorTypes = new HashSet<ArmorType>() {{ addAll(Arrays.asList(ArmorType.values())); }};
	private static Set<ItemFlags> neededArmorFlags = new HashSet<ItemFlags>() {{ addAll(Arrays.asList(ItemFlags.values())); }};
	private static boolean needNoArmorFlags = true;
	private static Set<RestrictionType> neededRestrictions = new HashSet<RestrictionType>() {{ addAll(Arrays.asList(RestrictionType.values())); }};
	private static boolean needNoRestrictions = true;
	private static boolean needInfixUpgrade = true;
	private static boolean needNoInfixUpgrade = true;
	private static boolean needInfusionSlots = true;
	private static boolean needNoInfusionSlots = true;
	private static Set<WeightClass> neededArmorWeights = new HashSet<WeightClass>() {{ addAll(Arrays.asList(WeightClass.values())); }};



	public static void main(String[] args) throws MalformedURLException, IOException {
		ContentLoader.setProxy(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("ipx01.abit.de", 7000)));
		FileWriter armorTest = createTestFile("ArmorTest");
		Path allItemsJson = Paths.get("src/test/resources/de/getsetsociety/gw2readr/v2/item/items", "AllItemsJson.txt");
		for (String content: Files.readAllLines(allItemsJson, Charset.forName("UTF-8"))) {

			ItemJson<?> item = mapper.readValue(content, ItemJson.class);
			if (item instanceof ArmorJson) {
				IArmor armor = ((ArmorJson)item).getEntity();
				ArmorTestCreator.createTest(armorTest, content, armor);
				if (!(needArmor || needInfixUpgrade || needInfusionSlots || needNoArmorFlags || needNoInfixUpgrade || needNoInfusionSlots || needNoRestrictions)) {
					if (neededArmorFlags.isEmpty() && neededArmorTypes.isEmpty() && neededArmorWeights.isEmpty() && neededRestrictions.isEmpty()) {
						break;
					}
				}

			}
		}
		armorTest.append("}");
		armorTest.close();
	}


	private static String maskString(String value) {
		return value.replace("\n", "\\n").replace("\\\"", "\\\\\"").replace("\"", "\\\"");
	}

	private static FileWriter createTestFile(String className) throws IOException {
		FileWriter w = new FileWriter(new File("src/test/java/de/getsetsociety/gw2readr/v1/item/items/items/" + className + ".java"));
		w.append("package de.getsetsociety.gw2readr.v1.item.items.items;\n\n");
		w.append("import static org.junit.Assert.*;\n");
		w.append("import org.junit.Test;\n");
		w.append("import com.fasterxml.jackson.databind.ObjectMapper;\n");
		w.append(String.format("public class %s {%n%n", className));
		w.append("private static ObjectMapper mapper = new ObjectMapper();\n\n");
		return w;
	}

	private static <T> boolean containsAny(Collection<T> haystack, Collection<T> needles) {
		Collection<T> myNeedles = new HashSet<T>(needles);
		myNeedles.removeAll(haystack);
		return needles.size() != myNeedles.size();
	}

	public static class ArmorTestCreator {

		private static void createTest(FileWriter armorTest, String content,
				IArmor armor) throws IOException {
			boolean save = false;
			if (needArmor) {
				save = true;
				needArmor = false;
			}
			if (neededArmorTypes.contains(armor.getArmorType())) {
				save = true;
				neededArmorTypes.remove(armor.getArmorType());
			}
			if (!armor.getFlags().isEmpty() && containsAny(neededArmorFlags, armor.getFlags())) {
				save = true;
				neededArmorFlags.removeAll(armor.getFlags());
			}
			if (needNoArmorFlags && armor.getFlags().isEmpty()) {
				save = true;
				needNoArmorFlags = false;
			}
			if (!armor.getRestrictions().isEmpty() && containsAny(neededRestrictions, armor.getRestrictions())) {
				save = true;
				neededRestrictions.removeAll(armor.getRestrictions());
			}
			if (needNoRestrictions && armor.getRestrictions().isEmpty()) {
				save = true;
				needNoRestrictions = false;
			}
			if (needInfixUpgrade && armor.getInfixUpgrade() != null) {
				save = true;
				needInfixUpgrade = false;
			}
			if (needNoInfixUpgrade && armor.getInfixUpgrade() == null) {
				save = true;
				needNoInfixUpgrade = false;
			}
			if (needInfusionSlots && !armor.getInfusionSlots().isEmpty()) {
				save = true;
				needInfusionSlots = false;
			}
			if (needNoInfusionSlots && armor.getInfusionSlots().isEmpty()) {
				save = true;
				needNoInfusionSlots = false;
			}
			if (neededArmorWeights.contains(armor.getWeightClass())) {
				save = true;
				neededArmorWeights.remove(armor.getWeightClass());
			}

			if (save) {
				createTestCase(armor, content, armorTest);
			}
		}

		private static void createTestCase(IArmor armor, String content, FileWriter w) throws IOException {
			w.append("    @Test\n");
			w.append(String.format("    public void testArmor%06d() {%n", armor.getId()));
			String myContent = maskString(content);
			w.append(String.format("        String content = \"%s\";%n", myContent));
			w.append("        try {\n");
			w.append("            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);\n");
			w.append("            assertNotNull(itemJson);\n");
			w.append("            assertTrue(itemJson instanceof ArmorJson);\n");
			w.append("            IArmor armor = (IArmor)itemJson.getEntity();\n");
			w.append(String.format("            assertEquals(ArmorType.%s, armor.getArmorType());%n", armor.getArmorType().name()));
			w.append(String.format("            assert%s(armor.getAvailableInActivity());%n", StringUtils.capitalize(armor.getAvailableInActivity().toString())));
			w.append(String.format("            assert%s(armor.getAvailableInDungeon());%n", StringUtils.capitalize(armor.getAvailableInDungeon().toString())));
			w.append(String.format("            assert%s(armor.getAvailableInPvE());%n", StringUtils.capitalize(armor.getAvailableInPvE().toString())));
			w.append(String.format("            assert%s(armor.getAvailableInPvP());%n", StringUtils.capitalize(armor.getAvailableInPvP().toString())));
			w.append(String.format("            assert%s(armor.getAvailableInPvPLobby());%n", StringUtils.capitalize(armor.getAvailableInPvPLobby().toString())));
			w.append(String.format("            assert%s(armor.getAvailableInWvW());%n", StringUtils.capitalize(armor.getAvailableInWvW().toString())));
			w.append(String.format("            assertEquals(Integer.valueOf(%d), armor.getDefense());%n", armor.getDefense()));
			w.append(String.format("            assertEquals(\"%s\", armor.getDescription());%n", maskString(armor.getDescription())));
			w.append(String.format("            assert%s(armor.getFlags().isEmpty());%n", StringUtils.capitalize(Boolean.valueOf(armor.getFlags().isEmpty()).toString())));
			if (!armor.getFlags().isEmpty()) {
				w.append(String.format("            assertEquals(%d, armor.getFlags().size());%n", armor.getFlags().size()));
				String flags = "ItemFlags." + StringUtils.join(armor.getFlags(), ", ItemFlags.");
				w.append(String.format("            assertTrue(armor.getFlags().containsAll(Arrays.asList(new ItemFlags[] {%s})));%n", flags));
			}
			w.append(String.format("            assertEquals(Integer.valueOf(%d), armor.getIconFileId());%n", armor.getIconFileId()));
			w.append(String.format("            assertEquals(\"%s\", armor.getIconFileSignature());%n", armor.getIconFileSignature()));
			w.append(String.format("            assertEquals(Integer.valueOf(%d), armor.getId());%n", armor.getId()));
			w.append(String.format("            assert%sNull(armor.getInfixUpgrade());%n", armor.getInfixUpgrade() != null? "Not":""));
			if (armor.getInfixUpgrade() != null) {
				w.append(String.format("            assertEquals(%d, armor.getInfixUpgrade().getAttributes().size());%n", armor.getInfixUpgrade().getAttributes().size()));
				if (!armor.getInfixUpgrade().getAttributes().isEmpty()) {
					StringBuilder attributes = new StringBuilder("(Arrays.asList( new IAttributeModifier[] {");
					List<String> attributeConstructors = new ArrayList<>();
					for (IAttributeModifier am: armor.getInfixUpgrade().getAttributes()) {
						attributeConstructors.add(String.format("new AttributeModifier(Attribute.%s,  %s)", am.getAttribute(), am.getModifier()));
					}
					attributes.append(StringUtils.join(attributeConstructors, ", "));
					attributes.append("})));\n");
					w.append("            assertTrue(armor.getInfixUpgrade().getAttributes().containsAll(" + attributes.toString());
				}
			}
			w.append(String.format("            assert%s(armor.getInfusionSlots().isEmpty());%n", StringUtils.capitalize(Boolean.valueOf(armor.getInfusionSlots().isEmpty()).toString())));
			if (!armor.getInfusionSlots().isEmpty()) {
				w.append(String.format("            assertEquals(%d, armor.getInfusionSlots().size());%n", armor.getInfusionSlots().size()));
				String slots = "InfusionSlotType." + StringUtils.join(armor.getInfusionSlots(), ", InfusionSlotType.");
				w.append(String.format("            assertTrue(armor.getInfusionSlots().containsAll(Arrays.asList(new InfusionSlotType[] {%s})));%n", slots));
			}
			w.append(String.format("            assertEquals(Integer.valueOf(%d), armor.getLevel());%n", armor.getLevel()));
			w.append(String.format("            assertEquals(\"%s\", armor.getName());%n", armor.getName()));
			w.append(String.format("            assertEquals(Rarity.%s, armor.getRarity());%n", armor.getRarity()));
			if(armor.getSuffixItemId() != null) {
				w.append(String.format("            assertEquals(Integer.valueOf(%d), armor.getSuffixItemId());%n", armor.getSuffixItemId()));
			} else {
				w.append("            assertNull(armor.getSuffixItemId());\n");
			}
			w.append(String.format("            assertEquals(WeightClass.%s, armor.getWeightClass());%n", armor.getWeightClass()));
			w.append(String.format("            assertEquals(Integer.valueOf(%d), armor.getVendorValue());%n", armor.getVendorValue()));
			w.append(String.format("            assert%s(armor.getRestrictions().isEmpty());%n", StringUtils.capitalize(Boolean.valueOf(armor.getRestrictions().isEmpty()).toString())));
			if (!armor.getRestrictions().isEmpty()) {
				w.append(String.format("            assertEquals(%d, armor.getRestrictions().size());%n", armor.getRestrictions().size()));
				String restrictions = "RestrictionType." + StringUtils.join(armor.getRestrictions(), ", RestrictionType.");
				w.append(String.format("            assertTrue(armor.getRestrictions().containsAll(Arrays.asList(new RestrictionType[] {%s})));%n", restrictions));
			}
			w.append("        } catch (Exception e) {\n");
			w.append("            e.printStackTrace();\n");
			w.append("            fail(\"Unexpected Exception\");\n");
			w.append("        }\n    }\n");
		}

	}
}
