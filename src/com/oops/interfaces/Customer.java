package com.oops.interfaces;

public class Customer {
	public static void main(String[] args) {
		Hotel h=new Hotel();
		Food f=h.orderFood(1);
		if(f instanceof Biriyani) {
			System.out.println("ordering Biriyani");
		} else if(f instanceof CurdRice) {
			System.out.println("ordering CurdRice");
		} else if(f instanceof IceCreame) {
			System.out.println("ordering IceCreame");
		}
	}
}
