package OOPS_and_Features;

public class MainMethodOverLoading {
	public static void main() {
		System.out.println("dup main method");
		Thread t=Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t.getId());
	}
	public static void main(String[] args) {
		System.out.println("program start");
		Thread t=Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t.getId());
		main();
		main(10);
		System.out.println("program end");
	}
	public static void main(int n) {
		System.out.println("the value of n "+n);
		Thread t=Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t.getId());
	}
}
