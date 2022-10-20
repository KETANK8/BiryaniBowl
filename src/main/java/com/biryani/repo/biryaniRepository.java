package com.biryani.repo;

import java.util.ArrayList;

import com.biryani.model.biryani;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface biryaniRepository extends JpaRepository<biryani, Integer> {

	ArrayList<biryani> findByBiryaniName(String name);

	ArrayList<biryani> findByBiryaniType(String birtype);

	@Query(value = "select * from biryani where biryani_Price < ?1", nativeQuery = true)
	ArrayList<biryani> findByBiryaniPrice(int amount);

}
