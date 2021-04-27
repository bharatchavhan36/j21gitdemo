package maping.project;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




@Entity
@Table
public class Student {
	@Id
	private int studId;
	private String studName;
	private double studFees;
	private int studAge;
	
	@ManyToMany
	@JoinTable(
	        name = "STUD_COURSES",
	        joinColumns = @JoinColumn(
	                name = "STUD_ID",unique = false,
	                referencedColumnName = "studId"
	        ),
	        inverseJoinColumns = @JoinColumn(
	                name = "COURSE_ID",unique = false,
	                referencedColumnName = "courseId"
	        )
	)
	private List<Course> courses;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinTable(
	        name = "STUD_ADDRESS",
	        joinColumns = @JoinColumn(
	                name = "STUD_ID",unique = true,
	                referencedColumnName = "studId"
	        ),
	        inverseJoinColumns = @JoinColumn(
	                name = "ADR_ID",unique = false,
	                referencedColumnName = "adrId"
	        )
	)
	private Address address;

	public Student(int studId, String studName, double studFees, int studAge, List<Course> courses,
			Address address) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studFees = studFees;
		this.studAge = studAge;
		this.courses = courses;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studFees=" + studFees + ", studAge="
				+ studAge + ", courses=" + courses + ", address=" + address + "]";
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public double getStudFees() {
		return studFees;
	}

	public void setStudFees(double studFees) {
		this.studFees = studFees;
	}

	public int getStudAge() {
		return studAge;
	}

	public void setStudAge(int studAge) {
		this.studAge = studAge;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
