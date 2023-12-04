package com.springcore.stereo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/springcore/stereo/stereoconfig.xml");
		Student s = (Student) ac.getBean("student",Student.class);
		System.out.println(s);
	}

}
