package com.tut.javaConfgAnotnClass;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Emp_Info")
public class Employee {
	@Id
	private int empId;
	private String empName;
	private double empSallary;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(
	        name = "Emp_Address",
	        joinColumns = @JoinColumn(
	                name = "eid",unique = false,
	                referencedColumnName = "empId"
	        ),
	        inverseJoinColumns = @JoinColumn(
	                name = "city",unique = true,
	                referencedColumnName = "city"
	        )
	)
	private List<Address> address;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, double empSallary, List<Address> address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSallary = empSallary;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSallary=" + empSallary + ", address="
				+ address + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSallary() {
		return empSallary;
	}
	public void setEmpSallary(double empSallary) {
		this.empSallary = empSallary;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}

}
