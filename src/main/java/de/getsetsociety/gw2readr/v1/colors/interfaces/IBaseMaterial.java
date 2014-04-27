package de.getsetsociety.gw2readr.v1.colors.interfaces;

import de.getsetsociety.gw2readr.v1.colors.hibernateentities.RgbColor;

public interface IBaseMaterial {

	/**
	 * @return the brightness
	 */
	public abstract Integer getBrightness();

	/**
	 * @param brightness
	 *            the brightness to set
	 */
	public abstract void setBrightness(Integer brightness);

	/**
	 * @return the contrast
	 */
	public abstract Double getContrast();

	/**
	 * @param contrast
	 *            the contrast to set
	 */
	public abstract void setContrast(Double contrast);

	/**
	 * @return the hue
	 */
	public abstract Integer getHue();

	/**
	 * @param hue
	 *            the hue to set
	 */
	public abstract void setHue(Integer hue);

	/**
	 * @return the saturation
	 */
	public abstract Double getSaturation();

	/**
	 * @param saturation
	 *            the saturation to set
	 */
	public abstract void setSaturation(Double saturation);

	/**
	 * @return the lightness
	 */
	public abstract Double getLightness();

	/**
	 * @param lightness
	 *            the lightness to set
	 */
	public abstract void setLightness(Double lightness);

	/**
	 * @return the rgb
	 */
	public abstract IRgbColor getRgb();

	/**
	 * @param rgb
	 *            the rgb to set
	 */
	public abstract void setRgb(IRgbColor rgb);

}