package com.exception;

public class Demo1 {
	public static void main(String[] args) {
		System.out.println("start");
//		int[] a= {10,20,50,30};
//		try {
//			System.out.println(a[4]);
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("invalid Index Position");
//		}
		String n=null;
		try {
			System.out.println(n.length());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("stop");
	}
}
