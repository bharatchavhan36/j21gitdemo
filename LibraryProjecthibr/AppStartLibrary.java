package com.tut.LibraryProjecthibr;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.tut.HqlSqlQuery.NamedNativeQuerySqlManager;
import com.tut.hibernatePractice.Author;

public class AppStartLibrary {

	public static SessionFactory NoOrmXml() throws FileNotFoundException, IOException{
		
		Configuration cfg= new Configuration();
		Properties props =new Properties();
		props.put(Environment.DIALECT,"org.hibernate.dialect.MySQL8Dialect");
		props.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
		props.put(Environment.URL,"jdbc:mysql://localhost:3306/LibraryData");
		props.put(Environment.USER,"root");
		props.put(Environment.PASS,"root");
		props.put(Environment.HBM2DDL_AUTO,"create");
		props.put(Environment.SHOW_SQL,true);
		props.put(Environment.FORMAT_SQL,true);
		
		cfg.addAnnotatedClass(Customer.class);
		cfg.addAnnotatedClass(Book.class);
		cfg.addAnnotatedClass(Librarion.class);
		
		
		cfg.setProperties(props);	
		ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
		return cfg.buildSessionFactory(registry);
	}
	public static void main(String[] args) throws FileNotFoundException, IOException {
		SessionFactory sfactory = NoOrmXml();
		Session s = sfactory.openSession();
		Transaction tr = s.beginTransaction();
		List<Customer> customer1 = new ArrayList<>();
		Customer cust1 = new Customer("AAAA1","AAAA1@gmail.com");
		cust1.setCustId(1);
		Customer cust2 = new Customer("AAAA2","AAAA2@gmail.com");
		customer1.add(cust1);
		customer1.add(cust2);
		
		
		List<Book> book = new ArrayList<>();
		Date startDate1 = new Date();
		startDate1.setDate(12-05-2012);
		Date endDate1 = new Date();
		endDate1.setDate(12-06-2012);
		Book b1 = new Book(101, "Chava1", 3, 560, startDate1, endDate1);
		Date startDate2 = new Date();
		startDate2.setDate(01-05-2012);
		Date endDate2 = new Date();
		endDate2.setDate(01-06-2012);
		Book b2 = new Book(102, "Chava1", 3, 560, startDate2, endDate2);
		Date startDate3 = new Date();
		startDate3.setDate(04-04-2012);
		Date endDate3 = new Date();
		endDate3.setDate(04-11-2012);
		Book b3 = new Book(103, "Chava1", 3, 560, startDate3, endDate3);
		book.add(b1);
		book.add(b2);
		book.add(b3);
		
		
		Librarion libr1 = new Librarion("ZZZZ","ZZZZ@gmail.com", customer1, book);
		libr1.setLibrId(1001);
		s.save(libr1);
		s.flush();
		tr.commit();
		s.close();
		
	
	}

}
