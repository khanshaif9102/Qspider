package OOPS_and_Features;

import java.util.Scanner;

public class Student {
	String name;
	int age;
	public static void main(String[] args) {
		Student st1=new Student();
		Student st2=new Student();
		System.out.println("enter the 1 student det");
		System.out.println("========================");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student 1 name:");
		st1.name=sc.next();
		System.out.println("enter the 1 student age:");
		st1.age=sc.nextInt();
		System.out.println("===================");
		System.out.println("enter 2nd student det");
		System.out.println("enter 2nd student name:");
		st2.name=sc.next();
		System.out.println("enter 2nd student age:");
		st2.age=sc.nextInt();
		System.out.println("===================");
		System.out.println("1st student det:");
		System.out.println("Name :"+st1.name+" and age :"+st1.age);
		System.out.println("2nd student det:");
		System.out.println("Name: "+st2.name+" and age:"+st2.age);
	}
}
