package de.getsetsociety.gw2readr.v1.item.items;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

import de.getsetsociety.gw2readr.v0.item.items.enums.ItemFlags;
import de.getsetsociety.gw2readr.v0.item.items.enums.RestrictionType;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseItem;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IItem;

public abstract class BaseItemTestCreator {

	protected FileWriter testWriter;

	protected BaseItemTestCreator(String className) throws IOException {
		Path path = Paths.get("src/test/java/de/getsetsociety/gw2readr/v1/item/items", className + ".java");
		if (path.toFile().exists()) {
			path.toFile().renameTo(Paths.get("src/test/java/de/getsetsociety/gw2readr/v1/item/items", className + ".java.bak").toFile());
			path = Paths.get("src/test/java/de/getsetsociety/gw2readr/v1/item/items", className + ".java");
		}
		path.toFile().createNewFile();
		testWriter = new FileWriter(path.toFile());
		writeFileHeader(className);
	}

	private void writeFileHeader(String className) throws IOException {
		testWriter.append("package de.getsetsociety.gw2readr.v1.item.items;\n\n");

		testWriter.append("import static org.junit.Assert.*;\n\n");
		testWriter.append("import java.util.Arrays;\n\n");
		testWriter.append("import org.junit.Test;\n\n");
		testWriter.append("import com.fasterxml.jackson.databind.ObjectMapper;\n\n");
		testWriter.append("import de.getsetsociety.gw2readr.v0.item.items.enums.Attribute;\n");
		testWriter.append("import de.getsetsociety.gw2readr.v0.item.items.enums.ArmorType;\n");
		testWriter.append("import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionSlotType;\n");
		testWriter.append("import de.getsetsociety.gw2readr.v0.item.items.enums.ItemFlags;\n");
		testWriter.append("import de.getsetsociety.gw2readr.v0.item.items.enums.Rarity;\n");
		testWriter.append("import de.getsetsociety.gw2readr.v0.item.items.enums.RestrictionType;\n");
		testWriter.append("import de.getsetsociety.gw2readr.v0.item.items.enums.WeightClass;\n");
		testWriter.append("import de.getsetsociety.gw2readr.v1.item.items.entities.AttributeModifier;\n");
		testWriter.append("import de.getsetsociety.gw2readr.v1.item.items.interfaces.IArmor;\n");
		testWriter.append("import de.getsetsociety.gw2readr.v1.item.items.interfaces.IAttributeModifier;\n");
		testWriter.append("import de.getsetsociety.gw2readr.v1.item.items.json.ArmorJson;\n");
		testWriter.append("import de.getsetsociety.gw2readr.v1.item.items.json.ItemJson;\n");
		testWriter.append("import de.getsetsociety.gw2readr.v1.item.items.interfaces.IBackItem;\n");
		testWriter.append("import de.getsetsociety.gw2readr.v1.item.items.json.BackItemJson;\n");
		testWriter.append("import de.getsetsociety.gw2readr.v1.item.items.json.ItemJson;\n");
		testWriter.append("import de.getsetsociety.gw2readr.general.ObjectMapperProvider;\n");
		testWriter.append("import de.getsetsociety.gw2readr.v1.item.items.interfaces.ICraftingMaterial;\n");
		testWriter.append("import de.getsetsociety.gw2readr.v1.item.items.json.CraftingMaterialJson;\n");
		testWriter.append("import de.getsetsociety.gw2readr.v1.item.items.json.WeaponJson;\n");
		testWriter.append("import de.getsetsociety.gw2readr.v1.item.items.interfaces.IWeapon;\n");
		testWriter.append("import de.getsetsociety.gw2readr.v0.item.items.enums.WeaponType;\n");
		testWriter.append("import de.getsetsociety.gw2readr.v0.item.items.enums.DamageType;\n");
		testWriter.append("import de.getsetsociety.gw2readr.v0.item.items.enums.ConsumableType;\n");
		testWriter.append("import de.getsetsociety.gw2readr.v1.item.items.interfaces.IConsumable;\n");
		testWriter.append("import de.getsetsociety.gw2readr.v1.item.items.json.ConsumableJson;\n");


		testWriter.append(String.format("\n\npublic class %s {%n%n", className));
		testWriter.append("    private ObjectMapper mapper = ObjectMapperProvider.getMapper();\n\n");
	}

