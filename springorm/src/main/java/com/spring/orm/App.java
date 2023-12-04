package com.spring.orm;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entity.Student;

import org.springframework.context.ApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
        System.out.println( "Hello World!" );
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		
		StudentDao studentDao = ac.getBean("studentDao", StudentDao.class);
		
		Student student = new Student(2,"lmn","XYZ");
		
//		int s = studentDao.insert(student);
//		System.out.println("row" +  s);
//		
//
//		 Student student1 = studentDao.getSingleStudent(1);
//		System.out.println(student1);
//		
//		Student student2 = (Student) studentDao.getallStudents();
//		System.out.println(student2);
		
//		studentDao.deleteStudent(1);
    }
}
