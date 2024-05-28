package com.oops.interfaces;

import java.util.Scanner;

public class Person {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Beer \n2.Vodka \n3.Sprite");
		System.out.println("enter your choice:");
		int ch=sc.nextInt();
		Bevarages b;
		b=Pub.orderDrink(ch);
		if(b instanceof Beer) {
			System.out.println("ordering beer");
		}else if(b instanceof Vodka) {
			System.out.println("ordering vodka");
		}
		else if(b instanceof Sprite) {
			System.out.println("ordering sprite");
		}else {
			System.out.println("wrong input");
		}
	}
}
