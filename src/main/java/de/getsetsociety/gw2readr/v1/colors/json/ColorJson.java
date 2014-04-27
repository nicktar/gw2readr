package de.getsetsociety.gw2readr.v1.colors.json;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v1.colors.interfaces.IColor;
import de.getsetsociety.gw2readr.v1.item.EntityFactoryProvider;

public class ColorJson {
	
	private IColor entity = EntityFactoryProvider.getColorsEntityFactory().newColor();

	private BaseMaterialJson leather;
	private BaseMaterialJson cloth;
	private BaseMaterialJson metal;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	public ColorJson() {
		if (entity.getLeather() == null) {
			entity.setLeather(EntityFactoryProvider.getColorsEntityFactory().newBaseMaterial());
		} 
		if (entity.getMetal() == null) {
			entity.setMetal(EntityFactoryProvider.getColorsEntityFactory().newBaseMaterial());
		}
		if (entity.getCloth() == null) {
			entity.setCloth(EntityFactoryProvider.getColorsEntityFactory().newBaseMaterial());
		}
		leather = new BaseMaterialJson(entity.getLeather());
		metal = new BaseMaterialJson(entity.getMetal());
		cloth = new BaseMaterialJson(entity.getCloth());
	}
	
	public IColor getEntity() {
		return entity;
	}

	@JsonProperty("name")
	public String getName() {
		return entity.getName();
	}

	public void setName(String name) {
		entity.setName(name);
	}

	@JsonProperty("base_rgb")
	public List<Integer> getBaseRgb() {
		List<Integer> rgbList;
		if (entity.getBaseRgb() != null) {
			rgbList = Arrays.asList(new Integer[] 
					{ entity.getBaseRgb().getRed(), entity.getBaseRgb().getGreen(), entity.getBaseRgb().getBlue() });
		} else {
			rgbList = Collections.emptyList();
		}
		return rgbList;
	}

	public void setBaseRgb(List<Integer> rgb) {
		if (rgb == null) {
			entity.setBaseRgb(null);
		} else if (rgb.size() == 3) {
			entity.setBaseRgb(EntityFactoryProvider.getColorsEntityFactory().newRgbColor(rgb.get(0), rgb.get(1), rgb.get(2)));
		} else {
			throw new IllegalArgumentException("setBaseRgb may only be called with null or a List with a size of three.");
		}
	}

	@JsonProperty("leather")
	public BaseMaterialJson getLeather() {
		return leather;
	}

	public void setLeather(BaseMaterialJson leather) {
		this.leather = new BaseMaterialJson(leather.getEntity());
	}

	@JsonProperty("cloth")
	public BaseMaterialJson getCloth() {
		return cloth;
	}

	public void setCloth(BaseMaterialJson cloth) {
		this.cloth = new BaseMaterialJson(cloth.getEntity());
	}

	@JsonProperty("metal")
	public BaseMaterialJson getMetal() {
		return metal;
	}

	public void setMetal(BaseMaterialJson metal) {
		this.metal = new BaseMaterialJson(metal.getEntity());
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
}
