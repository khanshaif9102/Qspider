package com.ty;

public class Demo {
	public int age=22;
	public String name="navin";
	
	public void display() {
		System.out.println("display");
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		System.out.println(d.name);
		d.display();
	}
}
