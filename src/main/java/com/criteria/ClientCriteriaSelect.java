package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.HiberantePrac.Student;

public class ClientCriteriaSelect {

	public static void main(String[] args) {

		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Criteria c=session.createCriteria(Student.class);
		List<Student> list=c.list();
		{
			for(Student s:list)
			{
				System.out.println(s);
			}
		}
		
	}

}
