package com.generalization;

public class Book {
	public Pen choosePen(int choice) {
		if(choice==1) {
			return new SketchPen();
		}
		else {
			return new InkPen();
		}
	}
	public static void main(String[] args) {
		Book b=new Book(); //Specialization
		Pen p=b.choosePen(1); //UpCasting and Generalization
		System.out.println(p);
		p.write();
	}
}
