package com.mapping.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestWitXml {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Teacher t = new Teacher(101, "Yogesh", "Beed");
        Session session = sf.openSession();
        Transaction t1 = session.beginTransaction();
        session.save(t);
        t1.commit();
        session.close();
        sf.close();
        System.out.println("TestWithXml completed....!");
        
        
	}

}
