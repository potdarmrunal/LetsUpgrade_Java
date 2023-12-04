package com.springcore.springcore;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanCycleUsingInterface implements InitializingBean, DisposableBean {
	
	private String name;

	public BeanCycleUsingInterface() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BeanCycleUsingInterface(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "BeanCycleUsingInterface [name=" + name + "]";
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy............");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("After property set");
	}
	
	

}
