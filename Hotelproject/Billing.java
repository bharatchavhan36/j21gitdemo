package com.hibernate.hotel.Hotelproject;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name= "billing_info")
public class Billing {
	@Id
	private int billingNumber;
	private double roomCharge;
	private double miscCharges;
	private long creditCardNumber;
	private Date paymentDate;
	

}
