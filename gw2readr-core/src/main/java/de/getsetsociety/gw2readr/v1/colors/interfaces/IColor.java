package de.getsetsociety.gw2readr.v1.colors.interfaces;


public interface IColor {

	/**
	 * @return the id
	 */
	public abstract Integer getId();

	/**
	 * @param id
	 *            the id to set
	 */
	public abstract void setId(Integer id);

	/**
	 * @return the name
	 */
	public abstract String getName();

	/**
	 * @param name
	 *            the name to set
	 */
	public abstract void setName(String name);

	/**
	 * @return the baseRgb
	 */
	public abstract IRgbColor getBaseRgb();

	/**
	 * @param baseRgb
	 *            the baseRgb to set
	 */
	public abstract void setBaseRgb(IRgbColor baseRgb);

	/**
	 * @return the leather
	 */
	public abstract IBaseMaterial getLeather();

	/**
	 * @param leather
	 *            the leather to set
	 */
	public abstract void setLeather(IBaseMaterial leather);

	/**
	 * @return the cloth
	 */
	public abstract IBaseMaterial getCloth();

	/**
	 * @param cloth
	 *            the cloth to set
	 */
	public abstract void setCloth(IBaseMaterial cloth);

	/**
	 * @return the metal
	 */
	public abstract IBaseMaterial getMetal();

	/**
	 * @param metal
	 *            the metal to set
	 */
	public abstract void setMetal(IBaseMaterial metal);

}