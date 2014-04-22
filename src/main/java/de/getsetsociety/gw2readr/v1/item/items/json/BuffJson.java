package de.getsetsociety.gw2readr.v1.item.items.json;

import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v1.item.items.interfaces.IBuff;
import de.getsetsociety.gw2readr.v1.item.EntityFactoryProvider;

public class BuffJson implements IEntityWrapper<IBuff>{

	private final IBuff entity;
	
	public BuffJson() {
		entity = EntityFactoryProvider.getFactory().newBuff();
	}
	
	public BuffJson(IBuff buff) {
		entity = buff;
	}

	@JsonProperty("skill_id")
	public Integer getSkillId() {
		return entity.getSkillId();
	}

	public void setSkillId(Integer skillId) {
		entity.setSkillId(skillId);
	}

	@JsonProperty("description")
	public String getDescription() {
		return entity.getDescription();
	}

	public void setDescription(String description) {
		entity.setDescription(description);
	}

	@Override
	public IBuff getEntity() {
		return entity;
	}

}