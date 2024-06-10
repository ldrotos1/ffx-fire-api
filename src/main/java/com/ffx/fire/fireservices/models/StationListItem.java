package com.ffx.fire.fireservices.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter 
@Setter 
@NoArgsConstructor
@Table(schema="ffx_fire_ops", name="station")
public class StationListItem {

	@Id
	@Column(name="station_designator")
	private Integer stationDesignator;
	
	@Column(name="station_number")
	private int stationNumber;
	
	@Column(name="station_name")
	private String stationName;
	
	@Column(name="battalion")
	private int battalion;
	
	@Column(name="divison")
	private int division;
}
