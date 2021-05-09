package com.tut.HotelProject;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="rooms_info")
public class Rooms {
	@Id
	private int roomsId;
	private String roomsTypes;
	private double roomsRates;
	private String roomsLocation;
	private int noofBeds;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinTable(
	        name = "Rooms_Reservation", // 3rd table name
	        joinColumns = 
	        @JoinColumn(			//joinColumns --> self la
	                name = "rooms_Id",unique = true, // THIS REPR->ADRID CH NAME KAY ASEL 3RD TABLE MADHE
	                referencedColumnName = "roomsId" // YA TABLE KONTA COLUMN--> CONSIDER KARYCHA AHE
	        		),
	        inverseJoinColumns = 
	        @JoinColumn(	// OPPS SIDE CHA		// inverseJoinColumns--> relationship wala table
	                name = "res_Id",unique = false,
	                referencedColumnName = "resId"
	        )
	)
	private Reservation reservation;
	@ManyToOne
	@JoinTable(
	        name = "Rooms_Hotel", // 3rd table name
	        joinColumns = 
	        @JoinColumn(			//joinColumns --> self la
	                name = "rooms_Id",unique = true, // THIS REPR->ADRID CH NAME KAY ASEL 3RD TABLE MADHE
	                referencedColumnName = "roomsId" // YA TABLE KONTA COLUMN--> CONSIDER KARYCHA AHE
	        		),
	        inverseJoinColumns = 
	        @JoinColumn(	// OPPS SIDE CHA		// inverseJoinColumns--> relationship wala table
	                name = "hotel_Id",unique = false,
	                referencedColumnName = "hotelId"
	        )
	)
	private Hotel hotel;
	public Rooms() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rooms(int roomsId, String roomsTypes, double roomsRates, String roomsLocation, int noofBeds,
			Reservation reservation, Hotel hotel) {
		super();
		this.roomsId = roomsId;
		this.roomsTypes = roomsTypes;
		this.roomsRates = roomsRates;
		this.roomsLocation = roomsLocation;
		this.noofBeds = noofBeds;
		this.reservation = reservation;
		this.hotel = hotel;
	}
	@Override
	public String toString() {
		return "Rooms [roomsId=" + roomsId + ", roomsTypes=" + roomsTypes + ", roomsRates=" + roomsRates
				+ ", roomsLocation=" + roomsLocation + ", noofBeds=" + noofBeds + ", reservation=" + reservation
				+ ", hotel=" + hotel + "]";
	}
	public int getRoomsId() {
		return roomsId;
	}
	public void setRoomsId(int roomsId) {
		this.roomsId = roomsId;
	}
	public String getRoomsTypes() {
		return roomsTypes;
	}
	public void setRoomsTypes(String roomsTypes) {
		this.roomsTypes = roomsTypes;
	}
	public double getRoomsRates() {
		return roomsRates;
	}
	public void setRoomsRates(double roomsRates) {
		this.roomsRates = roomsRates;
	}
	public String getRoomsLocation() {
		return roomsLocation;
	}
	public void setRoomsLocation(String roomsLocation) {
		this.roomsLocation = roomsLocation;
	}
	public int getNoofBeds() {
		return noofBeds;
	}
	public void setNoofBeds(int noofBeds) {
		this.noofBeds = noofBeds;
	}
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
	

}
