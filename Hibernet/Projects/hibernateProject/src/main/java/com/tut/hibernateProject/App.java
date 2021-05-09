package com.tut.hibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
      
        Student st = new Student(102, "Manoday", "Chndrapur");
        Session session = sf.openSession();
        
        Transaction tr = session.beginTransaction();
        session.save(st);
        tr.commit();
        session.close();
    }
}
