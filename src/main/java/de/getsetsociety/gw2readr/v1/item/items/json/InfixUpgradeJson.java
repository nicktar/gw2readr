
package de.getsetsociety.gw2readr.v1.item.items.json;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IAttributeModifier;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.IInfixUpgrade;
import de.getsetsociety.gw2readr.v1.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v1.item.items.enums.Attribute;

public class InfixUpgradeJson implements IEntityWrapper<IInfixUpgrade<Attribute>>{

	private IInfixUpgrade<Attribute> entity =EntityFactoryProvider.getItemEntityFactory().newInfixUpgrade();

	@JsonProperty("attributes")
	public List<AttributeModifierJson> getAttributes() {
		List<AttributeModifierJson> jsonAttributes = new ArrayList<>();
		for (IAttributeModifier<Attribute> am: entity.getAttributes()) {
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
	public IInfixUpgrade<Attribute> getEntity() {
		return entity;
	}
}
