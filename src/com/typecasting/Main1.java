package com.typecasting;

public class Main1 extends Car{
	public static void main(String[] args) {
		//UpCasting
		Vehicle v=new Car();
		System.out.println(v.brand);
		System.out.println(v.Cost);
		v.start();
		System.out.println("====================");
		//DownCasting
		Car c=(Car)v;
		System.out.println(c.brand);
		System.out.println(c.Cost);
		System.out.println(c.fuel);
		c.start();
		c.stop();
	}
}
