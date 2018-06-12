package com.sample.form;

import org.springframework.stereotype.Component;

@Component("pagarForm")
public class PageForm {
	
	String country;
	boolean submitted;
	
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public boolean isSubmitted() {
		return submitted;
	}
	public void setSubmitted(boolean isSubmitted) {
		this.submitted = isSubmitted;
	}
	
}