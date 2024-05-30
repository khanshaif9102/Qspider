package com.liabraries;

public class Car {
	String brand;
	double cost;

	Car(String brand, double cost) {
		this.brand = brand;
		this.cost = cost;
	}

	public String toString() {
		return "Car [brand=" + brand + " cost=" + cost + "]";
	}

	public static void main(String[] args) {
		Car c = new Car("BMW", 5500000);
		Car c1 = new Car("AUDI", 5000000);
		System.out.println(c);
		System.out.println(c1);
	}
}
