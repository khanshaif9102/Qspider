package core.Array;

public class Traverse {
	public static void main(String[] args) {
		int[] a= {10,20,30,40};
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
		int sum=0;
		for(int i=0;i<a.length;i++) {
			
			sum+=a[i];
		}
		System.out.println("sum is"+sum);
		int av=sum/a.length;
		System.out.println("average "+av);
	}
}
