package com.ffx.fire.fireservices.controllers;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StationsController {

	@GetMapping("/stations")
	public List<String> getStations() {
		List<String> stations = new ArrayList<String>();
		stations.add("Station 1");
		stations.add("Station 2");
		stations.add("Station 3");
		stations.add("Station 4");
		return stations;
	}
}
