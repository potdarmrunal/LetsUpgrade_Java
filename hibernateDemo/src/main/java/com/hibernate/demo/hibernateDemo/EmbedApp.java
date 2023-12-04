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
public class EmbedApp {
	public static void main(String[] args) throws IOException {
		System.out.println("Hello World!");

		Configuration cfg = new Configuration();
		cfg.configure("com/hibernate/demo/hibernateDemo/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		System.out.println(factory);
		
//		Student s = new Student(1,"Mrunali","Latur");
//		Address ad = new Address();
//		ad.setAddedDate(new Date());
//		ad.setAddressID(1);
//		ad.setCity("Latur");
//		ad.setOpen(true);
//		ad.setStreet("Ramteakdy");
//		ad.setX(123.456);
//		
//		FileInputStream fis = new FileInputStream("src/main/java/com/hibernate/demo/hibernateDemo/1.jpg");
//		byte[] data = new byte[fis.available()];
////		ad.setImage(data);
//		System.out.println(s);
		Student2 stud = new Student2();
		stud.setId(2);
		stud.setName("darshan");
		stud.setCity("Pune");
		
		Certificate cert = new Certificate();
		cert.setCourseName("Java");
		cert.setDuration(5);
		
		stud.setCert(cert);
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(stud); 
		
		session.getTransaction().commit();
		
		
		Student2 s1 = (Student2) session.get(Student2.class, 1);
		
		System.out.println(s1);
		
		
		session.close();
	}
}
