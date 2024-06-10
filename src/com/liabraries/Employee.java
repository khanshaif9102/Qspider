package com.liabraries;

public class Employee {
	String name;
	int id;
	Employee(String name,int id){
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return "Employee [name="+name+" id="+id+"]";
	}
}
