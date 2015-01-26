package de.getsetsociety.gw2readr.v1.wvw.matches.json;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v1.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v1.wvw.matches.interfaces.IWvWMatch;
import de.getsetsociety.gw2readr.v1.wvw.matches.interfaces.IWvWMatches;

public class WvWMatchesJson {

	private final IWvWMatches entity = EntityFactoryProvider.getWvWEntityFactory().newWvWMatches();
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("wvw_matches")
	public List<WvWMatchJson> getWvwMatches() {
		List<WvWMatchJson> retValue = new ArrayList<WvWMatchJson>();
		for (IWvWMatch match: entity.getWvwMatches()) {
			retValue.add(new WvWMatchJson(match));
		}
		return Collections.unmodifiableList(retValue);
	}

	@JsonProperty("wvw_matches")
	public void setWvwMatches(List<WvWMatchJson> wvwMatches) {
		List<IWvWMatch> matches = new ArrayList<IWvWMatch>();
		if (wvwMatches != null) {
			for (WvWMatchJson json: wvwMatches) {
				matches.add(json.getEntity());
			}
		}
		entity.setWvwMatches(matches);
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