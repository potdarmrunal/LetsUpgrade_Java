package com.hibernate.demo.hibernateDemo;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {

	private String courseName;
	private int duration;

	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certificate(String courseName, int duration) {
		super();
		this.courseName = courseName;
		this.duration = duration;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Certificate [courseName=" + courseName + ", duration=" + duration + "]";
	}

}
