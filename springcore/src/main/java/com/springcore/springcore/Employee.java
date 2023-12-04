package com.springcore.springcore;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	
	private String eName;
	private List<String> ePhones;
	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	private Set<String> eAddress;
	private Map<String,String> courses;
	private Properties props;

	public Employee() {
		super();
	}
	
	public Employee(String eName, List<String> ePhones, Set<String> eAddress, Map<String, String> courses,
			Properties props) {
		super();
		this.eName = eName;
		this.ePhones = ePhones;
		this.eAddress = eAddress;
		this.courses = courses;
		this.props = props;
	}

	@Override
	public String toString() {
		return "Employee [eName=" + eName + ", ePhones=" + ePhones + ", eAddress=" + eAddress + ", courses=" + courses
				+ ", props=" + props + "]";
	}

	public void seteName(String name) {
		this.eName = name;
	}
	
	public String geteName() {
		return eName;
	}

	public List<String> getePhones() {
		return ePhones;
	}

	public void setePhones(List<String> ePhones) {
		this.ePhones = ePhones;
	}

	public Set<String> geteAddress() {
		return eAddress;
	}

	public void seteAddress(Set<String> eAddress) {
		this.eAddress = eAddress;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	
	
	
	
}
