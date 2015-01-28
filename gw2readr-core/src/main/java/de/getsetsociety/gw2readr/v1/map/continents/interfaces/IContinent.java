package de.getsetsociety.gw2readr.v1.map.continents.interfaces;

import java.util.List;

public interface IContinent {
	
	/**
	 * @return the id
	 */
	public Integer getId();

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id);

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
	 * @return the continentXDim
	 */
	public abstract Integer getContinentXDim();

	/**
	 * @param continentXDim
	 *            the continentXDim to set
	 */
	public abstract void setContinentXDim(Integer continentXDim);

	/**
	 * @return the continentYDim
	 */
	public abstract Integer getContinentYDim();

	/**
	 * @param continentYDim
	 *            the continentYDim to set
	 */
	public abstract void setContinentYDim(Integer continentYDim);

	/**
	 * @return the minZoom
	 */
	public abstract Integer getMinZoom();

	/**
	 * @param minZoom
	 *            the minZoom to set
	 */
	public abstract void setMinZoom(Integer minZoom);

	/**
	 * @return the maxZoom
	 */
	public abstract Integer getMaxZoom();

	/**
	 * @param maxZoom
	 *            the maxZoom to set
	 */
	public abstract void setMaxZoom(Integer maxZoom);

	/**
	 * @return the floors
	 */
	public abstract List<Integer> getFloors();

	/**
	 * @param floors
	 *            the floors to set
	 */
	public abstract void setFloors(List<Integer> floors);

}