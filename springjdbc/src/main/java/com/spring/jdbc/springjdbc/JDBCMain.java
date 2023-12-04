package com.spring.jdbc.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.springjdbc.entity.Student;
import com.spring.jdbc.springjdbc.jdbcdao.StudentDao;

public class JDBCMain {
	
	public static void main(String[] args) {
		
		System.out.println("Started....");
		
//		ApplicationContext ac = new ClassPathXmlApplicationContext("com/spring/jdbc/springjdbc/jdbcconfig.xml");
//		JdbcTemplate jdbTemp = (JdbcTemplate) ac.getBean("jdbcTemplate");
		
//		StudentDao studentDao = ac.getBean("studentDao", StudentDao.class);
		
//		Student student = new Student(4,"ABC","XYZ");
//		
//		int s = studentDao.insert(student);
//		System.out.println("row" +  s);
		
//		Student student1 = new Student();
//		student1.setId(2);
//		student1.setName("Pavan");
//		student1.setCity("Pune");
//		int u = studentDao.change(student1);
		
//		System.out.println("row afftected : " + u);
		
//		Student student1 = new Student();
//		student1.setId(3);
//		int d = studentDao.change(student1);
//		System.out.println("row afftected : " + d);
		
//		Student s = new Student();
//		s.setId(1);
//		studentDao.delete(s);
		
//		List<Student> stud = studentDao.getallStudents();
//		
//		for(Student s1:stud) {
//			System.out.println(s1);
//		}
		
//		--------------------------- annotation -----------------------------
		ApplicationContext ac = new AnnotationConfigApplicationContext(JDBCConfig.class);
		StudentDao studentDao = ac.getBean("studentDao", StudentDao.class);
		
//		Student student = new Student(1,"ABC","XYZ");
//		
//		int s = studentDao.insert(student);
//		System.out.println("row" +  s);
		
//		Student s = new Student();
//		s.setId(1);
//		studentDao.delete(s);
		
		List<Student> stud = studentDao.getallStudents();
		
		for(Student s1:stud) {
			System.out.println(s1);
		}
		
	}

}
