package com.springcore.springcore;

public class BeanLifeCycle {

	private String name;

	public BeanLifeCycle(String name) {
		super();
		this.name = name;
		System.out.println("Constructor calling");
	}

	public BeanLifeCycle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BeanLifeCycle [name=" + name + "]";
	}
	
	public void init() {
		System.out.println("Inside init...");
	}
	
	public void destroy() {
		System.out.println("Destroy .....");
	}
}
