package com.first.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.first.hibernate.entity.Employee;
import com.first.hibernate.model.CustomerModel;
import com.first.hibernate.model.ImageModel;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		

//		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//		Session session = sessionFactory.openSession();
//		session.beginTransaction();
//
//		Employee host = new Employee(4, "Mustafa");
//		session.save(host);
//
//		session.getTransaction().commit();
//		session.close();
//
//		sessionFactory.close();
//
//		ImageModel model = new ImageModel();
//		model.saveImage();
//		System.out.println("image saved successfully");
		
		System.out.println("Customer model called");
		
		CustomerModel model2 = new CustomerModel();
		model2.saveCustomer();
		System.out.println("customer saved");

	}
}
