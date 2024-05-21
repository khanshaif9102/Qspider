package com.typecasting;

public class Main {
	public static void main(String[] args) {
		//UpCasting 
		Father f=new Son();
		System.out.println(f.name);
		
		Father f1=new Son1();
		
		
		//DownCasting
		Son s=(Son) f;
		System.out.println(s.name);
		System.out.println(s.age);
		
		//Another son1 we cannot do, error will come 
		//Son1 s1=(Son)f1;
		
	}
}
