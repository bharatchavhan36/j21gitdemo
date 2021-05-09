package com.tut.relationalMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Citizen {
	
	@Id
	@Column(name="c_Id", nullable = false, unique = true)
	private int citizenVoterId;
	private String citizenFirstName;
	private String citizenMiddleName;
	private String citizenLastName;
	@OneToOne
	@JoinColumn(name="adhar_No", nullable = false)
	private AdharCard adharNo;
	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Citizen(int citizenVoterId, String citizenFirstName, String citizenMiddleName, String citizenLastName,
			AdharCard adharNo) {
		super();
		this.citizenVoterId = citizenVoterId;
		this.citizenFirstName = citizenFirstName;
		this.citizenMiddleName = citizenMiddleName;
		this.citizenLastName = citizenLastName;
		this.adharNo = adharNo;
	}
	@Override
	public String toString() {
		return "Citizen [citizenVoterId=" + citizenVoterId + ", citizenFirstName=" + citizenFirstName
				+ ", citizenMiddleName=" + citizenMiddleName + ", citizenLastName=" + citizenLastName + ", adharNo="
				+ adharNo + "]";
	}
	public int getCitizenVoterId() {
		return citizenVoterId;
	}
	public void setCitizenVoterId(int citizenVoterId) {
		this.citizenVoterId = citizenVoterId;
	}
	public String getCitizenFirstName() {
		return citizenFirstName;
	}
	public void setCitizenFirstName(String citizenFirstName) {
		this.citizenFirstName = citizenFirstName;
	}
	public String getCitizenMiddleName() {
		return citizenMiddleName;
	}
	public void setCitizenMiddleName(String citizenMiddleName) {
		this.citizenMiddleName = citizenMiddleName;
	}
	public String getCitizenLastName() {
		return citizenLastName;
	}
	public void setCitizenLastName(String citizenLastName) {
		this.citizenLastName = citizenLastName;
	}
	public AdharCard getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(AdharCard adharNo) {
		this.adharNo = adharNo;
	}

	

}
