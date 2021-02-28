
package de.getsetsociety.gw2readr.v2.item.items.json;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v2.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IAttributeModifier;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IInfixUpgrade;

public class InfixUpgradeJson implements IEntityWrapper<IInfixUpgrade> {

    private final IInfixUpgrade entity = EntityFactoryProvider.getItemEntityFactory().newInfixUpgrade();

    @JsonProperty("id")
    public Integer getId() {
        return entity.getId();
    }

    public void setId(Integer id) {
        entity.setId(id);
    }


    @JsonProperty("attributes")
    public Set<AttributeModifierJson> getAttributes() {
        Set<AttributeModifierJson> jsonAttributes = new HashSet<>();
        for (IAttributeModifier am : entity.getAttributes()) {
            jsonAttributes.add(new AttributeModifierJson(am));
        }
        return jsonAttributes;

    }

    public void setAttributes(Set<AttributeModifierJson> attributes) {
        entity.getAttributes().clear();
        for (AttributeModifierJson amj : attributes) {
            entity.getAttributes().add(amj.getEntity());
        }
    }

    @JsonProperty("buff")
	public BuffJson getBuff() {
		return new BuffJson(entity.getBuff());
	}

	public void setBuff(BuffJson buff) {
		entity.setBuff(buff.getEntity());
	}

	@Override
	public IInfixUpgrade getEntity() {
		return entity;
	}
}
