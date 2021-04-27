package maping.project;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Course {					
	@Id
	private int courseId;
	private String courseName;
	private double courseFees;
	
	@ManyToMany(mappedBy = "courses")
	private List<Student> students;
	
	@ManyToMany(mappedBy = "courses")
	private List<Professors> professors;

	public Course(int courseId, String courseName, double courseFees, List<Student> students,
			List<Professors> professors) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseFees = courseFees;
		this.students = students;
		this.professors = professors;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseFees=" + courseFees
				+ ", students=" + students + ", professors=" + professors + "]";
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getCourseFees() {
		return courseFees;
	}

	public void setCourseFees(double courseFees) {
		this.courseFees = courseFees;
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
	
	
	
	


}
