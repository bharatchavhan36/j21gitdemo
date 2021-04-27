package com.hibernate.hotel.Hotelproject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Service_info")
public class Services {
	@Id
private int serviceId;
private String serviceName;
private double serviceCost;




}
