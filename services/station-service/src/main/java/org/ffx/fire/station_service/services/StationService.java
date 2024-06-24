package org.ffx.fire.station_service.services;

import java.util.List;
import java.util.stream.Collectors;

import org.ffx.fire.models.station.StationListItem;
import org.ffx.fire.station_service.repository.StationListItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.ffx.fire.station_service.interfaces.StationServiceInterface;
import org.ffx.fire.station_service.mappers.StationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StationService implements StationServiceInterface {
	
	private static final Logger logger = LoggerFactory.getLogger(StationService.class);
	
	@Autowired
	private StationListItemRepository stationListItemRepo;
	
	public List<StationListItem> getStationList() {
		logger.info("Call to station service to get all stations");
		return stationListItemRepo.findAll().stream()
				.map(e -> StationMapper.mapStationListItem(e))
				.collect(Collectors.toList());
	}
}
