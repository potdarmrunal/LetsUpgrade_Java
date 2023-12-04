package com.springcore.springcore;

import java.util.List;

public class ConstructorInjection {
	
	private int id;
	private String name;
	private CIRef certi;
	private List<String> list;
	
	public ConstructorInjection(int id, String name,CIRef certi,List<String> list) {
		super();
		this.id = id;
		this.name = name;
		this.certi = certi;
		this.list = list;
	}

	@Override
	public String toString() {
		return "ConstructorInjection [id=" + id + ", name=" + name + ", certi=" + certi + ", list=" + list + "]";
	}

	

}
