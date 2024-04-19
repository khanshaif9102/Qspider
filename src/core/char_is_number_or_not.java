package core;

import java.util.Scanner;

public class char_is_number_or_not {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter a char to check Integer or not :");
		char c=sc.next().charAt(0);
		if(c>='0'&&c<='9') {
			System.out.println(c+" is an Integer");
		} else {
			System.out.println(c+" is not an Integer");
		}
	}
}
