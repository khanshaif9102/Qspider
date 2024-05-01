package core;

import java.util.Scanner;

public class ArithematicOpUsingSwitch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first value");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		System.out.println("enter your choice:+Addition, -Substraction"
				+ "/Division, *multiplication %Modulo");
		char c=sc.next().charAt(0);
		switch(c) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		case '%':
			System.out.println(a%b);
			default:
				System.out.println("invalid input");
		}
	}
}
