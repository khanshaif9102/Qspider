package com.generalization;

import java.util.Scanner;

public class Humans {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Coffe\n2.Tea");
		System.out.println("enter type of Bevarages:");
		int ch = sc.nextInt();

		VendingMachine v = new VendingMachine();
		Bevarages b = v.pressButton(ch);
		Bevarages b1 = v.pressButton(2);
		b.give();
		b1.give();
	}
}
