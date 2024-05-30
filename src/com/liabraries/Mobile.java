package com.liabraries;

public class Mobile {
	String brand;
	double cost;
	Mobile(String brand,double cost){
		this.brand=brand;
		this.cost=cost;
	}
	public String toString() {
		return "Mobile [ brand="+brand+" cost="+cost+"]";
	}
}
