package de.getsetsociety.gw2readr.v1.colors.hibernateentities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import de.getsetsociety.gw2readr.v1.colors.interfaces.IBaseMaterial;
import de.getsetsociety.gw2readr.v1.colors.interfaces.IRgbColor;

@Table
@Entity
public class BaseMaterial implements IBaseMaterial {

	private Integer brightness;
	private Double contrast;
	private Integer hue;
	private Double saturation;
	private Double lightness;
	private IRgbColor rgb;
	private Integer id;

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.colors.hibernateentities.IBaseMaterial#getBrightness()
	 */
	@Override
	@Column
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
	@Column
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
	@Column
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
	@Column
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
	@Column
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
	@ManyToOne(targetEntity=RgbColor.class)
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
