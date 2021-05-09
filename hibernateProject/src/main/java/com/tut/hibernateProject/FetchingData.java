package com.tut.hibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchingData {
	public static void main(String[] args) {
		  Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory sf = cfg.buildSessionFactory();
	        Session session = sf.openSession();
	        //get()
	        Student st = session.get(Student.class, 102);
	        System.out.println(st);
	        //load()
	        Student st1 = session.get(Student.class, 102);
	        System.out.println(st1);
	        
	}

}
