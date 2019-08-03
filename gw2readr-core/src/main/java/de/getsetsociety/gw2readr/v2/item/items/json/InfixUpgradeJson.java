
package de.getsetsociety.gw2readr.v2.item.items.json;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v2.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IAttributeModifier;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IInfixUpgrade;

public class InfixUpgradeJson implements IEntityWrapper<IInfixUpgrade> {

	private IInfixUpgrade entity = EntityFactoryProvider.getItemEntityFactory().newInfixUpgrade();

	@JsonProperty("id")
	public Integer getId() {
		return entity.getId();
	}

	public void setId(Integer id) {
		entity.setId(id);
	}


	@JsonProperty("attributes")
	public List<AttributeModifierJson> getAttributes() {
		List<AttributeModifierJson> jsonAttributes = new ArrayList<>();
		for (IAttributeModifier am: entity.getAttributes()) {
			jsonAttributes.add(new AttributeModifierJson(am));
		}
		return jsonAttributes;

	}

	public void setAttributes(List<AttributeModifierJson> attributes){
		entity.getAttributes().clear();
		for (AttributeModifierJson amj: attributes) {
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
