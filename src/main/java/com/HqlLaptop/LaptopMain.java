package com.HqlLaptop;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LaptopMain {

	public static void main(String[] args) {

		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Laptop.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
//		Laptop l1=new Laptop("Windows",1, 32000);
//		Laptop l2=new Laptop("Windows1",2, 50000);
//		Laptop l3=new Laptop("Windows2",3, 42000);
//		session.save(l1);
//		session.save(l2);
//		session.save(l3);
//		tx.commit();
		
//		Query<Laptop> query=session.createQuery("from Laptop");
//		List<Laptop> llist=query.list();
//		for (Laptop laptop : llist) {
//			System.out.println(laptop);
//		}
		

//		Query<Laptop> query=session.createQuery("from Laptop where price=50000");
//		List<Laptop> llist=query.list();
//		for (Laptop laptop : llist) {
//			System.out.println(laptop);
//		}
		
		Query<String> query=session.createQuery("select lname from Laptop where price>40000");
		List<String> llist=query.list();
		for (String laptop : llist) {
			System.out.println(laptop);
		}
		
		
		
		session.close();
		System.out.println("Process Done............");
		
	}

}
