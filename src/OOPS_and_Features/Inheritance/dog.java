package OOPS_and_Features.Inheritance;

public class dog extends Animal{
	void bark() {
		System.out.println("barking");
	}
	public static void main(String[] args) {
		dog o=new dog();
		o.eat();
		o.bark();
	}
}
