package com.tut.LibraryProjecthibr;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Librarion_info")
public class Librarion {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int librId;
	private String librName;
	private String librEmail;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Customer> customer;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Book> book;
	public Librarion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Librarion(String librName, String librEmail, List<Customer> customer, List<Book> book) {
		super();
	//	this.librId = librId;
		this.librName = librName;
		this.librEmail = librEmail;
		this.customer = customer;
		this.book = book;
	}
	@Override
	public String toString() {
		return "Librarion [librId=" + librId + ", librName=" + librName + ", librEmail=" + librEmail + ", customer="
				+ customer + ", book=" + book + "]";
	}
	public int getLibrId() {
		return librId;
	}
	public void setLibrId(int librId) {
		this.librId = librId;
	}
	public String getLibrName() {
		return librName;
	}
	public void setLibrName(String librName) {
		this.librName = librName;
	}
	public String getLibrEmail() {
		return librEmail;
	}
	public void setLibrEmail(String librEmail) {
		this.librEmail = librEmail;
	}
	public List<Customer> getCustomer() {
		return customer;
	}
	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}
	public List<Book> getBook() {
		return book;
	}
	public void setBook(List<Book> book) {
		this.book = book;
	}
	
	
}
