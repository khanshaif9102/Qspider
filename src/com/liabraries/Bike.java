package com.liabraries;

import java.lang.reflect.Array;

public class Bike {
	public String toString() {
		return "This is Bike";
	}
	public static void main(String[] args) {
		Bike b=new Bike();
		int[] a= {10,20,30,40,50};
		System.out.println(b);
		System.out.println(b.toString());
		System.out.println();
	}
}
