package com.ffx.fire.fireservices.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ffx.fire.fireservices.models.StationListItem;
import com.ffx.fire.fireservices.services.StationService;

@RestController
@RequestMapping("stations")
public class StationsController {

	@Autowired
	private StationService stationService;
	
	@GetMapping("/list")
	public List<StationListItem> getStations() {
		return stationService.getStationList();
	}
}
