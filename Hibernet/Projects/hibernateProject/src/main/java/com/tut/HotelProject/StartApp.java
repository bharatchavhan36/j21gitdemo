package com.tut.HotelProject;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class StartApp {
	public static SessionFactory NoOrmXml() {
		Configuration cfg= new Configuration();
		Properties props =new Properties();
		props.put(Environment.DIALECT,"org.hibernate.dialect.MySQL8Dialect");
		props.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
		props.put(Environment.URL,"jdbc:mysql://localhost:3306/jdbccontainer");
		props.put(Environment.USER,"root");
		props.put(Environment.PASS,"root");
		props.put(Environment.HBM2DDL_AUTO,"create");
		props.put(Environment.SHOW_SQL,"show_sql");
		props.put(Environment.FORMAT_SQL,"FORMAT_SQL");
		cfg.addAnnotatedClass(Address.class);
		cfg.addAnnotatedClass(Billing.class);
		cfg.addAnnotatedClass(Customer.class);
		cfg.addAnnotatedClass(Services.class);
		cfg.addAnnotatedClass(Reservation.class);
		cfg.addAnnotatedClass(Rooms.class);
		cfg.addAnnotatedClass(Hotel.class);
		cfg.setProperties(props);
//		cfg.addAnnotatedClass();
		
		ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
		return cfg.buildSessionFactory(registry);
		}
	public static void main(String[] args) {
		 SessionFactory sfactory = NoOrmXml();
		 
		
	}

}
