package core.Array;

import java.util.Scanner;

public class reverseAnArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array index bound :");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the elements :");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int low=0,high=n-1;
		while(low<high) {
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			high--;
			low++;
		}
		System.out.println("Sorted Array is");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
}
