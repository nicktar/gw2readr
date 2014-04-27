package de.getsetsociety.gw2readr.v1.colors.entities;

import de.getsetsociety.gw2readr.v1.colors.interfaces.IBaseMaterial;
import de.getsetsociety.gw2readr.v1.colors.interfaces.IRgbColor;

public class BaseMaterial implements IBaseMaterial {

	private Integer brightness;
	private Double contrast;
	private Integer hue;
	private Double saturation;
	private Double lightness;
	private IRgbColor rgb;

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.colors.hibernateentities.IBaseMaterial#getBrightness()
	 */
	@Override
	public Integer getBrightness() {
		return brightness;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.colors.hibernateentities.IBaseMaterial#setBrightness(java.lang.Integer)
	 */
	@Override
	public void setBrightness(Integer brightness) {
		this.brightness = brightness;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.colors.hibernateentities.IBaseMaterial#getContrast()
	 */
	@Override
	public Double getContrast() {
		return contrast;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.colors.hibernateentities.IBaseMaterial#setContrast(java.lang.Double)
	 */
	@Override
	public void setContrast(Double contrast) {
		this.contrast = contrast;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.colors.hibernateentities.IBaseMaterial#getHue()
	 */
	@Override
	public Integer getHue() {
		return hue;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.colors.hibernateentities.IBaseMaterial#setHue(java.lang.Integer)
	 */
	@Override
	public void setHue(Integer hue) {
		this.hue = hue;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.colors.hibernateentities.IBaseMaterial#getSaturation()
	 */
	@Override
	public Double getSaturation() {
		return saturation;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.colors.hibernateentities.IBaseMaterial#setSaturation(java.lang.Double)
	 */
	@Override
	public void setSaturation(Double saturation) {
		this.saturation = saturation;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.colors.hibernateentities.IBaseMaterial#getLightness()
	 */
	@Override
	public Double getLightness() {
		return lightness;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.colors.hibernateentities.IBaseMaterial#setLightness(java.lang.Double)
	 */
	@Override
	public void setLightness(Double lightness) {
		this.lightness = lightness;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.colors.hibernateentities.IBaseMaterial#getRgb()
	 */
	@Override
	public IRgbColor getRgb() {
		return rgb;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.colors.hibernateentities.IBaseMaterial#setRgb(de.getsetsociety.gw2readr.v1.colors.hibernateentities.RgbColor)
	 */
	@Override
	public void setRgb(IRgbColor rgb) {
		this.rgb = rgb;
	}

}
