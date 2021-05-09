package com.tut.hibernateProject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity //Once we declare our class as Entity then we can create a tabel
public class Student {
	
	@Id // to mark as primary key
	private int stuId;
	private String stuName;
	private String stuAdrs;
	public Student(int stuId, String stuName, String stuAdrs) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuAdrs = stuAdrs;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuAdrs() {
		return stuAdrs;
	}
	public void setStuAdrs(String stuAdrs) {
		this.stuAdrs = stuAdrs;
	}
	@Override
	public String toString() {
		return "\n [stuId=" + stuId + ", stuName=" + stuName + ", stuAdrs=" + stuAdrs + "]";
	}
	
	

}
