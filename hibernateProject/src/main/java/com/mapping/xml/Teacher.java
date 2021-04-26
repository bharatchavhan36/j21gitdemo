package com.mapping.xml;

public class Teacher {
	private int teacherId;
	private String teacherName;
	private String teacherAdrs;
	
	public Teacher(int teacherId, String teacherName, String teacherAdrs) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.teacherAdrs = teacherAdrs;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherAdrs() {
		return teacherAdrs;
	}
	public void setTeacherAdrs(String teacherAdrs) {
		this.teacherAdrs = teacherAdrs;
	}
	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", teacherAdrs=" + teacherAdrs
				+ "]";
	}
	
	

}
