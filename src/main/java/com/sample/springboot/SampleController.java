package com.sample.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sample.form.PageForm;
import com.sample.model.CurrencyConvertor;
import com.sample.service.SampleService;

@Controller
public class SampleController {
	
	@Autowired(required=true)
	private SampleService sampleService;
	
	@RequestMapping("/")
	public String index() {
		 
	      return "index";
	   }
	
	@RequestMapping(value="/message", method=RequestMethod.GET)
	public String getMessage(Model model, @RequestParam(value="country", defaultValue="USD") String value) {
		PageForm form = new PageForm();
		form.setCountry(value);
		CurrencyConvertor currency = sampleService.getCurrencyRates(value);
		System.out.println("currency ;" +currency.toString());
		System.out.println("currency base ;" +currency.getBase());
		System.out.println("currency rate ;" +currency.getRates());
		model.addAttribute("country" , currency.getBase());
		model.addAttribute("rates", currency.getRates());
		model.addAttribute("form", form);
		//currency.equals(obj)
		form.setSubmitted(true);
		return "index";
	}

	
}