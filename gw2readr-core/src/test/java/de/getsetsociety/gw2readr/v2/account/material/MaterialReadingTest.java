package de.getsetsociety.gw2readr.v2.account.material;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.not;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.account.material.entities.StoredMaterial;
import de.getsetsociety.gw2readr.v2.account.material.enums.Binding;
import de.getsetsociety.gw2readr.v2.account.material.interfaces.IStoredMaterial;

class MaterialReadingTest {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @Test
    void testReading() throws IOException {
        URL content = getClass().getResource("storage.json");

        StoredMaterialJson[] material = OBJECT_MAPPER.readValue(content, StoredMaterialJson[].class);
        Set<IStoredMaterial> storage = Arrays.stream(material)
                                             .map(StoredMaterialJson::getEntity)
                                             .collect(Collectors.toSet());

        assertThat(storage, not(empty()));
    }

    @Test
    void testReadingEmptySlot() throws IOException {

        URL content = getClass().getResource("storage.json");

        StoredMaterialJson[] material = OBJECT_MAPPER.readValue(content, StoredMaterialJson[].class);
        Set<IStoredMaterial> storage = Arrays.stream(material)
                                             .map(StoredMaterialJson::getEntity)
                                             .collect(Collectors.toSet());

        assertThat(storage, hasItem(StoredMaterial.builder()
                                                  .id(74719)
                                                  .count(0)
                                                  .category(50)
                                                  .build()));
    }

    @Test
    void testReadingNoUnknownBinding() throws IOException {

        URL content = getClass().getResource("storage.json");

        StoredMaterialJson[] material = OBJECT_MAPPER.readValue(content, StoredMaterialJson[].class);
        Set<Binding> bindings = Arrays.stream(material)
                                      .map(StoredMaterialJson::getEntity)
                                      .map(IStoredMaterial::getBinding)
                                      .collect(Collectors.toSet());
        assertThat(bindings, not(hasItem(Binding.UNKNOWN)));
    }
}
