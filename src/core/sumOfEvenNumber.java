package core;

import java.util.Scanner;

public class sumOfEvenNumber {
	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println("sum of these even numbers is:"+sum);
	}
}
