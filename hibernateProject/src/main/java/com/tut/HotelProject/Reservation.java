package com.tut.HotelProject;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinTable(
	        name = "Reseravation_Customer", // 3rd table name
	        joinColumns = 
	        @JoinColumn(			//joinColumns --> self la
	                name = "res_Id",unique = true, // THIS REPR->ADRID CH NAME KAY ASEL 3RD TABLE MADHE
	                referencedColumnName = "resId" // YA TABLE KONTA COLUMN--> CONSIDER KARYCHA AHE
	        		),
	        inverseJoinColumns = 
	        @JoinColumn(	// OPPS SIDE CHA		// inverseJoinColumns--> relationship wala table
	                name = "cust_Id",unique = false,
	                referencedColumnName = "custId"
	        )
	)
	private Customer customer;
	@OneToMany(mappedBy = "service_Id", cascade = CascadeType.ALL)
	@JoinTable(
	        name = "Reseravation_Services", // 3rd table name
	        joinColumns = 
	        @JoinColumn(			//joinColumns --> self la
	                name = "res_Id",unique = false, // THIS REPR->ADRID CH NAME KAY ASEL 3RD TABLE MADHE
	                referencedColumnName = "resId" // YA TABLE KONTA COLUMN--> CONSIDER KARYCHA AHE
	        		),
	        inverseJoinColumns = 
	        @JoinColumn(	// OPPS SIDE CHA		// inverseJoinColumns--> relationship wala table
	                name = "service_Id",unique = true,
	                referencedColumnName = "serviceId"
	        )
	)
	private List<Services> services;
	
	@OneToMany(mappedBy = "rooms_Id")
	private List<Rooms> rooms;

	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reservation(int resId, Date rescheckInDate, Date rescheckOutDate, String resStatus, int noOfGuest,
			Date resDate, Customer customer, List<Services> services, List<Rooms> rooms) {
		super();
		this.resId = resId;
		this.rescheckInDate = rescheckInDate;
		this.rescheckOutDate = rescheckOutDate;
		this.resStatus = resStatus;
		this.noOfGuest = noOfGuest;
		this.resDate = resDate;
		this.customer = customer;
		this.services = services;
		this.rooms = rooms;
	}

	@Override
	public String toString() {
		return "Reservation [resId=" + resId + ", rescheckInDate=" + rescheckInDate + ", rescheckOutDate="
				+ rescheckOutDate + ", resStatus=" + resStatus + ", noOfGuest=" + noOfGuest + ", resDate=" + resDate
				+ ", customer=" + customer + ", services=" + services + ", rooms=" + rooms + "]";
	}

	public int getResId() {
		return resId;
	}

	public void setResId(int resId) {
		this.resId = resId;
	}

	public Date getRescheckInDate() {
		return rescheckInDate;
	}

	public void setRescheckInDate(Date rescheckInDate) {
		this.rescheckInDate = rescheckInDate;
	}

	public Date getRescheckOutDate() {
		return rescheckOutDate;
	}

	public void setRescheckOutDate(Date rescheckOutDate) {
		this.rescheckOutDate = rescheckOutDate;
	}

	public String getResStatus() {
		return resStatus;
	}

	public void setResStatus(String resStatus) {
		this.resStatus = resStatus;
	}

	public int getNoOfGuest() {
		return noOfGuest;
	}

	public void setNoOfGuest(int noOfGuest) {
		this.noOfGuest = noOfGuest;
	}

	public Date getResDate() {
		return resDate;
	}

	public void setResDate(Date resDate) {
		this.resDate = resDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Services> getServices() {
		return services;
	}

	public void setServices(List<Services> services) {
		this.services = services;
	}

	public List<Rooms> getRooms() {
		return rooms;
	}

	public void setRooms(List<Rooms> rooms) {
		this.rooms = rooms;
	}
	
	
	
	
	

}
