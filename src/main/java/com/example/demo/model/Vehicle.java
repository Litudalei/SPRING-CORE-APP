package com.example.demo.model;

public class Vehicle {
	private String name;

	public Vehicle() {
		super();
	 System.out.println("Vehicle class got created");	// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + "]";
	}

}
