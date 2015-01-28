package de.getsetsociety.gw2readr.v1.error;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorJson {

	private Integer error;
	private Integer product;
	private Integer module;
	private Integer line;
	private Object text;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("error")
	public Integer getError() {
		return error;
	}

	public void setError(Integer error) {
		this.error = error;
	}

	@JsonProperty("product")
	public Integer getProduct() {
		return product;
	}

	public void setProduct(Integer product) {
		this.product = product;
	}

	@JsonProperty("module")
	public Integer getModule() {
		return module;
	}

	public void setModule(Integer module) {
		this.module = module;
	}

	@JsonProperty("line")
	public Integer getLine() {
		return line;
	}

	public void setLine(Integer line) {
		this.line = line;
	}

	@JsonProperty("text")
	public Object getText() {
		return text;
	}

	public void setText(Object text) {
		this.text = text;
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