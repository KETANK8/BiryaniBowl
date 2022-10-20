package com.biryani.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.biryani.model.biryani;
import com.biryani.repo.biryaniRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class biryaniService {

	@Autowired
	private biryaniRepository biryaniRepo;

	// Method 1
	// To Fetch list of all biryani from database
	public List<biryani> getAllBiryani() {
		List<biryani> birList = new ArrayList<>();
		this.biryaniRepo.findAll().forEach(birList::add);
		return birList;
	}

	// Method 2
	// To Add a biryani in menu
	public String addBiryani(biryani bir) {
		this.biryaniRepo.save(bir);
		return "Biryani Added.";
	}

	// Method 3
	// To add the list of biryani in menu
	public String addAll(List<biryani> bir) {
		this.biryaniRepo.saveAll(bir);
		return "All Biryani Added.";
	}

	// Method 4
	// to fetch detail of biryani
	// fetch biryani details using primary key
	public Optional<biryani> getBiryani(int id) {
		return this.biryaniRepo.findById(id);
	}

	// Method 5
	// To fetch biryani details from database using name
	public List<biryani> getBiryaniByName(String name) {
		List<biryani> birList = new ArrayList<>();
		this.biryaniRepo.findByBiryaniName(name).forEach(birList::add);
		return birList;
	}

	// Method 6
	// To fetch biryani details from database using biryani type
	// Fetch List of biryani of same type
	public List<biryani> getBiryaniByType(String birtype) {
		List<biryani> birList = new ArrayList<>();
		this.biryaniRepo.findByBiryaniType(birtype).forEach(birList::add);
		return birList;
	}

	// Method 7
	// To fetch Biryani details from database using price
	// Fetch list of Biryani under the given amount
	public List<biryani> getBiryaniByPrice(int amount) {
		List<biryani> birList = new ArrayList<>();
		this.biryaniRepo.findByBiryaniPrice(amount).forEach(birList::add);
		return birList;
	}

	// Method 8
	// To Remove Biryani form menu
	// Remove Biryani using primary key
	public String removeBiryani(int id) {
		this.biryaniRepo.deleteById(id);
		return "Biryani Deleted.";
	}

}
