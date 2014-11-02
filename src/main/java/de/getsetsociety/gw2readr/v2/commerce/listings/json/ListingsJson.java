package de.getsetsociety.gw2readr.v2.commerce.listings.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v2.commerce.listings.interfaces.IListings;
import de.getsetsociety.gw2readr.v2.commerce.listings.interfaces.IOffer;
import de.getsetsociety.gw2readr.v2.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v2.item.items.json.IEntityWrapper;

public class ListingsJson implements IEntityWrapper<IListings> {
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	private IListings entity = EntityFactoryProvider.getCommerceEntityFactory().newListings();

	/**
	 * @return the entity
	 */
	@Override
	public IListings getEntity() {
		return entity;
	}

	/**
	 * @param entity the entity to set
	 */
	public void setEntity(IListings entity) {
		this.entity = entity;
	}

	/**
	 * @return
	 * @see de.getsetsociety.gw2readr.v2.commerce.listings.interfaces.IListings#getId()
	 */
	@JsonProperty("id")
	public Integer getId() {
		return entity.getId();
	}

	/**
	 * @param id
	 * @see de.getsetsociety.gw2readr.v2.commerce.listings.interfaces.IListings#setId(java.lang.Integer)
	 */
	public void setId(Integer id) {
		entity.setId(id);
	}

	/**
	 * @return
	 * @see de.getsetsociety.gw2readr.v2.commerce.listings.interfaces.IListings#getBuys()
	 */
	@JsonProperty("buys")
	public List<OfferJson> getBuys() {
		List<OfferJson> jsons = new ArrayList<>();
		for (IOffer offer: entity.getBuys()) {
			jsons.add(new OfferJson(offer));
		}
		return jsons;
	}

	/**
	 * @param buys
	 * @see de.getsetsociety.gw2readr.v2.commerce.listings.interfaces.IListings#setBuys(java.util.List)
	 */
	public void setBuys(List<OfferJson> buys) {
		for (OfferJson offer: buys) {
			getEntity().getBuys().add(offer.getEntity());
		}
	}

	/**
	 * @return
	 * @see de.getsetsociety.gw2readr.v2.commerce.listings.interfaces.IListings#getSells()
	 */
	@JsonProperty("sells")
	public List<OfferJson> getSells() {
		List<OfferJson> jsons = new ArrayList<>();
		for (IOffer offer: entity.getSells()) {
			jsons.add(new OfferJson(offer));
		}
		return jsons;
	}

	/**
	 * @param sells
	 * @see de.getsetsociety.gw2readr.v2.commerce.listings.interfaces.IListings#setSells(java.util.List)
	 */
	public void setSells(List<OfferJson> sells) {
		for (OfferJson offer: sells) {
			getEntity().getSells().add(offer.getEntity());
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


