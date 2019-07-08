package com.sowing.seed.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PredicationController {
	
	
	
	@RequestMapping(value = "/getSoilType", method = RequestMethod.GET)
	@CrossOrigin(origins = "http://localhost:3000")
	public List<String> getSoilType() {
		List<String> soilType = new ArrayList<>();
		soilType.add("Red");
		soilType.add("Black");
		return soilType;
	}

	@RequestMapping(value = "/getGrains", method = RequestMethod.GET)
	@CrossOrigin(origins = "http://localhost:3000")
	public List<String> getGrains() {
		List<String> grains = new ArrayList<>();
		grains.add("Paddy");
		grains.add("Ragi");
		return grains;
	}

	@RequestMapping(value = "/getStates", method = RequestMethod.GET)
	@CrossOrigin(origins = "http://localhost:3000")
	public List<String> getStates() {
		List<String> states = new ArrayList<>();
		states.add("Karnataka");
		states.add("Kerala");
		return states;
	}

	@RequestMapping(value = "/getCities/{id}", method = RequestMethod.GET)
	@CrossOrigin(origins = "http://localhost:3000")
	public ResponseEntity<Object> getCities(@PathVariable("id") String id) {
		List<String> cities = new ArrayList<>();
		if (id.equals("Karnataka")) {
			cities.add("Bangalore");
			cities.add("Belgaum");
			cities.add("Tumkur");
		} else if (id.equals("Kerala")){
			cities.add("Thiruvananthapuram");
			cities.add("Kochi");
			cities.add("Palakkad");
		}
		return new ResponseEntity<Object>(cities, HttpStatus.OK);

	}

}
