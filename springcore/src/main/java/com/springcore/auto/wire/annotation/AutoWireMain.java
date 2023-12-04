package com.springcore.auto.wire.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class AutoWireMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac= new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/autoconfig.xml");
		Emp e = (Emp)ac.getBean("emp1");
		System.out.println(e);
	}
	
	//byName ==> jr address name milala nahi tr null show karat ,  jr 2 address dile tr exception through karat bean name already in use ,  ani jr bean name chnage kel class same astil tr name val execute hot
	//byType ==> Unsatisfied dependency expressed through bean property 'address'; nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type 'com.springcore.auto.wire.Address' available: expected single matching bean but found 2: address,address1
	//constructor ==>  Configuration problem: Bean name 'address' is already used in this <beans> element
	//Offending resource: class path resource [com/springcore/auto/wire/autoconfig.xml] ==> seperate name change asel tr chalat
	//byname -uses setter injection @Autowire can be used on set method or on construtor or on property
	
}
