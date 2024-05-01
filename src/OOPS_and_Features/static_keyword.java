package OOPS_and_Features;

public class static_keyword {
	static int x = 10;
	static final double d = 10.2;
	static int n;

	public static void main(String[] args) {
		System.out.println(x);
		System.out.println(n);
		n = x;
		x = 20;
		System.out.println(n);
		System.out.println(x);

		static_keyword obj = new static_keyword();
		System.out.println(obj.d);
		static_keyword obj1 = new static_keyword();
	
		System.out.println(obj1.d);
		System.out.println(obj.d);
	}
}
