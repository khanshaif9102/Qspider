package com.ty;

public class Person {
	private int age=20;
	private String name="shaif";
	private void display() {
		System.out.println("display method");
	}
	public static void main(String[] args) {
		Person p=new Person();
		System.out.println(p.name);
		p.display();
	}
}
