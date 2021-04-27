package com.hibernate.hotel.Hotelproject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cust_info")
public class Customer {
	@Id
	private int custId;
	private String custName;
	private long custPhone;
	private Address custAddress;
	private String custPancard;
	
	
	

}
