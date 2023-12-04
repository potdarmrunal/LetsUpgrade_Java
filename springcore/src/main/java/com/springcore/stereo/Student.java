package com.springcore.stereo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class Student {
	@Value("Mrunali")
	private String name;
	@Value("Pune")
	private String city;
	@Value("#{address}")
	private List<String> address;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", address=" + address + "]";
	}
	
	
	
	

}
