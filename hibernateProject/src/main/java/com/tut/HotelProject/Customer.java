package com.tut.HotelProject;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cust_info")
public class Customer {
	@Id
	private int custId;
	private String custName;
	private long custPhone;
	@OneToOne
	private Address custAddress;
	private String custPancard;
	@OneToOne//Comp
	private Billing billing;
	@OneToMany(mappedBy = "res_Id", cascade = CascadeType.ALL)
	@JoinTable(
	        name = "Customer_Reservation", // 3rd table name
	        joinColumns = 
	        @JoinColumn(			//joinColumns --> self la
	                name = "cust_Id",unique = false, // THIS REPR->ADRID CH NAME KAY ASEL 3RD TABLE MADHE
	                referencedColumnName = "custId" // YA TABLE KONTA COLUMN--> CONSIDER KARYCHA AHE
	        		),
	        inverseJoinColumns = 
	        @JoinColumn(	// OPPS SIDE CHA		// inverseJoinColumns--> relationship wala table
	                name = "res_Id",unique = true,
	                referencedColumnName = "resId"
	        )
	)
	private List<Reservation> reservation;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public long getCustPhone() {
		return custPhone;
	}
	public void setCustPhone(long custPhone) {
		this.custPhone = custPhone;
	}
	public Address getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(Address custAddress) {
		this.custAddress = custAddress;
	}
	public String getCustPancard() {
		return custPancard;
	}
	public void setCustPancard(String custPancard) {
		this.custPancard = custPancard;
	}
	public Billing getBilling() {
		return billing;
	}
	public void setBilling(Billing billing) {
		this.billing = billing;
	}
	public List<Reservation> getReservation() {
		return reservation;
	}
	public void setReservation(List<Reservation> reservation) {
		this.reservation = reservation;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custPhone=" + custPhone + ", custAddress="
				+ custAddress + ", custPancard=" + custPancard + ", billing=" + billing + ", reservation=" + reservation
				+ "]";
	}
	public Customer(int custId, String custName, long custPhone, Address custAddress, String custPancard,
			Billing billing, List<Reservation> reservation) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custPhone = custPhone;
		this.custAddress = custAddress;
		this.custPancard = custPancard;
		this.billing = billing;
		this.reservation = reservation;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
