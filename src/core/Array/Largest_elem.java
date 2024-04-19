package core.Array;


public class Largest_elem {
	public static void main(String[] args) {
		int[] a= {5,10,8,4,3};
		int l=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>l) {
				l=a[i];
			}
		}
		System.out.println("largest element is :"+l);
	}
}
