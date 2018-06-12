package com.sample.model;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Rates {
	
	Map<String, Integer> countryRates;

	public Map<String, Integer> getCountryRates() {
		return countryRates;
	}

	public void setCountryRates(Map<String, Integer> countryRates) {
		this.countryRates = countryRates;
	}


	
}