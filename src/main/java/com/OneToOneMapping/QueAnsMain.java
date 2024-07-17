package com.OneToOneMapping;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class QueAnsMain {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Question.class);
		cfg.addAnnotatedClass(Answer.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session= factory.openSession();
		Transaction tx=session.beginTransaction();
		Question que=new Question("What is Hibernate?");
		Answer a1=new Answer(23, "Hibernate is ORM tool");
		que.setAnsid(a1);
		session.save(que);
		tx.commit();
		session.close();
		System.out.println("Process done......");
		
		
		
	}

}
