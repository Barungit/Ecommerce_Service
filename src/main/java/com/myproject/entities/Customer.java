package com.myproject.entities;

public class Customer {
	
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
