package com.orm.mappings;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS_INFO")
public class Address {  			//address
	@Id
	private int adrId;
	private String city;
	private String state;
	private int pincode;
	public Address(int adrId, String city, String state, int pincode) {
		super();
		this.adrId = adrId;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [adrId=" + adrId + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	public int getAdrId() {
		return adrId;
	}
	public void setAdrId(int adrId) {
		this.adrId = adrId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	
	
	
}
/**

1-m
  bidirectional
  	two tables use krun
  	
*/