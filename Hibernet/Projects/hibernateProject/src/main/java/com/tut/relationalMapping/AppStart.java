package com.tut.relationalMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppStart {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		SessionFactory session = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
		//set Citizen Object values
		Citizen c1 = new Citizen();
		c1.setCitizenVoterId(1001);
		c1.setCitizenFirstName("Amol");
		c1.setCitizenMiddleName("Chandrakant");
		c1.setCitizenLastName("Kitekar");		
		AdharCard a1 = new AdharCard(45124678, "Latur");
		c1.setAdharNo(a1);
		
		
		
		Citizen c2 = new Citizen();
		c2.setCitizenVoterId(1002);
		c2.setCitizenFirstName("Vishal");
		c2.setCitizenMiddleName("Chandrakant");
		c2.setCitizenLastName("Kitekar");		
		AdharCard a2 = new AdharCard(45127894, "Delhi");
		c1.setAdharNo(a2);
		
		Session ss = session.openSession();
		Transaction tr = ss.beginTransaction();
		ss.save(c1);
		ss.save(c2);
		ss.save(a1);
		ss.save(a2);
		tr.commit();
		ss.close();
		session.close();
		

	}

}
