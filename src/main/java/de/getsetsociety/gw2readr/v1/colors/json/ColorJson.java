package de.getsetsociety.gw2readr.v1.colors.json;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ColorJson {

	private String name;
	private RgbColorJson baseRgb;
	private BaseMaterialJson leather;
	private BaseMaterialJson cloth;
	private BaseMaterialJson metal;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("base_rgb")
	public List<Integer> getBaseRgb() {
		List<Integer> rgbList;
		if (baseRgb != null) {
			rgbList = Arrays.asList(new Integer[] { baseRgb.getRed(), baseRgb.getGreen(), baseRgb.getBlue() });
		} else {
			rgbList = Collections.emptyList();
		}
		return rgbList;
	}

	public void setBaseRgb(List<Integer> rgb) {
		if (rgb == null) {
			baseRgb = null;
		} else if (rgb.size() == 3) {
			baseRgb = new RgbColorJson(rgb.get(0), rgb.get(1), rgb.get(2));
		} else {
			throw new IllegalArgumentException("setBaseRgb may only be called with null or a List with a size of three.");
		}
	}

	@JsonProperty("leather")
	public BaseMaterialJson getLeather() {
		return leather;
	}

	public void setLeather(BaseMaterialJson leather) {
		this.leather = leather;
	}

	@JsonProperty("cloth")
	public BaseMaterialJson getCloth() {
		return cloth;
	}

	public void setCloth(BaseMaterialJson cloth) {
		this.cloth = cloth;
	}

	@JsonProperty("metal")
	public BaseMaterialJson getMetal() {
		return metal;
	}

	public void setMetal(BaseMaterialJson metal) {
		this.metal = metal;
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