	protected void createTestCase(IItem item) throws IOException {
		getAssertIntegerField("Id", item.getId());
		testWriter.append(String.format("            assert%s(item.getAvailableInActivity());%n", item.getAvailableInActivity() ? "True" : "False"));
		testWriter.append(String.format("            assert%s(item.getAvailableInDungeon());%n", item.getAvailableInDungeon() ? "True" : "False"));
		testWriter.append(String.format("            assert%s(item.getAvailableInPvE());%n", item.getAvailableInPvE() ? "True" : "False"));
		testWriter.append(String.format("            assert%s(item.getAvailableInPvP());%n", item.getAvailableInPvP() ? "True" : "False"));
		testWriter.append(String.format("            assert%s(item.getAvailableInPvPLobby());%n", item.getAvailableInPvPLobby() ? "True" : "False"));
		testWriter.append(String.format("            assert%s(item.getAvailableInWvW());%n", item.getAvailableInWvW() ? "True" : "False"));
		if (item.getDescription() != null) {
			testWriter.append(String.format("            assertEquals(\"%s\", item.getDescription());%n", item.getDescription().replace("\n", "\\n")));
		} else {
			testWriter.append(String.format("            assertNull(item.getDescription());%n"));
		}
		testWriter.append(String.format("            assertEquals(\"%s\", item.getName());%n", item.getName()));
		getAssertIntegerField("Level", item.getLevel());
		getAssertIntegerField("VendorValue", item.getVendorValue());
		testWriter.append(String.format("            assertEquals(Rarity.%s, item.getRarity());%n", item.getRarity()));
		getAssertItemFlags(item.getFlags());
		getAssertRestrictions(item.getRestrictions());
	}

	public void closeFile() throws IOException {
		testWriter.append("}\n");
		testWriter.flush();
		testWriter.close();
	}

	protected void createTestCaseHeader(String content, IBaseItem item, String type, String testName)
			throws IOException {
		testWriter.append(String.format("    @Test%n    public void test%s%06d() {%n" , testName, item.getId()));
		testWriter.append(String.format("        String content = \"%s\";%n", content));
		testWriter.append("        try {\n");
		testWriter.append("            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);\n");
		testWriter.append("            assertNotNull(itemJson);\n");
		testWriter.append(String.format("            assertTrue(itemJson instanceof %sJson);%n", type));
		testWriter.append(String.format("            I%s item = (I%s) itemJson.getEntity();%n", type, type));
	}

	protected void getAssertIntegerField(String field, Integer value)
			throws IOException {
		if (value == null) {
			testWriter.append(String.format("            assertNull(item.get%s());%n", field));
		} else {
			testWriter.append(String.format("            assertEquals(Integer.valueOf(%d),  item.get%s());%n", value, field));
		}
	}

	protected void getAssertItemFlags(Set<ItemFlags> flags) throws IOException {
		if (flags.isEmpty()) {
			testWriter.append(String.format("            assertTrue(item.getFlags().isEmpty());%n"));
		} else {
			testWriter.append(String.format("            assertEquals(%d,  item.getFlags().size());%n", flags.size()));
			testWriter.append(String.format("            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.%s})));%n", StringUtils.join(flags, ", ItemFlags.")));
		}
	}

	protected void getAssertRestrictions(Set<RestrictionType> restrictions) throws IOException {
		if (restrictions.isEmpty()) {
			testWriter.append(String.format("            assertTrue(item.getRestrictions().isEmpty());%n"));
		} else {
			getAssertIntegerField("item.getRestrictions().size()", restrictions.size());
			testWriter.append(String.format("            assertTrue(item.getRestrictions().containsAll(Arrays.asList(new RestrictionType[] {RestrictionType.%s})));%n", StringUtils.join(restrictions, ", RestrictionType.")));
		}
	}

}