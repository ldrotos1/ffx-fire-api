package org.ffx.fire.station_service.services;

import java.util.List;
import java.util.stream.Collectors;

import org.ffx.fire.models.station.StationListItem;
import org.ffx.fire.station_service.repository.StationListItemRepository;
import org.ffx.fire.station_service.interfaces.StationServiceInterface;
import org.ffx.fire.station_service.mappers.StationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StationService implements StationServiceInterface {
	
	@Autowired
	private StationListItemRepository stationListItemRepo;
	
	public List<StationListItem> getStationList() {
		return stationListItemRepo.findAll().stream()
				.map(e -> StationMapper.mapStationListItem(e))
				.collect(Collectors.toList());
	}
}
