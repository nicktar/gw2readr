package de.getsetsociety.gw2readr.v1.colors.json;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseMaterialJson {

	private Integer brightness;
	private Double contrast;
	private Integer hue;
	private Double saturation;
	private Double lightness;
	private RgbColorJson rgb;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("brightness")
	public Integer getBrightness() {
		return brightness;
	}

	public void setBrightness(Integer brightness) {
		this.brightness = brightness;
	}

	@JsonProperty("contrast")
	public Double getContrast() {
		return contrast;
	}

	public void setContrast(Double contrast) {
		this.contrast = contrast;
	}

	@JsonProperty("hue")
	public Integer getHue() {
		return hue;
	}

	public void setHue(Integer hue) {
		this.hue = hue;
	}

	@JsonProperty("saturation")
	public Double getSaturation() {
		return saturation;
	}

	public void setSaturation(Double saturation) {
		this.saturation = saturation;
	}

	@JsonProperty("lightness")
	public Double getLightness() {
		return lightness;
	}

	public void setLightness(Double lightness) {
		this.lightness = lightness;
	}

	@JsonProperty("rgb")
	public List<Integer> getRgb() {
		List<Integer> rgbList;
		if (rgb != null) {
			rgbList = Arrays.asList(new Integer[] { rgb.getRed(), rgb.getGreen(), rgb.getBlue() });
		} else {
			rgbList = Collections.emptyList();
		}
		return rgbList;
	}

	public void setRgb(List<Integer> rgb) {
		if (rgb == null) {
			this.rgb = null;
		} else if (rgb.size() == 3) {
			this.rgb = new RgbColorJson(rgb.get(0), rgb.get(1), rgb.get(2));
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
