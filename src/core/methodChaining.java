package core;

public class methodChaining {
	static void m1() {
		System.out.println("Hi");
		m2();
	}
	static void m2() {
		System.out.println("Bye");
	}
	public static void main(String[] args) {
		m1();
	}
}
