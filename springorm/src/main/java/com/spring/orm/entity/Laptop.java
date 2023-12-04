package com.spring.orm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jpa_laptop")
public class Laptop {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String modal_id;
	private String brand;

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(int id, String modal_id, String brand) {
		super();
		this.id = id;
		this.modal_id = modal_id;
		this.brand = brand;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModal_id() {
		return modal_id;
	}

	public void setModal_id(String modal_id) {
		this.modal_id = modal_id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", modal_id=" + modal_id + ", brand=" + brand + "]";
	}

}
