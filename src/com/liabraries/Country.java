package com.liabraries;

public class Country {
	String name;
	long population;

	Country(String name, long population) {
		this.name = name;
		this.population = population;
	}

	public String toString() {
		return "Country [name=" + name + " populations=" + population + "]";
	}

	public static void main(String[] args) {
		Country c1 = new Country("India", 13000000000l);
		Country c2 = new Country("USA", 1000000l);
		Country[] c = { c1, c2 };
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
}
