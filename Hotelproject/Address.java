package com.hibernate.hotel.Hotelproject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Adreess-info")
public class Address {
	@Id
	private int adrId;
	private String adrCity;
	private String adrState;
	private int adrPincode;
	

}
