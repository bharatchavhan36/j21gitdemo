package com.hibernate.hotel.Hotelproject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rooms_info")
public class Rooms {
	@Id
	private int roomsId;
	private String roomsTypes;
	private double roomsRates;
	private String roomsLocation;
	private int noofBeds;
	
	

}
