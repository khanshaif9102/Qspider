package core;

import java.util.Scanner;

public class switch_statement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("today is sunday");
			break;
		case 2:
			System.out.println("today is monday");
			break;
		case 3:
			System.out.println("today is tuesday");
			break;
		case 4:
			System.out.println("today is wednesday");
			break;
		case 5:
			System.out.println("today is thrusday");
			break;
		case 6:
			System.out.println("today is friday");
			break;
		case 7:
			System.out.println("today is saturday");
			break;
		default:
			System.out.println("invalid output");
		}
	}
}
