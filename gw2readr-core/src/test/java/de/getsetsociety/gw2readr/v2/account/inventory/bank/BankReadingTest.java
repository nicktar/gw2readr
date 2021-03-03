package de.getsetsociety.gw2readr.v2.account.inventory.bank;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.not;

import java.io.IOException;
import java.net.URL;
import java.util.*;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.account.inventory.entities.InventoryItem;
import de.getsetsociety.gw2readr.v2.account.inventory.interfaces.IInventoryItem;
import de.getsetsociety.gw2readr.v2.account.inventory.json.InventoryItemJson;
import de.getsetsociety.gw2readr.v2.account.inventory.materialstorage.enums.Binding;

class BankReadingTest {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();


    @Test
    void testReading() throws IOException {
        URL content = getClass().getResource("bank.json");

        InventoryItemJson[] material = OBJECT_MAPPER.readValue(content, InventoryItemJson[].class);
        List<IInventoryItem> storage = Arrays.stream(material)
                                             .map(e -> Optional.ofNullable(e)
                                                               .map(InventoryItemJson::getEntity)
                                                               .orElse(null))
                                             .collect(Collectors.toList());

        assertThat(storage, not(empty()));
    }

    @Test
    void testReadingWithCharges() throws IOException {
        URL content = getClass().getResource("bank.json");

        InventoryItemJson[] material = OBJECT_MAPPER.readValue(content, InventoryItemJson[].class);
        List<IInventoryItem> storage = Arrays.stream(material)
                                             .map(e -> Optional.ofNullable(e)
                                                               .map(InventoryItemJson::getEntity)
                                                               .orElse(null))
                                             .collect(Collectors.toList());

        assertThat(storage, hasItem(InventoryItem.builder()
                                                 .id(23040)
                                                 .charges(19)
                                                 .binding(Binding.ACCOUNT_BOUND)
                                                 .count(1)
                                                 .build()));
    }

    @Test
    void testReadingWithCount() throws IOException {
        URL content = getClass().getResource("bank.json");

        InventoryItemJson[] material = OBJECT_MAPPER.readValue(content, InventoryItemJson[].class);
        List<IInventoryItem> storage = Arrays.stream(material)
                                             .map(e -> Optional.ofNullable(e)
                                                               .map(InventoryItemJson::getEntity)
                                                               .orElse(null))
                                             .collect(Collectors.toList());

        assertThat(storage, hasItem(InventoryItem.builder()
                                                 .id(72500)
                                                 .binding(Binding.ACCOUNT_BOUND)
                                                 .count(58)
                                                 .build()));
    }

    @Test
    void testReadingWithSoulBound() throws IOException {
        URL content = getClass().getResource("bank.json");

        InventoryItemJson[] material = OBJECT_MAPPER.readValue(content, InventoryItemJson[].class);
        List<IInventoryItem> storage = Arrays.stream(material)
                                             .map(e -> Optional.ofNullable(e)
                                                               .map(InventoryItemJson::getEntity)
                                                               .orElse(null))
                                             .filter(Objects::nonNull)
                                             .filter(e -> Binding.SOUL_BOUND.equals(e.getBinding()))
                                             .collect(Collectors.toList());

        assertThat(storage, hasItem(InventoryItem.builder()
                                                 .id(27467)
                                                 .binding(Binding.SOUL_BOUND)
                                                 .boundTo("A Specific Character")
                                                 .upgrades(Set.of(24550))
                                                 .upgradeSlotIndices(Set.of(0))
                                                 .count(1)
                                                 .build()));
    }
}
