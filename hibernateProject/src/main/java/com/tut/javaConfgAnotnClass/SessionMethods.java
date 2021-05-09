package com.tut.javaConfgAnotnClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;




public class SessionMethods {
	public static SessionFactory noOrmXmlMapping() {
		Configuration config = new Configuration();
		Properties prop = new Properties();
		prop.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
		prop.put(Environment.URL, "jdbc:mysql://localhost:3306/ormdb");
		prop.put(Environment.USER, "root");
		prop.put(Environment.PASS, "root");
		prop.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
		prop.put(Environment.SHOW_SQL,"show_sql");
		prop.put(Environment.FORMAT_SQL,"format_sql");
		//optional properties
		prop.put(Environment.HBM2DDL_AUTO,"create");
		config.setProperties(prop);
		config.addAnnotatedClass(com.tut.javaConfgAnotnClass.Address.class);
		config.addAnnotatedClass(com.tut.javaConfgAnotnClass.Employee.class);
		
		ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		return config.buildSessionFactory(registry);
	}

	public static void main(String[] args) {
		SessionFactory sfactory = noOrmXmlMapping();
		Address ad1 = new Address("Latur", "MH", 413512);
		Address ad2 = new Address("Pune", "MH", 411003);
		List<Address> al = new ArrayList<>();
		al.add(ad1);
		al.add(ad2);
		Employee emp1 = new Employee(101, "AAA", 1254.78, al);
		Session session = sfactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(emp1);	
		tr.commit();
		session.close();
		System.exit(0);
		

	}

}
