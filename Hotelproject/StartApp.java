package com.hibernate.hotel.Hotelproject;

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
		props.put(Environment.PASS,"Pranad@2016");
		props.put(Environment.HBM2DDL_AUTO,"create");
		props.put(Environment.SHOW_SQL,"show_sql");
		props.put(Environment.FORMAT_SQL,"FORMAT_SQL");
		cfg.setProperties(props);
//		cfg.addAnnotatedClass();
		ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
		return cfg.buildSessionFactory(registry);
		}
	public static void main(String[] args) {
		 SessionFactory sfactory = NoOrmXml();
		 System.out.println(sfactory);
		
	}

}
