package com.tut.relationalMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdharCard {
	@Id
	@Column(name="adhar_No", nullable = false, unique = true)
	private long adharcardNo;
	private String address;
	public AdharCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdharCard(long adharcardNo, String address) {
		super();
		this.adharcardNo = adharcardNo;
		this.address = address;
	}
	public long getAdharcardNo() {
		return adharcardNo;
	}
	public void setAdharcardNo(long adharcardNo) {
		this.adharcardNo = adharcardNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Citizen [adharcardNo=" + adharcardNo + ", address=" + address + "]";
	}
	
	
}
