package core;

import java.util.Scanner;

public class char_is_alphabate_or_not {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the char to check alphabate or not: ");
		char c=sc.next().charAt(0);
		if((c>='a'&&c<='z')||(c>='A'&&c<='Z')) {
			System.out.println(c+" is an Alphabate");
		} else {
			System.out.println(c+" is not an Alphabate");
		}
	}
}
