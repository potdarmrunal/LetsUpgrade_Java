package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"com/springcore/standalone/collections/aloneconfig.xml");
		Person p = (Person) ac.getBean("frd");
		System.out.println(p);
		System.out.println("name of java class" + p.getFriends().getClass().getName());
	}

}
