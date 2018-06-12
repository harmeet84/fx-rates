package com.sample.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.sample.model.CurrencyConvertor;

@Component
public class SampleService {
	
	public CurrencyConvertor getCurrencyRates(String country) {
		
		String url = "http://api.fixer.io/latest?base={country}";
		
		Map<String, String> params = new HashMap<>();
		params.put("country", country);
		
		RestTemplate restTemplate = new RestTemplate();
		CurrencyConvertor convertor = restTemplate.getForObject(url, CurrencyConvertor.class, params);
		return convertor;
		
	}
	
}