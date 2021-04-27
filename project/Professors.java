package maping.project;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;



public class Professors {				
	@Id
	private int profId;
	private String profName;
	private double profFees;
	private int yearOfExp;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "adrId",unique = true)
	private Address address;

	@ManyToMany
	@JoinTable(
	        name = "PROF_COURSES",
	        joinColumns = @JoinColumn(
	                name = "PROF_ID",unique = false,
	                referencedColumnName = "profId"
	        ),
	        inverseJoinColumns = @JoinColumn(
	                name = "COURSE_ID",unique = true,
	                referencedColumnName = "courseId"
	        )
	)
	private List<Course> courses;

	public Professors(int profId, String profName, double profFees, int yearOfExp, Address address,
			List<Course> courses) {
		super();
		this.profId = profId;
		this.profName = profName;
		this.profFees = profFees;
		this.yearOfExp = yearOfExp;
		this.address = address;
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Professors [profId=" + profId + ", profName=" + profName + ", profFees=" + profFees + ", yearOfExp="
				+ yearOfExp + ", address=" + address + ", courses=" + courses + "]";
	}

	public Professors() {
		super();
		
	}

	public int getProfId() {
		return profId;
	}

	public void setProfId(int profId) {
		this.profId = profId;
	}

	public String getProfName() {
		return profName;
	}

	public void setProfName(String profName) {
		this.profName = profName;
	}

	public double getProfFees() {
		return profFees;
	}

	public void setProfFees(double profFees) {
		this.profFees = profFees;
	}

	public int getYearOfExp() {
		return yearOfExp;
	}

	public void setYearOfExp(int yearOfExp) {
		this.yearOfExp = yearOfExp;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	
	
	
	
}


