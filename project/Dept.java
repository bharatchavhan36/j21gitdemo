package maping.project;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


public class Dept {					
	private String deptCode;
	private String deptName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(
	        name = "DEPT_STUDENTS",
	        joinColumns = @JoinColumn(
	                name = "DEPT_ID",unique = false,
	                referencedColumnName = "deptCode"
	        ),
	        inverseJoinColumns = @JoinColumn(
	                name = "STUD_ID",unique = true,
	                referencedColumnName = "studId"
	        )
	)
	private List<Student> students;
	
	@ManyToMany
	@JoinTable(
	        name = "DEPT_PROFS",
	        joinColumns = @JoinColumn(
	                name = "DEPT_ID",unique = false,
	                referencedColumnName = "deptCode"
	        ),
	        inverseJoinColumns = @JoinColumn(
	                name = "PROF_ID",unique = false,
	                referencedColumnName = "profId"
	        )
	)
	private List<Professors> professors;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(
	        name = "DEPT_COURSES",
	        joinColumns = @JoinColumn(
	                name = "DEPT_ID",unique = false,
	                referencedColumnName = "deptCode"
	        ),
	        inverseJoinColumns = @JoinColumn(
	                name = "COURSE_ID",unique = true,
	                referencedColumnName = "courseId"
	        )
	)
	private List<Course> courses;

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Professors> getProfessors() {
		return professors;
	}

	public void setProfessors(List<Professors> professors) {
		this.professors = professors;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Dept [deptCode=" + deptCode + ", deptName=" + deptName + ", students=" + students + ", professors="
				+ professors + ", courses=" + courses + "]";
	}

	public Dept(String deptCode, String deptName, List<Student> students, List<Professors> professors,
			List<Course> courses) {
		super();
		this.deptCode = deptCode;
		this.deptName = deptName;
		this.students = students;
		this.professors = professors;
		this.courses = courses;
	}

	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
