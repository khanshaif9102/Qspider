package com.liabraries;

public class Main {
	public static void main(String[] args) {
		Employee e1 = new Employee("shaif", 101);
		Employee e2 = new Employee("sahil", 102);
		Employee e3 = new Employee("aasif", 103);
		Employee[] e = { e1, e2, e3 };
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
		}
	}
}
