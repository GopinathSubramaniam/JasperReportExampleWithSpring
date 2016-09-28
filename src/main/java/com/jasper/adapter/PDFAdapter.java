package com.jasper.adapter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jasper.model.City;
import com.jasper.util.PDFService;

import net.sf.jasperreports.engine.JRException;

@RestController("/pdf")
public class PDFAdapter {

	@Autowired
	private PDFService pdfService;
	
	    @RequestMapping(method = RequestMethod.GET)
	    public List<City> generateReport() throws JRException {
	    	List<City> cities = new ArrayList<>();
	    	City city = new City();
	    	city.setName("PUNE");
	    	city.setStateName("MH");
	    	cities.add(city);
	    	
	    	city = new City();
	    	city.setName("MUMBAI");
	    	city.setStateName("MH");
	    	cities.add(city);
	    	
	    	city = new City();
	    	city.setName("BANGALORE");
	    	city.setStateName("KA");
	    	cities.add(city);
	    	
	    	city = new City();
	    	city.setName("CHENNAI");
	    	city.setStateName("TN");
	    	cities.add(city);
	    	
	    	city = new City();
	    	city.setName("COIMBATORE");
	    	city.setStateName("TN");
	    	cities.add(city);
	    	System.out.println("Cities :::::::: "+cities);
	    	pdfService.generateReport(cities);
	    	return cities;
	}
	
}
