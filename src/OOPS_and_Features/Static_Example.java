package OOPS_and_Features;

public class Static_Example {
	static int age = 10;

	static void study() {
		System.out.println("Studying");
	}

	public static void main(String[] args) {
		System.out.println(Static_Example.age);
		Static_Example.study();
		System.out.println("--------------------");
		System.out.println(age);
		study();
	}
}
