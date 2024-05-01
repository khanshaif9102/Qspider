package core.Array;

import java.util.Scanner;

public class moveZeroToEnd {
	public  static void swap(int a,int b){
		int temp=a;
		a=b;
		b=temp;
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
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				//swap(arr[i],arr[count]);
				int temp=arr[i];
				arr[i]=arr[count];
				arr[count]=temp;
				count++;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
}
