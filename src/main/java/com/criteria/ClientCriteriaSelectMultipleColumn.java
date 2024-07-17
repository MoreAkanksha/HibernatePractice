package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.HiberantePrac.Student;

public class ClientCriteriaSelectMultipleColumn {

	public static void main(String[] args) {

		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Criteria c=session.createCriteria(Student.class);
		Projection p=Projections.property("stname");
		Projection p1=Projections.property("RollNo");
		Projection p2=Projections.property("age");

		ProjectionList pr=Projections.projectionList();
		pr.add(p);
		pr.add(p1);
		pr.add(p2);
		
		c.setProjection(pr);
		
		
		List<Object[]> list=c.list();
		
			for(Object[] s:list)
			{
				for(Object o:s) {
				System.out.print(o+"\t");
				}
				System.out.println();
			}
			
		
		
	}

}
