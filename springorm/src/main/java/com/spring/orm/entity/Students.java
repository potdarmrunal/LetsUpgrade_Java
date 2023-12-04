package com.spring.orm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="jpa_student")
public class Students {
	
	@Id
	private int studetId;
	private String studentName;
	private String about;
	
	@OneToOne
	private Laptop laptop;

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(int studetId, String studentName, String about, Laptop laptop) {
		super();
		this.studetId = studetId;
		this.studentName = studentName;
		this.about = about;
		this.laptop = laptop;
	}
	
	
	
}
