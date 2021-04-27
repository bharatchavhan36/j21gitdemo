package com.hibernate.hotel.Hotelproject;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="reservation_info")
public class Reservation {
	@Id
	private int resId;
	private Date rescheckInDate;
	private Date rescheckOutDate;
	private String resStatus;
	private int noOfGuest;
	private Date resDate;
	
	
	
	

}
