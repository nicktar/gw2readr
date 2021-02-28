package de.getsetsociety.gw2readr.v2.item.items.items;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;

import java.io.IOException;
import java.net.URL;
import java.util.Set;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v0.item.items.enums.*;
import de.getsetsociety.gw2readr.v2.item.items.entities.AttributeModifier;
import de.getsetsociety.gw2readr.v2.item.items.entities.InfixUpgrade;
import de.getsetsociety.gw2readr.v2.item.items.entities.Weapon;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IWeapon;
import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;
import de.getsetsociety.gw2readr.v2.item.items.json.WeaponJson;

class WeaponsTest {

    private static final ObjectMapper mapper = new ObjectMapper();

    /**
     * Tests readability of the demo Json-Reply found on the wiki
     * Object is a Weapon (Lvl.44 Masterwork Longbow, worth 120 coins, power 385-452 with Power(62) and
     * Precision(44) stats, no infusions, no restrictions, no secondary suffix)
     */
    @Test
    void testDemoJson() throws IOException {
        URL resource = getClass().getResource("demo.json");

        ItemJson<?> item = mapper.readValue(resource, ItemJson.class);
        
        assertThat(item, instanceOf(WeaponJson.class));
        IWeapon entity = ((WeaponJson) item).getEntity();
        assertThat(item.getAdditionalProperties().values(), empty());
        Weapon expected = new Weapon();
        expected.setName("Strong Soft Wood Longbow of Fire");
        expected.setLevel(44);
        expected.setRarity(Rarity.MASTERWORK);
        expected.setVendorValue(120);
        expected.setDefaultSkin(3942);
        expected.setAvailableInActivity(true);
        expected.setAvailableInDungeon(true);
        expected.setAvailableInPvE(true);
        expected.setAvailableInPvP(false);
        expected.setAvailableInPvPLobby(false);
        expected.setAvailableInWvW(true);
        expected.addAllFlags(Set.of(ItemFlags.SOUL_BIND_ON_USE));
        expected.setId(28445);
        expected.setIconSignature("https://render.guildwars2.com/file/C6110F52DF5AFE0F00A56F9E143E9732176DDDE9/65015.png");
        expected.setWeaponType(WeaponType.LONG_BOW);
        expected.setDamageType(DamageType.Physical);
        expected.setMinPower(385);
        expected.setMaxPower(452);
        expected.setDefense(0);
        expected.setSuffixItemId(24547);
        expected.setInfixUpgrade(InfixUpgrade.builder()
                                             .attributes(Set.of(
                                                     AttributeModifier.builder()
                                                                      .attribute(Attribute.POWER)
                                                                      .modifier(62)
                                                                      .build(),
                                                     AttributeModifier.builder()
                                                                      .attribute(Attribute.PRECISION)
                                                                      .modifier(44)
                                                                      .build()
                                             ))
                                             .build());
        assertThat(entity, is(expected));
    }


}
