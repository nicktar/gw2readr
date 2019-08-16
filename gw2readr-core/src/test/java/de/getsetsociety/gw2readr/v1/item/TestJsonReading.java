package de.getsetsociety.gw2readr.v1.item;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.getsetsociety.gw2readr.general.ContentLoader;
import de.getsetsociety.gw2readr.general.enums.Language;
import de.getsetsociety.gw2readr.v0.item.items.enums.Rarity;
import de.getsetsociety.gw2readr.v1.colors.AllColorsReader;
import de.getsetsociety.gw2readr.v1.colors.interfaces.IColor;
import de.getsetsociety.gw2readr.v1.files.FilesReader;
import de.getsetsociety.gw2readr.v1.files.interfaces.IFileInfo;
import de.getsetsociety.gw2readr.v1.item.allitems.json.AllItems;
import de.getsetsociety.gw2readr.v1.item.items.ItemReader;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IBag;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IConsumable;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.ICraftingMaterial;
import de.getsetsociety.gw2readr.v1.item.items.json.ItemJson;
import org.junit.Test;

import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class TestJsonReading {

    private ItemReader reader = new ItemReader();

    @Test
    public void testCraftingMaterialLemongrass() {
        ICraftingMaterial cm = (ICraftingMaterial) reader.readItem(12546);
        assertEquals(true, cm.getAvailableInActivity());
        assertEquals(true, cm.getAvailableInDungeon());
        assertEquals(true, cm.getAvailableInPvE());
        assertEquals(false, cm.getAvailableInPvP());
        assertEquals(false, cm.getAvailableInPvPLobby());
        assertEquals(true, cm.getAvailableInWvW());
        assertEquals("Ingredient", cm.getDescription());
        assertTrue(cm.getFlags().isEmpty());
        assertEquals(Integer.valueOf(219490), cm.getIconFileId());
        assertEquals("DF5612F93A11DB5F53FECA523F50D15DBF5A9AA5", cm.getIconFileSignature());
        assertEquals("Lemongrass", cm.getName());
        assertEquals(Integer.valueOf(12546), cm.getId());
        assertEquals(Integer.valueOf(80), cm.getLevel());
        assertEquals(Rarity.BASIC, cm.getRarity());
        assertEquals(Integer.valueOf(9), cm.getVendorValue());
    }


    @Test
    public void testBag18SlotInvisibleLeatherPack() {
        IBag o = (IBag) reader.readItem(9579);
        assertNotNull(o);

    }

    @Test
    public void testAurilliumEssence() {
        IConsumable o = (IConsumable) reader.readItem(73344);
        assertNotNull(o);

    }

    @Test
    public void testFindNextUnknownType() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String content;
        boolean start = false;
        int count = 0;
        try {
            for (Integer i : mapper.readValue(ContentLoader.getV1ItemsUrlContent(), AllItems.class).getItems()) {
                start = start || i.equals(73344);
                if (start) {
                    content = ContentLoader.getV1ItemUrlContent(String.valueOf(i), Language.English);

                    ItemJson<?> item = mapper.readValue(content, ItemJson.class);
                    if (!item.getAdditionalProperties().isEmpty()) {
                        String unknown = item.getAdditionalProperties().entrySet()
                                .stream()
                                .map(e -> e.getKey() + ": " + e.getValue())
                                .collect(Collectors.joining("\n"));
                        fail(content + "\nContained an unknown property.\nType: " + item.getClass().getCanonicalName() + "\n" + unknown);
                    }
                }
                count++;
            }
        } finally {
            System.out.println(count + " items gelesen");
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
