package com.liabraries;

public class Student {
	int age;
	String name;
	Student(int age, String name){
		this.age=age;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		Student s=new Student(101,"shaif");
		System.out.println(s);
	}
}
