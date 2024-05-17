package com.first.hibernate.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.first.hibernate.entity.Bank;
import com.first.hibernate.entity.Customer;

public class CustomerModel {

	
	public void saveCustomer() {
		SessionFactory sessionFactory = new Configuration().configure()
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        
        Customer c1 = new Customer();
        Bank b1 = new Bank(1, "ICICI");
        c1.setName("Mustafa");
        c1.setBank(b1);
        
        Customer c2 = new Customer();
        Bank b2 = new Bank(2,"HDFC");
        c2.setName("sakshi");
        c2.setBank(b2);
        
        session.save(c1);
        session.save(c2);
        
        session.getTransaction().commit();
        session.close();

        sessionFactory.close();
        
        
	}
	
}
