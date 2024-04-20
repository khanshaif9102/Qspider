package core.Array;

import java.util.Scanner;

public class removeDups {
	int removeDuplicates(int arr[],int n) {
		int res=1;
		for(int i=1;i<n;i++) {
			if(arr[i]!=arr[res-1]) {
				arr[res]=arr[i];
				res++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		return res;
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
		removeDups obj=new removeDups();
		System.out.println(obj.removeDuplicates(arr, n));
	}
}
