package com.first.hibernate.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.first.hibernate.entity.Employee;
import com.first.hibernate.entity.Image;

public class ImageModel {

	public void saveImage() {
		
		SessionFactory sessionFactory = new Configuration().configure()
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        
        
        Image em=new Image();
        em.setName("khanbhai");
        em.setX(1);
        
        FileInputStream is;
        byte[] img = null;
		try {
			is = new FileInputStream("C:/Users/mohdm/git/repository12/firsthibernate/src/main/java/ecom3.jpg");
			img=new byte[is.available()]  ;
	        is.read();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        em.setImage(img);
       
        
       
        session.save(em);
        
        

        

        session.getTransaction().commit();
        session.close();

        sessionFactory.close();
		
		
		
	}

	
	
}
