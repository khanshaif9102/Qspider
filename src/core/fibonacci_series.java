package core;

public class fibonacci_series {
	public static void main(String[] args) {
		int a=0,b=1;
		int n=10;
		System.out.print(a+" , "+b+" , ");
		for(int i=2;i<n;i++) {
			int temp=a+b;
			a=b;
			b=temp;
			System.out.print(temp+" , ");
		}
	}
}
