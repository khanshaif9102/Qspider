package core;

public class MethodWithArgumentsWithoutReturnType {
	static void add(int a,int b) {
		System.out.println("sum of 2 numbers :"+(a+b));
	}
	public static void main(String[] args) {
		System.out.println("program started");
		add(10,20);
		add(20,20);
		System.out.println("programs ends");
	}
}
