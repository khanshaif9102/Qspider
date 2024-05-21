package com.encapsulation;

public class MainApp extends Person{
	public static void main(String[] args) {
		MainApp o=new MainApp();
		o.setId(10);
		o.setName("shaif");
		o.setPhno(9102754032l);
		o.setAge(24);
		//this will give an error message, because we are managing 
		//the value of the Person what is should be
		//o.setId(0);
		
		//getting the values using getter methods
		System.out.println("Information about Person");
		System.out.println("========================");
		System.out.println("ID: "+o.getId());
		System.out.println("Name: "+o.getName());
		System.out.println("Phone No.: "+o.getPhno());
		System.out.println("Age is :"+o.getAge());
		System.out.println("========================");
		
	}
}
