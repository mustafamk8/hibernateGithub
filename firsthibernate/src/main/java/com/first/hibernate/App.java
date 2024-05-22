package com.first.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.first.hibernate.entity.Answer;
import com.first.hibernate.entity.Employee;
import com.first.hibernate.entity.Question;
import com.first.hibernate.model.CustomerModel;
import com.first.hibernate.model.ImageModel;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
//		Question q1 = new Question();
//		q1.setQuestion("what is java");
//		q1.setQuestionId(1);
//		
//		Answer a1 = new Answer();
//		a1.setAnswerId(1);
//		a1.setAnswer("java is highlevel");
//		a1.setQuestion(q1);
//		
//		session.save(q1);
//		session.save(a1);
		
		Question q = (Question)session.get(Question.class, 1);
		System.out.println(q.getQuestionId());
		System.out.println(q.getQuestion());
		System.out.println(q.getAnswers());
		
		
		
		
//
//		Employee host = new Employee(4, "Mustafa");
//		session.save(host);
//
		session.getTransaction().commit();
		session.close();

		sessionFactory.close();
//
//		ImageModel model = new ImageModel();
//		model.saveImage();
//		System.out.println("image saved successfully");
		
//		System.out.println("Customer model called");
//		
//		CustomerModel model2 = new CustomerModel();
//		model2.saveCustomer();
//		System.out.println("customer saved");

	}
}
