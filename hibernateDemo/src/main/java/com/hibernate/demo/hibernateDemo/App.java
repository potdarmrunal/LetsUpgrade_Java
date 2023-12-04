package com.hibernate.demo.hibernateDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("Hello World!");

		Configuration cfg = new Configuration();
		cfg.configure("com/hibernate/demo/hibernateDemo/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		System.out.println(factory);
		
		Student s = new Student(1,"Mrunali","Latur");
		Address ad = new Address();
		ad.setAddedDate(new Date());
		ad.setAddressID(1);
		ad.setCity("Latur");
		ad.setOpen(true);
		ad.setStreet("Ramteakdy");
		ad.setX(123.456);
		
		FileInputStream fis = new FileInputStream("src/main/java/com/hibernate/demo/hibernateDemo/1.jpg");
		byte[] data = new byte[fis.available()];
//		ad.setImage(data);
		System.out.println(s);
		
		Session session = factory.openSession();
//		session.beginTransaction();
//		session.save(s); 
//		session.save(ad);
//		session.getTransaction().commit();
		
		
		Student s1 = (Student) session.get(Student.class, 1);
		
		System.out.println(s1);
		
		Student s2 = (Student) session.load(Student.class, 1);
		
		System.out.println(s2);
		System.out.println(s2.getCity());
		
		session.close();
	}
}
