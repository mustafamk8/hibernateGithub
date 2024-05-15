package com.first.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.first.hibernate.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args){
        System.out.println("Hello World");

        SessionFactory sessionFactory = new Configuration().configure()
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Employee host = new Employee(2, "Mustafa");
        session.save(host);

        session.getTransaction().commit();
        session.close();

        sessionFactory.close();
    }
}
