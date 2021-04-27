package com.hibernate.hotel.Hotelproject;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="hotel_info")
public class Hotel {
	@Id
	private int hotelId;
	private String hotelName;
	private Address hotelAddress;
	private String hotelOwnerName;
	private long hotelphone;
	
	
	

}
