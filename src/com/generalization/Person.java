package com.generalization;

public class Person {
	static void display(Vehicle v) {
		if(v instanceof Car) {
			Car c=(Car) v;
			System.out.println(c.brand+" "+c.fuel);
		}
		else if(v instanceof Bike) {
			Bike b=(Bike) v;
			System.out.println(b.brand+" "+b.fule);
		}
	}
	public static void main(String[] args) {
		display(new Car());
	}
}
