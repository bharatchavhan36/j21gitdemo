package com.tut.HotelProject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Service_info")
public class Services {
	@Id
	private int serviceId;
	private String serviceName;
	private double serviceCost;
	@ManyToOne
	private Reservation reservation;
	public Services() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Services(int serviceId, String serviceName, double serviceCost, Reservation reservation) {
		super();
		this.serviceId = serviceId;
		this.serviceName = serviceName;
		this.serviceCost = serviceCost;
		this.reservation = reservation;
	}
	@Override
	public String toString() {
		return "Services [serviceId=" + serviceId + ", serviceName=" + serviceName + ", serviceCost=" + serviceCost
				+ ", reservation=" + reservation + "]";
	}
	public int getServiceId() {
		return serviceId;
	}
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public double getServiceCost() {
		return serviceCost;
	}
	public void setServiceCost(double serviceCost) {
		this.serviceCost = serviceCost;
	}
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	
}
