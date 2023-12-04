package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("com/mapping/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Question q1 = new Question();
		q1.setQuestionId(1);
		q1.setQuestion("@Embeddable ? ");
		
		Answer ans = new Answer();
		ans.setAnswer_id(1);
		ans.setAnswer("Add data member to other table");
		
		q1.setAnswer(ans);
		
		
		Question q2 = new Question();
		q2.setQuestionId(2);
		q2.setQuestion("@Temporal ? ");
		
		Answer ans1 = new Answer();
		ans1.setAnswer_id(2);
		ans1.setAnswer("Format date");
		
		q2.setAnswer(ans1);
		
		ans.setQuestion(q1);
		ans1.setQuestion(q2);
		
		Transaction tx = session.beginTransaction();
		session.save(q1);
		session.save(ans1);
		session.save(ans);
		session.save(q2);
		tx.commit();
		
		//---------
		session.load(Question.class, 1);
		System.out.println(q1.getQuestion());
		System.out.println(q1.getAnswer().getAnswer());
		factory.close();
	}

}
