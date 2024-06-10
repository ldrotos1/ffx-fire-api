package com.ffx.fire.fireservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ffx.fire.fireservices.models.StationListItem;
import com.ffx.fire.fireservices.repositories.StationListItemRepository;

@Service
public class StationService {
    
	@Autowired
	private StationListItemRepository stationListItemRepo;
	
	public List<StationListItem> getStationList() {
		return stationListItemRepo.findAll();
	}
}
