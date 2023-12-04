package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student s = ac.getBean("student",Student.class);
		System.out.println(s);

	}

}
