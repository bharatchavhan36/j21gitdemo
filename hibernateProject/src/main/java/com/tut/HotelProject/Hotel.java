package com.tut.HotelProject;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="hotel_info")
public class Hotel {
	@Id
	private int hotelId;
	private String hotelName;
	@OneToOne
	private Address hotelAddress;
	private String hotelOwnerName;
	private long hotelphone;
	@OneToMany(mappedBy = "rooms_Id", cascade = CascadeType.ALL)
	private List<Rooms> rooms;
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel(int hotelId, String hotelName, Address hotelAddress, String hotelOwnerName, long hotelphone,
			List<Rooms> rooms) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.hotelAddress = hotelAddress;
		this.hotelOwnerName = hotelOwnerName;
		this.hotelphone = hotelphone;
		this.rooms = rooms;
	}
	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelAddress=" + hotelAddress
				+ ", hotelOwnerName=" + hotelOwnerName + ", hotelphone=" + hotelphone + ", rooms=" + rooms + "]";
	}
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public Address getHotelAddress() {
		return hotelAddress;
	}
	public void setHotelAddress(Address hotelAddress) {
		this.hotelAddress = hotelAddress;
	}
	public String getHotelOwnerName() {
		return hotelOwnerName;
	}
	public void setHotelOwnerName(String hotelOwnerName) {
		this.hotelOwnerName = hotelOwnerName;
	}
	public long getHotelphone() {
		return hotelphone;
	}
	public void setHotelphone(long hotelphone) {
		this.hotelphone = hotelphone;
	}
	public List<Rooms> getRooms() {
		return rooms;
	}
	public void setRooms(List<Rooms> rooms) {
		this.rooms = rooms;
	}
	
	

}
