package core.Array;

import java.util.Scanner;

public class leftRotateByN {
	public static void leftRotate(int arr[],int n) {
		int temp=arr[0];
		for(int i=1;i<n;i++) {
			arr[i-1]=arr[i];
		}
		arr[n-1]=temp;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array index bound :");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the elements :");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the left rotate limit:");
		int d=sc.nextInt();
		for(int j=0;j<d;j++) {
			leftRotate(arr,n);
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
}
