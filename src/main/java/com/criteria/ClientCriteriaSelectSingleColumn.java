package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.HiberantePrac.Student;

public class ClientCriteriaSelectSingleColumn {

	public static void main(String[] args) {

		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Criteria c=session.createCriteria(Student.class);
		//c.add(Restrictions.eq("stname", "Akanksha"));
		Projection p1=Projections.property("stname");
		c.setProjection(p1);
		List<String> list=c.list();
		{
			for(String s:list)
			{
				System.out.println(s);
			}
		}
		
	}

}
