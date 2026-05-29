package com.example.demo.model;

public class Person {
private String name;
private Vehicle veh;
public Person() {
	super();
	System.out.println("person got rejected");
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Vehicle getVeh() {
	return veh;
}
public void setVeh(Vehicle veh) {
	this.veh = veh;
}
@Override
public String toString() {
	return "Person [name=" + name + ", veh=" + veh + "]";
}

}
