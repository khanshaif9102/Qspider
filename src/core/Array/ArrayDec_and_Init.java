package core.Array;

public class ArrayDec_and_Init {
	public static void main(String[] args) {
		// Array Declaration
		int[] a;
		// Array Creation
		a = new int[3];
		// Printing the elements
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println("=================");
		// Array Initialization
		a[0] = 10;
		a[1] = 25;
		a[2] = 30;
		// printing the elements
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println("==================");
		// Array Declaration and creation
		double[] b = new double[3];
		b[0] = 10;
		b[1] = 100;
		b[2] = 1000;
		// printing the elements
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println("Length :"+a.length);
	}
}
