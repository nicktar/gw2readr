package de.getsetsociety.gw2readr.v1.item;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.Test;

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

public class TestJsonReading {

    private ItemReader reader = new ItemReader();

    @Test
    public void testCraftingMaterialLemongrass() {
	    ICraftingMaterial cm = (ICraftingMaterial) reader.readItem(12546);
	    assertThat(cm.getAvailableInActivity(), is(true));
	    assertThat(cm.getAvailableInDungeon(), is(true));
	    assertThat(cm.getAvailableInPvE(), is(true));
	    assertThat(cm.getAvailableInPvP(), is(false));
	    assertThat(cm.getAvailableInPvPLobby(), is(false));
	    assertThat(cm.getAvailableInWvW(), is(true));
	    assertThat(cm.getDescription(), is("Ingredient"));
	    assertTrue(cm.getFlags().isEmpty());
	    assertThat(cm.getIconFileId(), is(219490));
	    assertThat(cm.getIconFileSignature(), is("DF5612F93A11DB5F53FECA523F50D15DBF5A9AA5"));
	    assertThat(cm.getName(), is("Lemongrass"));
	    assertThat(cm.getId(), is(12546));
	    assertThat(cm.getLevel(), is(80));
	    assertThat(cm.getRarity(), is(Rarity.BASIC));
	    assertThat(cm.getVendorValue(), is(9));
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
