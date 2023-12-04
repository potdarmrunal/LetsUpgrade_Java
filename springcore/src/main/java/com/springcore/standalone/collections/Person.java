package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	
	private List<String> friends;
	private Map<String,Integer> feeStructure;
	private Properties property;

	public Properties getProperty() {
		return property;
	}

	public void setProperty(Properties property) {
		this.property = property;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(List<String> friends) {
		super();
		this.friends = friends;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, Integer> getFeeStructure() {
		return feeStructure;
	}

	public void setFeeStructure(Map<String, Integer> feeStructure) {
		this.feeStructure = feeStructure;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feeStructure=" + feeStructure + ", property=" + property + "]";
	}


}
