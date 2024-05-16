package core.Array;

import java.util.Scanner;

public class isSortedOrNot {
	boolean isSorted(int arr[], int n) {
		System.out.println("checking sorted or not");
		for (int i = 1; i < n; i++)
			if ( arr[i - 1]>arr[i] )
				return false;
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array index bound :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter the elements :");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		isSortedOrNot obj = new isSortedOrNot();
//		if(obj.isSorted(arr, n)) {
//			System.out.println("Array is sorted");
//		}else {
//			System.out.println("Array is not sorted");
//		}
		System.out.println(obj.isSorted(arr, n));
	}
}
