package com.ty;

public class Sample {
protected int age=22;
protected String name="shaif";
protected void display() {
	System.out.println("display methods");
}
//	public static void main(String[] args) {
//		//Person p=new Person();
//		// we cannot access the private members
//		//p.display();
//		//p.name;
//		
//	}
public static void main(String[] args) {
	Sample s=new Sample();
	System.out.println(s.name);
	s.display();
}
}
