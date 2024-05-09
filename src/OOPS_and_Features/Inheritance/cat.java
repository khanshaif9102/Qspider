package OOPS_and_Features.Inheritance;

public class cat extends Animal{
	void meow() {
		System.out.println("meow...");
	}
	public static void main(String[] args) {
		cat o=new cat();
		o.eat();
		o.meow();
	}
}
