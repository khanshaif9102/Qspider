package core;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please eneter your marks percentage: ");
		int m=sc.nextInt();
		if(m>80&&m<100) {
			System.out.println("Excellent");
		} else if(m==80) {
			System.out.println("Very Good");
		} else if(m>=35&&m<80) {
			System.out.println("Good");
		} else if(m<35&&m>0) {
			System.out.println("Fail");
		}else if(m<=0&&m>100) {
			System.out.println("Wrong Input");
		}
	}
}
