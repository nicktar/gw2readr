package de.getsetsociety.gw2readr.v1.item.items.json;

import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseBuff;
import de.getsetsociety.gw2readr.v1.factories.EntityFactoryProvider;

public class BuffJson implements IEntityWrapper<IBaseBuff>{

	private final IBaseBuff entity;
	
	public BuffJson() {
		entity = EntityFactoryProvider.getItemEntityFactory().newBuff();
	}
	
	public BuffJson(IBaseBuff buff) {
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
	public IBaseBuff getEntity() {
		return entity;
	}

}
