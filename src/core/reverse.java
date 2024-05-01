package core;

public class reverse {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		int low=0,high=arr.length-1;
		int t=0;
		while(high>low) {
			t=arr[high];
			arr[high]=arr[low];
			arr[low]=t;
			high--;
			low++;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
