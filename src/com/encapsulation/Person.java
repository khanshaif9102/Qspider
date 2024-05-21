package com.encapsulation;

import java.lang.classfile.instruction.ThrowInstruction;

public class Person {
	private int id;
	private String name;
	private long phno;
	private int age;
	
	//Setter Methods for set the value 
	public void setId(int id) {
		if(id!=0) {
		this.id=id;
		} else {
			System.out.println("id cannot be null");
		}
	}
	public void setName(String name) {
		if(name!=null) {
		this.name=name;
		} else {
			System.out.println("name cannot be null");
		}
	}
	public void setPhno(long phno) {
		if(phno!=0) {
		this.phno=phno;
		} else {
			System.out.println("phno cannot be null");
		}
	}
	public void setAge(int age) {
		if(age>0) {
			this.age=age;
		}else {
			System.out.println("age is invalid : cannot be zero");
		}
	}
	
	//Getter methods to get the value
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public long getPhno() {
		return phno;
	}
	public int getAge() {
		return age;
	}
}
