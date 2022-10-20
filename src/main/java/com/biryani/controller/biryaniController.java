package com.biryani.controller;

import java.util.List;
import java.util.Optional;

import com.biryani.model.biryani;
import com.biryani.service.biryaniService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class biryaniController {

	@Autowired
	private biryaniService birService;

	// Request Method 1
	// Method to handle the request to get biryani
	// setting request mapping with get method to retrive data
	@RequestMapping(method = RequestMethod.GET, value = "/biryani")
	public List<biryani> getAllBiryani() {
		// calling getAllBiryani method from service
		// to return list of biryani
		return birService.getAllBiryani();
	}

	// Request Method 2
	// Method to handle the request to add a biryani
	// Setting request mapping with post method to store data
	@RequestMapping(method = RequestMethod.POST, value = "/biryani/add")
	public String addBiryani(@RequestBody biryani bir) {
		// calling addBiryani method form service
		// to add the biryani in database
		// return success message
		return birService.addBiryani(bir);
	}

	// Request Method 3
	// Method to handle the request to add a list of biryani in database
	// Setting request mapping with post method to store the list
	@RequestMapping(method = RequestMethod.POST, value = "/biryani/addall")
	public String addAllBiryani(@RequestBody List<biryani> bir) {
		// calling addAll method from service
		// to add the biryani list in database
		// return success message
		return birService.addAll(bir);
	}

	// Request Method 4
	// Method to handle the request to fetch biryani detail using primary key
	// Setting request mapping with get method to fetch biryani details
	@RequestMapping(method = RequestMethod.GET, value = "/biryani/id/{id}")
	public Optional<biryani> getBiryani(@PathVariable int id) {
		// using pathvariable to create variable url using primary key

		// calling getBiryani method from service layer
		// to fetch biryani details
		// return biryani object
		return birService.getBiryani(id);
	}

	// Request Method 5
	// Method to handle the request to fetch Biryani detail using Biryani name
	// Setting request mapping with get method to fetch Biryani details
	@RequestMapping(method = RequestMethod.GET, value = "/biryani/name/{name}")
	public List<biryani> getBiryaniByName(@PathVariable String name) {
		// using pathvariable to create variable url using Biryani name

		// calling getBiryaniByName method from service layer
		// to fetch biryani details
		return birService.getBiryaniByName(name);
	}

	// Request Method 6
	// Method to handle the request to fetch Biryani detail using Biryani Type
	// Setting request mapping with get method to fetch Biryani details
	@RequestMapping(method = RequestMethod.GET, value = "/biryani/type/{type}")
	public List<biryani> getBiryaniByType(@PathVariable String type) {
		// using pathvariable to create variable url using Biryani Type

		// calling getBiryaniByType method from service layer
		// to fetch Biryani details
		// return list of Biryani of same Type
		return birService.getBiryaniByType(type);
	}

	// Request Method 7
	// Method to handle the request to fetch biryani detail using biryani price
	// Setting request mapping with get method to fetch biryani details
	@RequestMapping(method = RequestMethod.GET, value = "/biryani/price/{price}")
	public List<biryani> getBiryaniByPrice(@PathVariable int price) {
		// using pathvariable to create variable url using price

		// calling getBiryaniByPrice method from service layer
		// to fetch Biryani details
		// return list of biryani whose price under the given amount
		return birService.getBiryaniByPrice(price);
	}

	// Request Method 8
	// Method to handle the request to remove biryani from database using primary
	// key
	// Setting request mapping with delete method to remove biryani from menu
	@RequestMapping(method = RequestMethod.DELETE, value = "/biryani/remove/id/{id}")
	public String removeBiryani(@PathVariable int id) {
		// using pathvariable to create variable url using primary key

		// calling remove biryani from service layer
		// to delete biryani details
		// return success message
		return birService.removeBiryani(id);
	}

}
