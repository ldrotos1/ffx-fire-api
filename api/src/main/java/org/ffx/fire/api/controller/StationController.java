package org.ffx.fire.api.controller;

import java.util.List;

import org.ffx.fire.models.station.StationListItem;
import org.ffx.fire.station_service.interfaces.StationServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@RequestMapping("stations")
@Tag(name="Stations API")
public class StationController {

	@Autowired
	private StationServiceInterface stationServiceInterface;
	
	@GetMapping("/list")
	public List<StationListItem> getStations() {
		return stationServiceInterface.getStationList();
	}
}
