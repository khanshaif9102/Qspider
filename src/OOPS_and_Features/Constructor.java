package OOPS_and_Features;

public class Constructor {
	int n=5;
	public Constructor(int a) {
		System.out.println("a = "+a);
	}
	public void m1() {
		int n=10;
		System.out.println("age is :"+this.n);
	}
	void m1(int n) {
		System.out.println(n);
	}
	public static void main(String[] args) {
	Constructor obj=new Constructor(10);
	}
}
