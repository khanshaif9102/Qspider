package OOPS_and_Features.Inheritance;

public class ArithmaticOperations {
//	int a,b;
//	ArithmaticOperations(int a,int b){
//		this.a=a;
//		this.b=b;
//	}
	public int add(int a, int b) {
		int res = a + b;
		return res;
	}

	public int sub(int a, int b) {
		int res = a - b;
		return res;
	}

	public double div(int a, int b) {
		double res = 0;
		if (b != 0) {
			res = a / b;
		} else {
			System.out.println("b cannot be zero");
		}
		return res;
	}

	public int mul(int a, int b) {
		int res = a * b;
		return res;
	}
}
