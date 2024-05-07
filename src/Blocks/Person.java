package Blocks;

public class Person {
	static int age;
	static String name;
	
	static {
		age=21;
		name="sahil";
	}
	public static void main(String[] args) {
		System.out.println("Hi");
		System.out.println("age is :"+age);
		System.out.println("Name is :"+name);
		System.out.println("Bye");
	}
	static {
		age=22;
		name="ibrar";
	}
	static {
		age=24;
		name="shaif";
	}
}
