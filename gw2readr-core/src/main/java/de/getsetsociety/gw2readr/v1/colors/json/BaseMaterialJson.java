package de.getsetsociety.gw2readr.v1.colors.json;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v1.colors.interfaces.IBaseMaterial;
import de.getsetsociety.gw2readr.v1.factories.EntityFactoryProvider;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseMaterialJson {
	
	private final IBaseMaterial entity;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	public BaseMaterialJson(IBaseMaterial entity) {
		this.entity = entity;
	}
	
	IBaseMaterial getEntity() {
		return entity;
	}

	@JsonProperty("brightness")
	public Integer getBrightness() {
		return entity.getBrightness();
	}

	public void setBrightness(Integer brightness) {
		entity.setBrightness(brightness);;
	}

	@JsonProperty("contrast")
	public Double getContrast() {
		return entity.getContrast();
	}

	public void setContrast(Double contrast) {
		entity.setContrast(contrast);
	}

	@JsonProperty("hue")
	public Integer getHue() {
		return entity.getHue();
	}

	public void setHue(Integer hue) {
		entity.setHue(hue);
	}

	@JsonProperty("saturation")
	public Double getSaturation() {
		return entity.getSaturation();
	}

	public void setSaturation(Double saturation) {
		entity.setSaturation(saturation);
	}

	@JsonProperty("lightness")
	public Double getLightness() {
		return entity.getLightness();
	}

	public void setLightness(Double lightness) {
		entity.setLightness(lightness);
	}

	@JsonProperty("rgb")
	public List<Integer> getRgb() {
		List<Integer> rgbList;
		if (entity.getRgb() != null) {
			rgbList = Arrays.asList(new Integer[] { entity.getRgb().getRed(), entity.getRgb().getGreen(), entity.getRgb().getBlue() });
		} else {
			rgbList = Collections.emptyList();
		}
		return rgbList;
	}

	public void setRgb(List<Integer> rgb) {
		if (rgb == null) {
			entity.setRgb(null);
		} else if (rgb.size() == 3) {
			entity.setRgb(EntityFactoryProvider.getColorsEntityFactory().newRgbColor(rgb.get(0), rgb.get(1), rgb.get(2)));
		} else {
			throw new IllegalArgumentException("setRgb may only be called with null or a List with a size of three.");
		}
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
