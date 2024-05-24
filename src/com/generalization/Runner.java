package com.generalization;

public class Runner {
	static void display(Father f) {
		if(f instanceof Son) {
			Son s=(Son) f;
			System.out.println(s.x+" "+s.y);
		} else if(f instanceof Daughter) {
			Daughter d=(Daughter) f;
			System.out.println(d.x+" "+d.z);
		}
	}
	public static void main(String[] args) {
		display(new Son());
		display(new Daughter());
	}
}
