package com.tut.HotelProject;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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
	@OneToOne(mappedBy = "cust_Id", cascade = CascadeType.ALL)
	private Customer customer;
	public Billing() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Billing(int billingNumber, double roomCharge, double miscCharges, long creditCardNumber, Date paymentDate,
			Customer customer) {
		super();
		this.billingNumber = billingNumber;
		this.roomCharge = roomCharge;
		this.miscCharges = miscCharges;
		this.creditCardNumber = creditCardNumber;
		this.paymentDate = paymentDate;
		this.customer = customer;
	}
	
	@Override
	public String toString() {
		return "Billing [billingNumber=" + billingNumber + ", roomCharge=" + roomCharge + ", miscCharges=" + miscCharges
				+ ", creditCardNumber=" + creditCardNumber + ", paymentDate=" + paymentDate + ", customer=" + customer
				+ "]";
	}
	public int getBillingNumber() {
		return billingNumber;
	}
	public void setBillingNumber(int billingNumber) {
		this.billingNumber = billingNumber;
	}
	public double getRoomCharge() {
		return roomCharge;
	}
	public void setRoomCharge(double roomCharge) {
		this.roomCharge = roomCharge;
	}
	public double getMiscCharges() {
		return miscCharges;
	}
	public void setMiscCharges(double miscCharges) {
		this.miscCharges = miscCharges;
	}
	public long getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(long creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	

}
// bno ro ....          custId ctN ...biNo