package com.exception;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		System.out.println("start");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a:");
		int a=sc.nextInt();
		System.out.println("enter the value of b:");
		int b=sc.nextInt();
		sc.close();
		try {
		System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println("Do not divide by zero");
		}
		System.out.println("end");
	}
}
