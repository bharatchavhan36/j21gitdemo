package com.tut.HotelProject;

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
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int adrId, String adrCity, String adrState, int adrPincode) {
		super();
		this.adrId = adrId;
		this.adrCity = adrCity;
		this.adrState = adrState;
		this.adrPincode = adrPincode;
	}
	@Override
	public String toString() {
		return "Address [adrId=" + adrId + ", adrCity=" + adrCity + ", adrState=" + adrState + ", adrPincode="
				+ adrPincode + "]";
	}
	public int getAdrId() {
		return adrId;
	}
	public void setAdrId(int adrId) {
		this.adrId = adrId;
	}
	public String getAdrCity() {
		return adrCity;
	}
	public void setAdrCity(String adrCity) {
		this.adrCity = adrCity;
	}
	public String getAdrState() {
		return adrState;
	}
	public void setAdrState(String adrState) {
		this.adrState = adrState;
	}
	public int getAdrPincode() {
		return adrPincode;
	}
	public void setAdrPincode(int adrPincode) {
		this.adrPincode = adrPincode;
	}
	
	

}
